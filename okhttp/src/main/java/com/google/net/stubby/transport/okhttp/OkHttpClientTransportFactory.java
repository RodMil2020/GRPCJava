package com.google.net.stubby.transport.okhttp;

import com.google.common.base.Preconditions;
import com.google.net.stubby.transport.ClientTransport;
import com.google.net.stubby.transport.ClientTransportFactory;

import java.net.InetSocketAddress;
import java.util.concurrent.ExecutorService;

/**
 * Factory that manufactures instances of {@link OkHttpClientTransport}.
 */
class OkHttpClientTransportFactory implements ClientTransportFactory {
  private final InetSocketAddress address;
  private final ExecutorService executor;

  public OkHttpClientTransportFactory(InetSocketAddress address, ExecutorService executor) {
    this.address = Preconditions.checkNotNull(address, "address");
    this.executor = Preconditions.checkNotNull(executor, "executor");
  }

  @Override
  public ClientTransport newClientTransport() {
    return new OkHttpClientTransport(address, executor);
  }

}
