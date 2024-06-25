"use strict";(self.webpackChunklh_site=self.webpackChunklh_site||[]).push([[1872],{5724:(e,n,t)=>{t.r(n),t.d(n,{assets:()=>d,contentTitle:()=>c,default:()=>p,frontMatter:()=>i,metadata:()=>l,toc:()=>h});var r=t(4848),s=t(8453),o=t(1470),a=t(9365);const i={},c="Developing Task Workers",l={id:"developer-guide/task-worker-development",title:"Developing Task Workers",description:"Each LittleHorse SDK provides an LHTaskWorker object or struct which lets you turn an arbitrary function or method into a LittleHorse Task.",source:"@site/docs/05-developer-guide/05-task-worker-development.md",sourceDirName:"05-developer-guide",slug:"/developer-guide/task-worker-development",permalink:"/docs/developer-guide/task-worker-development",draft:!1,unlisted:!1,tags:[],version:"current",sidebarPosition:5,frontMatter:{},sidebar:"tutorialSidebar",previous:{title:"LittleHorse CLI",permalink:"/docs/developer-guide/lhctl"},next:{title:"WfSpec Development",permalink:"/docs/developer-guide/wfspec-development/"}},d={},h=[{value:"Quickstart",id:"quickstart",level:2},{value:"Advanced Usage",id:"advanced-usage",level:2},{value:"Throwing Workflow <code>EXCEPTION</code>s",id:"throwing-workflow-exceptions",level:3},{value:"Json Deserialization",id:"json-deserialization",level:3},{value:"Accessing Metadata",id:"accessing-metadata",level:3},{value:"Best Practices",id:"best-practices",level:2},{value:"Client ID",id:"client-id",level:3},{value:"Idempotence",id:"idempotence",level:3}];function u(e){const n={a:"a",admonition:"admonition",code:"code",em:"em",h1:"h1",h2:"h2",h3:"h3",li:"li",ol:"ol",p:"p",pre:"pre",ul:"ul",...(0,s.R)(),...e.components};return(0,r.jsxs)(r.Fragment,{children:[(0,r.jsx)(n.h1,{id:"developing-task-workers",children:"Developing Task Workers"}),"\n","\n",(0,r.jsxs)(n.p,{children:["Each LittleHorse SDK provides an ",(0,r.jsx)(n.code,{children:"LHTaskWorker"})," object or struct which lets you turn an arbitrary function or method into a LittleHorse Task."]}),"\n",(0,r.jsx)(n.h2,{id:"quickstart",children:"Quickstart"}),"\n",(0,r.jsxs)(n.p,{children:["The ",(0,r.jsx)(n.code,{children:"LHTaskWorker"})," object allows you to create and start a Task Worker in all three of our SDK's. Below, you will find compiler-ready programs that you can run which will:"]}),"\n",(0,r.jsxs)(n.ol,{children:["\n",(0,r.jsxs)(n.li,{children:["Register a ",(0,r.jsx)(n.code,{children:"TaskDef"})," called ",(0,r.jsx)(n.code,{children:"greet"})," which takes in one ",(0,r.jsx)(n.code,{children:"STR"})," variable as input."]}),"\n",(0,r.jsx)(n.li,{children:"Starts a Task Worker to poll the LH Cluster asking for a task to execute."}),"\n"]}),"\n",(0,r.jsxs)(o.A,{children:[(0,r.jsxs)(a.A,{value:"java",label:"Java",default:!0,children:[(0,r.jsx)(n.p,{children:"To create a Task Worker, you need to do the following:"}),(0,r.jsxs)(n.ol,{children:["\n",(0,r.jsxs)(n.li,{children:["Create an ",(0,r.jsx)(n.code,{children:"LHConfig"})," (see ",(0,r.jsx)(n.a,{href:"/docs/developer-guide/client-configuration",children:"this configuration documentation"}),")."]}),"\n",(0,r.jsxs)(n.li,{children:["Write a Task Worker class with an annotated ",(0,r.jsx)(n.code,{children:"@LHTaskMethod"})," method."]}),"\n",(0,r.jsxs)(n.li,{children:["Create an ",(0,r.jsx)(n.code,{children:"LHTaskWorker"})," object with your config and Task Worker Object"]}),"\n",(0,r.jsxs)(n.li,{children:["Register the ",(0,r.jsx)(n.code,{children:"TaskDef"})," with ",(0,r.jsx)(n.code,{children:"worker.registerTaskDef()"})]}),"\n",(0,r.jsxs)(n.li,{children:["And finally call ",(0,r.jsx)(n.code,{children:".start()"}),"."]}),"\n"]}),(0,r.jsxs)(n.p,{children:["Let's build a Task Worker for a ",(0,r.jsx)(n.code,{children:"TaskDef"})," named ",(0,r.jsx)(n.code,{children:"my-task"})," that takes in a String and returns a String. First, the Task Worker Object:"]}),(0,r.jsx)(n.pre,{children:(0,r.jsx)(n.code,{className:"language-java",children:'package io.littlehorse.quickstart;\n\nimport java.io.IOException;\nimport io.littlehorse.sdk.common.config.LHConfig;\nimport io.littlehorse.sdk.worker.LHTaskMethod;\nimport io.littlehorse.sdk.worker.LHTaskWorker;\n\nclass MyWorker {\n    @LHTaskMethod("greet")\n    public String greeting(String firstName) {\n        String result = "Hello there, " + firstName + "!";\n        System.out.println(result);\n        return result;\n    }\n}\n\npublic class Main {\n    public static void main(String[] args) throws IOException, InterruptedException {\n        LHConfig config = new LHConfig();\n\n        MyWorker executable = new MyWorker();\n        LHTaskWorker greetWorker = new LHTaskWorker(executable, "greet", config);\n        Runtime.getRuntime().addShutdownHook(new Thread(greetWorker::close));\n\n        greetWorker.registerTaskDef();\n\n        greetWorker.start();\n    }\n}\n'})}),(0,r.jsx)(n.admonition,{type:"tip",children:(0,r.jsxs)(n.p,{children:["The ",(0,r.jsx)(n.code,{children:"TaskDef"})," is generated by the ",(0,r.jsx)(n.code,{children:"registerTaskDef()"})," call. It uses reflection to determine the parameter names. If you provide the ",(0,r.jsx)(n.code,{children:"options.compilerArgs << '-parameters'"})," setting, the resulting TaskDef Variable Names will be more descriptive, rather than just ",(0,r.jsx)(n.code,{children:"argo"}),", ",(0,r.jsx)(n.code,{children:"arg1"}),"...",(0,r.jsx)(n.code,{children:"argn"}),"."]})})]}),(0,r.jsxs)(a.A,{value:"go",label:"Go",children:[(0,r.jsx)(n.p,{children:"To create a Task Worker, you need to do three things:"}),(0,r.jsxs)(n.ol,{children:["\n",(0,r.jsxs)(n.li,{children:["Create a ",(0,r.jsx)(n.code,{children:"common.LHConfig"})," (see ",(0,r.jsx)(n.a,{href:"/docs/developer-guide/client-configuration",children:"this configuration documentation"}),")."]}),"\n",(0,r.jsxs)(n.li,{children:["Write a GoLang ",(0,r.jsx)(n.code,{children:"func"})," which you will use as your Task Function."]}),"\n",(0,r.jsxs)(n.li,{children:["Use the ",(0,r.jsx)(n.code,{children:"taskworker.NewTaskWorker()"})," function to create an ",(0,r.jsx)(n.code,{children:"LHTaskWorker"})," with your config and Task Function."]}),"\n"]}),(0,r.jsxs)(n.p,{children:["At this point, you can use your ",(0,r.jsx)(n.code,{children:"LHTaskWorker"})," to register your ",(0,r.jsx)(n.code,{children:"TaskDef"})," and to start executing tasks."]}),(0,r.jsx)(n.pre,{children:(0,r.jsx)(n.code,{className:"language-go",children:'package main\n\nimport (\n\t"github.com/littlehorse-enterprises/littlehorse/sdk-go/common"\n\t"github.com/littlehorse-enterprises/littlehorse/sdk-go/taskworker"\n)\n\nfunc Greet(firstName string) string {\n\treturn "Hello there, " + firstName + "!"\n}\n\nfunc main() {\n\tconfig := common.NewConfigFromEnv()\n\tworker, _ := taskworker.NewTaskWorker(config, Greet, "greet")\n\n\tworker.RegisterTaskDef()\n\tworker.Start()\n}\n'})})]}),(0,r.jsxs)(a.A,{value:"python",label:"Python",children:[(0,r.jsx)(n.p,{children:"To create a Task Worker, you need to do the following:"}),(0,r.jsxs)(n.ol,{children:["\n",(0,r.jsxs)(n.li,{children:["Create an ",(0,r.jsx)(n.code,{children:"LHConfig"})," (see ",(0,r.jsx)(n.a,{href:"/docs/developer-guide/client-configuration",children:"this configuration documentation"}),")."]}),"\n",(0,r.jsxs)(n.li,{children:["Write an ",(0,r.jsx)(n.code,{children:"async"})," python function which you will use as your Task Function."]}),"\n",(0,r.jsxs)(n.li,{children:["Create and start an ",(0,r.jsx)(n.code,{children:"LHTaskWorker"})," with that function."]}),"\n"]}),(0,r.jsx)(n.p,{children:"Here is an example:"}),(0,r.jsx)(n.pre,{children:(0,r.jsx)(n.code,{className:"language-python",children:'import asyncio\nimport littlehorse\nfrom littlehorse.config import LHConfig\nfrom littlehorse.worker import LHTaskWorker\n\nasync def greeting(first_name: str) -> str:\n    msg = f"Hello there, {first_name}!"\n    print(msg)\n    return msg\n\n\nasync def main() -> None:\n    config = LHConfig()\n    worker = LHTaskWorker(greeting, "greet", config)\n    worker.register_task_def()\n\n    await asyncio.sleep(1.0)\n    await littlehorse.start(worker)\n\nif __name__ == "__main__":\n    asyncio.run(main())\n'})})]})]}),"\n",(0,r.jsx)(n.h2,{id:"advanced-usage",children:"Advanced Usage"}),"\n",(0,r.jsx)(n.p,{children:"The Task Worker library has some features that make advanced use cases easier."}),"\n",(0,r.jsxs)(n.h3,{id:"throwing-workflow-exceptions",children:["Throwing Workflow ",(0,r.jsx)(n.code,{children:"EXCEPTION"}),"s"]}),"\n",(0,r.jsxs)(n.p,{children:["As described in our ",(0,r.jsx)(n.a,{href:"/docs/concepts/exception-handling#business-exceptions",children:"Failure Handling Concept Docs"}),", LittleHorse distinguishes between technical ",(0,r.jsx)(n.code,{children:"ERROR"}),"s and business ",(0,r.jsx)(n.code,{children:"EXCEPTION"}),"s:"]}),"\n",(0,r.jsxs)(n.ul,{children:["\n",(0,r.jsxs)(n.li,{children:["A technical ",(0,r.jsx)(n.code,{children:"ERROR"})," denotes a technological failure, such as a Timeout caused by a network outage, or an unexpected error returned by your Task Worker."]}),"\n",(0,r.jsxs)(n.li,{children:["A Business ",(0,r.jsx)(n.code,{children:"EXCEPTION"})," represents an unhappy-path case in your business logic, such as when an item is out of stock or a credit card got declined."]}),"\n"]}),"\n",(0,r.jsxs)(n.p,{children:["If your Task Worker throws an uncaught error (depending on your language), then it is treated as a LittleHorse ",(0,r.jsx)(n.code,{children:"ERROR"})," with the error code ",(0,r.jsx)(n.code,{children:"LHErrorType.TASK_FAILURE"}),". However, sometimes your Task Worker notices that a business process-level failure (what LittleHorse calls an ",(0,r.jsx)(n.code,{children:"EXCEPTION"}),") has occurred. For example, the Task Worker could notice that a credit card got declined. In this case, you can make the ",(0,r.jsx)(n.code,{children:"TaskRun"})," throw a LittleHorse ",(0,r.jsx)(n.code,{children:"EXCEPTION"})," by using the ",(0,r.jsx)(n.code,{children:"LHTaskException"})," object."]}),"\n",(0,r.jsx)(n.admonition,{type:"info",children:(0,r.jsxs)(n.p,{children:["The LittleHorse ",(0,r.jsx)(n.code,{children:"EXCEPTION"})," result is NOT retryable. That means that if your Task Method throws an ",(0,r.jsx)(n.code,{children:"LHTaskException"}),", it will not be retried. If it throws any error/exception ",(0,r.jsx)(n.em,{children:"other than"})," the ",(0,r.jsx)(n.code,{children:"LHTaskException"}),", it will be treated as a LittleHorse ",(0,r.jsx)(n.code,{children:"ERROR"}),", which is retryable."]})}),"\n",(0,r.jsxs)(n.p,{children:["In the following example, we will throw the ",(0,r.jsx)(n.code,{children:"out-of-stock"})," user-defined business ",(0,r.jsx)(n.code,{children:"EXCEPTION"})," if the item is out of stock."]}),"\n",(0,r.jsxs)(o.A,{children:[(0,r.jsx)(a.A,{value:"java",label:"Java",default:!0,children:(0,r.jsx)(n.pre,{children:(0,r.jsx)(n.code,{className:"language-java",children:'package io.littlehorse.quickstart;\n\nimport io.littlehorse.sdk.common.exception.LHTaskException;\nimport io.littlehorse.sdk.worker.LHTaskMethod;\n\nclass MyWorker {\n    @LHTaskMethod("ship-item")\n    public String shipItem(String itemSku) {\n        if (isOutOfStock(itemSku)) {\n            throw new LHTaskException("out-of-stock", "Some human readable message");\n        }\n        return "Item " + itemSku + " successfully shipped!";\n    }\n}\n'})})}),(0,r.jsx)(a.A,{value:"go",label:"Go",children:(0,r.jsxs)(n.p,{children:["The Go SDK currently (as of ",(0,r.jsx)(n.code,{children:"0.10.0"}),") does not yet support throwing ",(0,r.jsx)(n.code,{children:"LHTaskException"}),"s."]})}),(0,r.jsx)(a.A,{value:"python",label:"Python",children:(0,r.jsx)(n.pre,{children:(0,r.jsx)(n.code,{className:"language-python",children:'from littlehorse.exceptions import LHTaskExceptio\n\nasync def ship_item(item_sku: str) -> str:\n    if is_out_of_stock():\n        raise LHTaskException("out-of-stock", "some descriptive message")\n\n    return f"successfully shipped {item_sku}!"\n'})})})]}),"\n",(0,r.jsxs)(n.p,{children:["The first argument to the ",(0,r.jsx)(n.code,{children:"LHTaskException"})," constructor is the ",(0,r.jsx)(n.em,{children:"name"})," of the ",(0,r.jsx)(n.code,{children:"EXCEPTION"})," we are going to throw. This is useful if you want to be able to catch specific ",(0,r.jsx)(n.code,{children:"EXCEPTION"}),"s with specific types in your ",(0,r.jsx)(n.a,{href:"/docs/developer-guide/wfspec-development/exception-handling",children:"Failure Handlers"}),". The second argument is a ",(0,r.jsx)(n.em,{children:"human-readable"})," error message that shows up on the ",(0,r.jsx)(n.code,{children:"NodeRun"}),"'s output as the ",(0,r.jsx)(n.code,{children:"error_message"})," field, which is useful for debugging purposes."]}),"\n",(0,r.jsxs)(n.p,{children:["If you want to throw a ",(0,r.jsx)(n.code,{children:"Failure"})," that has content which can be caught in your Failure Handler using the ",(0,r.jsx)(n.code,{children:"INPUT"})," variable name, you can use a ",(0,r.jsx)(n.em,{children:"third"})," argument named ",(0,r.jsx)(n.code,{children:"content"}),". It is optional in python and is available in an overloaded method signature in Java. The below is an example of how you might throw such an ",(0,r.jsx)(n.code,{children:"EXCEPTION"}),":"]}),"\n",(0,r.jsxs)(o.A,{children:[(0,r.jsx)(a.A,{value:"java",label:"Java",default:!0,children:(0,r.jsx)(n.pre,{children:(0,r.jsx)(n.code,{className:"language-java",children:'package io.littlehorse.quickstart;\n\nimport io.littlehorse.sdk.common.exception.LHTaskException;\nimport io.littlehorse.sdk.worker.LHTaskMethod;\n\nclass MyWorker {\n    @LHTaskMethod("ship-item")\n    public String shipItem(String itemSku) {\n        if (isOutOfStock(itemSku)) {\n            int daysUntilBackInStock = calculateDaysUntilBackInStock(itemSku);\n\n            // The `content` of the `Failure` that is thrown will be an INT variable containing\n            // the number of days until the item is expected to be back in stock.\n            throw new LHTaskException(\n                    "out-of-stock",\n                    "Some human readable message",\n                    daysUntilBackInStock);\n        }\n        return "Item " + itemSku + " successfully shipped!";\n    }\n}\n'})})}),(0,r.jsx)(a.A,{value:"go",label:"Go",children:(0,r.jsxs)(n.p,{children:["The Go SDK currently (as of ",(0,r.jsx)(n.code,{children:"0.10.0"}),") does not yet support throwing ",(0,r.jsx)(n.code,{children:"LHTaskException"}),"s."]})}),(0,r.jsx)(a.A,{value:"python",label:"Python",children:(0,r.jsx)(n.pre,{children:(0,r.jsx)(n.code,{className:"language-python",children:'from littlehorse import to_variable_value\nfrom littlehorse.exceptions import LHTaskException\n\nasync def ship_item(item_sku: str) -> None:\n    if is_out_of_stock(item_sku):\n        days_until_back_in_stock = get_days_until_back_in_stock(item_sku)\n        failure_content = to_variable_value(days_until_back_in_stock)\n        raise LHTaskException("out-of-stock", "some descriptive message", content=failure_content)\n\n    return f"successfully shipped {item_sku}!"\n'})})})]}),"\n",(0,r.jsx)(n.h3,{id:"json-deserialization",children:"Json Deserialization"}),"\n",(0,r.jsx)(n.p,{children:"In some SDK's, LittleHorse will automatically deserialize JSON variables into objects or structs for you."}),"\n",(0,r.jsxs)(o.A,{children:[(0,r.jsxs)(a.A,{value:"java",label:"Java",default:!0,children:[(0,r.jsxs)(n.p,{children:["Let's say we have a class ",(0,r.jsx)(n.code,{children:"MyCar"})," as follows:"]}),(0,r.jsx)(n.pre,{children:(0,r.jsx)(n.code,{className:"language-java",children:"class MyCar {\n    String make;\n    String model;\n\n    public MyCar(String make, String model) {\n        this.make = make;\n        this.model = model;\n    }\n\n    // getters, setters omitted\n}\n"})}),(0,r.jsxs)(n.p,{children:["And one of the ",(0,r.jsx)(n.code,{children:"Variable"}),"s (for example, ",(0,r.jsx)(n.code,{children:"my-obj"}),") in our ",(0,r.jsx)(n.code,{children:"WfSpec"})," is of type ",(0,r.jsx)(n.code,{children:"JSON_OBJ"}),"."]}),(0,r.jsxs)(n.p,{children:["Let's say there's a ",(0,r.jsx)(n.code,{children:"TaskDef"})," called ",(0,r.jsx)(n.code,{children:"json-example"})," with one input variable of type ",(0,r.jsx)(n.code,{children:"JSON_OBJ"}),". We can have a Task Worker defined as follows:"]}),(0,r.jsx)(n.pre,{children:(0,r.jsx)(n.code,{className:"language-java",children:'class MyWorker {\n\n    @LHTaskMethod("json-example")\n    public void executeTask(MyCar input) {\n        System.out.println(input.getMake());\n        System.out.println(input.getModel());\n    }\n}\n'})}),(0,r.jsxs)(n.p,{children:["The Library will deserialize the JSON from something like: ",(0,r.jsx)(n.code,{children:'{"make": "Ford", "model": "Explorer"}'})," to an actual ",(0,r.jsx)(n.code,{children:"MyCar"})," object."]})]}),(0,r.jsxs)(a.A,{value:"go",label:"Go",children:[(0,r.jsxs)(n.p,{children:["Let's say we have a struct ",(0,r.jsx)(n.code,{children:"MyCar"})," as follows:"]}),(0,r.jsx)(n.pre,{children:(0,r.jsx)(n.code,{className:"language-go",children:'car := &MyCar{\n    Make:  "Ford",\n    Model: "Explorer",\n}\n'})}),(0,r.jsxs)(n.p,{children:["And one of the ",(0,r.jsx)(n.code,{children:"Variable"}),"s (for example, ",(0,r.jsx)(n.code,{children:"my-obj"}),") in our ",(0,r.jsx)(n.code,{children:"WfSpec"})," is of type ",(0,r.jsx)(n.code,{children:"JSON_OBJ"}),"."]}),(0,r.jsxs)(n.p,{children:["Let's say there's a ",(0,r.jsx)(n.code,{children:"TaskDef"})," called ",(0,r.jsx)(n.code,{children:"json-example"})," with one input variable of type ",(0,r.jsx)(n.code,{children:"JSON_OBJ"}),". We can have a Task Function that looks like:"]}),(0,r.jsx)(n.pre,{children:(0,r.jsx)(n.code,{className:"language-go",children:'func MyTaskFunc(car *MyCar) string {\n    return "the make of your car is " + car.Make + "!"\n}\n'})}),(0,r.jsxs)(n.p,{children:["The Library will deserialize the JSON from something like: ",(0,r.jsx)(n.code,{children:'{"make": "Ford", "model": "Explorer"}'})," to an actual ",(0,r.jsx)(n.code,{children:"MyCar"})," struct."]})]}),(0,r.jsxs)(a.A,{value:"python",label:"Python",children:[(0,r.jsx)(n.p,{children:"Let's say we have a python Task Function as follows:"}),(0,r.jsx)(n.pre,{children:(0,r.jsx)(n.code,{className:"language-python",children:"async def describe_car(car: dict[str, Any]) -> str:\n    msg = f\"You drive a {car['brand']} model {car['model']}\"\n    return msg\n"})}),(0,r.jsxs)(n.p,{children:["The Library will deserialize the JSON from something like: ",(0,r.jsx)(n.code,{children:'{"brand": "Ford", "model": "Explorer"}'})," to a python ",(0,r.jsx)(n.code,{children:"dict"}),"."]})]})]}),"\n",(0,r.jsx)(n.h3,{id:"accessing-metadata",children:"Accessing Metadata"}),"\n",(0,r.jsxs)(n.p,{children:["Sometimes, your Task Worker needs to know something about where the ",(0,r.jsx)(n.code,{children:"TaskRun"})," came from. Each LittleHorse SDK offers a ",(0,r.jsx)(n.code,{children:"WorkerContext"})," object or struct that exposes this metadata to the Task Worker."]}),"\n",(0,r.jsxs)(o.A,{children:[(0,r.jsxs)(a.A,{value:"java",label:"Java",default:!0,children:[(0,r.jsxs)(n.p,{children:["If you need to access metadata about the Task Run that is being executed, you can add a ",(0,r.jsx)(n.code,{children:"WorkerContext"})," parameter to the end of your method signature for the Task Method."]}),(0,r.jsxs)(n.p,{children:["Let's say you have a ",(0,r.jsx)(n.code,{children:"TaskDef"})," with one input parameter of type ",(0,r.jsx)(n.code,{children:"INT"}),". You can access the ",(0,r.jsx)(n.code,{children:"WorkerContext"})," by doing the following:"]}),(0,r.jsx)(n.pre,{children:(0,r.jsx)(n.code,{className:"language-java",children:'class SomeWorker {\n\n    @LHTaskMethod("my-task")\n    public void doTask(long inputLong, WorkerContext context) {\n        String wfRunId = context.getWfRunId();\n        TaskRunId taskRunId = context.getTaskRunId();\n        NodeRunId nodeRunId = context.getNodeRunId();\n\n        Date timeWhenTaskWasScheduled = context.getScheduledTime();\n\n        context.log(\n            "This is a message that gets sent to the log output on the scheduler"\\\n        );\n\n        int attemptNumber = context.getAttemptNumber();\n        if (attemptNumber == 0) {\n            // then this is the first time this Task Run has been attempted.\n        } else {\n            // then this is a retry.\n        }\n\n        // This is a constant value between all attempts for this TaskRun.\n        // Useful to allow retries to third-party API\'s that accept idempotency\n        // keys, such as Stripe.\n        String idempotencyKey = context.getIdempotencyKey();\n    }\n}\n'})})]}),(0,r.jsxs)(a.A,{value:"go",label:"Go",children:[(0,r.jsxs)(n.p,{children:["If you need to access metadata about the Task Run that is being executed, you can add a ",(0,r.jsx)(n.code,{children:"WorkerContext"})," parameter to the end of your method signature for the Task Method."]}),(0,r.jsxs)(n.p,{children:["Let's say you have a ",(0,r.jsx)(n.code,{children:"TaskDef"})," with one input parameter of type ",(0,r.jsx)(n.code,{children:"INT"}),". You can access the ",(0,r.jsx)(n.code,{children:"WorkerContext"})," by doing the following:"]}),(0,r.jsx)(n.pre,{children:(0,r.jsx)(n.code,{className:"language-go",children:'func DoTask(long inputLong, context *common.WorkerContext) {\n\twfRunId := context.GetWfRunId();\n\ttaskRunId := context.GetTaskRunId();\n    nodeRunId := context.GetNodeRunId();\n\n\ttimeWhenTaskWasScheduled := context.GetScheduledTime();\n\n\tcontext.Log(\n\t\t"This is a message that gets sent to the log output on the scheduler",\n\t);\n\n\tattemptNumber := context.GetAttemptNumber();\n\tif (attemptNumber == 0) {\n\t\t// then this is the first time this Task Run has been attempted.\n\t} else {\n\t\t// then this is a retry.\n\t}\n\n\tidempotencyKey := context.GetIdempotencyKey();\n}\n'})})]}),(0,r.jsxs)(a.A,{value:"python",label:"Python",children:[(0,r.jsxs)(n.p,{children:["If you need to access metadata about the Task Run that is being executed, you can add an ",(0,r.jsx)(n.code,{children:"LHWorkerContext"})," parameter to the end of your method signature for the Task Method."]}),(0,r.jsxs)(n.p,{children:["Let's say you have a ",(0,r.jsx)(n.code,{children:"TaskDef"})," with one input parameter of type ",(0,r.jsx)(n.code,{children:"INT"}),". You can access the ",(0,r.jsx)(n.code,{children:"LHWorkerContext"})," by doing the following:"]}),(0,r.jsx)(n.pre,{children:(0,r.jsx)(n.code,{className:"language-python",children:'\nasync def greeting(name: str, ctx: LHWorkerContext) -> str:\n    task_run_id = ctx.task_run_id\n    node_run_id = ctx.node_run_id\n    wf_run_id = ctx.node_run_id\n\n    time_task_was_scheduled = ctx.scheduled_time\n\n    attempt_number = ctx.attempt_number\n    if attempt_number > 0:\n        # this is a retry\n        pass\n    else:\n        # this is not a retry\n        pass\n\n    idempotency_key = ctx.idempotency_key\n    return "asdf"\n\n'})})]})]}),"\n",(0,r.jsx)(n.h2,{id:"best-practices",children:"Best Practices"}),"\n",(0,r.jsx)(n.h3,{id:"client-id",children:"Client ID"}),"\n",(0,r.jsxs)(n.p,{children:["Every Task Worker instance should have a unique ",(0,r.jsx)(n.code,{children:"LHC_CLIENT_ID"})," set in its configuration. This is important so that you can audit which client executed which Task, and also so that the LH Server can efficiently assign partitions of work to your Task Workers."]}),"\n",(0,r.jsx)(n.h3,{id:"idempotence",children:"Idempotence"}),"\n",(0,r.jsxs)(n.p,{children:["With all workflow engines, it is best when your tasks are idempotent. You can use the ",(0,r.jsx)(n.code,{children:"NodeRunIdPb"})," from ",(0,r.jsx)(n.code,{children:"WorkerContext::getNodeRunId()"})," as an idempotency key."]})]})}function p(e={}){const{wrapper:n}={...(0,s.R)(),...e.components};return n?(0,r.jsx)(n,{...e,children:(0,r.jsx)(u,{...e})}):u(e)}},9365:(e,n,t)=>{t.d(n,{A:()=>a});t(6540);var r=t(8215);const s={tabItem:"tabItem_Ymn6"};var o=t(4848);function a(e){let{children:n,hidden:t,className:a}=e;return(0,o.jsx)("div",{role:"tabpanel",className:(0,r.A)(s.tabItem,a),hidden:t,children:n})}},1470:(e,n,t)=>{t.d(n,{A:()=>T});var r=t(6540),s=t(8215),o=t(3104),a=t(6347),i=t(205),c=t(7485),l=t(1682),d=t(9466);function h(e){return r.Children.toArray(e).filter((e=>"\n"!==e)).map((e=>{if(!e||(0,r.isValidElement)(e)&&function(e){const{props:n}=e;return!!n&&"object"==typeof n&&"value"in n}(e))return e;throw new Error(`Docusaurus error: Bad <Tabs> child <${"string"==typeof e.type?e.type:e.type.name}>: all children of the <Tabs> component should be <TabItem>, and every <TabItem> should have a unique "value" prop.`)}))?.filter(Boolean)??[]}function u(e){const{values:n,children:t}=e;return(0,r.useMemo)((()=>{const e=n??function(e){return h(e).map((e=>{let{props:{value:n,label:t,attributes:r,default:s}}=e;return{value:n,label:t,attributes:r,default:s}}))}(t);return function(e){const n=(0,l.X)(e,((e,n)=>e.value===n.value));if(n.length>0)throw new Error(`Docusaurus error: Duplicate values "${n.map((e=>e.value)).join(", ")}" found in <Tabs>. Every value needs to be unique.`)}(e),e}),[n,t])}function p(e){let{value:n,tabValues:t}=e;return t.some((e=>e.value===n))}function x(e){let{queryString:n=!1,groupId:t}=e;const s=(0,a.W6)(),o=function(e){let{queryString:n=!1,groupId:t}=e;if("string"==typeof n)return n;if(!1===n)return null;if(!0===n&&!t)throw new Error('Docusaurus error: The <Tabs> component groupId prop is required if queryString=true, because this value is used as the search param name. You can also provide an explicit value such as queryString="my-search-param".');return t??null}({queryString:n,groupId:t});return[(0,c.aZ)(o),(0,r.useCallback)((e=>{if(!o)return;const n=new URLSearchParams(s.location.search);n.set(o,e),s.replace({...s.location,search:n.toString()})}),[o,s])]}function m(e){const{defaultValue:n,queryString:t=!1,groupId:s}=e,o=u(e),[a,c]=(0,r.useState)((()=>function(e){let{defaultValue:n,tabValues:t}=e;if(0===t.length)throw new Error("Docusaurus error: the <Tabs> component requires at least one <TabItem> children component");if(n){if(!p({value:n,tabValues:t}))throw new Error(`Docusaurus error: The <Tabs> has a defaultValue "${n}" but none of its children has the corresponding value. Available values are: ${t.map((e=>e.value)).join(", ")}. If you intend to show no default tab, use defaultValue={null} instead.`);return n}const r=t.find((e=>e.default))??t[0];if(!r)throw new Error("Unexpected error: 0 tabValues");return r.value}({defaultValue:n,tabValues:o}))),[l,h]=x({queryString:t,groupId:s}),[m,k]=function(e){let{groupId:n}=e;const t=function(e){return e?`docusaurus.tab.${e}`:null}(n),[s,o]=(0,d.Dv)(t);return[s,(0,r.useCallback)((e=>{t&&o.set(e)}),[t,o])]}({groupId:s}),f=(()=>{const e=l??m;return p({value:e,tabValues:o})?e:null})();(0,i.A)((()=>{f&&c(f)}),[f]);return{selectedValue:a,selectValue:(0,r.useCallback)((e=>{if(!p({value:e,tabValues:o}))throw new Error(`Can't select invalid tab value=${e}`);c(e),h(e),k(e)}),[h,k,o]),tabValues:o}}var k=t(2303);const f={tabList:"tabList__CuJ",tabItem:"tabItem_LNqP"};var g=t(4848);function j(e){let{className:n,block:t,selectedValue:r,selectValue:a,tabValues:i}=e;const c=[],{blockElementScrollPositionUntilNextRender:l}=(0,o.a_)(),d=e=>{const n=e.currentTarget,t=c.indexOf(n),s=i[t].value;s!==r&&(l(n),a(s))},h=e=>{let n=null;switch(e.key){case"Enter":d(e);break;case"ArrowRight":{const t=c.indexOf(e.currentTarget)+1;n=c[t]??c[0];break}case"ArrowLeft":{const t=c.indexOf(e.currentTarget)-1;n=c[t]??c[c.length-1];break}}n?.focus()};return(0,g.jsx)("ul",{role:"tablist","aria-orientation":"horizontal",className:(0,s.A)("tabs",{"tabs--block":t},n),children:i.map((e=>{let{value:n,label:t,attributes:o}=e;return(0,g.jsx)("li",{role:"tab",tabIndex:r===n?0:-1,"aria-selected":r===n,ref:e=>c.push(e),onKeyDown:h,onClick:d,...o,className:(0,s.A)("tabs__item",f.tabItem,o?.className,{"tabs__item--active":r===n}),children:t??n},n)}))})}function y(e){let{lazy:n,children:t,selectedValue:s}=e;const o=(Array.isArray(t)?t:[t]).filter(Boolean);if(n){const e=o.find((e=>e.props.value===s));return e?(0,r.cloneElement)(e,{className:"margin-top--md"}):null}return(0,g.jsx)("div",{className:"margin-top--md",children:o.map(((e,n)=>(0,r.cloneElement)(e,{key:n,hidden:e.props.value!==s})))})}function b(e){const n=m(e);return(0,g.jsxs)("div",{className:(0,s.A)("tabs-container",f.tabList),children:[(0,g.jsx)(j,{...n,...e}),(0,g.jsx)(y,{...n,...e})]})}function T(e){const n=(0,k.A)();return(0,g.jsx)(b,{...e,children:h(e.children)},String(n))}},8453:(e,n,t)=>{t.d(n,{R:()=>a,x:()=>i});var r=t(6540);const s={},o=r.createContext(s);function a(e){const n=r.useContext(o);return r.useMemo((function(){return"function"==typeof e?e(n):{...n,...e}}),[n,e])}function i(e){let n;return n=e.disableParentContext?"function"==typeof e.components?e.components(s):e.components||s:a(e.components),r.createElement(o.Provider,{value:n},e.children)}}}]);