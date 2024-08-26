"use strict";(self.webpackChunklh_site=self.webpackChunklh_site||[]).push([[6958],{1511:(e,i,t)=>{t.r(i),t.d(i,{assets:()=>l,contentTitle:()=>o,default:()=>h,frontMatter:()=>r,metadata:()=>a,toc:()=>c});var n=t(4848),s=t(8453);const r={slug:"promise-of-microservices",title:"The Promise of Microservices",authors:{name:"Colt McNealy",title:"Managing Member of the LLC",url:"https://www.linkedin.com/in/colt-mcnealy-900b7a148/",image_url:"https://avatars.githubusercontent.com/u/100447728"},tags:["tech-trends","microservices","littlehorse"]},o=void 0,a={permalink:"/blog/promise-of-microservices",source:"@site/blog/2024-08-22-promise-of-microservices.md",title:"The Promise of Microservices",description:"\x3c!-- ---",date:"2024-08-22T00:00:00.000Z",tags:[{label:"tech-trends",permalink:"/blog/tags/tech-trends"},{label:"microservices",permalink:"/blog/tags/microservices"},{label:"littlehorse",permalink:"/blog/tags/littlehorse"}],readingTime:7.29,hasTruncateMarker:!0,authors:[{name:"Colt McNealy",title:"Managing Member of the LLC",url:"https://www.linkedin.com/in/colt-mcnealy-900b7a148/",image_url:"https://avatars.githubusercontent.com/u/100447728",imageURL:"https://avatars.githubusercontent.com/u/100447728"}],frontMatter:{slug:"promise-of-microservices",title:"The Promise of Microservices",authors:{name:"Colt McNealy",title:"Managing Member of the LLC",url:"https://www.linkedin.com/in/colt-mcnealy-900b7a148/",image_url:"https://avatars.githubusercontent.com/u/100447728",imageURL:"https://avatars.githubusercontent.com/u/100447728"},tags:["tech-trends","microservices","littlehorse"]},unlisted:!1,nextItem:{title:"Releasing 0.9",permalink:"/blog/littlehorse-0.9-release"}},l={authorsImageUrls:[void 0]},c=[{value:"What are Microservices?",id:"what-are-microservices",level:2},{value:"Why Now?",id:"why-now",level:2},{value:"Increased Digitization",id:"increased-digitization",level:3},{value:"Cloud Elasticity",id:"cloud-elasticity",level:3},{value:"Why Microservices?",id:"why-microservices",level:2},{value:"Organizational Alignment",id:"organizational-alignment",level:3},{value:"Moving Faster",id:"moving-faster",level:3},{value:"Conclusion",id:"conclusion",level:2}];function d(e){const i={a:"a",admonition:"admonition",code:"code",em:"em",h2:"h2",h3:"h3",img:"img",li:"li",ol:"ol",p:"p",strong:"strong",ul:"ul",...(0,s.R)(),...e.components};return(0,n.jsxs)(n.Fragment,{children:[(0,n.jsx)(i.p,{children:"If microservices add so much complexity, why bother with the hassle? "}),"\n",(0,n.jsxs)(i.p,{children:["We've all ",(0,n.jsx)(i.em,{children:"heard of"})," microservices, but unless you've read copious amounts of Sam Newman and Adam Bellemare's writings, you might be wondering whether, when, and why you should adopt them. In this blog post, we will examine the halcyon land promised by microservices."]}),"\n",(0,n.jsxs)(i.admonition,{type:"info",children:[(0,n.jsx)(i.p,{children:"This is the first part of a 3-part blog series:"}),(0,n.jsxs)(i.ol,{children:["\n",(0,n.jsxs)(i.li,{children:[(0,n.jsx)(i.strong,{children:"[This Post]"})," The Promise of Microservices"]}),"\n",(0,n.jsxs)(i.li,{children:[(0,n.jsx)(i.strong,{children:"[Coming Soon]"})," The Challenge with Microservices"]}),"\n",(0,n.jsxs)(i.li,{children:[(0,n.jsx)(i.strong,{children:"[Coming Soon]"})," Workflow and Microservices: A Match Made in Heaven"]}),"\n"]})]}),"\n",(0,n.jsxs)(i.p,{children:["Microservices have been ",(0,n.jsx)(i.a,{href:"https://www.simform.com/blog/microservices-examples/",children:"deployed widely"})," across many large enterprises, most notably Netflix, Uber, Shopify, PayPal, and others. As we will discover throughout this blog series, a microservice architecture is mandatory once you reach a certain size of company, and it's probably overkill for a 12-person startup. The gray area inbetween is the interesting part!"]}),"\n",(0,n.jsx)(i.h2,{id:"what-are-microservices",children:"What are Microservices?"}),"\n",(0,n.jsx)(i.p,{children:'The term "microservices" refers to a software architecture wherein an enterprise application comprises a collection of small, loosely coupled, and independently deployable services (these small services are called "microservices" in contrast to larger monoliths). Each microservice focuses on a specific business capability and communicates with other services over a network, typically through API\'s, streaming platforms, or message queues.'}),"\n",(0,n.jsxs)(i.p,{children:["In practice, this means that a user interaction with an application (such as placing an order) might trigger actions that occur in ",(0,n.jsx)(i.em,{children:"many"})," small, independently-deployed software systems, such as:"]}),"\n",(0,n.jsxs)(i.ul,{children:["\n",(0,n.jsx)(i.li,{children:"A Notification service"}),"\n",(0,n.jsx)(i.li,{children:"An Inventory Management service"}),"\n",(0,n.jsx)(i.li,{children:"A Payments service"}),"\n",(0,n.jsx)(i.li,{children:"An Order History service"}),"\n"]}),"\n",(0,n.jsx)(i.p,{children:"From the user (client) perspective, one request is made (generally through a Load Balancer, API Gateway, or Ingress Controller) but that request may ping-pong between multiple back-end services and may also result in future actions being scheduled asynchronously:"}),"\n",(0,n.jsx)(i.p,{children:(0,n.jsx)(i.img,{alt:"Microservices Architecture",src:t(5375).A+"",width:"861",height:"962"})}),"\n",(0,n.jsxs)(i.p,{children:["In contrast to microservices, a ",(0,n.jsx)(i.em,{children:"monolithic"}),' architecture would serve the entire "place order" request on a single deployable artifact:']}),"\n",(0,n.jsx)(i.p,{children:(0,n.jsx)(i.img,{alt:"Monolithic Architecture",src:t(153).A+"",width:"250",height:"499"})}),"\n",(0,n.jsx)(i.p,{children:"In Domain Driven Design, accidental complexity refers to the unintentional complexity that you introduced to your architecture (deployments, service interactions, third-party dependencies, etc.). Rule #1 of maintaining software systems is to avoid introducing accidental complexity as much as possible."}),"\n",(0,n.jsx)(i.p,{children:"Simply by looking at the visuals above, microservices add a significant dose of accidental complexity to your architecture (more on this in next week's post!). Given that, what benefits would make up for the extra complexity introduced by microservices?"}),"\n",(0,n.jsx)(i.h2,{id:"why-now",children:"Why Now?"}),"\n",(0,n.jsx)(i.p,{children:"I would be first to admit that microservices bring with them a series of headaches around cost, observability, maintenance, and ease of evolution (otherwise, I would not have founded LittleHorse Enterprises!). However, microservice architecture plays a vital role in addressing two critical trends reshaping the software development landscape today:"}),"\n",(0,n.jsxs)(i.ul,{children:["\n",(0,n.jsx)(i.li,{children:"Increased digitization of companies in all business sectors (accelerated by the rise of AI)."}),"\n",(0,n.jsx)(i.li,{children:"Elasticity of cloud computing."}),"\n"]}),"\n",(0,n.jsx)(i.h3,{id:"increased-digitization",children:"Increased Digitization"}),"\n",(0,n.jsx)(i.p,{children:"The level of digitization expected of businesses in order to compete in the modern market has drastically increased: IT teams must build software that interfaces with an ever-expanding list of external API's, legacy systems, user interfaces, internal tools, and SaaS providers."}),"\n",(0,n.jsxs)(i.p,{children:["For example: in the early 2000's, it was perfectly acceptable (even ",(0,n.jsx)(i.em,{children:"expected"}),") for a passenger to book airline tickets over the telephone or through a travel agency. However, such an experience would be unheard of today and would immediately hobble an airline who provided such poor digital services."]}),"\n",(0,n.jsx)(i.p,{children:"In addition to using automation to provide better customer services, companies are generating, processing, and analyzing massive amounts of data. For example, grocery stores with razor-thin margins analyze seasonal consumption patterns in order to optimize inventory and prevent costly food waste."}),"\n",(0,n.jsxs)(i.p,{children:["These trends have coincided with (or ",(0,n.jsx)(i.em,{children:"caused"}),", I would argue) a proliferation in the number of 1) software developers, and 2) software tools and API's found within companies in all industries, leading to two new problems:"]}),"\n",(0,n.jsxs)(i.ol,{children:["\n",(0,n.jsx)(i.li,{children:"Allowing large teams of software developers to productively work on an enterprise application in parallel (without stepping on each others' toes)."}),"\n",(0,n.jsx)(i.li,{children:"Ensuring that business requirements are effectively communicated to the entire (larger) software engineering team."}),"\n"]}),"\n",(0,n.jsx)(i.h3,{id:"cloud-elasticity",children:"Cloud Elasticity"}),"\n",(0,n.jsx)(i.p,{children:"As the importance and quantity of digital software systems exploded over the last two decades, so has the availability of nearly-infinite compute power delivered through cloud infrastructure providers such as AWS."}),"\n",(0,n.jsxs)(i.p,{children:["The promise of ",(0,n.jsx)(i.em,{children:"elasticity"}),", or the ability to quickly spin compute resources up or down according to load and only pay for what you use, is unique to the cloud: for on-prem datacenters, spinning up new compute means buying new machines from Sun Microsystems (hopefully not Microsoft!), and scaling down compute means trying to sell them off on the secondary market. (Ask my father about how that went for a lot of people in 2001.)"]}),"\n",(0,n.jsx)(i.p,{children:'Beyond scaling up and down, elasticity enables different deployment patterns that did not exist before. Whereas pre-cloud enterprises had dedicated and centralized data-center teams who were in charge of running applications, the accessibility of cloud computing gave rise to the DevOps movement. This has empowered smaller teams of software developers to take on the task of transferring software from "it works on my laptop!" to "it\'s now deployed in production!"'}),"\n",(0,n.jsx)(i.h2,{id:"why-microservices",children:"Why Microservices?"}),"\n",(0,n.jsx)(i.p,{children:"Despite the extra complexity it brings, the microservice architecture can more than pay for itself by ensuring organizational alignment and allowing enterprise architectures to take full advantage of the cloud's elasticity."}),"\n",(0,n.jsx)(i.h3,{id:"organizational-alignment",children:"Organizational Alignment"}),"\n",(0,n.jsx)(i.p,{children:"As discussed earlier, the business problems that software engineering organizations must solve today dwarf those that were solved in the 1990's, and so do the software engineering teams that tackle those problems."}),"\n",(0,n.jsx)(i.admonition,{type:"note",children:(0,n.jsxs)(i.p,{children:["I am not belittling the engineers of the 90's; the problems they solved were arguably ",(0,n.jsx)(i.em,{children:"much harder"})," than the problems we face today, and there were fewer engineers to face those problems. However, it is a fact that users expect more digital-native experiences today than they did twenty years ago."]})}),"\n",(0,n.jsx)(i.p,{children:"By breaking applications into smaller services, we can accomplish several important things:"}),"\n",(0,n.jsxs)(i.ul,{children:["\n",(0,n.jsx)(i.li,{children:"Break up our software engineering team into smaller teams which are each responsible for individual microservices."}),"\n",(0,n.jsx)(i.li,{children:"Allow different components of a system to be developed with separate tech stacks and released independently."}),"\n"]}),"\n",(0,n.jsx)(i.p,{children:'Engineering teams of over a few dozen engineers working on the same deployable piece of software is a recipe for inefficiency. Merge conflicts, arguments over tech stack, slow "release trains," and excessive intra-team coordination are just a few problems that arise. However, by breaking your application into smaller microservices, you can also break up your engineering organization into smaller, more efficient teams each in charge of a small number (prefably one!) of microservices.'}),"\n",(0,n.jsxs)(i.p,{children:["As an added benefit, properly-designed microservice architectures can follow the principles of Domain Driven Design. Ideally, a single microservice corresponds to a ",(0,n.jsx)(i.em,{children:"Bounded Context"})," inside the business. This enables a small piece of the technical platform (a microservice) to be managed by a small team of software engineers, who collaborate closely with subject-matter experts and business stakeholders within a very specific domain of the business. Such close collaboration can foster better alignment between business goals and the software produced by engineering teams."]}),"\n",(0,n.jsx)(i.h3,{id:"moving-faster",children:"Moving Faster"}),"\n",(0,n.jsx)(i.p,{children:"Microservices can allow developers to move faster by enabling continuous delivery and independent deployment of services. In a monolithic architecture, releasing a new feature or fixing a bug typically requires redeploying the entire application. Since microservices allow smaller pieces of your application to be deployed independently, engineering teams can iterate faster and deliver incremental value to business stakeholders."}),"\n",(0,n.jsxs)(i.p,{children:["These positive effects are amplified by the advent of cloud computing. Since deploying a new application no longer requires buying a physical machine and plugging it into your datacenter but rather just applying a new ",(0,n.jsx)(i.code,{children:"Deployment"})," and ",(0,n.jsx)(i.code,{children:"Service"})," on a Kubernetes cluster, it is now truly feasible for small teams of software engineers to own their application stack from laptop-to-production (obviously, within the guardrails set by the central platform team). Furthermore, cloud computing is a pay-as-you-go (and often even pay-for-what-you-use) expense rather than an up-front cost. Therefore, the dollar cost of infrastructure required to support microservices is much lower today than it would have been before the advent of cloud computing and kubernetes."]}),"\n",(0,n.jsx)(i.h2,{id:"conclusion",children:"Conclusion"}),"\n",(0,n.jsxs)(i.p,{children:["The microservice architecture is not just a Twitter-driven buzzword but rather a way of designing system that has several real advantages. For most organizations with over two dozen software engineers, building applications with microservices is not an option but rather a ",(0,n.jsx)(i.em,{children:"necessity"}),". However, those advantages come with a cost."]}),"\n",(0,n.jsxs)(i.p,{children:["We will discuss those challenges in next week's blog post...in the meantime, though, join our ",(0,n.jsx)(i.a,{href:"https://launchpass.com/littlehorsecommunity",children:"Community Slack"})," to get the latest updates!"]})]})}function h(e={}){const{wrapper:i}={...(0,s.R)(),...e.components};return i?(0,n.jsx)(i,{...e,children:(0,n.jsx)(d,{...e})}):d(e)}},5375:(e,i,t)=>{t.d(i,{A:()=>n});const n=t.p+"assets/images/2024-08-22-microservices-arch-2389e95f878235ea53f0c0afa2eea967.png"},153:(e,i,t)=>{t.d(i,{A:()=>n});const n=t.p+"assets/images/2024-08-22-monolith-arch-894351f807fd64060d9d05380fc799cf.png"},8453:(e,i,t)=>{t.d(i,{R:()=>o,x:()=>a});var n=t(6540);const s={},r=n.createContext(s);function o(e){const i=n.useContext(r);return n.useMemo((function(){return"function"==typeof e?e(i):{...i,...e}}),[i,e])}function a(e){let i;return i=e.disableParentContext?"function"==typeof e.components?e.components(s):e.components||s:o(e.components),n.createElement(r.Provider,{value:i},e.children)}}}]);