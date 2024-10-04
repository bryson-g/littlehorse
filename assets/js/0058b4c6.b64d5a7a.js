"use strict";(self.webpackChunklh_site=self.webpackChunklh_site||[]).push([[849],{6164:e=>{e.exports=JSON.parse('{"version":{"pluginId":"default","version":"current","label":"Next","banner":null,"badge":false,"noIndex":false,"className":"docs-version-current","isLast":true,"docsSidebars":{"tutorialSidebar":[{"type":"link","label":"Overview","href":"/docs/overview","docId":"overview","unlisted":false},{"type":"link","label":"Architecture and Guarantees","href":"/docs/architecture-and-guarantees","docId":"architecture-and-guarantees","unlisted":false},{"type":"category","label":"Concepts","collapsible":true,"collapsed":true,"items":[{"type":"link","label":"Workflows","href":"/docs/concepts/workflows","docId":"concepts/workflows","unlisted":false},{"type":"link","label":"Tasks","href":"/docs/concepts/tasks","docId":"concepts/tasks","unlisted":false},{"type":"link","label":"External Events and Interrupts","href":"/docs/concepts/external-events","docId":"concepts/external-events","unlisted":false},{"type":"link","label":"User Tasks","href":"/docs/concepts/user-tasks","docId":"concepts/user-tasks","unlisted":false},{"type":"link","label":"Workflow Events","href":"/docs/concepts/workflow-events","docId":"concepts/workflow-events","unlisted":false},{"type":"link","label":"Authz, Principals, and Tenants","href":"/docs/concepts/principals-and-tenants","docId":"concepts/principals-and-tenants","unlisted":false},{"type":"category","label":"Advanced Concepts","collapsible":true,"collapsed":true,"items":[{"type":"link","label":"WfSpec Versioning","href":"/docs/concepts/advanced/wfspec-versioning","docId":"concepts/advanced/wfspec-versioning","unlisted":false}],"href":"/docs/concepts/advanced/"}],"href":"/docs/concepts/"},{"type":"category","label":"Developer Guide","collapsible":true,"collapsed":true,"items":[{"type":"link","label":"Quickstart Installation","href":"/docs/developer-guide/install","docId":"developer-guide/install","unlisted":false},{"type":"link","label":"Configuring the Clients","href":"/docs/developer-guide/client-configuration","docId":"developer-guide/client-configuration","unlisted":false},{"type":"link","label":"LittleHorse CLI","href":"/docs/developer-guide/lhctl","docId":"developer-guide/lhctl","unlisted":false},{"type":"link","label":"Developing Task Workers","href":"/docs/developer-guide/task-worker-development","docId":"developer-guide/task-worker-development","unlisted":false},{"type":"category","label":"WfSpec Development","collapsible":true,"collapsed":true,"items":[{"type":"link","label":"Basics","href":"/docs/developer-guide/wfspec-development/basics","docId":"developer-guide/wfspec-development/basics","unlisted":false},{"type":"link","label":"Conditionals and Loops","href":"/docs/developer-guide/wfspec-development/conditionals","docId":"developer-guide/wfspec-development/conditionals","unlisted":false},{"type":"link","label":"Mutating Variables","href":"/docs/developer-guide/wfspec-development/mutating-variables","docId":"developer-guide/wfspec-development/mutating-variables","unlisted":false},{"type":"link","label":"External Events","href":"/docs/developer-guide/wfspec-development/external-events","docId":"developer-guide/wfspec-development/external-events","unlisted":false},{"type":"link","label":"Interrupts","href":"/docs/developer-guide/wfspec-development/interrupts","docId":"developer-guide/wfspec-development/interrupts","unlisted":false},{"type":"link","label":"Exception Handling","href":"/docs/developer-guide/wfspec-development/exception-handling","docId":"developer-guide/wfspec-development/exception-handling","unlisted":false},{"type":"link","label":"Child Threads","href":"/docs/developer-guide/wfspec-development/child-threads","docId":"developer-guide/wfspec-development/child-threads","unlisted":false},{"type":"link","label":"User Tasks","href":"/docs/developer-guide/wfspec-development/user-tasks","docId":"developer-guide/wfspec-development/user-tasks","unlisted":false},{"type":"category","label":"Advanced Features","collapsible":true,"collapsed":true,"items":[{"type":"link","label":"Waiting for Conditions","href":"/docs/developer-guide/wfspec-development/advanced/wait-for-condition","docId":"developer-guide/wfspec-development/advanced/wait-for-condition","unlisted":false}],"href":"/docs/developer-guide/wfspec-development/advanced/"}],"href":"/docs/developer-guide/wfspec-development/"},{"type":"category","label":"Using the LittleHorse API","collapsible":true,"collapsed":true,"items":[{"type":"link","label":"Background","href":"/docs/developer-guide/grpc/basics","docId":"developer-guide/grpc/basics","unlisted":false},{"type":"link","label":"Managing Metadata","href":"/docs/developer-guide/grpc/managing-metadata","docId":"developer-guide/grpc/managing-metadata","unlisted":false},{"type":"link","label":"Running a Workflow","href":"/docs/developer-guide/grpc/running-workflows","docId":"developer-guide/grpc/running-workflows","unlisted":false},{"type":"link","label":"Posting ExternalEvents","href":"/docs/developer-guide/grpc/posting-external-events","docId":"developer-guide/grpc/posting-external-events","unlisted":false},{"type":"link","label":"Handling User Tasks","href":"/docs/developer-guide/grpc/user-tasks","docId":"developer-guide/grpc/user-tasks","unlisted":false}],"href":"/docs/developer-guide/grpc/"}],"href":"/docs/developer-guide/"},{"type":"category","label":"Operations","collapsible":true,"collapsed":true,"items":[{"type":"link","label":"Operations Overview","href":"/docs/operations/overview","docId":"operations/overview","unlisted":false},{"type":"link","label":"Server Configurations","href":"/docs/operations/server-configuration","docId":"operations/server-configuration","unlisted":false},{"type":"link","label":"Dashboard Configurations","href":"/docs/operations/dashboard-configuration","docId":"operations/dashboard-configuration","unlisted":false},{"type":"link","label":"Workers/Clients Configurations","href":"/docs/operations/client-configuration","docId":"operations/client-configuration","unlisted":false},{"type":"category","label":"Docker Compose Examples","collapsible":true,"collapsed":true,"items":[{"type":"link","label":"Basic Deployment","href":"/docs/operations/docker-compose/basic","docId":"operations/docker-compose/basic","unlisted":false},{"type":"link","label":"Using Confluent Cloud","href":"/docs/operations/docker-compose/confluent-cloud","docId":"operations/docker-compose/confluent-cloud","unlisted":false},{"type":"link","label":"Three LittleHorse Orchestrators","href":"/docs/operations/docker-compose/three-servers","docId":"operations/docker-compose/three-servers","unlisted":false}],"href":"/docs/operations/docker-compose/"}],"href":"/docs/operations/"},{"type":"link","label":"Tips, Pointers, and FAQ","href":"/docs/faq","docId":"faq","unlisted":false},{"type":"link","label":"LittleHorse API Reference","href":"/docs/api","docId":"api","unlisted":false}]},"docs":{"api":{"id":"api","title":"LittleHorse API Reference","description":"The LittleHorse Server exposes a GRPC API to its clients. For most general usage of LittleHorse, you will not need to","sidebar":"tutorialSidebar"},"architecture-and-guarantees":{"id":"architecture-and-guarantees","title":"Architecture and Guarantees","description":"LittleHorse is a horizontally scalable, high-performance system with enterprise-grade security integrations to help you build systems that support even the most mission-critical workloads.","sidebar":"tutorialSidebar"},"concepts/advanced/advanced":{"id":"concepts/advanced/advanced","title":"Advanced Concepts","description":"LittleHorse is an intuitive system that generally works as you might expect it to. However, there are some advanced use-cases for which a deeper understanding of the system would be helpful.","sidebar":"tutorialSidebar"},"concepts/advanced/wfspec-versioning":{"id":"concepts/advanced/wfspec-versioning","title":"WfSpec Versioning","description":"A WfSpec is a versioned resource. Each WfSpec is uniquely identified by its name (a String), its majorVersion (an auto-incremented number, managed by LittleHorse), and its revision (another auto-incremented number).","sidebar":"tutorialSidebar"},"concepts/concepts":{"id":"concepts/concepts","title":"Concepts","description":"The LittleHorse Server is, at its core, a Workflow Engine. What makes LittleHorse unique is that it is built with developers in mind. The way users define workflow specifications in LittleHorse (a WfSpec) was designed from the ground up to be developer-friendly and have concepts that are analogous to the primitives used in day-to-day programming languages.","sidebar":"tutorialSidebar"},"concepts/external-events":{"id":"concepts/external-events","title":"External Events and Interrupts","description":"This section is not a Developer Guide; if you want to learn how to create an ExternalEventDef, post an ExternalEvent, wait for an ExternalEvent in a Workflow, or register an Interrupt Handler, please check the appropriate docs in our developer guide.","sidebar":"tutorialSidebar"},"concepts/principals-and-tenants":{"id":"concepts/principals-and-tenants","title":"Authz, Principals, and Tenants","description":"In order to provide a secure platform for use at large enterprises, LittleHorse supports multi-tenancy natively. This is accomplished through two API Objects:","sidebar":"tutorialSidebar"},"concepts/tasks":{"id":"concepts/tasks","title":"Tasks","description":"This section is not a Developer Guide; if you want to learn how to write a Task Worker, how to register a TaskDef, or how to call a Task inside a Workflow, please check the appropriate docs in our developer guide.","sidebar":"tutorialSidebar"},"concepts/user-tasks":{"id":"concepts/user-tasks","title":"User Tasks","description":"This section is not a Developer Guide; if you want to learn how to Create a UserTaskDef, how to add a User Task Node to a Workflow, or how to handle User Tasks with GRPC, please check the appropriate docs in our developer guide.","sidebar":"tutorialSidebar"},"concepts/workflow-events":{"id":"concepts/workflow-events","title":"Workflow Events","description":"While External Events enable workflows to respond to events from the outside world, some applications may need to respond to events thrown from within workflows.  Workflow Events enable LittleHorse Clients to wait for a specific event to occur within a workflow.","sidebar":"tutorialSidebar"},"concepts/workflows":{"id":"concepts/workflows","title":"Workflows","description":"This section is not a Developer Guide; if you want to learn how to define a workflow or how to run a workflow, please check the appropriate docs in our developer guide.","sidebar":"tutorialSidebar"},"developer-guide/client-configuration":{"id":"developer-guide/client-configuration","title":"Configuring the Clients","description":"In every LittleHorse SDK, there is an LHConfig class or struct that handles the configuration required for allowing your clients and Task Workers to talk to LittleHorse Server.","sidebar":"tutorialSidebar"},"developer-guide/developer-guide":{"id":"developer-guide/developer-guide","title":"Developer Guide","description":"The LittleHorse Developer Guide tells you everything you need to know about LittleHorse from the Jedi Youngling level (installing clients, running the server) to the Jedi Master level (advanced WfSpec development, advanced security, etc).","sidebar":"tutorialSidebar"},"developer-guide/grpc/basics":{"id":"developer-guide/grpc/basics","title":"Background","description":"The public LittleHorse API is a GRPC service exposed by the LH Server. We have complete auto-generated documentation for our GRPC Service and Protocol Buffers on our docs site. For the highly curious readers, you can find the actual protocol buffer code that underpins our system in our source code repository.","sidebar":"tutorialSidebar"},"developer-guide/grpc/grpc":{"id":"developer-guide/grpc/grpc","title":"Using the LittleHorse API","description":"The public API exposed by the LittleHorse Server is a GRPC server, defined here. We chose GRPC for multiple reasons, including:","sidebar":"tutorialSidebar"},"developer-guide/grpc/managing-metadata":{"id":"developer-guide/grpc/managing-metadata","title":"Managing Metadata","description":"Before you can run a WfRun, you need to create your WfSpec\'s! This guide shows you how to do that.","sidebar":"tutorialSidebar"},"developer-guide/grpc/posting-external-events":{"id":"developer-guide/grpc/posting-external-events","title":"Posting ExternalEvents","description":"You can post an ExternalEvent using the PutExternalEvent rpc call.","sidebar":"tutorialSidebar"},"developer-guide/grpc/running-workflows":{"id":"developer-guide/grpc/running-workflows","title":"Running a Workflow","description":"You can run a WfSpec, thus creating a WfRun, in two ways:","sidebar":"tutorialSidebar"},"developer-guide/grpc/user-tasks":{"id":"developer-guide/grpc/user-tasks","title":"Handling User Tasks","description":"User Tasks enable a ThreadRun to block until a human user provides some input into the workflow. Additionally, User Tasks have several useful hooks such as automatic reassignment, reminders, and auditing capabilities.","sidebar":"tutorialSidebar"},"developer-guide/install":{"id":"developer-guide/install","title":"Quickstart Installation","description":"The minimum to get started with LittleHorse is to install the lhctl CLI, run the server in docker, and use your choice of the Java, GoLang, or Python client libraries.","sidebar":"tutorialSidebar"},"developer-guide/lhctl":{"id":"developer-guide/lhctl","title":"LittleHorse CLI","description":"lhctl is the LittleHorse CLI. It allows you to manage metadata in your system, observe and analyze your WfRuns, and also perform rudimentary actions such as running a WfRun.","sidebar":"tutorialSidebar"},"developer-guide/task-worker-development":{"id":"developer-guide/task-worker-development","title":"Developing Task Workers","description":"Each LittleHorse SDK provides an LHTaskWorker object or struct which lets you turn an arbitrary function or method into a LittleHorse Task.","sidebar":"tutorialSidebar"},"developer-guide/wfspec-development/advanced/advanced":{"id":"developer-guide/wfspec-development/advanced/advanced","title":"Advanced Features","description":"If you\'ve made it here, congratulations! You are no longer a Padawan.","sidebar":"tutorialSidebar"},"developer-guide/wfspec-development/advanced/wait-for-condition":{"id":"developer-guide/wfspec-development/advanced/wait-for-condition","title":"Waiting for Conditions","description":"\x3c!-- We really need docusaurus versioning. This feature isn\'t released yet...if someone finds it","sidebar":"tutorialSidebar"},"developer-guide/wfspec-development/basics":{"id":"developer-guide/wfspec-development/basics","title":"Basics","description":"To develop a WfSpec in LittleHorse, you can use the Workflow struct or object in our SDK\'s. Generally, the Workflow entity constructor requires two arguments:","sidebar":"tutorialSidebar"},"developer-guide/wfspec-development/child-threads":{"id":"developer-guide/wfspec-development/child-threads","title":"Child Threads","description":"You can use WorkflowThread#spawnThread() and WorkflowThread#waitForThreads() to launch and wait for Child ThreadRuns, respectively. This is useful if you want to execute multiple pieces of business logic in parallel.","sidebar":"tutorialSidebar"},"developer-guide/wfspec-development/conditionals":{"id":"developer-guide/wfspec-development/conditionals","title":"Conditionals and Loops","description":"In a LittleHorse WfSpec, the Edge structure tells the workflow scheduler what Node to advance to next. The Edge has a conditions field, which allows you to specify different control flow paths based on variables in your WfRun. This is analogous to if/else in programming.","sidebar":"tutorialSidebar"},"developer-guide/wfspec-development/exception-handling":{"id":"developer-guide/wfspec-development/exception-handling","title":"Exception Handling","description":"In LittleHorse, a Failure is analogous to an Exception in Programming.","sidebar":"tutorialSidebar"},"developer-guide/wfspec-development/external-events":{"id":"developer-guide/wfspec-development/external-events","title":"External Events","description":"Before you can use an ExternalEventDef in a WfSpec, you need to create the ExternalEventDef metadata object in LittleHorse. You can do that following our metadata management docs.","sidebar":"tutorialSidebar"},"developer-guide/wfspec-development/interrupts":{"id":"developer-guide/wfspec-development/interrupts","title":"Interrupts","description":"As per the Concepts Docs, you can set up a ThreadSpec such that when an ExternalEvent of a certain type comes in, the ThreadRun is interrupted and an Interrupt Handler ThreadRun is spawned.","sidebar":"tutorialSidebar"},"developer-guide/wfspec-development/mutating-variables":{"id":"developer-guide/wfspec-development/mutating-variables","title":"Mutating Variables","description":"Recall from the Concepts Documentation that every Node can have zero or more VariableMutations on it. A VariableMutation changes the value of a ThreadRun\'s Variables.","sidebar":"tutorialSidebar"},"developer-guide/wfspec-development/user-tasks":{"id":"developer-guide/wfspec-development/user-tasks","title":"User Tasks","description":"User Tasks allow you to manage tasks involving humans alongside standard computer tasks in your LittleHorse Workflow.","sidebar":"tutorialSidebar"},"developer-guide/wfspec-development/wfspec-development":{"id":"developer-guide/wfspec-development/wfspec-development","title":"WfSpec Development","description":"This section shows you how to build WfSpecs using our SDK\'s in Python, Java, and GoLang, starting from Youngling all the way up to the LittleHorse Master level.","sidebar":"tutorialSidebar"},"faq":{"id":"faq","title":"Tips, Pointers, and FAQ","description":"We do our best to make our documentation easy to navigate; however, LittleHorse has a lot of features and it may not always be easy to find what you are looking for.","sidebar":"tutorialSidebar"},"operations/client-configuration":{"id":"operations/client-configuration","title":"Workers/Clients Configurations","description":"Client","sidebar":"tutorialSidebar"},"operations/dashboard-configuration":{"id":"operations/dashboard-configuration","title":"Dashboard Configurations","description":"These configurations apply only to the ghcr.io/littlehorse-enterprises/littlehorse/lh-dashboard docker image, and not when running the LH Dashboard compiled from source. We have an open ticket in our OSS repo to homologate the configurations and also improve the startup time of the lh-dashboard docker image.","sidebar":"tutorialSidebar"},"operations/docker-compose/basic":{"id":"operations/docker-compose/basic","title":"Basic Deployment","description":"This example shows how to run LittleHorse with a single Server and the dashboard, without authentication, using Docker Compose, accessible on localhost:2023.","sidebar":"tutorialSidebar"},"operations/docker-compose/confluent-cloud":{"id":"operations/docker-compose/confluent-cloud","title":"Using Confluent Cloud","description":"LittleHorse requires Apache Kafka as its only hard dependency. Kafka is the source-of-truth for the state of a LittleHorse Cluster as all data is stored in Kafka Streams state stores (therefore, the durability of the Changelog Topics determines the durability of the LittleHorse Cluster\'s data).","sidebar":"tutorialSidebar"},"operations/docker-compose/docker-compose":{"id":"operations/docker-compose/docker-compose","title":"Docker Compose Examples","description":"This tab contains a series of examples to get LittleHorse working in Docker Compose. We recognize that not many people use Docker Compose in production, however we see value in docker compose examples because they serve as clear documentation of how to configure LittleHorse.","sidebar":"tutorialSidebar"},"operations/docker-compose/three-servers":{"id":"operations/docker-compose/three-servers","title":"Three LittleHorse Orchestrators","description":"LittleHorse is a horizontally scalable system. As such, you can configure multiple LittleHorse Orchestrator servers to act as a cluster. This provides the following benefits:","sidebar":"tutorialSidebar"},"operations/operations":{"id":"operations/operations","title":"Operations","description":"LittleHorse OSS, which can be found on our GitHub, contains all of the LittleHorse functionality. It is an enterprise-ready workflow engine that can scale to the largest workloads while meeting the most strict security requirements when deployed on premise.","sidebar":"tutorialSidebar"},"operations/overview":{"id":"operations/overview","title":"Operations Overview","description":"A minimal LittleHorse cluster has the following components:","sidebar":"tutorialSidebar"},"operations/server-configuration":{"id":"operations/server-configuration","title":"Server Configurations","description":"This page contains all of the configurations that are accepted by the LittleHorse Server. We recommend that you set these configurations as environment variables for the ghcr.io/littlehorse-enterprises/littlehorse/lh-server image.","sidebar":"tutorialSidebar"},"overview":{"id":"overview","title":"LittleHorse Overview","description":"The LittleHorse Orchestrator is a high-performance platform for building workflow-driven applications for a variety of use-cases, including:","sidebar":"tutorialSidebar"}}}}')}}]);