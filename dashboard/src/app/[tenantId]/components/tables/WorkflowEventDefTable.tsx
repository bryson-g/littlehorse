import { WorkflowEventDefId } from 'littlehorse-client/proto'
import { FC, Fragment } from 'react'
import { SearchResultProps } from '.'
import { useParams } from 'next/navigation'
import LinkWithTenant from '../LinkWithTenant'

export const WorkflowEventDefTable: FC<SearchResultProps> = ({ pages = [] }) => {
  const { tenantId } = useParams()

  if (pages.length === 0) {
    return <div className="flex min-h-[360px] items-center justify-center text-center italic">No WorkflowEventDefs</div>
  }

  return (
    <div className="py-4">
      {pages.map((page, i) => (
        <Fragment key={i}>
          {page.results.map(({ name }: WorkflowEventDefId) => (
            <div key={name} className="my-2 flex gap-2">
              <LinkWithTenant className="underline hover:no-underline" href={`/workflowEventDef/${name}`}>
                {name}
              </LinkWithTenant>
            </div>
          ))}
        </Fragment>
      ))}
    </div>
  )
}