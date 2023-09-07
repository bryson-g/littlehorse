# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: common_wfspec.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
from google.protobuf.internal import builder as _builder
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


import littlehorse.model.common_enums_pb2 as common__enums__pb2
import littlehorse.model.variable_pb2 as variable__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n\x13\x63ommon_wfspec.proto\x12\x0blittlehorse\x1a\x12\x63ommon_enums.proto\x1a\x0evariable.proto\"\xc9\x02\n\x12VariableAssignment\x12\x16\n\tjson_path\x18\x01 \x01(\tH\x01\x88\x01\x01\x12\x17\n\rvariable_name\x18\x02 \x01(\tH\x00\x12\x33\n\rliteral_value\x18\x03 \x01(\x0b\x32\x1a.littlehorse.VariableValueH\x00\x12\x45\n\rformat_string\x18\x04 \x01(\x0b\x32,.littlehorse.VariableAssignment.FormatStringH\x00\x1an\n\x0c\x46ormatString\x12/\n\x06\x66ormat\x18\x01 \x01(\x0b\x32\x1f.littlehorse.VariableAssignment\x12-\n\x04\x61rgs\x18\x02 \x03(\x0b\x32\x1f.littlehorse.VariableAssignmentB\x08\n\x06sourceB\x0c\n\n_json_path\"\x85\x03\n\x10VariableMutation\x12\x10\n\x08lhs_name\x18\x01 \x01(\t\x12\x1a\n\rlhs_json_path\x18\x02 \x01(\tH\x01\x88\x01\x01\x12\x34\n\toperation\x18\x03 \x01(\x0e\x32!.littlehorse.VariableMutationType\x12:\n\x0fsource_variable\x18\x04 \x01(\x0b\x32\x1f.littlehorse.VariableAssignmentH\x00\x12\x33\n\rliteral_value\x18\x05 \x01(\x0b\x32\x1a.littlehorse.VariableValueH\x00\x12\x45\n\x0bnode_output\x18\x06 \x01(\x0b\x32..littlehorse.VariableMutation.NodeOutputSourceH\x00\x1a\x36\n\x10NodeOutputSource\x12\x15\n\x08jsonpath\x18\n \x01(\tH\x00\x88\x01\x01\x42\x0b\n\t_jsonpathB\x0b\n\trhs_valueB\x10\n\x0e_lhs_json_path\"\xe5\x01\n\x0bVariableDef\x12\'\n\x04type\x18\x01 \x01(\x0e\x32\x19.littlehorse.VariableType\x12\x0c\n\x04name\x18\x02 \x01(\t\x12/\n\nindex_type\x18\x03 \x01(\x0e\x32\x16.littlehorse.IndexTypeH\x00\x88\x01\x01\x12,\n\x0cjson_indexes\x18\x04 \x03(\x0b\x32\x16.littlehorse.JsonIndex\x12\x31\n\rdefault_value\x18\x05 \x01(\x0b\x32\x1a.littlehorse.VariableValueB\r\n\x0b_index_type\"E\n\tJsonIndex\x12\x0c\n\x04path\x18\x01 \x01(\t\x12*\n\nindex_type\x18\x02 \x01(\x0e\x32\x16.littlehorse.IndexType\"\xdb\x04\n\x0fUTActionTrigger\x12\x34\n\x04task\x18\x01 \x01(\x0b\x32$.littlehorse.UTActionTrigger.UTATaskH\x00\x12\x38\n\x06\x63\x61ncel\x18\x02 \x01(\x0b\x32&.littlehorse.UTActionTrigger.UTACancelH\x00\x12<\n\x08reassign\x18\x03 \x01(\x0b\x32(.littlehorse.UTActionTrigger.UTAReassignH\x00\x12\x36\n\rdelay_seconds\x18\x05 \x01(\x0b\x32\x1f.littlehorse.VariableAssignment\x12\x31\n\x04hook\x18\x06 \x01(\x0e\x32#.littlehorse.UTActionTrigger.UTHook\x1a\x0b\n\tUTACancel\x1a`\n\x07UTATask\x12#\n\x04task\x18\x01 \x01(\x0b\x32\x15.littlehorse.TaskNode\x12\x30\n\tmutations\x18\x02 \x03(\x0b\x32\x1d.littlehorse.VariableMutation\x1a\x85\x01\n\x0bUTAReassign\x12\x32\n\x07user_id\x18\x01 \x01(\x0b\x32\x1f.littlehorse.VariableAssignmentH\x00\x12\x35\n\nuser_group\x18\x02 \x01(\x0b\x32\x1f.littlehorse.VariableAssignmentH\x00\x42\x0b\n\tassign_to\".\n\x06UTHook\x12\x0e\n\nON_ARRIVAL\x10\x00\x12\x14\n\x10ON_TASK_ASSIGNED\x10\x01\x42\x08\n\x06\x61\x63tion\"\x7f\n\x08TaskNode\x12\x15\n\rtask_def_name\x18\x01 \x01(\t\x12\x17\n\x0ftimeout_seconds\x18\x02 \x01(\x05\x12\x0f\n\x07retries\x18\x03 \x01(\x05\x12\x32\n\tvariables\x18\x04 \x03(\x0b\x32\x1f.littlehorse.VariableAssignment*\x98\x01\n\x14VariableMutationType\x12\n\n\x06\x41SSIGN\x10\x00\x12\x07\n\x03\x41\x44\x44\x10\x01\x12\n\n\x06\x45XTEND\x10\x02\x12\x0c\n\x08SUBTRACT\x10\x03\x12\x0c\n\x08MULTIPLY\x10\x04\x12\n\n\x06\x44IVIDE\x10\x05\x12\x15\n\x11REMOVE_IF_PRESENT\x10\x06\x12\x10\n\x0cREMOVE_INDEX\x10\x07\x12\x0e\n\nREMOVE_KEY\x10\x08*.\n\tIndexType\x12\x0f\n\x0bLOCAL_INDEX\x10\x00\x12\x10\n\x0cREMOTE_INDEX\x10\x01*\x84\x01\n\nComparator\x12\r\n\tLESS_THAN\x10\x00\x12\x10\n\x0cGREATER_THAN\x10\x01\x12\x10\n\x0cLESS_THAN_EQ\x10\x02\x12\x13\n\x0fGREATER_THAN_EQ\x10\x03\x12\n\n\x06\x45QUALS\x10\x04\x12\x0e\n\nNOT_EQUALS\x10\x05\x12\x06\n\x02IN\x10\x06\x12\n\n\x06NOT_IN\x10\x07\x42,\n\x1fio.littlehorse.sdk.common.protoP\x01Z\x07.;modelb\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'common_wfspec_pb2', _globals)
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n\037io.littlehorse.sdk.common.protoP\001Z\007.;model'
  _globals['_VARIABLEMUTATIONTYPE']._serialized_start=1835
  _globals['_VARIABLEMUTATIONTYPE']._serialized_end=1987
  _globals['_INDEXTYPE']._serialized_start=1989
  _globals['_INDEXTYPE']._serialized_end=2035
  _globals['_COMPARATOR']._serialized_start=2038
  _globals['_COMPARATOR']._serialized_end=2170
  _globals['_VARIABLEASSIGNMENT']._serialized_start=73
  _globals['_VARIABLEASSIGNMENT']._serialized_end=402
  _globals['_VARIABLEASSIGNMENT_FORMATSTRING']._serialized_start=268
  _globals['_VARIABLEASSIGNMENT_FORMATSTRING']._serialized_end=378
  _globals['_VARIABLEMUTATION']._serialized_start=405
  _globals['_VARIABLEMUTATION']._serialized_end=794
  _globals['_VARIABLEMUTATION_NODEOUTPUTSOURCE']._serialized_start=709
  _globals['_VARIABLEMUTATION_NODEOUTPUTSOURCE']._serialized_end=763
  _globals['_VARIABLEDEF']._serialized_start=797
  _globals['_VARIABLEDEF']._serialized_end=1026
  _globals['_JSONINDEX']._serialized_start=1028
  _globals['_JSONINDEX']._serialized_end=1097
  _globals['_UTACTIONTRIGGER']._serialized_start=1100
  _globals['_UTACTIONTRIGGER']._serialized_end=1703
  _globals['_UTACTIONTRIGGER_UTACANCEL']._serialized_start=1400
  _globals['_UTACTIONTRIGGER_UTACANCEL']._serialized_end=1411
  _globals['_UTACTIONTRIGGER_UTATASK']._serialized_start=1413
  _globals['_UTACTIONTRIGGER_UTATASK']._serialized_end=1509
  _globals['_UTACTIONTRIGGER_UTAREASSIGN']._serialized_start=1512
  _globals['_UTACTIONTRIGGER_UTAREASSIGN']._serialized_end=1645
  _globals['_UTACTIONTRIGGER_UTHOOK']._serialized_start=1647
  _globals['_UTACTIONTRIGGER_UTHOOK']._serialized_end=1693
  _globals['_TASKNODE']._serialized_start=1705
  _globals['_TASKNODE']._serialized_end=1832
# @@protoc_insertion_point(module_scope)