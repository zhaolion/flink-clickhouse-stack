// Code generated by protoc-gen-go. DO NOT EDIT.
// versions:
// 	protoc-gen-go v1.28.1
// 	protoc        v3.21.4
// source: user_duration_event.proto

package event

import (
	protoreflect "google.golang.org/protobuf/reflect/protoreflect"
	protoimpl "google.golang.org/protobuf/runtime/protoimpl"
	reflect "reflect"
	sync "sync"
)

const (
	// Verify that this generated code is sufficiently up-to-date.
	_ = protoimpl.EnforceVersion(20 - protoimpl.MinVersion)
	// Verify that runtime/protoimpl is sufficiently up-to-date.
	_ = protoimpl.EnforceVersion(protoimpl.MaxVersion - 20)
)

type UserDurationEvent struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	Id          string `protobuf:"bytes,1,opt,name=id,proto3" json:"id,omitempty"`
	EventAtNs   int64  `protobuf:"varint,2,opt,name=event_at_ns,json=eventAtNs,proto3" json:"event_at_ns,omitempty"`
	DurationSec int32  `protobuf:"varint,3,opt,name=duration_sec,json=durationSec,proto3" json:"duration_sec,omitempty"`
	UserId      uint64 `protobuf:"varint,4,opt,name=user_id,json=userId,proto3" json:"user_id,omitempty"`
}

func (x *UserDurationEvent) Reset() {
	*x = UserDurationEvent{}
	if protoimpl.UnsafeEnabled {
		mi := &file_user_duration_event_proto_msgTypes[0]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *UserDurationEvent) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*UserDurationEvent) ProtoMessage() {}

