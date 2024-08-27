"use strict";(self.webpackChunklh_site=self.webpackChunklh_site||[]).push([[7506],{8156:(e,n,i)=>{i.r(n),i.d(n,{assets:()=>l,contentTitle:()=>c,default:()=>h,frontMatter:()=>t,metadata:()=>o,toc:()=>a});var s=i(4848),r=i(8453);const t={},c="Authz, Principals, and Tenants",o={id:"concepts/principals-and-tenants",title:"Authz, Principals, and Tenants",description:"In order to provide a secure platform for use at large enterprises, LittleHorse supports multi-tenancy natively. This is accomplished through two API Objects:",source:"@site/docs/04-concepts/13-principals-and-tenants.md",sourceDirName:"04-concepts",slug:"/concepts/principals-and-tenants",permalink:"/docs/concepts/principals-and-tenants",draft:!1,unlisted:!1,tags:[],version:"current",sidebarPosition:13,frontMatter:{},sidebar:"tutorialSidebar",previous:{title:"User Tasks",permalink:"/docs/concepts/user-tasks"},next:{title:"Advanced Concepts",permalink:"/docs/concepts/advanced/"}},l={},a=[{value:"Authz with <code>Principal</code>s",id:"authz-with-principals",level:2},{value:"Authenticating a Caller",id:"authenticating-a-caller",level:3},{value:"The <code>anonymous</code> Principal",id:"the-anonymous-principal",level:3},{value:"Authorizing Requests",id:"authorizing-requests",level:3},{value:"Multi-Tenancy with <code>Tenants</code>",id:"multi-tenancy-with-tenants",level:2}];function d(e){const n={a:"a",code:"code",em:"em",h1:"h1",h2:"h2",h3:"h3",header:"header",li:"li",p:"p",strong:"strong",ul:"ul",...(0,r.R)(),...e.components};return(0,s.jsxs)(s.Fragment,{children:[(0,s.jsx)(n.header,{children:(0,s.jsxs)(n.h1,{id:"authz-principals-and-tenants",children:["Authz, ",(0,s.jsx)(n.code,{children:"Principals"}),", and ",(0,s.jsx)(n.code,{children:"Tenants"})]})}),"\n",(0,s.jsx)(n.p,{children:"In order to provide a secure platform for use at large enterprises, LittleHorse supports multi-tenancy natively. This is accomplished through two API Objects:"}),"\n",(0,s.jsxs)(n.ul,{children:["\n",(0,s.jsxs)(n.li,{children:["The ",(0,s.jsx)(n.code,{children:"Principal"}),", which represents the identity of a client of LittleHorse (either a human or a machine)."]}),"\n",(0,s.jsxs)(n.li,{children:["The ",(0,s.jsx)(n.code,{children:"Tenant"}),", which represents a logically isolated environment within LittleHorse."]}),"\n"]}),"\n",(0,s.jsxs)(n.p,{children:[(0,s.jsx)(n.code,{children:"Principal"}),"s and ",(0,s.jsx)(n.code,{children:"Tenant"}),"s reached General Availability in the ",(0,s.jsx)(n.code,{children:"0.10.x"})," release of LittleHorse."]}),"\n",(0,s.jsxs)(n.h2,{id:"authz-with-principals",children:["Authz with ",(0,s.jsx)(n.code,{children:"Principal"}),"s"]}),"\n",(0,s.jsxs)(n.p,{children:["In the 2020's, every company whether large or small must treat security as a top priority. This is especially true for systems like LittleHorse which can be used to orchestrate your most critical business processes. Therefore, when designing LittleHorse, we introduced the ",(0,s.jsx)(n.code,{children:"Principal"})," concept to represent the Identity of a user (machine or human) of LittleHorse."]}),"\n",(0,s.jsxs)(n.p,{children:["Design goals for ",(0,s.jsx)(n.code,{children:"Principal"}),"s include:"]}),"\n",(0,s.jsxs)(n.ul,{children:["\n",(0,s.jsx)(n.li,{children:"The Principle of Least Privilege."}),"\n",(0,s.jsx)(n.li,{children:"Fine-grained access control."}),"\n",(0,s.jsx)(n.li,{children:"Reliance upon open standards."}),"\n"]}),"\n",(0,s.jsxs)(n.p,{children:["A ",(0,s.jsx)(n.a,{href:"/docs/api#principal",children:(0,s.jsx)(n.code,{children:"Principal"})})," is a first-class object in the LittleHorse API which can be adminstered through ",(0,s.jsx)(n.a,{href:"/docs/api#putprincipal",children:"various"})," ",(0,s.jsx)(n.a,{href:"/docs/api#whoami",children:"rpc"})," ",(0,s.jsx)(n.a,{href:"/docs/api#deleteprincipal",children:"requests"}),"."]}),"\n",(0,s.jsx)(n.h3,{id:"authenticating-a-caller",children:"Authenticating a Caller"}),"\n",(0,s.jsxs)(n.p,{children:["Every RPC call to the LittleHorse API is resolved to a ",(0,s.jsx)(n.code,{children:"Principal"})," via authentication. The LittleHorse Server supports both OAuth and MTLS for authentication, configured on a per-listener basis."]}),"\n",(0,s.jsx)(n.p,{children:"The rules for authenticating a call are as follows:"}),"\n",(0,s.jsxs)(n.ul,{children:["\n",(0,s.jsxs)(n.li,{children:["If the listener uses ",(0,s.jsx)(n.code,{children:"MTLS"}),":","\n",(0,s.jsxs)(n.ul,{children:["\n",(0,s.jsxs)(n.li,{children:["The ",(0,s.jsx)(n.code,{children:"Principal"})," ID is determined from the ",(0,s.jsx)(n.code,{children:"Common Name"})," on the client's certificate."]}),"\n",(0,s.jsx)(n.li,{children:"Any requests that fail to present a valid certificate signed by a configured trusted authority will fail at the network level."}),"\n"]}),"\n"]}),"\n",(0,s.jsxs)(n.li,{children:["If the listener uses ",(0,s.jsx)(n.code,{children:"OAUTH"}),":","\n",(0,s.jsxs)(n.ul,{children:["\n",(0,s.jsxs)(n.li,{children:["For requests from a human client (eg. ",(0,s.jsx)(n.code,{children:"lhctl"})," and the Dashboard), the ",(0,s.jsx)(n.code,{children:"Principal"})," ID is determined by the User ID of the presented token."]}),"\n",(0,s.jsxs)(n.li,{children:["For requests from a machine client (eg. a Task Worker), the ",(0,s.jsx)(n.code,{children:"Principal"})," ID is determined by the Client ID of the presented token."]}),"\n",(0,s.jsxs)(n.li,{children:["Requests that fail to present a valid token from the configured issuer fail with ",(0,s.jsx)(n.code,{children:"UNAUTHENTICATED"}),"."]}),"\n"]}),"\n"]}),"\n"]}),"\n",(0,s.jsxs)(n.p,{children:["If a ",(0,s.jsx)(n.code,{children:"Principal"})," exists with a matching ID, the request is authorized according to that ",(0,s.jsx)(n.code,{children:"Principal"}),"'s ACL's. If no ",(0,s.jsx)(n.code,{children:"Principal"})," exists with the provided ID, then the request is authorized according to the ",(0,s.jsx)(n.code,{children:"anonymous"})," ",(0,s.jsx)(n.code,{children:"Prncipal"}),"'s ACL's."]}),"\n",(0,s.jsxs)(n.h3,{id:"the-anonymous-principal",children:["The ",(0,s.jsx)(n.code,{children:"anonymous"})," Principal"]}),"\n",(0,s.jsxs)(n.p,{children:["When a LittleHorse Cluster is first created, there exists one ",(0,s.jsx)(n.code,{children:"Principal"})," out-of-the-box with the name ",(0,s.jsx)(n.code,{children:"anonymous"}),". The ",(0,s.jsx)(n.code,{children:"anonymous"})," ",(0,s.jsx)(n.code,{children:"Principal"})," ",(0,s.jsx)(n.em,{children:"initially"})," has full admin privileges over the entire LittleHorse cluster."]}),"\n",(0,s.jsxs)(n.p,{children:["This is great for getting started in local development, and also for ease of use on private and trusted networks. However, LittleHorse allows you to fully secure your cluster by disabling the permissions of the ",(0,s.jsx)(n.code,{children:"anonymous"})," ",(0,s.jsx)(n.code,{children:"Principal"}),"."]}),"\n",(0,s.jsx)(n.p,{children:"There are several motivations for this design:"}),"\n",(0,s.jsxs)(n.ul,{children:["\n",(0,s.jsxs)(n.li,{children:[(0,s.jsx)(n.strong,{children:"Online Migrations to Secured Clusters"}),": this design allows users to migrate to a secure cluster without downtime by adding a secured listener, adding ",(0,s.jsx)(n.code,{children:"Principal"}),"s for each application, moving applications to the new listener, and disabling ",(0,s.jsx)(n.code,{children:"anonymous"}),"'s permissions."]}),"\n",(0,s.jsxs)(n.li,{children:[(0,s.jsx)(n.strong,{children:"Developer Experience"}),': this design allows LittleHorse to "just work" without understanding ',(0,s.jsx)(n.code,{children:"Principal"}),"s or ",(0,s.jsx)(n.code,{children:"Tenant"}),"s."]}),"\n",(0,s.jsxs)(n.li,{children:[(0,s.jsx)(n.strong,{children:"Fine-Grained Permissions"}),": ACL's on the ",(0,s.jsx)(n.code,{children:"Principal"})," resource allow fine-grained control over who can access what resource."]}),"\n"]}),"\n",(0,s.jsx)(n.h3,{id:"authorizing-requests",children:"Authorizing Requests"}),"\n",(0,s.jsxs)(n.p,{children:["Once a request has been authenticated and a ",(0,s.jsx)(n.code,{children:"Principal"})," has been determined (either as the ",(0,s.jsx)(n.code,{children:"anonymous"})," ",(0,s.jsx)(n.code,{children:"Principal"})," or a custom user-created ",(0,s.jsx)(n.code,{children:"Principal"}),"), the LH Cluster checks the ACL's on the ",(0,s.jsx)(n.code,{children:"Principal"})," against the required permissions for the request."]}),"\n",(0,s.jsxs)(n.p,{children:["The ",(0,s.jsx)(n.a,{href:"/docs/api#aclresource",children:"ACL resources"})," and ",(0,s.jsx)(n.a,{href:"/docs/api#aclaction",children:"actions"})," over those resources are documented in our API Specification. Many requests are scoped to a ",(0,s.jsx)(n.code,{children:"Tenant"}),"; in those cases, the LH Cluster verifies that the calling ",(0,s.jsx)(n.code,{children:"Principal"})," has the appropriate permissions either globally or within the specified ",(0,s.jsx)(n.code,{children:"Tenant"}),"."]}),"\n",(0,s.jsxs)(n.p,{children:["If a calling ",(0,s.jsx)(n.code,{children:"Principal"})," lacks permissions to perform the request, then the GRPC error ",(0,s.jsx)(n.code,{children:"PERMISSION_DENIED"})," is returned."]}),"\n",(0,s.jsxs)(n.h2,{id:"multi-tenancy-with-tenants",children:["Multi-Tenancy with ",(0,s.jsx)(n.code,{children:"Tenants"})]}),"\n",(0,s.jsxs)(n.p,{children:["At large enterprises, there is sometimes a motivation to provide logically isolated environments within a single physical LittleHorse cluster. This can be achieved using a ",(0,s.jsx)(n.code,{children:"Tenant"}),"."]}),"\n",(0,s.jsxs)(n.p,{children:["Every workflow-related resource (",(0,s.jsx)(n.code,{children:"WfSpec"}),", ",(0,s.jsx)(n.code,{children:"WfRun"}),", ",(0,s.jsx)(n.code,{children:"TaskDef"}),", ",(0,s.jsx)(n.code,{children:"TaskRun"}),", ",(0,s.jsx)(n.code,{children:"NodeRun"}),", ",(0,s.jsx)(n.code,{children:"ExternalEvent"}),", etc) is scoped to within a ",(0,s.jsx)(n.code,{children:"Tenant"}),". That means that within tenant ",(0,s.jsx)(n.code,{children:"foo"})," and tenant ",(0,s.jsx)(n.code,{children:"bar"}),", you can have two different ",(0,s.jsx)(n.code,{children:"WfSpec"}),"'s titled ",(0,s.jsx)(n.code,{children:"my-workflow"}),"."]}),"\n",(0,s.jsxs)(n.p,{children:["A ",(0,s.jsx)(n.code,{children:"Principal"})," can have ",(0,s.jsx)(n.code,{children:"global_acls"})," assigned to it, which allow the ",(0,s.jsx)(n.code,{children:"Principal"})," to perform actions over any ",(0,s.jsx)(n.code,{children:"Tenant"}),". Additionally, a ",(0,s.jsx)(n.code,{children:"Principal"})," may have ",(0,s.jsx)(n.code,{children:"per_tenant_acls"})," assigned to it, which allow the ",(0,s.jsx)(n.code,{children:"Principal"})," perform actions over resources within only a specific and specified ",(0,s.jsx)(n.code,{children:"Tenant"}),"."]}),"\n",(0,s.jsxs)(n.p,{children:["Clients can control which ",(0,s.jsx)(n.code,{children:"Tenant"})," they are connected to by using the ",(0,s.jsx)(n.code,{children:"LHC_TENANT_ID"})," configuration."]})]})}function h(e={}){const{wrapper:n}={...(0,r.R)(),...e.components};return n?(0,s.jsx)(n,{...e,children:(0,s.jsx)(d,{...e})}):d(e)}},8453:(e,n,i)=>{i.d(n,{R:()=>c,x:()=>o});var s=i(6540);const r={},t=s.createContext(r);function c(e){const n=s.useContext(t);return s.useMemo((function(){return"function"==typeof e?e(n):{...n,...e}}),[n,e])}function o(e){let n;return n=e.disableParentContext?"function"==typeof e.components?e.components(r):e.components||r:c(e.components),s.createElement(t.Provider,{value:n},e.children)}}}]);