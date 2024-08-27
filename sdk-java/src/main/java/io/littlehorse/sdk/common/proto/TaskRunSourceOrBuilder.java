// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: task_run.proto

package io.littlehorse.sdk.common.proto;

public interface TaskRunSourceOrBuilder extends
    // @@protoc_insertion_point(interface_extends:littlehorse.TaskRunSource)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Reference to a NodeRun of type TASK which scheduled this TaskRun.
   * </pre>
   *
   * <code>.littlehorse.TaskNodeReference task_node = 1;</code>
   * @return Whether the taskNode field is set.
   */
  boolean hasTaskNode();
  /**
   * <pre>
   * Reference to a NodeRun of type TASK which scheduled this TaskRun.
   * </pre>
   *
   * <code>.littlehorse.TaskNodeReference task_node = 1;</code>
   * @return The taskNode.
   */
  io.littlehorse.sdk.common.proto.TaskNodeReference getTaskNode();
  /**
   * <pre>
   * Reference to a NodeRun of type TASK which scheduled this TaskRun.
   * </pre>
   *
   * <code>.littlehorse.TaskNodeReference task_node = 1;</code>
   */
  io.littlehorse.sdk.common.proto.TaskNodeReferenceOrBuilder getTaskNodeOrBuilder();

  /**
   * <pre>
   * Reference to the specific UserTaskRun trigger action which scheduled this TaskRun
   * </pre>
   *
   * <code>.littlehorse.UserTaskTriggerReference user_task_trigger = 2;</code>
   * @return Whether the userTaskTrigger field is set.
   */
  boolean hasUserTaskTrigger();
  /**
   * <pre>
   * Reference to the specific UserTaskRun trigger action which scheduled this TaskRun
   * </pre>
   *
   * <code>.littlehorse.UserTaskTriggerReference user_task_trigger = 2;</code>
   * @return The userTaskTrigger.
   */
  io.littlehorse.sdk.common.proto.UserTaskTriggerReference getUserTaskTrigger();
  /**
   * <pre>
   * Reference to the specific UserTaskRun trigger action which scheduled this TaskRun
   * </pre>
   *
   * <code>.littlehorse.UserTaskTriggerReference user_task_trigger = 2;</code>
   */
  io.littlehorse.sdk.common.proto.UserTaskTriggerReferenceOrBuilder getUserTaskTriggerOrBuilder();

  /**
   * <pre>
   * The ID of the WfSpec that is being executed. Always set in ScheduledTask.source so
   * that the WorkerContext can know this information.
   * </pre>
   *
   * <code>optional .littlehorse.WfSpecId wf_spec_id = 3;</code>
   * @return Whether the wfSpecId field is set.
   */
  boolean hasWfSpecId();
  /**
   * <pre>
   * The ID of the WfSpec that is being executed. Always set in ScheduledTask.source so
   * that the WorkerContext can know this information.
   * </pre>
   *
   * <code>optional .littlehorse.WfSpecId wf_spec_id = 3;</code>
   * @return The wfSpecId.
   */
  io.littlehorse.sdk.common.proto.WfSpecId getWfSpecId();
  /**
   * <pre>
   * The ID of the WfSpec that is being executed. Always set in ScheduledTask.source so
   * that the WorkerContext can know this information.
   * </pre>
   *
   * <code>optional .littlehorse.WfSpecId wf_spec_id = 3;</code>
   */
  io.littlehorse.sdk.common.proto.WfSpecIdOrBuilder getWfSpecIdOrBuilder();

  io.littlehorse.sdk.common.proto.TaskRunSource.TaskRunSourceCase getTaskRunSourceCase();
}