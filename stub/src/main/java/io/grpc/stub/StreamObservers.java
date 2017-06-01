/*
 * Copyright 2015, gRPC Authors All rights reserved.
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

package io.grpc.stub;

import com.google.common.base.Preconditions;
import io.grpc.ExperimentalApi;
import java.util.Iterator;

/**
 * Utility functions for working with {@link StreamObserver} and it's common subclasses like
 * {@link CallStreamObserver}.
 */
@ExperimentalApi
public final class StreamObservers {
  /**
   * Copy the values of an {@link Iterator} to the target {@link CallStreamObserver} while properly
   * accounting for outbound flow-control.
   *
   * <p>For clients this method is safe to call inside {@link ClientResponseObserver#beforeStart},
   * on servers it is safe to call inside the service method implementation.
   * </p>
   *
   * @param source of values expressed as an {@link Iterator}.
   * @param target {@link CallStreamObserver} which accepts values from the source.
   */
  public static <V> void copyWithFlowControl(final Iterator<V> source,
      final CallStreamObserver<V> target) {
    Preconditions.checkNotNull(source, "source");
    Preconditions.checkNotNull(target, "target");
    target.setOnReadyHandler(new Runnable() {
      @Override
      public void run() {
        while (target.isReady() && source.hasNext()) {
          target.onNext(source.next());
        }
        if (!source.hasNext()) {
          target.onCompleted();
        }
      }
    });
  }

  /**
   * Copy the values of an {@link Iterable} to the target {@link CallStreamObserver} while properly
   * accounting for outbound flow-control.
   *
   * <p>For clients this method is safe to call inside {@link ClientResponseObserver#beforeStart},
   * on servers it is safe to call inside the service method implementation.
   * </p>
   *
   * @param source of values expressed as an {@link Iterable}.
   * @param target {@link CallStreamObserver} which accepts values from the source.
   */
  public static <V> void copyWithFlowControl(final Iterable<V> source,
      CallStreamObserver<V> target) {
    Preconditions.checkNotNull(source, "source");
    copyWithFlowControl(source.iterator(), target);
  }
}
