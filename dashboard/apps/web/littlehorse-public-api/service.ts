/* eslint-disable */
import Long from "long";
import type { CallContext, CallOptions } from "nice-grpc-common";
import * as _m0 from "protobufjs/minimal";
import { Principal, PutPrincipalRequest, PutTenantRequest, Tenant } from "./acls";
import {
  LHStatus,
  lHStatusFromJSON,
  lHStatusToJSON,
  lHStatusToNumber,
  MetricsWindowLength,
  metricsWindowLengthFromJSON,
  metricsWindowLengthToJSON,
  metricsWindowLengthToNumber,
  TaskStatus,
  taskStatusFromJSON,
  taskStatusToJSON,
  taskStatusToNumber,
} from "./common_enums";
import { VariableDef } from "./common_wfspec";
import { ExternalEvent, ExternalEventDef, ExternalEventRetentionPolicy } from "./external_event";
import { Empty } from "./google/protobuf/empty";
import { Timestamp } from "./google/protobuf/timestamp";
import { NodeRun } from "./node_run";
import {
  ExternalEventDefId,
  ExternalEventId,
  NodeRunId,
  TaskDefId,
  TaskRunId,
  TaskWorkerGroupId,
  UserTaskDefId,
  UserTaskRunId,
  VariableId,
  WfRunId,
  WfSpecId,
} from "./object_id";
import { TaskDef } from "./task_def";
import { LHTaskError, LHTaskException, TaskRun, TaskRunSource, VarNameAndVal } from "./task_run";
import {
  AssignUserTaskRunRequest,
  CancelUserTaskRunRequest,
  CompleteUserTaskRunRequest,
  UserTaskDef,
  UserTaskField,
  UserTaskRun,
  UserTaskRunStatus,
  userTaskRunStatusFromJSON,
  userTaskRunStatusToJSON,
  userTaskRunStatusToNumber,
} from "./user_tasks";
import { Variable, VariableValue } from "./variable";
import { WfRun } from "./wf_run";
import { ThreadSpec, WfSpec, WfSpecVersionMigration, WorkflowRetentionPolicy } from "./wf_spec";

export const protobufPackage = "littlehorse";

export enum LHHealthResult {
  LH_HEALTH_RUNNING = "LH_HEALTH_RUNNING",
  LH_HEALTH_REBALANCING = "LH_HEALTH_REBALANCING",
  LH_HEALTH_ERROR = "LH_HEALTH_ERROR",
  UNRECOGNIZED = "UNRECOGNIZED",
}

export function lHHealthResultFromJSON(object: any): LHHealthResult {
  switch (object) {
    case 0:
    case "LH_HEALTH_RUNNING":
      return LHHealthResult.LH_HEALTH_RUNNING;
    case 1:
    case "LH_HEALTH_REBALANCING":
      return LHHealthResult.LH_HEALTH_REBALANCING;
    case 2:
    case "LH_HEALTH_ERROR":
      return LHHealthResult.LH_HEALTH_ERROR;
    case -1:
    case "UNRECOGNIZED":
    default:
      return LHHealthResult.UNRECOGNIZED;
  }
}

export function lHHealthResultToJSON(object: LHHealthResult): string {
  switch (object) {
    case LHHealthResult.LH_HEALTH_RUNNING:
      return "LH_HEALTH_RUNNING";
    case LHHealthResult.LH_HEALTH_REBALANCING:
      return "LH_HEALTH_REBALANCING";
    case LHHealthResult.LH_HEALTH_ERROR:
      return "LH_HEALTH_ERROR";
    case LHHealthResult.UNRECOGNIZED:
    default:
      return "UNRECOGNIZED";
  }
}

export function lHHealthResultToNumber(object: LHHealthResult): number {
  switch (object) {
    case LHHealthResult.LH_HEALTH_RUNNING:
      return 0;
    case LHHealthResult.LH_HEALTH_REBALANCING:
      return 1;
    case LHHealthResult.LH_HEALTH_ERROR:
      return 2;
    case LHHealthResult.UNRECOGNIZED:
    default:
      return -1;
  }
}

export interface GetLatestUserTaskDefRequest {
  name: string;
}

export interface PutWfSpecRequest {
  name: string;
  threadSpecs: { [key: string]: ThreadSpec };
  entrypointThreadName: string;
  retentionPolicy?: WorkflowRetentionPolicy | undefined;
}

export interface PutWfSpecRequest_ThreadSpecsEntry {
  key: string;
  value: ThreadSpec | undefined;
}

export interface PutTaskDefRequest {
  name: string;
  inputVars: VariableDef[];
}

export interface PutUserTaskDefRequest {
  name: string;
  fields: UserTaskField[];
  description?: string | undefined;
}

export interface PutExternalEventDefRequest {
  name: string;
  retentionPolicy: ExternalEventRetentionPolicy | undefined;
}

export interface PutExternalEventRequest {
  wfRunId: WfRunId | undefined;
  externalEventDefId: ExternalEventDefId | undefined;
  guid?: string | undefined;
  content: VariableValue | undefined;
  threadRunNumber?: number | undefined;
  nodeRunPosition?: number | undefined;
}

export interface DeleteExternalEventRequest {
  id: ExternalEventId | undefined;
}

export interface DeleteWfRunRequest {
  id: WfRunId | undefined;
}

export interface DeleteTaskDefRequest {
  id: TaskDefId | undefined;
}

export interface DeleteUserTaskDefRequest {
  id: UserTaskDefId | undefined;
}

export interface DeleteWfSpecRequest {
  id: WfSpecId | undefined;
}

export interface DeleteExternalEventDefRequest {
  id: ExternalEventDefId | undefined;
}

export interface RunWfRequest {
  wfSpecName: string;
  majorVersion?: number | undefined;
  revision?: number | undefined;
  variables: { [key: string]: VariableValue };
  id?: string | undefined;
}

export interface RunWfRequest_VariablesEntry {
  key: string;
  value: VariableValue | undefined;
}

export interface SearchWfRunRequest {
  bookmark?: Uint8Array | undefined;
  limit?: number | undefined;
  statusAndSpec?: SearchWfRunRequest_StatusAndSpecRequest | undefined;
  name?: SearchWfRunRequest_NameRequest | undefined;
  statusAndName?: SearchWfRunRequest_StatusAndNameRequest | undefined;
}

export interface SearchWfRunRequest_StatusAndSpecRequest {
  wfSpecId: WfSpecId | undefined;
  status: LHStatus;
  earliestStart?: string | undefined;
  latestStart?: string | undefined;
}

export interface SearchWfRunRequest_NameRequest {
  wfSpecName: string;
  earliestStart?: string | undefined;
  latestStart?: string | undefined;
}

export interface SearchWfRunRequest_StatusAndNameRequest {
  wfSpecName: string;
  status: LHStatus;
  earliestStart?: string | undefined;
  latestStart?: string | undefined;
}

export interface WfRunIdList {
  results: WfRunId[];
  bookmark?: Uint8Array | undefined;
}

export interface SearchTaskRunRequest {
  bookmark?: Uint8Array | undefined;
  limit?: number | undefined;
  statusAndTaskDef?: SearchTaskRunRequest_StatusAndTaskDefRequest | undefined;
  taskDef?: SearchTaskRunRequest_ByTaskDefRequest | undefined;
}

export interface SearchTaskRunRequest_StatusAndTaskDefRequest {
  status: TaskStatus;
  taskDefName: string;
  earliestStart?: string | undefined;
  latestStart?: string | undefined;
}

export interface SearchTaskRunRequest_ByTaskDefRequest {
  taskDefName: string;
  earliestStart?: string | undefined;
  latestStart?: string | undefined;
}

export interface TaskRunIdList {
  results: TaskRunId[];
  bookmark?: Uint8Array | undefined;
}

export interface SearchNodeRunRequest {
  bookmark?: Uint8Array | undefined;
  limit?: number | undefined;
  wfRunId?: WfRunId | undefined;
}

export interface NodeRunIdList {
  results: NodeRunId[];
  bookmark?: Uint8Array | undefined;
}

export interface SearchUserTaskRunRequest {
  bookmark?: Uint8Array | undefined;
  limit?: number | undefined;
  status?: UserTaskRunStatus | undefined;
  userTaskDefName?: string | undefined;
  userId?: string | undefined;
  userGroup?: string | undefined;
  earliestStart?: string | undefined;
  latestStart?: string | undefined;
}

export interface UserTaskRunIdList {
  results: UserTaskRunId[];
  bookmark?: Uint8Array | undefined;
}

export interface SearchVariableRequest {
  bookmark?: Uint8Array | undefined;
  limit?: number | undefined;
  wfRunId?: WfRunId | undefined;
  value?: SearchVariableRequest_NameAndValueRequest | undefined;
}

export interface SearchVariableRequest_NameAndValueRequest {
  value: VariableValue | undefined;
  wfSpecMajorVersion?: number | undefined;
  wfSpecRevision?: number | undefined;
  varName: string;
  wfSpecName: string;
}

export interface VariableIdList {
  results: VariableId[];
  bookmark?: Uint8Array | undefined;
}

export interface SearchTaskDefRequest {
  bookmark?: Uint8Array | undefined;
  limit?: number | undefined;
  prefix?: string | undefined;
}

export interface TaskDefIdList {
  results: TaskDefId[];
  bookmark?: Uint8Array | undefined;
}

export interface SearchUserTaskDefRequest {
  bookmark?: Uint8Array | undefined;
  limit?: number | undefined;
  prefix?: string | undefined;
  name?: string | undefined;
}

export interface UserTaskDefIdList {
  results: UserTaskDefId[];
  bookmark?: Uint8Array | undefined;
}

export interface SearchWfSpecRequest {
  bookmark?: Uint8Array | undefined;
  limit?: number | undefined;
  name?: string | undefined;
  prefix?: string | undefined;
  taskDefName?: string | undefined;
}

export interface WfSpecIdList {
  results: WfSpecId[];
  bookmark?: Uint8Array | undefined;
}

export interface SearchExternalEventDefRequest {
  bookmark?: Uint8Array | undefined;
  limit?: number | undefined;
  prefix?: string | undefined;
}

export interface ExternalEventDefIdList {
  results: ExternalEventDefId[];
  bookmark?: Uint8Array | undefined;
}

export interface SearchExternalEventRequest {
  bookmark?: Uint8Array | undefined;
  limit?: number | undefined;
  wfRunId?: WfRunId | undefined;
  externalEventDefNameAndStatus?: SearchExternalEventRequest_ByExtEvtDefNameAndStatusRequest | undefined;
}

export interface SearchExternalEventRequest_ByExtEvtDefNameAndStatusRequest {
  externalEventDefName: string;
  isClaimed?: boolean | undefined;
}

export interface ExternalEventIdList {
  results: ExternalEventId[];
  bookmark?: Uint8Array | undefined;
}

export interface ListNodeRunsRequest {
  wfRunId: WfRunId | undefined;
}

export interface NodeRunList {
  results: NodeRun[];
}

export interface ListVariablesRequest {
  wfRunId: WfRunId | undefined;
}

export interface VariableList {
  results: Variable[];
}

export interface ListExternalEventsRequest {
  wfRunId: WfRunId | undefined;
}

export interface ExternalEventList {
  results: ExternalEvent[];
}

export interface RegisterTaskWorkerRequest {
  clientId: string;
  taskDefId: TaskDefId | undefined;
  listenerName: string;
}

export interface TaskWorkerHeartBeatRequest {
  clientId: string;
  taskDefId: TaskDefId | undefined;
  listenerName: string;
}

export interface RegisterTaskWorkerResponse {
  yourHosts: LHHostInfo[];
  isClusterHealthy?: boolean | undefined;
}

export interface LHHostInfo {
  host: string;
  port: number;
}

export interface TaskWorkerMetadata {
  clientId: string;
  latestHeartbeat: string | undefined;
  hosts: LHHostInfo[];
}

export interface TaskWorkerGroup {
  id: TaskWorkerGroupId | undefined;
  createdAt: string | undefined;
  taskWorkers: { [key: string]: TaskWorkerMetadata };
}

export interface TaskWorkerGroup_TaskWorkersEntry {
  key: string;
  value: TaskWorkerMetadata | undefined;
}

export interface PollTaskRequest {
  taskDefId: TaskDefId | undefined;
  clientId: string;
  taskWorkerVersion?: string | undefined;
}

export interface ScheduledTask {
  taskRunId: TaskRunId | undefined;
  taskDefId: TaskDefId | undefined;
  attemptNumber: number;
  variables: VarNameAndVal[];
  createdAt: string | undefined;
  source: TaskRunSource | undefined;
}

export interface PollTaskResponse {
  result?: ScheduledTask | undefined;
}

export interface ReportTaskRun {
  taskRunId: TaskRunId | undefined;
  time: string | undefined;
  status: TaskStatus;
  logOutput?: VariableValue | undefined;
  attemptNumber: number;
  output?: VariableValue | undefined;
  error?: LHTaskError | undefined;
  exception?: LHTaskException | undefined;
}

export interface StopWfRunRequest {
  wfRunId: WfRunId | undefined;
  threadRunNumber: number;
}

export interface ResumeWfRunRequest {
  wfRunId: WfRunId | undefined;
  threadRunNumber: number;
}

export interface TaskDefMetricsQueryRequest {
  windowStart: string | undefined;
  windowType: MetricsWindowLength;
  taskDefName?: string | undefined;
}

export interface ListTaskMetricsRequest {
  taskDefId: TaskDefId | undefined;
  lastWindowStart: string | undefined;
  windowLength: MetricsWindowLength;
  numWindows: number;
}

export interface ListTaskMetricsResponse {
  results: TaskDefMetrics[];
}

export interface WfSpecMetricsQueryRequest {
  wfSpecId: WfSpecId | undefined;
  windowStart: string | undefined;
  windowLength: MetricsWindowLength;
}

export interface ListWfMetricsRequest {
  wfSpecId: WfSpecId | undefined;
  lastWindowStart: string | undefined;
  windowLength: MetricsWindowLength;
  numWindows: number;
}

export interface ListWfMetricsResponse {
  results: WfSpecMetrics[];
}

export interface TaskDefMetrics {
  taskDefId: TaskDefId | undefined;
  windowStart: string | undefined;
  type: MetricsWindowLength;
  scheduleToStartMax: number;
  scheduleToStartAvg: number;
  startToCompleteMax: number;
  startToCompleteAvg: number;
  totalCompleted: number;
  totalErrored: number;
  totalStarted: number;
  totalScheduled: number;
}

export interface WfSpecMetrics {
  wfSpecId: WfSpecId | undefined;
  windowStart: string | undefined;
  type: MetricsWindowLength;
  totalStarted: number;
  totalCompleted: number;
  totalErrored: number;
  startToCompleteMax: number;
  startToCompleteAvg: number;
}

export interface ListUserTaskRunRequest {
  wfRunId: WfRunId | undefined;
}

export interface UserTaskRunList {
  results: UserTaskRun[];
}

export interface ListTaskRunsRequest {
  wfRunId: WfRunId | undefined;
}

export interface TaskRunList {
  results: TaskRun[];
}

export interface MigrateWfSpecRequest {
  oldWfSpec: WfSpecId | undefined;
  migration: WfSpecVersionMigration | undefined;
}

export interface GetLatestWfSpecRequest {
  name: string;
  majorVersion?: number | undefined;
}

export interface ServerVersionResponse {
  majorVersion: number;
  minorVersion: number;
  patchVersion: number;
  preReleaseIdentifier?: string | undefined;
}

function createBaseGetLatestUserTaskDefRequest(): GetLatestUserTaskDefRequest {
  return { name: "" };
}

export const GetLatestUserTaskDefRequest = {
  encode(message: GetLatestUserTaskDefRequest, writer: _m0.Writer = _m0.Writer.create()): _m0.Writer {
    if (message.name !== "") {
      writer.uint32(10).string(message.name);
    }
    return writer;
  },

  decode(input: _m0.Reader | Uint8Array, length?: number): GetLatestUserTaskDefRequest {
    const reader = input instanceof _m0.Reader ? input : _m0.Reader.create(input);
    let end = length === undefined ? reader.len : reader.pos + length;
    const message = createBaseGetLatestUserTaskDefRequest();
    while (reader.pos < end) {
      const tag = reader.uint32();
      switch (tag >>> 3) {
        case 1:
          if (tag !== 10) {
            break;
          }

          message.name = reader.string();
          continue;
      }
      if ((tag & 7) === 4 || tag === 0) {
        break;
      }
      reader.skipType(tag & 7);
    }
    return message;
  },

  fromJSON(object: any): GetLatestUserTaskDefRequest {
    return { name: isSet(object.name) ? globalThis.String(object.name) : "" };
  },

  toJSON(message: GetLatestUserTaskDefRequest): unknown {
    const obj: any = {};
    if (message.name !== "") {
      obj.name = message.name;
    }
    return obj;
  },

  create<I extends Exact<DeepPartial<GetLatestUserTaskDefRequest>, I>>(base?: I): GetLatestUserTaskDefRequest {
    return GetLatestUserTaskDefRequest.fromPartial(base ?? ({} as any));
  },
  fromPartial<I extends Exact<DeepPartial<GetLatestUserTaskDefRequest>, I>>(object: I): GetLatestUserTaskDefRequest {
    const message = createBaseGetLatestUserTaskDefRequest();
    message.name = object.name ?? "";
    return message;
  },
};

function createBasePutWfSpecRequest(): PutWfSpecRequest {
  return { name: "", threadSpecs: {}, entrypointThreadName: "", retentionPolicy: undefined };
}

export const PutWfSpecRequest = {
  encode(message: PutWfSpecRequest, writer: _m0.Writer = _m0.Writer.create()): _m0.Writer {
    if (message.name !== "") {
      writer.uint32(10).string(message.name);
    }
    Object.entries(message.threadSpecs).forEach(([key, value]) => {
      PutWfSpecRequest_ThreadSpecsEntry.encode({ key: key as any, value }, writer.uint32(42).fork()).ldelim();
    });
    if (message.entrypointThreadName !== "") {
      writer.uint32(50).string(message.entrypointThreadName);
    }
    if (message.retentionPolicy !== undefined) {
      WorkflowRetentionPolicy.encode(message.retentionPolicy, writer.uint32(66).fork()).ldelim();
    }
    return writer;
  },

  decode(input: _m0.Reader | Uint8Array, length?: number): PutWfSpecRequest {
    const reader = input instanceof _m0.Reader ? input : _m0.Reader.create(input);
    let end = length === undefined ? reader.len : reader.pos + length;
    const message = createBasePutWfSpecRequest();
    while (reader.pos < end) {
      const tag = reader.uint32();
      switch (tag >>> 3) {
        case 1:
          if (tag !== 10) {
            break;
          }

          message.name = reader.string();
          continue;
        case 5:
          if (tag !== 42) {
            break;
          }

          const entry5 = PutWfSpecRequest_ThreadSpecsEntry.decode(reader, reader.uint32());
          if (entry5.value !== undefined) {
            message.threadSpecs[entry5.key] = entry5.value;
          }
          continue;
        case 6:
          if (tag !== 50) {
            break;
          }

          message.entrypointThreadName = reader.string();
          continue;
        case 8:
          if (tag !== 66) {
            break;
          }

          message.retentionPolicy = WorkflowRetentionPolicy.decode(reader, reader.uint32());
          continue;
      }
      if ((tag & 7) === 4 || tag === 0) {
        break;
      }
      reader.skipType(tag & 7);
    }
    return message;
  },

  fromJSON(object: any): PutWfSpecRequest {
    return {
      name: isSet(object.name) ? globalThis.String(object.name) : "",
      threadSpecs: isObject(object.threadSpecs)
        ? Object.entries(object.threadSpecs).reduce<{ [key: string]: ThreadSpec }>((acc, [key, value]) => {
          acc[key] = ThreadSpec.fromJSON(value);
          return acc;
        }, {})
        : {},
      entrypointThreadName: isSet(object.entrypointThreadName) ? globalThis.String(object.entrypointThreadName) : "",
      retentionPolicy: isSet(object.retentionPolicy)
        ? WorkflowRetentionPolicy.fromJSON(object.retentionPolicy)
        : undefined,
    };
  },

  toJSON(message: PutWfSpecRequest): unknown {
    const obj: any = {};
    if (message.name !== "") {
      obj.name = message.name;
    }
    if (message.threadSpecs) {
      const entries = Object.entries(message.threadSpecs);
      if (entries.length > 0) {
        obj.threadSpecs = {};
        entries.forEach(([k, v]) => {
          obj.threadSpecs[k] = ThreadSpec.toJSON(v);
        });
      }
    }
    if (message.entrypointThreadName !== "") {
      obj.entrypointThreadName = message.entrypointThreadName;
    }
    if (message.retentionPolicy !== undefined) {
      obj.retentionPolicy = WorkflowRetentionPolicy.toJSON(message.retentionPolicy);
    }
    return obj;
  },

  create<I extends Exact<DeepPartial<PutWfSpecRequest>, I>>(base?: I): PutWfSpecRequest {
    return PutWfSpecRequest.fromPartial(base ?? ({} as any));
  },
  fromPartial<I extends Exact<DeepPartial<PutWfSpecRequest>, I>>(object: I): PutWfSpecRequest {
    const message = createBasePutWfSpecRequest();
    message.name = object.name ?? "";
    message.threadSpecs = Object.entries(object.threadSpecs ?? {}).reduce<{ [key: string]: ThreadSpec }>(
      (acc, [key, value]) => {
        if (value !== undefined) {
          acc[key] = ThreadSpec.fromPartial(value);
        }
        return acc;
      },
      {},
    );
    message.entrypointThreadName = object.entrypointThreadName ?? "";
    message.retentionPolicy = (object.retentionPolicy !== undefined && object.retentionPolicy !== null)
      ? WorkflowRetentionPolicy.fromPartial(object.retentionPolicy)
      : undefined;
    return message;
  },
};

function createBasePutWfSpecRequest_ThreadSpecsEntry(): PutWfSpecRequest_ThreadSpecsEntry {
  return { key: "", value: undefined };
}

export const PutWfSpecRequest_ThreadSpecsEntry = {
  encode(message: PutWfSpecRequest_ThreadSpecsEntry, writer: _m0.Writer = _m0.Writer.create()): _m0.Writer {
    if (message.key !== "") {
      writer.uint32(10).string(message.key);
    }
    if (message.value !== undefined) {
      ThreadSpec.encode(message.value, writer.uint32(18).fork()).ldelim();
    }
    return writer;
  },

  decode(input: _m0.Reader | Uint8Array, length?: number): PutWfSpecRequest_ThreadSpecsEntry {
    const reader = input instanceof _m0.Reader ? input : _m0.Reader.create(input);
    let end = length === undefined ? reader.len : reader.pos + length;
    const message = createBasePutWfSpecRequest_ThreadSpecsEntry();
    while (reader.pos < end) {
      const tag = reader.uint32();
      switch (tag >>> 3) {
        case 1:
          if (tag !== 10) {
            break;
          }

          message.key = reader.string();
          continue;
        case 2:
          if (tag !== 18) {
            break;
          }

          message.value = ThreadSpec.decode(reader, reader.uint32());
          continue;
      }
      if ((tag & 7) === 4 || tag === 0) {
        break;
      }
      reader.skipType(tag & 7);
    }
    return message;
  },

  fromJSON(object: any): PutWfSpecRequest_ThreadSpecsEntry {
    return {
      key: isSet(object.key) ? globalThis.String(object.key) : "",
      value: isSet(object.value) ? ThreadSpec.fromJSON(object.value) : undefined,
    };
  },

  toJSON(message: PutWfSpecRequest_ThreadSpecsEntry): unknown {
    const obj: any = {};
    if (message.key !== "") {
      obj.key = message.key;
    }
    if (message.value !== undefined) {
      obj.value = ThreadSpec.toJSON(message.value);
    }
    return obj;
  },

  create<I extends Exact<DeepPartial<PutWfSpecRequest_ThreadSpecsEntry>, I>>(
    base?: I,
  ): PutWfSpecRequest_ThreadSpecsEntry {
    return PutWfSpecRequest_ThreadSpecsEntry.fromPartial(base ?? ({} as any));
  },
  fromPartial<I extends Exact<DeepPartial<PutWfSpecRequest_ThreadSpecsEntry>, I>>(
    object: I,
  ): PutWfSpecRequest_ThreadSpecsEntry {
    const message = createBasePutWfSpecRequest_ThreadSpecsEntry();
    message.key = object.key ?? "";
    message.value = (object.value !== undefined && object.value !== null)
      ? ThreadSpec.fromPartial(object.value)
      : undefined;
    return message;
  },
};

function createBasePutTaskDefRequest(): PutTaskDefRequest {
  return { name: "", inputVars: [] };
}

export const PutTaskDefRequest = {
  encode(message: PutTaskDefRequest, writer: _m0.Writer = _m0.Writer.create()): _m0.Writer {
    if (message.name !== "") {
      writer.uint32(10).string(message.name);
    }
    for (const v of message.inputVars) {
      VariableDef.encode(v!, writer.uint32(18).fork()).ldelim();
    }
    return writer;
  },

  decode(input: _m0.Reader | Uint8Array, length?: number): PutTaskDefRequest {
    const reader = input instanceof _m0.Reader ? input : _m0.Reader.create(input);
    let end = length === undefined ? reader.len : reader.pos + length;
    const message = createBasePutTaskDefRequest();
    while (reader.pos < end) {
      const tag = reader.uint32();
      switch (tag >>> 3) {
        case 1:
          if (tag !== 10) {
            break;
          }

          message.name = reader.string();
          continue;
        case 2:
          if (tag !== 18) {
            break;
          }

          message.inputVars.push(VariableDef.decode(reader, reader.uint32()));
          continue;
      }
      if ((tag & 7) === 4 || tag === 0) {
        break;
      }
      reader.skipType(tag & 7);
    }
    return message;
  },

  fromJSON(object: any): PutTaskDefRequest {
    return {
      name: isSet(object.name) ? globalThis.String(object.name) : "",
      inputVars: globalThis.Array.isArray(object?.inputVars)
        ? object.inputVars.map((e: any) => VariableDef.fromJSON(e))
        : [],
    };
  },

  toJSON(message: PutTaskDefRequest): unknown {
    const obj: any = {};
    if (message.name !== "") {
      obj.name = message.name;
    }
    if (message.inputVars?.length) {
      obj.inputVars = message.inputVars.map((e) => VariableDef.toJSON(e));
    }
    return obj;
  },

  create<I extends Exact<DeepPartial<PutTaskDefRequest>, I>>(base?: I): PutTaskDefRequest {
    return PutTaskDefRequest.fromPartial(base ?? ({} as any));
  },
  fromPartial<I extends Exact<DeepPartial<PutTaskDefRequest>, I>>(object: I): PutTaskDefRequest {
    const message = createBasePutTaskDefRequest();
    message.name = object.name ?? "";
    message.inputVars = object.inputVars?.map((e) => VariableDef.fromPartial(e)) || [];
    return message;
  },
};

function createBasePutUserTaskDefRequest(): PutUserTaskDefRequest {
  return { name: "", fields: [], description: undefined };
}

export const PutUserTaskDefRequest = {
  encode(message: PutUserTaskDefRequest, writer: _m0.Writer = _m0.Writer.create()): _m0.Writer {
    if (message.name !== "") {
      writer.uint32(10).string(message.name);
    }
    for (const v of message.fields) {
      UserTaskField.encode(v!, writer.uint32(18).fork()).ldelim();
    }
    if (message.description !== undefined) {
      writer.uint32(26).string(message.description);
    }
    return writer;
  },

  decode(input: _m0.Reader | Uint8Array, length?: number): PutUserTaskDefRequest {
    const reader = input instanceof _m0.Reader ? input : _m0.Reader.create(input);
    let end = length === undefined ? reader.len : reader.pos + length;
    const message = createBasePutUserTaskDefRequest();
    while (reader.pos < end) {
      const tag = reader.uint32();
      switch (tag >>> 3) {
        case 1:
          if (tag !== 10) {
            break;
          }

          message.name = reader.string();
          continue;
        case 2:
          if (tag !== 18) {
            break;
          }

          message.fields.push(UserTaskField.decode(reader, reader.uint32()));
          continue;
        case 3:
          if (tag !== 26) {
            break;
          }

          message.description = reader.string();
          continue;
      }
      if ((tag & 7) === 4 || tag === 0) {
        break;
      }
      reader.skipType(tag & 7);
    }
    return message;
  },

  fromJSON(object: any): PutUserTaskDefRequest {
    return {
      name: isSet(object.name) ? globalThis.String(object.name) : "",
      fields: globalThis.Array.isArray(object?.fields) ? object.fields.map((e: any) => UserTaskField.fromJSON(e)) : [],
      description: isSet(object.description) ? globalThis.String(object.description) : undefined,
    };
  },

  toJSON(message: PutUserTaskDefRequest): unknown {
    const obj: any = {};
    if (message.name !== "") {
      obj.name = message.name;
    }
    if (message.fields?.length) {
      obj.fields = message.fields.map((e) => UserTaskField.toJSON(e));
    }
    if (message.description !== undefined) {
      obj.description = message.description;
    }
    return obj;
  },

  create<I extends Exact<DeepPartial<PutUserTaskDefRequest>, I>>(base?: I): PutUserTaskDefRequest {
    return PutUserTaskDefRequest.fromPartial(base ?? ({} as any));
  },
  fromPartial<I extends Exact<DeepPartial<PutUserTaskDefRequest>, I>>(object: I): PutUserTaskDefRequest {
    const message = createBasePutUserTaskDefRequest();
    message.name = object.name ?? "";
    message.fields = object.fields?.map((e) => UserTaskField.fromPartial(e)) || [];
    message.description = object.description ?? undefined;
    return message;
  },
};

function createBasePutExternalEventDefRequest(): PutExternalEventDefRequest {
  return { name: "", retentionPolicy: undefined };
}

export const PutExternalEventDefRequest = {
  encode(message: PutExternalEventDefRequest, writer: _m0.Writer = _m0.Writer.create()): _m0.Writer {
    if (message.name !== "") {
      writer.uint32(10).string(message.name);
    }
    if (message.retentionPolicy !== undefined) {
      ExternalEventRetentionPolicy.encode(message.retentionPolicy, writer.uint32(18).fork()).ldelim();
    }
    return writer;
  },

  decode(input: _m0.Reader | Uint8Array, length?: number): PutExternalEventDefRequest {
    const reader = input instanceof _m0.Reader ? input : _m0.Reader.create(input);
    let end = length === undefined ? reader.len : reader.pos + length;
    const message = createBasePutExternalEventDefRequest();
    while (reader.pos < end) {
      const tag = reader.uint32();
      switch (tag >>> 3) {
        case 1:
          if (tag !== 10) {
            break;
          }

          message.name = reader.string();
          continue;
        case 2:
          if (tag !== 18) {
            break;
          }

          message.retentionPolicy = ExternalEventRetentionPolicy.decode(reader, reader.uint32());
          continue;
      }
      if ((tag & 7) === 4 || tag === 0) {
        break;
      }
      reader.skipType(tag & 7);
    }
    return message;
  },

  fromJSON(object: any): PutExternalEventDefRequest {
    return {
      name: isSet(object.name) ? globalThis.String(object.name) : "",
      retentionPolicy: isSet(object.retentionPolicy)
        ? ExternalEventRetentionPolicy.fromJSON(object.retentionPolicy)
        : undefined,
    };
  },

  toJSON(message: PutExternalEventDefRequest): unknown {
    const obj: any = {};
    if (message.name !== "") {
      obj.name = message.name;
    }
    if (message.retentionPolicy !== undefined) {
      obj.retentionPolicy = ExternalEventRetentionPolicy.toJSON(message.retentionPolicy);
    }
    return obj;
  },

  create<I extends Exact<DeepPartial<PutExternalEventDefRequest>, I>>(base?: I): PutExternalEventDefRequest {
    return PutExternalEventDefRequest.fromPartial(base ?? ({} as any));
  },
  fromPartial<I extends Exact<DeepPartial<PutExternalEventDefRequest>, I>>(object: I): PutExternalEventDefRequest {
    const message = createBasePutExternalEventDefRequest();
    message.name = object.name ?? "";
    message.retentionPolicy = (object.retentionPolicy !== undefined && object.retentionPolicy !== null)
      ? ExternalEventRetentionPolicy.fromPartial(object.retentionPolicy)
      : undefined;
    return message;
  },
};

function createBasePutExternalEventRequest(): PutExternalEventRequest {
  return {
    wfRunId: undefined,
    externalEventDefId: undefined,
    guid: undefined,
    content: undefined,
    threadRunNumber: undefined,
    nodeRunPosition: undefined,
  };
}

export const PutExternalEventRequest = {
  encode(message: PutExternalEventRequest, writer: _m0.Writer = _m0.Writer.create()): _m0.Writer {
    if (message.wfRunId !== undefined) {
      WfRunId.encode(message.wfRunId, writer.uint32(10).fork()).ldelim();
    }
    if (message.externalEventDefId !== undefined) {
      ExternalEventDefId.encode(message.externalEventDefId, writer.uint32(18).fork()).ldelim();
    }
    if (message.guid !== undefined) {
      writer.uint32(26).string(message.guid);
    }
    if (message.content !== undefined) {
      VariableValue.encode(message.content, writer.uint32(42).fork()).ldelim();
    }
    if (message.threadRunNumber !== undefined) {
      writer.uint32(48).int32(message.threadRunNumber);
    }
    if (message.nodeRunPosition !== undefined) {
      writer.uint32(56).int32(message.nodeRunPosition);
    }
    return writer;
  },

  decode(input: _m0.Reader | Uint8Array, length?: number): PutExternalEventRequest {
    const reader = input instanceof _m0.Reader ? input : _m0.Reader.create(input);
    let end = length === undefined ? reader.len : reader.pos + length;
    const message = createBasePutExternalEventRequest();
    while (reader.pos < end) {
      const tag = reader.uint32();
      switch (tag >>> 3) {
        case 1:
          if (tag !== 10) {
            break;
          }

          message.wfRunId = WfRunId.decode(reader, reader.uint32());
          continue;
        case 2:
          if (tag !== 18) {
            break;
          }

          message.externalEventDefId = ExternalEventDefId.decode(reader, reader.uint32());
          continue;
        case 3:
          if (tag !== 26) {
            break;
          }

          message.guid = reader.string();
          continue;
        case 5:
          if (tag !== 42) {
            break;
          }

          message.content = VariableValue.decode(reader, reader.uint32());
          continue;
        case 6:
          if (tag !== 48) {
            break;
          }

          message.threadRunNumber = reader.int32();
          continue;
        case 7:
          if (tag !== 56) {
            break;
          }

          message.nodeRunPosition = reader.int32();
          continue;
      }
      if ((tag & 7) === 4 || tag === 0) {
        break;
      }
      reader.skipType(tag & 7);
    }
    return message;
  },

  fromJSON(object: any): PutExternalEventRequest {
    return {
      wfRunId: isSet(object.wfRunId) ? WfRunId.fromJSON(object.wfRunId) : undefined,
      externalEventDefId: isSet(object.externalEventDefId)
        ? ExternalEventDefId.fromJSON(object.externalEventDefId)
        : undefined,
      guid: isSet(object.guid) ? globalThis.String(object.guid) : undefined,
      content: isSet(object.content) ? VariableValue.fromJSON(object.content) : undefined,
      threadRunNumber: isSet(object.threadRunNumber) ? globalThis.Number(object.threadRunNumber) : undefined,
      nodeRunPosition: isSet(object.nodeRunPosition) ? globalThis.Number(object.nodeRunPosition) : undefined,
    };
  },

  toJSON(message: PutExternalEventRequest): unknown {
    const obj: any = {};
    if (message.wfRunId !== undefined) {
      obj.wfRunId = WfRunId.toJSON(message.wfRunId);
    }
    if (message.externalEventDefId !== undefined) {
      obj.externalEventDefId = ExternalEventDefId.toJSON(message.externalEventDefId);
    }
    if (message.guid !== undefined) {
      obj.guid = message.guid;
    }
    if (message.content !== undefined) {
      obj.content = VariableValue.toJSON(message.content);
    }
    if (message.threadRunNumber !== undefined) {
      obj.threadRunNumber = Math.round(message.threadRunNumber);
    }
    if (message.nodeRunPosition !== undefined) {
      obj.nodeRunPosition = Math.round(message.nodeRunPosition);
    }
    return obj;
  },

  create<I extends Exact<DeepPartial<PutExternalEventRequest>, I>>(base?: I): PutExternalEventRequest {
    return PutExternalEventRequest.fromPartial(base ?? ({} as any));
  },
  fromPartial<I extends Exact<DeepPartial<PutExternalEventRequest>, I>>(object: I): PutExternalEventRequest {
    const message = createBasePutExternalEventRequest();
    message.wfRunId = (object.wfRunId !== undefined && object.wfRunId !== null)
      ? WfRunId.fromPartial(object.wfRunId)
      : undefined;
    message.externalEventDefId = (object.externalEventDefId !== undefined && object.externalEventDefId !== null)
      ? ExternalEventDefId.fromPartial(object.externalEventDefId)
      : undefined;
    message.guid = object.guid ?? undefined;
    message.content = (object.content !== undefined && object.content !== null)
      ? VariableValue.fromPartial(object.content)
      : undefined;
    message.threadRunNumber = object.threadRunNumber ?? undefined;
    message.nodeRunPosition = object.nodeRunPosition ?? undefined;
    return message;
  },
};

