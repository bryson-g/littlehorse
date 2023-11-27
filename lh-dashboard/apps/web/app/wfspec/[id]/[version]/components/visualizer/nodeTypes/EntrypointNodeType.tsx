import { Handle, Position } from 'reactflow'
import LabelsUtils from '../LabelsUtils'

export default function EntryPointNodeType({ data }) {

    return (
        <div className="viznode-canvas">
            <div className="ring">
                <div className={`node tENTRYPOINT ${(!data.isWfSpecVisualization && !data.nodeHasRun) ? 'opacity50' : ''}`} id={`id${data.label}`} >
                    <img alt='entrypoint' src="/ENTRYPOINT.svg" />
                    <div>
                        {LabelsUtils.extractLabel(data.label)}
                    </div>
                </div>
            </div>
            <Handle position={Position.Bottom} type="source" />
        </div>
    )
}