"use strict";(self.webpackChunklh_site=self.webpackChunklh_site||[]).push([[8087],{2889:(e,n,t)=>{t.r(n),t.d(n,{assets:()=>c,contentTitle:()=>s,default:()=>h,frontMatter:()=>a,metadata:()=>d,toc:()=>u});var o=t(4848),r=t(8453),l=t(1470),i=t(9365);const a={},s="Await Workflow Events",d={id:"developer-guide/grpc/advanced/await-workflow-events",title:"Await Workflow Events",description:"You can await a WorkflowEvent using the AwaitWorkflowEvent RPC call.",source:"@site/docs/05-developer-guide/09-grpc/40-advanced/00-await-workflow-events.md",sourceDirName:"05-developer-guide/09-grpc/40-advanced",slug:"/developer-guide/grpc/advanced/await-workflow-events",permalink:"/docs/developer-guide/grpc/advanced/await-workflow-events",draft:!1,unlisted:!1,tags:[],version:"current",sidebarPosition:0,frontMatter:{},sidebar:"tutorialSidebar",previous:{title:"Advanced",permalink:"/docs/developer-guide/grpc/advanced/"},next:{title:"Operations",permalink:"/docs/operations/"}},c={},u=[{value:"<code>AwaitWorkflowEventRequest</code>",id:"awaitworkfloweventrequest",level:2},{value:"Required Parameters",id:"required-parameters",level:3},{value:"Examples",id:"examples",level:2},{value:"Awaiting a <code>WorkflowEvent</code>",id:"awaiting-a-workflowevent",level:3},{value:"Awaiting Events from Multiple <code>WorkflowEventDef</code>s",id:"awaiting-events-from-multiple-workfloweventdefs",level:3},{value:"Using Deadlines",id:"using-deadlines",level:3},{value:"Ignoring <code>WorkflowEvent</code>s",id:"ignoring-workflowevents",level:3}];function f(e){const n={a:"a",admonition:"admonition",code:"code",h1:"h1",h2:"h2",h3:"h3",header:"header",li:"li",ol:"ol",p:"p",pre:"pre",strong:"strong",ul:"ul",...(0,r.R)(),...e.components};return(0,o.jsxs)(o.Fragment,{children:[(0,o.jsx)(n.header,{children:(0,o.jsx)(n.h1,{id:"await-workflow-events",children:"Await Workflow Events"})}),"\n",(0,o.jsxs)(n.p,{children:["You can await a ",(0,o.jsx)(n.code,{children:"WorkflowEvent"})," using the ",(0,o.jsx)(n.code,{children:"AwaitWorkflowEvent"})," RPC call."]}),"\n",(0,o.jsx)(n.h2,{id:"awaitworkfloweventrequest",children:(0,o.jsx)(n.code,{children:"AwaitWorkflowEventRequest"})}),"\n",(0,o.jsxs)(n.p,{children:["You need to create an ",(0,o.jsx)(n.code,{children:"AwaitWorkflowEventRequest"})," to do so. The protobuf definition is:"]}),"\n",(0,o.jsx)(n.pre,{children:(0,o.jsx)(n.code,{className:"language-protobuf",children:"message AwaitWorkflowEventRequest {\n  WfRunId wf_run_id = 1;\n  repeated WorkflowEventDefId event_def_ids = 2;\n  repeated WorkflowEventId workflow_events_to_ignore = 3;\n}\n"})}),"\n",(0,o.jsx)(n.h3,{id:"required-parameters",children:"Required Parameters"}),"\n",(0,o.jsx)(n.p,{children:"The three required values are:"}),"\n",(0,o.jsxs)(n.ol,{children:["\n",(0,o.jsxs)(n.li,{children:[(0,o.jsx)(n.code,{children:"wfRunId"})," is the ID of the ",(0,o.jsx)(n.code,{children:"WfRun"})," that the ",(0,o.jsx)(n.code,{children:"WorkflowEvent"})," is thrown from."]}),"\n",(0,o.jsxs)(n.li,{children:[(0,o.jsx)(n.code,{children:"eventDefIds"})," is a repeated field including the IDs of the ",(0,o.jsx)(n.code,{children:"WorkflowEventDef"}),"s you want to await thrown ",(0,o.jsx)(n.code,{children:"WorkflowEvent"}),"s for. The request will return the first matching ",(0,o.jsx)(n.code,{children:"WorkflowEvent"})," thrown. If this field is empty, the request will return the first ",(0,o.jsx)(n.code,{children:"WorkflowEvent"})," thrown by the ",(0,o.jsx)(n.code,{children:"WfRun"}),"."]}),"\n",(0,o.jsxs)(n.li,{children:[(0,o.jsx)(n.code,{children:"workflowEventsToIgnore"})," is a repeated field of IDs of ",(0,o.jsx)(n.code,{children:"WorkflowEvents"})," that you want to ignore. This gives the client the ability to ignore ",(0,o.jsx)(n.code,{children:"WorkflowEvent"}),"s that have already been awaited. See ",(0,o.jsx)(n.a,{href:"#ignoring-workflowevents",children:"Ignoring WorkflowEvents"})," for an example."]}),"\n"]}),"\n",(0,o.jsx)(n.h2,{id:"examples",children:"Examples"}),"\n","\n",(0,o.jsxs)(n.h3,{id:"awaiting-a-workflowevent",children:["Awaiting a ",(0,o.jsx)(n.code,{children:"WorkflowEvent"})]}),"\n",(0,o.jsxs)(l.A,{children:[(0,o.jsx)(i.A,{value:"java",label:"Java",default:!0,children:(0,o.jsx)(n.pre,{children:(0,o.jsx)(n.code,{className:"language-java",children:'WorkflowEvent event = client.awaitWorkflowEvent(AwaitWorkflowEventRequest.newBuilder()\n            .setWfRunId(WfRunId.newBuilder().setId("your-workflow-run-id"))\n            .addEventDefIds(WorkflowEventDefId.newBuilder().setName("my-workflow-event-def"))\n            .build());\n'})})}),(0,o.jsx)(i.A,{value:"python",label:"Python",default:!0,children:(0,o.jsx)(n.pre,{children:(0,o.jsx)(n.code,{className:"language-python",children:'async def main() -> None:\n    config = get_config()\n    client = config.stub()\n\n    await_workflow_event_request = AwaitWorkflowEventRequest(\n        wf_run_id=WfRunId(id="your-wf-run-id"),\n        event_def_ids=[WorkflowEventDefId(name="my-workflow-event-def")],\n        workflow_events_to_ignore=None)\n\n    client.AwaitWorkflowEvent(await_workflow_event_request)\n'})})}),(0,o.jsx)(i.A,{value:"go",label:"Go",default:!0,children:(0,o.jsx)(n.pre,{children:(0,o.jsx)(n.code,{className:"language-go",children:'config := littlehorse.NewConfigFromEnv()\nclient, err := config.GetGrpcClient()\n\nevent, err := (*client).AwaitWorkflowEvent(context.Background(),\n    &lhproto.AwaitWorkflowEventRequest{\n      WfRunId: &lhproto.WfRunId{\n        Id: "your-workflow-run-id",\n      },\n      EventDefIds: []*lhproto.WorkflowEventDefId {\n        &lhproto.WorkflowEventDefId{\n          Name: "my-workflow-event-def",\n        },\n      }\n    },\n)\n'})})})]}),"\n",(0,o.jsx)("hr",{}),"\n",(0,o.jsxs)(n.h3,{id:"awaiting-events-from-multiple-workfloweventdefs",children:["Awaiting Events from Multiple ",(0,o.jsx)(n.code,{children:"WorkflowEventDef"}),"s"]}),"\n",(0,o.jsxs)(n.p,{children:["In the event your workflow throws multiple types of ",(0,o.jsx)(n.code,{children:"WorkflowEvent"}),"s, you can specify multiple ",(0,o.jsx)(n.code,{children:"WorkflowEventDef"}),"s in your request. The request will return the first matching ",(0,o.jsx)(n.code,{children:"WorkflowEvent"})," thrown by your workflow."]}),"\n",(0,o.jsxs)(l.A,{children:[(0,o.jsx)(i.A,{value:"java",label:"Java",default:!0,children:(0,o.jsx)(n.pre,{children:(0,o.jsx)(n.code,{className:"language-java",children:'WorkflowEvent event = client.awaitWorkflowEvent(AwaitWorkflowEventRequest.newBuilder()\n            .setWfRunId(WfRunId.newBuilder().setId("your-workflow-run-id"))\n            // highlight-start\n            .addEventDefIds(WorkflowEventDefId.newBuilder().setName("my-workflow-event-def"))\n            .addEventDefIds(WorkflowEventDefId.newBuilder().setName("another-workflow-event-def"))\n            // highlight-end\n            .build());\n'})})}),(0,o.jsx)(i.A,{value:"python",label:"Python",default:!0,children:(0,o.jsx)(n.pre,{children:(0,o.jsx)(n.code,{className:"language-python",children:'async def main() -> None:\n    config = get_config()\n    client = config.stub()\n\n    await_workflow_event_request = AwaitWorkflowEventRequest(\n        wf_run_id=WfRunId(id="your-wf-run-id"),\n        # highlight-start\n        event_def_ids=[WorkflowEventDefId(name="my-workflow-event-def"),\n                       WorkflowEventDefId(name="another-workflow-event-def")],\n        # highlight-end\n        workflow_events_to_ignore=None)\n\n    event: WorkflowEvent = client.AwaitWorkflowEvent(await_workflow_event_request)\n'})})}),(0,o.jsx)(i.A,{value:"go",label:"Go",default:!0,children:(0,o.jsx)(n.pre,{children:(0,o.jsx)(n.code,{className:"language-go",children:'config := littlehorse.NewConfigFromEnv()\nclient, err := config.GetGrpcClient()\n\nevent, err := (*client).AwaitWorkflowEvent(context.Background(),\n    &lhproto.AwaitWorkflowEventRequest{\n      WfRunId: &lhproto.WfRunId{\n        Id: "your-workflow-run-id",\n      },\n      EventDefIds: []*lhproto.WorkflowEventDefId {\n        // highlight-start\n        &lhproto.WorkflowEventDefId{\n          Name: "my-workflow-event-def",\n        },\n        &lhproto.WorkflowEventDefId{\n          Name: "another-workflow-event-def",\n        },\n        // highlight-end\n      }\n    },\n)\n'})})})]}),"\n",(0,o.jsx)("hr",{}),"\n",(0,o.jsx)(n.h3,{id:"using-deadlines",children:"Using Deadlines"}),"\n",(0,o.jsxs)(n.p,{children:["Upon the execution of a ",(0,o.jsx)(n.code,{children:"THROW_EVENT"})," node, LittleHorse will always ensure that your ",(0,o.jsx)(n.code,{children:"WorkflowEvent"}),"s are thrown and returned to any clients awaiting them. However, you may still find it useful to set a ",(0,o.jsx)(n.a,{href:"https://grpc.io/docs/guides/deadlines/",children:"gRPC deadline"})," on your ",(0,o.jsx)(n.code,{children:"AwaitWorkflowEvent"})," request in case a ",(0,o.jsx)(n.code,{children:"WorkflowEvent"})," is not thrown within a specified period of time."]}),"\n",(0,o.jsx)(n.admonition,{type:"info",children:(0,o.jsxs)(n.p,{children:["You can configure a gRPC deadline for any LittleHorse Client request, not just ",(0,o.jsx)(n.code,{children:"AwaitWorkflowEvent"}),"! If the request does not complete within the specified time, it will be automatically canceled and return gRPC Status Code 1 ",(0,o.jsx)(n.code,{children:"CANCELLED"}),"."]})}),"\n",(0,o.jsxs)(l.A,{children:[(0,o.jsxs)(i.A,{value:"java",label:"Java",default:!0,children:[(0,o.jsxs)(n.p,{children:["To use deadlines with our Java SDK, you can call the ",(0,o.jsx)(n.code,{children:"LittleHorseBlockingStub#withDeadlineAfter()"})," method before your gRPC request method call."]}),(0,o.jsx)(n.pre,{children:(0,o.jsx)(n.code,{className:"language-java",children:'Properties props = getConfigProps();\nLHConfig config = new LHConfig(props);\nLittleHorseBlockingStub client = config.getBlockingStub();\n\n// highlight-next-line\nWorkflowEvent event = client.withDeadlineAfter(1000, TimeUnit.MILLISECONDS)\n                .awaitWorkflowEvent(AwaitWorkflowEventRequest.newBuilder()\n                        .setWfRunId(WfRunId.newBuilder().setId("your-workflow-run-id"))\n                        .build());\n'})}),(0,o.jsx)(n.p,{children:(0,o.jsx)(n.strong,{children:"Parameters"})}),(0,o.jsxs)(n.p,{children:["The ",(0,o.jsx)(n.code,{children:"LittleHorseBlockingStub#withDeadlineAfter()"})," method takes two parameters:"]}),(0,o.jsxs)(n.ol,{children:["\n",(0,o.jsxs)(n.li,{children:[(0,o.jsx)(n.code,{children:"long duration"}),": the duration to await the request"]}),"\n",(0,o.jsxs)(n.li,{children:[(0,o.jsx)(n.code,{children:"TimeUnit unit"}),": the unit of time for the duration value"]}),"\n"]})]}),(0,o.jsxs)(i.A,{value:"python",label:"Python",default:!0,children:[(0,o.jsxs)(n.p,{children:["To use deadlines with our Python SDK, you can use the ",(0,o.jsx)(n.code,{children:"timeout"})," parameter in any gRPC request method call."]}),(0,o.jsx)(n.pre,{children:(0,o.jsx)(n.code,{className:"language-python",children:'async def main() -> None:\n    config = get_config()\n    client = config.stub()\n\n    await_workflow_event_request = AwaitWorkflowEventRequest(\n        wf_run_id=WfRunId(id="your-wf-run-id"),\n        event_def_ids=[WorkflowEventDefId(name="my-workflow-event-def")],\n        workflow_events_to_ignore=None)\n\n    # highlight-next-line\n    event: WorkflowEvent = client.AwaitWorkflowEvent(await_workflow_event_request, timeout=1)\n'})}),(0,o.jsx)(n.p,{children:(0,o.jsx)(n.strong,{children:"Parameters"})}),(0,o.jsxs)(n.p,{children:["Every ",(0,o.jsx)(n.code,{children:"LittleHorseStub"})," request method features an ",(0,o.jsx)(n.code,{children:"int timeout"})," parameter which represents the amount of time in ",(0,o.jsx)(n.code,{children:"seconds"})," that the client will wait before cancelling your request."]})]}),(0,o.jsxs)(i.A,{value:"go",label:"Go",default:!0,children:[(0,o.jsxs)(n.p,{children:["To use deadlines in our Go SDK, you can use the ",(0,o.jsx)(n.code,{children:"context"})," library's ",(0,o.jsx)(n.code,{children:"withTimeout()"})," method to wrap your context with a fixed deadline."]}),(0,o.jsx)(n.pre,{children:(0,o.jsx)(n.code,{className:"language-go",children:'config := littlehorse.NewConfigFromEnv()\nclient, err := config.GetGrpcClient()\n\n// highlight-start\ncontextWithTimeout, cancel := context.WithTimeout(context.Background(), time.Millisecond*1000)\ndefer cancel() // Ensure that cancel is called to release resources\n// highlight-end\n\nevent, err := (*client).AwaitWorkflowEvent(contextWithTimeout,\n  &lhproto.AwaitWorkflowEventRequest{\n    WfRunId: &lhproto.WfRunId{\n      Id: "your-workflow-run-id",\n    },\n    EventDefIds: []*lhproto.WorkflowEventDefId {\n      &lhproto.WorkflowEventDefId{\n        Name: "my-workflow-event-def",\n      },\n    }\n  },\n)\n'})}),(0,o.jsx)(n.p,{children:(0,o.jsx)(n.strong,{children:"Parameters"})}),(0,o.jsxs)(n.p,{children:["The ",(0,o.jsx)(n.code,{children:"Context.WithTimeout()"})," method takes two parameters:"]}),(0,o.jsxs)(n.ul,{children:["\n",(0,o.jsxs)(n.li,{children:[(0,o.jsx)(n.code,{children:"parent Context"}),": the context of your request, usually ",(0,o.jsx)(n.code,{children:"context.Background()"})]}),"\n",(0,o.jsxs)(n.li,{children:[(0,o.jsx)(n.code,{children:"timeout time.Duration"}),": the unit and duration of time for your deadline"]}),"\n"]}),(0,o.jsx)(n.p,{children:(0,o.jsx)(n.a,{href:"https://pkg.go.dev/context#WithTimeout",children:"Context.WithTimeout() Documentation"})})]})]}),"\n",(0,o.jsx)("hr",{}),"\n",(0,o.jsxs)(n.h3,{id:"ignoring-workflowevents",children:["Ignoring ",(0,o.jsx)(n.code,{children:"WorkflowEvent"}),"s"]}),"\n",(0,o.jsxs)(n.p,{children:["Since a single ",(0,o.jsx)(n.code,{children:"WfRun"})," may throw multiple ",(0,o.jsx)(n.code,{children:"WorkflowEvent"}),"s with the same ",(0,o.jsx)(n.code,{children:"WorkflowEventDefId"}),', clients have the ability to "ignore" ',(0,o.jsx)(n.code,{children:"WorkflowEvent"}),"s that have already been awaited. Any ",(0,o.jsx)(n.code,{children:"WorkflowEvent"})," specified within the ",(0,o.jsx)(n.code,{children:"workflowEventsToIgnore"})," field will be ignored."]}),"\n",(0,o.jsxs)(l.A,{children:[(0,o.jsx)(i.A,{value:"java",label:"Java",default:!0,children:(0,o.jsx)(n.pre,{children:(0,o.jsx)(n.code,{className:"language-java",children:'// The first WorkflowEvent awaited by the client\nWorkflowEvent event1 = client.awaitWorkflowEvent(AwaitWorkflowEventRequest.newBuilder()\n            .setWfRunId(WfRunId.newBuilder().setId("your-workflow-run-id"))\n            .addEventDefIds(WorkflowEventDefId.newBuilder().setName("my-workflow-event-def"))\n            .build());\n\n// The second WorkflowEvent awaited by the client\nWorkflowEvent event2 = client.awaitWorkflowEvent(AwaitWorkflowEventRequest.newBuilder()\n    .setWfRunId(WfRunId.newBuilder().setId("your-workflow-run-id"))\n    .addEventDefIds(WorkflowEventDefId.newBuilder().setName("my-workflow-event-def"))\n    // Ignore any WorkflowEvents matching the first one received\n    // highlight-next-line\n    .addWorkflowEventsToIgnore(event1.getId())\n    .build());\n'})})}),(0,o.jsx)(i.A,{value:"python",label:"Python",default:!0,children:(0,o.jsx)(n.pre,{children:(0,o.jsx)(n.code,{className:"language-python",children:'async def main() -> None:\n    config = get_config()\n    client = config.stub()\n\n    await_workflow_event_request = AwaitWorkflowEventRequest(\n        wf_run_id=WfRunId(id="your-wf-run-id"),\n        event_def_ids=[WorkflowEventDefId(name="my-workflow-event-def")],\n        workflow_events_to_ignore=None)\n    event1: WorkflowEvent = client.AwaitWorkflowEvent(await_workflow_event_request)\n\n    await_workflow_event_request_2 = AwaitWorkflowEventRequest(\n        wf_run_id=WfRunId(id="your-wf-run-id"),\n        event_def_ids=[WorkflowEventDefId(name="my-workflow-event-def")],\n        # Ignore any WorkflowEvents matching the first one received\n        # highlight-next-line\n        workflow_events_to_ignore=[event1.id])\n    \n    event2: WorkflowEvent = client.AwaitWorkflowEvent(await_workflow_event_request_2)\n'})})}),(0,o.jsx)(i.A,{value:"go",label:"Go",default:!0,children:(0,o.jsx)(n.pre,{children:(0,o.jsx)(n.code,{className:"language-go",children:'config := littlehorse.NewConfigFromEnv()\nclient, err := config.GetGrpcClient()\n\nevent1, err := (*client).AwaitWorkflowEvent(context.Background(),\n  &lhproto.AwaitWorkflowEventRequest{\n    WfRunId: &lhproto.WfRunId{\n      Id: "your-workflow-run-id",\n    },\n    EventDefIds: []*lhproto.WorkflowEventDefId{\n      &lhproto.WorkflowEventDefId{\n        Name: "my-workflow-event-def",\n      },\n    },\n  },\n)\n\nevent2, err := (*client).AwaitWorkflowEvent(context.Background(),\n  &lhproto.AwaitWorkflowEventRequest{\n    WfRunId: &lhproto.WfRunId{\n      Id: "your-workflow-run-id",\n    },\n    EventDefIds: []*lhproto.WorkflowEventDefId{\n      &lhproto.WorkflowEventDefId{\n        Name: "my-workflow-event-def",\n      },\n    },\n    // highlight-start\n    WorkflowEventsToIgnore: []*lhproto.WorkflowEventId{\n      event1.Id,\n    },\n    // highlight-end\n  },\n)\n'})})})]})]})}function h(e={}){const{wrapper:n}={...(0,r.R)(),...e.components};return n?(0,o.jsx)(n,{...e,children:(0,o.jsx)(f,{...e})}):f(e)}},9365:(e,n,t)=>{t.d(n,{A:()=>i});t(6540);var o=t(8215);const r={tabItem:"tabItem_Ymn6"};var l=t(4848);function i(e){let{children:n,hidden:t,className:i}=e;return(0,l.jsx)("div",{role:"tabpanel",className:(0,o.A)(r.tabItem,i),hidden:t,children:n})}},1470:(e,n,t)=>{t.d(n,{A:()=>E});var o=t(6540),r=t(8215),l=t(3104),i=t(6347),a=t(205),s=t(7485),d=t(1682),c=t(679);function u(e){return o.Children.toArray(e).filter((e=>"\n"!==e)).map((e=>{if(!e||(0,o.isValidElement)(e)&&function(e){const{props:n}=e;return!!n&&"object"==typeof n&&"value"in n}(e))return e;throw new Error(`Docusaurus error: Bad <Tabs> child <${"string"==typeof e.type?e.type:e.type.name}>: all children of the <Tabs> component should be <TabItem>, and every <TabItem> should have a unique "value" prop.`)}))?.filter(Boolean)??[]}function f(e){const{values:n,children:t}=e;return(0,o.useMemo)((()=>{const e=n??function(e){return u(e).map((e=>{let{props:{value:n,label:t,attributes:o,default:r}}=e;return{value:n,label:t,attributes:o,default:r}}))}(t);return function(e){const n=(0,d.XI)(e,((e,n)=>e.value===n.value));if(n.length>0)throw new Error(`Docusaurus error: Duplicate values "${n.map((e=>e.value)).join(", ")}" found in <Tabs>. Every value needs to be unique.`)}(e),e}),[n,t])}function h(e){let{value:n,tabValues:t}=e;return t.some((e=>e.value===n))}function w(e){let{queryString:n=!1,groupId:t}=e;const r=(0,i.W6)(),l=function(e){let{queryString:n=!1,groupId:t}=e;if("string"==typeof n)return n;if(!1===n)return null;if(!0===n&&!t)throw new Error('Docusaurus error: The <Tabs> component groupId prop is required if queryString=true, because this value is used as the search param name. You can also provide an explicit value such as queryString="my-search-param".');return t??null}({queryString:n,groupId:t});return[(0,s.aZ)(l),(0,o.useCallback)((e=>{if(!l)return;const n=new URLSearchParams(r.location.search);n.set(l,e),r.replace({...r.location,search:n.toString()})}),[l,r])]}function v(e){const{defaultValue:n,queryString:t=!1,groupId:r}=e,l=f(e),[i,s]=(0,o.useState)((()=>function(e){let{defaultValue:n,tabValues:t}=e;if(0===t.length)throw new Error("Docusaurus error: the <Tabs> component requires at least one <TabItem> children component");if(n){if(!h({value:n,tabValues:t}))throw new Error(`Docusaurus error: The <Tabs> has a defaultValue "${n}" but none of its children has the corresponding value. Available values are: ${t.map((e=>e.value)).join(", ")}. If you intend to show no default tab, use defaultValue={null} instead.`);return n}const o=t.find((e=>e.default))??t[0];if(!o)throw new Error("Unexpected error: 0 tabValues");return o.value}({defaultValue:n,tabValues:l}))),[d,u]=w({queryString:t,groupId:r}),[v,g]=function(e){let{groupId:n}=e;const t=function(e){return e?`docusaurus.tab.${e}`:null}(n),[r,l]=(0,c.Dv)(t);return[r,(0,o.useCallback)((e=>{t&&l.set(e)}),[t,l])]}({groupId:r}),k=(()=>{const e=d??v;return h({value:e,tabValues:l})?e:null})();(0,a.A)((()=>{k&&s(k)}),[k]);return{selectedValue:i,selectValue:(0,o.useCallback)((e=>{if(!h({value:e,tabValues:l}))throw new Error(`Can't select invalid tab value=${e}`);s(e),u(e),g(e)}),[u,g,l]),tabValues:l}}var g=t(2303);const k={tabList:"tabList__CuJ",tabItem:"tabItem_LNqP"};var p=t(4848);function x(e){let{className:n,block:t,selectedValue:o,selectValue:i,tabValues:a}=e;const s=[],{blockElementScrollPositionUntilNextRender:d}=(0,l.a_)(),c=e=>{const n=e.currentTarget,t=s.indexOf(n),r=a[t].value;r!==o&&(d(n),i(r))},u=e=>{let n=null;switch(e.key){case"Enter":c(e);break;case"ArrowRight":{const t=s.indexOf(e.currentTarget)+1;n=s[t]??s[0];break}case"ArrowLeft":{const t=s.indexOf(e.currentTarget)-1;n=s[t]??s[s.length-1];break}}n?.focus()};return(0,p.jsx)("ul",{role:"tablist","aria-orientation":"horizontal",className:(0,r.A)("tabs",{"tabs--block":t},n),children:a.map((e=>{let{value:n,label:t,attributes:l}=e;return(0,p.jsx)("li",{role:"tab",tabIndex:o===n?0:-1,"aria-selected":o===n,ref:e=>s.push(e),onKeyDown:u,onClick:c,...l,className:(0,r.A)("tabs__item",k.tabItem,l?.className,{"tabs__item--active":o===n}),children:t??n},n)}))})}function m(e){let{lazy:n,children:t,selectedValue:l}=e;const i=(Array.isArray(t)?t:[t]).filter(Boolean);if(n){const e=i.find((e=>e.props.value===l));return e?(0,o.cloneElement)(e,{className:(0,r.A)("margin-top--md",e.props.className)}):null}return(0,p.jsx)("div",{className:"margin-top--md",children:i.map(((e,n)=>(0,o.cloneElement)(e,{key:n,hidden:e.props.value!==l})))})}function j(e){const n=v(e);return(0,p.jsxs)("div",{className:(0,r.A)("tabs-container",k.tabList),children:[(0,p.jsx)(x,{...n,...e}),(0,p.jsx)(m,{...n,...e})]})}function E(e){const n=(0,g.A)();return(0,p.jsx)(j,{...e,children:u(e.children)},String(n))}},8453:(e,n,t)=>{t.d(n,{R:()=>i,x:()=>a});var o=t(6540);const r={},l=o.createContext(r);function i(e){const n=o.useContext(l);return o.useMemo((function(){return"function"==typeof e?e(n):{...n,...e}}),[n,e])}function a(e){let n;return n=e.disableParentContext?"function"==typeof e.components?e.components(r):e.components||r:i(e.components),o.createElement(l.Provider,{value:n},e.children)}}}]);