/*
 * Copyright 2019 The gRPC Authors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.grpc.xds.sds;

import static com.google.common.truth.Truth.assertThat;

import io.grpc.ManagedChannel;
import io.grpc.netty.NettyChannelBuilder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

/**
 * Unit tests for {@link XdsChannelBuilder}.
 */
@RunWith(JUnit4.class)
public class XdsChannelBuilderTest {

  @Test
  public void buildsXdsChannelBuilder() {
    XdsChannelBuilder builder = XdsChannelBuilder.forTarget("localhost:8080");
    assertThat(builder).isNotNull();
    assertThat(builder.delegate()).isInstanceOf(NettyChannelBuilder.class);
    ManagedChannel channel = builder.build();
    assertThat(channel).isNotNull();
  }
}
