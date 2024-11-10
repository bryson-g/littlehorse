package basic

import (
	"github.com/littlehorse-enterprises/littlehorse/sdk-go/lhproto"
	"github.com/littlehorse-enterprises/littlehorse/sdk-go/littlehorse"
)

const WorkflowName string = "basic-workflow2"
const TaskDefName string = "greet"

func Greet(name string, guh string, v2 string) string {
	if name == "obi-wan" {
		return "hello theref"
	} else {
		return "hello, " + name
	}
}

func MyWorkflow(wf *littlehorse.WorkflowThread) {
	nameVar := wf.AddVariableWithDefault("name", lhproto.VariableType_STR, "Qui-Gon Jinn")

	// Make it searchable
	nameVar.Searchable()

	wf.Execute(TaskDefName, nameVar)
	wf.Execute(TaskDefName, nameVar)
}