function createBaseDeleteExternalEventRequest(): DeleteExternalEventRequest {
  return { id: undefined };
}

export const DeleteExternalEventRequest = {
  encode(message: DeleteExternalEventRequest, writer: _m0.Writer = _m0.Writer.create()): _m0.Writer {
    if (message.id !== undefined) {
      ExternalEventId.encode(message.id, writer.uint32(10).fork()).ldelim();
    }
    return writer;
  },

  decode(input: _m0.Reader | Uint8Array, length?: number): DeleteExternalEventRequest {
    const reader = input instanceof _m0.Reader ? input : _m0.Reader.create(input);
    let end = length === undefined ? reader.len : reader.pos + length;
    const message = createBaseDeleteExternalEventRequest();
    while (reader.pos < end) {
      const tag = reader.uint32();
      switch (tag >>> 3) {
        case 1:
          if (tag !== 10) {
            break;
          }

          message.id = ExternalEventId.decode(reader, reader.uint32());
          continue;
      }
      if ((tag & 7) === 4 || tag === 0) {
        break;
      }
      reader.skipType(tag & 7);
    }
    return message;
  },

  fromJSON(object: any): DeleteExternalEventRequest {
    return { id: isSet(object.id) ? ExternalEventId.fromJSON(object.id) : undefined };
  },

  toJSON(message: DeleteExternalEventRequest): unknown {
    const obj: any = {};
    if (message.id !== undefined) {
      obj.id = ExternalEventId.toJSON(message.id);
    }
    return obj;
  },

  create<I extends Exact<DeepPartial<DeleteExternalEventRequest>, I>>(base?: I): DeleteExternalEventRequest {
    return DeleteExternalEventRequest.fromPartial(base ?? ({} as any));
  },
  fromPartial<I extends Exact<DeepPartial<DeleteExternalEventRequest>, I>>(object: I): DeleteExternalEventRequest {
    const message = createBaseDeleteExternalEventRequest();
    message.id = (object.id !== undefined && object.id !== null) ? ExternalEventId.fromPartial(object.id) : undefined;
    return message;
  },
};

function createBaseDeleteWfRunRequest(): DeleteWfRunRequest {
  return { id: undefined };
}

export const DeleteWfRunRequest = {
  encode(message: DeleteWfRunRequest, writer: _m0.Writer = _m0.Writer.create()): _m0.Writer {
    if (message.id !== undefined) {
      WfRunId.encode(message.id, writer.uint32(10).fork()).ldelim();
    }
    return writer;
  },

  decode(input: _m0.Reader | Uint8Array, length?: number): DeleteWfRunRequest {
    const reader = input instanceof _m0.Reader ? input : _m0.Reader.create(input);
    let end = length === undefined ? reader.len : reader.pos + length;
    const message = createBaseDeleteWfRunRequest();
    while (reader.pos < end) {
      const tag = reader.uint32();
      switch (tag >>> 3) {
        case 1:
          if (tag !== 10) {
            break;
          }

          message.id = WfRunId.decode(reader, reader.uint32());
          continue;
      }
      if ((tag & 7) === 4 || tag === 0) {
        break;
      }
      reader.skipType(tag & 7);
    }
    return message;
  },

  fromJSON(object: any): DeleteWfRunRequest {
    return { id: isSet(object.id) ? WfRunId.fromJSON(object.id) : undefined };
  },

  toJSON(message: DeleteWfRunRequest): unknown {
    const obj: any = {};
    if (message.id !== undefined) {
      obj.id = WfRunId.toJSON(message.id);
    }
    return obj;
  },

  create<I extends Exact<DeepPartial<DeleteWfRunRequest>, I>>(base?: I): DeleteWfRunRequest {
    return DeleteWfRunRequest.fromPartial(base ?? ({} as any));
  },
  fromPartial<I extends Exact<DeepPartial<DeleteWfRunRequest>, I>>(object: I): DeleteWfRunRequest {
    const message = createBaseDeleteWfRunRequest();
    message.id = (object.id !== undefined && object.id !== null) ? WfRunId.fromPartial(object.id) : undefined;
    return message;
  },
};

function createBaseDeleteTaskDefRequest(): DeleteTaskDefRequest {
  return { id: undefined };
}

export const DeleteTaskDefRequest = {
  encode(message: DeleteTaskDefRequest, writer: _m0.Writer = _m0.Writer.create()): _m0.Writer {
    if (message.id !== undefined) {
      TaskDefId.encode(message.id, writer.uint32(10).fork()).ldelim();
    }
    return writer;
  },

  decode(input: _m0.Reader | Uint8Array, length?: number): DeleteTaskDefRequest {
    const reader = input instanceof _m0.Reader ? input : _m0.Reader.create(input);
    let end = length === undefined ? reader.len : reader.pos + length;
    const message = createBaseDeleteTaskDefRequest();
    while (reader.pos < end) {
      const tag = reader.uint32();
      switch (tag >>> 3) {
        case 1:
          if (tag !== 10) {
            break;
          }

          message.id = TaskDefId.decode(reader, reader.uint32());
          continue;
      }
      if ((tag & 7) === 4 || tag === 0) {
        break;
      }
      reader.skipType(tag & 7);
    }
    return message;
  },

  fromJSON(object: any): DeleteTaskDefRequest {
    return { id: isSet(object.id) ? TaskDefId.fromJSON(object.id) : undefined };
  },

  toJSON(message: DeleteTaskDefRequest): unknown {
    const obj: any = {};
    if (message.id !== undefined) {
      obj.id = TaskDefId.toJSON(message.id);
    }
    return obj;
  },

  create<I extends Exact<DeepPartial<DeleteTaskDefRequest>, I>>(base?: I): DeleteTaskDefRequest {
    return DeleteTaskDefRequest.fromPartial(base ?? ({} as any));
  },
  fromPartial<I extends Exact<DeepPartial<DeleteTaskDefRequest>, I>>(object: I): DeleteTaskDefRequest {
    const message = createBaseDeleteTaskDefRequest();
    message.id = (object.id !== undefined && object.id !== null) ? TaskDefId.fromPartial(object.id) : undefined;
    return message;
  },
};

function createBaseDeleteUserTaskDefRequest(): DeleteUserTaskDefRequest {
  return { id: undefined };
}

export const DeleteUserTaskDefRequest = {
  encode(message: DeleteUserTaskDefRequest, writer: _m0.Writer = _m0.Writer.create()): _m0.Writer {
    if (message.id !== undefined) {
      UserTaskDefId.encode(message.id, writer.uint32(10).fork()).ldelim();
    }
    return writer;
  },

  decode(input: _m0.Reader | Uint8Array, length?: number): DeleteUserTaskDefRequest {
    const reader = input instanceof _m0.Reader ? input : _m0.Reader.create(input);
    let end = length === undefined ? reader.len : reader.pos + length;
    const message = createBaseDeleteUserTaskDefRequest();
    while (reader.pos < end) {
      const tag = reader.uint32();
      switch (tag >>> 3) {
        case 1:
          if (tag !== 10) {
            break;
          }

          message.id = UserTaskDefId.decode(reader, reader.uint32());
          continue;
      }
      if ((tag & 7) === 4 || tag === 0) {
        break;
      }
      reader.skipType(tag & 7);
    }
    return message;
  },

  fromJSON(object: any): DeleteUserTaskDefRequest {
    return { id: isSet(object.id) ? UserTaskDefId.fromJSON(object.id) : undefined };
  },

  toJSON(message: DeleteUserTaskDefRequest): unknown {
    const obj: any = {};
    if (message.id !== undefined) {
      obj.id = UserTaskDefId.toJSON(message.id);
    }
    return obj;
  },

  create<I extends Exact<DeepPartial<DeleteUserTaskDefRequest>, I>>(base?: I): DeleteUserTaskDefRequest {
    return DeleteUserTaskDefRequest.fromPartial(base ?? ({} as any));
  },
  fromPartial<I extends Exact<DeepPartial<DeleteUserTaskDefRequest>, I>>(object: I): DeleteUserTaskDefRequest {
    const message = createBaseDeleteUserTaskDefRequest();
    message.id = (object.id !== undefined && object.id !== null) ? UserTaskDefId.fromPartial(object.id) : undefined;
    return message;
  },
};

function createBaseDeleteWfSpecRequest(): DeleteWfSpecRequest {
  return { id: undefined };
}

export const DeleteWfSpecRequest = {
  encode(message: DeleteWfSpecRequest, writer: _m0.Writer = _m0.Writer.create()): _m0.Writer {
    if (message.id !== undefined) {
      WfSpecId.encode(message.id, writer.uint32(10).fork()).ldelim();
    }
    return writer;
  },

  decode(input: _m0.Reader | Uint8Array, length?: number): DeleteWfSpecRequest {
    const reader = input instanceof _m0.Reader ? input : _m0.Reader.create(input);
    let end = length === undefined ? reader.len : reader.pos + length;
    const message = createBaseDeleteWfSpecRequest();
    while (reader.pos < end) {
      const tag = reader.uint32();
      switch (tag >>> 3) {
        case 1:
          if (tag !== 10) {
            break;
          }

          message.id = WfSpecId.decode(reader, reader.uint32());
          continue;
      }
      if ((tag & 7) === 4 || tag === 0) {
        break;
      }
      reader.skipType(tag & 7);
    }
    return message;
  },

  fromJSON(object: any): DeleteWfSpecRequest {
    return { id: isSet(object.id) ? WfSpecId.fromJSON(object.id) : undefined };
  },

  toJSON(message: DeleteWfSpecRequest): unknown {
    const obj: any = {};
    if (message.id !== undefined) {
      obj.id = WfSpecId.toJSON(message.id);
    }
    return obj;
  },

  create<I extends Exact<DeepPartial<DeleteWfSpecRequest>, I>>(base?: I): DeleteWfSpecRequest {
    return DeleteWfSpecRequest.fromPartial(base ?? ({} as any));
  },
  fromPartial<I extends Exact<DeepPartial<DeleteWfSpecRequest>, I>>(object: I): DeleteWfSpecRequest {
    const message = createBaseDeleteWfSpecRequest();
    message.id = (object.id !== undefined && object.id !== null) ? WfSpecId.fromPartial(object.id) : undefined;
    return message;
  },
};

function createBaseDeleteExternalEventDefRequest(): DeleteExternalEventDefRequest {
  return { id: undefined };
}

export const DeleteExternalEventDefRequest = {
  encode(message: DeleteExternalEventDefRequest, writer: _m0.Writer = _m0.Writer.create()): _m0.Writer {
    if (message.id !== undefined) {
      ExternalEventDefId.encode(message.id, writer.uint32(10).fork()).ldelim();
    }
    return writer;
  },

  decode(input: _m0.Reader | Uint8Array, length?: number): DeleteExternalEventDefRequest {
    const reader = input instanceof _m0.Reader ? input : _m0.Reader.create(input);
    let end = length === undefined ? reader.len : reader.pos + length;
    const message = createBaseDeleteExternalEventDefRequest();
    while (reader.pos < end) {
      const tag = reader.uint32();
      switch (tag >>> 3) {
        case 1:
          if (tag !== 10) {
            break;
          }

          message.id = ExternalEventDefId.decode(reader, reader.uint32());
          continue;
      }
      if ((tag & 7) === 4 || tag === 0) {
        break;
      }
      reader.skipType(tag & 7);
    }
    return message;
  },

  fromJSON(object: any): DeleteExternalEventDefRequest {
    return { id: isSet(object.id) ? ExternalEventDefId.fromJSON(object.id) : undefined };
  },

  toJSON(message: DeleteExternalEventDefRequest): unknown {
    const obj: any = {};
    if (message.id !== undefined) {
      obj.id = ExternalEventDefId.toJSON(message.id);
    }
    return obj;
  },

  create<I extends Exact<DeepPartial<DeleteExternalEventDefRequest>, I>>(base?: I): DeleteExternalEventDefRequest {
    return DeleteExternalEventDefRequest.fromPartial(base ?? ({} as any));
  },
  fromPartial<I extends Exact<DeepPartial<DeleteExternalEventDefRequest>, I>>(
    object: I,
  ): DeleteExternalEventDefRequest {
    const message = createBaseDeleteExternalEventDefRequest();
    message.id = (object.id !== undefined && object.id !== null)
      ? ExternalEventDefId.fromPartial(object.id)
      : undefined;
    return message;
  },
};

function createBaseRunWfRequest(): RunWfRequest {
  return { wfSpecName: "", majorVersion: undefined, revision: undefined, variables: {}, id: undefined };
}

export const RunWfRequest = {
  encode(message: RunWfRequest, writer: _m0.Writer = _m0.Writer.create()): _m0.Writer {
    if (message.wfSpecName !== "") {
      writer.uint32(10).string(message.wfSpecName);
    }
    if (message.majorVersion !== undefined) {
      writer.uint32(16).int32(message.majorVersion);
    }
    if (message.revision !== undefined) {
      writer.uint32(24).int32(message.revision);
    }
    Object.entries(message.variables).forEach(([key, value]) => {
      RunWfRequest_VariablesEntry.encode({ key: key as any, value }, writer.uint32(34).fork()).ldelim();
    });
    if (message.id !== undefined) {
      writer.uint32(42).string(message.id);
    }
    return writer;
  },

  decode(input: _m0.Reader | Uint8Array, length?: number): RunWfRequest {
    const reader = input instanceof _m0.Reader ? input : _m0.Reader.create(input);
    let end = length === undefined ? reader.len : reader.pos + length;
    const message = createBaseRunWfRequest();
    while (reader.pos < end) {
      const tag = reader.uint32();
      switch (tag >>> 3) {
        case 1:
          if (tag !== 10) {
            break;
          }

          message.wfSpecName = reader.string();
          continue;
        case 2:
          if (tag !== 16) {
            break;
          }

          message.majorVersion = reader.int32();
          continue;
        case 3:
          if (tag !== 24) {
            break;
          }

          message.revision = reader.int32();
          continue;
        case 4:
          if (tag !== 34) {
            break;
          }

          const entry4 = RunWfRequest_VariablesEntry.decode(reader, reader.uint32());
          if (entry4.value !== undefined) {
            message.variables[entry4.key] = entry4.value;
          }
          continue;
        case 5:
          if (tag !== 42) {
            break;
          }

          message.id = reader.string();
          continue;
      }
      if ((tag & 7) === 4 || tag === 0) {
        break;
      }
      reader.skipType(tag & 7);
    }
    return message;
  },

  fromJSON(object: any): RunWfRequest {
    return {
      wfSpecName: isSet(object.wfSpecName) ? globalThis.String(object.wfSpecName) : "",
      majorVersion: isSet(object.majorVersion) ? globalThis.Number(object.majorVersion) : undefined,
      revision: isSet(object.revision) ? globalThis.Number(object.revision) : undefined,
      variables: isObject(object.variables)
        ? Object.entries(object.variables).reduce<{ [key: string]: VariableValue }>((acc, [key, value]) => {
          acc[key] = VariableValue.fromJSON(value);
          return acc;
        }, {})
        : {},
      id: isSet(object.id) ? globalThis.String(object.id) : undefined,
    };
  },

  toJSON(message: RunWfRequest): unknown {
    const obj: any = {};
    if (message.wfSpecName !== "") {
      obj.wfSpecName = message.wfSpecName;
    }
    if (message.majorVersion !== undefined) {
      obj.majorVersion = Math.round(message.majorVersion);
    }
    if (message.revision !== undefined) {
      obj.revision = Math.round(message.revision);
    }
    if (message.variables) {
      const entries = Object.entries(message.variables);
      if (entries.length > 0) {
        obj.variables = {};
        entries.forEach(([k, v]) => {
          obj.variables[k] = VariableValue.toJSON(v);
        });
      }
    }
    if (message.id !== undefined) {
      obj.id = message.id;
    }
    return obj;
  },

  create<I extends Exact<DeepPartial<RunWfRequest>, I>>(base?: I): RunWfRequest {
    return RunWfRequest.fromPartial(base ?? ({} as any));
  },
  fromPartial<I extends Exact<DeepPartial<RunWfRequest>, I>>(object: I): RunWfRequest {
    const message = createBaseRunWfRequest();
    message.wfSpecName = object.wfSpecName ?? "";
    message.majorVersion = object.majorVersion ?? undefined;
    message.revision = object.revision ?? undefined;
    message.variables = Object.entries(object.variables ?? {}).reduce<{ [key: string]: VariableValue }>(
      (acc, [key, value]) => {
        if (value !== undefined) {
          acc[key] = VariableValue.fromPartial(value);
        }
        return acc;
      },
      {},
    );
    message.id = object.id ?? undefined;
    return message;
  },
};

function createBaseRunWfRequest_VariablesEntry(): RunWfRequest_VariablesEntry {
  return { key: "", value: undefined };
}

export const RunWfRequest_VariablesEntry = {
  encode(message: RunWfRequest_VariablesEntry, writer: _m0.Writer = _m0.Writer.create()): _m0.Writer {
    if (message.key !== "") {
      writer.uint32(10).string(message.key);
    }
    if (message.value !== undefined) {
      VariableValue.encode(message.value, writer.uint32(18).fork()).ldelim();
    }
    return writer;
  },

  decode(input: _m0.Reader | Uint8Array, length?: number): RunWfRequest_VariablesEntry {
    const reader = input instanceof _m0.Reader ? input : _m0.Reader.create(input);
    let end = length === undefined ? reader.len : reader.pos + length;
    const message = createBaseRunWfRequest_VariablesEntry();
    while (reader.pos < end) {
      const tag = reader.uint32();
      switch (tag >>> 3) {
        case 1:
          if (tag !== 10) {
            break;
          }

          message.key = reader.string();
          continue;
        case 2:
          if (tag !== 18) {
            break;
          }

          message.value = VariableValue.decode(reader, reader.uint32());
          continue;
      }
      if ((tag & 7) === 4 || tag === 0) {
        break;
      }
      reader.skipType(tag & 7);
    }
    return message;
  },

  fromJSON(object: any): RunWfRequest_VariablesEntry {
    return {
      key: isSet(object.key) ? globalThis.String(object.key) : "",
      value: isSet(object.value) ? VariableValue.fromJSON(object.value) : undefined,
    };
  },

  toJSON(message: RunWfRequest_VariablesEntry): unknown {
    const obj: any = {};
    if (message.key !== "") {
      obj.key = message.key;
    }
    if (message.value !== undefined) {
      obj.value = VariableValue.toJSON(message.value);
    }
    return obj;
  },

  create<I extends Exact<DeepPartial<RunWfRequest_VariablesEntry>, I>>(base?: I): RunWfRequest_VariablesEntry {
    return RunWfRequest_VariablesEntry.fromPartial(base ?? ({} as any));
  },
  fromPartial<I extends Exact<DeepPartial<RunWfRequest_VariablesEntry>, I>>(object: I): RunWfRequest_VariablesEntry {
    const message = createBaseRunWfRequest_VariablesEntry();
    message.key = object.key ?? "";
    message.value = (object.value !== undefined && object.value !== null)
      ? VariableValue.fromPartial(object.value)
      : undefined;
    return message;
  },
};

function createBaseSearchWfRunRequest(): SearchWfRunRequest {
  return { bookmark: undefined, limit: undefined, statusAndSpec: undefined, name: undefined, statusAndName: undefined };
}

export const SearchWfRunRequest = {
  encode(message: SearchWfRunRequest, writer: _m0.Writer = _m0.Writer.create()): _m0.Writer {
    if (message.bookmark !== undefined) {
      writer.uint32(10).bytes(message.bookmark);
    }
    if (message.limit !== undefined) {
      writer.uint32(16).int32(message.limit);
    }
    if (message.statusAndSpec !== undefined) {
      SearchWfRunRequest_StatusAndSpecRequest.encode(message.statusAndSpec, writer.uint32(26).fork()).ldelim();
    }
    if (message.name !== undefined) {
      SearchWfRunRequest_NameRequest.encode(message.name, writer.uint32(34).fork()).ldelim();
    }
    if (message.statusAndName !== undefined) {
      SearchWfRunRequest_StatusAndNameRequest.encode(message.statusAndName, writer.uint32(42).fork()).ldelim();
    }
    return writer;
  },

  decode(input: _m0.Reader | Uint8Array, length?: number): SearchWfRunRequest {
    const reader = input instanceof _m0.Reader ? input : _m0.Reader.create(input);
    let end = length === undefined ? reader.len : reader.pos + length;
    const message = createBaseSearchWfRunRequest();
    while (reader.pos < end) {
      const tag = reader.uint32();
      switch (tag >>> 3) {
        case 1:
          if (tag !== 10) {
            break;
          }

          message.bookmark = reader.bytes();
          continue;
        case 2:
          if (tag !== 16) {
            break;
          }

          message.limit = reader.int32();
          continue;
        case 3:
          if (tag !== 26) {
            break;
          }

          message.statusAndSpec = SearchWfRunRequest_StatusAndSpecRequest.decode(reader, reader.uint32());
          continue;
        case 4:
          if (tag !== 34) {
            break;
          }

          message.name = SearchWfRunRequest_NameRequest.decode(reader, reader.uint32());
          continue;
        case 5:
          if (tag !== 42) {
            break;
          }

          message.statusAndName = SearchWfRunRequest_StatusAndNameRequest.decode(reader, reader.uint32());
          continue;
      }
      if ((tag & 7) === 4 || tag === 0) {
        break;
      }
      reader.skipType(tag & 7);
    }
    return message;
  },

  fromJSON(object: any): SearchWfRunRequest {
    return {
      bookmark: isSet(object.bookmark) ? bytesFromBase64(object.bookmark) : undefined,
      limit: isSet(object.limit) ? globalThis.Number(object.limit) : undefined,
      statusAndSpec: isSet(object.statusAndSpec)
        ? SearchWfRunRequest_StatusAndSpecRequest.fromJSON(object.statusAndSpec)
        : undefined,
      name: isSet(object.name) ? SearchWfRunRequest_NameRequest.fromJSON(object.name) : undefined,
      statusAndName: isSet(object.statusAndName)
        ? SearchWfRunRequest_StatusAndNameRequest.fromJSON(object.statusAndName)
        : undefined,
    };
  },

  toJSON(message: SearchWfRunRequest): unknown {
    const obj: any = {};
    if (message.bookmark !== undefined) {
      obj.bookmark = base64FromBytes(message.bookmark);
    }
    if (message.limit !== undefined) {
      obj.limit = Math.round(message.limit);
    }
    if (message.statusAndSpec !== undefined) {
      obj.statusAndSpec = SearchWfRunRequest_StatusAndSpecRequest.toJSON(message.statusAndSpec);
    }
    if (message.name !== undefined) {
      obj.name = SearchWfRunRequest_NameRequest.toJSON(message.name);
    }
    if (message.statusAndName !== undefined) {
      obj.statusAndName = SearchWfRunRequest_StatusAndNameRequest.toJSON(message.statusAndName);
    }
    return obj;
  },

  create<I extends Exact<DeepPartial<SearchWfRunRequest>, I>>(base?: I): SearchWfRunRequest {
    return SearchWfRunRequest.fromPartial(base ?? ({} as any));
  },
  fromPartial<I extends Exact<DeepPartial<SearchWfRunRequest>, I>>(object: I): SearchWfRunRequest {
    const message = createBaseSearchWfRunRequest();
    message.bookmark = object.bookmark ?? undefined;
    message.limit = object.limit ?? undefined;
    message.statusAndSpec = (object.statusAndSpec !== undefined && object.statusAndSpec !== null)
      ? SearchWfRunRequest_StatusAndSpecRequest.fromPartial(object.statusAndSpec)
      : undefined;
    message.name = (object.name !== undefined && object.name !== null)
      ? SearchWfRunRequest_NameRequest.fromPartial(object.name)
      : undefined;
    message.statusAndName = (object.statusAndName !== undefined && object.statusAndName !== null)
      ? SearchWfRunRequest_StatusAndNameRequest.fromPartial(object.statusAndName)
      : undefined;
    return message;
  },
};

function createBaseSearchWfRunRequest_StatusAndSpecRequest(): SearchWfRunRequest_StatusAndSpecRequest {
  return { wfSpecId: undefined, status: LHStatus.STARTING, earliestStart: undefined, latestStart: undefined };
}

export const SearchWfRunRequest_StatusAndSpecRequest = {
  encode(message: SearchWfRunRequest_StatusAndSpecRequest, writer: _m0.Writer = _m0.Writer.create()): _m0.Writer {
    if (message.wfSpecId !== undefined) {
      WfSpecId.encode(message.wfSpecId, writer.uint32(10).fork()).ldelim();
    }
    if (message.status !== LHStatus.STARTING) {
      writer.uint32(16).int32(lHStatusToNumber(message.status));
    }
    if (message.earliestStart !== undefined) {
      Timestamp.encode(toTimestamp(message.earliestStart), writer.uint32(26).fork()).ldelim();
    }
    if (message.latestStart !== undefined) {
      Timestamp.encode(toTimestamp(message.latestStart), writer.uint32(34).fork()).ldelim();
    }
    return writer;
  },

  decode(input: _m0.Reader | Uint8Array, length?: number): SearchWfRunRequest_StatusAndSpecRequest {
    const reader = input instanceof _m0.Reader ? input : _m0.Reader.create(input);
    let end = length === undefined ? reader.len : reader.pos + length;
    const message = createBaseSearchWfRunRequest_StatusAndSpecRequest();
    while (reader.pos < end) {
      const tag = reader.uint32();
      switch (tag >>> 3) {
        case 1:
          if (tag !== 10) {
            break;
          }

          message.wfSpecId = WfSpecId.decode(reader, reader.uint32());
          continue;
        case 2:
          if (tag !== 16) {
            break;
          }

          message.status = lHStatusFromJSON(reader.int32());
          continue;
        case 3:
          if (tag !== 26) {
            break;
          }

          message.earliestStart = fromTimestamp(Timestamp.decode(reader, reader.uint32()));
          continue;
        case 4:
          if (tag !== 34) {
            break;
          }

          message.latestStart = fromTimestamp(Timestamp.decode(reader, reader.uint32()));
          continue;
      }
      if ((tag & 7) === 4 || tag === 0) {
        break;
      }
      reader.skipType(tag & 7);
    }
    return message;
  },

  fromJSON(object: any): SearchWfRunRequest_StatusAndSpecRequest {
    return {
      wfSpecId: isSet(object.wfSpecId) ? WfSpecId.fromJSON(object.wfSpecId) : undefined,
      status: isSet(object.status) ? lHStatusFromJSON(object.status) : LHStatus.STARTING,
      earliestStart: isSet(object.earliestStart) ? globalThis.String(object.earliestStart) : undefined,
      latestStart: isSet(object.latestStart) ? globalThis.String(object.latestStart) : undefined,
    };
  },

  toJSON(message: SearchWfRunRequest_StatusAndSpecRequest): unknown {
    const obj: any = {};
    if (message.wfSpecId !== undefined) {
      obj.wfSpecId = WfSpecId.toJSON(message.wfSpecId);
    }
    if (message.status !== LHStatus.STARTING) {
      obj.status = lHStatusToJSON(message.status);
    }
    if (message.earliestStart !== undefined) {
      obj.earliestStart = message.earliestStart;
    }
    if (message.latestStart !== undefined) {
      obj.latestStart = message.latestStart;
    }
    return obj;
  },

  create<I extends Exact<DeepPartial<SearchWfRunRequest_StatusAndSpecRequest>, I>>(
    base?: I,
  ): SearchWfRunRequest_StatusAndSpecRequest {
    return SearchWfRunRequest_StatusAndSpecRequest.fromPartial(base ?? ({} as any));
  },
  fromPartial<I extends Exact<DeepPartial<SearchWfRunRequest_StatusAndSpecRequest>, I>>(
    object: I,
  ): SearchWfRunRequest_StatusAndSpecRequest {
    const message = createBaseSearchWfRunRequest_StatusAndSpecRequest();
    message.wfSpecId = (object.wfSpecId !== undefined && object.wfSpecId !== null)
      ? WfSpecId.fromPartial(object.wfSpecId)
      : undefined;
    message.status = object.status ?? LHStatus.STARTING;
    message.earliestStart = object.earliestStart ?? undefined;
    message.latestStart = object.latestStart ?? undefined;
    return message;
  },
};

function createBaseSearchWfRunRequest_NameRequest(): SearchWfRunRequest_NameRequest {
  return { wfSpecName: "", earliestStart: undefined, latestStart: undefined };
}

export const SearchWfRunRequest_NameRequest = {
  encode(message: SearchWfRunRequest_NameRequest, writer: _m0.Writer = _m0.Writer.create()): _m0.Writer {
    if (message.wfSpecName !== "") {
      writer.uint32(10).string(message.wfSpecName);
    }
    if (message.earliestStart !== undefined) {
      Timestamp.encode(toTimestamp(message.earliestStart), writer.uint32(18).fork()).ldelim();
    }
    if (message.latestStart !== undefined) {
      Timestamp.encode(toTimestamp(message.latestStart), writer.uint32(26).fork()).ldelim();
    }
    return writer;
  },

  decode(input: _m0.Reader | Uint8Array, length?: number): SearchWfRunRequest_NameRequest {
    const reader = input instanceof _m0.Reader ? input : _m0.Reader.create(input);
    let end = length === undefined ? reader.len : reader.pos + length;
    const message = createBaseSearchWfRunRequest_NameRequest();
    while (reader.pos < end) {
      const tag = reader.uint32();
      switch (tag >>> 3) {
        case 1:
          if (tag !== 10) {
            break;
          }

          message.wfSpecName = reader.string();
          continue;
        case 2:
          if (tag !== 18) {
            break;
          }

          message.earliestStart = fromTimestamp(Timestamp.decode(reader, reader.uint32()));
          continue;
        case 3:
          if (tag !== 26) {
            break;
          }

          message.latestStart = fromTimestamp(Timestamp.decode(reader, reader.uint32()));
          continue;
      }
      if ((tag & 7) === 4 || tag === 0) {
        break;
      }
      reader.skipType(tag & 7);
    }
    return message;
  },

  fromJSON(object: any): SearchWfRunRequest_NameRequest {
    return {
      wfSpecName: isSet(object.wfSpecName) ? globalThis.String(object.wfSpecName) : "",
      earliestStart: isSet(object.earliestStart) ? globalThis.String(object.earliestStart) : undefined,
      latestStart: isSet(object.latestStart) ? globalThis.String(object.latestStart) : undefined,
    };
  },

  toJSON(message: SearchWfRunRequest_NameRequest): unknown {
    const obj: any = {};
    if (message.wfSpecName !== "") {
      obj.wfSpecName = message.wfSpecName;
    }
    if (message.earliestStart !== undefined) {
      obj.earliestStart = message.earliestStart;
    }
    if (message.latestStart !== undefined) {
      obj.latestStart = message.latestStart;
    }
    return obj;
  },

  create<I extends Exact<DeepPartial<SearchWfRunRequest_NameRequest>, I>>(base?: I): SearchWfRunRequest_NameRequest {
    return SearchWfRunRequest_NameRequest.fromPartial(base ?? ({} as any));
  },
  fromPartial<I extends Exact<DeepPartial<SearchWfRunRequest_NameRequest>, I>>(
    object: I,
  ): SearchWfRunRequest_NameRequest {
    const message = createBaseSearchWfRunRequest_NameRequest();
    message.wfSpecName = object.wfSpecName ?? "";
    message.earliestStart = object.earliestStart ?? undefined;
    message.latestStart = object.latestStart ?? undefined;
    return message;
  },
};

function createBaseSearchWfRunRequest_StatusAndNameRequest(): SearchWfRunRequest_StatusAndNameRequest {
  return { wfSpecName: "", status: LHStatus.STARTING, earliestStart: undefined, latestStart: undefined };
}

