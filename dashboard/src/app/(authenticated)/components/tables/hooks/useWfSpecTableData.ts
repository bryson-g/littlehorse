import { WfSpecId } from 'littlehorse-client/proto'
import { useMemo, useState, useEffect } from 'react'
import { SearchResultProps } from '..'

import { GroupItem, GroupProps } from '../../Group'

type VersionData = {
  majorVersion: number
  revisions: number[]
}

type WfSpecData = {
  name: string
  versions: VersionData[]
}

export type WfSpecTableData = {
  selectedWfSpec: GroupItem | undefined
  setSelectedWfSpec: GroupProps['setSelectedState']
  selectedMajorVersion: GroupItem | undefined
  setSelectedMajorVersion: GroupProps['setSelectedState']
  selectedRevision: GroupItem | undefined
  setSelectedRevision: GroupProps['setSelectedState']
  wfSpecSource: GroupItem[]
  majorVersionSource: GroupItem[]
  revisionSource: GroupItem[]
}

export function useWfSpecTableData(pages: SearchResultProps['pages'] = []): WfSpecTableData {
  const [selectedWfSpec, setSelectedWfSpec] = useState<GroupItem | undefined>(undefined)
  const [selectedMajorVersion, setSelectedMajorVersion] = useState<GroupItem | undefined>(undefined)
  const [selectedRevision, setSelectedRevision] = useState<GroupItem | undefined>(undefined)

  const results = useMemo(() => pages.flatMap(page => page.results), [pages])

  let wfSpecsData = useMemo(() => {
    const specMap = new Map<string, WfSpecData>()

    results.forEach(({ name, majorVersion, revision }: WfSpecId) => {
      if (!specMap.has(name)) {
        specMap.set(name, { name, versions: [] })
      }

      const spec = specMap.get(name)!
      let versionData = spec.versions.find(v => v.majorVersion === majorVersion)

      if (!versionData) {
        versionData = { majorVersion, revisions: [] }
        spec.versions.push(versionData)
      }

      if (!versionData.revisions.includes(revision)) {
        versionData.revisions.push(revision)
      }
    })

    return Array.from(specMap.values())
  }, [results])

  // ! Uncomment below to test with dummy data for multiple versions
  // wfSpecsData = dummyWfSpecData

  const wfSpecSource = useMemo(() => {
    const source = wfSpecsData.map(({ name }) => ({ text: name, id: name, value: name }) as GroupItem).reverse()
    if (!selectedWfSpec && source.length > 0) setSelectedWfSpec(source[0])
    return source
  }, [wfSpecsData, selectedWfSpec])

  const majorVersionSource = useMemo(() => {
    const spec = wfSpecsData.find(s => s.name === selectedWfSpec?.id)
    return (
      spec?.versions
        .map(
          v =>
            ({
              text: `v${v.majorVersion}`,
              id: v.majorVersion,
              value: v.majorVersion,
            }) as GroupItem
        )
        .reverse() ?? []
    )
  }, [wfSpecsData, selectedWfSpec])

  const revisionSource = useMemo(() => {
    const spec = wfSpecsData.find(s => s.name === selectedWfSpec?.id)
    const version = spec?.versions.find(v => v.majorVersion === selectedMajorVersion?.id)
    return (
      version?.revisions
        .map(
          revision =>
            ({
              text: `v${selectedMajorVersion?.id}.${revision}`,
              id: revision,
              value: `/wfSpec/${selectedWfSpec?.id}/${selectedMajorVersion?.id}.${revision}`,
            }) as GroupItem
        )
        .reverse() ?? []
    )
  }, [wfSpecsData, selectedWfSpec, selectedMajorVersion])

  useEffect(() => {
    if (majorVersionSource.length > 0) setSelectedMajorVersion(majorVersionSource[0])
  }, [selectedWfSpec, majorVersionSource])

  useEffect(() => {
    if (revisionSource.length > 0) setSelectedRevision(revisionSource[0])
  }, [selectedWfSpec, selectedMajorVersion, revisionSource])

  return {
    selectedWfSpec,
    setSelectedWfSpec,
    selectedMajorVersion,
    setSelectedMajorVersion,
    selectedRevision,
    setSelectedRevision,
    wfSpecSource,
    majorVersionSource,
    revisionSource,
  }
}

const dummyWfSpecData: WfSpecData[] = Array.from({ length: 12 }, (_, i) => ({
  name: `sample-wfspec-name${i}`,
  versions: Array.from({ length: 11 }, (_, j) => ({
    majorVersion: j,
    revisions: Array.from({ length: 11 }, (_, k) => k),
  })),
}))
