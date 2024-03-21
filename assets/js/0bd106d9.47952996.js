"use strict";(self.webpackChunklh_site=self.webpackChunklh_site||[]).push([[4052],{3905:(e,n,t)=>{t.d(n,{Zo:()=>p,kt:()=>m});var a=t(7294);function o(e,n,t){return n in e?Object.defineProperty(e,n,{value:t,enumerable:!0,configurable:!0,writable:!0}):e[n]=t,e}function l(e,n){var t=Object.keys(e);if(Object.getOwnPropertySymbols){var a=Object.getOwnPropertySymbols(e);n&&(a=a.filter((function(n){return Object.getOwnPropertyDescriptor(e,n).enumerable}))),t.push.apply(t,a)}return t}function i(e){for(var n=1;n<arguments.length;n++){var t=null!=arguments[n]?arguments[n]:{};n%2?l(Object(t),!0).forEach((function(n){o(e,n,t[n])})):Object.getOwnPropertyDescriptors?Object.defineProperties(e,Object.getOwnPropertyDescriptors(t)):l(Object(t)).forEach((function(n){Object.defineProperty(e,n,Object.getOwnPropertyDescriptor(t,n))}))}return e}function r(e,n){if(null==e)return{};var t,a,o=function(e,n){if(null==e)return{};var t,a,o={},l=Object.keys(e);for(a=0;a<l.length;a++)t=l[a],n.indexOf(t)>=0||(o[t]=e[t]);return o}(e,n);if(Object.getOwnPropertySymbols){var l=Object.getOwnPropertySymbols(e);for(a=0;a<l.length;a++)t=l[a],n.indexOf(t)>=0||Object.prototype.propertyIsEnumerable.call(e,t)&&(o[t]=e[t])}return o}var d=a.createContext({}),s=function(e){var n=a.useContext(d),t=n;return e&&(t="function"==typeof e?e(n):i(i({},n),e)),t},p=function(e){var n=s(e.components);return a.createElement(d.Provider,{value:n},e.children)},u="mdxType",f={inlineCode:"code",wrapper:function(e){var n=e.children;return a.createElement(a.Fragment,{},n)}},c=a.forwardRef((function(e,n){var t=e.components,o=e.mdxType,l=e.originalType,d=e.parentName,p=r(e,["components","mdxType","originalType","parentName"]),u=s(t),c=o,m=u["".concat(d,".").concat(c)]||u[c]||f[c]||l;return t?a.createElement(m,i(i({ref:n},p),{},{components:t})):a.createElement(m,i({ref:n},p))}));function m(e,n){var t=arguments,o=n&&n.mdxType;if("string"==typeof e||o){var l=t.length,i=new Array(l);i[0]=c;var r={};for(var d in n)hasOwnProperty.call(n,d)&&(r[d]=n[d]);r.originalType=e,r[u]="string"==typeof e?e:o,i[1]=r;for(var s=2;s<l;s++)i[s]=t[s];return a.createElement.apply(null,i)}return a.createElement.apply(null,t)}c.displayName="MDXCreateElement"},5162:(e,n,t)=>{t.d(n,{Z:()=>i});var a=t(7294),o=t(6010);const l={tabItem:"tabItem_Ymn6"};function i(e){let{children:n,hidden:t,className:i}=e;return a.createElement("div",{role:"tabpanel",className:(0,o.Z)(l.tabItem,i),hidden:t},n)}},4866:(e,n,t)=>{t.d(n,{Z:()=>T});var a=t(7462),o=t(7294),l=t(6010),i=t(2466),r=t(6550),d=t(1980),s=t(7392),p=t(12);function u(e){return function(e){return o.Children.map(e,(e=>{if(!e||(0,o.isValidElement)(e)&&function(e){const{props:n}=e;return!!n&&"object"==typeof n&&"value"in n}(e))return e;throw new Error(`Docusaurus error: Bad <Tabs> child <${"string"==typeof e.type?e.type:e.type.name}>: all children of the <Tabs> component should be <TabItem>, and every <TabItem> should have a unique "value" prop.`)}))?.filter(Boolean)??[]}(e).map((e=>{let{props:{value:n,label:t,attributes:a,default:o}}=e;return{value:n,label:t,attributes:a,default:o}}))}function f(e){const{values:n,children:t}=e;return(0,o.useMemo)((()=>{const e=n??u(t);return function(e){const n=(0,s.l)(e,((e,n)=>e.value===n.value));if(n.length>0)throw new Error(`Docusaurus error: Duplicate values "${n.map((e=>e.value)).join(", ")}" found in <Tabs>. Every value needs to be unique.`)}(e),e}),[n,t])}function c(e){let{value:n,tabValues:t}=e;return t.some((e=>e.value===n))}function m(e){let{queryString:n=!1,groupId:t}=e;const a=(0,r.k6)(),l=function(e){let{queryString:n=!1,groupId:t}=e;if("string"==typeof n)return n;if(!1===n)return null;if(!0===n&&!t)throw new Error('Docusaurus error: The <Tabs> component groupId prop is required if queryString=true, because this value is used as the search param name. You can also provide an explicit value such as queryString="my-search-param".');return t??null}({queryString:n,groupId:t});return[(0,d._X)(l),(0,o.useCallback)((e=>{if(!l)return;const n=new URLSearchParams(a.location.search);n.set(l,e),a.replace({...a.location,search:n.toString()})}),[l,a])]}function k(e){const{defaultValue:n,queryString:t=!1,groupId:a}=e,l=f(e),[i,r]=(0,o.useState)((()=>function(e){let{defaultValue:n,tabValues:t}=e;if(0===t.length)throw new Error("Docusaurus error: the <Tabs> component requires at least one <TabItem> children component");if(n){if(!c({value:n,tabValues:t}))throw new Error(`Docusaurus error: The <Tabs> has a defaultValue "${n}" but none of its children has the corresponding value. Available values are: ${t.map((e=>e.value)).join(", ")}. If you intend to show no default tab, use defaultValue={null} instead.`);return n}const a=t.find((e=>e.default))??t[0];if(!a)throw new Error("Unexpected error: 0 tabValues");return a.value}({defaultValue:n,tabValues:l}))),[d,s]=m({queryString:t,groupId:a}),[u,k]=function(e){let{groupId:n}=e;const t=function(e){return e?`docusaurus.tab.${e}`:null}(n),[a,l]=(0,p.Nk)(t);return[a,(0,o.useCallback)((e=>{t&&l.set(e)}),[t,l])]}({groupId:a}),h=(()=>{const e=d??u;return c({value:e,tabValues:l})?e:null})();(0,o.useLayoutEffect)((()=>{h&&r(h)}),[h]);return{selectedValue:i,selectValue:(0,o.useCallback)((e=>{if(!c({value:e,tabValues:l}))throw new Error(`Can't select invalid tab value=${e}`);r(e),s(e),k(e)}),[s,k,l]),tabValues:l}}var h=t(2389);const b={tabList:"tabList__CuJ",tabItem:"tabItem_LNqP"};function y(e){let{className:n,block:t,selectedValue:r,selectValue:d,tabValues:s}=e;const p=[],{blockElementScrollPositionUntilNextRender:u}=(0,i.o5)(),f=e=>{const n=e.currentTarget,t=p.indexOf(n),a=s[t].value;a!==r&&(u(n),d(a))},c=e=>{let n=null;switch(e.key){case"Enter":f(e);break;case"ArrowRight":{const t=p.indexOf(e.currentTarget)+1;n=p[t]??p[0];break}case"ArrowLeft":{const t=p.indexOf(e.currentTarget)-1;n=p[t]??p[p.length-1];break}}n?.focus()};return o.createElement("ul",{role:"tablist","aria-orientation":"horizontal",className:(0,l.Z)("tabs",{"tabs--block":t},n)},s.map((e=>{let{value:n,label:t,attributes:i}=e;return o.createElement("li",(0,a.Z)({role:"tab",tabIndex:r===n?0:-1,"aria-selected":r===n,key:n,ref:e=>p.push(e),onKeyDown:c,onClick:f},i,{className:(0,l.Z)("tabs__item",b.tabItem,i?.className,{"tabs__item--active":r===n})}),t??n)})))}function N(e){let{lazy:n,children:t,selectedValue:a}=e;const l=(Array.isArray(t)?t:[t]).filter(Boolean);if(n){const e=l.find((e=>e.props.value===a));return e?(0,o.cloneElement)(e,{className:"margin-top--md"}):null}return o.createElement("div",{className:"margin-top--md"},l.map(((e,n)=>(0,o.cloneElement)(e,{key:n,hidden:e.props.value!==a}))))}function w(e){const n=k(e);return o.createElement("div",{className:(0,l.Z)("tabs-container",b.tabList)},o.createElement(y,(0,a.Z)({},e,n)),o.createElement(N,(0,a.Z)({},e,n)))}function T(e){const n=(0,h.Z)();return o.createElement(w,(0,a.Z)({key:String(n)},e))}},7582:(e,n,t)=>{t.r(n),t.d(n,{assets:()=>p,contentTitle:()=>d,default:()=>m,frontMatter:()=>r,metadata:()=>s,toc:()=>u});var a=t(7462),o=(t(7294),t(3905)),l=t(4866),i=t(5162);const r={},d="Conditionals and Loops",s={unversionedId:"developer-guide/wfspec-development/conditionals",id:"developer-guide/wfspec-development/conditionals",title:"Conditionals and Loops",description:"Conditional Branching is a control flow mechanismm in LittleHorse that is very similar to if/else in programming. It allows you to execute different branches of a WfSpec (like a program) depending on the values of your Variables.",source:"@site/docs/05-developer-guide/08-wfspec-development/02-conditionals.md",sourceDirName:"05-developer-guide/08-wfspec-development",slug:"/developer-guide/wfspec-development/conditionals",permalink:"/docs/developer-guide/wfspec-development/conditionals",draft:!1,tags:[],version:"current",sidebarPosition:2,frontMatter:{},sidebar:"tutorialSidebar",previous:{title:"Basics",permalink:"/docs/developer-guide/wfspec-development/basics"},next:{title:"Mutating Variables",permalink:"/docs/developer-guide/wfspec-development/mutating-variables"}},p={},u=[{value:"The <code>WorkflowCondition</code>",id:"the-workflowcondition",level:2},{value:"IN Conditional",id:"in-conditional",level:3},{value:"If Statements",id:"if-statements",level:2},{value:"If Else Statements",id:"if-else-statements",level:2},{value:"While Loops",id:"while-loops",level:2}],f={toc:u},c="wrapper";function m(e){let{components:n,...t}=e;return(0,o.kt)(c,(0,a.Z)({},f,t,{components:n,mdxType:"MDXLayout"}),(0,o.kt)("h1",{id:"conditionals-and-loops"},"Conditionals and Loops"),(0,o.kt)("p",null,(0,o.kt)("a",{parentName:"p",href:"/docs/concepts/conditionals"},"Conditional Branching")," is a control flow mechanismm in LittleHorse that is very similar to ",(0,o.kt)("inlineCode",{parentName:"p"},"if/else")," in programming. It allows you to execute different branches of a ",(0,o.kt)("inlineCode",{parentName:"p"},"WfSpec")," (like a program) depending on the values of your ",(0,o.kt)("inlineCode",{parentName:"p"},"Variable"),"s."),(0,o.kt)("p",null,"The ",(0,o.kt)("inlineCode",{parentName:"p"},"WorkflowThread")," structs and objects have a ",(0,o.kt)("inlineCode",{parentName:"p"},"doIf()")," and ",(0,o.kt)("inlineCode",{parentName:"p"},"doIfElse()")," function which enable this feature. These functions take in:"),(0,o.kt)("ul",null,(0,o.kt)("li",{parentName:"ul"},"A ",(0,o.kt)("inlineCode",{parentName:"li"},"WorkflowCondition")," struct or object, which is similar to the expression that goes inside the ",(0,o.kt)("inlineCode",{parentName:"li"},"if (/* right here */)")),(0,o.kt)("li",{parentName:"ul"},"A lambda function or ",(0,o.kt)("inlineCode",{parentName:"li"},"WorkflowThread")," which executes the logic for the ",(0,o.kt)("inlineCode",{parentName:"li"},"if")," branch."),(0,o.kt)("li",{parentName:"ul"},"Another lambda function for the ",(0,o.kt)("inlineCode",{parentName:"li"},"else")," branch (only for ",(0,o.kt)("inlineCode",{parentName:"li"},"doIfElse()"),")")),(0,o.kt)("h2",{id:"the-workflowcondition"},"The ",(0,o.kt)("inlineCode",{parentName:"h2"},"WorkflowCondition")),(0,o.kt)("p",null,"In an ",(0,o.kt)("inlineCode",{parentName:"p"},"if")," statement, the expression is what goes between the ",(0,o.kt)("inlineCode",{parentName:"p"},"()")," parentheses. It is a boolean expression that evaluates to ",(0,o.kt)("inlineCode",{parentName:"p"},"true")," or ",(0,o.kt)("inlineCode",{parentName:"p"},"false"),"."),(0,o.kt)("p",null,"In LittleHorse, you can create an expression using ",(0,o.kt)("inlineCode",{parentName:"p"},"WorkflowThread#condition")," in any of our SDK's. The method or function takes three parameters:"),(0,o.kt)("ol",null,(0,o.kt)("li",{parentName:"ol"},"The ",(0,o.kt)("inlineCode",{parentName:"li"},"LHS")),(0,o.kt)("li",{parentName:"ol"},"The Comparator"),(0,o.kt)("li",{parentName:"ol"},"The ",(0,o.kt)("inlineCode",{parentName:"li"},"RHS"))),(0,o.kt)("p",null,"Please review the Conditionals Concepts Documentation ",(0,o.kt)("a",{parentName:"p",href:"/docs/concepts/conditionals"},"here")," for a refresher on the various Comparator types. They are listed below:"),(0,o.kt)("ul",null,(0,o.kt)("li",{parentName:"ul"},(0,o.kt)("inlineCode",{parentName:"li"},"LESS_THAN")),(0,o.kt)("li",{parentName:"ul"},(0,o.kt)("inlineCode",{parentName:"li"},"GREATER_THAN")),(0,o.kt)("li",{parentName:"ul"},(0,o.kt)("inlineCode",{parentName:"li"},"LESS_THAN_EQ")),(0,o.kt)("li",{parentName:"ul"},(0,o.kt)("inlineCode",{parentName:"li"},"GREATER_THAN_EQ")),(0,o.kt)("li",{parentName:"ul"},(0,o.kt)("inlineCode",{parentName:"li"},"EQUALS")),(0,o.kt)("li",{parentName:"ul"},(0,o.kt)("inlineCode",{parentName:"li"},"NOT_EQUALS")),(0,o.kt)("li",{parentName:"ul"},(0,o.kt)("inlineCode",{parentName:"li"},"IN")),(0,o.kt)("li",{parentName:"ul"},(0,o.kt)("inlineCode",{parentName:"li"},"NOT_IN"))),(0,o.kt)("p",null,"The ",(0,o.kt)("inlineCode",{parentName:"p"},"LHS")," and the ",(0,o.kt)("inlineCode",{parentName:"p"},"RHS")," can be set in two ways:"),(0,o.kt)("ol",null,(0,o.kt)("li",{parentName:"ol"},"A literal value."),(0,o.kt)("li",{parentName:"ol"},"A ",(0,o.kt)("inlineCode",{parentName:"li"},"WfRunVariable"),", which means that the value of that ",(0,o.kt)("inlineCode",{parentName:"li"},"Variable")," in the ",(0,o.kt)("inlineCode",{parentName:"li"},"WfRun")," is used.")),(0,o.kt)("p",null,"The following is equivalent to ",(0,o.kt)("inlineCode",{parentName:"p"},"foo < 3"),":"),(0,o.kt)(l.Z,{mdxType:"Tabs"},(0,o.kt)(i.Z,{value:"java",label:"Java",default:!0,mdxType:"TabItem"},(0,o.kt)("pre",null,(0,o.kt)("code",{parentName:"pre",className:"language-java"},'\nimport io.littlehorse.sdk.common.proto.Comparator;\n// ...\n\nWfRunVariable foo = wf.addVariable("foo", VariableType.INT);\n\nWorkflowCondition condition = wf.condition(\n    foo,\n    Comparator.LESS_THAN,\n    3\n);\n'))),(0,o.kt)(i.Z,{value:"go",label:"Go",mdxType:"TabItem"},(0,o.kt)("pre",null,(0,o.kt)("code",{parentName:"pre",className:"language-go"},'foo := wf.AddVariable("foo", model.VariableType_INT)\n\ncondition := wf.Condition(\n    foo,\n    model.Comparator_LESS_THAN,\n    3,\n)\n'))),(0,o.kt)(i.Z,{value:"python",label:"Python",mdxType:"TabItem"},(0,o.kt)("pre",null,(0,o.kt)("code",{parentName:"pre",className:"language-python"},'def entrypoint(wf: WorkflowThread) -> None:\n    foo = wf.add_variable("foo", VariableType.INT)\n    condition = wf.condition(foo, Comparator.LESS_THAN, 3)\n')))),(0,o.kt)("h3",{id:"in-conditional"},"IN Conditional"),(0,o.kt)("p",null,"For the ",(0,o.kt)("inlineCode",{parentName:"p"},"IN")," conditional you have to provide either a variable or a literal value on the ",(0,o.kt)("inlineCode",{parentName:"p"},"LHS")," that might be contained on a collection of values that is provided on the ",(0,o.kt)("inlineCode",{parentName:"p"},"RHS"),"."),(0,o.kt)(l.Z,{mdxType:"Tabs"},(0,o.kt)(i.Z,{value:"java",label:"Java",default:!0,mdxType:"TabItem"},(0,o.kt)("pre",null,(0,o.kt)("code",{parentName:"pre",className:"language-java"},'\nimport io.littlehorse.sdk.common.proto.Comparator;\n// ...\n\nWfRunVariable foo = wf.addVariable("foo", VariableType.INT);\n\nWorkflowCondition condition = wf.condition(\n    foo,\n    Comparator.IN,\n    [2, 3, 4]\n);\n'))),(0,o.kt)(i.Z,{value:"go",label:"Go",mdxType:"TabItem"},(0,o.kt)("pre",null,(0,o.kt)("code",{parentName:"pre",className:"language-go"},'foo := wf.AddVariable("foo", model.VariableType_INT)\n\ncondition := wf.Condition(\n    foo,\n    model.IN,\n    [3]int{1,2,3},\n)\n'))),(0,o.kt)(i.Z,{value:"python",label:"Python",mdxType:"TabItem"},(0,o.kt)("pre",null,(0,o.kt)("code",{parentName:"pre",className:"language-python"},'def entrypoint(wf: WorkflowThread) -> None:\n    foo = wf.add_variable("foo", VariableType.INT)\n    condition = wf.condition(foo, Comparator.IN, [1, 2, 3])\n')))),(0,o.kt)("h2",{id:"if-statements"},"If Statements"),(0,o.kt)("p",null,"To do an ",(0,o.kt)("inlineCode",{parentName:"p"},"if")," statement, you use ",(0,o.kt)("inlineCode",{parentName:"p"},"WorkflowThread::doIf()"),". The method takes two arguments:"),(0,o.kt)("ol",null,(0,o.kt)("li",{parentName:"ol"},"A ",(0,o.kt)("inlineCode",{parentName:"li"},"WorkflowCondition")," (see above)."),(0,o.kt)("li",{parentName:"ol"},"An ",(0,o.kt)("inlineCode",{parentName:"li"},"IfElseBody")," implementation.")),(0,o.kt)("p",null,"The ",(0,o.kt)("inlineCode",{parentName:"p"},"IfElseBody")," is just a type: think of it as a functional interface that's the same as a ",(0,o.kt)("inlineCode",{parentName:"p"},"ThreadFunc")," but it's used differently. Generally, an ",(0,o.kt)("inlineCode",{parentName:"p"},"IfElseBody")," is provided by an anonymous function (think a ",(0,o.kt)("inlineCode",{parentName:"p"},"lambda")," function in python)."),(0,o.kt)("p",null,"Here's an example of executing a ",(0,o.kt)("inlineCode",{parentName:"p"},"my-task")," Task if ",(0,o.kt)("inlineCode",{parentName:"p"},"foo < 3"),":"),(0,o.kt)(l.Z,{mdxType:"Tabs"},(0,o.kt)(i.Z,{value:"java",label:"Java",default:!0,mdxType:"TabItem"},(0,o.kt)("pre",null,(0,o.kt)("code",{parentName:"pre",className:"language-java"},'WfRunVariable foo = wf.addVariable("foo", VariableType.INT);\n\nwf.doIf(\n    wf.condition(foo, Comparator.LESS_THAN, 3),\n    ifBody -> {\n        ifBody.execute("my-task");\n    }\n);\n'))),(0,o.kt)(i.Z,{value:"go",label:"Go",mdxType:"TabItem"},(0,o.kt)("pre",null,(0,o.kt)("code",{parentName:"pre",className:"language-go"},'foo := wf.AddVariable("foo", model.VariableType_INT)\n\nwf.DoIf(\n    wf.Condition(foo, model.Comparator_LESS_THAN, 3),\n    func (ifBody *wflib.WorkflowThread) {\n        ifBody.Execute("my-task")\n    },\n)\n'))),(0,o.kt)(i.Z,{value:"python",label:"Python",mdxType:"TabItem"},(0,o.kt)("p",null,"In python you have to use a first-class function, pay attention to ",(0,o.kt)("inlineCode",{parentName:"p"},"if_body")," function.\nThis is also applicable for methods."),(0,o.kt)("pre",null,(0,o.kt)("code",{parentName:"pre",className:"language-python"},'def if_body(wf: WorkflowThread) -> None:\n    wf.execute("my-task")\n\ndef entrypoint(wf: WorkflowThread) -> None:\n    foo = wf.add_variable("foo", VariableType.INT)\n    condition = wf.condition(foo, Comparator.LESS_THAN, 3)\n    wf.do_if(condition, if_body)\n')))),(0,o.kt)("h2",{id:"if-else-statements"},"If Else Statements"),(0,o.kt)("p",null,"To do an ",(0,o.kt)("inlineCode",{parentName:"p"},"if"),"/",(0,o.kt)("inlineCode",{parentName:"p"},"else")," statement, you can use ",(0,o.kt)("inlineCode",{parentName:"p"},"WorkflowThread::doIfElse()"),", which is identical to ",(0,o.kt)("inlineCode",{parentName:"p"},"doIf()")," but it takes an additional ",(0,o.kt)("inlineCode",{parentName:"p"},"IfElseBody")," that is executed if the condition is false."),(0,o.kt)("p",null,"An example:"),(0,o.kt)(l.Z,{mdxType:"Tabs"},(0,o.kt)(i.Z,{value:"java",label:"Java",default:!0,mdxType:"TabItem"},(0,o.kt)("pre",null,(0,o.kt)("code",{parentName:"pre",className:"language-java"},'WfRunVariable foo = wf.addVariable("foo", VariableType.INT);\n\nwf.doIf(\n    wf.condition(foo, Comparator.LESS_THAN, 3),\n    ifBody -> {\n        ifBody.execute("my-task");\n    },\n    elseBody -> {\n        elseBody.execute("my-other-task");\n        elseBody.execute("yet-another-task");\n    }\n);\n'))),(0,o.kt)(i.Z,{value:"go",label:"Go",mdxType:"TabItem"},(0,o.kt)("pre",null,(0,o.kt)("code",{parentName:"pre",className:"language-go"},'foo := wf.AddVariable("foo", model.VariableType_INT)\n\nwf.DoIfElse(\n    wf.Condition(foo, model.Comparator_LESS_THAN, 3),\n    func (ifBody *wflib.WorkflowThread) {\n        ifBody.Execute("my-task")\n    },\n    func (elseBody *wflib.WorkflowThread) {\n        elseBody.Execute("another-task")\n        elseBody.Execute("yet-another-task")\n    },\n)\n'))),(0,o.kt)(i.Z,{value:"python",label:"Python",mdxType:"TabItem"},(0,o.kt)("p",null,"In python you have to use a first-class function, pay attention to ",(0,o.kt)("inlineCode",{parentName:"p"},"if_body")," and ",(0,o.kt)("inlineCode",{parentName:"p"},"else_body")," functions.\nThis is also applicable for methods."),(0,o.kt)("pre",null,(0,o.kt)("code",{parentName:"pre",className:"language-python"},'def entrypoint(wf: WorkflowThread) -> None:\n    def else_body(wf: WorkflowThread) -> None:\n        wf.execute("another-task")\n        wf.execute("yet-another-task")\n      \n    def if_body(wf: WorkflowThread) -> None:\n        wf.execute("my-task")\n\n    foo = wf.add_variable("foo", VariableType.INT)\n    condition = wf.condition(foo, Comparator.LESS_THAN, 3)\n    wf.do_if(condition, if_body, else_body)\n')))),(0,o.kt)("h2",{id:"while-loops"},"While Loops"),(0,o.kt)("p",null,"The ",(0,o.kt)("inlineCode",{parentName:"p"},"WorkflowThread")," in LittleHorse also has a ",(0,o.kt)("inlineCode",{parentName:"p"},"doWhile()")," function/method. To use it, you pass in a ",(0,o.kt)("inlineCode",{parentName:"p"},"WorkflowCondition")," and a ",(0,o.kt)("inlineCode",{parentName:"p"},"WhileBody"),", which is just a lambda function or interface defining workflow logic."),(0,o.kt)("admonition",{type:"info"},(0,o.kt)("p",{parentName:"admonition"},"The semantics of ",(0,o.kt)("inlineCode",{parentName:"p"},"WorkflowThread#doWhile()")," are the same as a ",(0,o.kt)("inlineCode",{parentName:"p"},"while")," loop in programming, not a ",(0,o.kt)("inlineCode",{parentName:"p"},"do while"),". That is because ",(0,o.kt)("inlineCode",{parentName:"p"},"while")," is a reserved word in most languages, so we couldn't add a function called ",(0,o.kt)("inlineCode",{parentName:"p"},"while"),".")),(0,o.kt)("p",null,"Here's an example that executes two tasks in a loop as long as ",(0,o.kt)("inlineCode",{parentName:"p"},"foo < 3"),":"),(0,o.kt)(l.Z,{mdxType:"Tabs"},(0,o.kt)(i.Z,{value:"java",label:"Java",default:!0,mdxType:"TabItem"},(0,o.kt)("pre",null,(0,o.kt)("code",{parentName:"pre",className:"language-java"},'WfRunVariable foo = wf.addVariable("foo", VariableType.INT);\n\nwf.doWhile(\n    wf.condition(foo, Comparator.LESS_THAN, 3),\n    loopBody -> {\n        loopBody.execute("my-task");\n        loopBody.execute("another-task");\n    }\n);\n'))),(0,o.kt)(i.Z,{value:"go",label:"Go",mdxType:"TabItem"},(0,o.kt)("pre",null,(0,o.kt)("code",{parentName:"pre",className:"language-go"},'foo := wf.AddVariable("foo", model.VariableType_INT)\n\nwf.DoWhile(\n    wf.Condition(foo, model.Comparator_LESS_THAN, 3),\n    func (loopBody *wflib.WorkflowThread) {\n        loopBody.Execute("my-task")\n        loopBody.Execute("another-task")\n    },\n)\n'))),(0,o.kt)(i.Z,{value:"python",label:"Python",mdxType:"TabItem"},(0,o.kt)("p",null,"In python you have to use a first-class function, pay attention to ",(0,o.kt)("inlineCode",{parentName:"p"},"while_body")," function.\nThis is also applicable for methods."),(0,o.kt)("pre",null,(0,o.kt)("code",{parentName:"pre",className:"language-python"},'def entrypoint(wf: WorkflowThread) -> None:\n    def while_body(wf: WorkflowThread) -> None:\n        wf.execute("my-task")\n        wf.execute("another-task")\n\n    foo = wf.add_variable("foo", VariableType.INT)\n    condition = wf.condition(foo, Comparator.LESS_THAN, 3)\n    wf.do_while(condition, while_body)\n')))))}m.isMDXComponent=!0}}]);