import { FC } from 'react'
import { Group } from '../Group'
import { useWfSpecTableData } from './hooks/useWfSpecTableData'
import { SearchResultProps } from '.'
import { useRouter } from 'next/navigation'

export const WfSpecTable: FC<SearchResultProps> = ({ pages = [] }) => {
  const router = useRouter()

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
        <Group title="WfSpecs" source={wfSpecSource} selectedState={selectedWfSpec} setSelectedState={setSelectedWfSpec} />
        <Group
          title="Major Versions"
          source={majorVersionSource}
          selectedState={selectedMajorVersion}
          setSelectedState={setSelectedMajorVersion}
        />
        <Group
          title="Revisions"
          source={revisionSource}
          selectedState={selectedRevision}
          setSelectedState={setSelectedRevision}
          onClick={(item) => {
            router.push(`/wfSpec/${selectedWfSpec?.id}/${selectedMajorVersion?.id}.${item.id}`)
          }}
        />
      </div>
    </div>
  )
}
