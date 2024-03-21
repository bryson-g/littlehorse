"use strict";(self.webpackChunklh_site=self.webpackChunklh_site||[]).push([[1971],{3905:(e,n,t)=>{t.d(n,{Zo:()=>d,kt:()=>m});var a=t(7294);function r(e,n,t){return n in e?Object.defineProperty(e,n,{value:t,enumerable:!0,configurable:!0,writable:!0}):e[n]=t,e}function l(e,n){var t=Object.keys(e);if(Object.getOwnPropertySymbols){var a=Object.getOwnPropertySymbols(e);n&&(a=a.filter((function(n){return Object.getOwnPropertyDescriptor(e,n).enumerable}))),t.push.apply(t,a)}return t}function o(e){for(var n=1;n<arguments.length;n++){var t=null!=arguments[n]?arguments[n]:{};n%2?l(Object(t),!0).forEach((function(n){r(e,n,t[n])})):Object.getOwnPropertyDescriptors?Object.defineProperties(e,Object.getOwnPropertyDescriptors(t)):l(Object(t)).forEach((function(n){Object.defineProperty(e,n,Object.getOwnPropertyDescriptor(t,n))}))}return e}function i(e,n){if(null==e)return{};var t,a,r=function(e,n){if(null==e)return{};var t,a,r={},l=Object.keys(e);for(a=0;a<l.length;a++)t=l[a],n.indexOf(t)>=0||(r[t]=e[t]);return r}(e,n);if(Object.getOwnPropertySymbols){var l=Object.getOwnPropertySymbols(e);for(a=0;a<l.length;a++)t=l[a],n.indexOf(t)>=0||Object.prototype.propertyIsEnumerable.call(e,t)&&(r[t]=e[t])}return r}var s=a.createContext({}),u=function(e){var n=a.useContext(s),t=n;return e&&(t="function"==typeof e?e(n):o(o({},n),e)),t},d=function(e){var n=u(e.components);return a.createElement(s.Provider,{value:n},e.children)},p="mdxType",h={inlineCode:"code",wrapper:function(e){var n=e.children;return a.createElement(a.Fragment,{},n)}},c=a.forwardRef((function(e,n){var t=e.components,r=e.mdxType,l=e.originalType,s=e.parentName,d=i(e,["components","mdxType","originalType","parentName"]),p=u(t),c=r,m=p["".concat(s,".").concat(c)]||p[c]||h[c]||l;return t?a.createElement(m,o(o({ref:n},d),{},{components:t})):a.createElement(m,o({ref:n},d))}));function m(e,n){var t=arguments,r=n&&n.mdxType;if("string"==typeof e||r){var l=t.length,o=new Array(l);o[0]=c;var i={};for(var s in n)hasOwnProperty.call(n,s)&&(i[s]=n[s]);i.originalType=e,i[p]="string"==typeof e?e:r,o[1]=i;for(var u=2;u<l;u++)o[u]=t[u];return a.createElement.apply(null,o)}return a.createElement.apply(null,t)}c.displayName="MDXCreateElement"},5162:(e,n,t)=>{t.d(n,{Z:()=>o});var a=t(7294),r=t(6010);const l={tabItem:"tabItem_Ymn6"};function o(e){let{children:n,hidden:t,className:o}=e;return a.createElement("div",{role:"tabpanel",className:(0,r.Z)(l.tabItem,o),hidden:t},n)}},4866:(e,n,t)=>{t.d(n,{Z:()=>N});var a=t(7462),r=t(7294),l=t(6010),o=t(2466),i=t(6550),s=t(1980),u=t(7392),d=t(12);function p(e){return function(e){return r.Children.map(e,(e=>{if(!e||(0,r.isValidElement)(e)&&function(e){const{props:n}=e;return!!n&&"object"==typeof n&&"value"in n}(e))return e;throw new Error(`Docusaurus error: Bad <Tabs> child <${"string"==typeof e.type?e.type:e.type.name}>: all children of the <Tabs> component should be <TabItem>, and every <TabItem> should have a unique "value" prop.`)}))?.filter(Boolean)??[]}(e).map((e=>{let{props:{value:n,label:t,attributes:a,default:r}}=e;return{value:n,label:t,attributes:a,default:r}}))}function h(e){const{values:n,children:t}=e;return(0,r.useMemo)((()=>{const e=n??p(t);return function(e){const n=(0,u.l)(e,((e,n)=>e.value===n.value));if(n.length>0)throw new Error(`Docusaurus error: Duplicate values "${n.map((e=>e.value)).join(", ")}" found in <Tabs>. Every value needs to be unique.`)}(e),e}),[n,t])}function c(e){let{value:n,tabValues:t}=e;return t.some((e=>e.value===n))}function m(e){let{queryString:n=!1,groupId:t}=e;const a=(0,i.k6)(),l=function(e){let{queryString:n=!1,groupId:t}=e;if("string"==typeof n)return n;if(!1===n)return null;if(!0===n&&!t)throw new Error('Docusaurus error: The <Tabs> component groupId prop is required if queryString=true, because this value is used as the search param name. You can also provide an explicit value such as queryString="my-search-param".');return t??null}({queryString:n,groupId:t});return[(0,s._X)(l),(0,r.useCallback)((e=>{if(!l)return;const n=new URLSearchParams(a.location.search);n.set(l,e),a.replace({...a.location,search:n.toString()})}),[l,a])]}function f(e){const{defaultValue:n,queryString:t=!1,groupId:a}=e,l=h(e),[o,i]=(0,r.useState)((()=>function(e){let{defaultValue:n,tabValues:t}=e;if(0===t.length)throw new Error("Docusaurus error: the <Tabs> component requires at least one <TabItem> children component");if(n){if(!c({value:n,tabValues:t}))throw new Error(`Docusaurus error: The <Tabs> has a defaultValue "${n}" but none of its children has the corresponding value. Available values are: ${t.map((e=>e.value)).join(", ")}. If you intend to show no default tab, use defaultValue={null} instead.`);return n}const a=t.find((e=>e.default))??t[0];if(!a)throw new Error("Unexpected error: 0 tabValues");return a.value}({defaultValue:n,tabValues:l}))),[s,u]=m({queryString:t,groupId:a}),[p,f]=function(e){let{groupId:n}=e;const t=function(e){return e?`docusaurus.tab.${e}`:null}(n),[a,l]=(0,d.Nk)(t);return[a,(0,r.useCallback)((e=>{t&&l.set(e)}),[t,l])]}({groupId:a}),k=(()=>{const e=s??p;return c({value:e,tabValues:l})?e:null})();(0,r.useLayoutEffect)((()=>{k&&i(k)}),[k]);return{selectedValue:o,selectValue:(0,r.useCallback)((e=>{if(!c({value:e,tabValues:l}))throw new Error(`Can't select invalid tab value=${e}`);i(e),u(e),f(e)}),[u,f,l]),tabValues:l}}var k=t(2389);const y={tabList:"tabList__CuJ",tabItem:"tabItem_LNqP"};function g(e){let{className:n,block:t,selectedValue:i,selectValue:s,tabValues:u}=e;const d=[],{blockElementScrollPositionUntilNextRender:p}=(0,o.o5)(),h=e=>{const n=e.currentTarget,t=d.indexOf(n),a=u[t].value;a!==i&&(p(n),s(a))},c=e=>{let n=null;switch(e.key){case"Enter":h(e);break;case"ArrowRight":{const t=d.indexOf(e.currentTarget)+1;n=d[t]??d[0];break}case"ArrowLeft":{const t=d.indexOf(e.currentTarget)-1;n=d[t]??d[d.length-1];break}}n?.focus()};return r.createElement("ul",{role:"tablist","aria-orientation":"horizontal",className:(0,l.Z)("tabs",{"tabs--block":t},n)},u.map((e=>{let{value:n,label:t,attributes:o}=e;return r.createElement("li",(0,a.Z)({role:"tab",tabIndex:i===n?0:-1,"aria-selected":i===n,key:n,ref:e=>d.push(e),onKeyDown:c,onClick:h},o,{className:(0,l.Z)("tabs__item",y.tabItem,o?.className,{"tabs__item--active":i===n})}),t??n)})))}function b(e){let{lazy:n,children:t,selectedValue:a}=e;const l=(Array.isArray(t)?t:[t]).filter(Boolean);if(n){const e=l.find((e=>e.props.value===a));return e?(0,r.cloneElement)(e,{className:"margin-top--md"}):null}return r.createElement("div",{className:"margin-top--md"},l.map(((e,n)=>(0,r.cloneElement)(e,{key:n,hidden:e.props.value!==a}))))}function w(e){const n=f(e);return r.createElement("div",{className:(0,l.Z)("tabs-container",y.tabList)},r.createElement(g,(0,a.Z)({},e,n)),r.createElement(b,(0,a.Z)({},e,n)))}function N(e){const n=(0,k.Z)();return r.createElement(w,(0,a.Z)({key:String(n)},e))}},3846:(e,n,t)=>{t.r(n),t.d(n,{assets:()=>d,contentTitle:()=>s,default:()=>m,frontMatter:()=>i,metadata:()=>u,toc:()=>p});var a=t(7462),r=(t(7294),t(3905)),l=t(4866),o=t(5162);const i={},s="Exception Handling",u={unversionedId:"developer-guide/wfspec-development/exception-handling",id:"developer-guide/wfspec-development/exception-handling",title:"Exception Handling",description:"In LittleHorse, a Failure is analogous to an Exception in Programming.",source:"@site/docs/05-developer-guide/08-wfspec-development/06-exception-handling.md",sourceDirName:"05-developer-guide/08-wfspec-development",slug:"/developer-guide/wfspec-development/exception-handling",permalink:"/docs/developer-guide/wfspec-development/exception-handling",draft:!1,tags:[],version:"current",sidebarPosition:6,frontMatter:{},sidebar:"tutorialSidebar",previous:{title:"Interrupts",permalink:"/docs/developer-guide/wfspec-development/interrupts"},next:{title:"Child Threads",permalink:"/docs/developer-guide/wfspec-development/child-threads"}},d={},p=[{value:"Handling a Failure.",id:"handling-a-failure",level:2},{value:"Throwing an <code>EXCEPTION</code>",id:"throwing-an-exception",level:3},{value:"Handling Exceptions",id:"handling-exceptions",level:3},{value:"Handling Errors",id:"handling-errors",level:3}],h={toc:p},c="wrapper";function m(e){let{components:n,...t}=e;return(0,r.kt)(c,(0,a.Z)({},h,t,{components:n,mdxType:"MDXLayout"}),(0,r.kt)("h1",{id:"exception-handling"},"Exception Handling"),(0,r.kt)("p",null,"In LittleHorse, a ",(0,r.kt)("inlineCode",{parentName:"p"},"Failure")," is analogous to an ",(0,r.kt)("inlineCode",{parentName:"p"},"Exception")," in Programming."),(0,r.kt)("h2",{id:"handling-a-failure"},"Handling a Failure."),(0,r.kt)("p",null,"In LittleHorse, there are two different types of Failures:"),(0,r.kt)("ul",null,(0,r.kt)("li",{parentName:"ul"},(0,r.kt)("inlineCode",{parentName:"li"},"EXCEPTION"),", which denotes something that went wrong at the business-process level (eg. an executive rejected a transaction)."),(0,r.kt)("li",{parentName:"ul"},(0,r.kt)("inlineCode",{parentName:"li"},"ERROR"),", which denotes a technical failure, such as a third-party API being unavailable due to a network partition.")),(0,r.kt)("p",null,"The ",(0,r.kt)("inlineCode",{parentName:"p"},"WorkflowThread")," has three methods to allow you to handle various types of Failures:"),(0,r.kt)("ol",null,(0,r.kt)("li",{parentName:"ol"},(0,r.kt)("inlineCode",{parentName:"li"},"handleException()"),", which handles ",(0,r.kt)("inlineCode",{parentName:"li"},"EXCEPTION")," business failures."),(0,r.kt)("li",{parentName:"ol"},(0,r.kt)("inlineCode",{parentName:"li"},"handleError()"),", which handles ",(0,r.kt)("inlineCode",{parentName:"li"},"ERROR")," technical failures."),(0,r.kt)("li",{parentName:"ol"},(0,r.kt)("inlineCode",{parentName:"li"},"handleAnyFailure()"),", which catches any failure of any type.")),(0,r.kt)("p",null,"All three methods require a ",(0,r.kt)("inlineCode",{parentName:"p"},"NodeOutput")," for the ",(0,r.kt)("inlineCode",{parentName:"p"},"Node")," on which to add the ",(0,r.kt)("inlineCode",{parentName:"p"},"failureHandler")," (see the ",(0,r.kt)("a",{parentName:"p",href:"/docs/concepts/exception-handling"},"Concept Docs"),"). Additionally, all three methods require a ",(0,r.kt)("inlineCode",{parentName:"p"},"ThreadFunc")," which defines the logic for the Failure Handler (either a lambda or a function pointer)."),(0,r.kt)("p",null,"The syntax to handle a ",(0,r.kt)("inlineCode",{parentName:"p"},"Failure")," is similar no matter which type of ",(0,r.kt)("inlineCode",{parentName:"p"},"Node")," you are handling a failure for."),(0,r.kt)("h3",{id:"throwing-an-exception"},"Throwing an ",(0,r.kt)("inlineCode",{parentName:"h3"},"EXCEPTION")),(0,r.kt)("admonition",{type:"info"},(0,r.kt)("p",{parentName:"admonition"},"This section is concerned with throwing an ",(0,r.kt)("inlineCode",{parentName:"p"},"EXCEPTION")," at the ",(0,r.kt)("inlineCode",{parentName:"p"},"ThreadSpec")," level inside a ",(0,r.kt)("inlineCode",{parentName:"p"},"WfSpec"),". If you want to throw an ",(0,r.kt)("inlineCode",{parentName:"p"},"EXCEPTION")," at the Task Worker level, please refer to the ",(0,r.kt)("a",{parentName:"p",href:"/docs/developer-guide/task-worker-development#throwing-workflow-exceptions"},"Task Worker Development Docs"))),(0,r.kt)("p",null,"In programming languages such as Java and Python (please, let's not mention Go...I have opinions about Go but it's best I don't discuss it), you can ",(0,r.kt)("inlineCode",{parentName:"p"},"throw")," or ",(0,r.kt)("inlineCode",{parentName:"p"},"raise")," an ",(0,r.kt)("inlineCode",{parentName:"p"},"Exception"),". For example:"),(0,r.kt)("pre",null,(0,r.kt)("code",{parentName:"pre",className:"language-python"},'class MyError(Exception):\n    def __init__(self, foo: str):\n        self._foo = foo\n\nif something_bad_happens():\n   raise MyError("bar")\n\ndo_something_else()\n')),(0,r.kt)("p",null,"Raising a ",(0,r.kt)("inlineCode",{parentName:"p"},"MyError")," here interrupts the flow of the program and prevents ",(0,r.kt)("inlineCode",{parentName:"p"},"do_something_else()")," from being called. Similarly, throwing an ",(0,r.kt)("inlineCode",{parentName:"p"},"EXCEPTION")," in LittleHorse can stop the flow of the ",(0,r.kt)("inlineCode",{parentName:"p"},"ThreadRun"),"."),(0,r.kt)("admonition",{type:"info"},(0,r.kt)("p",{parentName:"admonition"},"Even though GoLang itself highly stupidly doesn't allow you to interrupt program execution with exceptions, you can still use the Go SDK to define a ",(0,r.kt)("inlineCode",{parentName:"p"},"WfSpec")," that throws a LittleHorse ",(0,r.kt)("inlineCode",{parentName:"p"},"EXCEPTION"),".")),(0,r.kt)("p",null,"Let's throw an ",(0,r.kt)("inlineCode",{parentName:"p"},"EXCEPTION")," with the name ",(0,r.kt)("inlineCode",{parentName:"p"},"payment-failed"),". To do this, we will need the ",(0,r.kt)("inlineCode",{parentName:"p"},"WorkflowThread#fail()")," method, which takes two arguments:"),(0,r.kt)("ol",null,(0,r.kt)("li",{parentName:"ol"},"The name of the exception to throw."),(0,r.kt)("li",{parentName:"ol"},"A human readable error message which will show up on the ",(0,r.kt)("inlineCode",{parentName:"li"},"WfRun"),".")),(0,r.kt)("p",null,"Note that you can optionally specify a third argument, which is either a ",(0,r.kt)("inlineCode",{parentName:"p"},"WfRunVariable")," or some literal value that represents the ",(0,r.kt)("em",{parentName:"p"},"content")," of the Exception we throw. In future versions of LittleHorse, you will be able to access this value as an input variable in the Exception Handler ",(0,r.kt)("inlineCode",{parentName:"p"},"ThreadRun"),"."),(0,r.kt)(l.Z,{mdxType:"Tabs"},(0,r.kt)(o.Z,{value:"java",label:"Java",default:!0,mdxType:"TabItem"},(0,r.kt)("pre",null,(0,r.kt)("code",{parentName:"pre",className:"language-java"},'// Throw a normal exception\nwf.fail("payment-failed", "This is a human readable error message for developers");\n\n// Throw an exception with content\nWfRunVariable exnContent = ...;\nwf.fail("payment-failed", "This is a human readable error message for developers", exnContent);\n'))),(0,r.kt)(o.Z,{value:"go",label:"Go",mdxType:"TabItem"},(0,r.kt)("pre",null,(0,r.kt)("code",{parentName:"pre",className:"language-go"},'wf.Fail(nil, "payment-failed", "This is a human readable error message for developers")\n\n// Fail with output.\nvar exnContent *model.WfRunVariable\n// ...\nwf.Fail(exnContent, "payment-failed", "This is a human readable error message for developers")\n'))),(0,r.kt)(o.Z,{value:"python",label:"Python",default:!0,mdxType:"TabItem"},(0,r.kt)("pre",null,(0,r.kt)("code",{parentName:"pre",className:"language-python"},'wf.fail("payment-failed", "This is a human readable error message for developers")\n')))),(0,r.kt)("admonition",{type:"tip"},(0,r.kt)("p",{parentName:"admonition"},"Like many things in LittleHorse, a user-defined ",(0,r.kt)("inlineCode",{parentName:"p"},"EXCEPTION")," must be in ",(0,r.kt)("inlineCode",{parentName:"p"},"sub-domain-case"),". For those of you who love Kubernetes, this is the same regex used by K8s resource names.")),(0,r.kt)("h3",{id:"handling-exceptions"},"Handling Exceptions"),(0,r.kt)("p",null,"Let's handle a business failure with the ",(0,r.kt)("inlineCode",{parentName:"p"},"WorkflowThread#handleException")," method. You need to provide:"),(0,r.kt)("ol",null,(0,r.kt)("li",{parentName:"ol"},"The ",(0,r.kt)("inlineCode",{parentName:"li"},"NodeOutput")," to handle the failure on."),(0,r.kt)("li",{parentName:"ol"},"A ",(0,r.kt)("inlineCode",{parentName:"li"},"ThreadFunc")," (function pointer or lambda) to execute as the exception handler.")),(0,r.kt)("p",null,"You can optionally provide the name of a specific ",(0,r.kt)("inlineCode",{parentName:"p"},"EXCEPTION")," to handle. If that is not provided, it will handle any business ",(0,r.kt)("inlineCode",{parentName:"p"},"EXCEPTION")," (but not a technical failure)."),(0,r.kt)("p",null,"In this example, we will handle an ",(0,r.kt)("inlineCode",{parentName:"p"},"EXCEPTION")," thrown by a Child ",(0,r.kt)("inlineCode",{parentName:"p"},"ThreadRun"),". We catch the exception from the ",(0,r.kt)("inlineCode",{parentName:"p"},"waitForTheads()")," call."),(0,r.kt)("admonition",{type:"tip"},(0,r.kt)("p",{parentName:"admonition"},"You'll notice that we have two Failure Handlers defined in the example below. The way this behaves in practice is that the ",(0,r.kt)("em",{parentName:"p"},"first matching handler")," is executed. This is useful to allow you to handle different business exceptions with different exception handlers.")),(0,r.kt)(l.Z,{mdxType:"Tabs"},(0,r.kt)(o.Z,{value:"java",label:"Java",default:!0,mdxType:"TabItem"},(0,r.kt)("pre",null,(0,r.kt)("code",{parentName:"pre",className:"language-java"},'// ...\nNodeOutput threadsResult = thread.waitForThreads(...);\n\nthread.handleException(\n    threadsResult,\n    "my-exn", // handle only \'my-exn\'\n    handler -> {\n        handler.execute("some-failure-handler-for-my-exn");\n    }\n);\n\nthread.handleException(\n    threadsResult,\n    null, // handle any business exception\n    handler -> {\n        handler.execute("some-other-task-in-failure-handler");\n    }\n);\n\n// We get here unless the Failure Handler fails.\nthread.execute("another-task");\n'))),(0,r.kt)(o.Z,{value:"go",label:"Go",mdxType:"TabItem"},(0,r.kt)("pre",null,(0,r.kt)("code",{parentName:"pre",className:"language-go"},'threadsResult := thread.WaitForThreads(...)\n\nexnName := "my-exn"\nthread.HandleException(\n    &threadsResult,\n    &exnName, // handle specific exception\n    func(handler *wflib.WorkflowThread) {\n        handler.Execute("some-task-in-my-exn-handler")\n    },\n)\n\nthread.HandleException(\n    &taskOutput,\n    &nil, // handle any exception\n    func(handler *wflib.WorkflowThread) {\n        handler.Execute("some-other-task-in-failure-handler")\n    },\n)\n\n// We will always get here unless the Failure Handler fails.\nthread.Execute("another-task");\n'))),(0,r.kt)(o.Z,{value:"python",label:"Python",mdxType:"TabItem"},(0,r.kt)("pre",null,(0,r.kt)("code",{parentName:"pre",className:"language-python"},'def entrypoint(wf: WorkflowThread) -> None:\n    def my_exn_handler(handler: WorkflowThread) -> None:\n        handler.execute("some-task-in-my-exn-handler")\n\n    def any_exn_handler(handler: WorkflowThread) -> None:\n        handler.execute("some-other-task-in-failure-handler")\n\n    threads_result = wf.wait_for_threads(...)\n    wf.handle_exception(output, my_exn_handler, exn_name="my-exn")\n    wf.handle_exception(output, any_exn_handler, exn_name=None)\n\n    # We will always get here unless the Failure Handler fails.\n    wf.execute("another-task")\n')))),(0,r.kt)("h3",{id:"handling-errors"},"Handling Errors"),(0,r.kt)("p",null,"Let's handle a technical failure with the ",(0,r.kt)("inlineCode",{parentName:"p"},"WorkflowThread#handleError")," method. Just as with ",(0,r.kt)("inlineCode",{parentName:"p"},"handleException()"),", you need to provide:"),(0,r.kt)("ol",null,(0,r.kt)("li",{parentName:"ol"},"The ",(0,r.kt)("inlineCode",{parentName:"li"},"NodeOutput")," to handle the failure on."),(0,r.kt)("li",{parentName:"ol"},"A ",(0,r.kt)("inlineCode",{parentName:"li"},"ThreadFunc")," (function pointer or lambda) to execute as the exception handler.")),(0,r.kt)("p",null,"You can optionally provide the name of a specific ",(0,r.kt)("inlineCode",{parentName:"p"},"ERROR")," to handle. If that is not provided, it will handle any technical ",(0,r.kt)("inlineCode",{parentName:"p"},"ERROR")," (but not a business ",(0,r.kt)("inlineCode",{parentName:"p"},"EXCEPTION"),")."),(0,r.kt)("p",null,"In this example, we will handle a ",(0,r.kt)("inlineCode",{parentName:"p"},"TIMEOUT")," error from a ",(0,r.kt)("inlineCode",{parentName:"p"},"TaskRun"),"."),(0,r.kt)(l.Z,{mdxType:"Tabs"},(0,r.kt)(o.Z,{value:"java",label:"Java",default:!0,mdxType:"TabItem"},(0,r.kt)("pre",null,(0,r.kt)("code",{parentName:"pre",className:"language-java"},'NodeOutput taskOutput = thread.execute("flaky-task");\n\nthread.handleError(\n    taskOutput,\n    "TIMEOUT", // handle only TIMEOUT errors. Leave null to catch any ERROR.\n    handler -> {\n        handler.execute("some-task");\n    }\n);\n\n'))),(0,r.kt)(o.Z,{value:"go",label:"Go",mdxType:"TabItem"},(0,r.kt)("pre",null,(0,r.kt)("code",{parentName:"pre",className:"language-go"},'threadsResult := thread.WaitForThreads(...)\n\nerrorName := "TIMEOUT"\nthread.HandleError(\n    &threadsResult,\n    &errorName, // handle only TIMEOUT error. Leave nil to catch all ERROR.\n    func(handler *wflib.WorkflowThread) {\n        handler.Execute("some-task-in-my-exn-handler")\n    },\n)\n'))),(0,r.kt)(o.Z,{value:"python",label:"Python",mdxType:"TabItem"},(0,r.kt)("pre",null,(0,r.kt)("code",{parentName:"pre",className:"language-python"},'def entrypoint(wf: WorkflowThread) -> None:\n    def error_handler(handler: WorkflowThread) -> None:\n        handler.execute("some-task")\n\n    task_output = wf.wait_for_threads(...)\n    wf.handle_error(task_output, error_handler, error_type=LHErrorType.TIMEOUT)\n')))))}m.isMDXComponent=!0}}]);