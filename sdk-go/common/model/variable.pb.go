// Code generated by protoc-gen-go. DO NOT EDIT.
// versions:
// 	protoc-gen-go v1.31.0
// 	protoc        v4.23.4
// source: variable.proto

package model

import (
	protoreflect "google.golang.org/protobuf/reflect/protoreflect"
	protoimpl "google.golang.org/protobuf/runtime/protoimpl"
	timestamppb "google.golang.org/protobuf/types/known/timestamppb"
	reflect "reflect"
	sync "sync"
)

const (
	// Verify that this generated code is sufficiently up-to-date.
	_ = protoimpl.EnforceVersion(20 - protoimpl.MinVersion)
	// Verify that runtime/protoimpl is sufficiently up-to-date.
	_ = protoimpl.EnforceVersion(protoimpl.MaxVersion - 20)
)

type VariableValue struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	Type    VariableType `protobuf:"varint,1,opt,name=type,proto3,enum=littlehorse.VariableType" json:"type,omitempty"`
	JsonObj *string      `protobuf:"bytes,2,opt,name=json_obj,json=jsonObj,proto3,oneof" json:"json_obj,omitempty"`
	JsonArr *string      `protobuf:"bytes,3,opt,name=json_arr,json=jsonArr,proto3,oneof" json:"json_arr,omitempty"`
	Double  *float64     `protobuf:"fixed64,4,opt,name=double,proto3,oneof" json:"double,omitempty"`
	Bool    *bool        `protobuf:"varint,5,opt,name=bool,proto3,oneof" json:"bool,omitempty"`
	Str     *string      `protobuf:"bytes,6,opt,name=str,proto3,oneof" json:"str,omitempty"`
	Int     *int64       `protobuf:"varint,7,opt,name=int,proto3,oneof" json:"int,omitempty"`
	Bytes   []byte       `protobuf:"bytes,8,opt,name=bytes,proto3,oneof" json:"bytes,omitempty"`
}

func (x *VariableValue) Reset() {
	*x = VariableValue{}
	if protoimpl.UnsafeEnabled {
		mi := &file_variable_proto_msgTypes[0]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *VariableValue) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*VariableValue) ProtoMessage() {}

func (x *VariableValue) ProtoReflect() protoreflect.Message {
	mi := &file_variable_proto_msgTypes[0]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use VariableValue.ProtoReflect.Descriptor instead.
func (*VariableValue) Descriptor() ([]byte, []int) {
	return file_variable_proto_rawDescGZIP(), []int{0}
}

func (x *VariableValue) GetType() VariableType {
	if x != nil {
		return x.Type
	}
	return VariableType_JSON_OBJ
}

func (x *VariableValue) GetJsonObj() string {
	if x != nil && x.JsonObj != nil {
		return *x.JsonObj
	}
	return ""
}

func (x *VariableValue) GetJsonArr() string {
	if x != nil && x.JsonArr != nil {
		return *x.JsonArr
	}
	return ""
}

func (x *VariableValue) GetDouble() float64 {
	if x != nil && x.Double != nil {
		return *x.Double
	}
	return 0
}

func (x *VariableValue) GetBool() bool {
	if x != nil && x.Bool != nil {
		return *x.Bool
	}
	return false
}

func (x *VariableValue) GetStr() string {
	if x != nil && x.Str != nil {
		return *x.Str
	}
	return ""
}

func (x *VariableValue) GetInt() int64 {
	if x != nil && x.Int != nil {
		return *x.Int
	}
	return 0
}

func (x *VariableValue) GetBytes() []byte {
	if x != nil {
		return x.Bytes
	}
	return nil
}

type Variable struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	Value           *VariableValue         `protobuf:"bytes,1,opt,name=value,proto3" json:"value,omitempty"`
	WfRunId         string                 `protobuf:"bytes,2,opt,name=wf_run_id,json=wfRunId,proto3" json:"wf_run_id,omitempty"`
	ThreadRunNumber int32                  `protobuf:"varint,3,opt,name=thread_run_number,json=threadRunNumber,proto3" json:"thread_run_number,omitempty"`
	Name            string                 `protobuf:"bytes,4,opt,name=name,proto3" json:"name,omitempty"`
	Date            *timestamppb.Timestamp `protobuf:"bytes,5,opt,name=date,proto3" json:"date,omitempty"`
	WfSpecId        *WfSpecId              `protobuf:"bytes,6,opt,name=wf_spec_id,json=wfSpecId,proto3" json:"wf_spec_id,omitempty"`
}

