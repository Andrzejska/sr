// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: messages.proto

package messages;

public final class MessagesProto {
  private MessagesProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_calculator_ListenRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_calculator_ListenRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_calculator_Message_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_calculator_Message_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\016messages.proto\022\ncalculator\"/\n\rListenRe" +
      "quest\022\036\n\004type\030\001 \001(\0162\020.calculator.Type\"\032\n" +
      "\007Message\022\017\n\007message\030\001 \001(\t*\032\n\004Type\022\010\n\004New" +
      "s\020\000\022\010\n\004Work\020\0012Y\n\017MessagesService\022F\n\020list" +
      "enToMessages\022\031.calculator.ListenRequest\032" +
      "\023.calculator.Message\"\0000\001B\033\n\010messagesB\rMe" +
      "ssagesProtoP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_calculator_ListenRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_calculator_ListenRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_calculator_ListenRequest_descriptor,
        new java.lang.String[] { "Type", });
    internal_static_calculator_Message_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_calculator_Message_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_calculator_Message_descriptor,
        new java.lang.String[] { "Message", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
