"use strict";(self.webpackChunklh_site=self.webpackChunklh_site||[]).push([[4723],{546:(e,n,t)=>{t.r(n),t.d(n,{assets:()=>c,contentTitle:()=>o,default:()=>p,frontMatter:()=>s,metadata:()=>d,toc:()=>u});var r=t(4848),a=t(8453),l=t(1470),i=t(9365);const s={},o="Interrupts",d={id:"developer-guide/wfspec-development/interrupts",title:"Interrupts",description:"As per the Concepts Docs, you can set up a ThreadSpec such that when an ExternalEvent of a certain type comes in, the ThreadRun is interrupted and an Interrupt Handler ThreadRun is spawned.",source:"@site/docs/05-developer-guide/08-wfspec-development/05-interrupts.md",sourceDirName:"05-developer-guide/08-wfspec-development",slug:"/developer-guide/wfspec-development/interrupts",permalink:"/docs/developer-guide/wfspec-development/interrupts",draft:!1,unlisted:!1,tags:[],version:"current",sidebarPosition:5,frontMatter:{},sidebar:"tutorialSidebar",previous:{title:"External Events",permalink:"/docs/developer-guide/wfspec-development/external-events"},next:{title:"Exception Handling",permalink:"/docs/developer-guide/wfspec-development/exception-handling"}},c={},u=[{value:"Example",id:"example",level:2},{value:"Variable Scoping",id:"variable-scoping",level:3},{value:"Accessing the Event Content",id:"accessing-the-event-content",level:3},{value:"Putting it Together",id:"putting-it-together",level:3},{value:"How to trigger an Interrupt event",id:"how-to-trigger-an-interrupt-event",level:2},{value:"Notes and Best Practices",id:"notes-and-best-practices",level:2}];function h(e){const n={a:"a",admonition:"admonition",code:"code",h1:"h1",h2:"h2",h3:"h3",li:"li",ol:"ol",p:"p",pre:"pre",...(0,a.R)(),...e.components};return(0,r.jsxs)(r.Fragment,{children:[(0,r.jsx)(n.h1,{id:"interrupts",children:"Interrupts"}),"\n",(0,r.jsxs)(n.p,{children:["As per the ",(0,r.jsx)(n.a,{href:"/docs/concepts/external-events#interrupts",children:"Concepts Docs"}),", you can set up a ",(0,r.jsx)(n.code,{children:"ThreadSpec"})," such that when an ",(0,r.jsx)(n.code,{children:"ExternalEvent"})," of a certain type comes in, the ",(0,r.jsx)(n.code,{children:"ThreadRun"})," is interrupted and an Interrupt Handler ",(0,r.jsx)(n.code,{children:"ThreadRun"})," is spawned."]}),"\n",(0,r.jsxs)(n.p,{children:["To do so, you can use ",(0,r.jsx)(n.code,{children:"WorkflowThread#handleInterrupt()"}),". There are two required arguments:"]}),"\n",(0,r.jsxs)(n.ol,{children:["\n",(0,r.jsxs)(n.li,{children:["The name of the ",(0,r.jsx)(n.code,{children:"ExternalEventDef"}),"."]}),"\n",(0,r.jsxs)(n.li,{children:["A lambda function, interface, or ",(0,r.jsx)(n.code,{children:"ThreadFunc"})," defining the handler thread (generally, this is a lambda function)."]}),"\n"]}),"\n",(0,r.jsxs)(n.p,{children:["Note that when a ",(0,r.jsx)(n.code,{children:"ThreadRun"})," is Interrupted, it must first halt. A ",(0,r.jsx)(n.code,{children:"ThreadRun"})," is not considered ",(0,r.jsx)(n.code,{children:"HALTED"})," until all of its Children are ",(0,r.jsx)(n.code,{children:"HALTED"})," as well. Therefore, interrupting a ",(0,r.jsx)(n.code,{children:"ThreadRun"})," causes all of the Children of the Interrupted ",(0,r.jsx)(n.code,{children:"ThreadRun"})," to halt as well."]}),"\n",(0,r.jsx)(n.h2,{id:"example",children:"Example"}),"\n",(0,r.jsxs)(n.p,{children:["In this example, we have a ",(0,r.jsx)(n.code,{children:"WfSpec"})," that defines a long-running ",(0,r.jsx)(n.code,{children:"WfRun"})," that uses an email address (stored as a ",(0,r.jsx)(n.code,{children:"WfRunVariable"}),") to communicate with a customer."]}),"\n",(0,r.jsxs)(n.p,{children:["What if the customer changes their contact info? Let's define an ",(0,r.jsx)(n.code,{children:"ExternalEventDef"})," named ",(0,r.jsx)(n.code,{children:"email-update"})," whose content is a ",(0,r.jsx)(n.code,{children:"STR"})," value with the new email address. We will use that ",(0,r.jsx)(n.code,{children:"ExternalEventDef"})," and an Interrupt to update the ",(0,r.jsx)(n.code,{children:"Variable"})," used to contact the customer."]}),"\n",(0,r.jsx)(n.h3,{id:"variable-scoping",children:"Variable Scoping"}),"\n",(0,r.jsxs)(n.p,{children:["Recall that the interrupt handler is a Child ",(0,r.jsx)(n.code,{children:"ThreadRun"})," of the Interrupted ",(0,r.jsx)(n.code,{children:"ThreadRun"}),", which means that it has read and write access to the Interrupted thread's ",(0,r.jsx)(n.code,{children:"Variable"}),"s."]}),"\n",(0,r.jsx)(n.h3,{id:"accessing-the-event-content",children:"Accessing the Event Content"}),"\n",(0,r.jsxs)(n.p,{children:[(0,r.jsx)(n.code,{children:"ExternalEvent"}),"s have a payload. When you create your Handler ",(0,r.jsx)(n.code,{children:"ThreadSpec"}),", you can access that content by creating a ",(0,r.jsx)(n.code,{children:"WfRunVariable"})," with the name ",(0,r.jsx)(n.code,{children:'"INPUT"'}),". For example, if the payload of your ",(0,r.jsx)(n.code,{children:"ExternalEvent"})," will be a ",(0,r.jsx)(n.code,{children:"JSON_OBJ"}),", you would do:"]}),"\n","\n",(0,r.jsxs)(l.A,{children:[(0,r.jsx)(i.A,{value:"java",label:"Java",default:!0,children:(0,r.jsx)(n.pre,{children:(0,r.jsx)(n.code,{className:"language-java",children:"thread.addVariable(WorkflowThread.HANDLER_INPUT, VariableType.JSON_OBJ);\n"})})}),(0,r.jsx)(i.A,{value:"go",label:"Go",children:(0,r.jsx)(n.pre,{children:(0,r.jsx)(n.code,{className:"language-go",children:'thread.AddVariable("INPUT", model.VariableType_JSON_OBJ)\n'})})}),(0,r.jsx)(i.A,{value:"python",label:"Python",children:(0,r.jsx)(n.pre,{children:(0,r.jsx)(n.code,{className:"language-python",children:'thread.add_variable("INPUT",VariableType.JSON_OBJ)\n'})})})]}),"\n",(0,r.jsx)(n.h3,{id:"putting-it-together",children:"Putting it Together"}),"\n",(0,r.jsx)(n.p,{children:"Here's a complete example:"}),"\n",(0,r.jsxs)(l.A,{children:[(0,r.jsx)(i.A,{value:"java",label:"Java",default:!0,children:(0,r.jsx)(n.pre,{children:(0,r.jsx)(n.code,{className:"language-java",children:'public void threadFunction(WorkflowThread thread) {\n\n    // The Variable used to keep track of email in the parent thread.\n    WfRunVariable email = thread.addVariable("customer-email", VariableType.STR);\n\n    // Register the Interrupt Handler\n    thread.registerInterruptHandler(\n        "email-update",\n        handler -> {\n            // Store the content of the event\n            WfRunVariable eventContent = thread.addVariable(\n                WorkflowThread.HANDLER_INPUT_VAR,\n                VariableType.STR\n            );\n\n            // Mutate the variable\n            handler.mutate(email, VariableMutationType.ASSIGN, eventContent);\n        }\n    )\n\n    // Omitted: your long-running business logic that uses the `customer-email` variable\n}\n'})})}),(0,r.jsx)(i.A,{value:"go",label:"Go",children:(0,r.jsx)(n.pre,{children:(0,r.jsx)(n.code,{className:"language-go",children:'func threadFunction(thread *wflib.WorkflowThread) {\n\n    // The Variable used to keep track of email in the parent thread.\n    email := thread.AddVariable("customer-email", model.VariableType_STR)\n\n    // Register the Interrupt Handler\n    thread.HandleInterrupt(\n        "email-update",\n        func (handler *wflib.WorkflowThread) {\n            // Store the content of the event\n            eventContent := handler.AddVariable(\n                "INPUT", // the special name to get interrupt trigger\n                model.VariableType_STR,\n            )\n\n            // Mutate the variable\n            handler.Mutate(email, model.VariableMutationType_ASSIGN, eventContent)\n        },\n    )\n\n    // Omitted: your long-running business logic that uses the `customer-email` variable\n}\n'})})}),(0,r.jsx)(i.A,{value:"python",label:"Python",children:(0,r.jsx)(n.pre,{children:(0,r.jsx)(n.code,{className:"language-python",children:'def my_interrupt_handler(handler: WorkflowThread) -> None:\n    # Get variable from parent thread\n    email = handler.find_variable("customer-email")\n\n    # Store the content of the event\n    event_content = handler.add_variable("INPUT", VariableType.STR)\n\n    # Mutate the variable\n    handler.mutate(email, VariableMutationType.ASSIGN, event_content)\n\ndef my_entrypoint(wf: WorkflowThread) -> None:\n    # The Variable used to keep track of email in the parent thread.\n    thread.add_variable("customer-email", VariableType.STR)\n\n    # Register the Interrupt Handler\n    wf.add_interrupt_handler("email-update", my_interrupt_handler)\n'})})})]}),"\n",(0,r.jsx)(n.h2,{id:"how-to-trigger-an-interrupt-event",children:"How to trigger an Interrupt event"}),"\n",(0,r.jsxs)(n.p,{children:["Please refer to: ",(0,r.jsx)(n.a,{href:"/docs/developer-guide/grpc/posting-external-events",children:"Posting External Events"}),"."]}),"\n",(0,r.jsx)(n.h2,{id:"notes-and-best-practices",children:"Notes and Best Practices"}),"\n",(0,r.jsxs)(n.p,{children:["First, only one ",(0,r.jsx)(n.code,{children:"ThreadSpec"})," may register an Interrupt Handler for a given ",(0,r.jsx)(n.code,{children:"ExternalEventDef"}),"."]}),"\n",(0,r.jsxs)(n.p,{children:["Additionally, note (as per the ",(0,r.jsx)(n.a,{href:"/docs/concepts/external-events#interrupts",children:"Concept Docs"}),") that the Interrupt Handler Thread is a Child of the Interrupted ",(0,r.jsx)(n.code,{children:"ThreadRun"}),". This is a very useful feature, as it means that the Interrupt Handler ",(0,r.jsx)(n.a,{href:"/docs/concepts/workflows#variable-scoping",children:"may modify"})," the variables of the interrupted thread."]}),"\n",(0,r.jsx)(n.admonition,{type:"note",children:(0,r.jsxs)(n.p,{children:["If you use an ",(0,r.jsx)(n.code,{children:"ExternalEventDef"})," as a trigger for an Interrupt, you cannot reuse that ",(0,r.jsx)(n.code,{children:"ExternalEventDef"})," for a ",(0,r.jsxs)(n.a,{href:"/docs/developer-guide/wfspec-development/external-events",children:["wait for ",(0,r.jsx)(n.code,{children:"ExternalEvent"})]})," node."]})})]})}function p(e={}){const{wrapper:n}={...(0,a.R)(),...e.components};return n?(0,r.jsx)(n,{...e,children:(0,r.jsx)(h,{...e})}):h(e)}},9365:(e,n,t)=>{t.d(n,{A:()=>i});t(6540);var r=t(8215);const a={tabItem:"tabItem_Ymn6"};var l=t(4848);function i(e){let{children:n,hidden:t,className:i}=e;return(0,l.jsx)("div",{role:"tabpanel",className:(0,r.A)(a.tabItem,i),hidden:t,children:n})}},1470:(e,n,t)=>{t.d(n,{A:()=>y});var r=t(6540),a=t(8215),l=t(3104),i=t(6347),s=t(205),o=t(7485),d=t(1682),c=t(9466);function u(e){return r.Children.toArray(e).filter((e=>"\n"!==e)).map((e=>{if(!e||(0,r.isValidElement)(e)&&function(e){const{props:n}=e;return!!n&&"object"==typeof n&&"value"in n}(e))return e;throw new Error(`Docusaurus error: Bad <Tabs> child <${"string"==typeof e.type?e.type:e.type.name}>: all children of the <Tabs> component should be <TabItem>, and every <TabItem> should have a unique "value" prop.`)}))?.filter(Boolean)??[]}function h(e){const{values:n,children:t}=e;return(0,r.useMemo)((()=>{const e=n??function(e){return u(e).map((e=>{let{props:{value:n,label:t,attributes:r,default:a}}=e;return{value:n,label:t,attributes:r,default:a}}))}(t);return function(e){const n=(0,d.X)(e,((e,n)=>e.value===n.value));if(n.length>0)throw new Error(`Docusaurus error: Duplicate values "${n.map((e=>e.value)).join(", ")}" found in <Tabs>. Every value needs to be unique.`)}(e),e}),[n,t])}function p(e){let{value:n,tabValues:t}=e;return t.some((e=>e.value===n))}function f(e){let{queryString:n=!1,groupId:t}=e;const a=(0,i.W6)(),l=function(e){let{queryString:n=!1,groupId:t}=e;if("string"==typeof n)return n;if(!1===n)return null;if(!0===n&&!t)throw new Error('Docusaurus error: The <Tabs> component groupId prop is required if queryString=true, because this value is used as the search param name. You can also provide an explicit value such as queryString="my-search-param".');return t??null}({queryString:n,groupId:t});return[(0,o.aZ)(l),(0,r.useCallback)((e=>{if(!l)return;const n=new URLSearchParams(a.location.search);n.set(l,e),a.replace({...a.location,search:n.toString()})}),[l,a])]}function m(e){const{defaultValue:n,queryString:t=!1,groupId:a}=e,l=h(e),[i,o]=(0,r.useState)((()=>function(e){let{defaultValue:n,tabValues:t}=e;if(0===t.length)throw new Error("Docusaurus error: the <Tabs> component requires at least one <TabItem> children component");if(n){if(!p({value:n,tabValues:t}))throw new Error(`Docusaurus error: The <Tabs> has a defaultValue "${n}" but none of its children has the corresponding value. Available values are: ${t.map((e=>e.value)).join(", ")}. If you intend to show no default tab, use defaultValue={null} instead.`);return n}const r=t.find((e=>e.default))??t[0];if(!r)throw new Error("Unexpected error: 0 tabValues");return r.value}({defaultValue:n,tabValues:l}))),[d,u]=f({queryString:t,groupId:a}),[m,v]=function(e){let{groupId:n}=e;const t=function(e){return e?`docusaurus.tab.${e}`:null}(n),[a,l]=(0,c.Dv)(t);return[a,(0,r.useCallback)((e=>{t&&l.set(e)}),[t,l])]}({groupId:a}),x=(()=>{const e=d??m;return p({value:e,tabValues:l})?e:null})();(0,s.A)((()=>{x&&o(x)}),[x]);return{selectedValue:i,selectValue:(0,r.useCallback)((e=>{if(!p({value:e,tabValues:l}))throw new Error(`Can't select invalid tab value=${e}`);o(e),u(e),v(e)}),[u,v,l]),tabValues:l}}var v=t(2303);const x={tabList:"tabList__CuJ",tabItem:"tabItem_LNqP"};var b=t(4848);function g(e){let{className:n,block:t,selectedValue:r,selectValue:i,tabValues:s}=e;const o=[],{blockElementScrollPositionUntilNextRender:d}=(0,l.a_)(),c=e=>{const n=e.currentTarget,t=o.indexOf(n),a=s[t].value;a!==r&&(d(n),i(a))},u=e=>{let n=null;switch(e.key){case"Enter":c(e);break;case"ArrowRight":{const t=o.indexOf(e.currentTarget)+1;n=o[t]??o[0];break}case"ArrowLeft":{const t=o.indexOf(e.currentTarget)-1;n=o[t]??o[o.length-1];break}}n?.focus()};return(0,b.jsx)("ul",{role:"tablist","aria-orientation":"horizontal",className:(0,a.A)("tabs",{"tabs--block":t},n),children:s.map((e=>{let{value:n,label:t,attributes:l}=e;return(0,b.jsx)("li",{role:"tab",tabIndex:r===n?0:-1,"aria-selected":r===n,ref:e=>o.push(e),onKeyDown:u,onClick:c,...l,className:(0,a.A)("tabs__item",x.tabItem,l?.className,{"tabs__item--active":r===n}),children:t??n},n)}))})}function j(e){let{lazy:n,children:t,selectedValue:a}=e;const l=(Array.isArray(t)?t:[t]).filter(Boolean);if(n){const e=l.find((e=>e.props.value===a));return e?(0,r.cloneElement)(e,{className:"margin-top--md"}):null}return(0,b.jsx)("div",{className:"margin-top--md",children:l.map(((e,n)=>(0,r.cloneElement)(e,{key:n,hidden:e.props.value!==a})))})}function T(e){const n=m(e);return(0,b.jsxs)("div",{className:(0,a.A)("tabs-container",x.tabList),children:[(0,b.jsx)(g,{...n,...e}),(0,b.jsx)(j,{...n,...e})]})}function y(e){const n=(0,v.A)();return(0,b.jsx)(T,{...e,children:u(e.children)},String(n))}},8453:(e,n,t)=>{t.d(n,{R:()=>i,x:()=>s});var r=t(6540);const a={},l=r.createContext(a);function i(e){const n=r.useContext(l);return r.useMemo((function(){return"function"==typeof e?e(n):{...n,...e}}),[n,e])}function s(e){let n;return n=e.disableParentContext?"function"==typeof e.components?e.components(a):e.components||a:i(e.components),r.createElement(l.Provider,{value:n},e.children)}}}]);