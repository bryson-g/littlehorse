"use strict";(self.webpackChunklh_site=self.webpackChunklh_site||[]).push([[1477],{10:e=>{e.exports=JSON.parse('{"blogPosts":[{"id":"littlehorse-0.7-release","metadata":{"permalink":"/blog/littlehorse-0.7-release","source":"@site/blog/2024-01-28-0.7-release.md","title":"Releasing 0.7","description":"Approaching a stable `1.0.0` release.","date":"2024-01-28T00:00:00.000Z","formattedDate":"January 28, 2024","tags":[{"label":"littlehorse","permalink":"/blog/tags/littlehorse"},{"label":"release","permalink":"/blog/tags/release"}],"readingTime":4.535,"hasTruncateMarker":true,"authors":[{"name":"The LittleHorse Council","image_url":"https://avatars.githubusercontent.com/u/140006313?s=400&u=7bf4c91d92dfe590ac71bb6b4821e1a81aa5b712&v=4","imageURL":"https://avatars.githubusercontent.com/u/140006313?s=400&u=7bf4c91d92dfe590ac71bb6b4821e1a81aa5b712&v=4"}],"frontMatter":{"title":"Releasing 0.7","description":"Approaching a stable `1.0.0` release.","slug":"littlehorse-0.7-release","authors":[{"name":"The LittleHorse Council","image_url":"https://avatars.githubusercontent.com/u/140006313?s=400&u=7bf4c91d92dfe590ac71bb6b4821e1a81aa5b712&v=4","imageURL":"https://avatars.githubusercontent.com/u/140006313?s=400&u=7bf4c91d92dfe590ac71bb6b4821e1a81aa5b712&v=4"}],"tags":["littlehorse","release"],"image":"https://avatars.githubusercontent.com/u/140006313?s=400&u=7bf4c91d92dfe590ac71bb6b4821e1a81aa5b712&v=4","hide_table_of_contents":false},"nextItem":{"title":"Releasing 0.5.0","permalink":"/blog/littlehorse-0.5.0-release"}},"content":"We are excited to announce the release of `0.7.2`! \x3c!-- truncate --\x3e This is our last release before we cut `1.0.0`, which will be the first stable and production-ready LittleHorse distribution.\\n\\n## Get Started\\n\\nLittleHorse is free for production use according to the Server-Side Public License!\\n\\nTo get started with LittleHorse OSS, you can:\\n\\n* Visit us on [GitHub](https://github.com/littlehorse-enterprises)\\n* Try our [quickstarts](https://littlehorse.dev/docs/developer-guide/install#installation-and-quickstart) or watch our founder, Colt, go through them in [Java](https://www.youtube.com/watch?v=8Zo_UOStg98&t=6s), [Go](https://www.youtube.com/watch?v=oZQc2ISSZsk), or [Python](https://www.youtube.com/watch?v=l3TZOjfpzTw)\\n* Join our [Slack Community](https://launchpass.com/littlehorse-community) for quick and responsive help!\\n\\nAlso, LittleHorse Enterprises LLC has released its first out our [product-focused website](https://littlehorse.io)! If you\'re still curious and want to learn even more, check out a few of our new in-depth tutorial series on [our YouTube page](https://www.youtube.com/@LittleHorse-ey3vw/featured).\\n\\n## New Features\\n\\nRelease `0.7` introduces many features designed to make your life easier. We plan to write blogs about all of them, so stay tuned!\\n\\n### Administrative Dashboard\\n\\nThe most exciting part of the `0.7.2` release of LittleHorse is the new LH Dashboard, which is an administrative portal into your LittleHorse Cluster. The LH Dashboard lets you check on all of your workflows and tasks and debug everything visually with fine-grained detail. Our quickstarts (see above) have everything you need to get started debugging your workflows with our dashboard.\\n\\nThe LH Dashboard is in the alpha stage, so we appreciate any bug reports or feature requests. Please file them on [our github](https://github.com/littlehorse-enterprises/littlehorse/issues)!\\n\\n### Idempotent Metadata Management\\n\\nManaging your `WfSpec`s and `TaskDef`s just got much easier. Check out our [updated docs](https://littlehorse.dev/docs/developer-guide/grpc/managing-metadata) for tutorials on how to keep your DevOps team happy and seamlessly integrate LittleHorse into your normal application development lifecycle.\\n\\n### Child Workflows\\n\\nWe also added the ability to run a `WfRun` which is a \\"child\\" of another `WfRun`. This allows for some interesting features, most importantly:\\n* Sharing `Variable`s between `WfRun`\'s\\n* Foreign-key relationships between the child and parent `WfRun`\'s.\\n\\nStay tuned for an upcoming blog about _why_ we added that feature. It was guided by our resident Domain-Driven Design expert, Eduwer Camacaro! Here\'s a hint: this feature makes it possible to use LittleHorse Workflows as a native data store for complex business entities. This is a great way to implement the \\"Aggregate Pattern.\\"\\n\\n### Enhanced `SearchWfRun`\\n\\nThe `rpc SearchWfRun` request now has a `repeated VariableMatch variable_filters` field on it. This allows you to filter `WfRun`\'s by the value of one or more `Variable`\'s when searching for them, returning only matching `WfRun`\'s. This is super useful when using a LittleHorse `WfRun` to model a business entity, and you need to do something like \\"find all orders placed by `user-id == john` and `status == OUT_FOR_SHIPPING`\\".\\n\\nIn the past, this was possible using the `rpc SearchVariable` and then back the `WfRunId` out of the `VariableId`; however, that method is a little bit clunky. In reality, our users want to find a `WfRunId` matching certain criteria; they\'re not looking for a `Variable`.\\n\\n## What\'s Next?\\n\\nWe couldn\'t be more excited about what is coming next.\\n\\n### Apache2 Clients\\n\\nSome members of the community have expressed concerns about our clients (SDK\'s + GRPC code) being licensed by the SSPL license. We heard you, and we will update them to the Apache 2.0 License before our `1.0.0` release! The server will remain SSPL.\\n\\n### Tutorials\\n\\nOne of our team members, Sohini, has been hard at work creating video tutorials which will help you get quickly up to speed on advanced LittleHorse concepts. You can find them here on our [YouTube](https://www.youtube.com/@LittleHorse-ey3vw/playlists).\\n\\nAdditionally, our founder has recorded a series of zoom meetings with himself (yes, you read that right...Colt used zoom to record a tutorial video series) going through quickstarts in all of our three SDK\'s. You can find them here in [Java](https://www.youtube.com/watch?v=8Zo_UOStg98&t=6s), [Go](https://www.youtube.com/watch?v=oZQc2ISSZsk), or [Python](https://www.youtube.com/watch?v=l3TZOjfpzTw).\\n\\n### Approaching `1.0.0`\\n\\nWhat\'s missing before `1.0.0`? We have some in-progress features that are already merged to `master` but only partially implemented. If you squint hard enough at our GRPC Api, you might notice that we have support for multi-tenancy and also fine-grained ACL\'s. They are NOT ready for production use as we need to iron out a few wrinkles, but we will have them ready for `1.0.0`. We also are working on an `rpc MigrateWfSpec` which allows you to migrate a running `WfRun` from an older version of a `WfSpec` to a newer version. This is hard work for us but it will be highly useful for our users.\\n\\nAdditionally, we are expanding our end-to-end test coverage to try to shake out as many issues as possible _before_ our users tell us about them. So far, the rate of new bugs that we\'ve discovered has slowed down considerably, which makes us think we are getting close to the quality we expect from our own product.\\n\\nWhat will change when we release `1.0.0`? We will be following [Semantic Versioning](https://semver.org) to the letter, which means we will be paying _super close attention_ to any breaking changes to our API. If we want our users to use us for mission critical workloads, we need to take stability seriously\u2014both in terms of performance and API compatibility.\\n\\nWe will also likely have three minor releases per year, with 12 months of patch support for each minor release. This release schedule is copied from Apache Kafka.\\n\\n### LH Cloud\\n\\nLastly, stay tuned for LittleHorse Cloud! Early access is open. If you would like to sign up for early access to LH Cloud, visit [our website](https://www.littlehorse.io/lh-cloud) or contact `sales@littlehorse.io`."},{"id":"littlehorse-0.5.0-release","metadata":{"permalink":"/blog/littlehorse-0.5.0-release","source":"@site/blog/2023-09-08-0.5.0-release.md","title":"Releasing 0.5.0","description":"Python, For-Each, LH Platform.","date":"2023-09-08T00:00:00.000Z","formattedDate":"September 8, 2023","tags":[{"label":"littlehorse","permalink":"/blog/tags/littlehorse"},{"label":"release","permalink":"/blog/tags/release"}],"readingTime":5.205,"hasTruncateMarker":true,"authors":[{"name":"The LittleHorse Council","image_url":"https://avatars.githubusercontent.com/u/140006313?s=400&u=7bf4c91d92dfe590ac71bb6b4821e1a81aa5b712&v=4","imageURL":"https://avatars.githubusercontent.com/u/140006313?s=400&u=7bf4c91d92dfe590ac71bb6b4821e1a81aa5b712&v=4"}],"frontMatter":{"title":"Releasing 0.5.0","description":"Python, For-Each, LH Platform.","slug":"littlehorse-0.5.0-release","authors":[{"name":"The LittleHorse Council","image_url":"https://avatars.githubusercontent.com/u/140006313?s=400&u=7bf4c91d92dfe590ac71bb6b4821e1a81aa5b712&v=4","imageURL":"https://avatars.githubusercontent.com/u/140006313?s=400&u=7bf4c91d92dfe590ac71bb6b4821e1a81aa5b712&v=4"}],"tags":["littlehorse","release"],"image":"https://avatars.githubusercontent.com/u/140006313?s=400&u=7bf4c91d92dfe590ac71bb6b4821e1a81aa5b712&v=4","hide_table_of_contents":false},"prevItem":{"title":"Releasing 0.7","permalink":"/blog/littlehorse-0.7-release"},"nextItem":{"title":"Helm and Kubernetes Operators","permalink":"/blog/helm-and-k8s-operators"}},"content":"We are excited to announce the minor release `0.5.0`. \x3c!-- truncate --\x3e This release is highlighted by:\\n\\n* Alpha support for building `WfSpec`s in Python.\\n* Improved monitoring and health metrics on the LittleHorse Server.\\n* Support for looping over a `JSON_ARR` and launching threads in parallel for each element.\\n* Improved Exception Handling.\\n* Limited early access for LittleHorse Platform.\\n\\nIn this release, we made great strides towards full Python support, improved monitoring and observability, and added the ability to spawn threads in parallel looping over a `JSON_ARR` variable.\\n\\n## Get Started\\n\\nLittleHorse is free for production use according to the Server-Side Public License!\\n\\nTo get started with LittleHorse OSS, you can:\\n\\n* Try our [quickstarts](https://littlehorse.dev/docs/developer-guide/install)\\n* Visit us on [GitHub](https://github.com/littlehorse-enterprises/littlehorse) and give us a :star:!\\n* Download our [docker images](https://gallery.ecr.aws/littlehorse)\\n\\n## New Features\\n\\nWe\'d like to highlight some of the exciting new features in `0.5.0`.\\n\\n### Python `WfSpec` Support\\n\\nOur Python SDK now has full support for building `WfSpec`s! You can check it out at our [quickstart page](/docs/developer-guide/install).\\n\\n### For-Each Suppport\\n\\nThis is a very exciting feature which allows you to iterate over a list and spawn multiple `ThreadRun`s (like threads in a program).\\n\\nTo see it in action, check out our [example](https://github.com/littlehorse-enterprises/littlehorse/tree/master/examples/spawn-thread-foreach) or read the [documentation](https://littlehorse.dev/docs/developer-guide/wfspec-development/child-threads).\\n\\n### Improved Failure Handling\\n\\nThis release introduces a new status for LittleHorse, called `EXCEPTION`. The `EXCEPTION` status differs from the `ERROR` status in the following ways:\\n\\n* `ERROR` means an unexpected _technical_ failure occurred. For example, a `TaskRun` timed out because a third-party API was down.\\n* `EXCEPTION` means that a failure occurred at the _business process level_. For example, you might use an `EXCEPTION` when a customer has insufficient funds in her account to complete an order.\\n\\nJust like in programming, you can throw and catch `EXCEPTION`s (and you can also catch `ERROR`s). For a blog post that goes in-depth into how LittleHorse makes it easy to handle failures in your workflows, check out our [Failure Handling Docs](/docs/concepts/exception-handling).\\n\\n### LH Server Monitoring\\n\\nWe added a new path `/status` on the LH Server\'s health endpoint (port `1822` by default) which can be used to inspect the status of all internal Kafka Streams `Task`s on the LH Server. It presents the following information:\\n\\n* All Active Tasks on the host\\n* All Standby Tasks on the host\\n* Any ongoing State Restorations on the host\\n\\nAdditionally, we added a `/diskUsage` endpoint which returns the number of bytes of disk space in use by the LH Server.\\n\\nLittleHorse Platform uses these endpoints to intelligently scale, manage, and operate LittleHorse for you.\\n\\nWe are also in the process of writing and implementing a Kafka Improvement Proposal to improve visibility of Standby Tasks, which will allow the LittleHorse Operator (both in LH Platform and LH Cloud) to safely and smoothly scale LittleHorse clusters down without any downtime. Stay tuned in the Kafka developer mailing list!\\n\\n### LH Platform\\n\\nLittleHorse Platform is a Kubernetes Operator that securely manages a LittleHorse cluster for you in your own environment. It seamlessly integrates with your Kubernetes environmnent, GitOps workflows, and security strategy (TLS, mTLS, OAuth, Cert Manager, Keycloak).\\n\\nLittleHorse Platform is now available for limited early access, and has been installed in one of the largest health insurance companies in the US.\\n\\nTo get started with LittleHorse Platform, please [contact us](https://docs.google.com/forms/d/e/1FAIpQLScXVvTYy4LQnYoFoRKRQ7ppuxe0KgncsDukvm96qKN0pU5TnQ/viewform?usp=sf_link).\\n\\n\\n### Persistent Variables\\n\\nIn LittleHorse `0.2.0` and later, you can search for `Variable`s by their value. For example, if you have a Workflow Specification that defines a variable `email_address`, you can find all Workflow Run\'s where `email_address == \'obiwan@jedi-council.org`  by using the `SearchVariable` rpc call.\\n\\nThe problem with `0.2.0`? You need to provide the `wfSpecVersion` in your search request. That means you can only search for a `Variable` if you know the version of the `WfSpec` it came from.\\n\\nRelease `0.4.0` introduced the ability to mark a `Variable` as `persistent`, which means that:\\n* Every future version of the `WfSpec` must have the same variable definition with the same index type.\\n* You can now search for variables with a certain value across _all versions_ of the `WfSpec`.\\n\\nBe on the lookout for an upcoming blog post about using Persistent Variables and a simple backend-for-frontend to build an end-to-end Approval Workflow Application using only LittleHorse!\\n\\n## What\'s Next\\n\\nOver the next few weeks, we plan to:\\n\\n* Add utilities to make it easier to work with the LittleHorse API.\\n* Allow users to throw a Workflow `EXCEPTION` from within the Task Worker SDK (currently, only `ERROR` is supported).\\n* Continue hardening the LittleHorse Server\'s availability and performance story.\\n* Launch limited early accesss for LittleHorse Cloud and LittleHorse UI.\\n\\nTo get started with LittleHorse, head over to our [installation docs](https://littlehorse.dev/docs/developer-guide/install).\\n\\n### What about `0.3.0` and `0.4.0`?\\n\\nWe also released `0.3.0` and `0.4.0` over the past 5 weeks! (And before `0.3.0`, we had a minor patch bugfix on `0.2.1`).\\n\\nThe only thing missing with `0.3.0` and `0.4.0` is a blog post + announcement. That\'s because a lot of the features we included in this announcement were partially-implemented, implemented in some languages and not others, or in the \\"experimental\\" phase at the time of `0.3.0` and `0.4.0`. We accelerated the release of `0.3.0` and `0.4.0` because certain early-access customers requested certain features on an accelerated timeline.\\n\\nAs our API is mostly stable now, we will slow down our release cadence to likely a new `*.x.*` version (a `minor` release in [Semantic Versioning](https://semver.org)) every two months, with security and bugfix patch releases (`*.*.x`) as needed.\\n\\nAdditionally, as we introduce new features, we will start a release changelog document in which we document the level of stability of the new API\'s introduced. For example:\\n* `STABLE`: Any changes to this API before the next [Major Release](https://semver.org) will be backwards compatible. The feature is covered by our integration tests.\\n* `BETA`: We don\'t anticipate any _large breaking changes_ to the feature/API. It is covered by our integration tests, but it _might_ change before the `1.0.0` release.\\n* `EXPERIMENTAL`: Try it out and give us feedback! But you might want to wait a release or two before putting it into production.\\n\\nThe `0.6.0` release notes will include a table of all of our features and their API Stability Level in all four of our SDK\'s."},{"id":"helm-and-k8s-operators","metadata":{"permalink":"/blog/helm-and-k8s-operators","source":"@site/blog/2023-09-01-helm-and-k8s-operators.md","title":"Helm and Kubernetes Operators","description":"To Helm or to Operator?","date":"2023-09-01T00:00:00.000Z","formattedDate":"September 1, 2023","tags":[{"label":"friday-tech-tips","permalink":"/blog/tags/friday-tech-tips"},{"label":"kubernetes","permalink":"/blog/tags/kubernetes"}],"readingTime":5.58,"hasTruncateMarker":true,"authors":[{"name":"Colt McNealy","title":"LittleHorse Council Member","url":"https://www.linkedin.com/in/colt-mcnealy-900b7a148/","image_url":"https://media.licdn.com/dms/image/C5603AQFDvtYZwYd4Ag/profile-displayphoto-shrink_200_200/0/1584897319941?e=1698883200&v=beta&t=MicR3Fv32ymM8nbcQwveSRJcVkjOMv28Tkcu3e8VH_c","imageURL":"https://media.licdn.com/dms/image/C5603AQFDvtYZwYd4Ag/profile-displayphoto-shrink_200_200/0/1584897319941?e=1698883200&v=beta&t=MicR3Fv32ymM8nbcQwveSRJcVkjOMv28Tkcu3e8VH_c"}],"frontMatter":{"title":"Helm and Kubernetes Operators","description":"To Helm or to Operator?","slug":"helm-and-k8s-operators","authors":[{"name":"Colt McNealy","title":"LittleHorse Council Member","url":"https://www.linkedin.com/in/colt-mcnealy-900b7a148/","image_url":"https://media.licdn.com/dms/image/C5603AQFDvtYZwYd4Ag/profile-displayphoto-shrink_200_200/0/1584897319941?e=1698883200&v=beta&t=MicR3Fv32ymM8nbcQwveSRJcVkjOMv28Tkcu3e8VH_c","imageURL":"https://media.licdn.com/dms/image/C5603AQFDvtYZwYd4Ag/profile-displayphoto-shrink_200_200/0/1584897319941?e=1698883200&v=beta&t=MicR3Fv32ymM8nbcQwveSRJcVkjOMv28Tkcu3e8VH_c"}],"tags":["friday-tech-tips","kubernetes"],"image":"https://avatars.githubusercontent.com/u/140006313?s=400&u=7bf4c91d92dfe590ac71bb6b4821e1a81aa5b712&v=4","hide_table_of_contents":false},"prevItem":{"title":"Releasing 0.5.0","permalink":"/blog/littlehorse-0.5.0-release"},"nextItem":{"title":"Releasing 0.2.0","permalink":"/blog/littlehorse-0.2.0-release"}},"content":"About [Helm](https://helm.sh) vs Kubernetes Operators.\\n\\n\x3c!-- truncate --\x3e\\n\\n## Helm\\n\\nHelm is like `brew` or `npm` for Kubernetes. There are repositories containing charts, and each chart allows you to install an application into your K8s cluster.\\n\\n### How it Works\\n\\nUnder the hood, Helm works by filling out some templated Kubernetes yaml files with user-provided values, drastically reducing boilerplate and allowing you to deploy a reasonably complex application without the user of the helm chart having to understand too much about how to manage such an application.\\n\\nIn addition to that template-engine functionality, Helm also manages versions of your application. You can use Helm to release a new version of your app (for example, updating the docker image tag) and then quickly roll back to a previous version if you discover a bug. This is great for teams deploying stateless applications such as microservices or [LittleHorse Task Workers](https://littlehorse.dev/docs/concepts/task-workers).\\n\\n### The Good\\n\\nFirst, it is quite simple to write a Helm chart. This means that most DevOps teams can quickly write a helm chart that can be used by microservice teams across their organization.\\n\\nSecondly, Helm is a client library (well, it has been since the removal of Tiller...but that\'s another blog post). Therefore, you don\'t need to run any privileged pods inside the K8s cluster; all you need is a CI server with permissiosn to create the necessary K8s resources.\\n\\n### Limitations\\n\\nUnfortunately, Helm doesn\'t do much beyond initial installation and upgrades. Monitoring, self-healing, autoscaling, certificate rotation, and management of non-Kubernetes resources (eg. Kafka Topics, LittleHorse Task Definitions, AWS LoadBalancers, etc) are some exercises left to the reader, to name just a few.\\n\\n## Operators\\n\\n[Kubernetes Operators](https://operatorframework.io/) are a pattern introduced by Red Hat that intends to capture the knowledge of an expert Site Reliability Engineer (or, more punnily, a software operator) into a program that manages (or operates) a complex application.\\n\\nTo accomplish this, a Kubernetes Operator _extends_ the Kubernetes API to introduce a new resource type that is custom-made for your application. The Operator works in tandem with Kubernetes itself to manage applications of a specific type.\\n\\n### How they Work\\n\\nA Kubernetes Operator has two components:\\n\\n1. A `CustomResourceDefinition`, which defines the extension to the Kubernetes API (including relevant configurations for your application type).\\n2. A Controller, which watches any resources from your Custom Resource Definition and \\"reconciles\\" them.\\n\\nThe `CustomResourceDefinition` can be over-simplified as an Open API (not Open AI) specification for how your custom resource will look. For example, in LittleHorse Platform, the simplest version of a `LHCluster` resource (which creates a, you guessed it, LittleHorse Cluster) is:\\n\\n```yaml\\napiVersion: littlehorse.io/v1\\nkind: LHCluster\\nmetadata:\\n  name: hello-littlehorse\\n  namespace: lh\\nspec:\\n  server:\\n    version: \\"0.2.0\\"\\n    listeners:\\n    - name: internal-k8s\\n      type: internal\\n      port: 2023\\n    replicas: 3\\n    storage:\\n      volumeSize: \\"10G\\"\\n  kafka:\\n    strimziClusterRef:\\n      clusterName: my-strimzi-kafka-cluster\\n      listenerPort: 9093\\n```\\n\\nThe `CustomResourceDefinition` allows you to `kubectl apply -f <that file up there>`, and then you can `kubectl get lhclusters`:\\n\\nNow how does the LittleHorse cluster get created, configured, managed, and monitored? That\'s where the Controller comes into play. In the Operator pattern, a Controller is a process (normally, it runs as a `Pod` in a cluster) that watches for all events related to a `CustomResourceDefinition` and manipulates the external world to match what the Custom Resources specify.\\n\\nGenerally, that means creating a bunch of Kubernetes `Service`s, `Deployment`s, etc. to spin up an instance of an application. For example, the [Strimzi](https://strimzi.io) Kafka Operator watches `Kafka` resources and deploys an actual Kafka cluster.\\n\\nHowever, a Controller can also manage non-kuberentes resources. For example, many `Ingress` controllers provision or configure physical load balancers outside of the Kubernetes cluster. As another great example, the [Strimzi](https://strimzi.io) Kafka Topic Operator watches for `KafkaTopic` resources and creates (you guessed it) Kafka Topics using the Kafa Admin API.\\n\\nWe at LittleHorse plan to add similar CRD\'s that are specific to LittleHorse...stay tuned to learn about the `LHTaskDef` and `LHPrincipal` CRD\'s :wink:.\\n\\n### The Good\\n\\nKubernetes Operators are beautiful. Since they were developed by Red Hat, they (along with [Strimzi](https://strimzi.io)) are the biggest reason why Red Hat is in my top-three favorite software companies of all time.\\n\\nA well-written operator can make it a breeze to manage even the most daunting applications. Since the Controller is code written in a general-purpose language (normally Go or Java), an Operator can do just about anything that can be automated by an SRE. This includes:\\n* Autoscaling and alerting based on metrics\\n* Self-healing and mitigation in the face of hardware faults or degradations\\n* Certificate rotation\\n* Metadata management in your application (for example, creating Kafka Users)\\n* Intelligent rolling restarts that preserve high availability\\n* Provisioning infrastructure _outside of_ Kubernetes, for example [CrossPlane](https://crossplane.io).\\n\\n### The Ugly\\n\\nThe biggest downside to Operators in Kubernetes is that writing a Controller is _hard_. Additionally, it requires running a `Pod` with special privileges that allow the `Pod` to create other K8s resources. Because of this, writing an Operator for something like standardizing your team\'s blueprints for deploying a microservice just doesn\'t make sense.\\n\\nFuture blogs will dive into some of the challenges that we had to overcome with LittleHorse Platform, and how we minimized the permissions that our Operator needs to provide a self-driving LittleHorse experience to our customers.\\n\\n## Helm or Operators?\\n\\nWell, I\'m a software engineer, so I\'m going to say \\"it depends.\\" However, Kafka legend Gwen Shapira said in a fantastic [podcast](https://open.spotify.com/episode/0BYwF3e8y5OzrPt0xYMyqb?si=0c7d44154b434d0e) that some \\"it depends\\" are more helpful than others. So in an effort to fall in the \\"more helpful\\" side:\\n\\n* If you want a framework for deploying simple stateless applications while minimizing boilerplate (i.e. allowing different teams to deploy microservices), then you probably want Helm.\\n* If your application doesn\'t require much hand-holding after initial configuration on Kubernetes, Helm might do.\\n* If you want to provide a Kubernetes-native way to manage non-kubernetes infrastructure, you need an Operator.\\n* If you want to provide a self-driving experience for consumers of a highly complex application such as Kafka, ElasticSearch, or LittleHorse, you need an Operator.\\n\\n### LittleHorse Platform\\n\\nLittleHorse Platform is an enterprise-ready distribution of LittleHorse that runs in your own Kubernetes environment. We believe that Helm is fantastic for deploying many stateless applications, and even some stateful applications. However, Helm wouldn\'t let us go far enough towards providing our customers with a fully self-driving LittleHorse experience. As such, we chose to put in the extra work and build a full Kubernetes Operator. Stay tuned for an extensive list of current and upcoming LH Platform features, all powered by the [Java Operator SDK](https://javaoperatorsdk.io).\\n\\nTo inquire about LittleHorse Platform, contact `sales@littlehorse.io`. To get started with LittleHorse Community (free for production use under the SSPL), check out our [Installation Docs](https://littlehorse.dev/docs/developer-guide/install)."},{"id":"littlehorse-0.2.0-release","metadata":{"permalink":"/blog/littlehorse-0.2.0-release","source":"@site/blog/2023-08-30-0.2.0-release.md","title":"Releasing 0.2.0","description":"Making workflow development easy again.","date":"2023-08-30T00:00:00.000Z","formattedDate":"August 30, 2023","tags":[{"label":"littlehorse","permalink":"/blog/tags/littlehorse"},{"label":"release","permalink":"/blog/tags/release"}],"readingTime":3.54,"hasTruncateMarker":true,"authors":[{"name":"The LittleHorse Council","image_url":"https://avatars.githubusercontent.com/u/140006313?s=400&u=7bf4c91d92dfe590ac71bb6b4821e1a81aa5b712&v=4","imageURL":"https://avatars.githubusercontent.com/u/140006313?s=400&u=7bf4c91d92dfe590ac71bb6b4821e1a81aa5b712&v=4"}],"frontMatter":{"title":"Releasing 0.2.0","description":"Making workflow development easy again.","slug":"littlehorse-0.2.0-release","authors":[{"name":"The LittleHorse Council","image_url":"https://avatars.githubusercontent.com/u/140006313?s=400&u=7bf4c91d92dfe590ac71bb6b4821e1a81aa5b712&v=4","imageURL":"https://avatars.githubusercontent.com/u/140006313?s=400&u=7bf4c91d92dfe590ac71bb6b4821e1a81aa5b712&v=4"}],"tags":["littlehorse","release"],"image":"https://avatars.githubusercontent.com/u/140006313?s=400&u=7bf4c91d92dfe590ac71bb6b4821e1a81aa5b712&v=4","hide_table_of_contents":false},"prevItem":{"title":"Helm and Kubernetes Operators","permalink":"/blog/helm-and-k8s-operators"}},"content":"We are excited to announce the release of `0.2.0`! \x3c!-- truncate --\x3e In this release, we added several new features, highlighted by User Tasks, security, and Python support.\\n\\n## Get Started\\n\\nLittleHorse is free for production use according to the Server-Side Public License!\\n\\nTo get started with LittleHorse OSS, you can:\\n\\n* Visit us on [GitHub](https://github.com/littlehorse-enterprises)\\n* Try our [quickstarts](https://littlehorse.dev/docs/developer-guide/install#installation-and-quickstart)\\n\\nAdditionally, with version `0.2.0`, we have released our first two Docker Images:\\n\\n* [`lh-server`](https://gallery.ecr.aws/littlehorse/littlehorse-server), the production-ready build of the LittleHorse Server.\\n* [`lh-standalone`](https://gallery.ecr.aws/littlehorse/littlehorse-standalone), a self-contained build of the LittleHorse Server that you can run to get a working LH Installation for local development.\\n\\n## New Features\\n\\nRelease `0.2.0` contains many exciting new features, and we\'ve highlighted a few here. \\n\\n### User Tasks\\n\\n[User Tasks](https://littlehorse.dev/docs/concepts/user-tasks) are a massive new feature released in `0.2.0` which allow you to schedule tasks to be executed by a human user alongside tasks that are executed by computers.\\n\\nIn `0.2.0`, User Tasks have reached stability, meaning that future releases will be backwards-compatible with the current User Tasks API. We currently have the following features:\\n\\n* Assignment of tasks to a User or User Group\\n* Reminder Tasks, or `TaskRun`\'s that are scheduled some time after a `UserTaskRun` is scheduled.\\n* Automatic reassignment of a `UserTaskRun` after some period of inactivity.\\n* Manual reassignment of a `UserTaskRun`.\\n* `UserTaskRun` search.\\n\\n:::note\\nThe public API for User Tasks is stable in all of the grpc clients and in the Java `WfSpec` SDK.\\n\\nThe Go and Python grpc clients both support User Tasks. However, neither Python nor Go yet have support for User Tasks in the `WfSpec` SDK.\\n:::\\n\\n### Workflow Threading\\n\\nRelease `0.2.0` allows you to use a `WAIT_FOR_THREADS` node to wait for more than one child thread at one time. For an example, see our [Parallel Approval Example](https://github.com/littlehorse-enterprises/littlehorse/tree/master/examples/parallel-approval) on our GitHub.\\n\\nFuture releases will provide _backwards-compatible_ enhancements to this\\nfunctionality, allowing various strategies for handling failures of individual child threads.\\n\\n### Python Support\\n\\nWe have released an alpha [Python SDK](https://github.com/littlehorse-enterprises/littlehorse/tree/master/sdk-python)! This release contains:\\n\\n* Python client in grpc\\n* Python Task Worker SDK\\n\\nCurrently, building `WfSpec`\'s in Python is not supported. We aim to move python Task Worker support from alpha to beta, and add alpha support for `WfSpec` development in python, in the `0.3.0` release.\\n\\nTo try out our python task worker client, you can head to [Installation Docs](https://littlehorse.dev/docs/developer-guide/install) and the [Task Worker Development Docs](https://littlehorse.dev/docs/developer-guide/task-worker-development).\\n\\n:::note\\nThe Python SDK is in the alpha stage, meaning that future releases could break backwards compatibility.\\n:::\\n\\n### Security\\n\\nWe added beta support for OAuth, TLS, and mTLS in release `0.2.0`. The following features graduated to \\"beta\\" in this release:\\n\\n* TLS encryption for incoming connections on all listeners, configured on a per-listener basis.\\n* mTLS to authenticate incoming connections on any listeners, configured on a per-listener basis.\\n* OAuth to authenticate incoming connections on any public listener (excluding the inter-server communication port).\\n\\n:::info\\nBeta support means that we will soon add significant functionality, and as such a future release _might_ break backwards compatibility.\\n\\nHowever, future releases of a feature in the _beta_ state will most likely be backwards compatible with `0.2.0` barring exceptional circumstances.\\n:::\\n\\n### Performance\\n\\nWe made several optimizations to our storage management sub-system, reducing the number of put\'s and get\'s into our backing state store by roughly 30%. As a result, a LittleHorse Server running with a single partition is capable of scheduling over 1,100 `TaskRun`\'s per second.\\n\\n### Go Support\\n\\nSupport for the Go client is now beta. Future releases will maintain compatibility for all features on our documentation.\\n\\nRelease `0.3.0` will close the gap between the Java and Go SDK\'s, adding features such as:\\n* Format Strings for Variable Assignments in the `WfSpec` SDK\\n* User Task support in the `WfSpec` SDK\\n* Configuring Indexes on `Variable`s in the `WfSpec` SDK\\n\\n## What\'s Next\\n\\nWe have several exciting features coming soon over the next few releases, including:\\n\\n* Fine-grained access controls\\n* Backward-compatible improvements to [Failure Handling](https://littlehorse.dev/docs/concepts/exception-handling)\\n* C# support\\n* Python support for building `WfSpec`s\\n\\nFor an enterprise-ready distribution of LittleHorse running in your own datacenter, contact `sales@littlehorse.io` to inquire about LittleHorse Platform.\\n\\nFor a pay-as-you-go, serverless Managed Service of LittleHorse in the cloud, fill out the [LH Cloud Waitlist Form](https://docs.google.com/forms/d/e/1FAIpQLScXVvTYy4LQnYoFoRKRQ7ppuxe0KgncsDukvm96qKN0pU5TnQ/viewform)."}]}')}}]);