export const SearchWfRunRequest_StatusAndNameRequest = {
  encode(message: SearchWfRunRequest_StatusAndNameRequest, writer: _m0.Writer = _m0.Writer.create()): _m0.Writer {
    if (message.wfSpecName !== "") {
      writer.uint32(10).string(message.wfSpecName);
    }
    if (message.status !== LHStatus.STARTING) {
      writer.uint32(16).int32(lHStatusToNumber(message.status));
    }
    if (message.earliestStart !== undefined) {
      Timestamp.encode(toTimestamp(message.earliestStart), writer.uint32(26).fork()).ldelim();
    }
    if (message.latestStart !== undefined) {
      Timestamp.encode(toTimestamp(message.latestStart), writer.uint32(34).fork()).ldelim();
    }
    return writer;
  },

  decode(input: _m0.Reader | Uint8Array, length?: number): SearchWfRunRequest_StatusAndNameRequest {
    const reader = input instanceof _m0.Reader ? input : _m0.Reader.create(input);
    let end = length === undefined ? reader.len : reader.pos + length;
    const message = createBaseSearchWfRunRequest_StatusAndNameRequest();
    while (reader.pos < end) {
      const tag = reader.uint32();
      switch (tag >>> 3) {
        case 1:
          if (tag !== 10) {
            break;
          }

          message.wfSpecName = reader.string();
          continue;
        case 2:
          if (tag !== 16) {
            break;
          }

          message.status = lHStatusFromJSON(reader.int32());
          continue;
        case 3:
          if (tag !== 26) {
            break;
          }

          message.earliestStart = fromTimestamp(Timestamp.decode(reader, reader.uint32()));
          continue;
        case 4:
          if (tag !== 34) {
            break;
          }

          message.latestStart = fromTimestamp(Timestamp.decode(reader, reader.uint32()));
          continue;
      }
      if ((tag & 7) === 4 || tag === 0) {
        break;
      }
      reader.skipType(tag & 7);
    }
    return message;
  },

  fromJSON(object: any): SearchWfRunRequest_StatusAndNameRequest {
    return {
      wfSpecName: isSet(object.wfSpecName) ? globalThis.String(object.wfSpecName) : "",
      status: isSet(object.status) ? lHStatusFromJSON(object.status) : LHStatus.STARTING,
      earliestStart: isSet(object.earliestStart) ? globalThis.String(object.earliestStart) : undefined,
      latestStart: isSet(object.latestStart) ? globalThis.String(object.latestStart) : undefined,
    };
  },

  toJSON(message: SearchWfRunRequest_StatusAndNameRequest): unknown {
    const obj: any = {};
    if (message.wfSpecName !== "") {
      obj.wfSpecName = message.wfSpecName;
    }
    if (message.status !== LHStatus.STARTING) {
      obj.status = lHStatusToJSON(message.status);
    }
    if (message.earliestStart !== undefined) {
      obj.earliestStart = message.earliestStart;
    }
    if (message.latestStart !== undefined) {
      obj.latestStart = message.latestStart;
    }
    return obj;
  },

  create<I extends Exact<DeepPartial<SearchWfRunRequest_StatusAndNameRequest>, I>>(
    base?: I,
  ): SearchWfRunRequest_StatusAndNameRequest {
    return SearchWfRunRequest_StatusAndNameRequest.fromPartial(base ?? ({} as any));
  },
  fromPartial<I extends Exact<DeepPartial<SearchWfRunRequest_StatusAndNameRequest>, I>>(
    object: I,
  ): SearchWfRunRequest_StatusAndNameRequest {
    const message = createBaseSearchWfRunRequest_StatusAndNameRequest();
    message.wfSpecName = object.wfSpecName ?? "";
    message.status = object.status ?? LHStatus.STARTING;
    message.earliestStart = object.earliestStart ?? undefined;
    message.latestStart = object.latestStart ?? undefined;
    return message;
  },
};

function createBaseWfRunIdList(): WfRunIdList {
  return { results: [], bookmark: undefined };
}

export const WfRunIdList = {
  encode(message: WfRunIdList, writer: _m0.Writer = _m0.Writer.create()): _m0.Writer {
    for (const v of message.results) {
      WfRunId.encode(v!, writer.uint32(10).fork()).ldelim();
    }
    if (message.bookmark !== undefined) {
      writer.uint32(18).bytes(message.bookmark);
    }
    return writer;
  },

  decode(input: _m0.Reader | Uint8Array, length?: number): WfRunIdList {
    const reader = input instanceof _m0.Reader ? input : _m0.Reader.create(input);
    let end = length === undefined ? reader.len : reader.pos + length;
    const message = createBaseWfRunIdList();
    while (reader.pos < end) {
      const tag = reader.uint32();
      switch (tag >>> 3) {
        case 1:
          if (tag !== 10) {
            break;
          }

          message.results.push(WfRunId.decode(reader, reader.uint32()));
          continue;
        case 2:
          if (tag !== 18) {
            break;
          }

          message.bookmark = reader.bytes();
          continue;
      }
      if ((tag & 7) === 4 || tag === 0) {
        break;
      }
      reader.skipType(tag & 7);
    }
    return message;
  },

  fromJSON(object: any): WfRunIdList {
    return {
      results: globalThis.Array.isArray(object?.results) ? object.results.map((e: any) => WfRunId.fromJSON(e)) : [],
      bookmark: isSet(object.bookmark) ? bytesFromBase64(object.bookmark) : undefined,
    };
  },

  toJSON(message: WfRunIdList): unknown {
    const obj: any = {};
    if (message.results?.length) {
      obj.results = message.results.map((e) => WfRunId.toJSON(e));
    }
    if (message.bookmark !== undefined) {
      obj.bookmark = base64FromBytes(message.bookmark);
    }
    return obj;
  },

  create<I extends Exact<DeepPartial<WfRunIdList>, I>>(base?: I): WfRunIdList {
    return WfRunIdList.fromPartial(base ?? ({} as any));
  },
  fromPartial<I extends Exact<DeepPartial<WfRunIdList>, I>>(object: I): WfRunIdList {
    const message = createBaseWfRunIdList();
    message.results = object.results?.map((e) => WfRunId.fromPartial(e)) || [];
    message.bookmark = object.bookmark ?? undefined;
    return message;
  },
};

function createBaseSearchTaskRunRequest(): SearchTaskRunRequest {
  return { bookmark: undefined, limit: undefined, statusAndTaskDef: undefined, taskDef: undefined };
}

export const SearchTaskRunRequest = {
  encode(message: SearchTaskRunRequest, writer: _m0.Writer = _m0.Writer.create()): _m0.Writer {
    if (message.bookmark !== undefined) {
      writer.uint32(10).bytes(message.bookmark);
    }
    if (message.limit !== undefined) {
      writer.uint32(16).int32(message.limit);
    }
    if (message.statusAndTaskDef !== undefined) {
      SearchTaskRunRequest_StatusAndTaskDefRequest.encode(message.statusAndTaskDef, writer.uint32(26).fork()).ldelim();
    }
    if (message.taskDef !== undefined) {
      SearchTaskRunRequest_ByTaskDefRequest.encode(message.taskDef, writer.uint32(34).fork()).ldelim();
    }
    return writer;
  },

  decode(input: _m0.Reader | Uint8Array, length?: number): SearchTaskRunRequest {
    const reader = input instanceof _m0.Reader ? input : _m0.Reader.create(input);
    let end = length === undefined ? reader.len : reader.pos + length;
    const message = createBaseSearchTaskRunRequest();
    while (reader.pos < end) {
      const tag = reader.uint32();
      switch (tag >>> 3) {
        case 1:
          if (tag !== 10) {
            break;
          }

          message.bookmark = reader.bytes();
          continue;
        case 2:
          if (tag !== 16) {
            break;
          }

          message.limit = reader.int32();
          continue;
        case 3:
          if (tag !== 26) {
            break;
          }

          message.statusAndTaskDef = SearchTaskRunRequest_StatusAndTaskDefRequest.decode(reader, reader.uint32());
          continue;
        case 4:
          if (tag !== 34) {
            break;
          }

          message.taskDef = SearchTaskRunRequest_ByTaskDefRequest.decode(reader, reader.uint32());
          continue;
      }
      if ((tag & 7) === 4 || tag === 0) {
        break;
      }
      reader.skipType(tag & 7);
    }
    return message;
  },

  fromJSON(object: any): SearchTaskRunRequest {
    return {
      bookmark: isSet(object.bookmark) ? bytesFromBase64(object.bookmark) : undefined,
      limit: isSet(object.limit) ? globalThis.Number(object.limit) : undefined,
      statusAndTaskDef: isSet(object.statusAndTaskDef)
        ? SearchTaskRunRequest_StatusAndTaskDefRequest.fromJSON(object.statusAndTaskDef)
        : undefined,
      taskDef: isSet(object.taskDef) ? SearchTaskRunRequest_ByTaskDefRequest.fromJSON(object.taskDef) : undefined,
    };
  },

  toJSON(message: SearchTaskRunRequest): unknown {
    const obj: any = {};
    if (message.bookmark !== undefined) {
      obj.bookmark = base64FromBytes(message.bookmark);
    }
    if (message.limit !== undefined) {
      obj.limit = Math.round(message.limit);
    }
    if (message.statusAndTaskDef !== undefined) {
      obj.statusAndTaskDef = SearchTaskRunRequest_StatusAndTaskDefRequest.toJSON(message.statusAndTaskDef);
    }
    if (message.taskDef !== undefined) {
      obj.taskDef = SearchTaskRunRequest_ByTaskDefRequest.toJSON(message.taskDef);
    }
    return obj;
  },

  create<I extends Exact<DeepPartial<SearchTaskRunRequest>, I>>(base?: I): SearchTaskRunRequest {
    return SearchTaskRunRequest.fromPartial(base ?? ({} as any));
  },
  fromPartial<I extends Exact<DeepPartial<SearchTaskRunRequest>, I>>(object: I): SearchTaskRunRequest {
    const message = createBaseSearchTaskRunRequest();
    message.bookmark = object.bookmark ?? undefined;
    message.limit = object.limit ?? undefined;
    message.statusAndTaskDef = (object.statusAndTaskDef !== undefined && object.statusAndTaskDef !== null)
      ? SearchTaskRunRequest_StatusAndTaskDefRequest.fromPartial(object.statusAndTaskDef)
      : undefined;
    message.taskDef = (object.taskDef !== undefined && object.taskDef !== null)
      ? SearchTaskRunRequest_ByTaskDefRequest.fromPartial(object.taskDef)
      : undefined;
    return message;
  },
};

function createBaseSearchTaskRunRequest_StatusAndTaskDefRequest(): SearchTaskRunRequest_StatusAndTaskDefRequest {
  return { status: TaskStatus.TASK_SCHEDULED, taskDefName: "", earliestStart: undefined, latestStart: undefined };
}

export const SearchTaskRunRequest_StatusAndTaskDefRequest = {
  encode(message: SearchTaskRunRequest_StatusAndTaskDefRequest, writer: _m0.Writer = _m0.Writer.create()): _m0.Writer {
    if (message.status !== TaskStatus.TASK_SCHEDULED) {
      writer.uint32(8).int32(taskStatusToNumber(message.status));
    }
    if (message.taskDefName !== "") {
      writer.uint32(18).string(message.taskDefName);
    }
    if (message.earliestStart !== undefined) {
      Timestamp.encode(toTimestamp(message.earliestStart), writer.uint32(26).fork()).ldelim();
    }
    if (message.latestStart !== undefined) {
      Timestamp.encode(toTimestamp(message.latestStart), writer.uint32(34).fork()).ldelim();
    }
    return writer;
  },

  decode(input: _m0.Reader | Uint8Array, length?: number): SearchTaskRunRequest_StatusAndTaskDefRequest {
    const reader = input instanceof _m0.Reader ? input : _m0.Reader.create(input);
    let end = length === undefined ? reader.len : reader.pos + length;
    const message = createBaseSearchTaskRunRequest_StatusAndTaskDefRequest();
    while (reader.pos < end) {
      const tag = reader.uint32();
      switch (tag >>> 3) {
        case 1:
          if (tag !== 8) {
            break;
          }

          message.status = taskStatusFromJSON(reader.int32());
          continue;
        case 2:
          if (tag !== 18) {
            break;
          }

          message.taskDefName = reader.string();
          continue;
        case 3:
          if (tag !== 26) {
            break;
          }

          message.earliestStart = fromTimestamp(Timestamp.decode(reader, reader.uint32()));
          continue;
        case 4:
          if (tag !== 34) {
            break;
          }

          message.latestStart = fromTimestamp(Timestamp.decode(reader, reader.uint32()));
          continue;
      }
      if ((tag & 7) === 4 || tag === 0) {
        break;
      }
      reader.skipType(tag & 7);
    }
    return message;
  },

  fromJSON(object: any): SearchTaskRunRequest_StatusAndTaskDefRequest {
    return {
      status: isSet(object.status) ? taskStatusFromJSON(object.status) : TaskStatus.TASK_SCHEDULED,
      taskDefName: isSet(object.taskDefName) ? globalThis.String(object.taskDefName) : "",
      earliestStart: isSet(object.earliestStart) ? globalThis.String(object.earliestStart) : undefined,
      latestStart: isSet(object.latestStart) ? globalThis.String(object.latestStart) : undefined,
    };
  },

  toJSON(message: SearchTaskRunRequest_StatusAndTaskDefRequest): unknown {
    const obj: any = {};
    if (message.status !== TaskStatus.TASK_SCHEDULED) {
      obj.status = taskStatusToJSON(message.status);
    }
    if (message.taskDefName !== "") {
      obj.taskDefName = message.taskDefName;
    }
    if (message.earliestStart !== undefined) {
      obj.earliestStart = message.earliestStart;
    }
    if (message.latestStart !== undefined) {
      obj.latestStart = message.latestStart;
    }
    return obj;
  },

  create<I extends Exact<DeepPartial<SearchTaskRunRequest_StatusAndTaskDefRequest>, I>>(
    base?: I,
  ): SearchTaskRunRequest_StatusAndTaskDefRequest {
    return SearchTaskRunRequest_StatusAndTaskDefRequest.fromPartial(base ?? ({} as any));
  },
  fromPartial<I extends Exact<DeepPartial<SearchTaskRunRequest_StatusAndTaskDefRequest>, I>>(
    object: I,
  ): SearchTaskRunRequest_StatusAndTaskDefRequest {
    const message = createBaseSearchTaskRunRequest_StatusAndTaskDefRequest();
    message.status = object.status ?? TaskStatus.TASK_SCHEDULED;
    message.taskDefName = object.taskDefName ?? "";
    message.earliestStart = object.earliestStart ?? undefined;
    message.latestStart = object.latestStart ?? undefined;
    return message;
  },
};

function createBaseSearchTaskRunRequest_ByTaskDefRequest(): SearchTaskRunRequest_ByTaskDefRequest {
  return { taskDefName: "", earliestStart: undefined, latestStart: undefined };
}

export const SearchTaskRunRequest_ByTaskDefRequest = {
  encode(message: SearchTaskRunRequest_ByTaskDefRequest, writer: _m0.Writer = _m0.Writer.create()): _m0.Writer {
    if (message.taskDefName !== "") {
      writer.uint32(10).string(message.taskDefName);
    }
    if (message.earliestStart !== undefined) {
      Timestamp.encode(toTimestamp(message.earliestStart), writer.uint32(18).fork()).ldelim();
    }
    if (message.latestStart !== undefined) {
      Timestamp.encode(toTimestamp(message.latestStart), writer.uint32(26).fork()).ldelim();
    }
    return writer;
  },

  decode(input: _m0.Reader | Uint8Array, length?: number): SearchTaskRunRequest_ByTaskDefRequest {
    const reader = input instanceof _m0.Reader ? input : _m0.Reader.create(input);
    let end = length === undefined ? reader.len : reader.pos + length;
    const message = createBaseSearchTaskRunRequest_ByTaskDefRequest();
    while (reader.pos < end) {
      const tag = reader.uint32();
      switch (tag >>> 3) {
        case 1:
          if (tag !== 10) {
            break;
          }

          message.taskDefName = reader.string();
          continue;
        case 2:
          if (tag !== 18) {
            break;
          }

          message.earliestStart = fromTimestamp(Timestamp.decode(reader, reader.uint32()));
          continue;
        case 3:
          if (tag !== 26) {
            break;
          }

          message.latestStart = fromTimestamp(Timestamp.decode(reader, reader.uint32()));
          continue;
      }
      if ((tag & 7) === 4 || tag === 0) {
        break;
      }
      reader.skipType(tag & 7);
    }
    return message;
  },

  fromJSON(object: any): SearchTaskRunRequest_ByTaskDefRequest {
    return {
      taskDefName: isSet(object.taskDefName) ? globalThis.String(object.taskDefName) : "",
      earliestStart: isSet(object.earliestStart) ? globalThis.String(object.earliestStart) : undefined,
      latestStart: isSet(object.latestStart) ? globalThis.String(object.latestStart) : undefined,
    };
  },

  toJSON(message: SearchTaskRunRequest_ByTaskDefRequest): unknown {
    const obj: any = {};
    if (message.taskDefName !== "") {
      obj.taskDefName = message.taskDefName;
    }
    if (message.earliestStart !== undefined) {
      obj.earliestStart = message.earliestStart;
    }
    if (message.latestStart !== undefined) {
      obj.latestStart = message.latestStart;
    }
    return obj;
  },

  create<I extends Exact<DeepPartial<SearchTaskRunRequest_ByTaskDefRequest>, I>>(
    base?: I,
  ): SearchTaskRunRequest_ByTaskDefRequest {
    return SearchTaskRunRequest_ByTaskDefRequest.fromPartial(base ?? ({} as any));
  },
  fromPartial<I extends Exact<DeepPartial<SearchTaskRunRequest_ByTaskDefRequest>, I>>(
    object: I,
  ): SearchTaskRunRequest_ByTaskDefRequest {
    const message = createBaseSearchTaskRunRequest_ByTaskDefRequest();
    message.taskDefName = object.taskDefName ?? "";
    message.earliestStart = object.earliestStart ?? undefined;
    message.latestStart = object.latestStart ?? undefined;
    return message;
  },
};

function createBaseTaskRunIdList(): TaskRunIdList {
  return { results: [], bookmark: undefined };
}

export const TaskRunIdList = {
  encode(message: TaskRunIdList, writer: _m0.Writer = _m0.Writer.create()): _m0.Writer {
    for (const v of message.results) {
      TaskRunId.encode(v!, writer.uint32(10).fork()).ldelim();
    }
    if (message.bookmark !== undefined) {
      writer.uint32(18).bytes(message.bookmark);
    }
    return writer;
  },

  decode(input: _m0.Reader | Uint8Array, length?: number): TaskRunIdList {
    const reader = input instanceof _m0.Reader ? input : _m0.Reader.create(input);
    let end = length === undefined ? reader.len : reader.pos + length;
    const message = createBaseTaskRunIdList();
    while (reader.pos < end) {
      const tag = reader.uint32();
      switch (tag >>> 3) {
        case 1:
          if (tag !== 10) {
            break;
          }

          message.results.push(TaskRunId.decode(reader, reader.uint32()));
          continue;
        case 2:
          if (tag !== 18) {
            break;
          }

          message.bookmark = reader.bytes();
          continue;
      }
      if ((tag & 7) === 4 || tag === 0) {
        break;
      }
      reader.skipType(tag & 7);
    }
    return message;
  },

  fromJSON(object: any): TaskRunIdList {
    return {
      results: globalThis.Array.isArray(object?.results) ? object.results.map((e: any) => TaskRunId.fromJSON(e)) : [],
      bookmark: isSet(object.bookmark) ? bytesFromBase64(object.bookmark) : undefined,
    };
  },

  toJSON(message: TaskRunIdList): unknown {
    const obj: any = {};
    if (message.results?.length) {
      obj.results = message.results.map((e) => TaskRunId.toJSON(e));
    }
    if (message.bookmark !== undefined) {
      obj.bookmark = base64FromBytes(message.bookmark);
    }
    return obj;
  },

  create<I extends Exact<DeepPartial<TaskRunIdList>, I>>(base?: I): TaskRunIdList {
    return TaskRunIdList.fromPartial(base ?? ({} as any));
  },
  fromPartial<I extends Exact<DeepPartial<TaskRunIdList>, I>>(object: I): TaskRunIdList {
    const message = createBaseTaskRunIdList();
    message.results = object.results?.map((e) => TaskRunId.fromPartial(e)) || [];
    message.bookmark = object.bookmark ?? undefined;
    return message;
  },
};

function createBaseSearchNodeRunRequest(): SearchNodeRunRequest {
  return { bookmark: undefined, limit: undefined, wfRunId: undefined };
}

export const SearchNodeRunRequest = {
  encode(message: SearchNodeRunRequest, writer: _m0.Writer = _m0.Writer.create()): _m0.Writer {
    if (message.bookmark !== undefined) {
      writer.uint32(10).bytes(message.bookmark);
    }
    if (message.limit !== undefined) {
      writer.uint32(16).int32(message.limit);
    }
    if (message.wfRunId !== undefined) {
      WfRunId.encode(message.wfRunId, writer.uint32(26).fork()).ldelim();
    }
    return writer;
  },

  decode(input: _m0.Reader | Uint8Array, length?: number): SearchNodeRunRequest {
    const reader = input instanceof _m0.Reader ? input : _m0.Reader.create(input);
    let end = length === undefined ? reader.len : reader.pos + length;
    const message = createBaseSearchNodeRunRequest();
    while (reader.pos < end) {
      const tag = reader.uint32();
      switch (tag >>> 3) {
        case 1:
          if (tag !== 10) {
            break;
          }

          message.bookmark = reader.bytes();
          continue;
        case 2:
          if (tag !== 16) {
            break;
          }

          message.limit = reader.int32();
          continue;
        case 3:
          if (tag !== 26) {
            break;
          }

          message.wfRunId = WfRunId.decode(reader, reader.uint32());
          continue;
      }
      if ((tag & 7) === 4 || tag === 0) {
        break;
      }
      reader.skipType(tag & 7);
    }
    return message;
  },

  fromJSON(object: any): SearchNodeRunRequest {
    return {
      bookmark: isSet(object.bookmark) ? bytesFromBase64(object.bookmark) : undefined,
      limit: isSet(object.limit) ? globalThis.Number(object.limit) : undefined,
      wfRunId: isSet(object.wfRunId) ? WfRunId.fromJSON(object.wfRunId) : undefined,
    };
  },

  toJSON(message: SearchNodeRunRequest): unknown {
    const obj: any = {};
    if (message.bookmark !== undefined) {
      obj.bookmark = base64FromBytes(message.bookmark);
    }
    if (message.limit !== undefined) {
      obj.limit = Math.round(message.limit);
    }
    if (message.wfRunId !== undefined) {
      obj.wfRunId = WfRunId.toJSON(message.wfRunId);
    }
    return obj;
  },

  create<I extends Exact<DeepPartial<SearchNodeRunRequest>, I>>(base?: I): SearchNodeRunRequest {
    return SearchNodeRunRequest.fromPartial(base ?? ({} as any));
  },
  fromPartial<I extends Exact<DeepPartial<SearchNodeRunRequest>, I>>(object: I): SearchNodeRunRequest {
    const message = createBaseSearchNodeRunRequest();
    message.bookmark = object.bookmark ?? undefined;
    message.limit = object.limit ?? undefined;
    message.wfRunId = (object.wfRunId !== undefined && object.wfRunId !== null)
      ? WfRunId.fromPartial(object.wfRunId)
      : undefined;
    return message;
  },
};

function createBaseNodeRunIdList(): NodeRunIdList {
  return { results: [], bookmark: undefined };
}

export const NodeRunIdList = {
  encode(message: NodeRunIdList, writer: _m0.Writer = _m0.Writer.create()): _m0.Writer {
    for (const v of message.results) {
      NodeRunId.encode(v!, writer.uint32(10).fork()).ldelim();
    }
    if (message.bookmark !== undefined) {
      writer.uint32(18).bytes(message.bookmark);
    }
    return writer;
  },

  decode(input: _m0.Reader | Uint8Array, length?: number): NodeRunIdList {
    const reader = input instanceof _m0.Reader ? input : _m0.Reader.create(input);
    let end = length === undefined ? reader.len : reader.pos + length;
    const message = createBaseNodeRunIdList();
    while (reader.pos < end) {
      const tag = reader.uint32();
      switch (tag >>> 3) {
        case 1:
          if (tag !== 10) {
            break;
          }

          message.results.push(NodeRunId.decode(reader, reader.uint32()));
          continue;
        case 2:
          if (tag !== 18) {
            break;
          }

          message.bookmark = reader.bytes();
          continue;
      }
      if ((tag & 7) === 4 || tag === 0) {
        break;
      }
      reader.skipType(tag & 7);
    }
    return message;
  },

  fromJSON(object: any): NodeRunIdList {
    return {
      results: globalThis.Array.isArray(object?.results) ? object.results.map((e: any) => NodeRunId.fromJSON(e)) : [],
      bookmark: isSet(object.bookmark) ? bytesFromBase64(object.bookmark) : undefined,
    };
  },

  toJSON(message: NodeRunIdList): unknown {
    const obj: any = {};
    if (message.results?.length) {
      obj.results = message.results.map((e) => NodeRunId.toJSON(e));
    }
    if (message.bookmark !== undefined) {
      obj.bookmark = base64FromBytes(message.bookmark);
    }
    return obj;
  },

  create<I extends Exact<DeepPartial<NodeRunIdList>, I>>(base?: I): NodeRunIdList {
    return NodeRunIdList.fromPartial(base ?? ({} as any));
  },
  fromPartial<I extends Exact<DeepPartial<NodeRunIdList>, I>>(object: I): NodeRunIdList {
    const message = createBaseNodeRunIdList();
    message.results = object.results?.map((e) => NodeRunId.fromPartial(e)) || [];
    message.bookmark = object.bookmark ?? undefined;
    return message;
  },
};

function createBaseSearchUserTaskRunRequest(): SearchUserTaskRunRequest {
  return {
    bookmark: undefined,
    limit: undefined,
    status: undefined,
    userTaskDefName: undefined,
    userId: undefined,
    userGroup: undefined,
    earliestStart: undefined,
    latestStart: undefined,
  };
}

export const SearchUserTaskRunRequest = {
  encode(message: SearchUserTaskRunRequest, writer: _m0.Writer = _m0.Writer.create()): _m0.Writer {
    if (message.bookmark !== undefined) {
      writer.uint32(10).bytes(message.bookmark);
    }
    if (message.limit !== undefined) {
      writer.uint32(16).int32(message.limit);
    }
    if (message.status !== undefined) {
      writer.uint32(24).int32(userTaskRunStatusToNumber(message.status));
    }
    if (message.userTaskDefName !== undefined) {
      writer.uint32(34).string(message.userTaskDefName);
    }
    if (message.userId !== undefined) {
      writer.uint32(42).string(message.userId);
    }
    if (message.userGroup !== undefined) {
      writer.uint32(50).string(message.userGroup);
    }
    if (message.earliestStart !== undefined) {
      Timestamp.encode(toTimestamp(message.earliestStart), writer.uint32(58).fork()).ldelim();
    }
    if (message.latestStart !== undefined) {
      Timestamp.encode(toTimestamp(message.latestStart), writer.uint32(66).fork()).ldelim();
    }
    return writer;
  },

  decode(input: _m0.Reader | Uint8Array, length?: number): SearchUserTaskRunRequest {
    const reader = input instanceof _m0.Reader ? input : _m0.Reader.create(input);
    let end = length === undefined ? reader.len : reader.pos + length;
    const message = createBaseSearchUserTaskRunRequest();
    while (reader.pos < end) {
      const tag = reader.uint32();
      switch (tag >>> 3) {
        case 1:
          if (tag !== 10) {
            break;
          }

          message.bookmark = reader.bytes();
          continue;
        case 2:
          if (tag !== 16) {
            break;
          }

          message.limit = reader.int32();
          continue;
        case 3:
          if (tag !== 24) {
            break;
          }

          message.status = userTaskRunStatusFromJSON(reader.int32());
          continue;
        case 4:
          if (tag !== 34) {
            break;
          }

          message.userTaskDefName = reader.string();
          continue;
        case 5:
          if (tag !== 42) {
            break;
          }

          message.userId = reader.string();
          continue;
        case 6:
          if (tag !== 50) {
            break;
          }

          message.userGroup = reader.string();
          continue;
        case 7:
          if (tag !== 58) {
            break;
          }

          message.earliestStart = fromTimestamp(Timestamp.decode(reader, reader.uint32()));
          continue;
        case 8:
          if (tag !== 66) {
            break;
          }

          message.latestStart = fromTimestamp(Timestamp.decode(reader, reader.uint32()));
          continue;
      }
      if ((tag & 7) === 4 || tag === 0) {
        break;
      }
      reader.skipType(tag & 7);
    }
    return message;
  },

  fromJSON(object: any): SearchUserTaskRunRequest {
    return {
      bookmark: isSet(object.bookmark) ? bytesFromBase64(object.bookmark) : undefined,
      limit: isSet(object.limit) ? globalThis.Number(object.limit) : undefined,
      status: isSet(object.status) ? userTaskRunStatusFromJSON(object.status) : undefined,
      userTaskDefName: isSet(object.userTaskDefName) ? globalThis.String(object.userTaskDefName) : undefined,
      userId: isSet(object.userId) ? globalThis.String(object.userId) : undefined,
      userGroup: isSet(object.userGroup) ? globalThis.String(object.userGroup) : undefined,
      earliestStart: isSet(object.earliestStart) ? globalThis.String(object.earliestStart) : undefined,
      latestStart: isSet(object.latestStart) ? globalThis.String(object.latestStart) : undefined,
    };
  },

  toJSON(message: SearchUserTaskRunRequest): unknown {
    const obj: any = {};
    if (message.bookmark !== undefined) {
      obj.bookmark = base64FromBytes(message.bookmark);
    }
    if (message.limit !== undefined) {
      obj.limit = Math.round(message.limit);
    }
    if (message.status !== undefined) {
      obj.status = userTaskRunStatusToJSON(message.status);
    }
    if (message.userTaskDefName !== undefined) {
      obj.userTaskDefName = message.userTaskDefName;
    }
    if (message.userId !== undefined) {
      obj.userId = message.userId;
    }
    if (message.userGroup !== undefined) {
      obj.userGroup = message.userGroup;
    }
    if (message.earliestStart !== undefined) {
      obj.earliestStart = message.earliestStart;
    }
    if (message.latestStart !== undefined) {
      obj.latestStart = message.latestStart;
    }
    return obj;
  },

  create<I extends Exact<DeepPartial<SearchUserTaskRunRequest>, I>>(base?: I): SearchUserTaskRunRequest {
    return SearchUserTaskRunRequest.fromPartial(base ?? ({} as any));
  },
  fromPartial<I extends Exact<DeepPartial<SearchUserTaskRunRequest>, I>>(object: I): SearchUserTaskRunRequest {
    const message = createBaseSearchUserTaskRunRequest();
    message.bookmark = object.bookmark ?? undefined;
    message.limit = object.limit ?? undefined;
    message.status = object.status ?? undefined;
    message.userTaskDefName = object.userTaskDefName ?? undefined;
    message.userId = object.userId ?? undefined;
    message.userGroup = object.userGroup ?? undefined;
    message.earliestStart = object.earliestStart ?? undefined;
    message.latestStart = object.latestStart ?? undefined;
    return message;
  },
};

function createBaseUserTaskRunIdList(): UserTaskRunIdList {
  return { results: [], bookmark: undefined };
}

export const UserTaskRunIdList = {
  encode(message: UserTaskRunIdList, writer: _m0.Writer = _m0.Writer.create()): _m0.Writer {
    for (const v of message.results) {
      UserTaskRunId.encode(v!, writer.uint32(10).fork()).ldelim();
    }
    if (message.bookmark !== undefined) {
      writer.uint32(18).bytes(message.bookmark);
    }
    return writer;
  },

  decode(input: _m0.Reader | Uint8Array, length?: number): UserTaskRunIdList {
    const reader = input instanceof _m0.Reader ? input : _m0.Reader.create(input);
    let end = length === undefined ? reader.len : reader.pos + length;
    const message = createBaseUserTaskRunIdList();
    while (reader.pos < end) {
      const tag = reader.uint32();
      switch (tag >>> 3) {
        case 1:
          if (tag !== 10) {
            break;
          }

          message.results.push(UserTaskRunId.decode(reader, reader.uint32()));
          continue;
        case 2:
          if (tag !== 18) {
            break;
          }

          message.bookmark = reader.bytes();
          continue;
      }
      if ((tag & 7) === 4 || tag === 0) {
        break;
      }
      reader.skipType(tag & 7);
    }
    return message;
  },

  fromJSON(object: any): UserTaskRunIdList {
    return {
      results: globalThis.Array.isArray(object?.results)
        ? object.results.map((e: any) => UserTaskRunId.fromJSON(e))
        : [],
      bookmark: isSet(object.bookmark) ? bytesFromBase64(object.bookmark) : undefined,
    };
  },

  toJSON(message: UserTaskRunIdList): unknown {
    const obj: any = {};
    if (message.results?.length) {
      obj.results = message.results.map((e) => UserTaskRunId.toJSON(e));
    }
    if (message.bookmark !== undefined) {
      obj.bookmark = base64FromBytes(message.bookmark);
    }
    return obj;
  },

  create<I extends Exact<DeepPartial<UserTaskRunIdList>, I>>(base?: I): UserTaskRunIdList {
    return UserTaskRunIdList.fromPartial(base ?? ({} as any));
  },
  fromPartial<I extends Exact<DeepPartial<UserTaskRunIdList>, I>>(object: I): UserTaskRunIdList {
    const message = createBaseUserTaskRunIdList();
    message.results = object.results?.map((e) => UserTaskRunId.fromPartial(e)) || [];
    message.bookmark = object.bookmark ?? undefined;
    return message;
  },
};

function createBaseSearchVariableRequest(): SearchVariableRequest {
  return { bookmark: undefined, limit: undefined, wfRunId: undefined, value: undefined };
}

export const SearchVariableRequest = {
  encode(message: SearchVariableRequest, writer: _m0.Writer = _m0.Writer.create()): _m0.Writer {
    if (message.bookmark !== undefined) {
      writer.uint32(10).bytes(message.bookmark);
    }
    if (message.limit !== undefined) {
      writer.uint32(16).int32(message.limit);
    }
    if (message.wfRunId !== undefined) {
      WfRunId.encode(message.wfRunId, writer.uint32(26).fork()).ldelim();
    }
    if (message.value !== undefined) {
      SearchVariableRequest_NameAndValueRequest.encode(message.value, writer.uint32(34).fork()).ldelim();
    }
    return writer;
  },

  decode(input: _m0.Reader | Uint8Array, length?: number): SearchVariableRequest {
    const reader = input instanceof _m0.Reader ? input : _m0.Reader.create(input);
    let end = length === undefined ? reader.len : reader.pos + length;
    const message = createBaseSearchVariableRequest();
    while (reader.pos < end) {
      const tag = reader.uint32();
      switch (tag >>> 3) {
        case 1:
          if (tag !== 10) {
            break;
          }

          message.bookmark = reader.bytes();
          continue;
        case 2:
          if (tag !== 16) {
            break;
          }

          message.limit = reader.int32();
          continue;
        case 3:
          if (tag !== 26) {
            break;
          }

          message.wfRunId = WfRunId.decode(reader, reader.uint32());
          continue;
        case 4:
          if (tag !== 34) {
            break;
          }

          message.value = SearchVariableRequest_NameAndValueRequest.decode(reader, reader.uint32());
          continue;
      }
      if ((tag & 7) === 4 || tag === 0) {
        break;
      }
      reader.skipType(tag & 7);
    }
    return message;
  },

  fromJSON(object: any): SearchVariableRequest {
    return {
      bookmark: isSet(object.bookmark) ? bytesFromBase64(object.bookmark) : undefined,
      limit: isSet(object.limit) ? globalThis.Number(object.limit) : undefined,
      wfRunId: isSet(object.wfRunId) ? WfRunId.fromJSON(object.wfRunId) : undefined,
      value: isSet(object.value) ? SearchVariableRequest_NameAndValueRequest.fromJSON(object.value) : undefined,
    };
  },

  toJSON(message: SearchVariableRequest): unknown {
    const obj: any = {};
    if (message.bookmark !== undefined) {
      obj.bookmark = base64FromBytes(message.bookmark);
    }
    if (message.limit !== undefined) {
      obj.limit = Math.round(message.limit);
    }
    if (message.wfRunId !== undefined) {
      obj.wfRunId = WfRunId.toJSON(message.wfRunId);
    }
    if (message.value !== undefined) {
      obj.value = SearchVariableRequest_NameAndValueRequest.toJSON(message.value);
    }
    return obj;
  },

  create<I extends Exact<DeepPartial<SearchVariableRequest>, I>>(base?: I): SearchVariableRequest {
    return SearchVariableRequest.fromPartial(base ?? ({} as any));
  },
  fromPartial<I extends Exact<DeepPartial<SearchVariableRequest>, I>>(object: I): SearchVariableRequest {
    const message = createBaseSearchVariableRequest();
    message.bookmark = object.bookmark ?? undefined;
    message.limit = object.limit ?? undefined;
    message.wfRunId = (object.wfRunId !== undefined && object.wfRunId !== null)
      ? WfRunId.fromPartial(object.wfRunId)
      : undefined;
    message.value = (object.value !== undefined && object.value !== null)
      ? SearchVariableRequest_NameAndValueRequest.fromPartial(object.value)
      : undefined;
    return message;
  },
};