func (x *Variable) Reset() {
	*x = Variable{}
	if protoimpl.UnsafeEnabled {
		mi := &file_variable_proto_msgTypes[1]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *Variable) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*Variable) ProtoMessage() {}

func (x *Variable) ProtoReflect() protoreflect.Message {
	mi := &file_variable_proto_msgTypes[1]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use Variable.ProtoReflect.Descriptor instead.
func (*Variable) Descriptor() ([]byte, []int) {
	return file_variable_proto_rawDescGZIP(), []int{1}
}

func (x *Variable) GetValue() *VariableValue {
	if x != nil {
		return x.Value
	}
	return nil
}

func (x *Variable) GetWfRunId() string {
	if x != nil {
		return x.WfRunId
	}
	return ""
}

func (x *Variable) GetThreadRunNumber() int32 {
	if x != nil {
		return x.ThreadRunNumber
	}
	return 0
}

func (x *Variable) GetName() string {
	if x != nil {
		return x.Name
	}
	return ""
}

func (x *Variable) GetDate() *timestamppb.Timestamp {
	if x != nil {
		return x.Date
	}
	return nil
}

func (x *Variable) GetWfSpecId() *WfSpecId {
	if x != nil {
		return x.WfSpecId
	}
	return nil
}

var File_variable_proto protoreflect.FileDescriptor

var file_variable_proto_rawDesc = []byte{
	0x0a, 0x0e, 0x76, 0x61, 0x72, 0x69, 0x61, 0x62, 0x6c, 0x65, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f,
	0x12, 0x0b, 0x6c, 0x69, 0x74, 0x74, 0x6c, 0x65, 0x68, 0x6f, 0x72, 0x73, 0x65, 0x1a, 0x1f, 0x67,
	0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2f, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x62, 0x75, 0x66, 0x2f, 0x74,
	0x69, 0x6d, 0x65, 0x73, 0x74, 0x61, 0x6d, 0x70, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x1a, 0x12,
	0x63, 0x6f, 0x6d, 0x6d, 0x6f, 0x6e, 0x5f, 0x65, 0x6e, 0x75, 0x6d, 0x73, 0x2e, 0x70, 0x72, 0x6f,
	0x74, 0x6f, 0x1a, 0x0f, 0x6f, 0x62, 0x6a, 0x65, 0x63, 0x74, 0x5f, 0x69, 0x64, 0x2e, 0x70, 0x72,
	0x6f, 0x74, 0x6f, 0x22, 0xc5, 0x02, 0x0a, 0x0d, 0x56, 0x61, 0x72, 0x69, 0x61, 0x62, 0x6c, 0x65,
	0x56, 0x61, 0x6c, 0x75, 0x65, 0x12, 0x2d, 0x0a, 0x04, 0x74, 0x79, 0x70, 0x65, 0x18, 0x01, 0x20,
	0x01, 0x28, 0x0e, 0x32, 0x19, 0x2e, 0x6c, 0x69, 0x74, 0x74, 0x6c, 0x65, 0x68, 0x6f, 0x72, 0x73,
	0x65, 0x2e, 0x56, 0x61, 0x72, 0x69, 0x61, 0x62, 0x6c, 0x65, 0x54, 0x79, 0x70, 0x65, 0x52, 0x04,
	0x74, 0x79, 0x70, 0x65, 0x12, 0x1e, 0x0a, 0x08, 0x6a, 0x73, 0x6f, 0x6e, 0x5f, 0x6f, 0x62, 0x6a,
	0x18, 0x02, 0x20, 0x01, 0x28, 0x09, 0x48, 0x00, 0x52, 0x07, 0x6a, 0x73, 0x6f, 0x6e, 0x4f, 0x62,
	0x6a, 0x88, 0x01, 0x01, 0x12, 0x1e, 0x0a, 0x08, 0x6a, 0x73, 0x6f, 0x6e, 0x5f, 0x61, 0x72, 0x72,
	0x18, 0x03, 0x20, 0x01, 0x28, 0x09, 0x48, 0x01, 0x52, 0x07, 0x6a, 0x73, 0x6f, 0x6e, 0x41, 0x72,
	0x72, 0x88, 0x01, 0x01, 0x12, 0x1b, 0x0a, 0x06, 0x64, 0x6f, 0x75, 0x62, 0x6c, 0x65, 0x18, 0x04,
	0x20, 0x01, 0x28, 0x01, 0x48, 0x02, 0x52, 0x06, 0x64, 0x6f, 0x75, 0x62, 0x6c, 0x65, 0x88, 0x01,
	0x01, 0x12, 0x17, 0x0a, 0x04, 0x62, 0x6f, 0x6f, 0x6c, 0x18, 0x05, 0x20, 0x01, 0x28, 0x08, 0x48,
	0x03, 0x52, 0x04, 0x62, 0x6f, 0x6f, 0x6c, 0x88, 0x01, 0x01, 0x12, 0x15, 0x0a, 0x03, 0x73, 0x74,
	0x72, 0x18, 0x06, 0x20, 0x01, 0x28, 0x09, 0x48, 0x04, 0x52, 0x03, 0x73, 0x74, 0x72, 0x88, 0x01,
	0x01, 0x12, 0x15, 0x0a, 0x03, 0x69, 0x6e, 0x74, 0x18, 0x07, 0x20, 0x01, 0x28, 0x03, 0x48, 0x05,
	0x52, 0x03, 0x69, 0x6e, 0x74, 0x88, 0x01, 0x01, 0x12, 0x19, 0x0a, 0x05, 0x62, 0x79, 0x74, 0x65,
	0x73, 0x18, 0x08, 0x20, 0x01, 0x28, 0x0c, 0x48, 0x06, 0x52, 0x05, 0x62, 0x79, 0x74, 0x65, 0x73,
	0x88, 0x01, 0x01, 0x42, 0x0b, 0x0a, 0x09, 0x5f, 0x6a, 0x73, 0x6f, 0x6e, 0x5f, 0x6f, 0x62, 0x6a,
	0x42, 0x0b, 0x0a, 0x09, 0x5f, 0x6a, 0x73, 0x6f, 0x6e, 0x5f, 0x61, 0x72, 0x72, 0x42, 0x09, 0x0a,
	0x07, 0x5f, 0x64, 0x6f, 0x75, 0x62, 0x6c, 0x65, 0x42, 0x07, 0x0a, 0x05, 0x5f, 0x62, 0x6f, 0x6f,
	0x6c, 0x42, 0x06, 0x0a, 0x04, 0x5f, 0x73, 0x74, 0x72, 0x42, 0x06, 0x0a, 0x04, 0x5f, 0x69, 0x6e,
	0x74, 0x42, 0x08, 0x0a, 0x06, 0x5f, 0x62, 0x79, 0x74, 0x65, 0x73, 0x22, 0xfd, 0x01, 0x0a, 0x08,
	0x56, 0x61, 0x72, 0x69, 0x61, 0x62, 0x6c, 0x65, 0x12, 0x30, 0x0a, 0x05, 0x76, 0x61, 0x6c, 0x75,
	0x65, 0x18, 0x01, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x1a, 0x2e, 0x6c, 0x69, 0x74, 0x74, 0x6c, 0x65,
	0x68, 0x6f, 0x72, 0x73, 0x65, 0x2e, 0x56, 0x61, 0x72, 0x69, 0x61, 0x62, 0x6c, 0x65, 0x56, 0x61,
	0x6c, 0x75, 0x65, 0x52, 0x05, 0x76, 0x61, 0x6c, 0x75, 0x65, 0x12, 0x1a, 0x0a, 0x09, 0x77, 0x66,
	0x5f, 0x72, 0x75, 0x6e, 0x5f, 0x69, 0x64, 0x18, 0x02, 0x20, 0x01, 0x28, 0x09, 0x52, 0x07, 0x77,
	0x66, 0x52, 0x75, 0x6e, 0x49, 0x64, 0x12, 0x2a, 0x0a, 0x11, 0x74, 0x68, 0x72, 0x65, 0x61, 0x64,
	0x5f, 0x72, 0x75, 0x6e, 0x5f, 0x6e, 0x75, 0x6d, 0x62, 0x65, 0x72, 0x18, 0x03, 0x20, 0x01, 0x28,
	0x05, 0x52, 0x0f, 0x74, 0x68, 0x72, 0x65, 0x61, 0x64, 0x52, 0x75, 0x6e, 0x4e, 0x75, 0x6d, 0x62,
	0x65, 0x72, 0x12, 0x12, 0x0a, 0x04, 0x6e, 0x61, 0x6d, 0x65, 0x18, 0x04, 0x20, 0x01, 0x28, 0x09,
	0x52, 0x04, 0x6e, 0x61, 0x6d, 0x65, 0x12, 0x2e, 0x0a, 0x04, 0x64, 0x61, 0x74, 0x65, 0x18, 0x05,
	0x20, 0x01, 0x28, 0x0b, 0x32, 0x1a, 0x2e, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2e, 0x70, 0x72,
	0x6f, 0x74, 0x6f, 0x62, 0x75, 0x66, 0x2e, 0x54, 0x69, 0x6d, 0x65, 0x73, 0x74, 0x61, 0x6d, 0x70,
	0x52, 0x04, 0x64, 0x61, 0x74, 0x65, 0x12, 0x33, 0x0a, 0x0a, 0x77, 0x66, 0x5f, 0x73, 0x70, 0x65,
	0x63, 0x5f, 0x69, 0x64, 0x18, 0x06, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x15, 0x2e, 0x6c, 0x69, 0x74,
	0x74, 0x6c, 0x65, 0x68, 0x6f, 0x72, 0x73, 0x65, 0x2e, 0x57, 0x66, 0x53, 0x70, 0x65, 0x63, 0x49,
	0x64, 0x52, 0x08, 0x77, 0x66, 0x53, 0x70, 0x65, 0x63, 0x49, 0x64, 0x42, 0x2c, 0x0a, 0x1f, 0x69,
	0x6f, 0x2e, 0x6c, 0x69, 0x74, 0x74, 0x6c, 0x65, 0x68, 0x6f, 0x72, 0x73, 0x65, 0x2e, 0x73, 0x64,
	0x6b, 0x2e, 0x63, 0x6f, 0x6d, 0x6d, 0x6f, 0x6e, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x50, 0x01,
	0x5a, 0x07, 0x2e, 0x3b, 0x6d, 0x6f, 0x64, 0x65, 0x6c, 0x62, 0x06, 0x70, 0x72, 0x6f, 0x74, 0x6f,
	0x33,
}

var (
	file_variable_proto_rawDescOnce sync.Once
	file_variable_proto_rawDescData = file_variable_proto_rawDesc
)

func file_variable_proto_rawDescGZIP() []byte {
	file_variable_proto_rawDescOnce.Do(func() {
		file_variable_proto_rawDescData = protoimpl.X.CompressGZIP(file_variable_proto_rawDescData)
	})
	return file_variable_proto_rawDescData
}

var file_variable_proto_msgTypes = make([]protoimpl.MessageInfo, 2)
var file_variable_proto_goTypes = []interface{}{
	(*VariableValue)(nil),         // 0: littlehorse.VariableValue
	(*Variable)(nil),              // 1: littlehorse.Variable
	(VariableType)(0),             // 2: littlehorse.VariableType
	(*timestamppb.Timestamp)(nil), // 3: google.protobuf.Timestamp
	(*WfSpecId)(nil),              // 4: littlehorse.WfSpecId
}
var file_variable_proto_depIdxs = []int32{
	2, // 0: littlehorse.VariableValue.type:type_name -> littlehorse.VariableType
	0, // 1: littlehorse.Variable.value:type_name -> littlehorse.VariableValue
	3, // 2: littlehorse.Variable.date:type_name -> google.protobuf.Timestamp
	4, // 3: littlehorse.Variable.wf_spec_id:type_name -> littlehorse.WfSpecId
	4, // [4:4] is the sub-list for method output_type
	4, // [4:4] is the sub-list for method input_type
	4, // [4:4] is the sub-list for extension type_name
	4, // [4:4] is the sub-list for extension extendee
	0, // [0:4] is the sub-list for field type_name
}

func init() { file_variable_proto_init() }
func file_variable_proto_init() {
	if File_variable_proto != nil {
		return
	}
	file_common_enums_proto_init()
	file_object_id_proto_init()
	if !protoimpl.UnsafeEnabled {
		file_variable_proto_msgTypes[0].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*VariableValue); i {
			case 0:
				return &v.state
			case 1:
				return &v.sizeCache
			case 2:
				return &v.unknownFields
			default:
				return nil
			}
		}
		file_variable_proto_msgTypes[1].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*Variable); i {
			case 0:
				return &v.state
			case 1:
				return &v.sizeCache
			case 2:
				return &v.unknownFields
			default:
				return nil
			}
		}
	}
	file_variable_proto_msgTypes[0].OneofWrappers = []interface{}{}
	type x struct{}
	out := protoimpl.TypeBuilder{
		File: protoimpl.DescBuilder{
			GoPackagePath: reflect.TypeOf(x{}).PkgPath(),
			RawDescriptor: file_variable_proto_rawDesc,
			NumEnums:      0,
			NumMessages:   2,
			NumExtensions: 0,
			NumServices:   0,
		},
		GoTypes:           file_variable_proto_goTypes,
		DependencyIndexes: file_variable_proto_depIdxs,
		MessageInfos:      file_variable_proto_msgTypes,
	}.Build()
	File_variable_proto = out.File
	file_variable_proto_rawDesc = nil
	file_variable_proto_goTypes = nil
	file_variable_proto_depIdxs = nil
}
