from google.protobuf import timestamp_pb2 as _timestamp_pb2
import littlehorse.model.object_id_pb2 as _object_id_pb2
import littlehorse.model.common_enums_pb2 as _common_enums_pb2
from google.protobuf.internal import containers as _containers
from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from typing import ClassVar as _ClassVar, Iterable as _Iterable, Mapping as _Mapping, Optional as _Optional, Union as _Union

DESCRIPTOR: _descriptor.FileDescriptor

class VariableValue(_message.Message):
    __slots__ = ["json_obj", "json_arr", "double", "bool", "str", "int", "bytes", "struct"]
    JSON_OBJ_FIELD_NUMBER: _ClassVar[int]
    JSON_ARR_FIELD_NUMBER: _ClassVar[int]
    DOUBLE_FIELD_NUMBER: _ClassVar[int]
    BOOL_FIELD_NUMBER: _ClassVar[int]
    STR_FIELD_NUMBER: _ClassVar[int]
    INT_FIELD_NUMBER: _ClassVar[int]
    BYTES_FIELD_NUMBER: _ClassVar[int]
    STRUCT_FIELD_NUMBER: _ClassVar[int]
    json_obj: str
    json_arr: str
    double: float
    bool: bool
    str: str
    int: int
    bytes: bytes
    struct: Struct
    def __init__(self, json_obj: _Optional[str] = ..., json_arr: _Optional[str] = ..., double: _Optional[float] = ..., bool: bool = ..., str: _Optional[str] = ..., int: _Optional[int] = ..., bytes: _Optional[bytes] = ..., struct: _Optional[_Union[Struct, _Mapping]] = ...) -> None: ...

class Variable(_message.Message):
    __slots__ = ["id", "value", "created_at", "wf_spec_id", "masked"]
    ID_FIELD_NUMBER: _ClassVar[int]
    VALUE_FIELD_NUMBER: _ClassVar[int]
    CREATED_AT_FIELD_NUMBER: _ClassVar[int]
    WF_SPEC_ID_FIELD_NUMBER: _ClassVar[int]
    MASKED_FIELD_NUMBER: _ClassVar[int]
    id: _object_id_pb2.VariableId
    value: VariableValue
    created_at: _timestamp_pb2.Timestamp
    wf_spec_id: _object_id_pb2.WfSpecId
    masked: bool
    def __init__(self, id: _Optional[_Union[_object_id_pb2.VariableId, _Mapping]] = ..., value: _Optional[_Union[VariableValue, _Mapping]] = ..., created_at: _Optional[_Union[_timestamp_pb2.Timestamp, _Mapping]] = ..., wf_spec_id: _Optional[_Union[_object_id_pb2.WfSpecId, _Mapping]] = ..., masked: bool = ...) -> None: ...

class Struct(_message.Message):
    __slots__ = ["schema_id", "struct"]
    SCHEMA_ID_FIELD_NUMBER: _ClassVar[int]
    STRUCT_FIELD_NUMBER: _ClassVar[int]
    schema_id: _object_id_pb2.SchemaId
    struct: InlineStruct
    def __init__(self, schema_id: _Optional[_Union[_object_id_pb2.SchemaId, _Mapping]] = ..., struct: _Optional[_Union[InlineStruct, _Mapping]] = ...) -> None: ...

class InlineStruct(_message.Message):
    __slots__ = ["fields"]
    FIELDS_FIELD_NUMBER: _ClassVar[int]
    fields: _containers.RepeatedCompositeFieldContainer[StructField]
    def __init__(self, fields: _Optional[_Iterable[_Union[StructField, _Mapping]]] = ...) -> None: ...

class StructField(_message.Message):
    __slots__ = ["primitive", "struct", "list"]
    class FieldList(_message.Message):
        __slots__ = ["fields"]
        FIELDS_FIELD_NUMBER: _ClassVar[int]
        fields: _containers.RepeatedCompositeFieldContainer[StructField]
        def __init__(self, fields: _Optional[_Iterable[_Union[StructField, _Mapping]]] = ...) -> None: ...
    PRIMITIVE_FIELD_NUMBER: _ClassVar[int]
    STRUCT_FIELD_NUMBER: _ClassVar[int]
    LIST_FIELD_NUMBER: _ClassVar[int]
    primitive: VariableValue
    struct: InlineStruct
    list: StructField.FieldList
    def __init__(self, primitive: _Optional[_Union[VariableValue, _Mapping]] = ..., struct: _Optional[_Union[InlineStruct, _Mapping]] = ..., list: _Optional[_Union[StructField.FieldList, _Mapping]] = ...) -> None: ...

class SchemaField(_message.Message):
    __slots__ = ["name", "optional", "primitive", "schema_id", "inline_schema"]
    NAME_FIELD_NUMBER: _ClassVar[int]
    OPTIONAL_FIELD_NUMBER: _ClassVar[int]
    PRIMITIVE_FIELD_NUMBER: _ClassVar[int]
    SCHEMA_ID_FIELD_NUMBER: _ClassVar[int]
    INLINE_SCHEMA_FIELD_NUMBER: _ClassVar[int]
    name: str
    optional: bool
    primitive: _common_enums_pb2.PrimitiveType
    schema_id: _object_id_pb2.SchemaId
    inline_schema: InlineSchema
    def __init__(self, name: _Optional[str] = ..., optional: bool = ..., primitive: _Optional[_Union[_common_enums_pb2.PrimitiveType, str]] = ..., schema_id: _Optional[_Union[_object_id_pb2.SchemaId, _Mapping]] = ..., inline_schema: _Optional[_Union[InlineSchema, _Mapping]] = ...) -> None: ...

class Schema(_message.Message):
    __slots__ = ["id", "description", "schema"]
    ID_FIELD_NUMBER: _ClassVar[int]
    DESCRIPTION_FIELD_NUMBER: _ClassVar[int]
    SCHEMA_FIELD_NUMBER: _ClassVar[int]
    id: _object_id_pb2.SchemaId
    description: str
    schema: InlineSchema
    def __init__(self, id: _Optional[_Union[_object_id_pb2.SchemaId, _Mapping]] = ..., description: _Optional[str] = ..., schema: _Optional[_Union[InlineSchema, _Mapping]] = ...) -> None: ...

class InlineSchema(_message.Message):
    __slots__ = ["fields"]
    FIELDS_FIELD_NUMBER: _ClassVar[int]
    fields: _containers.RepeatedCompositeFieldContainer[SchemaField]
    def __init__(self, fields: _Optional[_Iterable[_Union[SchemaField, _Mapping]]] = ...) -> None: ...