function createBaseSearchVariableRequest_NameAndValueRequest(): SearchVariableRequest_NameAndValueRequest {
  return { value: undefined, wfSpecMajorVersion: undefined, wfSpecRevision: undefined, varName: "", wfSpecName: "" };
}

export const SearchVariableRequest_NameAndValueRequest = {
  encode(message: SearchVariableRequest_NameAndValueRequest, writer: _m0.Writer = _m0.Writer.create()): _m0.Writer {
    if (message.value !== undefined) {
      VariableValue.encode(message.value, writer.uint32(10).fork()).ldelim();
    }
    if (message.wfSpecMajorVersion !== undefined) {
      writer.uint32(16).int32(message.wfSpecMajorVersion);
    }
    if (message.wfSpecRevision !== undefined) {
      writer.uint32(24).int32(message.wfSpecRevision);
    }
    if (message.varName !== "") {
      writer.uint32(34).string(message.varName);
    }
    if (message.wfSpecName !== "") {
      writer.uint32(42).string(message.wfSpecName);
    }
    return writer;
  },

  decode(input: _m0.Reader | Uint8Array, length?: number): SearchVariableRequest_NameAndValueRequest {
    const reader = input instanceof _m0.Reader ? input : _m0.Reader.create(input);
    let end = length === undefined ? reader.len : reader.pos + length;
    const message = createBaseSearchVariableRequest_NameAndValueRequest();
    while (reader.pos < end) {
      const tag = reader.uint32();
      switch (tag >>> 3) {
        case 1:
          if (tag !== 10) {
            break;
          }

          message.value = VariableValue.decode(reader, reader.uint32());
          continue;
        case 2:
          if (tag !== 16) {
            break;
          }

          message.wfSpecMajorVersion = reader.int32();
          continue;
        case 3:
          if (tag !== 24) {
            break;
          }

          message.wfSpecRevision = reader.int32();
          continue;
        case 4:
          if (tag !== 34) {
            break;
          }

          message.varName = reader.string();
          continue;
        case 5:
          if (tag !== 42) {
            break;
          }

          message.wfSpecName = reader.string();
          continue;
      }
      if ((tag & 7) === 4 || tag === 0) {
        break;
      }
      reader.skipType(tag & 7);
    }
    return message;
  },

  fromJSON(object: any): SearchVariableRequest_NameAndValueRequest {
    return {
      value: isSet(object.value) ? VariableValue.fromJSON(object.value) : undefined,
      wfSpecMajorVersion: isSet(object.wfSpecMajorVersion) ? globalThis.Number(object.wfSpecMajorVersion) : undefined,
      wfSpecRevision: isSet(object.wfSpecRevision) ? globalThis.Number(object.wfSpecRevision) : undefined,
      varName: isSet(object.varName) ? globalThis.String(object.varName) : "",
      wfSpecName: isSet(object.wfSpecName) ? globalThis.String(object.wfSpecName) : "",
    };
  },

  toJSON(message: SearchVariableRequest_NameAndValueRequest): unknown {
    const obj: any = {};
    if (message.value !== undefined) {
      obj.value = VariableValue.toJSON(message.value);
    }
    if (message.wfSpecMajorVersion !== undefined) {
      obj.wfSpecMajorVersion = Math.round(message.wfSpecMajorVersion);
    }
    if (message.wfSpecRevision !== undefined) {
      obj.wfSpecRevision = Math.round(message.wfSpecRevision);
    }
    if (message.varName !== "") {
      obj.varName = message.varName;
    }
    if (message.wfSpecName !== "") {
      obj.wfSpecName = message.wfSpecName;
    }
    return obj;
  },

  create<I extends Exact<DeepPartial<SearchVariableRequest_NameAndValueRequest>, I>>(
    base?: I,
  ): SearchVariableRequest_NameAndValueRequest {
    return SearchVariableRequest_NameAndValueRequest.fromPartial(base ?? ({} as any));
  },
  fromPartial<I extends Exact<DeepPartial<SearchVariableRequest_NameAndValueRequest>, I>>(
    object: I,
  ): SearchVariableRequest_NameAndValueRequest {
    const message = createBaseSearchVariableRequest_NameAndValueRequest();
    message.value = (object.value !== undefined && object.value !== null)
      ? VariableValue.fromPartial(object.value)
      : undefined;
    message.wfSpecMajorVersion = object.wfSpecMajorVersion ?? undefined;
    message.wfSpecRevision = object.wfSpecRevision ?? undefined;
    message.varName = object.varName ?? "";
    message.wfSpecName = object.wfSpecName ?? "";
    return message;
  },
};

function createBaseVariableIdList(): VariableIdList {
  return { results: [], bookmark: undefined };
}

export const VariableIdList = {
  encode(message: VariableIdList, writer: _m0.Writer = _m0.Writer.create()): _m0.Writer {
    for (const v of message.results) {
      VariableId.encode(v!, writer.uint32(10).fork()).ldelim();
    }
    if (message.bookmark !== undefined) {
      writer.uint32(18).bytes(message.bookmark);
    }
    return writer;
  },

  decode(input: _m0.Reader | Uint8Array, length?: number): VariableIdList {
    const reader = input instanceof _m0.Reader ? input : _m0.Reader.create(input);
    let end = length === undefined ? reader.len : reader.pos + length;
    const message = createBaseVariableIdList();
    while (reader.pos < end) {
      const tag = reader.uint32();
      switch (tag >>> 3) {
        case 1:
          if (tag !== 10) {
            break;
          }

          message.results.push(VariableId.decode(reader, reader.uint32()));
          continue;
        case 2:
          if (tag !== 18) {
            break;
          }

          message.bookmark = reader.bytes();
          continue;
      }
      if ((tag & 7) === 4 || tag === 0) {
        break;
      }
      reader.skipType(tag & 7);
    }
    return message;
  },

  fromJSON(object: any): VariableIdList {
    return {
      results: globalThis.Array.isArray(object?.results) ? object.results.map((e: any) => VariableId.fromJSON(e)) : [],
      bookmark: isSet(object.bookmark) ? bytesFromBase64(object.bookmark) : undefined,
    };
  },

  toJSON(message: VariableIdList): unknown {
    const obj: any = {};
    if (message.results?.length) {
      obj.results = message.results.map((e) => VariableId.toJSON(e));
    }
    if (message.bookmark !== undefined) {
      obj.bookmark = base64FromBytes(message.bookmark);
    }
    return obj;
  },

  create<I extends Exact<DeepPartial<VariableIdList>, I>>(base?: I): VariableIdList {
    return VariableIdList.fromPartial(base ?? ({} as any));
  },
  fromPartial<I extends Exact<DeepPartial<VariableIdList>, I>>(object: I): VariableIdList {
    const message = createBaseVariableIdList();
    message.results = object.results?.map((e) => VariableId.fromPartial(e)) || [];
    message.bookmark = object.bookmark ?? undefined;
    return message;
  },
};

function createBaseSearchTaskDefRequest(): SearchTaskDefRequest {
  return { bookmark: undefined, limit: undefined, prefix: undefined };
}

export const SearchTaskDefRequest = {
  encode(message: SearchTaskDefRequest, writer: _m0.Writer = _m0.Writer.create()): _m0.Writer {
    if (message.bookmark !== undefined) {
      writer.uint32(10).bytes(message.bookmark);
    }
    if (message.limit !== undefined) {
      writer.uint32(16).int32(message.limit);
    }
    if (message.prefix !== undefined) {
      writer.uint32(26).string(message.prefix);
    }
    return writer;
  },

  decode(input: _m0.Reader | Uint8Array, length?: number): SearchTaskDefRequest {
    const reader = input instanceof _m0.Reader ? input : _m0.Reader.create(input);
    let end = length === undefined ? reader.len : reader.pos + length;
    const message = createBaseSearchTaskDefRequest();
    while (reader.pos < end) {
      const tag = reader.uint32();
      switch (tag >>> 3) {
        case 1:
          if (tag !== 10) {
            break;
          }

          message.bookmark = reader.bytes();
          continue;
        case 2:
          if (tag !== 16) {
            break;
          }

          message.limit = reader.int32();
          continue;
        case 3:
          if (tag !== 26) {
            break;
          }

          message.prefix = reader.string();
          continue;
      }
      if ((tag & 7) === 4 || tag === 0) {
        break;
      }
      reader.skipType(tag & 7);
    }
    return message;
  },

  fromJSON(object: any): SearchTaskDefRequest {
    return {
      bookmark: isSet(object.bookmark) ? bytesFromBase64(object.bookmark) : undefined,
      limit: isSet(object.limit) ? globalThis.Number(object.limit) : undefined,
      prefix: isSet(object.prefix) ? globalThis.String(object.prefix) : undefined,
    };
  },

  toJSON(message: SearchTaskDefRequest): unknown {
    const obj: any = {};
    if (message.bookmark !== undefined) {
      obj.bookmark = base64FromBytes(message.bookmark);
    }
    if (message.limit !== undefined) {
      obj.limit = Math.round(message.limit);
    }
    if (message.prefix !== undefined) {
      obj.prefix = message.prefix;
    }
    return obj;
  },

  create<I extends Exact<DeepPartial<SearchTaskDefRequest>, I>>(base?: I): SearchTaskDefRequest {
    return SearchTaskDefRequest.fromPartial(base ?? ({} as any));
  },
  fromPartial<I extends Exact<DeepPartial<SearchTaskDefRequest>, I>>(object: I): SearchTaskDefRequest {
    const message = createBaseSearchTaskDefRequest();
    message.bookmark = object.bookmark ?? undefined;
    message.limit = object.limit ?? undefined;
    message.prefix = object.prefix ?? undefined;
    return message;
  },
};

function createBaseTaskDefIdList(): TaskDefIdList {
  return { results: [], bookmark: undefined };
}

export const TaskDefIdList = {
  encode(message: TaskDefIdList, writer: _m0.Writer = _m0.Writer.create()): _m0.Writer {
    for (const v of message.results) {
      TaskDefId.encode(v!, writer.uint32(10).fork()).ldelim();
    }
    if (message.bookmark !== undefined) {
      writer.uint32(18).bytes(message.bookmark);
    }
    return writer;
  },

  decode(input: _m0.Reader | Uint8Array, length?: number): TaskDefIdList {
    const reader = input instanceof _m0.Reader ? input : _m0.Reader.create(input);
    let end = length === undefined ? reader.len : reader.pos + length;
    const message = createBaseTaskDefIdList();
    while (reader.pos < end) {
      const tag = reader.uint32();
      switch (tag >>> 3) {
        case 1:
          if (tag !== 10) {
            break;
          }

          message.results.push(TaskDefId.decode(reader, reader.uint32()));
          continue;
        case 2:
          if (tag !== 18) {
            break;
          }

          message.bookmark = reader.bytes();
          continue;
      }
      if ((tag & 7) === 4 || tag === 0) {
        break;
      }
      reader.skipType(tag & 7);
    }
    return message;
  },

  fromJSON(object: any): TaskDefIdList {
    return {
      results: globalThis.Array.isArray(object?.results) ? object.results.map((e: any) => TaskDefId.fromJSON(e)) : [],
      bookmark: isSet(object.bookmark) ? bytesFromBase64(object.bookmark) : undefined,
    };
  },

  toJSON(message: TaskDefIdList): unknown {
    const obj: any = {};
    if (message.results?.length) {
      obj.results = message.results.map((e) => TaskDefId.toJSON(e));
    }
    if (message.bookmark !== undefined) {
      obj.bookmark = base64FromBytes(message.bookmark);
    }
    return obj;
  },

  create<I extends Exact<DeepPartial<TaskDefIdList>, I>>(base?: I): TaskDefIdList {
    return TaskDefIdList.fromPartial(base ?? ({} as any));
  },
  fromPartial<I extends Exact<DeepPartial<TaskDefIdList>, I>>(object: I): TaskDefIdList {
    const message = createBaseTaskDefIdList();
    message.results = object.results?.map((e) => TaskDefId.fromPartial(e)) || [];
    message.bookmark = object.bookmark ?? undefined;
    return message;
  },
};

function createBaseSearchUserTaskDefRequest(): SearchUserTaskDefRequest {
  return { bookmark: undefined, limit: undefined, prefix: undefined, name: undefined };
}

export const SearchUserTaskDefRequest = {
  encode(message: SearchUserTaskDefRequest, writer: _m0.Writer = _m0.Writer.create()): _m0.Writer {
    if (message.bookmark !== undefined) {
      writer.uint32(10).bytes(message.bookmark);
    }
    if (message.limit !== undefined) {
      writer.uint32(16).int32(message.limit);
    }
    if (message.prefix !== undefined) {
      writer.uint32(26).string(message.prefix);
    }
    if (message.name !== undefined) {
      writer.uint32(34).string(message.name);
    }
    return writer;
  },

  decode(input: _m0.Reader | Uint8Array, length?: number): SearchUserTaskDefRequest {
    const reader = input instanceof _m0.Reader ? input : _m0.Reader.create(input);
    let end = length === undefined ? reader.len : reader.pos + length;
    const message = createBaseSearchUserTaskDefRequest();
    while (reader.pos < end) {
      const tag = reader.uint32();
      switch (tag >>> 3) {
        case 1:
          if (tag !== 10) {
            break;
          }

          message.bookmark = reader.bytes();
          continue;
        case 2:
          if (tag !== 16) {
            break;
          }

          message.limit = reader.int32();
          continue;
        case 3:
          if (tag !== 26) {
            break;
          }

          message.prefix = reader.string();
          continue;
        case 4:
          if (tag !== 34) {
            break;
          }

          message.name = reader.string();
          continue;
      }
      if ((tag & 7) === 4 || tag === 0) {
        break;
      }
      reader.skipType(tag & 7);
    }
    return message;
  },

  fromJSON(object: any): SearchUserTaskDefRequest {
    return {
      bookmark: isSet(object.bookmark) ? bytesFromBase64(object.bookmark) : undefined,
      limit: isSet(object.limit) ? globalThis.Number(object.limit) : undefined,
      prefix: isSet(object.prefix) ? globalThis.String(object.prefix) : undefined,
      name: isSet(object.name) ? globalThis.String(object.name) : undefined,
    };
  },

  toJSON(message: SearchUserTaskDefRequest): unknown {
    const obj: any = {};
    if (message.bookmark !== undefined) {
      obj.bookmark = base64FromBytes(message.bookmark);
    }
    if (message.limit !== undefined) {
      obj.limit = Math.round(message.limit);
    }
    if (message.prefix !== undefined) {
      obj.prefix = message.prefix;
    }
    if (message.name !== undefined) {
      obj.name = message.name;
    }
    return obj;
  },

  create<I extends Exact<DeepPartial<SearchUserTaskDefRequest>, I>>(base?: I): SearchUserTaskDefRequest {
    return SearchUserTaskDefRequest.fromPartial(base ?? ({} as any));
  },
  fromPartial<I extends Exact<DeepPartial<SearchUserTaskDefRequest>, I>>(object: I): SearchUserTaskDefRequest {
    const message = createBaseSearchUserTaskDefRequest();
    message.bookmark = object.bookmark ?? undefined;
    message.limit = object.limit ?? undefined;
    message.prefix = object.prefix ?? undefined;
    message.name = object.name ?? undefined;
    return message;
  },
};

function createBaseUserTaskDefIdList(): UserTaskDefIdList {
  return { results: [], bookmark: undefined };
}

export const UserTaskDefIdList = {
  encode(message: UserTaskDefIdList, writer: _m0.Writer = _m0.Writer.create()): _m0.Writer {
    for (const v of message.results) {
      UserTaskDefId.encode(v!, writer.uint32(10).fork()).ldelim();
    }
    if (message.bookmark !== undefined) {
      writer.uint32(18).bytes(message.bookmark);
    }
    return writer;
  },

  decode(input: _m0.Reader | Uint8Array, length?: number): UserTaskDefIdList {
    const reader = input instanceof _m0.Reader ? input : _m0.Reader.create(input);
    let end = length === undefined ? reader.len : reader.pos + length;
    const message = createBaseUserTaskDefIdList();
    while (reader.pos < end) {
      const tag = reader.uint32();
      switch (tag >>> 3) {
        case 1:
          if (tag !== 10) {
            break;
          }

          message.results.push(UserTaskDefId.decode(reader, reader.uint32()));
          continue;
        case 2:
          if (tag !== 18) {
            break;
          }

          message.bookmark = reader.bytes();
          continue;
      }
      if ((tag & 7) === 4 || tag === 0) {
        break;
      }
      reader.skipType(tag & 7);
    }
    return message;
  },

  fromJSON(object: any): UserTaskDefIdList {
    return {
      results: globalThis.Array.isArray(object?.results)
        ? object.results.map((e: any) => UserTaskDefId.fromJSON(e))
        : [],
      bookmark: isSet(object.bookmark) ? bytesFromBase64(object.bookmark) : undefined,
    };
  },

  toJSON(message: UserTaskDefIdList): unknown {
    const obj: any = {};
    if (message.results?.length) {
      obj.results = message.results.map((e) => UserTaskDefId.toJSON(e));
    }
    if (message.bookmark !== undefined) {
      obj.bookmark = base64FromBytes(message.bookmark);
    }
    return obj;
  },

  create<I extends Exact<DeepPartial<UserTaskDefIdList>, I>>(base?: I): UserTaskDefIdList {
    return UserTaskDefIdList.fromPartial(base ?? ({} as any));
  },
  fromPartial<I extends Exact<DeepPartial<UserTaskDefIdList>, I>>(object: I): UserTaskDefIdList {
    const message = createBaseUserTaskDefIdList();
    message.results = object.results?.map((e) => UserTaskDefId.fromPartial(e)) || [];
    message.bookmark = object.bookmark ?? undefined;
    return message;
  },
};

function createBaseSearchWfSpecRequest(): SearchWfSpecRequest {
  return { bookmark: undefined, limit: undefined, name: undefined, prefix: undefined, taskDefName: undefined };
}

export const SearchWfSpecRequest = {
  encode(message: SearchWfSpecRequest, writer: _m0.Writer = _m0.Writer.create()): _m0.Writer {
    if (message.bookmark !== undefined) {
      writer.uint32(10).bytes(message.bookmark);
    }
    if (message.limit !== undefined) {
      writer.uint32(16).int32(message.limit);
    }
    if (message.name !== undefined) {
      writer.uint32(26).string(message.name);
    }
    if (message.prefix !== undefined) {
      writer.uint32(34).string(message.prefix);
    }
    if (message.taskDefName !== undefined) {
      writer.uint32(42).string(message.taskDefName);
    }
    return writer;
  },

  decode(input: _m0.Reader | Uint8Array, length?: number): SearchWfSpecRequest {
    const reader = input instanceof _m0.Reader ? input : _m0.Reader.create(input);
    let end = length === undefined ? reader.len : reader.pos + length;
    const message = createBaseSearchWfSpecRequest();
    while (reader.pos < end) {
      const tag = reader.uint32();
      switch (tag >>> 3) {
        case 1:
          if (tag !== 10) {
            break;
          }

          message.bookmark = reader.bytes();
          continue;
        case 2:
          if (tag !== 16) {
            break;
          }

          message.limit = reader.int32();
          continue;
        case 3:
          if (tag !== 26) {
            break;
          }

          message.name = reader.string();
          continue;
        case 4:
          if (tag !== 34) {
            break;
          }

          message.prefix = reader.string();
          continue;
        case 5:
          if (tag !== 42) {
            break;
          }

          message.taskDefName = reader.string();
          continue;
      }
      if ((tag & 7) === 4 || tag === 0) {
        break;
      }
      reader.skipType(tag & 7);
    }
    return message;
  },

  fromJSON(object: any): SearchWfSpecRequest {
    return {
      bookmark: isSet(object.bookmark) ? bytesFromBase64(object.bookmark) : undefined,
      limit: isSet(object.limit) ? globalThis.Number(object.limit) : undefined,
      name: isSet(object.name) ? globalThis.String(object.name) : undefined,
      prefix: isSet(object.prefix) ? globalThis.String(object.prefix) : undefined,
      taskDefName: isSet(object.taskDefName) ? globalThis.String(object.taskDefName) : undefined,
    };
  },

  toJSON(message: SearchWfSpecRequest): unknown {
    const obj: any = {};
    if (message.bookmark !== undefined) {
      obj.bookmark = base64FromBytes(message.bookmark);
    }
    if (message.limit !== undefined) {
      obj.limit = Math.round(message.limit);
    }
    if (message.name !== undefined) {
      obj.name = message.name;
    }
    if (message.prefix !== undefined) {
      obj.prefix = message.prefix;
    }
    if (message.taskDefName !== undefined) {
      obj.taskDefName = message.taskDefName;
    }
    return obj;
  },

  create<I extends Exact<DeepPartial<SearchWfSpecRequest>, I>>(base?: I): SearchWfSpecRequest {
    return SearchWfSpecRequest.fromPartial(base ?? ({} as any));
  },
  fromPartial<I extends Exact<DeepPartial<SearchWfSpecRequest>, I>>(object: I): SearchWfSpecRequest {
    const message = createBaseSearchWfSpecRequest();
    message.bookmark = object.bookmark ?? undefined;
    message.limit = object.limit ?? undefined;
    message.name = object.name ?? undefined;
    message.prefix = object.prefix ?? undefined;
    message.taskDefName = object.taskDefName ?? undefined;
    return message;
  },
};

function createBaseWfSpecIdList(): WfSpecIdList {
  return { results: [], bookmark: undefined };
}

export const WfSpecIdList = {
  encode(message: WfSpecIdList, writer: _m0.Writer = _m0.Writer.create()): _m0.Writer {
    for (const v of message.results) {
      WfSpecId.encode(v!, writer.uint32(10).fork()).ldelim();
    }
    if (message.bookmark !== undefined) {
      writer.uint32(18).bytes(message.bookmark);
    }
    return writer;
  },

  decode(input: _m0.Reader | Uint8Array, length?: number): WfSpecIdList {
    const reader = input instanceof _m0.Reader ? input : _m0.Reader.create(input);
    let end = length === undefined ? reader.len : reader.pos + length;
    const message = createBaseWfSpecIdList();
    while (reader.pos < end) {
      const tag = reader.uint32();
      switch (tag >>> 3) {
        case 1:
          if (tag !== 10) {
            break;
          }

          message.results.push(WfSpecId.decode(reader, reader.uint32()));
          continue;
        case 2:
          if (tag !== 18) {
            break;
          }

          message.bookmark = reader.bytes();
          continue;
      }
      if ((tag & 7) === 4 || tag === 0) {
        break;
      }
      reader.skipType(tag & 7);
    }
    return message;
  },

  fromJSON(object: any): WfSpecIdList {
    return {
      results: globalThis.Array.isArray(object?.results) ? object.results.map((e: any) => WfSpecId.fromJSON(e)) : [],
      bookmark: isSet(object.bookmark) ? bytesFromBase64(object.bookmark) : undefined,
    };
  },

  toJSON(message: WfSpecIdList): unknown {
    const obj: any = {};
    if (message.results?.length) {
      obj.results = message.results.map((e) => WfSpecId.toJSON(e));
    }
    if (message.bookmark !== undefined) {
      obj.bookmark = base64FromBytes(message.bookmark);
    }
    return obj;
  },

  create<I extends Exact<DeepPartial<WfSpecIdList>, I>>(base?: I): WfSpecIdList {
    return WfSpecIdList.fromPartial(base ?? ({} as any));
  },
  fromPartial<I extends Exact<DeepPartial<WfSpecIdList>, I>>(object: I): WfSpecIdList {
    const message = createBaseWfSpecIdList();
    message.results = object.results?.map((e) => WfSpecId.fromPartial(e)) || [];
    message.bookmark = object.bookmark ?? undefined;
    return message;
  },
};

function createBaseSearchExternalEventDefRequest(): SearchExternalEventDefRequest {
  return { bookmark: undefined, limit: undefined, prefix: undefined };
}

export const SearchExternalEventDefRequest = {
  encode(message: SearchExternalEventDefRequest, writer: _m0.Writer = _m0.Writer.create()): _m0.Writer {
    if (message.bookmark !== undefined) {
      writer.uint32(10).bytes(message.bookmark);
    }
    if (message.limit !== undefined) {
      writer.uint32(16).int32(message.limit);
    }
    if (message.prefix !== undefined) {
      writer.uint32(26).string(message.prefix);
    }
    return writer;
  },

  decode(input: _m0.Reader | Uint8Array, length?: number): SearchExternalEventDefRequest {
    const reader = input instanceof _m0.Reader ? input : _m0.Reader.create(input);
    let end = length === undefined ? reader.len : reader.pos + length;
    const message = createBaseSearchExternalEventDefRequest();
    while (reader.pos < end) {
      const tag = reader.uint32();
      switch (tag >>> 3) {
        case 1:
          if (tag !== 10) {
            break;
          }

          message.bookmark = reader.bytes();
          continue;
        case 2:
          if (tag !== 16) {
            break;
          }

          message.limit = reader.int32();
          continue;
        case 3:
          if (tag !== 26) {
            break;
          }

          message.prefix = reader.string();
          continue;
      }
      if ((tag & 7) === 4 || tag === 0) {
        break;
      }
      reader.skipType(tag & 7);
    }
    return message;
  },

  fromJSON(object: any): SearchExternalEventDefRequest {
    return {
      bookmark: isSet(object.bookmark) ? bytesFromBase64(object.bookmark) : undefined,
      limit: isSet(object.limit) ? globalThis.Number(object.limit) : undefined,
      prefix: isSet(object.prefix) ? globalThis.String(object.prefix) : undefined,
    };
  },

  toJSON(message: SearchExternalEventDefRequest): unknown {
    const obj: any = {};
    if (message.bookmark !== undefined) {
      obj.bookmark = base64FromBytes(message.bookmark);
    }
    if (message.limit !== undefined) {
      obj.limit = Math.round(message.limit);
    }
    if (message.prefix !== undefined) {
      obj.prefix = message.prefix;
    }
    return obj;
  },

  create<I extends Exact<DeepPartial<SearchExternalEventDefRequest>, I>>(base?: I): SearchExternalEventDefRequest {
    return SearchExternalEventDefRequest.fromPartial(base ?? ({} as any));
  },
  fromPartial<I extends Exact<DeepPartial<SearchExternalEventDefRequest>, I>>(
    object: I,
  ): SearchExternalEventDefRequest {
    const message = createBaseSearchExternalEventDefRequest();
    message.bookmark = object.bookmark ?? undefined;
    message.limit = object.limit ?? undefined;
    message.prefix = object.prefix ?? undefined;
    return message;
  },
};

function createBaseExternalEventDefIdList(): ExternalEventDefIdList {
  return { results: [], bookmark: undefined };
}

export const ExternalEventDefIdList = {
  encode(message: ExternalEventDefIdList, writer: _m0.Writer = _m0.Writer.create()): _m0.Writer {
    for (const v of message.results) {
      ExternalEventDefId.encode(v!, writer.uint32(10).fork()).ldelim();
    }
    if (message.bookmark !== undefined) {
      writer.uint32(18).bytes(message.bookmark);
    }
    return writer;
  },

  decode(input: _m0.Reader | Uint8Array, length?: number): ExternalEventDefIdList {
    const reader = input instanceof _m0.Reader ? input : _m0.Reader.create(input);
    let end = length === undefined ? reader.len : reader.pos + length;
    const message = createBaseExternalEventDefIdList();
    while (reader.pos < end) {
      const tag = reader.uint32();
      switch (tag >>> 3) {
        case 1:
          if (tag !== 10) {
            break;
          }

          message.results.push(ExternalEventDefId.decode(reader, reader.uint32()));
          continue;
        case 2:
          if (tag !== 18) {
            break;
          }

          message.bookmark = reader.bytes();
          continue;
      }
      if ((tag & 7) === 4 || tag === 0) {
        break;
      }
      reader.skipType(tag & 7);
    }
    return message;
  },

  fromJSON(object: any): ExternalEventDefIdList {
    return {
      results: globalThis.Array.isArray(object?.results)
        ? object.results.map((e: any) => ExternalEventDefId.fromJSON(e))
        : [],
      bookmark: isSet(object.bookmark) ? bytesFromBase64(object.bookmark) : undefined,
    };
  },

  toJSON(message: ExternalEventDefIdList): unknown {
    const obj: any = {};
    if (message.results?.length) {
      obj.results = message.results.map((e) => ExternalEventDefId.toJSON(e));
    }
    if (message.bookmark !== undefined) {
      obj.bookmark = base64FromBytes(message.bookmark);
    }
    return obj;
  },

  create<I extends Exact<DeepPartial<ExternalEventDefIdList>, I>>(base?: I): ExternalEventDefIdList {
    return ExternalEventDefIdList.fromPartial(base ?? ({} as any));
  },
  fromPartial<I extends Exact<DeepPartial<ExternalEventDefIdList>, I>>(object: I): ExternalEventDefIdList {
    const message = createBaseExternalEventDefIdList();
    message.results = object.results?.map((e) => ExternalEventDefId.fromPartial(e)) || [];
    message.bookmark = object.bookmark ?? undefined;
    return message;
  },
};

function createBaseSearchExternalEventRequest(): SearchExternalEventRequest {
  return { bookmark: undefined, limit: undefined, wfRunId: undefined, externalEventDefNameAndStatus: undefined };
}

export const SearchExternalEventRequest = {
  encode(message: SearchExternalEventRequest, writer: _m0.Writer = _m0.Writer.create()): _m0.Writer {
    if (message.bookmark !== undefined) {
      writer.uint32(10).bytes(message.bookmark);
    }
    if (message.limit !== undefined) {
      writer.uint32(16).int32(message.limit);
    }
    if (message.wfRunId !== undefined) {
      WfRunId.encode(message.wfRunId, writer.uint32(26).fork()).ldelim();
    }
    if (message.externalEventDefNameAndStatus !== undefined) {
      SearchExternalEventRequest_ByExtEvtDefNameAndStatusRequest.encode(
        message.externalEventDefNameAndStatus,
        writer.uint32(34).fork(),
      ).ldelim();
    }
    return writer;
  },

  decode(input: _m0.Reader | Uint8Array, length?: number): SearchExternalEventRequest {
    const reader = input instanceof _m0.Reader ? input : _m0.Reader.create(input);
    let end = length === undefined ? reader.len : reader.pos + length;
    const message = createBaseSearchExternalEventRequest();
    while (reader.pos < end) {
      const tag = reader.uint32();
      switch (tag >>> 3) {
        case 1:
          if (tag !== 10) {
            break;
          }

          message.bookmark = reader.bytes();
          continue;
        case 2:
          if (tag !== 16) {
            break;
          }

          message.limit = reader.int32();
          continue;
        case 3:
          if (tag !== 26) {
            break;
          }

          message.wfRunId = WfRunId.decode(reader, reader.uint32());
          continue;
        case 4:
          if (tag !== 34) {
            break;
          }

          message.externalEventDefNameAndStatus = SearchExternalEventRequest_ByExtEvtDefNameAndStatusRequest.decode(
            reader,
            reader.uint32(),
          );
          continue;
      }
      if ((tag & 7) === 4 || tag === 0) {
        break;
      }
      reader.skipType(tag & 7);
    }
    return message;
  },

  fromJSON(object: any): SearchExternalEventRequest {
    return {
      bookmark: isSet(object.bookmark) ? bytesFromBase64(object.bookmark) : undefined,
      limit: isSet(object.limit) ? globalThis.Number(object.limit) : undefined,
      wfRunId: isSet(object.wfRunId) ? WfRunId.fromJSON(object.wfRunId) : undefined,
      externalEventDefNameAndStatus: isSet(object.externalEventDefNameAndStatus)
        ? SearchExternalEventRequest_ByExtEvtDefNameAndStatusRequest.fromJSON(object.externalEventDefNameAndStatus)
        : undefined,
    };
  },

  toJSON(message: SearchExternalEventRequest): unknown {
    const obj: any = {};
    if (message.bookmark !== undefined) {
      obj.bookmark = base64FromBytes(message.bookmark);
    }
    if (message.limit !== undefined) {
      obj.limit = Math.round(message.limit);
    }
    if (message.wfRunId !== undefined) {
      obj.wfRunId = WfRunId.toJSON(message.wfRunId);
    }
    if (message.externalEventDefNameAndStatus !== undefined) {
      obj.externalEventDefNameAndStatus = SearchExternalEventRequest_ByExtEvtDefNameAndStatusRequest.toJSON(
        message.externalEventDefNameAndStatus,
      );
    }
    return obj;
  },

  create<I extends Exact<DeepPartial<SearchExternalEventRequest>, I>>(base?: I): SearchExternalEventRequest {
    return SearchExternalEventRequest.fromPartial(base ?? ({} as any));
  },
  fromPartial<I extends Exact<DeepPartial<SearchExternalEventRequest>, I>>(object: I): SearchExternalEventRequest {
    const message = createBaseSearchExternalEventRequest();
    message.bookmark = object.bookmark ?? undefined;
    message.limit = object.limit ?? undefined;
    message.wfRunId = (object.wfRunId !== undefined && object.wfRunId !== null)
      ? WfRunId.fromPartial(object.wfRunId)
      : undefined;
    message.externalEventDefNameAndStatus =
      (object.externalEventDefNameAndStatus !== undefined && object.externalEventDefNameAndStatus !== null)
        ? SearchExternalEventRequest_ByExtEvtDefNameAndStatusRequest.fromPartial(object.externalEventDefNameAndStatus)
        : undefined;
    return message;
  },
};

function createBaseSearchExternalEventRequest_ByExtEvtDefNameAndStatusRequest(): SearchExternalEventRequest_ByExtEvtDefNameAndStatusRequest {
  return { externalEventDefName: "", isClaimed: undefined };
}

