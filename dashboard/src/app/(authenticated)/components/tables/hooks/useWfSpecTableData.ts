import { WfSpecId } from 'littlehorse-client/proto'
import { useMemo, useState, useEffect } from 'react'
import { SearchResultProps } from '..'

interface WfSpecSource {
  text: string
  id: string | number
}

interface VersionData {
  majorVersion: number
  revisions: number[]
}

interface WfSpecData {
  name: string
  versions: VersionData[]
}

export interface WfSpecTableData {
  selectedWfSpec: string | undefined
  setSelectedWfSpec: (value: string | undefined) => void
  selectedMajorVersion: number | undefined
  setSelectedMajorVersion: (value: number | undefined) => void
  selectedRevision: number | undefined
  setSelectedRevision: (value: number | undefined) => void
  wfSpecSource: WfSpecSource[]
  majorVersionSource: WfSpecSource[]
  revisionSource: WfSpecSource[]
}

export function useWfSpecTableData(pages: SearchResultProps['pages'] = []): WfSpecTableData {
  const [selectedWfSpec, setSelectedWfSpec] = useState<string | undefined>(undefined)
  const [selectedMajorVersion, setSelectedMajorVersion] = useState<number | undefined>(undefined)
  const [selectedRevision, setSelectedRevision] = useState<number | undefined>(undefined)

  const results = useMemo(() => pages.flatMap(page => page.results), [pages])

  const wfSpecsData = useMemo(() => {
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

  const wfSpecSource = useMemo(() => wfSpecsData.map(({ name }) => ({ text: name, id: name })).reverse(), [wfSpecsData])

  const majorVersionSource = useMemo(() => {
    const spec = wfSpecsData.find(s => s.name === selectedWfSpec)
    return (
      spec?.versions
        .map(v => ({
          text: `v${v.majorVersion}`,
          id: v.majorVersion,
        }))
        .reverse() ?? []
    )
  }, [wfSpecsData, selectedWfSpec])

  const revisionSource = useMemo(() => {
    const spec = wfSpecsData.find(s => s.name === selectedWfSpec)
    const version = spec?.versions.find(v => v.majorVersion === selectedMajorVersion)
    return (
      version?.revisions
        .map(revision => ({
          text: `v${selectedMajorVersion}.${revision}`,
          id: revision,
        }))
        .reverse() ?? []
    )
  }, [wfSpecsData, selectedWfSpec, selectedMajorVersion])

  useEffect(() => {
    if (majorVersionSource.length > 0) setSelectedMajorVersion(majorVersionSource[0].id)
  }, [selectedWfSpec, majorVersionSource])

  useEffect(() => {
    if (revisionSource.length > 0) setSelectedRevision(revisionSource[0].id)
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
