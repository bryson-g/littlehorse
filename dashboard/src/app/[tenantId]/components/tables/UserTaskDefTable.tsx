import { getLatestWfSpecs } from '@/app/actions/getLatestWfSpec'
import { Separator } from '@/components/ui/separator'
import { useWhoAmI } from '@/contexts/WhoAmIContext'
import { WfSpecData } from '@/types'
import { UserTaskDefId } from 'littlehorse-client/proto'
import { TagIcon } from 'lucide-react'
import { useRouter } from 'next/navigation'
import { FC, Fragment, useEffect, useState } from 'react'
import { SearchResultProps } from '.'
import LinkWithTenant from '../LinkWithTenant'

export const UserTaskDefTable: FC<SearchResultProps> = ({ pages = [] }) => {
  const router = useRouter()
  const [wfSpecs, setWfSpecs] = useState<WfSpecData[]>([])
  const { tenantId } = useWhoAmI()

  useEffect(() => {
    if (!tenantId) return
    const wfSpecNames = pages.flatMap(page => page.results).map(wfSpec => wfSpec.name)
    getLatestWfSpecs(tenantId, wfSpecNames).then(setWfSpecs)
  }, [pages, tenantId])

  if (pages.length === 0) {
    return <div className="flex min-h-[360px] items-center justify-center text-center italic">No UserTaskDefs</div>
  }

  return (
    <div className="py-4">
      {pages.map((page, i) => (
        <Fragment key={i}>
          {page.results.map(({ name, version }: UserTaskDefId) => (
            <Fragment key={`${name}.${version}`}>
              <div className="my-2 flex gap-2">
                <LinkWithTenant className="underline hover:no-underline" href={`/userTaskDef/${name}/${version}`}>
                  {name}
                </LinkWithTenant>
                <div className="flex items-center gap-2 rounded bg-blue-200 px-2 font-mono text-sm text-gray-500">
                  <TagIcon className="h-4 w-4 fill-none stroke-gray-500 stroke-1" />v{version}
                </div>
              </div>
              <Separator />
            </Fragment>
          ))}
        </Fragment>
      ))}
    </div>
  )
}
