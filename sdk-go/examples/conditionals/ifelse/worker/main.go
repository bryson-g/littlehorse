package main

import (
	"log"

	"bitbucket.org/littlehorse-core/littlehorse/sdk-go/examples"
	"bitbucket.org/littlehorse-core/littlehorse/sdk-go/examples/conditionals/ifelse"
	"bitbucket.org/littlehorse-core/littlehorse/sdk-go/taskworker"
)

func main() {
	config, _ := examples.LoadConfigAndClient()

	var saladWorker, donutWorker *taskworker.LHTaskWorker
	var err error

	saladWorker, err = taskworker.NewTaskWorker(config, ifelse.Salad, "eat-salad")
	if err != nil {
		log.Fatal(err)
	}

	donutWorker, err = taskworker.NewTaskWorker(config, ifelse.Donut, "eat-another-donut")
	if err != nil {
		log.Fatal(err)
	}

	saladWorker.RegisterTaskDef(true)
	donutWorker.RegisterTaskDef(true)

	defer func() {
		log.Default().Print("Shutting down task workers")
		saladWorker.Close()
		donutWorker.Close()
	}()

	// Start the workers.
	log.Default().Print("Starting Task Workers")
	go func() {
		donutWorker.Start()
	}()
	saladWorker.Start()
}