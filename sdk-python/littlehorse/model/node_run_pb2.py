# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: node_run.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
from google.protobuf.internal import builder as _builder
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.protobuf import timestamp_pb2 as google_dot_protobuf_dot_timestamp__pb2
import littlehorse.model.common_enums_pb2 as common__enums__pb2
import littlehorse.model.variable_pb2 as variable__pb2
import littlehorse.model.object_id_pb2 as object__id__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n\x0enode_run.proto\x12\x0blittlehorse\x1a\x1fgoogle/protobuf/timestamp.proto\x1a\x12\x63ommon_enums.proto\x1a\x0evariable.proto\x1a\x0fobject_id.proto\"\xc1\x06\n\x07NodeRun\x12\x11\n\twf_run_id\x18\x01 \x01(\t\x12\x19\n\x11thread_run_number\x18\x02 \x01(\x05\x12\x10\n\x08position\x18\x03 \x01(\x05\x12%\n\x06status\x18\x06 \x01(\x0e\x32\x15.littlehorse.LHStatus\x12\x30\n\x0c\x61rrival_time\x18\x07 \x01(\x0b\x32\x1a.google.protobuf.Timestamp\x12\x31\n\x08\x65nd_time\x18\x08 \x01(\x0b\x32\x1a.google.protobuf.TimestampH\x01\x88\x01\x01\x12)\n\nwf_spec_id\x18\t \x01(\x0b\x32\x15.littlehorse.WfSpecId\x12\x18\n\x10thread_spec_name\x18\n \x01(\t\x12\x11\n\tnode_name\x18\x0b \x01(\t\x12\x1a\n\rerror_message\x18\r \x01(\tH\x02\x88\x01\x01\x12&\n\x08\x66\x61ilures\x18\x0e \x03(\x0b\x32\x14.littlehorse.Failure\x12(\n\x04task\x18\x0f \x01(\x0b\x32\x18.littlehorse.TaskNodeRunH\x00\x12\x37\n\x0e\x65xternal_event\x18\x10 \x01(\x0b\x32\x1d.littlehorse.ExternalEventRunH\x00\x12\x30\n\nentrypoint\x18\x11 \x01(\x0b\x32\x1a.littlehorse.EntrypointRunH\x00\x12$\n\x04\x65xit\x18\x13 \x01(\x0b\x32\x14.littlehorse.ExitRunH\x00\x12\x33\n\x0cstart_thread\x18\x14 \x01(\x0b\x32\x1b.littlehorse.StartThreadRunH\x00\x12\x36\n\x0cwait_threads\x18\x15 \x01(\x0b\x32\x1e.littlehorse.WaitForThreadsRunH\x00\x12*\n\x05sleep\x18\x16 \x01(\x0b\x32\x19.littlehorse.SleepNodeRunH\x00\x12\x31\n\tuser_task\x18\x18 \x01(\x0b\x32\x1c.littlehorse.UserTaskNodeRunH\x00\x12\x1b\n\x13\x66\x61ilure_handler_ids\x18\x17 \x03(\x05\x42\x0b\n\tnode_typeB\x0b\n\t_end_timeB\x10\n\x0e_error_message\"O\n\x0bTaskNodeRun\x12\x30\n\x0btask_run_id\x18\x01 \x01(\x0b\x32\x16.littlehorse.TaskRunIdH\x00\x88\x01\x01\x42\x0e\n\x0c_task_run_id\"a\n\x0fUserTaskNodeRun\x12\x39\n\x10user_task_run_id\x18\x01 \x01(\x0b\x32\x1a.littlehorse.UserTaskRunIdH\x00\x88\x01\x01\x42\x13\n\x11_user_task_run_id\"\x0f\n\rEntrypointRun\"\t\n\x07\x45xitRun\"\\\n\x0eStartThreadRun\x12\x1c\n\x0f\x63hild_thread_id\x18\x01 \x01(\x05H\x00\x88\x01\x01\x12\x18\n\x10thread_spec_name\x18\x02 \x01(\tB\x12\n\x10_child_thread_id\"\xc7\x02\n\x11WaitForThreadsRun\x12=\n\x07threads\x18\x01 \x03(\x0b\x32,.littlehorse.WaitForThreadsRun.WaitForThread\x12\x31\n\x06policy\x18\x02 \x01(\x0e\x32!.littlehorse.WaitForThreadsPolicy\x1a\xbf\x01\n\rWaitForThread\x12\x38\n\x0fthread_end_time\x18\x01 \x01(\x0b\x32\x1a.google.protobuf.TimestampH\x00\x88\x01\x01\x12,\n\rthread_status\x18\x02 \x01(\x0e\x32\x15.littlehorse.LHStatus\x12\x19\n\x11thread_run_number\x18\x03 \x01(\x05\x12\x17\n\x0f\x61lready_handled\x18\x05 \x01(\x08\x42\x12\n\x10_thread_end_time\"\xcb\x01\n\x10\x45xternalEventRun\x12\x1f\n\x17\x65xternal_event_def_name\x18\x01 \x01(\t\x12\x33\n\nevent_time\x18\x02 \x01(\x0b\x32\x1a.google.protobuf.TimestampH\x00\x88\x01\x01\x12<\n\x11\x65xternal_event_id\x18\x03 \x01(\x0b\x32\x1c.littlehorse.ExternalEventIdH\x01\x88\x01\x01\x42\r\n\x0b_event_timeB\x14\n\x12_external_event_id\"C\n\x0cSleepNodeRun\x12\x33\n\x0fmaturation_time\x18\x01 \x01(\x0b\x32\x1a.google.protobuf.Timestamp\"n\n\x07\x46\x61ilure\x12\x14\n\x0c\x66\x61ilure_name\x18\x01 \x01(\t\x12\x0f\n\x07message\x18\x02 \x01(\t\x12\x30\n\x07\x63ontent\x18\x03 \x01(\x0b\x32\x1a.littlehorse.VariableValueH\x00\x88\x01\x01\x42\n\n\x08_contentB,\n\x1fio.littlehorse.sdk.common.protoP\x01Z\x07.;modelb\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'node_run_pb2', _globals)
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n\037io.littlehorse.sdk.common.protoP\001Z\007.;model'
  _globals['_NODERUN']._serialized_start=118
  _globals['_NODERUN']._serialized_end=951
  _globals['_TASKNODERUN']._serialized_start=953
  _globals['_TASKNODERUN']._serialized_end=1032
  _globals['_USERTASKNODERUN']._serialized_start=1034
  _globals['_USERTASKNODERUN']._serialized_end=1131
  _globals['_ENTRYPOINTRUN']._serialized_start=1133
  _globals['_ENTRYPOINTRUN']._serialized_end=1148
  _globals['_EXITRUN']._serialized_start=1150
  _globals['_EXITRUN']._serialized_end=1159
  _globals['_STARTTHREADRUN']._serialized_start=1161
  _globals['_STARTTHREADRUN']._serialized_end=1253
  _globals['_WAITFORTHREADSRUN']._serialized_start=1256
  _globals['_WAITFORTHREADSRUN']._serialized_end=1583
  _globals['_WAITFORTHREADSRUN_WAITFORTHREAD']._serialized_start=1392
  _globals['_WAITFORTHREADSRUN_WAITFORTHREAD']._serialized_end=1583
  _globals['_EXTERNALEVENTRUN']._serialized_start=1586
  _globals['_EXTERNALEVENTRUN']._serialized_end=1789
  _globals['_SLEEPNODERUN']._serialized_start=1791
  _globals['_SLEEPNODERUN']._serialized_end=1858
  _globals['_FAILURE']._serialized_start=1860
  _globals['_FAILURE']._serialized_end=1970
# @@protoc_insertion_point(module_scope)