export const SearchExternalEventRequest_ByExtEvtDefNameAndStatusRequest = {
  encode(
    message: SearchExternalEventRequest_ByExtEvtDefNameAndStatusRequest,
    writer: _m0.Writer = _m0.Writer.create(),
  ): _m0.Writer {
    if (message.externalEventDefName !== "") {
      writer.uint32(10).string(message.externalEventDefName);
    }
    if (message.isClaimed !== undefined) {
      writer.uint32(16).bool(message.isClaimed);
    }
    return writer;
  },

  decode(input: _m0.Reader | Uint8Array, length?: number): SearchExternalEventRequest_ByExtEvtDefNameAndStatusRequest {
    const reader = input instanceof _m0.Reader ? input : _m0.Reader.create(input);
    let end = length === undefined ? reader.len : reader.pos + length;
    const message = createBaseSearchExternalEventRequest_ByExtEvtDefNameAndStatusRequest();
    while (reader.pos < end) {
      const tag = reader.uint32();
      switch (tag >>> 3) {
        case 1:
          if (tag !== 10) {
            break;
          }

          message.externalEventDefName = reader.string();
          continue;
        case 2:
          if (tag !== 16) {
            break;
          }

          message.isClaimed = reader.bool();
          continue;
      }
      if ((tag & 7) === 4 || tag === 0) {
        break;
      }
      reader.skipType(tag & 7);
    }
    return message;
  },

  fromJSON(object: any): SearchExternalEventRequest_ByExtEvtDefNameAndStatusRequest {
    return {
      externalEventDefName: isSet(object.externalEventDefName) ? globalThis.String(object.externalEventDefName) : "",
      isClaimed: isSet(object.isClaimed) ? globalThis.Boolean(object.isClaimed) : undefined,
    };
  },

  toJSON(message: SearchExternalEventRequest_ByExtEvtDefNameAndStatusRequest): unknown {
    const obj: any = {};
    if (message.externalEventDefName !== "") {
      obj.externalEventDefName = message.externalEventDefName;
    }
    if (message.isClaimed !== undefined) {
      obj.isClaimed = message.isClaimed;
    }
    return obj;
  },

  create<I extends Exact<DeepPartial<SearchExternalEventRequest_ByExtEvtDefNameAndStatusRequest>, I>>(
    base?: I,
  ): SearchExternalEventRequest_ByExtEvtDefNameAndStatusRequest {
    return SearchExternalEventRequest_ByExtEvtDefNameAndStatusRequest.fromPartial(base ?? ({} as any));
  },
  fromPartial<I extends Exact<DeepPartial<SearchExternalEventRequest_ByExtEvtDefNameAndStatusRequest>, I>>(
    object: I,
  ): SearchExternalEventRequest_ByExtEvtDefNameAndStatusRequest {
    const message = createBaseSearchExternalEventRequest_ByExtEvtDefNameAndStatusRequest();
    message.externalEventDefName = object.externalEventDefName ?? "";
    message.isClaimed = object.isClaimed ?? undefined;
    return message;
  },
};

function createBaseExternalEventIdList(): ExternalEventIdList {
  return { results: [], bookmark: undefined };
}

export const ExternalEventIdList = {
  encode(message: ExternalEventIdList, writer: _m0.Writer = _m0.Writer.create()): _m0.Writer {
    for (const v of message.results) {
      ExternalEventId.encode(v!, writer.uint32(10).fork()).ldelim();
    }
    if (message.bookmark !== undefined) {
      writer.uint32(18).bytes(message.bookmark);
    }
    return writer;
  },

  decode(input: _m0.Reader | Uint8Array, length?: number): ExternalEventIdList {
    const reader = input instanceof _m0.Reader ? input : _m0.Reader.create(input);
    let end = length === undefined ? reader.len : reader.pos + length;
    const message = createBaseExternalEventIdList();
    while (reader.pos < end) {
      const tag = reader.uint32();
      switch (tag >>> 3) {
        case 1:
          if (tag !== 10) {
            break;
          }

          message.results.push(ExternalEventId.decode(reader, reader.uint32()));
          continue;
        case 2:
          if (tag !== 18) {
            break;
          }

          message.bookmark = reader.bytes();
          continue;
      }
      if ((tag & 7) === 4 || tag === 0) {
        break;
      }
      reader.skipType(tag & 7);
    }
    return message;
  },

  fromJSON(object: any): ExternalEventIdList {
    return {
      results: globalThis.Array.isArray(object?.results)
        ? object.results.map((e: any) => ExternalEventId.fromJSON(e))
        : [],
      bookmark: isSet(object.bookmark) ? bytesFromBase64(object.bookmark) : undefined,
    };
  },

  toJSON(message: ExternalEventIdList): unknown {
    const obj: any = {};
    if (message.results?.length) {
      obj.results = message.results.map((e) => ExternalEventId.toJSON(e));
    }
    if (message.bookmark !== undefined) {
      obj.bookmark = base64FromBytes(message.bookmark);
    }
    return obj;
  },

  create<I extends Exact<DeepPartial<ExternalEventIdList>, I>>(base?: I): ExternalEventIdList {
    return ExternalEventIdList.fromPartial(base ?? ({} as any));
  },
  fromPartial<I extends Exact<DeepPartial<ExternalEventIdList>, I>>(object: I): ExternalEventIdList {
    const message = createBaseExternalEventIdList();
    message.results = object.results?.map((e) => ExternalEventId.fromPartial(e)) || [];
    message.bookmark = object.bookmark ?? undefined;
    return message;
  },
};

function createBaseListNodeRunsRequest(): ListNodeRunsRequest {
  return { wfRunId: undefined };
}

export const ListNodeRunsRequest = {
  encode(message: ListNodeRunsRequest, writer: _m0.Writer = _m0.Writer.create()): _m0.Writer {
    if (message.wfRunId !== undefined) {
      WfRunId.encode(message.wfRunId, writer.uint32(10).fork()).ldelim();
    }
    return writer;
  },

  decode(input: _m0.Reader | Uint8Array, length?: number): ListNodeRunsRequest {
    const reader = input instanceof _m0.Reader ? input : _m0.Reader.create(input);
    let end = length === undefined ? reader.len : reader.pos + length;
    const message = createBaseListNodeRunsRequest();
    while (reader.pos < end) {
      const tag = reader.uint32();
      switch (tag >>> 3) {
        case 1:
          if (tag !== 10) {
            break;
          }

          message.wfRunId = WfRunId.decode(reader, reader.uint32());
          continue;
      }
      if ((tag & 7) === 4 || tag === 0) {
        break;
      }
      reader.skipType(tag & 7);
    }
    return message;
  },

  fromJSON(object: any): ListNodeRunsRequest {
    return { wfRunId: isSet(object.wfRunId) ? WfRunId.fromJSON(object.wfRunId) : undefined };
  },

  toJSON(message: ListNodeRunsRequest): unknown {
    const obj: any = {};
    if (message.wfRunId !== undefined) {
      obj.wfRunId = WfRunId.toJSON(message.wfRunId);
    }
    return obj;
  },

  create<I extends Exact<DeepPartial<ListNodeRunsRequest>, I>>(base?: I): ListNodeRunsRequest {
    return ListNodeRunsRequest.fromPartial(base ?? ({} as any));
  },
  fromPartial<I extends Exact<DeepPartial<ListNodeRunsRequest>, I>>(object: I): ListNodeRunsRequest {
    const message = createBaseListNodeRunsRequest();
    message.wfRunId = (object.wfRunId !== undefined && object.wfRunId !== null)
      ? WfRunId.fromPartial(object.wfRunId)
      : undefined;
    return message;
  },
};

function createBaseNodeRunList(): NodeRunList {
  return { results: [] };
}

export const NodeRunList = {
  encode(message: NodeRunList, writer: _m0.Writer = _m0.Writer.create()): _m0.Writer {
    for (const v of message.results) {
      NodeRun.encode(v!, writer.uint32(10).fork()).ldelim();
    }
    return writer;
  },

  decode(input: _m0.Reader | Uint8Array, length?: number): NodeRunList {
    const reader = input instanceof _m0.Reader ? input : _m0.Reader.create(input);
    let end = length === undefined ? reader.len : reader.pos + length;
    const message = createBaseNodeRunList();
    while (reader.pos < end) {
      const tag = reader.uint32();
      switch (tag >>> 3) {
        case 1:
          if (tag !== 10) {
            break;
          }

          message.results.push(NodeRun.decode(reader, reader.uint32()));
          continue;
      }
      if ((tag & 7) === 4 || tag === 0) {
        break;
      }
      reader.skipType(tag & 7);
    }
    return message;
  },

  fromJSON(object: any): NodeRunList {
    return {
      results: globalThis.Array.isArray(object?.results) ? object.results.map((e: any) => NodeRun.fromJSON(e)) : [],
    };
  },

  toJSON(message: NodeRunList): unknown {
    const obj: any = {};
    if (message.results?.length) {
      obj.results = message.results.map((e) => NodeRun.toJSON(e));
    }
    return obj;
  },

  create<I extends Exact<DeepPartial<NodeRunList>, I>>(base?: I): NodeRunList {
    return NodeRunList.fromPartial(base ?? ({} as any));
  },
  fromPartial<I extends Exact<DeepPartial<NodeRunList>, I>>(object: I): NodeRunList {
    const message = createBaseNodeRunList();
    message.results = object.results?.map((e) => NodeRun.fromPartial(e)) || [];
    return message;
  },
};

function createBaseListVariablesRequest(): ListVariablesRequest {
  return { wfRunId: undefined };
}

export const ListVariablesRequest = {
  encode(message: ListVariablesRequest, writer: _m0.Writer = _m0.Writer.create()): _m0.Writer {
    if (message.wfRunId !== undefined) {
      WfRunId.encode(message.wfRunId, writer.uint32(10).fork()).ldelim();
    }
    return writer;
  },

  decode(input: _m0.Reader | Uint8Array, length?: number): ListVariablesRequest {
    const reader = input instanceof _m0.Reader ? input : _m0.Reader.create(input);
    let end = length === undefined ? reader.len : reader.pos + length;
    const message = createBaseListVariablesRequest();
    while (reader.pos < end) {
      const tag = reader.uint32();
      switch (tag >>> 3) {
        case 1:
          if (tag !== 10) {
            break;
          }

          message.wfRunId = WfRunId.decode(reader, reader.uint32());
          continue;
      }
      if ((tag & 7) === 4 || tag === 0) {
        break;
      }
      reader.skipType(tag & 7);
    }
    return message;
  },

  fromJSON(object: any): ListVariablesRequest {
    return { wfRunId: isSet(object.wfRunId) ? WfRunId.fromJSON(object.wfRunId) : undefined };
  },

  toJSON(message: ListVariablesRequest): unknown {
    const obj: any = {};
    if (message.wfRunId !== undefined) {
      obj.wfRunId = WfRunId.toJSON(message.wfRunId);
    }
    return obj;
  },

  create<I extends Exact<DeepPartial<ListVariablesRequest>, I>>(base?: I): ListVariablesRequest {
    return ListVariablesRequest.fromPartial(base ?? ({} as any));
  },
  fromPartial<I extends Exact<DeepPartial<ListVariablesRequest>, I>>(object: I): ListVariablesRequest {
    const message = createBaseListVariablesRequest();
    message.wfRunId = (object.wfRunId !== undefined && object.wfRunId !== null)
      ? WfRunId.fromPartial(object.wfRunId)
      : undefined;
    return message;
  },
};

function createBaseVariableList(): VariableList {
  return { results: [] };
}

export const VariableList = {
  encode(message: VariableList, writer: _m0.Writer = _m0.Writer.create()): _m0.Writer {
    for (const v of message.results) {
      Variable.encode(v!, writer.uint32(10).fork()).ldelim();
    }
    return writer;
  },

  decode(input: _m0.Reader | Uint8Array, length?: number): VariableList {
    const reader = input instanceof _m0.Reader ? input : _m0.Reader.create(input);
    let end = length === undefined ? reader.len : reader.pos + length;
    const message = createBaseVariableList();
    while (reader.pos < end) {
      const tag = reader.uint32();
      switch (tag >>> 3) {
        case 1:
          if (tag !== 10) {
            break;
          }

          message.results.push(Variable.decode(reader, reader.uint32()));
          continue;
      }
      if ((tag & 7) === 4 || tag === 0) {
        break;
      }
      reader.skipType(tag & 7);
    }
    return message;
  },

  fromJSON(object: any): VariableList {
    return {
      results: globalThis.Array.isArray(object?.results) ? object.results.map((e: any) => Variable.fromJSON(e)) : [],
    };
  },

  toJSON(message: VariableList): unknown {
    const obj: any = {};
    if (message.results?.length) {
      obj.results = message.results.map((e) => Variable.toJSON(e));
    }
    return obj;
  },

  create<I extends Exact<DeepPartial<VariableList>, I>>(base?: I): VariableList {
    return VariableList.fromPartial(base ?? ({} as any));
  },
  fromPartial<I extends Exact<DeepPartial<VariableList>, I>>(object: I): VariableList {
    const message = createBaseVariableList();
    message.results = object.results?.map((e) => Variable.fromPartial(e)) || [];
    return message;
  },
};

function createBaseListExternalEventsRequest(): ListExternalEventsRequest {
  return { wfRunId: undefined };
}

export const ListExternalEventsRequest = {
  encode(message: ListExternalEventsRequest, writer: _m0.Writer = _m0.Writer.create()): _m0.Writer {
    if (message.wfRunId !== undefined) {
      WfRunId.encode(message.wfRunId, writer.uint32(10).fork()).ldelim();
    }
    return writer;
  },

  decode(input: _m0.Reader | Uint8Array, length?: number): ListExternalEventsRequest {
    const reader = input instanceof _m0.Reader ? input : _m0.Reader.create(input);
    let end = length === undefined ? reader.len : reader.pos + length;
    const message = createBaseListExternalEventsRequest();
    while (reader.pos < end) {
      const tag = reader.uint32();
      switch (tag >>> 3) {
        case 1:
          if (tag !== 10) {
            break;
          }

          message.wfRunId = WfRunId.decode(reader, reader.uint32());
          continue;
      }
      if ((tag & 7) === 4 || tag === 0) {
        break;
      }
      reader.skipType(tag & 7);
    }
    return message;
  },

  fromJSON(object: any): ListExternalEventsRequest {
    return { wfRunId: isSet(object.wfRunId) ? WfRunId.fromJSON(object.wfRunId) : undefined };
  },

  toJSON(message: ListExternalEventsRequest): unknown {
    const obj: any = {};
    if (message.wfRunId !== undefined) {
      obj.wfRunId = WfRunId.toJSON(message.wfRunId);
    }
    return obj;
  },

  create<I extends Exact<DeepPartial<ListExternalEventsRequest>, I>>(base?: I): ListExternalEventsRequest {
    return ListExternalEventsRequest.fromPartial(base ?? ({} as any));
  },
  fromPartial<I extends Exact<DeepPartial<ListExternalEventsRequest>, I>>(object: I): ListExternalEventsRequest {
    const message = createBaseListExternalEventsRequest();
    message.wfRunId = (object.wfRunId !== undefined && object.wfRunId !== null)
      ? WfRunId.fromPartial(object.wfRunId)
      : undefined;
    return message;
  },
};

function createBaseExternalEventList(): ExternalEventList {
  return { results: [] };
}

export const ExternalEventList = {
  encode(message: ExternalEventList, writer: _m0.Writer = _m0.Writer.create()): _m0.Writer {
    for (const v of message.results) {
      ExternalEvent.encode(v!, writer.uint32(10).fork()).ldelim();
    }
    return writer;
  },

  decode(input: _m0.Reader | Uint8Array, length?: number): ExternalEventList {
    const reader = input instanceof _m0.Reader ? input : _m0.Reader.create(input);
    let end = length === undefined ? reader.len : reader.pos + length;
    const message = createBaseExternalEventList();
    while (reader.pos < end) {
      const tag = reader.uint32();
      switch (tag >>> 3) {
        case 1:
          if (tag !== 10) {
            break;
          }

          message.results.push(ExternalEvent.decode(reader, reader.uint32()));
          continue;
      }
      if ((tag & 7) === 4 || tag === 0) {
        break;
      }
      reader.skipType(tag & 7);
    }
    return message;
  },

  fromJSON(object: any): ExternalEventList {
    return {
      results: globalThis.Array.isArray(object?.results)
        ? object.results.map((e: any) => ExternalEvent.fromJSON(e))
        : [],
    };
  },

  toJSON(message: ExternalEventList): unknown {
    const obj: any = {};
    if (message.results?.length) {
      obj.results = message.results.map((e) => ExternalEvent.toJSON(e));
    }
    return obj;
  },

  create<I extends Exact<DeepPartial<ExternalEventList>, I>>(base?: I): ExternalEventList {
    return ExternalEventList.fromPartial(base ?? ({} as any));
  },
  fromPartial<I extends Exact<DeepPartial<ExternalEventList>, I>>(object: I): ExternalEventList {
    const message = createBaseExternalEventList();
    message.results = object.results?.map((e) => ExternalEvent.fromPartial(e)) || [];
    return message;
  },
};

function createBaseRegisterTaskWorkerRequest(): RegisterTaskWorkerRequest {
  return { clientId: "", taskDefId: undefined, listenerName: "" };
}

export const RegisterTaskWorkerRequest = {
  encode(message: RegisterTaskWorkerRequest, writer: _m0.Writer = _m0.Writer.create()): _m0.Writer {
    if (message.clientId !== "") {
      writer.uint32(10).string(message.clientId);
    }
    if (message.taskDefId !== undefined) {
      TaskDefId.encode(message.taskDefId, writer.uint32(18).fork()).ldelim();
    }
    if (message.listenerName !== "") {
      writer.uint32(26).string(message.listenerName);
    }
    return writer;
  },

  decode(input: _m0.Reader | Uint8Array, length?: number): RegisterTaskWorkerRequest {
    const reader = input instanceof _m0.Reader ? input : _m0.Reader.create(input);
    let end = length === undefined ? reader.len : reader.pos + length;
    const message = createBaseRegisterTaskWorkerRequest();
    while (reader.pos < end) {
      const tag = reader.uint32();
      switch (tag >>> 3) {
        case 1:
          if (tag !== 10) {
            break;
          }

          message.clientId = reader.string();
          continue;
        case 2:
          if (tag !== 18) {
            break;
          }

          message.taskDefId = TaskDefId.decode(reader, reader.uint32());
          continue;
        case 3:
          if (tag !== 26) {
            break;
          }

          message.listenerName = reader.string();
          continue;
      }
      if ((tag & 7) === 4 || tag === 0) {
        break;
      }
      reader.skipType(tag & 7);
    }
    return message;
  },

  fromJSON(object: any): RegisterTaskWorkerRequest {
    return {
      clientId: isSet(object.clientId) ? globalThis.String(object.clientId) : "",
      taskDefId: isSet(object.taskDefId) ? TaskDefId.fromJSON(object.taskDefId) : undefined,
      listenerName: isSet(object.listenerName) ? globalThis.String(object.listenerName) : "",
    };
  },

  toJSON(message: RegisterTaskWorkerRequest): unknown {
    const obj: any = {};
    if (message.clientId !== "") {
      obj.clientId = message.clientId;
    }
    if (message.taskDefId !== undefined) {
      obj.taskDefId = TaskDefId.toJSON(message.taskDefId);
    }
    if (message.listenerName !== "") {
      obj.listenerName = message.listenerName;
    }
    return obj;
  },

  create<I extends Exact<DeepPartial<RegisterTaskWorkerRequest>, I>>(base?: I): RegisterTaskWorkerRequest {
    return RegisterTaskWorkerRequest.fromPartial(base ?? ({} as any));
  },
  fromPartial<I extends Exact<DeepPartial<RegisterTaskWorkerRequest>, I>>(object: I): RegisterTaskWorkerRequest {
    const message = createBaseRegisterTaskWorkerRequest();
    message.clientId = object.clientId ?? "";
    message.taskDefId = (object.taskDefId !== undefined && object.taskDefId !== null)
      ? TaskDefId.fromPartial(object.taskDefId)
      : undefined;
    message.listenerName = object.listenerName ?? "";
    return message;
  },
};

function createBaseTaskWorkerHeartBeatRequest(): TaskWorkerHeartBeatRequest {
  return { clientId: "", taskDefId: undefined, listenerName: "" };
}

export const TaskWorkerHeartBeatRequest = {
  encode(message: TaskWorkerHeartBeatRequest, writer: _m0.Writer = _m0.Writer.create()): _m0.Writer {
    if (message.clientId !== "") {
      writer.uint32(10).string(message.clientId);
    }
    if (message.taskDefId !== undefined) {
      TaskDefId.encode(message.taskDefId, writer.uint32(18).fork()).ldelim();
    }
    if (message.listenerName !== "") {
      writer.uint32(26).string(message.listenerName);
    }
    return writer;
  },

  decode(input: _m0.Reader | Uint8Array, length?: number): TaskWorkerHeartBeatRequest {
    const reader = input instanceof _m0.Reader ? input : _m0.Reader.create(input);
    let end = length === undefined ? reader.len : reader.pos + length;
    const message = createBaseTaskWorkerHeartBeatRequest();
    while (reader.pos < end) {
      const tag = reader.uint32();
      switch (tag >>> 3) {
        case 1:
          if (tag !== 10) {
            break;
          }

          message.clientId = reader.string();
          continue;
        case 2:
          if (tag !== 18) {
            break;
          }

          message.taskDefId = TaskDefId.decode(reader, reader.uint32());
          continue;
        case 3:
          if (tag !== 26) {
            break;
          }

          message.listenerName = reader.string();
          continue;
      }
      if ((tag & 7) === 4 || tag === 0) {
        break;
      }
      reader.skipType(tag & 7);
    }
    return message;
  },

  fromJSON(object: any): TaskWorkerHeartBeatRequest {
    return {
      clientId: isSet(object.clientId) ? globalThis.String(object.clientId) : "",
      taskDefId: isSet(object.taskDefId) ? TaskDefId.fromJSON(object.taskDefId) : undefined,
      listenerName: isSet(object.listenerName) ? globalThis.String(object.listenerName) : "",
    };
  },

  toJSON(message: TaskWorkerHeartBeatRequest): unknown {
    const obj: any = {};
    if (message.clientId !== "") {
      obj.clientId = message.clientId;
    }
    if (message.taskDefId !== undefined) {
      obj.taskDefId = TaskDefId.toJSON(message.taskDefId);
    }
    if (message.listenerName !== "") {
      obj.listenerName = message.listenerName;
    }
    return obj;
  },

  create<I extends Exact<DeepPartial<TaskWorkerHeartBeatRequest>, I>>(base?: I): TaskWorkerHeartBeatRequest {
    return TaskWorkerHeartBeatRequest.fromPartial(base ?? ({} as any));
  },
  fromPartial<I extends Exact<DeepPartial<TaskWorkerHeartBeatRequest>, I>>(object: I): TaskWorkerHeartBeatRequest {
    const message = createBaseTaskWorkerHeartBeatRequest();
    message.clientId = object.clientId ?? "";
    message.taskDefId = (object.taskDefId !== undefined && object.taskDefId !== null)
      ? TaskDefId.fromPartial(object.taskDefId)
      : undefined;
    message.listenerName = object.listenerName ?? "";
    return message;
  },
};

function createBaseRegisterTaskWorkerResponse(): RegisterTaskWorkerResponse {
  return { yourHosts: [], isClusterHealthy: undefined };
}

export const RegisterTaskWorkerResponse = {
  encode(message: RegisterTaskWorkerResponse, writer: _m0.Writer = _m0.Writer.create()): _m0.Writer {
    for (const v of message.yourHosts) {
      LHHostInfo.encode(v!, writer.uint32(10).fork()).ldelim();
    }
    if (message.isClusterHealthy !== undefined) {
      writer.uint32(16).bool(message.isClusterHealthy);
    }
    return writer;
  },

  decode(input: _m0.Reader | Uint8Array, length?: number): RegisterTaskWorkerResponse {
    const reader = input instanceof _m0.Reader ? input : _m0.Reader.create(input);
    let end = length === undefined ? reader.len : reader.pos + length;
    const message = createBaseRegisterTaskWorkerResponse();
    while (reader.pos < end) {
      const tag = reader.uint32();
      switch (tag >>> 3) {
        case 1:
          if (tag !== 10) {
            break;
          }

          message.yourHosts.push(LHHostInfo.decode(reader, reader.uint32()));
          continue;
        case 2:
          if (tag !== 16) {
            break;
          }

          message.isClusterHealthy = reader.bool();
          continue;
      }
      if ((tag & 7) === 4 || tag === 0) {
        break;
      }
      reader.skipType(tag & 7);
    }
    return message;
  },

  fromJSON(object: any): RegisterTaskWorkerResponse {
    return {
      yourHosts: globalThis.Array.isArray(object?.yourHosts)
        ? object.yourHosts.map((e: any) => LHHostInfo.fromJSON(e))
        : [],
      isClusterHealthy: isSet(object.isClusterHealthy) ? globalThis.Boolean(object.isClusterHealthy) : undefined,
    };
  },

  toJSON(message: RegisterTaskWorkerResponse): unknown {
    const obj: any = {};
    if (message.yourHosts?.length) {
      obj.yourHosts = message.yourHosts.map((e) => LHHostInfo.toJSON(e));
    }
    if (message.isClusterHealthy !== undefined) {
      obj.isClusterHealthy = message.isClusterHealthy;
    }
    return obj;
  },

  create<I extends Exact<DeepPartial<RegisterTaskWorkerResponse>, I>>(base?: I): RegisterTaskWorkerResponse {
    return RegisterTaskWorkerResponse.fromPartial(base ?? ({} as any));
  },
  fromPartial<I extends Exact<DeepPartial<RegisterTaskWorkerResponse>, I>>(object: I): RegisterTaskWorkerResponse {
    const message = createBaseRegisterTaskWorkerResponse();
    message.yourHosts = object.yourHosts?.map((e) => LHHostInfo.fromPartial(e)) || [];
    message.isClusterHealthy = object.isClusterHealthy ?? undefined;
    return message;
  },
};

function createBaseLHHostInfo(): LHHostInfo {
  return { host: "", port: 0 };
}

export const LHHostInfo = {
  encode(message: LHHostInfo, writer: _m0.Writer = _m0.Writer.create()): _m0.Writer {
    if (message.host !== "") {
      writer.uint32(10).string(message.host);
    }
    if (message.port !== 0) {
      writer.uint32(16).int32(message.port);
    }
    return writer;
  },

  decode(input: _m0.Reader | Uint8Array, length?: number): LHHostInfo {
    const reader = input instanceof _m0.Reader ? input : _m0.Reader.create(input);
    let end = length === undefined ? reader.len : reader.pos + length;
    const message = createBaseLHHostInfo();
    while (reader.pos < end) {
      const tag = reader.uint32();
      switch (tag >>> 3) {
        case 1:
          if (tag !== 10) {
            break;
          }

          message.host = reader.string();
          continue;
        case 2:
          if (tag !== 16) {
            break;
          }

          message.port = reader.int32();
          continue;
      }
      if ((tag & 7) === 4 || tag === 0) {
        break;
      }
      reader.skipType(tag & 7);
    }
    return message;
  },

  fromJSON(object: any): LHHostInfo {
    return {
      host: isSet(object.host) ? globalThis.String(object.host) : "",
      port: isSet(object.port) ? globalThis.Number(object.port) : 0,
    };
  },

  toJSON(message: LHHostInfo): unknown {
    const obj: any = {};
    if (message.host !== "") {
      obj.host = message.host;
    }
    if (message.port !== 0) {
      obj.port = Math.round(message.port);
    }
    return obj;
  },

  create<I extends Exact<DeepPartial<LHHostInfo>, I>>(base?: I): LHHostInfo {
    return LHHostInfo.fromPartial(base ?? ({} as any));
  },
  fromPartial<I extends Exact<DeepPartial<LHHostInfo>, I>>(object: I): LHHostInfo {
    const message = createBaseLHHostInfo();
    message.host = object.host ?? "";
    message.port = object.port ?? 0;
    return message;
  },
};

function createBaseTaskWorkerMetadata(): TaskWorkerMetadata {
  return { clientId: "", latestHeartbeat: undefined, hosts: [] };
}

export const TaskWorkerMetadata = {
  encode(message: TaskWorkerMetadata, writer: _m0.Writer = _m0.Writer.create()): _m0.Writer {
    if (message.clientId !== "") {
      writer.uint32(10).string(message.clientId);
    }
    if (message.latestHeartbeat !== undefined) {
      Timestamp.encode(toTimestamp(message.latestHeartbeat), writer.uint32(18).fork()).ldelim();
    }
    for (const v of message.hosts) {
      LHHostInfo.encode(v!, writer.uint32(26).fork()).ldelim();
    }
    return writer;
  },

  decode(input: _m0.Reader | Uint8Array, length?: number): TaskWorkerMetadata {
    const reader = input instanceof _m0.Reader ? input : _m0.Reader.create(input);
    let end = length === undefined ? reader.len : reader.pos + length;
    const message = createBaseTaskWorkerMetadata();
    while (reader.pos < end) {
      const tag = reader.uint32();
      switch (tag >>> 3) {
        case 1:
          if (tag !== 10) {
            break;
          }

          message.clientId = reader.string();
          continue;
        case 2:
          if (tag !== 18) {
            break;
          }

          message.latestHeartbeat = fromTimestamp(Timestamp.decode(reader, reader.uint32()));
          continue;
        case 3:
          if (tag !== 26) {
            break;
          }

          message.hosts.push(LHHostInfo.decode(reader, reader.uint32()));
          continue;
      }
      if ((tag & 7) === 4 || tag === 0) {
        break;
      }
      reader.skipType(tag & 7);
    }
    return message;
  },

  fromJSON(object: any): TaskWorkerMetadata {
    return {
      clientId: isSet(object.clientId) ? globalThis.String(object.clientId) : "",
      latestHeartbeat: isSet(object.latestHeartbeat) ? globalThis.String(object.latestHeartbeat) : undefined,
      hosts: globalThis.Array.isArray(object?.hosts) ? object.hosts.map((e: any) => LHHostInfo.fromJSON(e)) : [],
    };
  },

  toJSON(message: TaskWorkerMetadata): unknown {
    const obj: any = {};
    if (message.clientId !== "") {
      obj.clientId = message.clientId;
    }
    if (message.latestHeartbeat !== undefined) {
      obj.latestHeartbeat = message.latestHeartbeat;
    }
    if (message.hosts?.length) {
      obj.hosts = message.hosts.map((e) => LHHostInfo.toJSON(e));
    }
    return obj;
  },

  create<I extends Exact<DeepPartial<TaskWorkerMetadata>, I>>(base?: I): TaskWorkerMetadata {
    return TaskWorkerMetadata.fromPartial(base ?? ({} as any));
  },
  fromPartial<I extends Exact<DeepPartial<TaskWorkerMetadata>, I>>(object: I): TaskWorkerMetadata {
    const message = createBaseTaskWorkerMetadata();
    message.clientId = object.clientId ?? "";
    message.latestHeartbeat = object.latestHeartbeat ?? undefined;
    message.hosts = object.hosts?.map((e) => LHHostInfo.fromPartial(e)) || [];
    return message;
  },
};

function createBaseTaskWorkerGroup(): TaskWorkerGroup {
  return { id: undefined, createdAt: undefined, taskWorkers: {} };
}

export const TaskWorkerGroup = {
  encode(message: TaskWorkerGroup, writer: _m0.Writer = _m0.Writer.create()): _m0.Writer {
    if (message.id !== undefined) {
      TaskWorkerGroupId.encode(message.id, writer.uint32(10).fork()).ldelim();
    }
    if (message.createdAt !== undefined) {
      Timestamp.encode(toTimestamp(message.createdAt), writer.uint32(18).fork()).ldelim();
    }
    Object.entries(message.taskWorkers).forEach(([key, value]) => {
      TaskWorkerGroup_TaskWorkersEntry.encode({ key: key as any, value }, writer.uint32(26).fork()).ldelim();
    });
    return writer;
  },

  decode(input: _m0.Reader | Uint8Array, length?: number): TaskWorkerGroup {
    const reader = input instanceof _m0.Reader ? input : _m0.Reader.create(input);
    let end = length === undefined ? reader.len : reader.pos + length;
    const message = createBaseTaskWorkerGroup();
    while (reader.pos < end) {
      const tag = reader.uint32();
      switch (tag >>> 3) {
        case 1:
          if (tag !== 10) {
            break;
          }

          message.id = TaskWorkerGroupId.decode(reader, reader.uint32());
          continue;
        case 2:
          if (tag !== 18) {
            break;
          }

          message.createdAt = fromTimestamp(Timestamp.decode(reader, reader.uint32()));
          continue;
        case 3:
          if (tag !== 26) {
            break;
          }

          const entry3 = TaskWorkerGroup_TaskWorkersEntry.decode(reader, reader.uint32());
          if (entry3.value !== undefined) {
            message.taskWorkers[entry3.key] = entry3.value;
          }
          continue;
      }
      if ((tag & 7) === 4 || tag === 0) {
        break;
      }
      reader.skipType(tag & 7);
    }
    return message;
  },

  fromJSON(object: any): TaskWorkerGroup {
    return {
      id: isSet(object.id) ? TaskWorkerGroupId.fromJSON(object.id) : undefined,
      createdAt: isSet(object.createdAt) ? globalThis.String(object.createdAt) : undefined,
      taskWorkers: isObject(object.taskWorkers)
        ? Object.entries(object.taskWorkers).reduce<{ [key: string]: TaskWorkerMetadata }>((acc, [key, value]) => {
          acc[key] = TaskWorkerMetadata.fromJSON(value);
          return acc;
        }, {})
        : {},
    };
  },

  toJSON(message: TaskWorkerGroup): unknown {
    const obj: any = {};
    if (message.id !== undefined) {
      obj.id = TaskWorkerGroupId.toJSON(message.id);
    }
    if (message.createdAt !== undefined) {
      obj.createdAt = message.createdAt;
    }
    if (message.taskWorkers) {
      const entries = Object.entries(message.taskWorkers);
      if (entries.length > 0) {
        obj.taskWorkers = {};
        entries.forEach(([k, v]) => {
          obj.taskWorkers[k] = TaskWorkerMetadata.toJSON(v);
        });
      }
    }
    return obj;
  },

  create<I extends Exact<DeepPartial<TaskWorkerGroup>, I>>(base?: I): TaskWorkerGroup {
    return TaskWorkerGroup.fromPartial(base ?? ({} as any));
  },
  fromPartial<I extends Exact<DeepPartial<TaskWorkerGroup>, I>>(object: I): TaskWorkerGroup {
    const message = createBaseTaskWorkerGroup();
    message.id = (object.id !== undefined && object.id !== null) ? TaskWorkerGroupId.fromPartial(object.id) : undefined;
    message.createdAt = object.createdAt ?? undefined;
    message.taskWorkers = Object.entries(object.taskWorkers ?? {}).reduce<{ [key: string]: TaskWorkerMetadata }>(
      (acc, [key, value]) => {
        if (value !== undefined) {
          acc[key] = TaskWorkerMetadata.fromPartial(value);
        }
        return acc;
      },
      {},
    );
    return message;
  },
};

function createBaseTaskWorkerGroup_TaskWorkersEntry(): TaskWorkerGroup_TaskWorkersEntry {
  return { key: "", value: undefined };
}

