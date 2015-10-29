// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: load_balancer.proto

package io.grpc.grpclb;

public final class LoadBalancerProto {
  private LoadBalancerProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  static com.google.protobuf.Descriptors.Descriptor
    internal_static_grpc_lb_v1_LoadBalanceRequest_descriptor;
  static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_grpc_lb_v1_LoadBalanceRequest_fieldAccessorTable;
  static com.google.protobuf.Descriptors.Descriptor
    internal_static_grpc_lb_v1_InitialLoadBalanceRequest_descriptor;
  static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_grpc_lb_v1_InitialLoadBalanceRequest_fieldAccessorTable;
  static com.google.protobuf.Descriptors.Descriptor
    internal_static_grpc_lb_v1_ClientStats_descriptor;
  static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_grpc_lb_v1_ClientStats_fieldAccessorTable;
  static com.google.protobuf.Descriptors.Descriptor
    internal_static_grpc_lb_v1_LoadBalanceResponse_descriptor;
  static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_grpc_lb_v1_LoadBalanceResponse_fieldAccessorTable;
  static com.google.protobuf.Descriptors.Descriptor
    internal_static_grpc_lb_v1_InitialLoadBalanceResponse_descriptor;
  static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_grpc_lb_v1_InitialLoadBalanceResponse_fieldAccessorTable;
  static com.google.protobuf.Descriptors.Descriptor
    internal_static_grpc_lb_v1_ServerList_descriptor;
  static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_grpc_lb_v1_ServerList_fieldAccessorTable;
  static com.google.protobuf.Descriptors.Descriptor
    internal_static_grpc_lb_v1_Server_descriptor;
  static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_grpc_lb_v1_Server_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\023load_balancer.proto\022\ngrpc.lb.v1\032\036googl" +
      "e/protobuf/duration.proto\"\244\001\n\022LoadBalanc" +
      "eRequest\022@\n\017initial_request\030\001 \001(\0132%.grpc" +
      ".lb.v1.InitialLoadBalanceRequestH\000\022/\n\014cl" +
      "ient_stats\030\002 \001(\0132\027.grpc.lb.v1.ClientStat" +
      "sH\000B\033\n\031load_balance_request_type\")\n\031Init" +
      "ialLoadBalanceRequest\022\014\n\004name\030\001 \001(\t\"Z\n\013C" +
      "lientStats\022\026\n\016total_requests\030\001 \001(\003\022\031\n\021cl" +
      "ient_rpc_errors\030\002 \001(\003\022\030\n\020dropped_request" +
      "s\030\003 \001(\003\"\246\001\n\023LoadBalanceResponse\022B\n\020initi",
      "al_response\030\001 \001(\0132&.grpc.lb.v1.InitialLo" +
      "adBalanceResponseH\000\022-\n\013server_list\030\002 \001(\013" +
      "2\026.grpc.lb.v1.ServerListH\000B\034\n\032load_balan" +
      "ce_response_type\"\230\001\n\032InitialLoadBalanceR" +
      "esponse\022 \n\026load_balancer_delegate\030\002 \001(\tH" +
      "\000\022?\n\034client_stats_report_interval\030\003 \001(\0132" +
      "\031.google.protobuf.DurationB\027\n\025initial_re" +
      "sponse_type\"i\n\nServerList\022#\n\007servers\030\001 \003" +
      "(\0132\022.grpc.lb.v1.Server\0226\n\023expiration_int" +
      "erval\030\003 \001(\0132\031.google.protobuf.Duration\"\\",
      "\n\006Server\022\022\n\nip_address\030\001 \001(\t\022\014\n\004port\030\002 \001" +
      "(\005\022\032\n\022load_balance_token\030\003 \001(\t\022\024\n\014drop_r" +
      "equest\030\004 \001(\0102b\n\014LoadBalancer\022R\n\013BalanceL" +
      "oad\022\036.grpc.lb.v1.LoadBalanceRequest\032\037.gr" +
      "pc.lb.v1.LoadBalanceResponse(\0010\001B%\n\016io.g" +
      "rpc.grpclbB\021LoadBalancerProtoP\001b\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.DurationProto.getDescriptor(),
        }, assigner);
    internal_static_grpc_lb_v1_LoadBalanceRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_grpc_lb_v1_LoadBalanceRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_grpc_lb_v1_LoadBalanceRequest_descriptor,
        new java.lang.String[] { "InitialRequest", "ClientStats", "LoadBalanceRequestType", });
    internal_static_grpc_lb_v1_InitialLoadBalanceRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_grpc_lb_v1_InitialLoadBalanceRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_grpc_lb_v1_InitialLoadBalanceRequest_descriptor,
        new java.lang.String[] { "Name", });
    internal_static_grpc_lb_v1_ClientStats_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_grpc_lb_v1_ClientStats_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_grpc_lb_v1_ClientStats_descriptor,
        new java.lang.String[] { "TotalRequests", "ClientRpcErrors", "DroppedRequests", });
    internal_static_grpc_lb_v1_LoadBalanceResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_grpc_lb_v1_LoadBalanceResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_grpc_lb_v1_LoadBalanceResponse_descriptor,
        new java.lang.String[] { "InitialResponse", "ServerList", "LoadBalanceResponseType", });
    internal_static_grpc_lb_v1_InitialLoadBalanceResponse_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_grpc_lb_v1_InitialLoadBalanceResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_grpc_lb_v1_InitialLoadBalanceResponse_descriptor,
        new java.lang.String[] { "LoadBalancerDelegate", "ClientStatsReportInterval", "InitialResponseType", });
    internal_static_grpc_lb_v1_ServerList_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_grpc_lb_v1_ServerList_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_grpc_lb_v1_ServerList_descriptor,
        new java.lang.String[] { "Servers", "ExpirationInterval", });
    internal_static_grpc_lb_v1_Server_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_grpc_lb_v1_Server_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_grpc_lb_v1_Server_descriptor,
        new java.lang.String[] { "IpAddress", "Port", "LoadBalanceToken", "DropRequest", });
    com.google.protobuf.DurationProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
