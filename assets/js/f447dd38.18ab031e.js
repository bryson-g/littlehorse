"use strict";(self.webpackChunklh_site=self.webpackChunklh_site||[]).push([[4635],{6572:(e,n,t)=>{t.r(n),t.d(n,{assets:()=>d,contentTitle:()=>i,default:()=>p,frontMatter:()=>s,metadata:()=>c,toc:()=>u});var r=t(4848),a=t(8453),l=t(1470),o=t(9365);const s={},i="Posting ExternalEvents",c={id:"developer-guide/grpc/posting-external-events",title:"Posting ExternalEvents",description:"You can post an ExternalEvent using the PutExternalEvent rpc call.",source:"@site/docs/05-developer-guide/09-grpc/15-posting-external-events.md",sourceDirName:"05-developer-guide/09-grpc",slug:"/developer-guide/grpc/posting-external-events",permalink:"/docs/developer-guide/grpc/posting-external-events",draft:!1,unlisted:!1,tags:[],version:"current",sidebarPosition:15,frontMatter:{},sidebar:"tutorialSidebar",previous:{title:"Running a Workflow",permalink:"/docs/developer-guide/grpc/running-workflows"},next:{title:"Handling User Tasks",permalink:"/docs/developer-guide/grpc/user-tasks"}},d={},u=[{value:"<code>PutExternalEventRequest</code>",id:"putexternaleventrequest",level:2},{value:"Required Parameters",id:"required-parameters",level:3},{value:"Idempotence",id:"idempotence",level:3},{value:"Targeting Specific Threads and Nodes",id:"targeting-specific-threads-and-nodes",level:3},{value:"Making the Request",id:"making-the-request",level:2}];function h(e){const n={a:"a",code:"code",h1:"h1",h2:"h2",h3:"h3",li:"li",ol:"ol",p:"p",pre:"pre",...(0,a.R)(),...e.components};return(0,r.jsxs)(r.Fragment,{children:[(0,r.jsxs)(n.h1,{id:"posting-externalevents",children:["Posting ",(0,r.jsx)(n.code,{children:"ExternalEvent"}),"s"]}),"\n",(0,r.jsxs)(n.p,{children:["You can post an ",(0,r.jsx)(n.code,{children:"ExternalEvent"})," using the ",(0,r.jsx)(n.code,{children:"PutExternalEvent"})," rpc call."]}),"\n",(0,r.jsx)(n.h2,{id:"putexternaleventrequest",children:(0,r.jsx)(n.code,{children:"PutExternalEventRequest"})}),"\n",(0,r.jsxs)(n.p,{children:["You need to create a ",(0,r.jsx)(n.code,{children:"PutExternalEventRequest"})," to do so. The protobuf definition is:"]}),"\n",(0,r.jsx)(n.pre,{children:(0,r.jsx)(n.code,{className:"language-protobuf",children:"message PutExternalEventRequest {\n  string wf_run_id = 1;\n  string external_event_def_name = 2;\n  optional string guid = 3;\n  VariableValue content = 5;\n  optional int32 thread_run_number = 6;\n  optional int32 node_run_position = 7;\n}\n"})}),"\n",(0,r.jsx)(n.h3,{id:"required-parameters",children:"Required Parameters"}),"\n",(0,r.jsx)(n.p,{children:"The three required values are:"}),"\n",(0,r.jsxs)(n.ol,{children:["\n",(0,r.jsxs)(n.li,{children:[(0,r.jsx)(n.code,{children:"wfRunId"})," is the ID of the ",(0,r.jsx)(n.code,{children:"WfRun"})," that the ",(0,r.jsx)(n.code,{children:"ExternalEvent"})," is sent to."]}),"\n",(0,r.jsxs)(n.li,{children:[(0,r.jsx)(n.code,{children:"externalEventDefName"})," is the name of the ",(0,r.jsx)(n.code,{children:"ExternalEventDef"})," to send."]}),"\n",(0,r.jsxs)(n.li,{children:[(0,r.jsx)(n.code,{children:"content"})," is the actual payload of the ",(0,r.jsx)(n.code,{children:"ExternalEvent"}),"."]}),"\n"]}),"\n",(0,r.jsx)(n.h3,{id:"idempotence",children:"Idempotence"}),"\n",(0,r.jsxs)(n.p,{children:["The ",(0,r.jsx)(n.code,{children:"guid"})," parameter is optional, but it is highly recommended to set it for idempotence. As per the ",(0,r.jsxs)(n.a,{href:"/docs/concepts/external-events",children:[(0,r.jsx)(n.code,{children:"ExternalEvent"})," Documentation"]}),", an ",(0,r.jsx)(n.code,{children:"ExternalEvent"})," has a composite ID:"]}),"\n",(0,r.jsxs)(n.ol,{children:["\n",(0,r.jsx)(n.li,{children:(0,r.jsx)(n.code,{children:"wf_run_id"})}),"\n",(0,r.jsx)(n.li,{children:(0,r.jsx)(n.code,{children:"external_event_def_name"})}),"\n",(0,r.jsx)(n.li,{children:(0,r.jsx)(n.code,{children:"guid"})}),"\n"]}),"\n",(0,r.jsxs)(n.p,{children:["If no ",(0,r.jsx)(n.code,{children:"guid"})," is provided, the server generates a random one for you. If you provide a ",(0,r.jsx)(n.code,{children:"guid"})," and an ",(0,r.jsx)(n.code,{children:"ExternalEvent"})," has already been posted with that ",(0,r.jsx)(n.code,{children:"guid"}),", your call has no effect. This is a good strategy for enabling idempotent retries."]}),"\n",(0,r.jsx)(n.h3,{id:"targeting-specific-threads-and-nodes",children:"Targeting Specific Threads and Nodes"}),"\n",(0,r.jsxs)(n.p,{children:["The ",(0,r.jsx)(n.code,{children:"thread_run_number"})," parameter can be used to send the ",(0,r.jsx)(n.code,{children:"ExternalEvent"})," to a specific ",(0,r.jsx)(n.code,{children:"ThreadRun"}),"."]}),"\n",(0,r.jsx)(n.p,{children:"This feature is rarely used; only for advanced use-cases."}),"\n",(0,r.jsx)(n.h2,{id:"making-the-request",children:"Making the Request"}),"\n",(0,r.jsxs)(n.p,{children:["The last thing we need to do to send the request is to set the ",(0,r.jsx)(n.code,{children:"content"})," ",(0,r.jsx)(n.code,{children:"VariableValue"}),"."]}),"\n","\n",(0,r.jsxs)(l.A,{children:[(0,r.jsxs)(o.A,{value:"java",label:"Java",default:!0,children:[(0,r.jsxs)(n.p,{children:["In Java, we can use ",(0,r.jsx)(n.code,{children:"LHLibUtil#objToVarVal()"})," to convert an aribitrary Java value or object into a ",(0,r.jsx)(n.code,{children:"VariableValue"}),". You can post an event as follows:"]}),(0,r.jsx)(n.pre,{children:(0,r.jsx)(n.code,{className:"language-java",children:'LittleHorseBlockingStub client = ...;\n\nString idempotencyKey = "asdf13hoasdifoje"; // optional\n\nclient.PutExternalEvent(PutExternalEventRequest.newBuilder()\n        .setExternalEventDefId(ExternalEventDefId.newBuilder().setName("my-external-event-def"))\n        .setWfRunId(WfRunId.newBuilder().setId("asdf-1234"))\n        .setContent(LHLibUtil.objToVarVal(someObject))\n        .setGuid(idempotencyKey) // optional\n        .build());\n'})})]}),(0,r.jsxs)(o.A,{value:"go",label:"Go",children:[(0,r.jsxs)(n.p,{children:["In Go, you can use the ",(0,r.jsx)(n.code,{children:"common.InterfaceToVarVal()"})," method to create the ",(0,r.jsx)(n.code,{children:"content"})," parameter."]}),(0,r.jsx)(n.pre,{children:(0,r.jsx)(n.code,{className:"language-go",children:'idempotencyKey := "asdfo2htoijsvlk" // optional\n\neventContent, _ := common.InterfaceToVarVal("some-interface")\nresult, _ := (*client).PutExternalEvent(context.Background(), &model.PutExternalEventRequest{\n\tWfRunId:            &model.WfRunId{Id: "some-wfrun-id"},\n\tExternalEventDefId: &model.ExternalEventDefId{Name: "some-external-event-def"},\n\tContent:            eventContent,\n\tGuid:               &idempotencyKey, // optional\n})\n'})})]}),(0,r.jsxs)(o.A,{value:"python",label:"Python",children:[(0,r.jsxs)(n.p,{children:["In Python, you can use the ",(0,r.jsx)(n.code,{children:"littlehorse.to_variable_value()"})," method to create the ",(0,r.jsx)(n.code,{children:"content"})," parameter."]}),(0,r.jsx)(n.pre,{children:(0,r.jsx)(n.code,{className:"language-python",children:'import littlehorse\nfrom littlehorse.config import LHConfig\nfrom littlehorse.model import *\n\nconfig = LHConfig()\nclient = config.stub()\n\nidempotency_key = "asfjok23jtoadfjl" # optional\n\nclient.PutExternalEvent(\n    PutExternalEventRequest(\n        wf_run_id=WfRunId(id="asdf-1234"),\n        external_event_def_id=ExternalEventDefId(name="my-external-event-def"),\n        content=littlehorse.to_variable_value("my value"),\n        guid=idempotency_key, # optional\n    )\n)\n'})})]})]})]})}function p(e={}){const{wrapper:n}={...(0,a.R)(),...e.components};return n?(0,r.jsx)(n,{...e,children:(0,r.jsx)(h,{...e})}):h(e)}},9365:(e,n,t)=>{t.d(n,{A:()=>o});t(6540);var r=t(8215);const a={tabItem:"tabItem_Ymn6"};var l=t(4848);function o(e){let{children:n,hidden:t,className:o}=e;return(0,l.jsx)("div",{role:"tabpanel",className:(0,r.A)(a.tabItem,o),hidden:t,children:n})}},1470:(e,n,t)=>{t.d(n,{A:()=>y});var r=t(6540),a=t(8215),l=t(3104),o=t(6347),s=t(205),i=t(7485),c=t(1682),d=t(9466);function u(e){return r.Children.toArray(e).filter((e=>"\n"!==e)).map((e=>{if(!e||(0,r.isValidElement)(e)&&function(e){const{props:n}=e;return!!n&&"object"==typeof n&&"value"in n}(e))return e;throw new Error(`Docusaurus error: Bad <Tabs> child <${"string"==typeof e.type?e.type:e.type.name}>: all children of the <Tabs> component should be <TabItem>, and every <TabItem> should have a unique "value" prop.`)}))?.filter(Boolean)??[]}function h(e){const{values:n,children:t}=e;return(0,r.useMemo)((()=>{const e=n??function(e){return u(e).map((e=>{let{props:{value:n,label:t,attributes:r,default:a}}=e;return{value:n,label:t,attributes:r,default:a}}))}(t);return function(e){const n=(0,c.X)(e,((e,n)=>e.value===n.value));if(n.length>0)throw new Error(`Docusaurus error: Duplicate values "${n.map((e=>e.value)).join(", ")}" found in <Tabs>. Every value needs to be unique.`)}(e),e}),[n,t])}function p(e){let{value:n,tabValues:t}=e;return t.some((e=>e.value===n))}function x(e){let{queryString:n=!1,groupId:t}=e;const a=(0,o.W6)(),l=function(e){let{queryString:n=!1,groupId:t}=e;if("string"==typeof n)return n;if(!1===n)return null;if(!0===n&&!t)throw new Error('Docusaurus error: The <Tabs> component groupId prop is required if queryString=true, because this value is used as the search param name. You can also provide an explicit value such as queryString="my-search-param".');return t??null}({queryString:n,groupId:t});return[(0,i.aZ)(l),(0,r.useCallback)((e=>{if(!l)return;const n=new URLSearchParams(a.location.search);n.set(l,e),a.replace({...a.location,search:n.toString()})}),[l,a])]}function f(e){const{defaultValue:n,queryString:t=!1,groupId:a}=e,l=h(e),[o,i]=(0,r.useState)((()=>function(e){let{defaultValue:n,tabValues:t}=e;if(0===t.length)throw new Error("Docusaurus error: the <Tabs> component requires at least one <TabItem> children component");if(n){if(!p({value:n,tabValues:t}))throw new Error(`Docusaurus error: The <Tabs> has a defaultValue "${n}" but none of its children has the corresponding value. Available values are: ${t.map((e=>e.value)).join(", ")}. If you intend to show no default tab, use defaultValue={null} instead.`);return n}const r=t.find((e=>e.default))??t[0];if(!r)throw new Error("Unexpected error: 0 tabValues");return r.value}({defaultValue:n,tabValues:l}))),[c,u]=x({queryString:t,groupId:a}),[f,v]=function(e){let{groupId:n}=e;const t=function(e){return e?`docusaurus.tab.${e}`:null}(n),[a,l]=(0,d.Dv)(t);return[a,(0,r.useCallback)((e=>{t&&l.set(e)}),[t,l])]}({groupId:a}),m=(()=>{const e=c??f;return p({value:e,tabValues:l})?e:null})();(0,s.A)((()=>{m&&i(m)}),[m]);return{selectedValue:o,selectValue:(0,r.useCallback)((e=>{if(!p({value:e,tabValues:l}))throw new Error(`Can't select invalid tab value=${e}`);i(e),u(e),v(e)}),[u,v,l]),tabValues:l}}var v=t(2303);const m={tabList:"tabList__CuJ",tabItem:"tabItem_LNqP"};var g=t(4848);function j(e){let{className:n,block:t,selectedValue:r,selectValue:o,tabValues:s}=e;const i=[],{blockElementScrollPositionUntilNextRender:c}=(0,l.a_)(),d=e=>{const n=e.currentTarget,t=i.indexOf(n),a=s[t].value;a!==r&&(c(n),o(a))},u=e=>{let n=null;switch(e.key){case"Enter":d(e);break;case"ArrowRight":{const t=i.indexOf(e.currentTarget)+1;n=i[t]??i[0];break}case"ArrowLeft":{const t=i.indexOf(e.currentTarget)-1;n=i[t]??i[i.length-1];break}}n?.focus()};return(0,g.jsx)("ul",{role:"tablist","aria-orientation":"horizontal",className:(0,a.A)("tabs",{"tabs--block":t},n),children:s.map((e=>{let{value:n,label:t,attributes:l}=e;return(0,g.jsx)("li",{role:"tab",tabIndex:r===n?0:-1,"aria-selected":r===n,ref:e=>i.push(e),onKeyDown:u,onClick:d,...l,className:(0,a.A)("tabs__item",m.tabItem,l?.className,{"tabs__item--active":r===n}),children:t??n},n)}))})}function b(e){let{lazy:n,children:t,selectedValue:a}=e;const l=(Array.isArray(t)?t:[t]).filter(Boolean);if(n){const e=l.find((e=>e.props.value===a));return e?(0,r.cloneElement)(e,{className:"margin-top--md"}):null}return(0,g.jsx)("div",{className:"margin-top--md",children:l.map(((e,n)=>(0,r.cloneElement)(e,{key:n,hidden:e.props.value!==a})))})}function E(e){const n=f(e);return(0,g.jsxs)("div",{className:(0,a.A)("tabs-container",m.tabList),children:[(0,g.jsx)(j,{...n,...e}),(0,g.jsx)(b,{...n,...e})]})}function y(e){const n=(0,v.A)();return(0,g.jsx)(E,{...e,children:u(e.children)},String(n))}},8453:(e,n,t)=>{t.d(n,{R:()=>o,x:()=>s});var r=t(6540);const a={},l=r.createContext(a);function o(e){const n=r.useContext(l);return r.useMemo((function(){return"function"==typeof e?e(n):{...n,...e}}),[n,e])}function s(e){let n;return n=e.disableParentContext?"function"==typeof e.components?e.components(a):e.components||a:o(e.components),r.createElement(l.Provider,{value:n},e.children)}}}]);