export const TaskWorkerGroup_TaskWorkersEntry = {
  encode(message: TaskWorkerGroup_TaskWorkersEntry, writer: _m0.Writer = _m0.Writer.create()): _m0.Writer {
    if (message.key !== "") {
      writer.uint32(10).string(message.key);
    }
    if (message.value !== undefined) {
      TaskWorkerMetadata.encode(message.value, writer.uint32(18).fork()).ldelim();
    }
    return writer;
  },

  decode(input: _m0.Reader | Uint8Array, length?: number): TaskWorkerGroup_TaskWorkersEntry {
    const reader = input instanceof _m0.Reader ? input : _m0.Reader.create(input);
    let end = length === undefined ? reader.len : reader.pos + length;
    const message = createBaseTaskWorkerGroup_TaskWorkersEntry();
    while (reader.pos < end) {
      const tag = reader.uint32();
      switch (tag >>> 3) {
        case 1:
          if (tag !== 10) {
            break;
          }

          message.key = reader.string();
          continue;
        case 2:
          if (tag !== 18) {
            break;
          }

          message.value = TaskWorkerMetadata.decode(reader, reader.uint32());
          continue;
      }
      if ((tag & 7) === 4 || tag === 0) {
        break;
      }
      reader.skipType(tag & 7);
    }
    return message;
  },

  fromJSON(object: any): TaskWorkerGroup_TaskWorkersEntry {
    return {
      key: isSet(object.key) ? globalThis.String(object.key) : "",
      value: isSet(object.value) ? TaskWorkerMetadata.fromJSON(object.value) : undefined,
    };
  },

  toJSON(message: TaskWorkerGroup_TaskWorkersEntry): unknown {
    const obj: any = {};
    if (message.key !== "") {
      obj.key = message.key;
    }
    if (message.value !== undefined) {
      obj.value = TaskWorkerMetadata.toJSON(message.value);
    }
    return obj;
  },

  create<I extends Exact<DeepPartial<TaskWorkerGroup_TaskWorkersEntry>, I>>(
    base?: I,
  ): TaskWorkerGroup_TaskWorkersEntry {
    return TaskWorkerGroup_TaskWorkersEntry.fromPartial(base ?? ({} as any));
  },
  fromPartial<I extends Exact<DeepPartial<TaskWorkerGroup_TaskWorkersEntry>, I>>(
    object: I,
  ): TaskWorkerGroup_TaskWorkersEntry {
    const message = createBaseTaskWorkerGroup_TaskWorkersEntry();
    message.key = object.key ?? "";
    message.value = (object.value !== undefined && object.value !== null)
      ? TaskWorkerMetadata.fromPartial(object.value)
      : undefined;
    return message;
  },
};

function createBasePollTaskRequest(): PollTaskRequest {
  return { taskDefId: undefined, clientId: "", taskWorkerVersion: undefined };
}

export const PollTaskRequest = {
  encode(message: PollTaskRequest, writer: _m0.Writer = _m0.Writer.create()): _m0.Writer {
    if (message.taskDefId !== undefined) {
      TaskDefId.encode(message.taskDefId, writer.uint32(10).fork()).ldelim();
    }
    if (message.clientId !== "") {
      writer.uint32(18).string(message.clientId);
    }
    if (message.taskWorkerVersion !== undefined) {
      writer.uint32(26).string(message.taskWorkerVersion);
    }
    return writer;
  },

  decode(input: _m0.Reader | Uint8Array, length?: number): PollTaskRequest {
    const reader = input instanceof _m0.Reader ? input : _m0.Reader.create(input);
    let end = length === undefined ? reader.len : reader.pos + length;
    const message = createBasePollTaskRequest();
    while (reader.pos < end) {
      const tag = reader.uint32();
      switch (tag >>> 3) {
        case 1:
          if (tag !== 10) {
            break;
          }

          message.taskDefId = TaskDefId.decode(reader, reader.uint32());
          continue;
        case 2:
          if (tag !== 18) {
            break;
          }

          message.clientId = reader.string();
          continue;
        case 3:
          if (tag !== 26) {
            break;
          }

          message.taskWorkerVersion = reader.string();
          continue;
      }
      if ((tag & 7) === 4 || tag === 0) {
        break;
      }
      reader.skipType(tag & 7);
    }
    return message;
  },

  fromJSON(object: any): PollTaskRequest {
    return {
      taskDefId: isSet(object.taskDefId) ? TaskDefId.fromJSON(object.taskDefId) : undefined,
      clientId: isSet(object.clientId) ? globalThis.String(object.clientId) : "",
      taskWorkerVersion: isSet(object.taskWorkerVersion) ? globalThis.String(object.taskWorkerVersion) : undefined,
    };
  },

  toJSON(message: PollTaskRequest): unknown {
    const obj: any = {};
    if (message.taskDefId !== undefined) {
      obj.taskDefId = TaskDefId.toJSON(message.taskDefId);
    }
    if (message.clientId !== "") {
      obj.clientId = message.clientId;
    }
    if (message.taskWorkerVersion !== undefined) {
      obj.taskWorkerVersion = message.taskWorkerVersion;
    }
    return obj;
  },

  create<I extends Exact<DeepPartial<PollTaskRequest>, I>>(base?: I): PollTaskRequest {
    return PollTaskRequest.fromPartial(base ?? ({} as any));
  },
  fromPartial<I extends Exact<DeepPartial<PollTaskRequest>, I>>(object: I): PollTaskRequest {
    const message = createBasePollTaskRequest();
    message.taskDefId = (object.taskDefId !== undefined && object.taskDefId !== null)
      ? TaskDefId.fromPartial(object.taskDefId)
      : undefined;
    message.clientId = object.clientId ?? "";
    message.taskWorkerVersion = object.taskWorkerVersion ?? undefined;
    return message;
  },
};

function createBaseScheduledTask(): ScheduledTask {
  return {
    taskRunId: undefined,
    taskDefId: undefined,
    attemptNumber: 0,
    variables: [],
    createdAt: undefined,
    source: undefined,
  };
}

export const ScheduledTask = {
  encode(message: ScheduledTask, writer: _m0.Writer = _m0.Writer.create()): _m0.Writer {
    if (message.taskRunId !== undefined) {
      TaskRunId.encode(message.taskRunId, writer.uint32(10).fork()).ldelim();
    }
    if (message.taskDefId !== undefined) {
      TaskDefId.encode(message.taskDefId, writer.uint32(18).fork()).ldelim();
    }
    if (message.attemptNumber !== 0) {
      writer.uint32(24).int32(message.attemptNumber);
    }
    for (const v of message.variables) {
      VarNameAndVal.encode(v!, writer.uint32(34).fork()).ldelim();
    }
    if (message.createdAt !== undefined) {
      Timestamp.encode(toTimestamp(message.createdAt), writer.uint32(42).fork()).ldelim();
    }
    if (message.source !== undefined) {
      TaskRunSource.encode(message.source, writer.uint32(50).fork()).ldelim();
    }
    return writer;
  },

  decode(input: _m0.Reader | Uint8Array, length?: number): ScheduledTask {
    const reader = input instanceof _m0.Reader ? input : _m0.Reader.create(input);
    let end = length === undefined ? reader.len : reader.pos + length;
    const message = createBaseScheduledTask();
    while (reader.pos < end) {
      const tag = reader.uint32();
      switch (tag >>> 3) {
        case 1:
          if (tag !== 10) {
            break;
          }

          message.taskRunId = TaskRunId.decode(reader, reader.uint32());
          continue;
        case 2:
          if (tag !== 18) {
            break;
          }

          message.taskDefId = TaskDefId.decode(reader, reader.uint32());
          continue;
        case 3:
          if (tag !== 24) {
            break;
          }

          message.attemptNumber = reader.int32();
          continue;
        case 4:
          if (tag !== 34) {
            break;
          }

          message.variables.push(VarNameAndVal.decode(reader, reader.uint32()));
          continue;
        case 5:
          if (tag !== 42) {
            break;
          }

          message.createdAt = fromTimestamp(Timestamp.decode(reader, reader.uint32()));
          continue;
        case 6:
          if (tag !== 50) {
            break;
          }

          message.source = TaskRunSource.decode(reader, reader.uint32());
          continue;
      }
      if ((tag & 7) === 4 || tag === 0) {
        break;
      }
      reader.skipType(tag & 7);
    }
    return message;
  },

  fromJSON(object: any): ScheduledTask {
    return {
      taskRunId: isSet(object.taskRunId) ? TaskRunId.fromJSON(object.taskRunId) : undefined,
      taskDefId: isSet(object.taskDefId) ? TaskDefId.fromJSON(object.taskDefId) : undefined,
      attemptNumber: isSet(object.attemptNumber) ? globalThis.Number(object.attemptNumber) : 0,
      variables: globalThis.Array.isArray(object?.variables)
        ? object.variables.map((e: any) => VarNameAndVal.fromJSON(e))
        : [],
      createdAt: isSet(object.createdAt) ? globalThis.String(object.createdAt) : undefined,
      source: isSet(object.source) ? TaskRunSource.fromJSON(object.source) : undefined,
    };
  },

  toJSON(message: ScheduledTask): unknown {
    const obj: any = {};
    if (message.taskRunId !== undefined) {
      obj.taskRunId = TaskRunId.toJSON(message.taskRunId);
    }
    if (message.taskDefId !== undefined) {
      obj.taskDefId = TaskDefId.toJSON(message.taskDefId);
    }
    if (message.attemptNumber !== 0) {
      obj.attemptNumber = Math.round(message.attemptNumber);
    }
    if (message.variables?.length) {
      obj.variables = message.variables.map((e) => VarNameAndVal.toJSON(e));
    }
    if (message.createdAt !== undefined) {
      obj.createdAt = message.createdAt;
    }
    if (message.source !== undefined) {
      obj.source = TaskRunSource.toJSON(message.source);
    }
    return obj;
  },

  create<I extends Exact<DeepPartial<ScheduledTask>, I>>(base?: I): ScheduledTask {
    return ScheduledTask.fromPartial(base ?? ({} as any));
  },
  fromPartial<I extends Exact<DeepPartial<ScheduledTask>, I>>(object: I): ScheduledTask {
    const message = createBaseScheduledTask();
    message.taskRunId = (object.taskRunId !== undefined && object.taskRunId !== null)
      ? TaskRunId.fromPartial(object.taskRunId)
      : undefined;
    message.taskDefId = (object.taskDefId !== undefined && object.taskDefId !== null)
      ? TaskDefId.fromPartial(object.taskDefId)
      : undefined;
    message.attemptNumber = object.attemptNumber ?? 0;
    message.variables = object.variables?.map((e) => VarNameAndVal.fromPartial(e)) || [];
    message.createdAt = object.createdAt ?? undefined;
    message.source = (object.source !== undefined && object.source !== null)
      ? TaskRunSource.fromPartial(object.source)
      : undefined;
    return message;
  },
};

function createBasePollTaskResponse(): PollTaskResponse {
  return { result: undefined };
}

export const PollTaskResponse = {
  encode(message: PollTaskResponse, writer: _m0.Writer = _m0.Writer.create()): _m0.Writer {
    if (message.result !== undefined) {
      ScheduledTask.encode(message.result, writer.uint32(10).fork()).ldelim();
    }
    return writer;
  },

  decode(input: _m0.Reader | Uint8Array, length?: number): PollTaskResponse {
    const reader = input instanceof _m0.Reader ? input : _m0.Reader.create(input);
    let end = length === undefined ? reader.len : reader.pos + length;
    const message = createBasePollTaskResponse();
    while (reader.pos < end) {
      const tag = reader.uint32();
      switch (tag >>> 3) {
        case 1:
          if (tag !== 10) {
            break;
          }

          message.result = ScheduledTask.decode(reader, reader.uint32());
          continue;
      }
      if ((tag & 7) === 4 || tag === 0) {
        break;
      }
      reader.skipType(tag & 7);
    }
    return message;
  },

  fromJSON(object: any): PollTaskResponse {
    return { result: isSet(object.result) ? ScheduledTask.fromJSON(object.result) : undefined };
  },

  toJSON(message: PollTaskResponse): unknown {
    const obj: any = {};
    if (message.result !== undefined) {
      obj.result = ScheduledTask.toJSON(message.result);
    }
    return obj;
  },

  create<I extends Exact<DeepPartial<PollTaskResponse>, I>>(base?: I): PollTaskResponse {
    return PollTaskResponse.fromPartial(base ?? ({} as any));
  },
  fromPartial<I extends Exact<DeepPartial<PollTaskResponse>, I>>(object: I): PollTaskResponse {
    const message = createBasePollTaskResponse();
    message.result = (object.result !== undefined && object.result !== null)
      ? ScheduledTask.fromPartial(object.result)
      : undefined;
    return message;
  },
};

function createBaseReportTaskRun(): ReportTaskRun {
  return {
    taskRunId: undefined,
    time: undefined,
    status: TaskStatus.TASK_SCHEDULED,
    logOutput: undefined,
    attemptNumber: 0,
    output: undefined,
    error: undefined,
    exception: undefined,
  };
}

export const ReportTaskRun = {
  encode(message: ReportTaskRun, writer: _m0.Writer = _m0.Writer.create()): _m0.Writer {
    if (message.taskRunId !== undefined) {
      TaskRunId.encode(message.taskRunId, writer.uint32(10).fork()).ldelim();
    }
    if (message.time !== undefined) {
      Timestamp.encode(toTimestamp(message.time), writer.uint32(18).fork()).ldelim();
    }
    if (message.status !== TaskStatus.TASK_SCHEDULED) {
      writer.uint32(24).int32(taskStatusToNumber(message.status));
    }
    if (message.logOutput !== undefined) {
      VariableValue.encode(message.logOutput, writer.uint32(42).fork()).ldelim();
    }
    if (message.attemptNumber !== 0) {
      writer.uint32(48).int32(message.attemptNumber);
    }
    if (message.output !== undefined) {
      VariableValue.encode(message.output, writer.uint32(34).fork()).ldelim();
    }
    if (message.error !== undefined) {
      LHTaskError.encode(message.error, writer.uint32(58).fork()).ldelim();
    }
    if (message.exception !== undefined) {
      LHTaskException.encode(message.exception, writer.uint32(66).fork()).ldelim();
    }
    return writer;
  },

  decode(input: _m0.Reader | Uint8Array, length?: number): ReportTaskRun {
    const reader = input instanceof _m0.Reader ? input : _m0.Reader.create(input);
    let end = length === undefined ? reader.len : reader.pos + length;
    const message = createBaseReportTaskRun();
    while (reader.pos < end) {
      const tag = reader.uint32();
      switch (tag >>> 3) {
        case 1:
          if (tag !== 10) {
            break;
          }

          message.taskRunId = TaskRunId.decode(reader, reader.uint32());
          continue;
        case 2:
          if (tag !== 18) {
            break;
          }

          message.time = fromTimestamp(Timestamp.decode(reader, reader.uint32()));
          continue;
        case 3:
          if (tag !== 24) {
            break;
          }

          message.status = taskStatusFromJSON(reader.int32());
          continue;
        case 5:
          if (tag !== 42) {
            break;
          }

          message.logOutput = VariableValue.decode(reader, reader.uint32());
          continue;
        case 6:
          if (tag !== 48) {
            break;
          }

          message.attemptNumber = reader.int32();
          continue;
        case 4:
          if (tag !== 34) {
            break;
          }

          message.output = VariableValue.decode(reader, reader.uint32());
          continue;
        case 7:
          if (tag !== 58) {
            break;
          }

          message.error = LHTaskError.decode(reader, reader.uint32());
          continue;
        case 8:
          if (tag !== 66) {
            break;
          }

          message.exception = LHTaskException.decode(reader, reader.uint32());
          continue;
      }
      if ((tag & 7) === 4 || tag === 0) {
        break;
      }
      reader.skipType(tag & 7);
    }
    return message;
  },

  fromJSON(object: any): ReportTaskRun {
    return {
      taskRunId: isSet(object.taskRunId) ? TaskRunId.fromJSON(object.taskRunId) : undefined,
      time: isSet(object.time) ? globalThis.String(object.time) : undefined,
      status: isSet(object.status) ? taskStatusFromJSON(object.status) : TaskStatus.TASK_SCHEDULED,
      logOutput: isSet(object.logOutput) ? VariableValue.fromJSON(object.logOutput) : undefined,
      attemptNumber: isSet(object.attemptNumber) ? globalThis.Number(object.attemptNumber) : 0,
      output: isSet(object.output) ? VariableValue.fromJSON(object.output) : undefined,
      error: isSet(object.error) ? LHTaskError.fromJSON(object.error) : undefined,
      exception: isSet(object.exception) ? LHTaskException.fromJSON(object.exception) : undefined,
    };
  },

  toJSON(message: ReportTaskRun): unknown {
    const obj: any = {};
    if (message.taskRunId !== undefined) {
      obj.taskRunId = TaskRunId.toJSON(message.taskRunId);
    }
    if (message.time !== undefined) {
      obj.time = message.time;
    }
    if (message.status !== TaskStatus.TASK_SCHEDULED) {
      obj.status = taskStatusToJSON(message.status);
    }
    if (message.logOutput !== undefined) {
      obj.logOutput = VariableValue.toJSON(message.logOutput);
    }
    if (message.attemptNumber !== 0) {
      obj.attemptNumber = Math.round(message.attemptNumber);
    }
    if (message.output !== undefined) {
      obj.output = VariableValue.toJSON(message.output);
    }
    if (message.error !== undefined) {
      obj.error = LHTaskError.toJSON(message.error);
    }
    if (message.exception !== undefined) {
      obj.exception = LHTaskException.toJSON(message.exception);
    }
    return obj;
  },

  create<I extends Exact<DeepPartial<ReportTaskRun>, I>>(base?: I): ReportTaskRun {
    return ReportTaskRun.fromPartial(base ?? ({} as any));
  },
  fromPartial<I extends Exact<DeepPartial<ReportTaskRun>, I>>(object: I): ReportTaskRun {
    const message = createBaseReportTaskRun();
    message.taskRunId = (object.taskRunId !== undefined && object.taskRunId !== null)
      ? TaskRunId.fromPartial(object.taskRunId)
      : undefined;
    message.time = object.time ?? undefined;
    message.status = object.status ?? TaskStatus.TASK_SCHEDULED;
    message.logOutput = (object.logOutput !== undefined && object.logOutput !== null)
      ? VariableValue.fromPartial(object.logOutput)
      : undefined;
    message.attemptNumber = object.attemptNumber ?? 0;
    message.output = (object.output !== undefined && object.output !== null)
      ? VariableValue.fromPartial(object.output)
      : undefined;
    message.error = (object.error !== undefined && object.error !== null)
      ? LHTaskError.fromPartial(object.error)
      : undefined;
    message.exception = (object.exception !== undefined && object.exception !== null)
      ? LHTaskException.fromPartial(object.exception)
      : undefined;
    return message;
  },
};

function createBaseStopWfRunRequest(): StopWfRunRequest {
  return { wfRunId: undefined, threadRunNumber: 0 };
}

export const StopWfRunRequest = {
  encode(message: StopWfRunRequest, writer: _m0.Writer = _m0.Writer.create()): _m0.Writer {
    if (message.wfRunId !== undefined) {
      WfRunId.encode(message.wfRunId, writer.uint32(10).fork()).ldelim();
    }
    if (message.threadRunNumber !== 0) {
      writer.uint32(16).int32(message.threadRunNumber);
    }
    return writer;
  },

  decode(input: _m0.Reader | Uint8Array, length?: number): StopWfRunRequest {
    const reader = input instanceof _m0.Reader ? input : _m0.Reader.create(input);
    let end = length === undefined ? reader.len : reader.pos + length;
    const message = createBaseStopWfRunRequest();
    while (reader.pos < end) {
      const tag = reader.uint32();
      switch (tag >>> 3) {
        case 1:
          if (tag !== 10) {
            break;
          }

          message.wfRunId = WfRunId.decode(reader, reader.uint32());
          continue;
        case 2:
          if (tag !== 16) {
            break;
          }

          message.threadRunNumber = reader.int32();
          continue;
      }
      if ((tag & 7) === 4 || tag === 0) {
        break;
      }
      reader.skipType(tag & 7);
    }
    return message;
  },

  fromJSON(object: any): StopWfRunRequest {
    return {
      wfRunId: isSet(object.wfRunId) ? WfRunId.fromJSON(object.wfRunId) : undefined,
      threadRunNumber: isSet(object.threadRunNumber) ? globalThis.Number(object.threadRunNumber) : 0,
    };
  },

  toJSON(message: StopWfRunRequest): unknown {
    const obj: any = {};
    if (message.wfRunId !== undefined) {
      obj.wfRunId = WfRunId.toJSON(message.wfRunId);
    }
    if (message.threadRunNumber !== 0) {
      obj.threadRunNumber = Math.round(message.threadRunNumber);
    }
    return obj;
  },

  create<I extends Exact<DeepPartial<StopWfRunRequest>, I>>(base?: I): StopWfRunRequest {
    return StopWfRunRequest.fromPartial(base ?? ({} as any));
  },
  fromPartial<I extends Exact<DeepPartial<StopWfRunRequest>, I>>(object: I): StopWfRunRequest {
    const message = createBaseStopWfRunRequest();
    message.wfRunId = (object.wfRunId !== undefined && object.wfRunId !== null)
      ? WfRunId.fromPartial(object.wfRunId)
      : undefined;
    message.threadRunNumber = object.threadRunNumber ?? 0;
    return message;
  },
};

function createBaseResumeWfRunRequest(): ResumeWfRunRequest {
  return { wfRunId: undefined, threadRunNumber: 0 };
}

export const ResumeWfRunRequest = {
  encode(message: ResumeWfRunRequest, writer: _m0.Writer = _m0.Writer.create()): _m0.Writer {
    if (message.wfRunId !== undefined) {
      WfRunId.encode(message.wfRunId, writer.uint32(10).fork()).ldelim();
    }
    if (message.threadRunNumber !== 0) {
      writer.uint32(16).int32(message.threadRunNumber);
    }
    return writer;
  },

  decode(input: _m0.Reader | Uint8Array, length?: number): ResumeWfRunRequest {
    const reader = input instanceof _m0.Reader ? input : _m0.Reader.create(input);
    let end = length === undefined ? reader.len : reader.pos + length;
    const message = createBaseResumeWfRunRequest();
    while (reader.pos < end) {
      const tag = reader.uint32();
      switch (tag >>> 3) {
        case 1:
          if (tag !== 10) {
            break;
          }

          message.wfRunId = WfRunId.decode(reader, reader.uint32());
          continue;
        case 2:
          if (tag !== 16) {
            break;
          }

          message.threadRunNumber = reader.int32();
          continue;
      }
      if ((tag & 7) === 4 || tag === 0) {
        break;
      }
      reader.skipType(tag & 7);
    }
    return message;
  },

  fromJSON(object: any): ResumeWfRunRequest {
    return {
      wfRunId: isSet(object.wfRunId) ? WfRunId.fromJSON(object.wfRunId) : undefined,
      threadRunNumber: isSet(object.threadRunNumber) ? globalThis.Number(object.threadRunNumber) : 0,
    };
  },

  toJSON(message: ResumeWfRunRequest): unknown {
    const obj: any = {};
    if (message.wfRunId !== undefined) {
      obj.wfRunId = WfRunId.toJSON(message.wfRunId);
    }
    if (message.threadRunNumber !== 0) {
      obj.threadRunNumber = Math.round(message.threadRunNumber);
    }
    return obj;
  },

  create<I extends Exact<DeepPartial<ResumeWfRunRequest>, I>>(base?: I): ResumeWfRunRequest {
    return ResumeWfRunRequest.fromPartial(base ?? ({} as any));
  },
  fromPartial<I extends Exact<DeepPartial<ResumeWfRunRequest>, I>>(object: I): ResumeWfRunRequest {
    const message = createBaseResumeWfRunRequest();
    message.wfRunId = (object.wfRunId !== undefined && object.wfRunId !== null)
      ? WfRunId.fromPartial(object.wfRunId)
      : undefined;
    message.threadRunNumber = object.threadRunNumber ?? 0;
    return message;
  },
};

function createBaseTaskDefMetricsQueryRequest(): TaskDefMetricsQueryRequest {
  return { windowStart: undefined, windowType: MetricsWindowLength.MINUTES_5, taskDefName: undefined };
}

export const TaskDefMetricsQueryRequest = {
  encode(message: TaskDefMetricsQueryRequest, writer: _m0.Writer = _m0.Writer.create()): _m0.Writer {
    if (message.windowStart !== undefined) {
      Timestamp.encode(toTimestamp(message.windowStart), writer.uint32(10).fork()).ldelim();
    }
    if (message.windowType !== MetricsWindowLength.MINUTES_5) {
      writer.uint32(16).int32(metricsWindowLengthToNumber(message.windowType));
    }
    if (message.taskDefName !== undefined) {
      writer.uint32(26).string(message.taskDefName);
    }
    return writer;
  },

  decode(input: _m0.Reader | Uint8Array, length?: number): TaskDefMetricsQueryRequest {
    const reader = input instanceof _m0.Reader ? input : _m0.Reader.create(input);
    let end = length === undefined ? reader.len : reader.pos + length;
    const message = createBaseTaskDefMetricsQueryRequest();
    while (reader.pos < end) {
      const tag = reader.uint32();
      switch (tag >>> 3) {
        case 1:
          if (tag !== 10) {
            break;
          }

          message.windowStart = fromTimestamp(Timestamp.decode(reader, reader.uint32()));
          continue;
        case 2:
          if (tag !== 16) {
            break;
          }

          message.windowType = metricsWindowLengthFromJSON(reader.int32());
          continue;
        case 3:
          if (tag !== 26) {
            break;
          }

          message.taskDefName = reader.string();
          continue;
      }
      if ((tag & 7) === 4 || tag === 0) {
        break;
      }
      reader.skipType(tag & 7);
    }
    return message;
  },

  fromJSON(object: any): TaskDefMetricsQueryRequest {
    return {
      windowStart: isSet(object.windowStart) ? globalThis.String(object.windowStart) : undefined,
      windowType: isSet(object.windowType)
        ? metricsWindowLengthFromJSON(object.windowType)
        : MetricsWindowLength.MINUTES_5,
      taskDefName: isSet(object.taskDefName) ? globalThis.String(object.taskDefName) : undefined,
    };
  },

  toJSON(message: TaskDefMetricsQueryRequest): unknown {
    const obj: any = {};
    if (message.windowStart !== undefined) {
      obj.windowStart = message.windowStart;
    }
    if (message.windowType !== MetricsWindowLength.MINUTES_5) {
      obj.windowType = metricsWindowLengthToJSON(message.windowType);
    }
    if (message.taskDefName !== undefined) {
      obj.taskDefName = message.taskDefName;
    }
    return obj;
  },

  create<I extends Exact<DeepPartial<TaskDefMetricsQueryRequest>, I>>(base?: I): TaskDefMetricsQueryRequest {
    return TaskDefMetricsQueryRequest.fromPartial(base ?? ({} as any));
  },
  fromPartial<I extends Exact<DeepPartial<TaskDefMetricsQueryRequest>, I>>(object: I): TaskDefMetricsQueryRequest {
    const message = createBaseTaskDefMetricsQueryRequest();
    message.windowStart = object.windowStart ?? undefined;
    message.windowType = object.windowType ?? MetricsWindowLength.MINUTES_5;
    message.taskDefName = object.taskDefName ?? undefined;
    return message;
  },
};

function createBaseListTaskMetricsRequest(): ListTaskMetricsRequest {
  return {
    taskDefId: undefined,
    lastWindowStart: undefined,
    windowLength: MetricsWindowLength.MINUTES_5,
    numWindows: 0,
  };
}

export const ListTaskMetricsRequest = {
  encode(message: ListTaskMetricsRequest, writer: _m0.Writer = _m0.Writer.create()): _m0.Writer {
    if (message.taskDefId !== undefined) {
      TaskDefId.encode(message.taskDefId, writer.uint32(10).fork()).ldelim();
    }
    if (message.lastWindowStart !== undefined) {
      Timestamp.encode(toTimestamp(message.lastWindowStart), writer.uint32(18).fork()).ldelim();
    }
    if (message.windowLength !== MetricsWindowLength.MINUTES_5) {
      writer.uint32(24).int32(metricsWindowLengthToNumber(message.windowLength));
    }
    if (message.numWindows !== 0) {
      writer.uint32(32).int32(message.numWindows);
    }
    return writer;
  },

  decode(input: _m0.Reader | Uint8Array, length?: number): ListTaskMetricsRequest {
    const reader = input instanceof _m0.Reader ? input : _m0.Reader.create(input);
    let end = length === undefined ? reader.len : reader.pos + length;
    const message = createBaseListTaskMetricsRequest();
    while (reader.pos < end) {
      const tag = reader.uint32();
      switch (tag >>> 3) {
        case 1:
          if (tag !== 10) {
            break;
          }

          message.taskDefId = TaskDefId.decode(reader, reader.uint32());
          continue;
        case 2:
          if (tag !== 18) {
            break;
          }

          message.lastWindowStart = fromTimestamp(Timestamp.decode(reader, reader.uint32()));
          continue;
        case 3:
          if (tag !== 24) {
            break;
          }

          message.windowLength = metricsWindowLengthFromJSON(reader.int32());
          continue;
        case 4:
          if (tag !== 32) {
            break;
          }

          message.numWindows = reader.int32();
          continue;
      }
      if ((tag & 7) === 4 || tag === 0) {
        break;
      }
      reader.skipType(tag & 7);
    }
    return message;
  },

  fromJSON(object: any): ListTaskMetricsRequest {
    return {
      taskDefId: isSet(object.taskDefId) ? TaskDefId.fromJSON(object.taskDefId) : undefined,
      lastWindowStart: isSet(object.lastWindowStart) ? globalThis.String(object.lastWindowStart) : undefined,
      windowLength: isSet(object.windowLength)
        ? metricsWindowLengthFromJSON(object.windowLength)
        : MetricsWindowLength.MINUTES_5,
      numWindows: isSet(object.numWindows) ? globalThis.Number(object.numWindows) : 0,
    };
  },

  toJSON(message: ListTaskMetricsRequest): unknown {
    const obj: any = {};
    if (message.taskDefId !== undefined) {
      obj.taskDefId = TaskDefId.toJSON(message.taskDefId);
    }
    if (message.lastWindowStart !== undefined) {
      obj.lastWindowStart = message.lastWindowStart;
    }
    if (message.windowLength !== MetricsWindowLength.MINUTES_5) {
      obj.windowLength = metricsWindowLengthToJSON(message.windowLength);
    }
    if (message.numWindows !== 0) {
      obj.numWindows = Math.round(message.numWindows);
    }
    return obj;
  },

  create<I extends Exact<DeepPartial<ListTaskMetricsRequest>, I>>(base?: I): ListTaskMetricsRequest {
    return ListTaskMetricsRequest.fromPartial(base ?? ({} as any));
  },
  fromPartial<I extends Exact<DeepPartial<ListTaskMetricsRequest>, I>>(object: I): ListTaskMetricsRequest {
    const message = createBaseListTaskMetricsRequest();
    message.taskDefId = (object.taskDefId !== undefined && object.taskDefId !== null)
      ? TaskDefId.fromPartial(object.taskDefId)
      : undefined;
    message.lastWindowStart = object.lastWindowStart ?? undefined;
    message.windowLength = object.windowLength ?? MetricsWindowLength.MINUTES_5;
    message.numWindows = object.numWindows ?? 0;
    return message;
  },
};

function createBaseListTaskMetricsResponse(): ListTaskMetricsResponse {
  return { results: [] };
}

export const ListTaskMetricsResponse = {
  encode(message: ListTaskMetricsResponse, writer: _m0.Writer = _m0.Writer.create()): _m0.Writer {
    for (const v of message.results) {
      TaskDefMetrics.encode(v!, writer.uint32(10).fork()).ldelim();
    }
    return writer;
  },

  decode(input: _m0.Reader | Uint8Array, length?: number): ListTaskMetricsResponse {
    const reader = input instanceof _m0.Reader ? input : _m0.Reader.create(input);
    let end = length === undefined ? reader.len : reader.pos + length;
    const message = createBaseListTaskMetricsResponse();
    while (reader.pos < end) {
      const tag = reader.uint32();
      switch (tag >>> 3) {
        case 1:
          if (tag !== 10) {
            break;
          }

          message.results.push(TaskDefMetrics.decode(reader, reader.uint32()));
          continue;
      }
      if ((tag & 7) === 4 || tag === 0) {
        break;
      }
      reader.skipType(tag & 7);
    }
    return message;
  },

  fromJSON(object: any): ListTaskMetricsResponse {
    return {
      results: globalThis.Array.isArray(object?.results)
        ? object.results.map((e: any) => TaskDefMetrics.fromJSON(e))
        : [],
    };
  },

  toJSON(message: ListTaskMetricsResponse): unknown {
    const obj: any = {};
    if (message.results?.length) {
      obj.results = message.results.map((e) => TaskDefMetrics.toJSON(e));
    }
    return obj;
  },

  create<I extends Exact<DeepPartial<ListTaskMetricsResponse>, I>>(base?: I): ListTaskMetricsResponse {
    return ListTaskMetricsResponse.fromPartial(base ?? ({} as any));
  },
  fromPartial<I extends Exact<DeepPartial<ListTaskMetricsResponse>, I>>(object: I): ListTaskMetricsResponse {
    const message = createBaseListTaskMetricsResponse();
    message.results = object.results?.map((e) => TaskDefMetrics.fromPartial(e)) || [];
    return message;
  },
};

function createBaseWfSpecMetricsQueryRequest(): WfSpecMetricsQueryRequest {
  return { wfSpecId: undefined, windowStart: undefined, windowLength: MetricsWindowLength.MINUTES_5 };
}

