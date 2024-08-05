"use strict";(self.webpackChunklh_site=self.webpackChunklh_site||[]).push([[1642],{7814:(e,n,i)=>{i.r(n),i.d(n,{assets:()=>d,contentTitle:()=>r,default:()=>h,frontMatter:()=>o,metadata:()=>t,toc:()=>a});var c=i(4848),s=i(8453);const o={},r="WfSpec Versioning",t={id:"concepts/advanced/wfspec-versioning",title:"WfSpec Versioning",description:"A WfSpec is a versioned resource. Each WfSpec is uniquely identified by its name (a String), its majorVersion (an auto-incremented number, managed by LittleHorse), and its revision (another auto-incremented number).",source:"@site/docs/04-concepts/30-advanced/00-wfspec-versioning.md",sourceDirName:"04-concepts/30-advanced",slug:"/concepts/advanced/wfspec-versioning",permalink:"/docs/concepts/advanced/wfspec-versioning",draft:!1,unlisted:!1,tags:[],version:"current",sidebarPosition:0,frontMatter:{},sidebar:"tutorialSidebar",previous:{title:"Advanced Concepts",permalink:"/docs/concepts/advanced/"},next:{title:"Developer Guide",permalink:"/docs/developer-guide/"}},d={},a=[];function l(e){const n={a:"a",code:"code",em:"em",h1:"h1",li:"li",p:"p",ul:"ul",...(0,s.R)(),...e.components};return(0,c.jsxs)(c.Fragment,{children:[(0,c.jsx)(n.h1,{id:"wfspec-versioning",children:"WfSpec Versioning"}),"\n",(0,c.jsxs)(n.p,{children:["A ",(0,c.jsx)(n.code,{children:"WfSpec"})," is a versioned resource. Each ",(0,c.jsx)(n.code,{children:"WfSpec"})," is uniquely identified by its ",(0,c.jsx)(n.code,{children:"name"})," (a String), its ",(0,c.jsx)(n.code,{children:"majorVersion"})," (an auto-incremented number, managed by LittleHorse), and its ",(0,c.jsx)(n.code,{children:"revision"})," (another auto-incremented number)."]}),"\n",(0,c.jsxs)(n.p,{children:["When you create a ",(0,c.jsx)(n.code,{children:"WfSpec"})," with the same ",(0,c.jsx)(n.code,{children:"name"})," as another previous ",(0,c.jsx)(n.code,{children:"WfSpec"}),", LittleHorse will either increment the ",(0,c.jsx)(n.code,{children:"revision"}),' (if there are no "breaking changes") or increment the ',(0,c.jsx)(n.code,{children:"majorVersion"})," and set ",(0,c.jsx)(n.code,{children:"revision"})," to zero (if there ",(0,c.jsx)(n.em,{children:"are"}),' "breaking changes"). A "breaking change" in this regard is defined as changing either:']}),"\n",(0,c.jsxs)(n.ul,{children:["\n",(0,c.jsxs)(n.li,{children:["The set of required input variables to the ",(0,c.jsx)(n.code,{children:"WfSpec"}),", or"]}),"\n",(0,c.jsxs)(n.li,{children:["The set of indexed searchable variables in the ",(0,c.jsx)(n.code,{children:"WfSpec"}),"."]}),"\n"]}),"\n",(0,c.jsxs)(n.p,{children:["When you run a ",(0,c.jsx)(n.code,{children:"WfSpec"})," (thus creating a ",(0,c.jsx)(n.code,{children:"WfRun"}),"), you may optionally specify the version of the ",(0,c.jsx)(n.code,{children:"WfSpec"})," that you wish to run. If you specify a specific version, then LittleHorse will run the ",(0,c.jsx)(n.code,{children:"WfSpec"})," specified by the ",(0,c.jsx)(n.code,{children:"RunWf"})," request. If no version number is provided, then ",(0,c.jsx)(n.code,{children:"LittleHorse"})," will automatically run the latest version of the ",(0,c.jsx)(n.code,{children:"WfSpec"})," with the provided name. For instructions on how this works in practice, please check out our ",(0,c.jsx)(n.a,{href:"/docs/developer-guide/grpc/managing-metadata",children:"Metadata Management docs"}),"."]}),"\n",(0,c.jsxs)(n.p,{children:["This versioning scheme allows you to improve the business logic of your ",(0,c.jsx)(n.code,{children:"WfSpec"})," without changing the client code that invokes the ",(0,c.jsx)(n.code,{children:"WfSpec"}),": all your clients need to do is specify the ",(0,c.jsx)(n.code,{children:"name"})," of their ",(0,c.jsx)(n.code,{children:"WfSpec"}),', and the latest logic will be run transparently. Alternatively, you can "pin" your clients to run a specific version of your ',(0,c.jsx)(n.code,{children:"WfSpec"}),"."]}),"\n",(0,c.jsxs)(n.p,{children:["Once a ",(0,c.jsx)(n.code,{children:"WfRun"})," is launched with the ",(0,c.jsx)(n.code,{children:"WfSpec"})," specified by (",(0,c.jsx)(n.code,{children:"name"}),' "foo", ',(0,c.jsx)(n.code,{children:"version"})," 123), the ",(0,c.jsx)(n.code,{children:"WfRun"})," will always be associated with that specific version. In other words, deploying a new version of a ",(0,c.jsx)(n.code,{children:"WfSpec"})," does not affect already-running ",(0,c.jsx)(n.code,{children:"WfRun"}),"s."]}),"\n",(0,c.jsx)(n.p,{children:'Future versions of LittleHorse will add an optional "on-the-fly" upgrade mechanism.'})]})}function h(e={}){const{wrapper:n}={...(0,s.R)(),...e.components};return n?(0,c.jsx)(n,{...e,children:(0,c.jsx)(l,{...e})}):l(e)}},8453:(e,n,i)=>{i.d(n,{R:()=>r,x:()=>t});var c=i(6540);const s={},o=c.createContext(s);function r(e){const n=c.useContext(o);return c.useMemo((function(){return"function"==typeof e?e(n):{...n,...e}}),[n,e])}function t(e){let n;return n=e.disableParentContext?"function"==typeof e.components?e.components(s):e.components||s:r(e.components),c.createElement(o.Provider,{value:n},e.children)}}}]);