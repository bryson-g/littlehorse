"use strict";(self.webpackChunklh_site=self.webpackChunklh_site||[]).push([[4901],{3905:(e,t,r)=>{r.d(t,{Zo:()=>c,kt:()=>h});var n=r(7294);function a(e,t,r){return t in e?Object.defineProperty(e,t,{value:r,enumerable:!0,configurable:!0,writable:!0}):e[t]=r,e}function l(e,t){var r=Object.keys(e);if(Object.getOwnPropertySymbols){var n=Object.getOwnPropertySymbols(e);t&&(n=n.filter((function(t){return Object.getOwnPropertyDescriptor(e,t).enumerable}))),r.push.apply(r,n)}return r}function o(e){for(var t=1;t<arguments.length;t++){var r=null!=arguments[t]?arguments[t]:{};t%2?l(Object(r),!0).forEach((function(t){a(e,t,r[t])})):Object.getOwnPropertyDescriptors?Object.defineProperties(e,Object.getOwnPropertyDescriptors(r)):l(Object(r)).forEach((function(t){Object.defineProperty(e,t,Object.getOwnPropertyDescriptor(r,t))}))}return e}function i(e,t){if(null==e)return{};var r,n,a=function(e,t){if(null==e)return{};var r,n,a={},l=Object.keys(e);for(n=0;n<l.length;n++)r=l[n],t.indexOf(r)>=0||(a[r]=e[r]);return a}(e,t);if(Object.getOwnPropertySymbols){var l=Object.getOwnPropertySymbols(e);for(n=0;n<l.length;n++)r=l[n],t.indexOf(r)>=0||Object.prototype.propertyIsEnumerable.call(e,r)&&(a[r]=e[r])}return a}var s=n.createContext({}),u=function(e){var t=n.useContext(s),r=t;return e&&(r="function"==typeof e?e(t):o(o({},t),e)),r},c=function(e){var t=u(e.components);return n.createElement(s.Provider,{value:t},e.children)},p="mdxType",d={inlineCode:"code",wrapper:function(e){var t=e.children;return n.createElement(n.Fragment,{},t)}},m=n.forwardRef((function(e,t){var r=e.components,a=e.mdxType,l=e.originalType,s=e.parentName,c=i(e,["components","mdxType","originalType","parentName"]),p=u(r),m=a,h=p["".concat(s,".").concat(m)]||p[m]||d[m]||l;return r?n.createElement(h,o(o({ref:t},c),{},{components:r})):n.createElement(h,o({ref:t},c))}));function h(e,t){var r=arguments,a=t&&t.mdxType;if("string"==typeof e||a){var l=r.length,o=new Array(l);o[0]=m;var i={};for(var s in t)hasOwnProperty.call(t,s)&&(i[s]=t[s]);i.originalType=e,i[p]="string"==typeof e?e:a,o[1]=i;for(var u=2;u<l;u++)o[u]=r[u];return n.createElement.apply(null,o)}return n.createElement.apply(null,r)}m.displayName="MDXCreateElement"},5162:(e,t,r)=>{r.d(t,{Z:()=>o});var n=r(7294),a=r(6010);const l={tabItem:"tabItem_Ymn6"};function o(e){let{children:t,hidden:r,className:o}=e;return n.createElement("div",{role:"tabpanel",className:(0,a.Z)(l.tabItem,o),hidden:r},t)}},4866:(e,t,r)=>{r.d(t,{Z:()=>N});var n=r(7462),a=r(7294),l=r(6010),o=r(2466),i=r(6550),s=r(1980),u=r(7392),c=r(12);function p(e){return function(e){return a.Children.map(e,(e=>{if(!e||(0,a.isValidElement)(e)&&function(e){const{props:t}=e;return!!t&&"object"==typeof t&&"value"in t}(e))return e;throw new Error(`Docusaurus error: Bad <Tabs> child <${"string"==typeof e.type?e.type:e.type.name}>: all children of the <Tabs> component should be <TabItem>, and every <TabItem> should have a unique "value" prop.`)}))?.filter(Boolean)??[]}(e).map((e=>{let{props:{value:t,label:r,attributes:n,default:a}}=e;return{value:t,label:r,attributes:n,default:a}}))}function d(e){const{values:t,children:r}=e;return(0,a.useMemo)((()=>{const e=t??p(r);return function(e){const t=(0,u.l)(e,((e,t)=>e.value===t.value));if(t.length>0)throw new Error(`Docusaurus error: Duplicate values "${t.map((e=>e.value)).join(", ")}" found in <Tabs>. Every value needs to be unique.`)}(e),e}),[t,r])}function m(e){let{value:t,tabValues:r}=e;return r.some((e=>e.value===t))}function h(e){let{queryString:t=!1,groupId:r}=e;const n=(0,i.k6)(),l=function(e){let{queryString:t=!1,groupId:r}=e;if("string"==typeof t)return t;if(!1===t)return null;if(!0===t&&!r)throw new Error('Docusaurus error: The <Tabs> component groupId prop is required if queryString=true, because this value is used as the search param name. You can also provide an explicit value such as queryString="my-search-param".');return r??null}({queryString:t,groupId:r});return[(0,s._X)(l),(0,a.useCallback)((e=>{if(!l)return;const t=new URLSearchParams(n.location.search);t.set(l,e),n.replace({...n.location,search:t.toString()})}),[l,n])]}function b(e){const{defaultValue:t,queryString:r=!1,groupId:n}=e,l=d(e),[o,i]=(0,a.useState)((()=>function(e){let{defaultValue:t,tabValues:r}=e;if(0===r.length)throw new Error("Docusaurus error: the <Tabs> component requires at least one <TabItem> children component");if(t){if(!m({value:t,tabValues:r}))throw new Error(`Docusaurus error: The <Tabs> has a defaultValue "${t}" but none of its children has the corresponding value. Available values are: ${r.map((e=>e.value)).join(", ")}. If you intend to show no default tab, use defaultValue={null} instead.`);return t}const n=r.find((e=>e.default))??r[0];if(!n)throw new Error("Unexpected error: 0 tabValues");return n.value}({defaultValue:t,tabValues:l}))),[s,u]=h({queryString:r,groupId:n}),[p,b]=function(e){let{groupId:t}=e;const r=function(e){return e?`docusaurus.tab.${e}`:null}(t),[n,l]=(0,c.Nk)(r);return[n,(0,a.useCallback)((e=>{r&&l.set(e)}),[r,l])]}({groupId:n}),f=(()=>{const e=s??p;return m({value:e,tabValues:l})?e:null})();(0,a.useLayoutEffect)((()=>{f&&i(f)}),[f]);return{selectedValue:o,selectValue:(0,a.useCallback)((e=>{if(!m({value:e,tabValues:l}))throw new Error(`Can't select invalid tab value=${e}`);i(e),u(e),b(e)}),[u,b,l]),tabValues:l}}var f=r(2389);const k={tabList:"tabList__CuJ",tabItem:"tabItem_LNqP"};function v(e){let{className:t,block:r,selectedValue:i,selectValue:s,tabValues:u}=e;const c=[],{blockElementScrollPositionUntilNextRender:p}=(0,o.o5)(),d=e=>{const t=e.currentTarget,r=c.indexOf(t),n=u[r].value;n!==i&&(p(t),s(n))},m=e=>{let t=null;switch(e.key){case"Enter":d(e);break;case"ArrowRight":{const r=c.indexOf(e.currentTarget)+1;t=c[r]??c[0];break}case"ArrowLeft":{const r=c.indexOf(e.currentTarget)-1;t=c[r]??c[c.length-1];break}}t?.focus()};return a.createElement("ul",{role:"tablist","aria-orientation":"horizontal",className:(0,l.Z)("tabs",{"tabs--block":r},t)},u.map((e=>{let{value:t,label:r,attributes:o}=e;return a.createElement("li",(0,n.Z)({role:"tab",tabIndex:i===t?0:-1,"aria-selected":i===t,key:t,ref:e=>c.push(e),onKeyDown:m,onClick:d},o,{className:(0,l.Z)("tabs__item",k.tabItem,o?.className,{"tabs__item--active":i===t})}),r??t)})))}function y(e){let{lazy:t,children:r,selectedValue:n}=e;const l=(Array.isArray(r)?r:[r]).filter(Boolean);if(t){const e=l.find((e=>e.props.value===n));return e?(0,a.cloneElement)(e,{className:"margin-top--md"}):null}return a.createElement("div",{className:"margin-top--md"},l.map(((e,t)=>(0,a.cloneElement)(e,{key:t,hidden:e.props.value!==n}))))}function g(e){const t=b(e);return a.createElement("div",{className:(0,l.Z)("tabs-container",k.tabList)},a.createElement(v,(0,n.Z)({},e,t)),a.createElement(y,(0,n.Z)({},e,t)))}function N(e){const t=(0,f.Z)();return a.createElement(g,(0,n.Z)({key:String(t)},e))}},2375:(e,t,r)=>{r.r(t),r.d(t,{assets:()=>c,contentTitle:()=>s,default:()=>h,frontMatter:()=>i,metadata:()=>u,toc:()=>p});var n=r(7462),a=(r(7294),r(3905)),l=r(4866),o=r(5162);const i={},s="Quickstart Installation",u={unversionedId:"developer-guide/install",id:"developer-guide/install",title:"Quickstart Installation",description:"The minimum to get started with LittleHorse is to install the lhctl CLI, run the server in docker, and use your choice of the Java, GoLang, or Python client libraries.",source:"@site/docs/05-developer-guide/00-install.md",sourceDirName:"05-developer-guide",slug:"/developer-guide/install",permalink:"/docs/developer-guide/install",draft:!1,tags:[],version:"current",sidebarPosition:0,frontMatter:{},sidebar:"tutorialSidebar",previous:{title:"Developer Guide",permalink:"/docs/developer-guide/"},next:{title:"Configuring the Clients",permalink:"/docs/developer-guide/client-configuration"}},c={},p=[{value:"LittleHorse CLI",id:"littlehorse-cli",level:2},{value:"LittleHorse Server (Local Dev)",id:"littlehorse-server-local-dev",level:2},{value:"LittleHorse Client Libraries",id:"littlehorse-client-libraries",level:2},{value:"Get Started",id:"get-started",level:2}],d={toc:p},m="wrapper";function h(e){let{components:t,...r}=e;return(0,a.kt)(m,(0,n.Z)({},d,r,{components:t,mdxType:"MDXLayout"}),(0,a.kt)("h1",{id:"quickstart-installation"},"Quickstart Installation"),(0,a.kt)("p",null,"The minimum to get started with LittleHorse is to install the ",(0,a.kt)("inlineCode",{parentName:"p"},"lhctl")," CLI, run the server in docker, and use your choice of the Java, GoLang, or Python client libraries."),(0,a.kt)("admonition",{type:"tip"},(0,a.kt)("p",{parentName:"admonition"},"For fast responses, we recommend you join our ",(0,a.kt)("a",{parentName:"p",href:"https://launchpass.com/littlehorsecommunity"},"LittleHorse Community Slack Workspace")," to exchange ideas about and receive support for LittleHorse.")),(0,a.kt)("p",null,"Your system will need:"),(0,a.kt)("ul",null,(0,a.kt)("li",{parentName:"ul"},(0,a.kt)("inlineCode",{parentName:"li"},"brew")," or ",(0,a.kt)("inlineCode",{parentName:"li"},"go")," to install ",(0,a.kt)("inlineCode",{parentName:"li"},"lhctl")," (if you use ",(0,a.kt)("inlineCode",{parentName:"li"},"go"),", make sure to put ",(0,a.kt)("inlineCode",{parentName:"li"},"~/go/bin")," in your ",(0,a.kt)("inlineCode",{parentName:"li"},"PATH"),")."),(0,a.kt)("li",{parentName:"ul"},(0,a.kt)("inlineCode",{parentName:"li"},"docker")," to run the LH Server."),(0,a.kt)("li",{parentName:"ul"},"Either ",(0,a.kt)("inlineCode",{parentName:"li"},"go"),", ",(0,a.kt)("inlineCode",{parentName:"li"},"java"),", or ",(0,a.kt)("inlineCode",{parentName:"li"},"python")," to run the client libraries.")),(0,a.kt)("h2",{id:"littlehorse-cli"},"LittleHorse CLI"),(0,a.kt)("p",null,"First, install ",(0,a.kt)("inlineCode",{parentName:"p"},"lhctl"),", the LittleHorse CLI."),(0,a.kt)(l.Z,{mdxType:"Tabs"},(0,a.kt)(o.Z,{value:"brew",label:"Homebrew",default:!0,mdxType:"TabItem"},(0,a.kt)("p",null,"Installation via Homebrew has been tested on Mac and Linux."),(0,a.kt)("pre",null,(0,a.kt)("code",{parentName:"pre"},"brew install littlehorse-enterprises/lh/lhctl\n"))),(0,a.kt)(o.Z,{value:"go",label:"Go",mdxType:"TabItem"},(0,a.kt)("p",null,"Alternatively, you can install ",(0,a.kt)("inlineCode",{parentName:"p"},"lhctl")," directly from source using GoLang. Please remember to put ",(0,a.kt)("inlineCode",{parentName:"p"},"~/go/bin/")," in your ",(0,a.kt)("inlineCode",{parentName:"p"},"PATH"),"."),(0,a.kt)("pre",null,(0,a.kt)("code",{parentName:"pre"},"go install github.com/littlehorse-enterprises/littlehorse/lhctl@0.7.2\n")))),(0,a.kt)("h2",{id:"littlehorse-server-local-dev"},"LittleHorse Server (Local Dev)"),(0,a.kt)("p",null,"The easiest way to run the LittleHorse Server is using the ",(0,a.kt)("inlineCode",{parentName:"p"},"lh-standalone")," docker image. You can do so as follows:"),(0,a.kt)("pre",null,(0,a.kt)("code",{parentName:"pre"},"docker run --name littlehorse -d -p 2023:2023 -p 8080:8080 ghcr.io/littlehorse-enterprises/littlehorse/lh-standalone:0.7.2\n")),(0,a.kt)("p",null,"Note that the ",(0,a.kt)("inlineCode",{parentName:"p"},"lh-standalone")," image is only suitable for local development. Once the container is up and running, you should be able to verify that the server is working as follows:"),(0,a.kt)("pre",null,(0,a.kt)("code",{parentName:"pre"},"-> lhctl version\nlhctl version: 0.7.2\nServer version: 0.7.2\n")),(0,a.kt)("admonition",{type:"info"},(0,a.kt)("p",{parentName:"admonition"},"The ",(0,a.kt)("inlineCode",{parentName:"p"},"lh-standalone")," image takes some time to start up since it first starts a Kafka Broker process before starting the LH Server process. If your ",(0,a.kt)("inlineCode",{parentName:"p"},"lhctl search wfSpec")," command fails at first, keep trying for about 20-40 seconds until Kafka is ready.")),(0,a.kt)("p",null,"You should be able to access the LH Developer Dashboard at ",(0,a.kt)("inlineCode",{parentName:"p"},"http://localhost:8080/")," after the ",(0,a.kt)("inlineCode",{parentName:"p"},"lh-standalone")," image has started up."),(0,a.kt)("h2",{id:"littlehorse-client-libraries"},"LittleHorse Client Libraries"),(0,a.kt)("p",null,"All the LittleHorse Client libraries, including grpc clients, can be accessed through standard installation mechanisms in a language of your choice."),(0,a.kt)(l.Z,{mdxType:"Tabs"},(0,a.kt)(o.Z,{value:"java",label:"Java",default:!0,mdxType:"TabItem"},(0,a.kt)("p",null,"The Java Client Library is available on Maven Central. To add it as a dependency to your project, simply put the following in your ",(0,a.kt)("inlineCode",{parentName:"p"},"build.gradle")," (or do the equivalent with your ",(0,a.kt)("inlineCode",{parentName:"p"},"pom.xml"),")"),(0,a.kt)("pre",null,(0,a.kt)("code",{parentName:"pre"},"  implementation 'io.littlehorse:littlehorse-client:0.7.2'\n"))),(0,a.kt)(o.Z,{value:"go",label:"Go",mdxType:"TabItem"},"You add the LittleHorse Go Library as a dependency to your Go project as follows:",(0,a.kt)("pre",null,(0,a.kt)("code",{parentName:"pre"},"go get github.com/littlehorse-enterprises/littlehorse/sdk-go@0.7.2\n"))),(0,a.kt)(o.Z,{value:"python",label:"Python",mdxType:"TabItem"},"You can install the LittleHorse Client Library as follows:",(0,a.kt)("pre",null,(0,a.kt)("code",{parentName:"pre"},"pip3 install littlehorse-client==0.7.2\n")))),(0,a.kt)("h2",{id:"get-started"},"Get Started"),(0,a.kt)("p",null,"You can use one of the LittleHorse QuickStarts to get going really fast:"),(0,a.kt)("ul",null,(0,a.kt)("li",{parentName:"ul"},(0,a.kt)("strong",{parentName:"li"},"Java Quickstart")," on ",(0,a.kt)("a",{parentName:"li",href:"https://github.com/littlehorse-enterprises/lh-quickstart-java"},"GitHub")," and on ",(0,a.kt)("a",{parentName:"li",href:"https://www.youtube.com/watch?v=8Zo_UOStg98"},"YouTube")),(0,a.kt)("li",{parentName:"ul"},(0,a.kt)("strong",{parentName:"li"},"Go Quickstart")," on ",(0,a.kt)("a",{parentName:"li",href:"https://github.com/littlehorse-enterprises/lh-quickstart-go"},"GitHub")," and on ",(0,a.kt)("a",{parentName:"li",href:"https://www.youtube.com/watch?v=oZQc2ISSZsk"},"YouTube")),(0,a.kt)("li",{parentName:"ul"},(0,a.kt)("strong",{parentName:"li"},"Python Quickstart")," on ",(0,a.kt)("a",{parentName:"li",href:"https://github.com/littlehorse-enterprises/lh-quickstart-python"},"GitHub")," and on ",(0,a.kt)("a",{parentName:"li",href:"https://www.youtube.com/watch?v=l3TZOjfpzTw"},"YouTube")),(0,a.kt)("li",{parentName:"ul"},(0,a.kt)("a",{parentName:"li",href:"https://launchpass.com/littlehorsecommunity"},(0,a.kt)("strong",{parentName:"a"},"Join Our Slack")))),(0,a.kt)("p",null,"Additional rich examples can be found at our ",(0,a.kt)("a",{parentName:"p",href:"https://github.com/littlehorse-enterprises/littlehorse"},"core GitHub repository"),"."))}h.isMDXComponent=!0}}]);