export const WfSpecMetricsQueryRequest = {
  encode(message: WfSpecMetricsQueryRequest, writer: _m0.Writer = _m0.Writer.create()): _m0.Writer {
    if (message.wfSpecId !== undefined) {
      WfSpecId.encode(message.wfSpecId, writer.uint32(10).fork()).ldelim();
    }
    if (message.windowStart !== undefined) {
      Timestamp.encode(toTimestamp(message.windowStart), writer.uint32(18).fork()).ldelim();
    }
    if (message.windowLength !== MetricsWindowLength.MINUTES_5) {
      writer.uint32(24).int32(metricsWindowLengthToNumber(message.windowLength));
    }
    return writer;
  },

  decode(input: _m0.Reader | Uint8Array, length?: number): WfSpecMetricsQueryRequest {
    const reader = input instanceof _m0.Reader ? input : _m0.Reader.create(input);
    let end = length === undefined ? reader.len : reader.pos + length;
    const message = createBaseWfSpecMetricsQueryRequest();
    while (reader.pos < end) {
      const tag = reader.uint32();
      switch (tag >>> 3) {
        case 1:
          if (tag !== 10) {
            break;
          }

          message.wfSpecId = WfSpecId.decode(reader, reader.uint32());
          continue;
        case 2:
          if (tag !== 18) {
            break;
          }

          message.windowStart = fromTimestamp(Timestamp.decode(reader, reader.uint32()));
          continue;
        case 3:
          if (tag !== 24) {
            break;
          }

          message.windowLength = metricsWindowLengthFromJSON(reader.int32());
          continue;
      }
      if ((tag & 7) === 4 || tag === 0) {
        break;
      }
      reader.skipType(tag & 7);
    }
    return message;
  },

  fromJSON(object: any): WfSpecMetricsQueryRequest {
    return {
      wfSpecId: isSet(object.wfSpecId) ? WfSpecId.fromJSON(object.wfSpecId) : undefined,
      windowStart: isSet(object.windowStart) ? globalThis.String(object.windowStart) : undefined,
      windowLength: isSet(object.windowLength)
        ? metricsWindowLengthFromJSON(object.windowLength)
        : MetricsWindowLength.MINUTES_5,
    };
  },

  toJSON(message: WfSpecMetricsQueryRequest): unknown {
    const obj: any = {};
    if (message.wfSpecId !== undefined) {
      obj.wfSpecId = WfSpecId.toJSON(message.wfSpecId);
    }
    if (message.windowStart !== undefined) {
      obj.windowStart = message.windowStart;
    }
    if (message.windowLength !== MetricsWindowLength.MINUTES_5) {
      obj.windowLength = metricsWindowLengthToJSON(message.windowLength);
    }
    return obj;
  },

  create<I extends Exact<DeepPartial<WfSpecMetricsQueryRequest>, I>>(base?: I): WfSpecMetricsQueryRequest {
    return WfSpecMetricsQueryRequest.fromPartial(base ?? ({} as any));
  },
  fromPartial<I extends Exact<DeepPartial<WfSpecMetricsQueryRequest>, I>>(object: I): WfSpecMetricsQueryRequest {
    const message = createBaseWfSpecMetricsQueryRequest();
    message.wfSpecId = (object.wfSpecId !== undefined && object.wfSpecId !== null)
      ? WfSpecId.fromPartial(object.wfSpecId)
      : undefined;
    message.windowStart = object.windowStart ?? undefined;
    message.windowLength = object.windowLength ?? MetricsWindowLength.MINUTES_5;
    return message;
  },
};

function createBaseListWfMetricsRequest(): ListWfMetricsRequest {
  return {
    wfSpecId: undefined,
    lastWindowStart: undefined,
    windowLength: MetricsWindowLength.MINUTES_5,
    numWindows: 0,
  };
}

export const ListWfMetricsRequest = {
  encode(message: ListWfMetricsRequest, writer: _m0.Writer = _m0.Writer.create()): _m0.Writer {
    if (message.wfSpecId !== undefined) {
      WfSpecId.encode(message.wfSpecId, writer.uint32(10).fork()).ldelim();
    }
    if (message.lastWindowStart !== undefined) {
      Timestamp.encode(toTimestamp(message.lastWindowStart), writer.uint32(18).fork()).ldelim();
    }
    if (message.windowLength !== MetricsWindowLength.MINUTES_5) {
      writer.uint32(24).int32(metricsWindowLengthToNumber(message.windowLength));
    }
    if (message.numWindows !== 0) {
      writer.uint32(32).int32(message.numWindows);
    }
    return writer;
  },

  decode(input: _m0.Reader | Uint8Array, length?: number): ListWfMetricsRequest {
    const reader = input instanceof _m0.Reader ? input : _m0.Reader.create(input);
    let end = length === undefined ? reader.len : reader.pos + length;
    const message = createBaseListWfMetricsRequest();
    while (reader.pos < end) {
      const tag = reader.uint32();
      switch (tag >>> 3) {
        case 1:
          if (tag !== 10) {
            break;
          }

          message.wfSpecId = WfSpecId.decode(reader, reader.uint32());
          continue;
        case 2:
          if (tag !== 18) {
            break;
          }

          message.lastWindowStart = fromTimestamp(Timestamp.decode(reader, reader.uint32()));
          continue;
        case 3:
          if (tag !== 24) {
            break;
          }

          message.windowLength = metricsWindowLengthFromJSON(reader.int32());
          continue;
        case 4:
          if (tag !== 32) {
            break;
          }

          message.numWindows = reader.int32();
          continue;
      }
      if ((tag & 7) === 4 || tag === 0) {
        break;
      }
      reader.skipType(tag & 7);
    }
    return message;
  },

  fromJSON(object: any): ListWfMetricsRequest {
    return {
      wfSpecId: isSet(object.wfSpecId) ? WfSpecId.fromJSON(object.wfSpecId) : undefined,
      lastWindowStart: isSet(object.lastWindowStart) ? globalThis.String(object.lastWindowStart) : undefined,
      windowLength: isSet(object.windowLength)
        ? metricsWindowLengthFromJSON(object.windowLength)
        : MetricsWindowLength.MINUTES_5,
      numWindows: isSet(object.numWindows) ? globalThis.Number(object.numWindows) : 0,
    };
  },

  toJSON(message: ListWfMetricsRequest): unknown {
    const obj: any = {};
    if (message.wfSpecId !== undefined) {
      obj.wfSpecId = WfSpecId.toJSON(message.wfSpecId);
    }
    if (message.lastWindowStart !== undefined) {
      obj.lastWindowStart = message.lastWindowStart;
    }
    if (message.windowLength !== MetricsWindowLength.MINUTES_5) {
      obj.windowLength = metricsWindowLengthToJSON(message.windowLength);
    }
    if (message.numWindows !== 0) {
      obj.numWindows = Math.round(message.numWindows);
    }
    return obj;
  },

  create<I extends Exact<DeepPartial<ListWfMetricsRequest>, I>>(base?: I): ListWfMetricsRequest {
    return ListWfMetricsRequest.fromPartial(base ?? ({} as any));
  },
  fromPartial<I extends Exact<DeepPartial<ListWfMetricsRequest>, I>>(object: I): ListWfMetricsRequest {
    const message = createBaseListWfMetricsRequest();
    message.wfSpecId = (object.wfSpecId !== undefined && object.wfSpecId !== null)
      ? WfSpecId.fromPartial(object.wfSpecId)
      : undefined;
    message.lastWindowStart = object.lastWindowStart ?? undefined;
    message.windowLength = object.windowLength ?? MetricsWindowLength.MINUTES_5;
    message.numWindows = object.numWindows ?? 0;
    return message;
  },
};

function createBaseListWfMetricsResponse(): ListWfMetricsResponse {
  return { results: [] };
}

export const ListWfMetricsResponse = {
  encode(message: ListWfMetricsResponse, writer: _m0.Writer = _m0.Writer.create()): _m0.Writer {
    for (const v of message.results) {
      WfSpecMetrics.encode(v!, writer.uint32(10).fork()).ldelim();
    }
    return writer;
  },

  decode(input: _m0.Reader | Uint8Array, length?: number): ListWfMetricsResponse {
    const reader = input instanceof _m0.Reader ? input : _m0.Reader.create(input);
    let end = length === undefined ? reader.len : reader.pos + length;
    const message = createBaseListWfMetricsResponse();
    while (reader.pos < end) {
      const tag = reader.uint32();
      switch (tag >>> 3) {
        case 1:
          if (tag !== 10) {
            break;
          }

          message.results.push(WfSpecMetrics.decode(reader, reader.uint32()));
          continue;
      }
      if ((tag & 7) === 4 || tag === 0) {
        break;
      }
      reader.skipType(tag & 7);
    }
    return message;
  },

  fromJSON(object: any): ListWfMetricsResponse {
    return {
      results: globalThis.Array.isArray(object?.results)
        ? object.results.map((e: any) => WfSpecMetrics.fromJSON(e))
        : [],
    };
  },

  toJSON(message: ListWfMetricsResponse): unknown {
    const obj: any = {};
    if (message.results?.length) {
      obj.results = message.results.map((e) => WfSpecMetrics.toJSON(e));
    }
    return obj;
  },

  create<I extends Exact<DeepPartial<ListWfMetricsResponse>, I>>(base?: I): ListWfMetricsResponse {
    return ListWfMetricsResponse.fromPartial(base ?? ({} as any));
  },
  fromPartial<I extends Exact<DeepPartial<ListWfMetricsResponse>, I>>(object: I): ListWfMetricsResponse {
    const message = createBaseListWfMetricsResponse();
    message.results = object.results?.map((e) => WfSpecMetrics.fromPartial(e)) || [];
    return message;
  },
};

function createBaseTaskDefMetrics(): TaskDefMetrics {
  return {
    taskDefId: undefined,
    windowStart: undefined,
    type: MetricsWindowLength.MINUTES_5,
    scheduleToStartMax: 0,
    scheduleToStartAvg: 0,
    startToCompleteMax: 0,
    startToCompleteAvg: 0,
    totalCompleted: 0,
    totalErrored: 0,
    totalStarted: 0,
    totalScheduled: 0,
  };
}

export const TaskDefMetrics = {
  encode(message: TaskDefMetrics, writer: _m0.Writer = _m0.Writer.create()): _m0.Writer {
    if (message.taskDefId !== undefined) {
      TaskDefId.encode(message.taskDefId, writer.uint32(10).fork()).ldelim();
    }
    if (message.windowStart !== undefined) {
      Timestamp.encode(toTimestamp(message.windowStart), writer.uint32(18).fork()).ldelim();
    }
    if (message.type !== MetricsWindowLength.MINUTES_5) {
      writer.uint32(24).int32(metricsWindowLengthToNumber(message.type));
    }
    if (message.scheduleToStartMax !== 0) {
      writer.uint32(32).int64(message.scheduleToStartMax);
    }
    if (message.scheduleToStartAvg !== 0) {
      writer.uint32(40).int64(message.scheduleToStartAvg);
    }
    if (message.startToCompleteMax !== 0) {
      writer.uint32(48).int64(message.startToCompleteMax);
    }
    if (message.startToCompleteAvg !== 0) {
      writer.uint32(56).int64(message.startToCompleteAvg);
    }
    if (message.totalCompleted !== 0) {
      writer.uint32(64).int64(message.totalCompleted);
    }
    if (message.totalErrored !== 0) {
      writer.uint32(72).int64(message.totalErrored);
    }
    if (message.totalStarted !== 0) {
      writer.uint32(80).int64(message.totalStarted);
    }
    if (message.totalScheduled !== 0) {
      writer.uint32(88).int64(message.totalScheduled);
    }
    return writer;
  },

  decode(input: _m0.Reader | Uint8Array, length?: number): TaskDefMetrics {
    const reader = input instanceof _m0.Reader ? input : _m0.Reader.create(input);
    let end = length === undefined ? reader.len : reader.pos + length;
    const message = createBaseTaskDefMetrics();
    while (reader.pos < end) {
      const tag = reader.uint32();
      switch (tag >>> 3) {
        case 1:
          if (tag !== 10) {
            break;
          }

          message.taskDefId = TaskDefId.decode(reader, reader.uint32());
          continue;
        case 2:
          if (tag !== 18) {
            break;
          }

          message.windowStart = fromTimestamp(Timestamp.decode(reader, reader.uint32()));
          continue;
        case 3:
          if (tag !== 24) {
            break;
          }

          message.type = metricsWindowLengthFromJSON(reader.int32());
          continue;
        case 4:
          if (tag !== 32) {
            break;
          }

          message.scheduleToStartMax = longToNumber(reader.int64() as Long);
          continue;
        case 5:
          if (tag !== 40) {
            break;
          }

          message.scheduleToStartAvg = longToNumber(reader.int64() as Long);
          continue;
        case 6:
          if (tag !== 48) {
            break;
          }

          message.startToCompleteMax = longToNumber(reader.int64() as Long);
          continue;
        case 7:
          if (tag !== 56) {
            break;
          }

          message.startToCompleteAvg = longToNumber(reader.int64() as Long);
          continue;
        case 8:
          if (tag !== 64) {
            break;
          }

          message.totalCompleted = longToNumber(reader.int64() as Long);
          continue;
        case 9:
          if (tag !== 72) {
            break;
          }

          message.totalErrored = longToNumber(reader.int64() as Long);
          continue;
        case 10:
          if (tag !== 80) {
            break;
          }

          message.totalStarted = longToNumber(reader.int64() as Long);
          continue;
        case 11:
          if (tag !== 88) {
            break;
          }

          message.totalScheduled = longToNumber(reader.int64() as Long);
          continue;
      }
      if ((tag & 7) === 4 || tag === 0) {
        break;
      }
      reader.skipType(tag & 7);
    }
    return message;
  },

  fromJSON(object: any): TaskDefMetrics {
    return {
      taskDefId: isSet(object.taskDefId) ? TaskDefId.fromJSON(object.taskDefId) : undefined,
      windowStart: isSet(object.windowStart) ? globalThis.String(object.windowStart) : undefined,
      type: isSet(object.type) ? metricsWindowLengthFromJSON(object.type) : MetricsWindowLength.MINUTES_5,
      scheduleToStartMax: isSet(object.scheduleToStartMax) ? globalThis.Number(object.scheduleToStartMax) : 0,
      scheduleToStartAvg: isSet(object.scheduleToStartAvg) ? globalThis.Number(object.scheduleToStartAvg) : 0,
      startToCompleteMax: isSet(object.startToCompleteMax) ? globalThis.Number(object.startToCompleteMax) : 0,
      startToCompleteAvg: isSet(object.startToCompleteAvg) ? globalThis.Number(object.startToCompleteAvg) : 0,
      totalCompleted: isSet(object.totalCompleted) ? globalThis.Number(object.totalCompleted) : 0,
      totalErrored: isSet(object.totalErrored) ? globalThis.Number(object.totalErrored) : 0,
      totalStarted: isSet(object.totalStarted) ? globalThis.Number(object.totalStarted) : 0,
      totalScheduled: isSet(object.totalScheduled) ? globalThis.Number(object.totalScheduled) : 0,
    };
  },

  toJSON(message: TaskDefMetrics): unknown {
    const obj: any = {};
    if (message.taskDefId !== undefined) {
      obj.taskDefId = TaskDefId.toJSON(message.taskDefId);
    }
    if (message.windowStart !== undefined) {
      obj.windowStart = message.windowStart;
    }
    if (message.type !== MetricsWindowLength.MINUTES_5) {
      obj.type = metricsWindowLengthToJSON(message.type);
    }
    if (message.scheduleToStartMax !== 0) {
      obj.scheduleToStartMax = Math.round(message.scheduleToStartMax);
    }
    if (message.scheduleToStartAvg !== 0) {
      obj.scheduleToStartAvg = Math.round(message.scheduleToStartAvg);
    }
    if (message.startToCompleteMax !== 0) {
      obj.startToCompleteMax = Math.round(message.startToCompleteMax);
    }
    if (message.startToCompleteAvg !== 0) {
      obj.startToCompleteAvg = Math.round(message.startToCompleteAvg);
    }
    if (message.totalCompleted !== 0) {
      obj.totalCompleted = Math.round(message.totalCompleted);
    }
    if (message.totalErrored !== 0) {
      obj.totalErrored = Math.round(message.totalErrored);
    }
    if (message.totalStarted !== 0) {
      obj.totalStarted = Math.round(message.totalStarted);
    }
    if (message.totalScheduled !== 0) {
      obj.totalScheduled = Math.round(message.totalScheduled);
    }
    return obj;
  },

  create<I extends Exact<DeepPartial<TaskDefMetrics>, I>>(base?: I): TaskDefMetrics {
    return TaskDefMetrics.fromPartial(base ?? ({} as any));
  },
  fromPartial<I extends Exact<DeepPartial<TaskDefMetrics>, I>>(object: I): TaskDefMetrics {
    const message = createBaseTaskDefMetrics();
    message.taskDefId = (object.taskDefId !== undefined && object.taskDefId !== null)
      ? TaskDefId.fromPartial(object.taskDefId)
      : undefined;
    message.windowStart = object.windowStart ?? undefined;
    message.type = object.type ?? MetricsWindowLength.MINUTES_5;
    message.scheduleToStartMax = object.scheduleToStartMax ?? 0;
    message.scheduleToStartAvg = object.scheduleToStartAvg ?? 0;
    message.startToCompleteMax = object.startToCompleteMax ?? 0;
    message.startToCompleteAvg = object.startToCompleteAvg ?? 0;
    message.totalCompleted = object.totalCompleted ?? 0;
    message.totalErrored = object.totalErrored ?? 0;
    message.totalStarted = object.totalStarted ?? 0;
    message.totalScheduled = object.totalScheduled ?? 0;
    return message;
  },
};

function createBaseWfSpecMetrics(): WfSpecMetrics {
  return {
    wfSpecId: undefined,
    windowStart: undefined,
    type: MetricsWindowLength.MINUTES_5,
    totalStarted: 0,
    totalCompleted: 0,
    totalErrored: 0,
    startToCompleteMax: 0,
    startToCompleteAvg: 0,
  };
}

export const WfSpecMetrics = {
  encode(message: WfSpecMetrics, writer: _m0.Writer = _m0.Writer.create()): _m0.Writer {
    if (message.wfSpecId !== undefined) {
      WfSpecId.encode(message.wfSpecId, writer.uint32(10).fork()).ldelim();
    }
    if (message.windowStart !== undefined) {
      Timestamp.encode(toTimestamp(message.windowStart), writer.uint32(18).fork()).ldelim();
    }
    if (message.type !== MetricsWindowLength.MINUTES_5) {
      writer.uint32(24).int32(metricsWindowLengthToNumber(message.type));
    }
    if (message.totalStarted !== 0) {
      writer.uint32(32).int64(message.totalStarted);
    }
    if (message.totalCompleted !== 0) {
      writer.uint32(40).int64(message.totalCompleted);
    }
    if (message.totalErrored !== 0) {
      writer.uint32(48).int64(message.totalErrored);
    }
    if (message.startToCompleteMax !== 0) {
      writer.uint32(56).int64(message.startToCompleteMax);
    }
    if (message.startToCompleteAvg !== 0) {
      writer.uint32(64).int64(message.startToCompleteAvg);
    }
    return writer;
  },

  decode(input: _m0.Reader | Uint8Array, length?: number): WfSpecMetrics {
    const reader = input instanceof _m0.Reader ? input : _m0.Reader.create(input);
    let end = length === undefined ? reader.len : reader.pos + length;
    const message = createBaseWfSpecMetrics();
    while (reader.pos < end) {
      const tag = reader.uint32();
      switch (tag >>> 3) {
        case 1:
          if (tag !== 10) {
            break;
          }

          message.wfSpecId = WfSpecId.decode(reader, reader.uint32());
          continue;
        case 2:
          if (tag !== 18) {
            break;
          }

          message.windowStart = fromTimestamp(Timestamp.decode(reader, reader.uint32()));
          continue;
        case 3:
          if (tag !== 24) {
            break;
          }

          message.type = metricsWindowLengthFromJSON(reader.int32());
          continue;
        case 4:
          if (tag !== 32) {
            break;
          }

          message.totalStarted = longToNumber(reader.int64() as Long);
          continue;
        case 5:
          if (tag !== 40) {
            break;
          }

          message.totalCompleted = longToNumber(reader.int64() as Long);
          continue;
        case 6:
          if (tag !== 48) {
            break;
          }

          message.totalErrored = longToNumber(reader.int64() as Long);
          continue;
        case 7:
          if (tag !== 56) {
            break;
          }

          message.startToCompleteMax = longToNumber(reader.int64() as Long);
          continue;
        case 8:
          if (tag !== 64) {
            break;
          }

          message.startToCompleteAvg = longToNumber(reader.int64() as Long);
          continue;
      }
      if ((tag & 7) === 4 || tag === 0) {
        break;
      }
      reader.skipType(tag & 7);
    }
    return message;
  },

  fromJSON(object: any): WfSpecMetrics {
    return {
      wfSpecId: isSet(object.wfSpecId) ? WfSpecId.fromJSON(object.wfSpecId) : undefined,
      windowStart: isSet(object.windowStart) ? globalThis.String(object.windowStart) : undefined,
      type: isSet(object.type) ? metricsWindowLengthFromJSON(object.type) : MetricsWindowLength.MINUTES_5,
      totalStarted: isSet(object.totalStarted) ? globalThis.Number(object.totalStarted) : 0,
      totalCompleted: isSet(object.totalCompleted) ? globalThis.Number(object.totalCompleted) : 0,
      totalErrored: isSet(object.totalErrored) ? globalThis.Number(object.totalErrored) : 0,
      startToCompleteMax: isSet(object.startToCompleteMax) ? globalThis.Number(object.startToCompleteMax) : 0,
      startToCompleteAvg: isSet(object.startToCompleteAvg) ? globalThis.Number(object.startToCompleteAvg) : 0,
    };
  },

  toJSON(message: WfSpecMetrics): unknown {
    const obj: any = {};
    if (message.wfSpecId !== undefined) {
      obj.wfSpecId = WfSpecId.toJSON(message.wfSpecId);
    }
    if (message.windowStart !== undefined) {
      obj.windowStart = message.windowStart;
    }
    if (message.type !== MetricsWindowLength.MINUTES_5) {
      obj.type = metricsWindowLengthToJSON(message.type);
    }
    if (message.totalStarted !== 0) {
      obj.totalStarted = Math.round(message.totalStarted);
    }
    if (message.totalCompleted !== 0) {
      obj.totalCompleted = Math.round(message.totalCompleted);
    }
    if (message.totalErrored !== 0) {
      obj.totalErrored = Math.round(message.totalErrored);
    }
    if (message.startToCompleteMax !== 0) {
      obj.startToCompleteMax = Math.round(message.startToCompleteMax);
    }
    if (message.startToCompleteAvg !== 0) {
      obj.startToCompleteAvg = Math.round(message.startToCompleteAvg);
    }
    return obj;
  },

  create<I extends Exact<DeepPartial<WfSpecMetrics>, I>>(base?: I): WfSpecMetrics {
    return WfSpecMetrics.fromPartial(base ?? ({} as any));
  },
  fromPartial<I extends Exact<DeepPartial<WfSpecMetrics>, I>>(object: I): WfSpecMetrics {
    const message = createBaseWfSpecMetrics();
    message.wfSpecId = (object.wfSpecId !== undefined && object.wfSpecId !== null)
      ? WfSpecId.fromPartial(object.wfSpecId)
      : undefined;
    message.windowStart = object.windowStart ?? undefined;
    message.type = object.type ?? MetricsWindowLength.MINUTES_5;
    message.totalStarted = object.totalStarted ?? 0;
    message.totalCompleted = object.totalCompleted ?? 0;
    message.totalErrored = object.totalErrored ?? 0;
    message.startToCompleteMax = object.startToCompleteMax ?? 0;
    message.startToCompleteAvg = object.startToCompleteAvg ?? 0;
    return message;
  },
};

function createBaseListUserTaskRunRequest(): ListUserTaskRunRequest {
  return { wfRunId: undefined };
}

export const ListUserTaskRunRequest = {
  encode(message: ListUserTaskRunRequest, writer: _m0.Writer = _m0.Writer.create()): _m0.Writer {
    if (message.wfRunId !== undefined) {
      WfRunId.encode(message.wfRunId, writer.uint32(10).fork()).ldelim();
    }
    return writer;
  },

  decode(input: _m0.Reader | Uint8Array, length?: number): ListUserTaskRunRequest {
    const reader = input instanceof _m0.Reader ? input : _m0.Reader.create(input);
    let end = length === undefined ? reader.len : reader.pos + length;
    const message = createBaseListUserTaskRunRequest();
    while (reader.pos < end) {
      const tag = reader.uint32();
      switch (tag >>> 3) {
        case 1:
          if (tag !== 10) {
            break;
          }

          message.wfRunId = WfRunId.decode(reader, reader.uint32());
          continue;
      }
      if ((tag & 7) === 4 || tag === 0) {
        break;
      }
      reader.skipType(tag & 7);
    }
    return message;
  },

  fromJSON(object: any): ListUserTaskRunRequest {
    return { wfRunId: isSet(object.wfRunId) ? WfRunId.fromJSON(object.wfRunId) : undefined };
  },

  toJSON(message: ListUserTaskRunRequest): unknown {
    const obj: any = {};
    if (message.wfRunId !== undefined) {
      obj.wfRunId = WfRunId.toJSON(message.wfRunId);
    }
    return obj;
  },

  create<I extends Exact<DeepPartial<ListUserTaskRunRequest>, I>>(base?: I): ListUserTaskRunRequest {
    return ListUserTaskRunRequest.fromPartial(base ?? ({} as any));
  },
  fromPartial<I extends Exact<DeepPartial<ListUserTaskRunRequest>, I>>(object: I): ListUserTaskRunRequest {
    const message = createBaseListUserTaskRunRequest();
    message.wfRunId = (object.wfRunId !== undefined && object.wfRunId !== null)
      ? WfRunId.fromPartial(object.wfRunId)
      : undefined;
    return message;
  },
};

function createBaseUserTaskRunList(): UserTaskRunList {
  return { results: [] };
}

export const UserTaskRunList = {
  encode(message: UserTaskRunList, writer: _m0.Writer = _m0.Writer.create()): _m0.Writer {
    for (const v of message.results) {
      UserTaskRun.encode(v!, writer.uint32(10).fork()).ldelim();
    }
    return writer;
  },

  decode(input: _m0.Reader | Uint8Array, length?: number): UserTaskRunList {
    const reader = input instanceof _m0.Reader ? input : _m0.Reader.create(input);
    let end = length === undefined ? reader.len : reader.pos + length;
    const message = createBaseUserTaskRunList();
    while (reader.pos < end) {
      const tag = reader.uint32();
      switch (tag >>> 3) {
        case 1:
          if (tag !== 10) {
            break;
          }

          message.results.push(UserTaskRun.decode(reader, reader.uint32()));
          continue;
      }
      if ((tag & 7) === 4 || tag === 0) {
        break;
      }
      reader.skipType(tag & 7);
    }
    return message;
  },

  fromJSON(object: any): UserTaskRunList {
    return {
      results: globalThis.Array.isArray(object?.results) ? object.results.map((e: any) => UserTaskRun.fromJSON(e)) : [],
    };
  },

  toJSON(message: UserTaskRunList): unknown {
    const obj: any = {};
    if (message.results?.length) {
      obj.results = message.results.map((e) => UserTaskRun.toJSON(e));
    }
    return obj;
  },

  create<I extends Exact<DeepPartial<UserTaskRunList>, I>>(base?: I): UserTaskRunList {
    return UserTaskRunList.fromPartial(base ?? ({} as any));
  },
  fromPartial<I extends Exact<DeepPartial<UserTaskRunList>, I>>(object: I): UserTaskRunList {
    const message = createBaseUserTaskRunList();
    message.results = object.results?.map((e) => UserTaskRun.fromPartial(e)) || [];
    return message;
  },
};

function createBaseListTaskRunsRequest(): ListTaskRunsRequest {
  return { wfRunId: undefined };
}

export const ListTaskRunsRequest = {
  encode(message: ListTaskRunsRequest, writer: _m0.Writer = _m0.Writer.create()): _m0.Writer {
    if (message.wfRunId !== undefined) {
      WfRunId.encode(message.wfRunId, writer.uint32(10).fork()).ldelim();
    }
    return writer;
  },

  decode(input: _m0.Reader | Uint8Array, length?: number): ListTaskRunsRequest {
    const reader = input instanceof _m0.Reader ? input : _m0.Reader.create(input);
    let end = length === undefined ? reader.len : reader.pos + length;
    const message = createBaseListTaskRunsRequest();
    while (reader.pos < end) {
      const tag = reader.uint32();
      switch (tag >>> 3) {
        case 1:
          if (tag !== 10) {
            break;
          }

          message.wfRunId = WfRunId.decode(reader, reader.uint32());
          continue;
      }
      if ((tag & 7) === 4 || tag === 0) {
        break;
      }
      reader.skipType(tag & 7);
    }
    return message;
  },

  fromJSON(object: any): ListTaskRunsRequest {
    return { wfRunId: isSet(object.wfRunId) ? WfRunId.fromJSON(object.wfRunId) : undefined };
  },

  toJSON(message: ListTaskRunsRequest): unknown {
    const obj: any = {};
    if (message.wfRunId !== undefined) {
      obj.wfRunId = WfRunId.toJSON(message.wfRunId);
    }
    return obj;
  },

  create<I extends Exact<DeepPartial<ListTaskRunsRequest>, I>>(base?: I): ListTaskRunsRequest {
    return ListTaskRunsRequest.fromPartial(base ?? ({} as any));
  },
  fromPartial<I extends Exact<DeepPartial<ListTaskRunsRequest>, I>>(object: I): ListTaskRunsRequest {
    const message = createBaseListTaskRunsRequest();
    message.wfRunId = (object.wfRunId !== undefined && object.wfRunId !== null)
      ? WfRunId.fromPartial(object.wfRunId)
      : undefined;
    return message;
  },
};

function createBaseTaskRunList(): TaskRunList {
  return { results: [] };
}

export const TaskRunList = {
  encode(message: TaskRunList, writer: _m0.Writer = _m0.Writer.create()): _m0.Writer {
    for (const v of message.results) {
      TaskRun.encode(v!, writer.uint32(10).fork()).ldelim();
    }
    return writer;
  },

  decode(input: _m0.Reader | Uint8Array, length?: number): TaskRunList {
    const reader = input instanceof _m0.Reader ? input : _m0.Reader.create(input);
    let end = length === undefined ? reader.len : reader.pos + length;
    const message = createBaseTaskRunList();
    while (reader.pos < end) {
      const tag = reader.uint32();
      switch (tag >>> 3) {
        case 1:
          if (tag !== 10) {
            break;
          }

          message.results.push(TaskRun.decode(reader, reader.uint32()));
          continue;
      }
      if ((tag & 7) === 4 || tag === 0) {
        break;
      }
      reader.skipType(tag & 7);
    }
    return message;
  },

  fromJSON(object: any): TaskRunList {
    return {
      results: globalThis.Array.isArray(object?.results) ? object.results.map((e: any) => TaskRun.fromJSON(e)) : [],
    };
  },

  toJSON(message: TaskRunList): unknown {
    const obj: any = {};
    if (message.results?.length) {
      obj.results = message.results.map((e) => TaskRun.toJSON(e));
    }
    return obj;
  },

  create<I extends Exact<DeepPartial<TaskRunList>, I>>(base?: I): TaskRunList {
    return TaskRunList.fromPartial(base ?? ({} as any));
  },
  fromPartial<I extends Exact<DeepPartial<TaskRunList>, I>>(object: I): TaskRunList {
    const message = createBaseTaskRunList();
    message.results = object.results?.map((e) => TaskRun.fromPartial(e)) || [];
    return message;
  },
};

function createBaseMigrateWfSpecRequest(): MigrateWfSpecRequest {
  return { oldWfSpec: undefined, migration: undefined };
}

export const MigrateWfSpecRequest = {
  encode(message: MigrateWfSpecRequest, writer: _m0.Writer = _m0.Writer.create()): _m0.Writer {
    if (message.oldWfSpec !== undefined) {
      WfSpecId.encode(message.oldWfSpec, writer.uint32(10).fork()).ldelim();
    }
    if (message.migration !== undefined) {
      WfSpecVersionMigration.encode(message.migration, writer.uint32(18).fork()).ldelim();
    }
    return writer;
  },

  decode(input: _m0.Reader | Uint8Array, length?: number): MigrateWfSpecRequest {
    const reader = input instanceof _m0.Reader ? input : _m0.Reader.create(input);
    let end = length === undefined ? reader.len : reader.pos + length;
    const message = createBaseMigrateWfSpecRequest();
    while (reader.pos < end) {
      const tag = reader.uint32();
      switch (tag >>> 3) {
        case 1:
          if (tag !== 10) {
            break;
          }

          message.oldWfSpec = WfSpecId.decode(reader, reader.uint32());
          continue;
        case 2:
          if (tag !== 18) {
            break;
          }

          message.migration = WfSpecVersionMigration.decode(reader, reader.uint32());
          continue;
      }
      if ((tag & 7) === 4 || tag === 0) {
        break;
      }
      reader.skipType(tag & 7);
    }
    return message;
  },

  fromJSON(object: any): MigrateWfSpecRequest {
    return {
      oldWfSpec: isSet(object.oldWfSpec) ? WfSpecId.fromJSON(object.oldWfSpec) : undefined,
      migration: isSet(object.migration) ? WfSpecVersionMigration.fromJSON(object.migration) : undefined,
    };
  },

  toJSON(message: MigrateWfSpecRequest): unknown {
    const obj: any = {};
    if (message.oldWfSpec !== undefined) {
      obj.oldWfSpec = WfSpecId.toJSON(message.oldWfSpec);
    }
    if (message.migration !== undefined) {
      obj.migration = WfSpecVersionMigration.toJSON(message.migration);
    }
    return obj;
  },

  create<I extends Exact<DeepPartial<MigrateWfSpecRequest>, I>>(base?: I): MigrateWfSpecRequest {
    return MigrateWfSpecRequest.fromPartial(base ?? ({} as any));
  },
  fromPartial<I extends Exact<DeepPartial<MigrateWfSpecRequest>, I>>(object: I): MigrateWfSpecRequest {
    const message = createBaseMigrateWfSpecRequest();
    message.oldWfSpec = (object.oldWfSpec !== undefined && object.oldWfSpec !== null)
      ? WfSpecId.fromPartial(object.oldWfSpec)
      : undefined;
    message.migration = (object.migration !== undefined && object.migration !== null)
      ? WfSpecVersionMigration.fromPartial(object.migration)
      : undefined;
    return message;
  },
};

function createBaseGetLatestWfSpecRequest(): GetLatestWfSpecRequest {
  return { name: "", majorVersion: undefined };
}

export const GetLatestWfSpecRequest = {
  encode(message: GetLatestWfSpecRequest, writer: _m0.Writer = _m0.Writer.create()): _m0.Writer {
    if (message.name !== "") {
      writer.uint32(10).string(message.name);
    }
    if (message.majorVersion !== undefined) {
      writer.uint32(16).int32(message.majorVersion);
    }
    return writer;
  },

  decode(input: _m0.Reader | Uint8Array, length?: number): GetLatestWfSpecRequest {
    const reader = input instanceof _m0.Reader ? input : _m0.Reader.create(input);
    let end = length === undefined ? reader.len : reader.pos + length;
    const message = createBaseGetLatestWfSpecRequest();
    while (reader.pos < end) {
      const tag = reader.uint32();
      switch (tag >>> 3) {
        case 1:
          if (tag !== 10) {
            break;
          }

          message.name = reader.string();
          continue;
        case 2:
          if (tag !== 16) {
            break;
          }

          message.majorVersion = reader.int32();
          continue;
      }
      if ((tag & 7) === 4 || tag === 0) {
        break;
      }
      reader.skipType(tag & 7);
    }
    return message;
  },

  fromJSON(object: any): GetLatestWfSpecRequest {
    return {
      name: isSet(object.name) ? globalThis.String(object.name) : "",
      majorVersion: isSet(object.majorVersion) ? globalThis.Number(object.majorVersion) : undefined,
    };
  },

  toJSON(message: GetLatestWfSpecRequest): unknown {
    const obj: any = {};
    if (message.name !== "") {
      obj.name = message.name;
    }
    if (message.majorVersion !== undefined) {
      obj.majorVersion = Math.round(message.majorVersion);
    }
    return obj;
  },

  create<I extends Exact<DeepPartial<GetLatestWfSpecRequest>, I>>(base?: I): GetLatestWfSpecRequest {
    return GetLatestWfSpecRequest.fromPartial(base ?? ({} as any));
  },
  fromPartial<I extends Exact<DeepPartial<GetLatestWfSpecRequest>, I>>(object: I): GetLatestWfSpecRequest {
    const message = createBaseGetLatestWfSpecRequest();
    message.name = object.name ?? "";
    message.majorVersion = object.majorVersion ?? undefined;
    return message;
  },
};

