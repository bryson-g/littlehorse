"use strict";(self.webpackChunklh_site=self.webpackChunklh_site||[]).push([[9445],{1296:(e,n,r)=>{r.r(n),r.d(n,{assets:()=>u,contentTitle:()=>o,default:()=>f,frontMatter:()=>i,metadata:()=>c,toc:()=>d});var t=r(4848),s=r(8453),a=r(1470),l=r(9365);const i={},o="Running a Workflow",c={id:"developer-guide/grpc/running-workflows",title:"Running a Workflow",description:"You can run a WfSpec, thus creating a WfRun, in two ways:",source:"@site/docs/05-developer-guide/09-grpc/10-running-workflows.md",sourceDirName:"05-developer-guide/09-grpc",slug:"/developer-guide/grpc/running-workflows",permalink:"/docs/developer-guide/grpc/running-workflows",draft:!1,unlisted:!1,tags:[],version:"current",sidebarPosition:10,frontMatter:{},sidebar:"tutorialSidebar",previous:{title:"Managing Metadata",permalink:"/docs/developer-guide/grpc/managing-metadata"},next:{title:"Posting ExternalEvents",permalink:"/docs/developer-guide/grpc/posting-external-events"}},u={},d=[{value:"Simple",id:"simple",level:2},{value:"Pinning to a Major Version",id:"pinning-to-a-major-version",level:2},{value:"Pinning the Revision",id:"pinning-the-revision",level:2},{value:"Passing the ID",id:"passing-the-id",level:2},{value:"Parameters",id:"parameters",level:2},{value:"Scheduling",id:"scheduling",level:2}];function h(e){const n={a:"a",code:"code",h1:"h1",h2:"h2",header:"header",li:"li",ol:"ol",p:"p",pre:"pre",strong:"strong",...(0,s.R)(),...e.components};return(0,t.jsxs)(t.Fragment,{children:[(0,t.jsx)(n.header,{children:(0,t.jsx)(n.h1,{id:"running-a-workflow",children:"Running a Workflow"})}),"\n",(0,t.jsxs)(n.p,{children:["You can run a ",(0,t.jsx)(n.code,{children:"WfSpec"}),", thus creating a ",(0,t.jsx)(n.code,{children:"WfRun"}),", in two ways:"]}),"\n",(0,t.jsxs)(n.ol,{children:["\n",(0,t.jsx)(n.li,{children:"Using a grpc client in an SDK of your choice."}),"\n",(0,t.jsxs)(n.li,{children:["Using ",(0,t.jsx)(n.code,{children:"lhctl"}),"."]}),"\n"]}),"\n",(0,t.jsxs)(n.p,{children:["For a tutorial on running a ",(0,t.jsx)(n.code,{children:"WfSpec"})," to create a ",(0,t.jsx)(n.code,{children:"WfRun"})," using ",(0,t.jsx)(n.code,{children:"lhctl"}),", see the ",(0,t.jsxs)(n.a,{href:"/docs/developer-guide/lhctl",children:[(0,t.jsx)(n.code,{children:"lhctl"})," docs"]}),"."]}),"\n",(0,t.jsx)(n.h2,{id:"simple",children:"Simple"}),"\n",(0,t.jsxs)(n.p,{children:["The most basic way to run a ",(0,t.jsx)(n.code,{children:"WfRun"})," is as follows. This will run the latest version of the ",(0,t.jsx)(n.code,{children:"WfSpec"})," with the provided name."]}),"\n",(0,t.jsxs)(a.A,{children:[(0,t.jsx)(l.A,{value:"java",label:"Java",default:!0,children:(0,t.jsx)(n.pre,{children:(0,t.jsx)(n.code,{className:"language-java",children:'LittleHorseBlockingStub client = ...;\n\nWfRun result = client.runWf(RunWfRequest.newBuilder().setWfSpecName("some-wf-spec").build());\n'})})}),(0,t.jsx)(l.A,{value:"go",label:"Go",children:(0,t.jsx)(n.pre,{children:(0,t.jsx)(n.code,{className:"language-go",children:'config := littlehorse.NewConfigFromEnv()\nclient, _ := config.GetGrpcClient()\n\nresult, err := (*client).RunWf(context.Background(), &lhproto.RunWfRequest{\n    WfSpecName: "some-wf-spec",\n})\n'})})}),(0,t.jsx)(l.A,{value:"python",label:"Python",children:(0,t.jsx)(n.pre,{children:(0,t.jsx)(n.code,{className:"language-python",children:'config = LHConfig()\nstub = config.stub()\nstub.RunWf(RunWfRequest(wf_spec_name="some-wf-spec"))\n'})})})]}),"\n",(0,t.jsx)(n.h2,{id:"pinning-to-a-major-version",children:"Pinning to a Major Version"}),"\n",(0,t.jsxs)(n.p,{children:["As a consumer of a ",(0,t.jsx)(n.code,{children:"WfSpec"}),", an application may wish to pin to a specific ",(0,t.jsx)(n.code,{children:"majorVersion"})," in order to allow the owner of the ",(0,t.jsx)(n.code,{children:"WfSpec"})," to evolve the ",(0,t.jsx)(n.code,{children:"WfSpec"})," in a compatible manner (i.e. without changing the exposed input variables or searchable variables). You can do this by providing the ",(0,t.jsx)(n.code,{children:"majorVersion"})," flag. When you run a ",(0,t.jsx)(n.code,{children:"WfSpec"})," and specify the ",(0,t.jsx)(n.code,{children:"majorVersion"}),", the resulting ",(0,t.jsx)(n.code,{children:"WfRun"})," will be a member of the ",(0,t.jsx)(n.code,{children:"WfSpec"})," with the provided name and ",(0,t.jsx)(n.code,{children:"majorVersion"})," and the ",(0,t.jsx)(n.strong,{children:"latest"})," ",(0,t.jsx)(n.code,{children:"revision"})," that is still compatible with that ",(0,t.jsx)(n.code,{children:"majorVersion"}),"."]}),"\n",(0,t.jsxs)(a.A,{children:[(0,t.jsx)(l.A,{value:"java",label:"Java",default:!0,children:(0,t.jsx)(n.pre,{children:(0,t.jsx)(n.code,{className:"language-java",children:'LittleHorseBlockingStub client = ...;\n\nWfRun result = client.runWf(RunWfRequest.newBuilder()\n        .setWfSpecName("some-wf-spec")\n        .setMajorVersion(2)\n        .build());\n\n'})})}),(0,t.jsx)(l.A,{value:"go",label:"Go",children:(0,t.jsx)(n.pre,{children:(0,t.jsx)(n.code,{className:"language-go",children:'config := littlehorse.NewConfigFromEnv()\nclient, _ := config.GetGrpcClient()\n\nvar version int32\nversion = 2\n\nresult, err := (*client).RunWf(context.Background(), &lhproto.RunWfRequest{\n    WfSpecName:   "some-wf-spec",\n    MajorVersion: &version,\n})\n'})})}),(0,t.jsx)(l.A,{value:"python",label:"Python",children:(0,t.jsx)(n.pre,{children:(0,t.jsx)(n.code,{className:"language-python",children:'config = LHConfig()\nstub = config.stub()\nstub.RunWf(RunWfRequest(wf_spec_name="some-wf-spec", majorVersion=2))\n'})})})]}),"\n",(0,t.jsx)(n.h2,{id:"pinning-the-revision",children:"Pinning the Revision"}),"\n",(0,t.jsxs)(n.p,{children:["You can also pin the exact ",(0,t.jsx)(n.code,{children:"revision"})," as follows, thus guaranteeing the exact ",(0,t.jsx)(n.code,{children:"WfSpec"})," that is run:"]}),"\n",(0,t.jsxs)(a.A,{children:[(0,t.jsx)(l.A,{value:"java",label:"Java",default:!0,children:(0,t.jsx)(n.pre,{children:(0,t.jsx)(n.code,{className:"language-java",children:'LittleHorseBlockingStub client = ...;\n\nWfRun result = client.runWf(RunWfRequest.newBuilder()\n        .setWfSpecName("some-wf-spec")\n        .setMajorVersion(2)\n        .setRevision(1)\n        .build());\n\n'})})}),(0,t.jsx)(l.A,{value:"go",label:"Go",children:(0,t.jsx)(n.pre,{children:(0,t.jsx)(n.code,{className:"language-go",children:'config := littlehorse.NewConfigFromEnv()\nclient, _ := config.GetGrpcClient()\n\nvar version int32\nversion = 2\nvar revision int32\nrevision = 1\n\nresult, err := (*client).RunWf(context.Background(), &lhproto.RunWfRequest{\n    WfSpecName:   "some-wf-spec",\n    MajorVersion: &version,\n    Revision:     &revision,\n})\n'})})}),(0,t.jsx)(l.A,{value:"python",label:"Python",children:(0,t.jsx)(n.pre,{children:(0,t.jsx)(n.code,{className:"language-python",children:'config = LHConfig()\nstub = config.stub()\nstub.RunWf(RunWfRequest(wf_spec_name="some-wf-spec", majorVersion=2, revision=1))\n'})})})]}),"\n",(0,t.jsx)(n.h2,{id:"passing-the-id",children:"Passing the ID"}),"\n",(0,t.jsxs)(n.p,{children:["You can pass the ",(0,t.jsx)(n.code,{children:"wfRunId"})," in the ",(0,t.jsx)(n.code,{children:"RunWfRequest"})," to pre-specify the ID of a ",(0,t.jsx)(n.code,{children:"WfRun"}),". ",(0,t.jsx)(n.strong,{children:"We recommend you always do this as a best practice"})," because:"]}),"\n",(0,t.jsxs)(n.ol,{children:["\n",(0,t.jsxs)(n.li,{children:["This makes your requests idempotent and safe to retry, because LittleHorse guarantees that only one ",(0,t.jsx)(n.code,{children:"WfRun"})," can exist with a given ID."]}),"\n",(0,t.jsxs)(n.li,{children:["Specifying an ID makes it easier to correlate ",(0,t.jsx)(n.code,{children:"ExternalEvent"}),"s or records in a database."]}),"\n"]}),"\n",(0,t.jsxs)(n.p,{children:["To do so, just set the ",(0,t.jsx)(n.code,{children:"Id"})," field in the ",(0,t.jsx)(n.code,{children:"RunWfRequest"})," proto."]}),"\n",(0,t.jsxs)(a.A,{children:[(0,t.jsx)(l.A,{value:"java",label:"Java",default:!0,children:(0,t.jsx)(n.pre,{children:(0,t.jsx)(n.code,{className:"language-java",children:'LittleHorseBlockingStub client = ...;\n\nWfRun result = client.runWf(RunWfRequest.newBuilder()\n        .setWfSpecName("some-wf-spec")\n        .setId("my-wfrun-id")\n        .build());\n\n'})})}),(0,t.jsx)(l.A,{value:"go",label:"Go",children:(0,t.jsx)(n.pre,{children:(0,t.jsx)(n.code,{className:"language-go",children:'config := littlehorse.NewConfigFromEnv()\nclient, _ := config.GetGrpcClient()\n\nvar wfRunId string\nwfRunId = "my-wfrun-id"\n\nresult, err := (*client).RunWf(context.Background(), &lhproto.RunWfRequest{\n    WfSpecName: "some-wf-spec",\n    Id:         &wfRunId,\n})\n'})})}),(0,t.jsx)(l.A,{value:"python",label:"Python",children:(0,t.jsx)(n.pre,{children:(0,t.jsx)(n.code,{className:"language-python",children:'config = LHConfig()\nstub = config.stub()\nstub.RunWf(RunWfRequest(wf_spec_name="some-wf-spec", id="my-wfrun-id"))\n'})})})]}),"\n",(0,t.jsx)(n.h2,{id:"parameters",children:"Parameters"}),"\n",(0,t.jsxs)(n.p,{children:["You can pass variables into a ",(0,t.jsx)(n.code,{children:"WfRun"}),". To do so, set the ",(0,t.jsx)(n.code,{children:"variables"})," field on the ",(0,t.jsx)(n.code,{children:"RunWfRequest"}),"."]}),"\n",(0,t.jsxs)(a.A,{children:[(0,t.jsxs)(l.A,{value:"java",label:"Java",default:!0,children:[(0,t.jsxs)(n.p,{children:["In Java, the ",(0,t.jsx)(n.code,{children:"LHLibUtil#objToVarVal"})," method is a useful convenience function to convert any object into a ",(0,t.jsx)(n.code,{children:"VariableValue"}),"."]}),(0,t.jsx)(n.pre,{children:(0,t.jsx)(n.code,{className:"language-java",children:'LittleHorseBlockingStub client = ...;\n\nWfRun result = client.runWf(RunWfRequest.newBuilder()\n        .setWfSpecName("some-wf-spec")\n        .putVariables("my-int-var", LHLibUtil.objToVarVal(1234))\n        .putVariables("my-str-var", LHLibUtil.objToVarVal("asdf"))\n        .build());\n'})})]}),(0,t.jsxs)(l.A,{value:"go",label:"Go",children:[(0,t.jsxs)(n.p,{children:["The Go SDK has a useful ",(0,t.jsx)(n.code,{children:"littlehorse.InterfaceToVarVal()"})," function which converts an arbitrary Go interface into a ",(0,t.jsx)(n.code,{children:"VariableValue"}),"."]}),(0,t.jsx)(n.pre,{children:(0,t.jsx)(n.code,{className:"language-go",children:'config := littlehorse.NewConfigFromEnv()\nclient, _ := config.GetGrpcClient()\n\nvar wfRunId string\nwfRunId = "my-wfrun-id"\n\nstringVar, err := littlehorse.InterfaceToVarVal("some-string")\nintVar, err := littlehorse.InterfaceToVarVal(1234)\n\nresult, err := (*client).RunWf(context.Background(), &lhproto.RunWfRequest{\n\tWfSpecName: "some-wf-spec",\n\tVariables: map[string]*lhproto.VariableValue{\n\t\t"my-string-var": stringVar,\n\t\t"my-int-var": intVar,\n\t},\n})\n'})})]}),(0,t.jsxs)(l.A,{value:"python",label:"Python",children:[(0,t.jsxs)(n.p,{children:["In python you can use ",(0,t.jsx)(n.code,{children:"littlehorse.to_variable_value()"})," utility."]}),(0,t.jsx)(n.pre,{children:(0,t.jsx)(n.code,{className:"language-python",children:'config = LHConfig()\nstub = config.stub()\nrequest = RunWfRequest(\n    wf_spec_name="some-wf-spec",\n    id="my-wfrun-id",\n    variables={\n        "my-string-var": littlehorse.to_variable_value("ABCD"),\n        "my-int-var": littlehorse.to_variable_value(1234),\n    },\n)\nstub.RunWf(request)\n'})})]})]}),"\n",(0,t.jsx)(n.h2,{id:"scheduling",children:"Scheduling"}),"\n",(0,t.jsxs)(n.p,{children:["You can schedule ",(0,t.jsx)(n.code,{children:"WfRun"}),"s using Cron expressions."]}),"\n",(0,t.jsxs)(a.A,{children:[(0,t.jsx)(l.A,{value:"java",label:"Java",default:!0,children:(0,t.jsx)(n.pre,{children:(0,t.jsx)(n.code,{className:"language-java",children:'LittleHorseBlockingStub client = ...;\n\nScheduledWfRun result = client.scheduleWf(ScheduleWfRequest.newBuilder()\n        .setWfSpecName("some-wf-spec")\n        .setMajorVersion(0)\n        .setRevision(2)\n        .setCronExpression("5 4 * * *")\n        .putVariables("my-int-var", LHLibUtil.objToVarVal(1234))\n        .build());\n'})})}),(0,t.jsx)(l.A,{value:"go",label:"Go",children:(0,t.jsx)(n.pre,{children:(0,t.jsx)(n.code,{className:"language-go",children:'config := littlehorse.NewConfigFromEnv()\nclient, _ := config.GetGrpcClient()\n\nvar wfRunId string\nwfRunId = "my-wfrun-id"\n\nstringVar, err := littlehorse.InterfaceToVarVal("some-string")\nintVar, err := littlehorse.InterfaceToVarVal(1234)\n\nresult, err := (*client).ScheduleWf(context.Background(), &lhproto.ScheduleWfRequest{\n\tWfSpecName: "some-wf-spec",\n\tCronExpression: "5 4 * * *",\n\tVariables: map[string]*lhproto.VariableValue{\n\t\t"my-string-var": stringVar,\n\t},\n})\n'})})}),(0,t.jsx)(l.A,{value:"python",label:"Python",children:(0,t.jsx)(n.pre,{children:(0,t.jsx)(n.code,{className:"language-python",children:'config = LHConfig()\nstub = config.stub()\nrequest = ScheduleWfRequest(\n    wf_spec_name="some-wf-spec",\n    cron_expression="5 4 * * *",\n    variables={\n        "name": littlehorse.to_variable_value("bob"),\n    },\n)\nstub.RunWf(request)\n'})})})]}),"\n",(0,t.jsxs)(n.p,{children:["Note that you are not required to pick a ",(0,t.jsx)(n.code,{children:"WfSpec"})," version; if you don't, the most current version will be used for every run."]})]})}function f(e={}){const{wrapper:n}={...(0,s.R)(),...e.components};return n?(0,t.jsx)(n,{...e,children:(0,t.jsx)(h,{...e})}):h(e)}},9365:(e,n,r)=>{r.d(n,{A:()=>l});r(6540);var t=r(8215);const s={tabItem:"tabItem_Ymn6"};var a=r(4848);function l(e){let{children:n,hidden:r,className:l}=e;return(0,a.jsx)("div",{role:"tabpanel",className:(0,t.A)(s.tabItem,l),hidden:r,children:n})}},1470:(e,n,r)=>{r.d(n,{A:()=>R});var t=r(6540),s=r(8215),a=r(3104),l=r(6347),i=r(205),o=r(7485),c=r(1682),u=r(679);function d(e){return t.Children.toArray(e).filter((e=>"\n"!==e)).map((e=>{if(!e||(0,t.isValidElement)(e)&&function(e){const{props:n}=e;return!!n&&"object"==typeof n&&"value"in n}(e))return e;throw new Error(`Docusaurus error: Bad <Tabs> child <${"string"==typeof e.type?e.type:e.type.name}>: all children of the <Tabs> component should be <TabItem>, and every <TabItem> should have a unique "value" prop.`)}))?.filter(Boolean)??[]}function h(e){const{values:n,children:r}=e;return(0,t.useMemo)((()=>{const e=n??function(e){return d(e).map((e=>{let{props:{value:n,label:r,attributes:t,default:s}}=e;return{value:n,label:r,attributes:t,default:s}}))}(r);return function(e){const n=(0,c.XI)(e,((e,n)=>e.value===n.value));if(n.length>0)throw new Error(`Docusaurus error: Duplicate values "${n.map((e=>e.value)).join(", ")}" found in <Tabs>. Every value needs to be unique.`)}(e),e}),[n,r])}function f(e){let{value:n,tabValues:r}=e;return r.some((e=>e.value===n))}function p(e){let{queryString:n=!1,groupId:r}=e;const s=(0,l.W6)(),a=function(e){let{queryString:n=!1,groupId:r}=e;if("string"==typeof n)return n;if(!1===n)return null;if(!0===n&&!r)throw new Error('Docusaurus error: The <Tabs> component groupId prop is required if queryString=true, because this value is used as the search param name. You can also provide an explicit value such as queryString="my-search-param".');return r??null}({queryString:n,groupId:r});return[(0,o.aZ)(a),(0,t.useCallback)((e=>{if(!a)return;const n=new URLSearchParams(s.location.search);n.set(a,e),s.replace({...s.location,search:n.toString()})}),[a,s])]}function g(e){const{defaultValue:n,queryString:r=!1,groupId:s}=e,a=h(e),[l,o]=(0,t.useState)((()=>function(e){let{defaultValue:n,tabValues:r}=e;if(0===r.length)throw new Error("Docusaurus error: the <Tabs> component requires at least one <TabItem> children component");if(n){if(!f({value:n,tabValues:r}))throw new Error(`Docusaurus error: The <Tabs> has a defaultValue "${n}" but none of its children has the corresponding value. Available values are: ${r.map((e=>e.value)).join(", ")}. If you intend to show no default tab, use defaultValue={null} instead.`);return n}const t=r.find((e=>e.default))??r[0];if(!t)throw new Error("Unexpected error: 0 tabValues");return t.value}({defaultValue:n,tabValues:a}))),[c,d]=p({queryString:r,groupId:s}),[g,j]=function(e){let{groupId:n}=e;const r=function(e){return e?`docusaurus.tab.${e}`:null}(n),[s,a]=(0,u.Dv)(r);return[s,(0,t.useCallback)((e=>{r&&a.set(e)}),[r,a])]}({groupId:s}),m=(()=>{const e=c??g;return f({value:e,tabValues:a})?e:null})();(0,i.A)((()=>{m&&o(m)}),[m]);return{selectedValue:l,selectValue:(0,t.useCallback)((e=>{if(!f({value:e,tabValues:a}))throw new Error(`Can't select invalid tab value=${e}`);o(e),d(e),j(e)}),[d,j,a]),tabValues:a}}var j=r(2303);const m={tabList:"tabList__CuJ",tabItem:"tabItem_LNqP"};var v=r(4848);function x(e){let{className:n,block:r,selectedValue:t,selectValue:l,tabValues:i}=e;const o=[],{blockElementScrollPositionUntilNextRender:c}=(0,a.a_)(),u=e=>{const n=e.currentTarget,r=o.indexOf(n),s=i[r].value;s!==t&&(c(n),l(s))},d=e=>{let n=null;switch(e.key){case"Enter":u(e);break;case"ArrowRight":{const r=o.indexOf(e.currentTarget)+1;n=o[r]??o[0];break}case"ArrowLeft":{const r=o.indexOf(e.currentTarget)-1;n=o[r]??o[o.length-1];break}}n?.focus()};return(0,v.jsx)("ul",{role:"tablist","aria-orientation":"horizontal",className:(0,s.A)("tabs",{"tabs--block":r},n),children:i.map((e=>{let{value:n,label:r,attributes:a}=e;return(0,v.jsx)("li",{role:"tab",tabIndex:t===n?0:-1,"aria-selected":t===n,ref:e=>o.push(e),onKeyDown:d,onClick:u,...a,className:(0,s.A)("tabs__item",m.tabItem,a?.className,{"tabs__item--active":t===n}),children:r??n},n)}))})}function b(e){let{lazy:n,children:r,selectedValue:a}=e;const l=(Array.isArray(r)?r:[r]).filter(Boolean);if(n){const e=l.find((e=>e.props.value===a));return e?(0,t.cloneElement)(e,{className:(0,s.A)("margin-top--md",e.props.className)}):null}return(0,v.jsx)("div",{className:"margin-top--md",children:l.map(((e,n)=>(0,t.cloneElement)(e,{key:n,hidden:e.props.value!==a})))})}function w(e){const n=g(e);return(0,v.jsxs)("div",{className:(0,s.A)("tabs-container",m.tabList),children:[(0,v.jsx)(x,{...n,...e}),(0,v.jsx)(b,{...n,...e})]})}function R(e){const n=(0,j.A)();return(0,v.jsx)(w,{...e,children:d(e.children)},String(n))}},8453:(e,n,r)=>{r.d(n,{R:()=>l,x:()=>i});var t=r(6540);const s={},a=t.createContext(s);function l(e){const n=t.useContext(a);return t.useMemo((function(){return"function"==typeof e?e(n):{...n,...e}}),[n,e])}function i(e){let n;return n=e.disableParentContext?"function"==typeof e.components?e.components(s):e.components||s:l(e.components),t.createElement(a.Provider,{value:n},e.children)}}}]);