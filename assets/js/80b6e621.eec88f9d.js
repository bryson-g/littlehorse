"use strict";(self.webpackChunklh_site=self.webpackChunklh_site||[]).push([[6309],{3308:(e,s,t)=>{t.r(s),t.d(s,{assets:()=>d,contentTitle:()=>o,default:()=>h,frontMatter:()=>i,metadata:()=>c,toc:()=>a});var n=t(4848),r=t(8453);const i={},o="Tasks",c={id:"concepts/tasks",title:"Tasks",description:"A WfSpec defines a series of steps in a process to be orchestrated by LittleHorse (in technical terms, each step is a Node). The most common type of step to execute is a TaskNode.",source:"@site/docs/04-concepts/03-tasks.md",sourceDirName:"04-concepts",slug:"/concepts/tasks",permalink:"/docs/concepts/tasks",draft:!1,unlisted:!1,tags:[],version:"current",sidebarPosition:3,frontMatter:{},sidebar:"tutorialSidebar",previous:{title:"Workflows",permalink:"/docs/concepts/workflows"},next:{title:"External Events and Interrupts",permalink:"/docs/concepts/external-events"}},d={},a=[{value:"Task Structure",id:"task-structure",level:2},{value:"Executing Tasks",id:"executing-tasks",level:2},{value:"Task Logic",id:"task-logic",level:3},{value:"Deploying a Task Worker",id:"deploying-a-task-worker",level:3},{value:"<code>TaskRun</code> LifeCycle",id:"taskrun-lifecycle",level:2},{value:"<code>TaskRun</code> Status",id:"taskrun-status",level:3},{value:"Retries and <code>TaskAttempt</code>",id:"retries-and-taskattempt",level:3},{value:"Interruptibility",id:"interruptibility",level:3}];function l(e){const s={a:"a",admonition:"admonition",code:"code",em:"em",h1:"h1",h2:"h2",h3:"h3",header:"header",img:"img",li:"li",p:"p",ul:"ul",...(0,r.R)(),...e.components};return(0,n.jsxs)(n.Fragment,{children:[(0,n.jsx)(s.header,{children:(0,n.jsx)(s.h1,{id:"tasks",children:"Tasks"})}),"\n",(0,n.jsxs)(s.p,{children:["A ",(0,n.jsx)(s.code,{children:"WfSpec"})," defines a series of steps in a process to be orchestrated by LittleHorse (in technical terms, each step is a ",(0,n.jsx)(s.code,{children:"Node"}),"). The most common type of step to execute is a ",(0,n.jsx)(s.a,{href:"/docs/api#tasknode",children:(0,n.jsx)(s.code,{children:"TaskNode"})}),"."]}),"\n",(0,n.jsx)(s.p,{children:(0,n.jsx)(s.img,{alt:"Output of a TaskRun",src:t(8924).A+"",width:"510",height:"272"})}),"\n",(0,n.jsx)(s.h2,{id:"task-structure",children:"Task Structure"}),"\n",(0,n.jsxs)(s.p,{children:["A unit of work executed by a computer in LittleHorse is represented by the dual objects ",(0,n.jsx)(s.code,{children:"TaskDef"})," and ",(0,n.jsx)(s.code,{children:"TaskRun"}),". A ",(0,n.jsx)(s.code,{children:"TaskDef"})," is a LittleHorse API Object which defines a certain type of task that can be executed by a computer. A ",(0,n.jsx)(s.code,{children:"TaskRun"})," is a LittleHorse API Object representing an instance of such a task being executed by a computer as part of a ",(0,n.jsx)(s.code,{children:"WfRun"}),"."]}),"\n",(0,n.jsx)(s.h2,{id:"executing-tasks",children:"Executing Tasks"}),"\n",(0,n.jsxs)(s.p,{children:["A Task Worker is a program written by a LittleHorse user that connects to the LH Server, polls for ",(0,n.jsx)(s.code,{children:"ScheduledTask"}),"s to execute, executes the Tasks, and returns the result to LittleHorse. Task Workers can be easily developed using the Task Worker SDK's in Java, GoLang, and Python according to our documentation ",(0,n.jsx)(s.a,{href:"/docs/developer-guide/task-worker-development",children:"here"}),"."]}),"\n",(0,n.jsxs)(s.p,{children:["When a ",(0,n.jsx)(s.code,{children:"ThreadRun"})," arrives at a ",(0,n.jsx)(s.code,{children:"TaskNode"}),", the LittleHorse Server puts a ",(0,n.jsx)(s.code,{children:"ScheduledTask"})," on a virtual Task Queue. The ",(0,n.jsx)(s.code,{children:"ThreadRun"})," blocks at that ",(0,n.jsx)(s.code,{children:"NodeRun"})," until a Task Worker pulls the ",(0,n.jsx)(s.code,{children:"ScheduledTask"})," off the Task Queue, executes it, and reports the result (or if the configured timeout expires)."]}),"\n",(0,n.jsxs)(s.p,{children:["Once the ",(0,n.jsx)(s.code,{children:"TaskRun"})," is completed, the output from the Task Worker's method invocation can be used by the workflow to mutate variables and control the flow of execution."]}),"\n",(0,n.jsx)(s.p,{children:"Task Workers open a web connection to the LittleHorse Server and do not need to receive connections on any ports. This has several benefits:"}),"\n",(0,n.jsxs)(s.ul,{children:["\n",(0,n.jsx)(s.li,{children:"Added security, since your systems do not need to accept any incoming connections."}),"\n",(0,n.jsxs)(s.li,{children:["Built-in throttling, since the LittleHorse Server only dispatches a ",(0,n.jsx)(s.code,{children:"ScheduledTask"})," to a Task Worker once the worker notifies the LH Server that it has capacity to perform a task."]}),"\n",(0,n.jsx)(s.li,{children:"Performance, since the protocol is based on grpc bi-directional streaming."}),"\n"]}),"\n",(0,n.jsx)(s.h3,{id:"task-logic",children:"Task Logic"}),"\n",(0,n.jsx)(s.p,{children:"The work performed by Task Workers can be incredibly diverse, ranging from charging a customer's credit card to fetching data from an API to deploying infrastructure (as in a devops pipeline). Our Java, Go, and Python SDK's provide utilities that allow you to easily convert a function or method into a Task Worker in five lines of code or less."}),"\n",(0,n.jsxs)(s.p,{children:["In short, a Task Worker can perform any arbitrary function in code. However, we recommend using Task Workers for processes that take on the order of seconds rather than minutes or hours. For longer-running tasks, we recommend using a TaskRun to kick the process off and an ",(0,n.jsx)(s.code,{children:"ExternalEvent"})," to note its completion."]}),"\n",(0,n.jsx)(s.h3,{id:"deploying-a-task-worker",children:"Deploying a Task Worker"}),"\n",(0,n.jsxs)(s.p,{children:["A Task Worker is any program that uses the Task Worker SDK's to execute ",(0,n.jsx)(s.code,{children:"TaskRun"}),"'s. LittleHorse is not opinionated about where or how the Task Worker is deployed: it can be a JVM process running on a bare metal server under a desk; it can be a docker container on ECS, or a Pod in Kubernetes."]}),"\n",(0,n.jsxs)(s.p,{children:["Additionally, a single process can run multiple Task Workers for different ",(0,n.jsx)(s.code,{children:"TaskDef"}),"'s at once. This is often useful if you want to take advantage of workflow-driven processes but you have no need for microservices and as such want to avoid managing multiple deployable artifacts."]}),"\n",(0,n.jsxs)(s.h2,{id:"taskrun-lifecycle",children:[(0,n.jsx)(s.code,{children:"TaskRun"})," LifeCycle"]}),"\n",(0,n.jsxs)(s.p,{children:["When a ",(0,n.jsx)(s.code,{children:"TaskRun"})," is created, the LH Server first assigns the ",(0,n.jsx)(s.code,{children:"input_variables"})," for that ",(0,n.jsx)(s.code,{children:"TaskRun"}),". The ",(0,n.jsx)(s.code,{children:"input_variables"})," of the ",(0,n.jsx)(s.code,{children:"TaskRun"})," must match up in terms of name and type with the ",(0,n.jsx)(s.code,{children:"input_vars"})," of the associated ",(0,n.jsx)(s.code,{children:"TaskDef"}),". This mirrors how the arguments to a function invocation in programming must match the method signature."]}),"\n",(0,n.jsxs)(s.p,{children:["For a ",(0,n.jsx)(s.code,{children:"TASK"})," ",(0,n.jsx)(s.code,{children:"NodeRun"}),", the output of the ",(0,n.jsx)(s.code,{children:"NodeRun"})," (for use with ",(0,n.jsx)(s.code,{children:"Variable"})," mutations) is determined by the output of the first successful ",(0,n.jsx)(s.code,{children:"TaskAttempt"}),"."]}),"\n",(0,n.jsxs)(s.h3,{id:"taskrun-status",children:[(0,n.jsx)(s.code,{children:"TaskRun"})," Status"]}),"\n",(0,n.jsxs)(s.p,{children:["A ",(0,n.jsx)(s.code,{children:"TaskRun"})," can be in any of the following statuses:"]}),"\n",(0,n.jsxs)(s.ul,{children:["\n",(0,n.jsxs)(s.li,{children:[(0,n.jsx)(s.code,{children:"TASK_SCHEDULED"}),": It has been scheduled but a Task Worker has not yet"]}),"\n",(0,n.jsxs)(s.li,{children:[(0,n.jsx)(s.code,{children:"TASK_RUNNING"}),": A Task Worker has received the Task but not yet reported the result."]}),"\n",(0,n.jsxs)(s.li,{children:[(0,n.jsx)(s.code,{children:"TASK_SUCCESS"}),": The ",(0,n.jsx)(s.code,{children:"TaskRun"})," was completed ","\ud83d\ude42"]}),"\n",(0,n.jsxs)(s.li,{children:[(0,n.jsx)(s.code,{children:"TASK_FAILED"}),": An unexpected error or exception was encountered."]}),"\n",(0,n.jsxs)(s.li,{children:[(0,n.jsx)(s.code,{children:"TASK_TIMEOUT"}),": The Task Worker did not report a result for the ",(0,n.jsx)(s.code,{children:"TaskRun"})," within the allotted timeout."]}),"\n",(0,n.jsxs)(s.li,{children:[(0,n.jsx)(s.code,{children:"TASK_OUTPUT_SERIALIZING_ERROR"}),": The Task Worker executed the ",(0,n.jsx)(s.code,{children:"TaskRun"})," but was unable to serialize the result when reporting back to the LH Server."]}),"\n",(0,n.jsxs)(s.li,{children:[(0,n.jsx)(s.code,{children:"TASK_INPUT_VAR_SUB_ERROR"}),": The LH Server was unable to calculate the input variables for the ",(0,n.jsx)(s.code,{children:"TaskRun"}),", or the Task Worker was unable to deserialize them and call the actual function."]}),"\n"]}),"\n",(0,n.jsxs)(s.h3,{id:"retries-and-taskattempt",children:["Retries and ",(0,n.jsx)(s.code,{children:"TaskAttempt"})]}),"\n",(0,n.jsxs)(s.p,{children:["A ",(0,n.jsx)(s.code,{children:"TaskRun"})," has a ",(0,n.jsx)(s.code,{children:"max_attempts"})," field which is used to determine the number of retries for a ",(0,n.jsx)(s.code,{children:"TaskRun"}),". This is determined by the ",(0,n.jsx)(s.code,{children:"TaskNode"})," structure."]}),"\n",(0,n.jsx)(s.admonition,{type:"note",children:(0,n.jsxs)(s.p,{children:["Multiple different ",(0,n.jsx)(s.code,{children:"Node"}),"s and even different ",(0,n.jsx)(s.code,{children:"WfSpec"}),"s can use the same ",(0,n.jsx)(s.code,{children:"TaskDef"}),". Since retries are configured at the ",(0,n.jsx)(s.code,{children:"TaskNode"})," level, it is possible for two ",(0,n.jsx)(s.code,{children:"TaskRun"}),"s of the same ",(0,n.jsx)(s.code,{children:"TaskDef"})," to have a different maximum number of retries."]})}),"\n",(0,n.jsxs)(s.p,{children:["When a ",(0,n.jsx)(s.code,{children:"TaskRun"})," is first created, a ",(0,n.jsx)(s.code,{children:"TaskAttempt"})," is also created. If the ",(0,n.jsx)(s.code,{children:"TaskAttempt"})," comes back with a ",(0,n.jsx)(s.code,{children:"TASK_SUCCESS"})," status, then great! The ",(0,n.jsx)(s.code,{children:"TaskRun"})," is completed, and if it is associated with a ",(0,n.jsx)(s.code,{children:"TASK"})," ",(0,n.jsx)(s.code,{children:"NodeRun"}),", then the output of the ",(0,n.jsx)(s.code,{children:"NodeRun"})," is just the output of the ",(0,n.jsx)(s.code,{children:"TaskAttempt"}),"."]}),"\n",(0,n.jsxs)(s.p,{children:["A ",(0,n.jsx)(s.code,{children:"TaskAttempt"})," is considered retryable if it ends with the following states:"]}),"\n",(0,n.jsxs)(s.ul,{children:["\n",(0,n.jsxs)(s.li,{children:[(0,n.jsx)(s.code,{children:"TASK_FAILED"}),", denoting an exception."]}),"\n",(0,n.jsxs)(s.li,{children:[(0,n.jsx)(s.code,{children:"TASK_TIMEOUT"}),", denoting that the Task Worker did not report the result of the ",(0,n.jsx)(s.code,{children:"TaskAttempt"})," in time."]}),"\n"]}),"\n",(0,n.jsxs)(s.p,{children:["If a ",(0,n.jsx)(s.code,{children:"TaskAttempt"})," is retryable and there are sufficient retries left, then another ",(0,n.jsx)(s.code,{children:"TaskAttempt"})," ",(0,n.jsxs)(s.em,{children:["within the same ",(0,n.jsx)(s.code,{children:"TaskRun"})]})," is created. If any of the retry ",(0,n.jsx)(s.code,{children:"TaskAttempt"}),"s succeed, then the output of the ",(0,n.jsx)(s.code,{children:"TASK"})," ",(0,n.jsx)(s.code,{children:"NodeRun"})," is the output of the first successful ",(0,n.jsx)(s.code,{children:"TaskAttempt"}),". If all fail, then ",(0,n.jsx)(s.code,{children:"NodeRun"})," fails."]}),"\n",(0,n.jsx)(s.h3,{id:"interruptibility",children:"Interruptibility"}),"\n",(0,n.jsxs)(s.p,{children:["A ",(0,n.jsx)(s.code,{children:"TaskRun"})," is considered interruptible if its current ",(0,n.jsx)(s.code,{children:"TaskAttempt"})," is interruptible. A ",(0,n.jsx)(s.code,{children:"TaskAttempt"})," is interruptible if it is in any of the following statuses:"]}),"\n",(0,n.jsxs)(s.ul,{children:["\n",(0,n.jsx)(s.li,{children:(0,n.jsx)(s.code,{children:"TASK_SUCCESS"})}),"\n",(0,n.jsx)(s.li,{children:(0,n.jsx)(s.code,{children:"TASK_FAILED"})}),"\n",(0,n.jsx)(s.li,{children:(0,n.jsx)(s.code,{children:"TASK_TIMEOUT"})}),"\n",(0,n.jsx)(s.li,{children:(0,n.jsx)(s.code,{children:"TASK_OUTPUT_SERIALIZING_ERROR"})}),"\n",(0,n.jsxs)(s.li,{children:[(0,n.jsx)(s.code,{children:"TASK_INPUT_VAR_SUB_ERROR"}),"."]}),"\n"]}),"\n",(0,n.jsxs)(s.p,{children:["A ",(0,n.jsx)(s.code,{children:"TaskAttempt"})," in the ",(0,n.jsx)(s.code,{children:"TASK_SCHEDULED"})," or ",(0,n.jsx)(s.code,{children:"TASK_RUNNING"})," state is not considered interruptible; the associated ",(0,n.jsx)(s.code,{children:"ThreadRun"})," will remain in the ",(0,n.jsx)(s.code,{children:"HALTING"})," state until the ",(0,n.jsx)(s.code,{children:"TaskAttempt"})," is reported (either success or failure) or is timed out."]}),"\n",(0,n.jsxs)(s.p,{children:["For more information, see the ",(0,n.jsxs)(s.a,{href:"/docs/concepts/workflows#threading-model",children:[(0,n.jsx)(s.code,{children:"ThreadRun"})," Lifecycle documentation"]}),"."]})]})}function h(e={}){const{wrapper:s}={...(0,r.R)(),...e.components};return s?(0,n.jsx)(s,{...e,children:(0,n.jsx)(l,{...e})}):l(e)}},8924:(e,s,t)=>{t.d(s,{A:()=>n});const n=t.p+"assets/images/task-output-54daa136c44fecf91a9e9eeb0035f878.png"},8453:(e,s,t)=>{t.d(s,{R:()=>o,x:()=>c});var n=t(6540);const r={},i=n.createContext(r);function o(e){const s=n.useContext(i);return n.useMemo((function(){return"function"==typeof e?e(s):{...s,...e}}),[s,e])}function c(e){let s;return s=e.disableParentContext?"function"==typeof e.components?e.components(r):e.components||r:o(e.components),n.createElement(i.Provider,{value:s},e.children)}}}]);