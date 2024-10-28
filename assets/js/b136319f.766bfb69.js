"use strict";(self.webpackChunklh_site=self.webpackChunklh_site||[]).push([[7762],{7393:(e,n,t)=>{t.r(n),t.d(n,{assets:()=>l,contentTitle:()=>a,default:()=>h,frontMatter:()=>i,metadata:()=>o,toc:()=>c});var s=t(4848),r=t(8453);const i={slug:"saga-pattern",authors:["coltmcnealy"],tags:["analysis","integration-patterns","littlehorse"]},a="Integration Patterns: Saga Transactions",o={permalink:"/blog/saga-pattern",source:"@site/blog/2024-09-24-saga-pattern.md",title:"Integration Patterns: Saga Transactions",description:"The Saga pattern allows you to defend against data loss, dropped orders, and confused (or grumpy) customers. While useful, the Saga pattern is tricky to get right without an orchestrator.",date:"2024-09-24T00:00:00.000Z",tags:[{inline:!1,label:"Technical Analysis",permalink:"/blog/tags/analysis/",description:"Analysis of the current and future state of Technical Architecture."},{inline:!1,label:"Integration Patterns",permalink:"/blog/tags/integration-patterns/",description:"A 5-part blog series on Integration Patterns that are useful for event-driven systems."},{inline:!1,label:"LittleHorse Orchestrator",permalink:"/blog/tags/littlehorse/",description:"Information about the LittleHorse Orchestrator."}],readingTime:6.215,hasTruncateMarker:!0,authors:[{name:"Colt McNealy",title:"Managing Member of the LLC",description:"Colt is the founder of LittleHorse Enterprises and the original author of the LittleHorse Orchestrator. He's a passionate Apache Kafka fan and loves hockey, golf, piano, cooking, and Taekwondo.",page:{permalink:"/blog/authors/coltmcnealy"},socials:{github:"https://github.com/coltmcnealy-lh",linkedin:"https://www.linkedin.com/in/colt-mcnealy-900b7a148/",x:"https://x.com/coltmcnealy"},imageURL:"https://avatars.githubusercontent.com/u/100447728",key:"coltmcnealy"}],frontMatter:{slug:"saga-pattern",authors:["coltmcnealy"],tags:["analysis","integration-patterns","littlehorse"]},unlisted:!1,prevItem:{title:"Integration Patterns: Transactional Outbox",permalink:"/blog/transactional-outbox"},nextItem:{title:"The Basics of Workflow",permalink:"/blog/basics-of-workflow"}},l={authorsImageUrls:[void 0]},c=[{value:"The Saga Pattern",id:"the-saga-pattern",level:2},{value:"Use Cases",id:"use-cases",level:3},{value:"Implementation",id:"implementation",level:3},{value:"Case Study: Order Processing",id:"case-study-order-processing",level:2},{value:"Using Message Queues",id:"using-message-queues",level:3},{value:"Using LittleHorse",id:"using-littlehorse",level:3},{value:"Wrapping Up",id:"wrapping-up",level:2},{value:"Get Involved!",id:"get-involved",level:3}];function d(e){const n={a:"a",admonition:"admonition",code:"code",em:"em",h2:"h2",h3:"h3",img:"img",li:"li",ol:"ol",p:"p",pre:"pre",strong:"strong",ul:"ul",...(0,r.R)(),...e.components};return(0,s.jsxs)(s.Fragment,{children:[(0,s.jsx)(n.p,{children:"The Saga pattern allows you to defend against data loss, dropped orders, and confused (or grumpy) customers. While useful, the Saga pattern is tricky to get right without an orchestrator."}),"\n",(0,s.jsxs)(n.admonition,{type:"info",children:[(0,s.jsx)(n.p,{children:"This is the first part in a five-part blog series on useful Integration Patterns. This blog series will help you build real-time, responsive applications and microservices that produce predictable results and prevent the Grumpy Customer Problem."}),(0,s.jsxs)(n.ol,{children:["\n",(0,s.jsxs)(n.li,{children:[(0,s.jsx)(n.strong,{children:"[This Post]"})," Saga Transactions"]}),"\n",(0,s.jsx)(n.li,{children:(0,s.jsx)(n.a,{href:"/blog/transactional-outbox",children:"The Transactional Outbox Pattern"})}),"\n",(0,s.jsx)(n.li,{children:(0,s.jsx)(n.a,{href:"/blog/queuing",children:"Queuing"})}),"\n",(0,s.jsx)(n.li,{children:"[Coming soon] Retries and Dead-Letter Queues"}),"\n",(0,s.jsx)(n.li,{children:"[Coming soon] Callbacks and External Events"}),"\n"]})]}),"\n",(0,s.jsx)(n.h2,{id:"the-saga-pattern",children:"The Saga Pattern"}),"\n",(0,s.jsxs)(n.p,{children:["At a technical level, the ",(0,s.jsx)(n.a,{href:"https://microservices.io/patterns/data/saga.html",children:"Saga Pattern"})," allows you to perform distributed transactions across multiple disparate systems without 2-phase commit."]}),"\n",(0,s.jsx)(n.p,{children:"In plain English, it is a tool in the belt of a software engineer to prevent half-fulfilled bank transfers, hanging orders, or other failures which would result in a Grumpy Customer."}),"\n",(0,s.jsx)(n.admonition,{type:"info",children:(0,s.jsx)(n.p,{children:'The "Saga" pattern gets its name from literature and film, wherein a "saga" is a series of chronologically-ordered related works. For example, the "Star Wars Saga."'})}),"\n",(0,s.jsx)(n.h3,{id:"use-cases",children:"Use Cases"}),"\n",(0,s.jsx)(n.p,{children:"Business processes often need to perform actions in two separate systems either all at once or not at all. For example, you may need to charge a customer's credit card, reserve inventory, and ship an item to the customer all at once or not at all. If the payment went through but shipping failed, we would see the Grumpy Customer Problem yet again."}),"\n",(0,s.jsx)(n.p,{children:"The Saga pattern is appropriate when:"}),"\n",(0,s.jsxs)(n.ul,{children:["\n",(0,s.jsx)(n.li,{children:"A business process must take action across multiple separate systems (legacy monoliths, microservices, external API's, etc),"}),"\n",(0,s.jsx)(n.li,{children:'Each of those actions can be undone via a "compensation task", and'}),"\n",(0,s.jsx)(n.li,{children:"All actions must logically happen together or not at all."}),"\n"]}),"\n",(0,s.jsx)(n.admonition,{type:"tip",children:(0,s.jsxs)(n.p,{children:["It's also worth noting that a different flavor of the Saga pattern can also be used in ",(0,s.jsx)(n.em,{children:"long-running"})," business processes. In a past job, for example, I worked on a project that implemented the Saga pattern to handle the scheduling of home inspections. In this case, the task of finding an inspector to show up at the home and confirming a time with the homeowner needed to be performed atomically."]})}),"\n",(0,s.jsx)(n.h3,{id:"implementation",children:"Implementation"}),"\n",(0,s.jsx)(n.p,{children:"While Saga is very hard to implement, it's simple to describe:"}),"\n",(0,s.jsxs)(n.ul,{children:["\n",(0,s.jsx)(n.li,{children:"Try to perform the actions across the multiple systems."}),"\n",(0,s.jsxs)(n.li,{children:["If one of the actions fails, then run a ",(0,s.jsx)(n.em,{children:"compensation"})," for all previously-executed tasks."]}),"\n"]}),"\n",(0,s.jsxs)(n.p,{children:["The ",(0,s.jsx)(n.em,{children:"compensation"}),' is simply an action that "undoes" the previous action. For example, the compensation for a payment task might be to issue a refund.']}),"\n",(0,s.jsx)(n.h2,{id:"case-study-order-processing",children:"Case Study: Order Processing"}),"\n",(0,s.jsxs)(n.p,{children:["Let's take a look at a familiar use-case: an order processing workflow involving the ",(0,s.jsx)(n.code,{children:"inventory"})," service, and the ",(0,s.jsx)(n.code,{children:"payments"})," service. (The ",(0,s.jsx)(n.code,{children:"orders"})," service is involved implicitly.) As they would in a real world scenario, all of our services live on separate physical systems and have their own databases."]}),"\n",(0,s.jsx)(n.p,{children:"In this business process, we first reserve inventory for the ordered item. Next, we charge the customer's credit card."}),"\n",(0,s.jsx)(n.p,{children:"If charging the credit card fails, then we have a problem: we've reserved inventory but not sold it."}),"\n",(0,s.jsxs)(n.p,{children:["Our services need the following functionality. In SOA, these would be endpoints; in LittleHorse, they would be ",(0,s.jsx)(n.code,{children:"TaskDef"}),"s:"]}),"\n",(0,s.jsxs)(n.ul,{children:["\n",(0,s.jsxs)(n.li,{children:[(0,s.jsx)(n.code,{children:"create-order"}),": creates an order in the ",(0,s.jsx)(n.code,{children:"PENDING"})," status."]}),"\n",(0,s.jsxs)(n.li,{children:[(0,s.jsx)(n.code,{children:"reserve-inventory"}),": marks an item as no longer available for sale."]}),"\n",(0,s.jsxs)(n.li,{children:[(0,s.jsx)(n.code,{children:"charge-payment"}),": charges the customer."]}),"\n",(0,s.jsxs)(n.li,{children:[(0,s.jsx)(n.code,{children:"release-inventory"}),": marks an item as available for sale again."]}),"\n",(0,s.jsxs)(n.li,{children:[(0,s.jsx)(n.code,{children:"cancel-order"}),": marks an order as ",(0,s.jsx)(n.code,{children:"CANCELED"}),"."]}),"\n",(0,s.jsxs)(n.li,{children:[(0,s.jsx)(n.code,{children:"complete-order"}),": marks an order as ",(0,s.jsx)(n.code,{children:"COMPLETED"}),"."]}),"\n"]}),"\n",(0,s.jsx)(n.h3,{id:"using-message-queues",children:"Using Message Queues"}),"\n",(0,s.jsx)(n.p,{children:"Using message queues, the happy path looks like the following:"}),"\n",(0,s.jsx)(n.p,{children:(0,s.jsx)(n.img,{alt:"Architecture diagram",src:t(4719).A+"",width:"544",height:"493"})}),"\n",(0,s.jsx)(n.admonition,{type:"note",children:(0,s.jsxs)(n.p,{children:["The above image assumes the ",(0,s.jsx)(n.em,{children:"choreography"})," pattern, in contrast to the ",(0,s.jsx)(n.em,{children:"orchestrator"})," pattern. The orchestrator pattern is a ton of work and involves writing something that very much resembles LittleHorse!"]})}),"\n",(0,s.jsxs)(n.ol,{children:["\n",(0,s.jsxs)(n.li,{children:["Orders service calls ",(0,s.jsx)(n.code,{children:"createOrder()"}),"."]}),"\n",(0,s.jsxs)(n.li,{children:["Orders service publishes to the ",(0,s.jsx)(n.code,{children:"reserve-inventory"})," queue."]}),"\n",(0,s.jsxs)(n.li,{children:["Inventory service reads the message and calls ",(0,s.jsx)(n.code,{children:"reserveInventory()"}),"."]}),"\n",(0,s.jsxs)(n.li,{children:["Inventory service publishes to the ",(0,s.jsx)(n.code,{children:"charge-payment"})," queue."]}),"\n",(0,s.jsx)(n.li,{children:"Payment service charges the credit card."}),"\n",(0,s.jsxs)(n.li,{children:["Payment service publishes to the ",(0,s.jsx)(n.code,{children:"complete-order"})," queue."]}),"\n",(0,s.jsxs)(n.li,{children:["Orders service consumes the record and calls ",(0,s.jsx)(n.code,{children:"completeOrder()"}),"."]}),"\n"]}),"\n",(0,s.jsx)(n.p,{children:"In just the happy path, we have strong coupling already between our services in three places, and we have three message queues to manage."}),"\n",(0,s.jsx)(n.p,{children:"But now we need to release the inventory and cancel the order when the payment doesn't go through. So the flow looks like this:"}),"\n",(0,s.jsx)(n.p,{children:(0,s.jsx)(n.img,{alt:"Architecture Diagram",src:t(8525).A+"",width:"712",height:"493"})}),"\n",(0,s.jsxs)(n.ol,{children:["\n",(0,s.jsxs)(n.li,{children:["Orders service calls ",(0,s.jsx)(n.code,{children:"createOrder()"}),"."]}),"\n",(0,s.jsxs)(n.li,{children:["Orders service publishes to the ",(0,s.jsx)(n.code,{children:"reserve-inventory"})," queue."]}),"\n",(0,s.jsxs)(n.li,{children:["Inventory service reads the message and calls ",(0,s.jsx)(n.code,{children:"reserveInventory()"}),"."]}),"\n",(0,s.jsxs)(n.li,{children:["Inventory service publishes to the ",(0,s.jsx)(n.code,{children:"charge-payment"})," queue."]}),"\n",(0,s.jsxs)(n.li,{children:["Payment service charges the credit card ",(0,s.jsx)(n.em,{children:"unsuccessfully"}),"."]}),"\n",(0,s.jsxs)(n.li,{children:["Payment service publishes to the ",(0,s.jsx)(n.code,{children:"release-inventory"})," queue."]}),"\n",(0,s.jsxs)(n.li,{children:["Inventory service reads the record and calls ",(0,s.jsx)(n.code,{children:"releaseInventory()"}),"."]}),"\n",(0,s.jsxs)(n.li,{children:["Inventory service publishes to the ",(0,s.jsx)(n.code,{children:"cancel-order"})," queue."]}),"\n",(0,s.jsxs)(n.li,{children:["Orders service consumes the record and calls ",(0,s.jsx)(n.code,{children:"cancelOrder()"}),"."]}),"\n"]}),"\n",(0,s.jsx)(n.admonition,{type:"note",children:(0,s.jsxs)(n.p,{children:["We still haven't even considered the case when the ",(0,s.jsx)(n.code,{children:"reserve-inventory"})," step fails and we need to catch that exception and handle the order. For the sake of brevity, we will leave that out."]})}),"\n",(0,s.jsxs)(n.p,{children:["Now, we have ",(0,s.jsx)(n.em,{children:"five"})," different message queues that we have to wrangle with. We can also see that the overall business flow has started to leak across all of our different services."]}),"\n",(0,s.jsx)(n.admonition,{type:"danger",children:(0,s.jsxs)(n.p,{children:["One thing we are ignoring in this blog post is ",(0,s.jsx)(n.em,{children:"reliability"}),": to make this setup production-ready, we would also have to ensure that updates to the internal databases of the services are atomic along with pushing messages to the message queue. We will cover that in next week's post (along with how LittleHorse takes care of that for you)."]})}),"\n",(0,s.jsx)(n.h3,{id:"using-littlehorse",children:"Using LittleHorse"}),"\n",(0,s.jsxs)(n.p,{children:["Using LittleHorse, in java, this whole workflow could look like the following. This is ",(0,s.jsx)(n.em,{children:"real code"})," that does indeed compile and replaces the need for all of the complex queueing logic we had above."]}),"\n",(0,s.jsx)(n.pre,{children:(0,s.jsx)(n.code,{className:"language-java",children:'public void sagaExample(WorkflowThread wf) {\n    var item = wf.addVariable("item", STR);\n    var customer = wf.addVariable("customer", STR);\n    var price = wf.addVariable("price", DOUBLE);\n    var orderId = wf.addVariable("order-id", STR);\n\n    wf.execute("create-order", orderId);\n\n    // Saga Here! (We skipped this part in the previous section due to\n    // complexity, but LH makes it simple enough.\n    NodeOutput inventoryResult = wf.execute("reserve-inventory", item, orderId);\n    wf.handleException(inventoryResult, "out-of-stock", handler -> {\n        handler.execute("cancel-order", orderId);\n        handler.fail("out-of-stock", "Item was out of stock. Order canceled");\n    })\n\n    NodeOutput paymentResult = wf.execute("charge-payment", customer, price);\n    // Saga here again!!\n    wf.handleException(paymentResult, "credit-card-declined", handler -> {\n        handler.execute("release-inventory", item, orderId);\n        handler.execute("cancel-order", orderId);\n        handler.fail("credit-card-declined", "Credit card was declined. Order canceled!");\n    });\n\n    wf.execute("complete-order", orderId);\n}\n'})}),"\n",(0,s.jsxs)(n.p,{children:["Instead of managing five message queues and five strongly-coupled integration points between microservices, all we need to do is register the workflow, define ",(0,s.jsx)(n.em,{children:"truly"})," modular tasks, and let LittleHorse take care of the rest."]}),"\n",(0,s.jsx)(n.h2,{id:"wrapping-up",children:"Wrapping Up"}),"\n",(0,s.jsxs)(n.p,{children:["The Saga Pattern is one of five tools we will cover in this series on avoiding the Grumpy Customer Problem. It's simple to understand but ",(0,s.jsx)(n.em,{children:"painfully complex"})," to implement. Fortunately, LittleHorse makes it easier!"]}),"\n",(0,s.jsxs)(n.admonition,{type:"note",children:[(0,s.jsxs)(n.p,{children:["A careful reader, or anyone who ",(0,s.jsx)(n.a,{href:"https://www.linkedin.com/feed/update/urn:li:activity:7244572885179121664/",children:"reads my rants on LinkedIn"}),", might note that in order to make the order processing workflow truly reliable, we would also need to do something like the Outbox pattern or Event Sourcing."]}),(0,s.jsx)(n.p,{children:"That is true, and we'll cover it in the next post (and you'll see how LittleHorse does that for you automatically!)."})]}),"\n",(0,s.jsx)(n.h3,{id:"get-involved",children:"Get Involved!"}),"\n",(0,s.jsx)(n.p,{children:"Stay tuned for the next post on the Transactional Outbox Pattern! In the meantime:"}),"\n",(0,s.jsxs)(n.ul,{children:["\n",(0,s.jsxs)(n.li,{children:["Try out our ",(0,s.jsx)(n.a,{href:"https://littlehorse.dev/docs/developer-guide/install",children:"Quickstarts"})]}),"\n",(0,s.jsxs)(n.li,{children:["Join us ",(0,s.jsx)(n.a,{href:"https://launchpass.com/littlehorsecommunity",children:"on Slack"})]}),"\n",(0,s.jsxs)(n.li,{children:["Give us a star ",(0,s.jsx)(n.a,{href:"https://github.com/littlehorse-enterprises/littlehorse",children:"on GitHub"}),"!"]}),"\n"]})]})}function h(e={}){const{wrapper:n}={...(0,r.R)(),...e.components};return n?(0,s.jsx)(n,{...e,children:(0,s.jsx)(d,{...e})}):d(e)}},8525:(e,n,t)=>{t.d(n,{A:()=>s});const s=t.p+"assets/images/2024-09-24-choreography-saga-b400a44518ce7213d491df50bad0bb72.png"},4719:(e,n,t)=>{t.d(n,{A:()=>s});const s=t.p+"assets/images/2024-09-24-choreography-simple-830e1fcf682eb3cde8b40210f92b3dd2.png"},8453:(e,n,t)=>{t.d(n,{R:()=>a,x:()=>o});var s=t(6540);const r={},i=s.createContext(r);function a(e){const n=s.useContext(i);return s.useMemo((function(){return"function"==typeof e?e(n):{...n,...e}}),[n,e])}function o(e){let n;return n=e.disableParentContext?"function"==typeof e.components?e.components(r):e.components||r:a(e.components),s.createElement(i.Provider,{value:n},e.children)}}}]);