function createBaseServerVersionResponse(): ServerVersionResponse {
  return { majorVersion: 0, minorVersion: 0, patchVersion: 0, preReleaseIdentifier: undefined };
}

export const ServerVersionResponse = {
  encode(message: ServerVersionResponse, writer: _m0.Writer = _m0.Writer.create()): _m0.Writer {
    if (message.majorVersion !== 0) {
      writer.uint32(8).int32(message.majorVersion);
    }
    if (message.minorVersion !== 0) {
      writer.uint32(16).int32(message.minorVersion);
    }
    if (message.patchVersion !== 0) {
      writer.uint32(24).int32(message.patchVersion);
    }
    if (message.preReleaseIdentifier !== undefined) {
      writer.uint32(34).string(message.preReleaseIdentifier);
    }
    return writer;
  },

  decode(input: _m0.Reader | Uint8Array, length?: number): ServerVersionResponse {
    const reader = input instanceof _m0.Reader ? input : _m0.Reader.create(input);
    let end = length === undefined ? reader.len : reader.pos + length;
    const message = createBaseServerVersionResponse();
    while (reader.pos < end) {
      const tag = reader.uint32();
      switch (tag >>> 3) {
        case 1:
          if (tag !== 8) {
            break;
          }

          message.majorVersion = reader.int32();
          continue;
        case 2:
          if (tag !== 16) {
            break;
          }

          message.minorVersion = reader.int32();
          continue;
        case 3:
          if (tag !== 24) {
            break;
          }

          message.patchVersion = reader.int32();
          continue;
        case 4:
          if (tag !== 34) {
            break;
          }

          message.preReleaseIdentifier = reader.string();
          continue;
      }
      if ((tag & 7) === 4 || tag === 0) {
        break;
      }
      reader.skipType(tag & 7);
    }
    return message;
  },

  fromJSON(object: any): ServerVersionResponse {
    return {
      majorVersion: isSet(object.majorVersion) ? globalThis.Number(object.majorVersion) : 0,
      minorVersion: isSet(object.minorVersion) ? globalThis.Number(object.minorVersion) : 0,
      patchVersion: isSet(object.patchVersion) ? globalThis.Number(object.patchVersion) : 0,
      preReleaseIdentifier: isSet(object.preReleaseIdentifier)
        ? globalThis.String(object.preReleaseIdentifier)
        : undefined,
    };
  },

  toJSON(message: ServerVersionResponse): unknown {
    const obj: any = {};
    if (message.majorVersion !== 0) {
      obj.majorVersion = Math.round(message.majorVersion);
    }
    if (message.minorVersion !== 0) {
      obj.minorVersion = Math.round(message.minorVersion);
    }
    if (message.patchVersion !== 0) {
      obj.patchVersion = Math.round(message.patchVersion);
    }
    if (message.preReleaseIdentifier !== undefined) {
      obj.preReleaseIdentifier = message.preReleaseIdentifier;
    }
    return obj;
  },

  create<I extends Exact<DeepPartial<ServerVersionResponse>, I>>(base?: I): ServerVersionResponse {
    return ServerVersionResponse.fromPartial(base ?? ({} as any));
  },
  fromPartial<I extends Exact<DeepPartial<ServerVersionResponse>, I>>(object: I): ServerVersionResponse {
    const message = createBaseServerVersionResponse();
    message.majorVersion = object.majorVersion ?? 0;
    message.minorVersion = object.minorVersion ?? 0;
    message.patchVersion = object.patchVersion ?? 0;
    message.preReleaseIdentifier = object.preReleaseIdentifier ?? undefined;
    return message;
  },
};

export type LHPublicApiDefinition = typeof LHPublicApiDefinition;
export const LHPublicApiDefinition = {
  name: "LHPublicApi",
  fullName: "littlehorse.LHPublicApi",
  methods: {
    putTaskDef: {
      name: "PutTaskDef",
      requestType: PutTaskDefRequest,
      requestStream: false,
      responseType: TaskDef,
      responseStream: false,
      options: {},
    },
    getTaskDef: {
      name: "GetTaskDef",
      requestType: TaskDefId,
      requestStream: false,
      responseType: TaskDef,
      responseStream: false,
      options: {},
    },
    putExternalEventDef: {
      name: "PutExternalEventDef",
      requestType: PutExternalEventDefRequest,
      requestStream: false,
      responseType: ExternalEventDef,
      responseStream: false,
      options: {},
    },
    getExternalEventDef: {
      name: "GetExternalEventDef",
      requestType: ExternalEventDefId,
      requestStream: false,
      responseType: ExternalEventDef,
      responseStream: false,
      options: {},
    },
    putWfSpec: {
      name: "PutWfSpec",
      requestType: PutWfSpecRequest,
      requestStream: false,
      responseType: WfSpec,
      responseStream: false,
      options: {},
    },
    getWfSpec: {
      name: "GetWfSpec",
      requestType: WfSpecId,
      requestStream: false,
      responseType: WfSpec,
      responseStream: false,
      options: {},
    },
    getLatestWfSpec: {
      name: "GetLatestWfSpec",
      requestType: GetLatestWfSpecRequest,
      requestStream: false,
      responseType: WfSpec,
      responseStream: false,
      options: {},
    },
    migrateWfSpec: {
      name: "MigrateWfSpec",
      requestType: MigrateWfSpecRequest,
      requestStream: false,
      responseType: WfSpec,
      responseStream: false,
      options: {},
    },
    putUserTaskDef: {
      name: "PutUserTaskDef",
      requestType: PutUserTaskDefRequest,
      requestStream: false,
      responseType: UserTaskDef,
      responseStream: false,
      options: {},
    },
    getUserTaskDef: {
      name: "GetUserTaskDef",
      requestType: UserTaskDefId,
      requestStream: false,
      responseType: UserTaskDef,
      responseStream: false,
      options: {},
    },
    getLatestUserTaskDef: {
      name: "GetLatestUserTaskDef",
      requestType: GetLatestUserTaskDefRequest,
      requestStream: false,
      responseType: UserTaskDef,
      responseStream: false,
      options: {},
    },
    runWf: {
      name: "RunWf",
      requestType: RunWfRequest,
      requestStream: false,
      responseType: WfRun,
      responseStream: false,
      options: {},
    },
    getWfRun: {
      name: "GetWfRun",
      requestType: WfRunId,
      requestStream: false,
      responseType: WfRun,
      responseStream: false,
      options: {},
    },
    getUserTaskRun: {
      name: "GetUserTaskRun",
      requestType: UserTaskRunId,
      requestStream: false,
      responseType: UserTaskRun,
      responseStream: false,
      options: {},
    },
    assignUserTaskRun: {
      name: "AssignUserTaskRun",
      requestType: AssignUserTaskRunRequest,
      requestStream: false,
      responseType: Empty,
      responseStream: false,
      options: {},
    },
    completeUserTaskRun: {
      name: "CompleteUserTaskRun",
      requestType: CompleteUserTaskRunRequest,
      requestStream: false,
      responseType: Empty,
      responseStream: false,
      options: {},
    },
    cancelUserTaskRun: {
      name: "CancelUserTaskRun",
      requestType: CancelUserTaskRunRequest,
      requestStream: false,
      responseType: Empty,
      responseStream: false,
      options: {},
    },
    listUserTaskRuns: {
      name: "ListUserTaskRuns",
      requestType: ListUserTaskRunRequest,
      requestStream: false,
      responseType: UserTaskRunList,
      responseStream: false,
      options: {},
    },
    getNodeRun: {
      name: "GetNodeRun",
      requestType: NodeRunId,
      requestStream: false,
      responseType: NodeRun,
      responseStream: false,
      options: {},
    },
    listNodeRuns: {
      name: "ListNodeRuns",
      requestType: ListNodeRunsRequest,
      requestStream: false,
      responseType: NodeRunList,
      responseStream: false,
      options: {},
    },
    getTaskRun: {
      name: "GetTaskRun",
      requestType: TaskRunId,
      requestStream: false,
      responseType: TaskRun,
      responseStream: false,
      options: {},
    },
    listTaskRuns: {
      name: "ListTaskRuns",
      requestType: ListTaskRunsRequest,
      requestStream: false,
      responseType: TaskRunList,
      responseStream: false,
      options: {},
    },
    getVariable: {
      name: "GetVariable",
      requestType: VariableId,
      requestStream: false,
      responseType: Variable,
      responseStream: false,
      options: {},
    },
    listVariables: {
      name: "ListVariables",
      requestType: ListVariablesRequest,
      requestStream: false,
      responseType: VariableList,
      responseStream: false,
      options: {},
    },
    putExternalEvent: {
      name: "PutExternalEvent",
      requestType: PutExternalEventRequest,
      requestStream: false,
      responseType: ExternalEvent,
      responseStream: false,
      options: {},
    },
    getExternalEvent: {
      name: "GetExternalEvent",
      requestType: ExternalEventId,
      requestStream: false,
      responseType: ExternalEvent,
      responseStream: false,
      options: {},
    },
    listExternalEvents: {
      name: "ListExternalEvents",
      requestType: ListExternalEventsRequest,
      requestStream: false,
      responseType: ExternalEventList,
      responseStream: false,
      options: {},
    },
    searchWfRun: {
      name: "SearchWfRun",
      requestType: SearchWfRunRequest,
      requestStream: false,
      responseType: WfRunIdList,
      responseStream: false,
      options: {},
    },
    searchNodeRun: {
      name: "SearchNodeRun",
      requestType: SearchNodeRunRequest,
      requestStream: false,
      responseType: NodeRunIdList,
      responseStream: false,
      options: {},
    },
    searchTaskRun: {
      name: "SearchTaskRun",
      requestType: SearchTaskRunRequest,
      requestStream: false,
      responseType: TaskRunIdList,
      responseStream: false,
      options: {},
    },
    searchUserTaskRun: {
      name: "SearchUserTaskRun",
      requestType: SearchUserTaskRunRequest,
      requestStream: false,
      responseType: UserTaskRunIdList,
      responseStream: false,
      options: {},
    },
    searchVariable: {
      name: "SearchVariable",
      requestType: SearchVariableRequest,
      requestStream: false,
      responseType: VariableIdList,
      responseStream: false,
      options: {},
    },
    searchExternalEvent: {
      name: "SearchExternalEvent",
      requestType: SearchExternalEventRequest,
      requestStream: false,
      responseType: ExternalEventIdList,
      responseStream: false,
      options: {},
    },
    searchTaskDef: {
      name: "SearchTaskDef",
      requestType: SearchTaskDefRequest,
      requestStream: false,
      responseType: TaskDefIdList,
      responseStream: false,
      options: {},
    },
    searchUserTaskDef: {
      name: "SearchUserTaskDef",
      requestType: SearchUserTaskDefRequest,
      requestStream: false,
      responseType: UserTaskDefIdList,
      responseStream: false,
      options: {},
    },
    searchWfSpec: {
      name: "SearchWfSpec",
      requestType: SearchWfSpecRequest,
      requestStream: false,
      responseType: WfSpecIdList,
      responseStream: false,
      options: {},
    },
    searchExternalEventDef: {
      name: "SearchExternalEventDef",
      requestType: SearchExternalEventDefRequest,
      requestStream: false,
      responseType: ExternalEventDefIdList,
      responseStream: false,
      options: {},
    },
    registerTaskWorker: {
      name: "RegisterTaskWorker",
      requestType: RegisterTaskWorkerRequest,
      requestStream: false,
      responseType: RegisterTaskWorkerResponse,
      responseStream: false,
      options: {},
    },
    pollTask: {
      name: "PollTask",
      requestType: PollTaskRequest,
      requestStream: true,
      responseType: PollTaskResponse,
      responseStream: true,
      options: {},
    },
    reportTask: {
      name: "ReportTask",
      requestType: ReportTaskRun,
      requestStream: false,
      responseType: Empty,
      responseStream: false,
      options: {},
    },
    stopWfRun: {
      name: "StopWfRun",
      requestType: StopWfRunRequest,
      requestStream: false,
      responseType: Empty,
      responseStream: false,
      options: {},
    },
    resumeWfRun: {
      name: "ResumeWfRun",
      requestType: ResumeWfRunRequest,
      requestStream: false,
      responseType: Empty,
      responseStream: false,
      options: {},
    },
    deleteWfRun: {
      name: "DeleteWfRun",
      requestType: DeleteWfRunRequest,
      requestStream: false,
      responseType: Empty,
      responseStream: false,
      options: {},
    },
    deleteTaskDef: {
      name: "DeleteTaskDef",
      requestType: DeleteTaskDefRequest,
      requestStream: false,
      responseType: Empty,
      responseStream: false,
      options: {},
    },
    deleteWfSpec: {
      name: "DeleteWfSpec",
      requestType: DeleteWfSpecRequest,
      requestStream: false,
      responseType: Empty,
      responseStream: false,
      options: {},
    },
    deleteUserTaskDef: {
      name: "DeleteUserTaskDef",
      requestType: DeleteUserTaskDefRequest,
      requestStream: false,
      responseType: Empty,
      responseStream: false,
      options: {},
    },
    deleteExternalEventDef: {
      name: "DeleteExternalEventDef",
      requestType: DeleteExternalEventDefRequest,
      requestStream: false,
      responseType: Empty,
      responseStream: false,
      options: {},
    },
    getTaskDefMetricsWindow: {
      name: "GetTaskDefMetricsWindow",
      requestType: TaskDefMetricsQueryRequest,
      requestStream: false,
      responseType: TaskDefMetrics,
      responseStream: false,
      options: {},
    },
    getWfSpecMetricsWindow: {
      name: "GetWfSpecMetricsWindow",
      requestType: WfSpecMetricsQueryRequest,
      requestStream: false,
      responseType: WfSpecMetrics,
      responseStream: false,
      options: {},
    },
    listTaskDefMetrics: {
      name: "ListTaskDefMetrics",
      requestType: ListTaskMetricsRequest,
      requestStream: false,
      responseType: ListTaskMetricsResponse,
      responseStream: false,
      options: {},
    },
    listWfSpecMetrics: {
      name: "ListWfSpecMetrics",
      requestType: ListWfMetricsRequest,
      requestStream: false,
      responseType: ListWfMetricsResponse,
      responseStream: false,
      options: {},
    },
    putTenant: {
      name: "PutTenant",
      requestType: PutTenantRequest,
      requestStream: false,
      responseType: Tenant,
      responseStream: false,
      options: {},
    },
    putPrincipal: {
      name: "PutPrincipal",
      requestType: PutPrincipalRequest,
      requestStream: false,
      responseType: Principal,
      responseStream: false,
      options: {},
    },
    whoami: {
      name: "Whoami",
      requestType: Empty,
      requestStream: false,
      responseType: Principal,
      responseStream: false,
      options: {},
    },
    getServerVersion: {
      name: "GetServerVersion",
      requestType: Empty,
      requestStream: false,
      responseType: ServerVersionResponse,
      responseStream: false,
      options: {},
    },
  },
} as const;

export interface LHPublicApiServiceImplementation<CallContextExt = {}> {
  putTaskDef(request: PutTaskDefRequest, context: CallContext & CallContextExt): Promise<DeepPartial<TaskDef>>;
  getTaskDef(request: TaskDefId, context: CallContext & CallContextExt): Promise<DeepPartial<TaskDef>>;
  putExternalEventDef(
    request: PutExternalEventDefRequest,
    context: CallContext & CallContextExt,
  ): Promise<DeepPartial<ExternalEventDef>>;
  getExternalEventDef(
    request: ExternalEventDefId,
    context: CallContext & CallContextExt,
  ): Promise<DeepPartial<ExternalEventDef>>;
  putWfSpec(request: PutWfSpecRequest, context: CallContext & CallContextExt): Promise<DeepPartial<WfSpec>>;
  getWfSpec(request: WfSpecId, context: CallContext & CallContextExt): Promise<DeepPartial<WfSpec>>;
  getLatestWfSpec(request: GetLatestWfSpecRequest, context: CallContext & CallContextExt): Promise<DeepPartial<WfSpec>>;
  migrateWfSpec(request: MigrateWfSpecRequest, context: CallContext & CallContextExt): Promise<DeepPartial<WfSpec>>;
  putUserTaskDef(
    request: PutUserTaskDefRequest,
    context: CallContext & CallContextExt,
  ): Promise<DeepPartial<UserTaskDef>>;
  getUserTaskDef(request: UserTaskDefId, context: CallContext & CallContextExt): Promise<DeepPartial<UserTaskDef>>;
  getLatestUserTaskDef(
    request: GetLatestUserTaskDefRequest,
    context: CallContext & CallContextExt,
  ): Promise<DeepPartial<UserTaskDef>>;
  runWf(request: RunWfRequest, context: CallContext & CallContextExt): Promise<DeepPartial<WfRun>>;
  getWfRun(request: WfRunId, context: CallContext & CallContextExt): Promise<DeepPartial<WfRun>>;
  getUserTaskRun(request: UserTaskRunId, context: CallContext & CallContextExt): Promise<DeepPartial<UserTaskRun>>;
  assignUserTaskRun(
    request: AssignUserTaskRunRequest,
    context: CallContext & CallContextExt,
  ): Promise<DeepPartial<Empty>>;
  completeUserTaskRun(
    request: CompleteUserTaskRunRequest,
    context: CallContext & CallContextExt,
  ): Promise<DeepPartial<Empty>>;
  cancelUserTaskRun(
    request: CancelUserTaskRunRequest,
    context: CallContext & CallContextExt,
  ): Promise<DeepPartial<Empty>>;
  listUserTaskRuns(
    request: ListUserTaskRunRequest,
    context: CallContext & CallContextExt,
  ): Promise<DeepPartial<UserTaskRunList>>;
  getNodeRun(request: NodeRunId, context: CallContext & CallContextExt): Promise<DeepPartial<NodeRun>>;
  listNodeRuns(request: ListNodeRunsRequest, context: CallContext & CallContextExt): Promise<DeepPartial<NodeRunList>>;
  getTaskRun(request: TaskRunId, context: CallContext & CallContextExt): Promise<DeepPartial<TaskRun>>;
  listTaskRuns(request: ListTaskRunsRequest, context: CallContext & CallContextExt): Promise<DeepPartial<TaskRunList>>;
  getVariable(request: VariableId, context: CallContext & CallContextExt): Promise<DeepPartial<Variable>>;
  listVariables(
    request: ListVariablesRequest,
    context: CallContext & CallContextExt,
  ): Promise<DeepPartial<VariableList>>;
  putExternalEvent(
    request: PutExternalEventRequest,
    context: CallContext & CallContextExt,
  ): Promise<DeepPartial<ExternalEvent>>;
  getExternalEvent(
    request: ExternalEventId,
    context: CallContext & CallContextExt,
  ): Promise<DeepPartial<ExternalEvent>>;
  listExternalEvents(
    request: ListExternalEventsRequest,
    context: CallContext & CallContextExt,
  ): Promise<DeepPartial<ExternalEventList>>;
  searchWfRun(request: SearchWfRunRequest, context: CallContext & CallContextExt): Promise<DeepPartial<WfRunIdList>>;
  searchNodeRun(
    request: SearchNodeRunRequest,
    context: CallContext & CallContextExt,
  ): Promise<DeepPartial<NodeRunIdList>>;
  searchTaskRun(
    request: SearchTaskRunRequest,
    context: CallContext & CallContextExt,
  ): Promise<DeepPartial<TaskRunIdList>>;
  searchUserTaskRun(
    request: SearchUserTaskRunRequest,
    context: CallContext & CallContextExt,
  ): Promise<DeepPartial<UserTaskRunIdList>>;
  searchVariable(
    request: SearchVariableRequest,
    context: CallContext & CallContextExt,
  ): Promise<DeepPartial<VariableIdList>>;
  searchExternalEvent(
    request: SearchExternalEventRequest,
    context: CallContext & CallContextExt,
  ): Promise<DeepPartial<ExternalEventIdList>>;
  searchTaskDef(
    request: SearchTaskDefRequest,
    context: CallContext & CallContextExt,
  ): Promise<DeepPartial<TaskDefIdList>>;
  searchUserTaskDef(
    request: SearchUserTaskDefRequest,
    context: CallContext & CallContextExt,
  ): Promise<DeepPartial<UserTaskDefIdList>>;
  searchWfSpec(request: SearchWfSpecRequest, context: CallContext & CallContextExt): Promise<DeepPartial<WfSpecIdList>>;
  searchExternalEventDef(
    request: SearchExternalEventDefRequest,
    context: CallContext & CallContextExt,
  ): Promise<DeepPartial<ExternalEventDefIdList>>;
  registerTaskWorker(
    request: RegisterTaskWorkerRequest,
    context: CallContext & CallContextExt,
  ): Promise<DeepPartial<RegisterTaskWorkerResponse>>;
  pollTask(
    request: AsyncIterable<PollTaskRequest>,
    context: CallContext & CallContextExt,
  ): ServerStreamingMethodResult<DeepPartial<PollTaskResponse>>;
  reportTask(request: ReportTaskRun, context: CallContext & CallContextExt): Promise<DeepPartial<Empty>>;
  stopWfRun(request: StopWfRunRequest, context: CallContext & CallContextExt): Promise<DeepPartial<Empty>>;
  resumeWfRun(request: ResumeWfRunRequest, context: CallContext & CallContextExt): Promise<DeepPartial<Empty>>;
  deleteWfRun(request: DeleteWfRunRequest, context: CallContext & CallContextExt): Promise<DeepPartial<Empty>>;
  deleteTaskDef(request: DeleteTaskDefRequest, context: CallContext & CallContextExt): Promise<DeepPartial<Empty>>;
  deleteWfSpec(request: DeleteWfSpecRequest, context: CallContext & CallContextExt): Promise<DeepPartial<Empty>>;
  deleteUserTaskDef(
    request: DeleteUserTaskDefRequest,
    context: CallContext & CallContextExt,
  ): Promise<DeepPartial<Empty>>;
  deleteExternalEventDef(
    request: DeleteExternalEventDefRequest,
    context: CallContext & CallContextExt,
  ): Promise<DeepPartial<Empty>>;
  getTaskDefMetricsWindow(
    request: TaskDefMetricsQueryRequest,
    context: CallContext & CallContextExt,
  ): Promise<DeepPartial<TaskDefMetrics>>;
  getWfSpecMetricsWindow(
    request: WfSpecMetricsQueryRequest,
    context: CallContext & CallContextExt,
  ): Promise<DeepPartial<WfSpecMetrics>>;
  listTaskDefMetrics(
    request: ListTaskMetricsRequest,
    context: CallContext & CallContextExt,
  ): Promise<DeepPartial<ListTaskMetricsResponse>>;
  listWfSpecMetrics(
    request: ListWfMetricsRequest,
    context: CallContext & CallContextExt,
  ): Promise<DeepPartial<ListWfMetricsResponse>>;
  putTenant(request: PutTenantRequest, context: CallContext & CallContextExt): Promise<DeepPartial<Tenant>>;
  putPrincipal(request: PutPrincipalRequest, context: CallContext & CallContextExt): Promise<DeepPartial<Principal>>;
  whoami(request: Empty, context: CallContext & CallContextExt): Promise<DeepPartial<Principal>>;
  getServerVersion(request: Empty, context: CallContext & CallContextExt): Promise<DeepPartial<ServerVersionResponse>>;
}

export interface LHPublicApiClient<CallOptionsExt = {}> {
  putTaskDef(request: DeepPartial<PutTaskDefRequest>, options?: CallOptions & CallOptionsExt): Promise<TaskDef>;
  getTaskDef(request: DeepPartial<TaskDefId>, options?: CallOptions & CallOptionsExt): Promise<TaskDef>;
  putExternalEventDef(
    request: DeepPartial<PutExternalEventDefRequest>,
    options?: CallOptions & CallOptionsExt,
  ): Promise<ExternalEventDef>;
  getExternalEventDef(
    request: DeepPartial<ExternalEventDefId>,
    options?: CallOptions & CallOptionsExt,
  ): Promise<ExternalEventDef>;
  putWfSpec(request: DeepPartial<PutWfSpecRequest>, options?: CallOptions & CallOptionsExt): Promise<WfSpec>;
  getWfSpec(request: DeepPartial<WfSpecId>, options?: CallOptions & CallOptionsExt): Promise<WfSpec>;
  getLatestWfSpec(
    request: DeepPartial<GetLatestWfSpecRequest>,
    options?: CallOptions & CallOptionsExt,
  ): Promise<WfSpec>;
  migrateWfSpec(request: DeepPartial<MigrateWfSpecRequest>, options?: CallOptions & CallOptionsExt): Promise<WfSpec>;
  putUserTaskDef(
    request: DeepPartial<PutUserTaskDefRequest>,
    options?: CallOptions & CallOptionsExt,
  ): Promise<UserTaskDef>;
  getUserTaskDef(request: DeepPartial<UserTaskDefId>, options?: CallOptions & CallOptionsExt): Promise<UserTaskDef>;
  getLatestUserTaskDef(
    request: DeepPartial<GetLatestUserTaskDefRequest>,
    options?: CallOptions & CallOptionsExt,
  ): Promise<UserTaskDef>;
  runWf(request: DeepPartial<RunWfRequest>, options?: CallOptions & CallOptionsExt): Promise<WfRun>;
  getWfRun(request: DeepPartial<WfRunId>, options?: CallOptions & CallOptionsExt): Promise<WfRun>;
  getUserTaskRun(request: DeepPartial<UserTaskRunId>, options?: CallOptions & CallOptionsExt): Promise<UserTaskRun>;
  assignUserTaskRun(
    request: DeepPartial<AssignUserTaskRunRequest>,
    options?: CallOptions & CallOptionsExt,
  ): Promise<Empty>;
  completeUserTaskRun(
    request: DeepPartial<CompleteUserTaskRunRequest>,
    options?: CallOptions & CallOptionsExt,
  ): Promise<Empty>;
  cancelUserTaskRun(
    request: DeepPartial<CancelUserTaskRunRequest>,
    options?: CallOptions & CallOptionsExt,
  ): Promise<Empty>;
  listUserTaskRuns(
    request: DeepPartial<ListUserTaskRunRequest>,
    options?: CallOptions & CallOptionsExt,
  ): Promise<UserTaskRunList>;
  getNodeRun(request: DeepPartial<NodeRunId>, options?: CallOptions & CallOptionsExt): Promise<NodeRun>;
  listNodeRuns(request: DeepPartial<ListNodeRunsRequest>, options?: CallOptions & CallOptionsExt): Promise<NodeRunList>;
  getTaskRun(request: DeepPartial<TaskRunId>, options?: CallOptions & CallOptionsExt): Promise<TaskRun>;
  listTaskRuns(request: DeepPartial<ListTaskRunsRequest>, options?: CallOptions & CallOptionsExt): Promise<TaskRunList>;
  getVariable(request: DeepPartial<VariableId>, options?: CallOptions & CallOptionsExt): Promise<Variable>;
  listVariables(
    request: DeepPartial<ListVariablesRequest>,
    options?: CallOptions & CallOptionsExt,
  ): Promise<VariableList>;
  putExternalEvent(
    request: DeepPartial<PutExternalEventRequest>,
    options?: CallOptions & CallOptionsExt,
  ): Promise<ExternalEvent>;
  getExternalEvent(
    request: DeepPartial<ExternalEventId>,
    options?: CallOptions & CallOptionsExt,
  ): Promise<ExternalEvent>;
  listExternalEvents(
    request: DeepPartial<ListExternalEventsRequest>,
    options?: CallOptions & CallOptionsExt,
  ): Promise<ExternalEventList>;
  searchWfRun(request: DeepPartial<SearchWfRunRequest>, options?: CallOptions & CallOptionsExt): Promise<WfRunIdList>;
  searchNodeRun(
    request: DeepPartial<SearchNodeRunRequest>,
    options?: CallOptions & CallOptionsExt,
  ): Promise<NodeRunIdList>;
  searchTaskRun(
    request: DeepPartial<SearchTaskRunRequest>,
    options?: CallOptions & CallOptionsExt,
  ): Promise<TaskRunIdList>;
  searchUserTaskRun(
    request: DeepPartial<SearchUserTaskRunRequest>,
    options?: CallOptions & CallOptionsExt,
  ): Promise<UserTaskRunIdList>;
  searchVariable(
    request: DeepPartial<SearchVariableRequest>,
    options?: CallOptions & CallOptionsExt,
  ): Promise<VariableIdList>;
  searchExternalEvent(
    request: DeepPartial<SearchExternalEventRequest>,
    options?: CallOptions & CallOptionsExt,
  ): Promise<ExternalEventIdList>;
  searchTaskDef(
    request: DeepPartial<SearchTaskDefRequest>,
    options?: CallOptions & CallOptionsExt,
  ): Promise<TaskDefIdList>;
  searchUserTaskDef(
    request: DeepPartial<SearchUserTaskDefRequest>,
    options?: CallOptions & CallOptionsExt,
  ): Promise<UserTaskDefIdList>;
  searchWfSpec(
    request: DeepPartial<SearchWfSpecRequest>,
    options?: CallOptions & CallOptionsExt,
  ): Promise<WfSpecIdList>;
  searchExternalEventDef(
    request: DeepPartial<SearchExternalEventDefRequest>,
    options?: CallOptions & CallOptionsExt,
  ): Promise<ExternalEventDefIdList>;
  registerTaskWorker(
    request: DeepPartial<RegisterTaskWorkerRequest>,
    options?: CallOptions & CallOptionsExt,
  ): Promise<RegisterTaskWorkerResponse>;
  pollTask(
    request: AsyncIterable<DeepPartial<PollTaskRequest>>,
    options?: CallOptions & CallOptionsExt,
  ): AsyncIterable<PollTaskResponse>;
  reportTask(request: DeepPartial<ReportTaskRun>, options?: CallOptions & CallOptionsExt): Promise<Empty>;
  stopWfRun(request: DeepPartial<StopWfRunRequest>, options?: CallOptions & CallOptionsExt): Promise<Empty>;
  resumeWfRun(request: DeepPartial<ResumeWfRunRequest>, options?: CallOptions & CallOptionsExt): Promise<Empty>;
  deleteWfRun(request: DeepPartial<DeleteWfRunRequest>, options?: CallOptions & CallOptionsExt): Promise<Empty>;
  deleteTaskDef(request: DeepPartial<DeleteTaskDefRequest>, options?: CallOptions & CallOptionsExt): Promise<Empty>;
  deleteWfSpec(request: DeepPartial<DeleteWfSpecRequest>, options?: CallOptions & CallOptionsExt): Promise<Empty>;
  deleteUserTaskDef(
    request: DeepPartial<DeleteUserTaskDefRequest>,
    options?: CallOptions & CallOptionsExt,
  ): Promise<Empty>;
  deleteExternalEventDef(
    request: DeepPartial<DeleteExternalEventDefRequest>,
    options?: CallOptions & CallOptionsExt,
  ): Promise<Empty>;
  getTaskDefMetricsWindow(
    request: DeepPartial<TaskDefMetricsQueryRequest>,
    options?: CallOptions & CallOptionsExt,
  ): Promise<TaskDefMetrics>;
  getWfSpecMetricsWindow(
    request: DeepPartial<WfSpecMetricsQueryRequest>,
    options?: CallOptions & CallOptionsExt,
  ): Promise<WfSpecMetrics>;
  listTaskDefMetrics(
    request: DeepPartial<ListTaskMetricsRequest>,
    options?: CallOptions & CallOptionsExt,
  ): Promise<ListTaskMetricsResponse>;
  listWfSpecMetrics(
    request: DeepPartial<ListWfMetricsRequest>,
    options?: CallOptions & CallOptionsExt,
  ): Promise<ListWfMetricsResponse>;
  putTenant(request: DeepPartial<PutTenantRequest>, options?: CallOptions & CallOptionsExt): Promise<Tenant>;
  putPrincipal(request: DeepPartial<PutPrincipalRequest>, options?: CallOptions & CallOptionsExt): Promise<Principal>;
  whoami(request: DeepPartial<Empty>, options?: CallOptions & CallOptionsExt): Promise<Principal>;
  getServerVersion(request: DeepPartial<Empty>, options?: CallOptions & CallOptionsExt): Promise<ServerVersionResponse>;
}

function bytesFromBase64(b64: string): Uint8Array {
  if (globalThis.Buffer) {
    return Uint8Array.from(globalThis.Buffer.from(b64, "base64"));
  } else {
    const bin = globalThis.atob(b64);
    const arr = new Uint8Array(bin.length);
    for (let i = 0; i < bin.length; ++i) {
      arr[i] = bin.charCodeAt(i);
    }
    return arr;
  }
}

function base64FromBytes(arr: Uint8Array): string {
  if (globalThis.Buffer) {
    return globalThis.Buffer.from(arr).toString("base64");
  } else {
    const bin: string[] = [];
    arr.forEach((byte) => {
      bin.push(globalThis.String.fromCharCode(byte));
    });
    return globalThis.btoa(bin.join(""));
  }
}

type Builtin = Date | Function | Uint8Array | string | number | boolean | undefined;

export type DeepPartial<T> = T extends Builtin ? T
  : T extends globalThis.Array<infer U> ? globalThis.Array<DeepPartial<U>>
  : T extends ReadonlyArray<infer U> ? ReadonlyArray<DeepPartial<U>>
  : T extends {} ? { [K in keyof T]?: DeepPartial<T[K]> }
  : Partial<T>;

type KeysOfUnion<T> = T extends T ? keyof T : never;
export type Exact<P, I extends P> = P extends Builtin ? P
  : P & { [K in keyof P]: Exact<P[K], I[K]> } & { [K in Exclude<keyof I, KeysOfUnion<P>>]: never };

function toTimestamp(dateStr: string): Timestamp {
  const date = new globalThis.Date(dateStr);
  const seconds = date.getTime() / 1_000;
  const nanos = (date.getTime() % 1_000) * 1_000_000;
  return { seconds, nanos };
}

function fromTimestamp(t: Timestamp): string {
  let millis = (t.seconds || 0) * 1_000;
  millis += (t.nanos || 0) / 1_000_000;
  return new globalThis.Date(millis).toISOString();
}

function longToNumber(long: Long): number {
  if (long.gt(globalThis.Number.MAX_SAFE_INTEGER)) {
    throw new globalThis.Error("Value is larger than Number.MAX_SAFE_INTEGER");
  }
  return long.toNumber();
}

if (_m0.util.Long !== Long) {
  _m0.util.Long = Long as any;
  _m0.configure();
}

function isObject(value: any): boolean {
  return typeof value === "object" && value !== null;
}

function isSet(value: any): boolean {
  return value !== null && value !== undefined;
}

export type ServerStreamingMethodResult<Response> = { [Symbol.asyncIterator](): AsyncIterator<Response, void> };