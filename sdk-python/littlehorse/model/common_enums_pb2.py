# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: common_enums.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
from google.protobuf.internal import builder as _builder
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()




DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n\x12\x63ommon_enums.proto\x12\x0blittlehorse*g\n\x08LHStatus\x12\x0c\n\x08STARTING\x10\x00\x12\x0b\n\x07RUNNING\x10\x01\x12\r\n\tCOMPLETED\x10\x02\x12\x0b\n\x07HALTING\x10\x03\x12\n\n\x06HALTED\x10\x04\x12\t\n\x05\x45RROR\x10\x05\x12\r\n\tEXCEPTION\x10\x06*\xbc\x01\n\nTaskStatus\x12\x12\n\x0eTASK_SCHEDULED\x10\x00\x12\x10\n\x0cTASK_RUNNING\x10\x01\x12\x10\n\x0cTASK_SUCCESS\x10\x02\x12\x0f\n\x0bTASK_FAILED\x10\x03\x12\x10\n\x0cTASK_TIMEOUT\x10\x04\x12!\n\x1dTASK_OUTPUT_SERIALIZING_ERROR\x10\x05\x12\x1c\n\x18TASK_INPUT_VAR_SUB_ERROR\x10\x06\x12\x12\n\x0eTASK_CANCELLED\x10\x07*=\n\x13MetricsWindowLength\x12\r\n\tMINUTES_5\x10\x00\x12\x0b\n\x07HOURS_2\x10\x01\x12\n\n\x06\x44\x41YS_1\x10\x02*g\n\x0cVariableType\x12\x0c\n\x08JSON_OBJ\x10\x00\x12\x0c\n\x08JSON_ARR\x10\x01\x12\n\n\x06\x44OUBLE\x10\x02\x12\x08\n\x04\x42OOL\x10\x03\x12\x07\n\x03STR\x10\x04\x12\x07\n\x03INT\x10\x05\x12\t\n\x05\x42YTES\x10\x06\x12\x08\n\x04NULL\x10\x07*D\n\x14WaitForThreadsPolicy\x12\x17\n\x13WAIT_FOR_COMPLETION\x10\x00\x12\x13\n\x0fSTOP_ON_FAILURE\x10\x01\x42,\n\x1fio.littlehorse.sdk.common.protoP\x01Z\x07.;modelb\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'common_enums_pb2', _globals)
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n\037io.littlehorse.sdk.common.protoP\001Z\007.;model'
  _globals['_LHSTATUS']._serialized_start=35
  _globals['_LHSTATUS']._serialized_end=138
  _globals['_TASKSTATUS']._serialized_start=141
  _globals['_TASKSTATUS']._serialized_end=329
  _globals['_METRICSWINDOWLENGTH']._serialized_start=331
  _globals['_METRICSWINDOWLENGTH']._serialized_end=392
  _globals['_VARIABLETYPE']._serialized_start=394
  _globals['_VARIABLETYPE']._serialized_end=497
  _globals['_WAITFORTHREADSPOLICY']._serialized_start=499
  _globals['_WAITFORTHREADSPOLICY']._serialized_end=567
# @@protoc_insertion_point(module_scope)