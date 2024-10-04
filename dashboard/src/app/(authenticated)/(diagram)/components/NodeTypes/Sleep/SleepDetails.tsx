import { NodeRun, SleepNode } from 'littlehorse-client/proto'
import { FC } from 'react'
import { NodeDetails } from '../NodeDetails'
import { formatDate } from '../../../../../utils'
import { getVariable, formatTime } from '@/app/utils'

export const SleepDetails: FC<{ sleepNode?: SleepNode; nodeRun?: NodeRun }> = ({ sleepNode, nodeRun }) => {
  if (!sleepNode) return
  const timeValue = getVariable(sleepNode?.rawSeconds)
  return (
    <NodeDetails>
      <div className="mb-2">
        <div className="flex items-center gap-1 whitespace-nowrap text-nowrap">
          <h3 className="font-bold">Sleep</h3>
        </div>
        <div className="flex flex-col gap-2 text-nowrap">
          <div className="flex ">
            {sleepNode.rawSeconds && <div>Time: {typeof timeValue === 'number' ? formatTime(timeValue) : timeValue}</div>}
            {sleepNode.timestamp && <div>{getVariable(sleepNode.timestamp)}</div>}
            {sleepNode.isoDate && <div>{getVariable(sleepNode.isoDate)}</div>}
          </div>
          {!!nodeRun?.sleep?.maturationTime && (
            <div className="flex ">Maturation Time: {formatDate(new Date(nodeRun.sleep.maturationTime))}</div>
          )}
        </div>
      </div>
    </NodeDetails>
  )
}