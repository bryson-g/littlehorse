import { ScrollArea } from '@/components/ui/scroll-area'
import { Separator } from '@/components/ui/separator'
import { cn } from '@/components/utils'
import { Dispatch, FC, Fragment, SetStateAction } from 'react'

export const Group: FC<GroupProps> = ({ title, source, setSelectedState, selectedState, onClick }) => {
    return (
        <div className="flex h-72 min-w-44 w-fit flex-col">
            <h3 className="text-xl font-bold">{title}</h3>

            <ScrollArea className="flex h-full w-full flex-col gap-3 rounded-md border p-3 overflow-hidden">
                {source?.map(item => {
                    return (
                        <Fragment key={item.id}>
                            <button
                                className={cn('flex h-7 w-full items-center rounded-md border p-2', {
                                    'border border-black/50 bg-blue-200 sticky top-0 bottom-0 text-wrap': selectedState?.id === item.id,
                                })}
                                onClick={() => {
                                    setSelectedState(item)
                                    onClick?.(item)
                                }}
                            >
                                <p className="truncate">{item.text}</p>
                            </button>
                            <Separator className="my-2" />
                        </Fragment>
                    )
                })}
            </ScrollArea>
        </div>
    )
}

export type GroupProps = {
    title: string

    source: GroupItem[]

    selectedState: GroupItem | undefined

    setSelectedState: Dispatch<SetStateAction<GroupProps['selectedState']>>

    onClick?: (item: GroupItem) => void
}

export type GroupItem = {
    text: string
    id: string | number
    value: unknown
}