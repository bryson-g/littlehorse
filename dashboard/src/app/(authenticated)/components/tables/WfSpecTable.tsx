import { WfSpecId } from 'littlehorse-client/proto'
import { FC, Fragment } from 'react'

import { Group } from '../Group'
import { useWfSpecTableData } from './hooks/useWfSpecTableData'
import { SearchResultProps } from '.'

export const WfSpecTable: FC<SearchResultProps> = ({ pages = [] }) => {
  const {
    selectedWfSpec,
    setSelectedWfSpec,
    selectedMajorVersion,
    setSelectedMajorVersion,
    selectedRevision,
    setSelectedRevision,
    wfSpecSource,
    majorVersionSource,
    revisionSource,
  } = useWfSpecTableData(pages)

  if (pages.length === 0) {
    return <div className="flex min-h-[360px] items-center justify-center text-center italic">No WfSpecs</div>
  }

  return (
    <div className="py-4">
      <div className="flex gap-10">
        <Group title="WfSpecs" source={wfSpecSource} state={selectedWfSpec} setState={setSelectedWfSpec} />
        <Group
          title="Major Versions"
          source={majorVersionSource}
          state={selectedMajorVersion}
          setState={setSelectedMajorVersion}
        />
        <Group title="Revisions" source={revisionSource} state={selectedRevision} setState={setSelectedRevision} />
      </div>
    </div>
  )
}