func (x *UserDurationEvent) ProtoReflect() protoreflect.Message {
	mi := &file_user_duration_event_proto_msgTypes[0]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use UserDurationEvent.ProtoReflect.Descriptor instead.
func (*UserDurationEvent) Descriptor() ([]byte, []int) {
	return file_user_duration_event_proto_rawDescGZIP(), []int{0}
}

func (x *UserDurationEvent) GetId() string {
	if x != nil {
		return x.Id
	}
	return ""
}

func (x *UserDurationEvent) GetEventAtNs() int64 {
	if x != nil {
		return x.EventAtNs
	}
	return 0
}

func (x *UserDurationEvent) GetDurationSec() int32 {
	if x != nil {
		return x.DurationSec
	}
	return 0
}

func (x *UserDurationEvent) GetUserId() uint64 {
	if x != nil {
		return x.UserId
	}
	return 0
}

var File_user_duration_event_proto protoreflect.FileDescriptor

var file_user_duration_event_proto_rawDesc = []byte{
	0x0a, 0x19, 0x75, 0x73, 0x65, 0x72, 0x5f, 0x64, 0x75, 0x72, 0x61, 0x74, 0x69, 0x6f, 0x6e, 0x5f,
	0x65, 0x76, 0x65, 0x6e, 0x74, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x12, 0x05, 0x65, 0x76, 0x65,
	0x6e, 0x74, 0x22, 0x7f, 0x0a, 0x11, 0x55, 0x73, 0x65, 0x72, 0x44, 0x75, 0x72, 0x61, 0x74, 0x69,
	0x6f, 0x6e, 0x45, 0x76, 0x65, 0x6e, 0x74, 0x12, 0x0e, 0x0a, 0x02, 0x69, 0x64, 0x18, 0x01, 0x20,
	0x01, 0x28, 0x09, 0x52, 0x02, 0x69, 0x64, 0x12, 0x1e, 0x0a, 0x0b, 0x65, 0x76, 0x65, 0x6e, 0x74,
	0x5f, 0x61, 0x74, 0x5f, 0x6e, 0x73, 0x18, 0x02, 0x20, 0x01, 0x28, 0x03, 0x52, 0x09, 0x65, 0x76,
	0x65, 0x6e, 0x74, 0x41, 0x74, 0x4e, 0x73, 0x12, 0x21, 0x0a, 0x0c, 0x64, 0x75, 0x72, 0x61, 0x74,
	0x69, 0x6f, 0x6e, 0x5f, 0x73, 0x65, 0x63, 0x18, 0x03, 0x20, 0x01, 0x28, 0x05, 0x52, 0x0b, 0x64,
	0x75, 0x72, 0x61, 0x74, 0x69, 0x6f, 0x6e, 0x53, 0x65, 0x63, 0x12, 0x17, 0x0a, 0x07, 0x75, 0x73,
	0x65, 0x72, 0x5f, 0x69, 0x64, 0x18, 0x04, 0x20, 0x01, 0x28, 0x04, 0x52, 0x06, 0x75, 0x73, 0x65,
	0x72, 0x49, 0x64, 0x42, 0x77, 0x0a, 0x29, 0x63, 0x6f, 0x6d, 0x2e, 0x7a, 0x68, 0x61, 0x6f, 0x6c,
	0x69, 0x6f, 0x6e, 0x2e, 0x66, 0x6c, 0x69, 0x6e, 0x6b, 0x5f, 0x63, 0x6c, 0x69, 0x63, 0x6b, 0x68,
	0x6f, 0x75, 0x73, 0x65, 0x5f, 0x73, 0x74, 0x61, 0x63, 0x6b, 0x2e, 0x65, 0x76, 0x65, 0x6e, 0x74,
	0x42, 0x16, 0x55, 0x73, 0x65, 0x72, 0x44, 0x75, 0x72, 0x61, 0x74, 0x69, 0x6f, 0x6e, 0x45, 0x76,
	0x65, 0x6e, 0x74, 0x50, 0x72, 0x6f, 0x74, 0x6f, 0x50, 0x01, 0x5a, 0x30, 0x67, 0x69, 0x74, 0x68,
	0x75, 0x62, 0x2e, 0x63, 0x6f, 0x6d, 0x2f, 0x7a, 0x68, 0x61, 0x6f, 0x6c, 0x69, 0x6f, 0x6e, 0x2f,
	0x66, 0x6c, 0x69, 0x6e, 0x6b, 0x2d, 0x63, 0x6c, 0x69, 0x63, 0x6b, 0x68, 0x6f, 0x75, 0x73, 0x65,
	0x2d, 0x73, 0x74, 0x61, 0x63, 0x6b, 0x2f, 0x65, 0x76, 0x65, 0x6e, 0x74, 0x62, 0x06, 0x70, 0x72,
	0x6f, 0x74, 0x6f, 0x33,
}

var (
	file_user_duration_event_proto_rawDescOnce sync.Once
	file_user_duration_event_proto_rawDescData = file_user_duration_event_proto_rawDesc
)

func file_user_duration_event_proto_rawDescGZIP() []byte {
	file_user_duration_event_proto_rawDescOnce.Do(func() {
		file_user_duration_event_proto_rawDescData = protoimpl.X.CompressGZIP(file_user_duration_event_proto_rawDescData)
	})
	return file_user_duration_event_proto_rawDescData
}

var file_user_duration_event_proto_msgTypes = make([]protoimpl.MessageInfo, 1)
var file_user_duration_event_proto_goTypes = []interface{}{
	(*UserDurationEvent)(nil), // 0: event.UserDurationEvent
}
var file_user_duration_event_proto_depIdxs = []int32{
	0, // [0:0] is the sub-list for method output_type
	0, // [0:0] is the sub-list for method input_type
	0, // [0:0] is the sub-list for extension type_name
	0, // [0:0] is the sub-list for extension extendee
	0, // [0:0] is the sub-list for field type_name
}

func init() { file_user_duration_event_proto_init() }
func file_user_duration_event_proto_init() {
	if File_user_duration_event_proto != nil {
		return
	}
	if !protoimpl.UnsafeEnabled {
		file_user_duration_event_proto_msgTypes[0].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*UserDurationEvent); i {
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
	type x struct{}
	out := protoimpl.TypeBuilder{
		File: protoimpl.DescBuilder{
			GoPackagePath: reflect.TypeOf(x{}).PkgPath(),
			RawDescriptor: file_user_duration_event_proto_rawDesc,
			NumEnums:      0,
			NumMessages:   1,
			NumExtensions: 0,
			NumServices:   0,
		},
		GoTypes:           file_user_duration_event_proto_goTypes,
		DependencyIndexes: file_user_duration_event_proto_depIdxs,
		MessageInfos:      file_user_duration_event_proto_msgTypes,
	}.Build()
	File_user_duration_event_proto = out.File
	file_user_duration_event_proto_rawDesc = nil
	file_user_duration_event_proto_goTypes = nil
	file_user_duration_event_proto_depIdxs = nil
}
