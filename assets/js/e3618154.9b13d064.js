"use strict";(self.webpackChunklh_site=self.webpackChunklh_site||[]).push([[826],{9100:(e,s,i)=>{i.r(s),i.d(s,{assets:()=>l,contentTitle:()=>t,default:()=>d,frontMatter:()=>r,metadata:()=>a,toc:()=>c});var o=i(4848),n=i(8453);const r={slug:"microservices-and-workflow",title:"Microservices and Workflow: A Match Made in Heaven",authors:["coltmcnealy"],tags:["analysis","microservice-and-workflow"]},t=void 0,a={permalink:"/blog/microservices-and-workflow",source:"@site/blog/2024-09-02-microservices-and-workflow.md",title:"Microservices and Workflow: A Match Made in Heaven",description:"While they are often necessary, microservices are a headache. Fortunately, the right workflow engine (such as LittleHorse) can drastically reduce the difficulty of managing microservices.",date:"2024-09-02T00:00:00.000Z",tags:[{inline:!1,label:"Technical Analysis",permalink:"/blog/tags/analysis/",description:"Analysis of the current and future state of Technical Architecture."},{inline:!1,label:"Microservices and Workflow",permalink:"/blog/tags/microservice-and-workflow/",description:"A 3-part blog series on the challenges inherent with the microservice architecture, and how Workflow Engines can mitigate those difficulties."}],readingTime:7.575,hasTruncateMarker:!0,authors:[{name:"Colt McNealy",title:"Managing Member of the LLC",description:"Colt is the founder of LittleHorse Enterprises and the original author of the LittleHorse Orchestrator. He's a passionate Apache Kafka fan and loves hockey, golf, piano, cooking, and Taekwondo.",page:{permalink:"/blog/authors/coltmcnealy"},socials:{github:"https://github.com/coltmcnealy-lh",linkedin:"https://www.linkedin.com/in/colt-mcnealy-900b7a148/",x:"https://x.com/coltmcnealy"},imageURL:"https://avatars.githubusercontent.com/u/100447728",key:"coltmcnealy"}],frontMatter:{slug:"microservices-and-workflow",title:"Microservices and Workflow: A Match Made in Heaven",authors:["coltmcnealy"],tags:["analysis","microservice-and-workflow"]},unlisted:!1,prevItem:{title:"The Basics of Workflow",permalink:"/blog/basics-of-workflow"},nextItem:{title:"Releasing 0.11",permalink:"/blog/littlehorse-0.11-release"}},l={authorsImageUrls:[void 0]},c=[{value:"What is a Workflow?",id:"what-is-a-workflow",level:2},{value:"Workflow Engines",id:"workflow-engines",level:3},{value:"Why Workflow?",id:"why-workflow",level:2},{value:"Mission Critical Oversight",id:"mission-critical-oversight",level:3},{value:"Simple Asynchronous Processing",id:"simple-asynchronous-processing",level:3},{value:"Exception Handling",id:"exception-handling",level:3},{value:"Conclusion",id:"conclusion",level:2}];function h(e){const s={a:"a",admonition:"admonition",code:"code",em:"em",h2:"h2",h3:"h3",img:"img",li:"li",ol:"ol",p:"p",strong:"strong",ul:"ul",...(0,n.R)(),...e.components};return(0,o.jsxs)(o.Fragment,{children:[(0,o.jsx)(s.p,{children:"While they are often necessary, microservices are a headache. Fortunately, the right workflow engine (such as LittleHorse) can drastically reduce the difficulty of managing microservices."}),"\n",(0,o.jsxs)(s.admonition,{type:"info",children:[(0,o.jsx)(s.p,{children:"This is the third and final part of a 3-part blog series:"}),(0,o.jsxs)(s.ol,{children:["\n",(0,o.jsx)(s.li,{children:(0,o.jsx)(s.a,{href:"/blog/promise-of-microservices",children:"The Promise of Microservices"})}),"\n",(0,o.jsx)(s.li,{children:(0,o.jsx)(s.a,{href:"/blog/challenge-of-microservices",children:"The Challenge with Microservices"})}),"\n",(0,o.jsxs)(s.li,{children:[(0,o.jsx)(s.strong,{children:"[This Post]"})," Workflow and Microservices: A Match Made in Heaven"]}),"\n"]})]}),"\n",(0,o.jsxs)(s.p,{children:["If you're just joining for the third blog post, we have so far established that microservices are an effective tool for allowing your engineering team to grow beyond just a handful of people working on an enterprise application. However, microservice systems are by nature ",(0,o.jsx)(s.a,{href:"/blog/challenge-of-microservices#microservices-are-leaderless",children:(0,o.jsx)(s.strong,{children:"Leaderless"})})," and ",(0,o.jsx)(s.a,{href:"/blog/challenge-of-microservices#microservices-are-distributed",children:(0,o.jsx)(s.strong,{children:"Distributed"})}),", which yields challenges in:"]}),"\n",(0,o.jsxs)(s.ul,{children:["\n",(0,o.jsxs)(s.li,{children:[(0,o.jsx)(s.a,{href:"/blog/challenge-of-microservices#observability",children:(0,o.jsx)(s.strong,{children:"Observability"})}),","]}),"\n",(0,o.jsxs)(s.li,{children:[(0,o.jsx)(s.a,{href:"/blog/challenge-of-microservices#reliability-and-correctness",children:(0,o.jsx)(s.strong,{children:"Reliability"})}),", and"]}),"\n",(0,o.jsxs)(s.li,{children:[(0,o.jsx)(s.a,{href:"/blog/challenge-of-microservices#microservice-coupling",children:(0,o.jsx)(s.strong,{children:"Complexity Management"})}),"."]}),"\n"]}),"\n",(0,o.jsxs)(s.p,{children:["Those challenges inspired me to create ",(0,o.jsx)(s.a,{href:"https://littlehorse.dev/docs/concepts",children:"LittleHorse"})," in the fall of 2021. LittleHorse provides primitives and guardrails out of the box which make it easier to wrangle with distributed systems and coordinate processes/transactions across multiple microservices."]}),"\n",(0,o.jsx)(s.p,{children:"In this post, we'll discuss:"}),"\n",(0,o.jsxs)(s.ol,{children:["\n",(0,o.jsxs)(s.li,{children:["What ",(0,o.jsx)(s.em,{children:"workflow"})," means."]}),"\n",(0,o.jsx)(s.li,{children:"How LittleHorse's workflow orchestration capabilities make it easier for you to reliably orchestrate complex business processes."}),"\n"]}),"\n",(0,o.jsxs)(s.admonition,{type:"tip",children:[(0,o.jsx)(s.p,{children:"Want to give LittleHorse a try? Get in touch with us!"}),(0,o.jsxs)(s.ul,{children:["\n",(0,o.jsxs)(s.li,{children:["Join the ",(0,o.jsx)(s.a,{href:"https://launchpass.com/littlehorsecommunity",children:(0,o.jsx)(s.strong,{children:"LH Slack Community"})})," for the latest news and help from community experts."]}),"\n",(0,o.jsxs)(s.li,{children:["Check out our ",(0,o.jsx)(s.a,{href:"https://littlehorse.dev/docs/developer-guide/install",children:(0,o.jsx)(s.strong,{children:"Getting Started"})})," page."]}),"\n",(0,o.jsxs)(s.li,{children:[(0,o.jsx)(s.a,{href:"https://docs.google.com/forms/d/e/1FAIpQLScXVvTYy4LQnYoFoRKRQ7ppuxe0KgncsDukvm96qKN0pU5TnQ/viewform",children:(0,o.jsx)(s.strong,{children:"Say hello"})})," if you'd like to get in touch with someone from the LittleHorse Enterprises team."]}),"\n"]})]}),"\n",(0,o.jsx)(s.h2,{id:"what-is-a-workflow",children:"What is a Workflow?"}),"\n",(0,o.jsx)(s.p,{children:"A workflow is a blueprint that defines a series of tasks to be performed (perhaps conditioned on certain inputs or external events) in order to achieve a business outcome."}),"\n",(0,o.jsxs)(s.p,{children:["If you recall the e-commerce example from the ",(0,o.jsx)(s.a,{href:"/blog/challenge-of-microservices#the-nature-of-microservices",children:"previous blog post"}),", you can think of the abstract checkout process as a workflow. This example is interesting because it demonstrates multiple characteristics of common business processes that make microservice development hard."]}),"\n",(0,o.jsx)(s.p,{children:(0,o.jsx)(s.img,{alt:"E-Commerce Checkout Process Diagram",src:i(6216).A+"",width:"1472",height:"406"})}),"\n",(0,o.jsxs)(s.p,{children:["First, a workflow can be ",(0,o.jsx)(s.em,{children:"mission critical"}),". A customer would be very unhappy if the vendor charged their credit card but failed to ship their order. In technical terms, this means that the state of a workflow needs to be consistent and durable, which is hard to achieve in a distributed system."]}),"\n",(0,o.jsx)(s.p,{children:"Next, a workflow can have exceptional cases. Our e-commerce flow has special logic to handle cases when the customer's credit card was invalid or when the ordered item was out of stock."}),"\n",(0,o.jsxs)(s.p,{children:["Finally, a workflow can be ",(0,o.jsx)(s.em,{children:"asynchronous"}),", meaning that it requires waiting for input from the external world in order to complete. For example, our e-commerce workflow sometimes must wait for a customer to update their credit card information before completing."]}),"\n",(0,o.jsxs)(s.p,{children:["The mission-critical nature of workflows, combined with asynchronous events and exceptional cases, places a premium on ",(0,o.jsx)(s.em,{children:"consistency."})," The results of workflows must be predictable for customers and easy to reason about for business managers and software engineers."]}),"\n",(0,o.jsx)(s.admonition,{type:"note",children:(0,o.jsx)(s.p,{children:'A technical or business process does not need to satisfy all three characteristics to be a "workflow." In fact, simple processes with just one or two linear steps can benefit from a workflow engine.'})}),"\n",(0,o.jsx)(s.h3,{id:"workflow-engines",children:"Workflow Engines"}),"\n",(0,o.jsx)(s.p,{children:"A workflow engine is a software system that makes sure the trains run on time in your processes. To use a workflow engine, you must:"}),"\n",(0,o.jsxs)(s.ol,{children:["\n",(0,o.jsxs)(s.li,{children:[(0,o.jsx)(s.strong,{children:"Define your Tasks"}),", which are units of work that can be executed in a workflow, and write ",(0,o.jsx)(s.a,{href:"https://littlehorse.dev/docs/concepts/tasks",children:"Task Workers"})," which implement small functions or methods in code to execute those tasks."]}),"\n",(0,o.jsxs)(s.li,{children:[(0,o.jsx)(s.strong,{children:"Register a Workflow Specification"})," (we call it a ",(0,o.jsxs)(s.a,{href:"https://littlehorse.dev/docs/concepts/workflows",children:[(0,o.jsx)(s.code,{children:"WfSpec"})," in LittleHorse"]}),") which specifies what tasks to execute and when."]}),"\n",(0,o.jsxs)(s.li,{children:[(0,o.jsx)(s.strong,{children:"Run your workflow"})," so that the workflow engine can orchestrate the process to completion."]}),"\n"]}),"\n",(0,o.jsx)(s.p,{children:(0,o.jsx)(s.img,{alt:"LittleHorse Architecture",src:i(459).A+"",width:"1846",height:"1019"})}),"\n",(0,o.jsxs)(s.p,{children:[(0,o.jsx)(s.a,{href:"https://littlehorse.dev/docs/developer-guide/task-worker-development",children:"Task Workers"})," are where a workflow can interface with the outside world. Since a Task in a workflow results in the LittleHorse SDK calling a programming function/method of your choosing, Task Workers allow LittleHorse to integrate with any system. Task Workers can make database queries, call external API's, provision infrastructure on AWS, send push notifications to customer mobile apps, perform calculations, call an LLM API, and more."]}),"\n",(0,o.jsxs)(s.p,{children:["In LittleHorse, the ",(0,o.jsx)(s.code,{children:"WfSpec"})," is ",(0,o.jsx)(s.a,{href:"https://littlehorse.dev/docs/developer-guide/wfspec-development",children:"defined in code"})," in a language of your choice. Because LittleHorse was written with developers in mind, our DSL's have all of the primitives that you'd expect in a programming language: variables, control flow, exception handling, child threads, interrupts, and awaiting for external events. This allows workflows to be:"]}),"\n",(0,o.jsxs)(s.ul,{children:["\n",(0,o.jsx)(s.li,{children:"Easy to reason about."}),"\n",(0,o.jsx)(s.li,{children:"Tracked in version control."}),"\n",(0,o.jsx)(s.li,{children:"Familiar and easy to learn."}),"\n"]}),"\n",(0,o.jsxs)(s.p,{children:["Once you tell LittleHorse to ",(0,o.jsxs)(s.a,{href:"https://littlehorse.dev/docs/developer-guide/grpc/running-workflows",children:["run an instance of your ",(0,o.jsx)(s.code,{children:"WfSpec"})]}),", LittleHorse will oversee the entire process until it completes. Failed tasks will be retried, every step will be journaled, and the state of your processes will be safely and durably persisted while waiting for external triggers."]}),"\n",(0,o.jsx)(s.h2,{id:"why-workflow",children:"Why Workflow?"}),"\n",(0,o.jsx)(s.p,{children:'Microservice applications that are designed as distributed workflows without a workflow engine (like a chain of dominoes falling) present operational challenges because there is no "leader" providing oversight over the microservice processes. Thankfully, a developer-focused and horizontally-scalable workflow engine like LittleHorse can fill the "leader" role, thus providing oversight and reliability, and taming the complexity of your business processes.'}),"\n",(0,o.jsxs)(s.p,{children:["Additionally, using a workflow engine allows you to develop a set of ",(0,o.jsx)(s.em,{children:"reusable"})," and ",(0,o.jsx)(s.em,{children:"modular"})," tasks which can be easily dropped into any business workflow with a common API. Rather than accumulating tech debt, workflow engines allow you to accumulate a set of useful lego bricks."]}),"\n",(0,o.jsxs)(s.p,{children:["In most existing organizations there's a long list of API calls required to simply ",(0,o.jsx)(s.em,{children:"run"})," a workflow.  Training engineers to use all of the new APIs while securely distributing access and permissions causes confusion and slow development cycles.  Workflow engines provide a single API and single system that allows anyone to securely manage, run, and operate complex workflows."]}),"\n",(0,o.jsx)(s.h3,{id:"mission-critical-oversight",children:"Mission Critical Oversight"}),"\n",(0,o.jsxs)(s.p,{children:["Mission critical business workflows leave no room for technical failures and outages. However, as we discussed ",(0,o.jsx)(s.a,{href:"/blog/challenge-of-microservices#reliability-and-correctness",children:"last week"}),", the distributed nature of microservices means that technical failures are not likely but rather certain. LittleHorse provides retries and durable execution capabilities out of the box, removing the need to create complex infrastructure for cross-service transactions (such as dead-letter queues, Outbox tables, and the SAGA pattern)."]}),"\n",(0,o.jsxs)(s.p,{children:["Additionally, mission-critical processes must be ",(0,o.jsx)(s.em,{children:"audited"})," and ",(0,o.jsx)(s.em,{children:"observed"})," in a secure manner with proper access controls. LittleHorse supports this\u2014every step in a workflow is journaled, auditable, and searchable in our dashboard. When humans execute ",(0,o.jsx)(s.a,{href:"https://littlehorse.dev/docs/concepts/user-tasks",children:"User Tasks"}),", you can view an audit trail of when and to whom it was assigned and executed; you can see when each ",(0,o.jsx)(s.code,{children:"TaskRun"})," started, completed, and failed (and with what inputs). Our ",(0,o.jsx)(s.a,{href:"https://littlehorse.dev/docs/concepts/principals-and-tenants",children:"ACL's and Multi-Tenancy"}),' capabilities (and "Masked Data") ensure that the data remains accessible only to those who must see it.']}),"\n",(0,o.jsx)(s.h3,{id:"simple-asynchronous-processing",children:"Simple Asynchronous Processing"}),"\n",(0,o.jsx)(s.p,{children:"For microservice developers, handling asynchronous business processes is challenging because it forces you to persist state, correlate events, and wire together callbacks into a non-linear flow. Developers often need to create database tables for ongoing transactions and maintain complex flow diagrams showing how different services integrate with business events."}),"\n",(0,o.jsx)(s.p,{children:"However, LittleHorse provides two primitives to simplify this process:"}),"\n",(0,o.jsxs)(s.ol,{children:["\n",(0,o.jsxs)(s.li,{children:[(0,o.jsx)(s.a,{href:"https://littlehorse.dev/docs/concepts/external-events",children:(0,o.jsx)(s.strong,{children:"External Events"})})," allow workflows to block until something happens in the outside world, and then resume processing immediately thereafter."]}),"\n",(0,o.jsxs)(s.li,{children:[(0,o.jsx)(s.a,{href:"https://littlehorse.dev/docs/concepts/user-tasks",children:(0,o.jsx)(s.strong,{children:"User Tasks"})})," are like External Events but they model getting input from humans. User Tasks support reminders, assignment, groups, and users."]}),"\n"]}),"\n",(0,o.jsx)(s.p,{children:"Together, User Tasks and External Events allow developers to transform complex asynchronous flows (such as our e-commerce example when we wait for a customer to provide a new credit card) into a more manageable linear flow."}),"\n",(0,o.jsx)(s.h3,{id:"exception-handling",children:"Exception Handling"}),"\n",(0,o.jsx)(s.p,{children:"Finally, just as processes can fail at the technical level, they can also fail at the business level. As per our ongoing e-commerce example, cards can run out of funds, items go out of stock, customers can cancel orders while they are being processed."}),"\n",(0,o.jsx)(s.p,{children:'Handling any given exceptional case in a business workflow might involve actions in several different microservices. Without a workflow engine, therefore, each exceptional case results in more and more complex interdependencies in your microservices, creating the notoriously feared "Distributed Monolith."'}),"\n",(0,o.jsxs)(s.p,{children:["In contrast, with LittleHorse as your workflow orchestrator, the dependencies between microservices are mitigated and workflow concepts such as ",(0,o.jsx)(s.a,{href:"https://littlehorse.dev/docs/concepts/workflows#failure-handling",children:"Failure Handling"})," allow you to easily define rollbacks, SAGA patterns, and edge cases without introducing further accidental complexity into your microservices. This allows startups and enterprises alike to implement robust, enterprise-grade business applications without accumulating costly technical debt."]}),"\n",(0,o.jsx)(s.h2,{id:"conclusion",children:"Conclusion"}),"\n",(0,o.jsx)(s.p,{children:"For a variety of reasons, startups and enterprises alike may need to work with microservices despite the challenges they bring. Thankfully, workflow engines like LittleHorse can mitigate those problems by providing oversight into your entire process."}),"\n",(0,o.jsx)(s.p,{children:"At the LittleHorse Council, we are very excited about the upcoming 1.0 release. Over the next few weeks, we will:"}),"\n",(0,o.jsxs)(s.ul,{children:["\n",(0,o.jsx)(s.li,{children:"Complete additional load tests, chaos tests, and benchmarks in preparation for 1.0."}),"\n",(0,o.jsx)(s.li,{children:"Blog about how you can write an e-commerce workflow in LittleHorse with Python."}),"\n",(0,o.jsx)(s.li,{children:"Do final testing before we release!"}),"\n"]}),"\n",(0,o.jsxs)(s.p,{children:["And if you enjoyed this post, give us a star ",(0,o.jsx)(s.a,{href:"https://github.com/littlehorse-enterprises/littlehorse",children:"on GitHub"})," and try out ",(0,o.jsx)(s.a,{href:"https://littlehorse.dev/docs/developer-guide/install",children:"our quickstarts"})," to get going with LittleHorse in under 5 minutes."]})]})}function d(e={}){const{wrapper:s}={...(0,n.R)(),...e.components};return s?(0,o.jsx)(s,{...e,children:(0,o.jsx)(h,{...e})}):h(e)}},6216:(e,s,i)=>{i.d(s,{A:()=>o});const o=i.p+"assets/images/2024-08-27-complex-checkout-915172cb1dfafc0a3e9a7cc0b042ac3a.png"},459:(e,s,i)=>{i.d(s,{A:()=>o});const o=i.p+"assets/images/2024-08-28-lh-application-8847f083fce679fe41abec88d4375125.png"},8453:(e,s,i)=>{i.d(s,{R:()=>t,x:()=>a});var o=i(6540);const n={},r=o.createContext(n);function t(e){const s=o.useContext(r);return o.useMemo((function(){return"function"==typeof e?e(s):{...s,...e}}),[s,e])}function a(e){let s;return s=e.disableParentContext?"function"==typeof e.components?e.components(n):e.components||n:t(e.components),o.createElement(r.Provider,{value:s},e.children)}}}]);