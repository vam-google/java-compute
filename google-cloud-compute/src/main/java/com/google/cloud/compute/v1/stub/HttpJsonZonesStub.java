/*
 * Copyright 2021 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.cloud.compute.v1.stub;

import static com.google.cloud.compute.v1.ZonesClient.ListPagedResponse;

import com.google.api.client.http.HttpMethods;
import com.google.api.core.BetaApi;
import com.google.api.core.InternalApi;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.core.BackgroundResourceAggregation;
import com.google.api.gax.httpjson.ApiMethodDescriptor;
import com.google.api.gax.httpjson.FieldsExtractor;
import com.google.api.gax.httpjson.HttpJsonCallSettings;
import com.google.api.gax.httpjson.HttpJsonStubCallableFactory;
import com.google.api.gax.httpjson.ProtoMessageRequestFormatter;
import com.google.api.gax.httpjson.ProtoMessageResponseParser;
import com.google.api.gax.httpjson.ProtoRestSerializer;
import com.google.api.gax.rpc.ClientContext;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.cloud.compute.v1.GetZoneRequest;
import com.google.cloud.compute.v1.ListZonesRequest;
import com.google.cloud.compute.v1.Zone;
import com.google.cloud.compute.v1.ZoneList;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/**
 * REST stub implementation for the Zones service API.
 *
 * <p>This class is for advanced usage and reflects the underlying API directly.
 */
@Generated("by gapic-generator-java")
@BetaApi("A restructuring of stub classes is planned, so this may break in the future")
public class HttpJsonZonesStub extends ZonesStub {
  private static final ApiMethodDescriptor<GetZoneRequest, Zone> getMethodDescriptor =
      ApiMethodDescriptor.<GetZoneRequest, Zone>newBuilder()
          .setFullMethodName("google.cloud.compute.v1.Zones/Get")
          .setHttpMethod(HttpMethods.GET)
          .setRequestFormatter(
              ProtoMessageRequestFormatter.<GetZoneRequest>newBuilder()
                  .setPath(
                      "/compute/v1/projects/{project}/zones/{zone}",
                      new FieldsExtractor<GetZoneRequest, Map<String, String>>() {
                        @Override
                        public Map<String, String> extract(GetZoneRequest request) {
                          Map<String, String> fields = new HashMap<>();
                          ProtoRestSerializer<GetZoneRequest> serializer =
                              ProtoRestSerializer.create();
                          serializer.putPathParam(fields, "project", request.getProject());
                          serializer.putPathParam(fields, "zone", request.getZone());
                          return fields;
                        }
                      })
                  .setQueryParamsExtractor(
                      new FieldsExtractor<GetZoneRequest, Map<String, List<String>>>() {
                        @Override
                        public Map<String, List<String>> extract(GetZoneRequest request) {
                          Map<String, List<String>> fields = new HashMap<>();
                          ProtoRestSerializer<GetZoneRequest> serializer =
                              ProtoRestSerializer.create();
                          return fields;
                        }
                      })
                  .setRequestBodyExtractor(
                      new FieldsExtractor<GetZoneRequest, String>() {
                        @Override
                        public String extract(GetZoneRequest request) {
                          return null;
                        }
                      })
                  .build())
          .setResponseParser(
              ProtoMessageResponseParser.<Zone>newBuilder()
                  .setDefaultInstance(Zone.getDefaultInstance())
                  .build())
          .build();

  private static final ApiMethodDescriptor<ListZonesRequest, ZoneList> listMethodDescriptor =
      ApiMethodDescriptor.<ListZonesRequest, ZoneList>newBuilder()
          .setFullMethodName("google.cloud.compute.v1.Zones/List")
          .setHttpMethod(HttpMethods.GET)
          .setRequestFormatter(
              ProtoMessageRequestFormatter.<ListZonesRequest>newBuilder()
                  .setPath(
                      "/compute/v1/projects/{project}/zones",
                      new FieldsExtractor<ListZonesRequest, Map<String, String>>() {
                        @Override
                        public Map<String, String> extract(ListZonesRequest request) {
                          Map<String, String> fields = new HashMap<>();
                          ProtoRestSerializer<ListZonesRequest> serializer =
                              ProtoRestSerializer.create();
                          serializer.putPathParam(fields, "project", request.getProject());
                          return fields;
                        }
                      })
                  .setQueryParamsExtractor(
                      new FieldsExtractor<ListZonesRequest, Map<String, List<String>>>() {
                        @Override
                        public Map<String, List<String>> extract(ListZonesRequest request) {
                          Map<String, List<String>> fields = new HashMap<>();
                          ProtoRestSerializer<ListZonesRequest> serializer =
                              ProtoRestSerializer.create();
                          if (request.hasFilter()) {
                            serializer.putQueryParam(fields, "filter", request.getFilter());
                          }
                          if (request.hasMaxResults()) {
                            serializer.putQueryParam(fields, "maxResults", request.getMaxResults());
                          }
                          if (request.hasOrderBy()) {
                            serializer.putQueryParam(fields, "orderBy", request.getOrderBy());
                          }
                          if (request.hasPageToken()) {
                            serializer.putQueryParam(fields, "pageToken", request.getPageToken());
                          }
                          if (request.hasReturnPartialSuccess()) {
                            serializer.putQueryParam(
                                fields, "returnPartialSuccess", request.getReturnPartialSuccess());
                          }
                          return fields;
                        }
                      })
                  .setRequestBodyExtractor(
                      new FieldsExtractor<ListZonesRequest, String>() {
                        @Override
                        public String extract(ListZonesRequest request) {
                          return null;
                        }
                      })
                  .build())
          .setResponseParser(
              ProtoMessageResponseParser.<ZoneList>newBuilder()
                  .setDefaultInstance(ZoneList.getDefaultInstance())
                  .build())
          .build();

  private final UnaryCallable<GetZoneRequest, Zone> getCallable;
  private final UnaryCallable<ListZonesRequest, ZoneList> listCallable;
  private final UnaryCallable<ListZonesRequest, ListPagedResponse> listPagedCallable;

  private final BackgroundResource backgroundResources;
  private final HttpJsonStubCallableFactory callableFactory;

  public static final HttpJsonZonesStub create(ZonesStubSettings settings) throws IOException {
    return new HttpJsonZonesStub(settings, ClientContext.create(settings));
  }

  public static final HttpJsonZonesStub create(ClientContext clientContext) throws IOException {
    return new HttpJsonZonesStub(ZonesStubSettings.newBuilder().build(), clientContext);
  }

  public static final HttpJsonZonesStub create(
      ClientContext clientContext, HttpJsonStubCallableFactory callableFactory) throws IOException {
    return new HttpJsonZonesStub(
        ZonesStubSettings.newBuilder().build(), clientContext, callableFactory);
  }

  /**
   * Constructs an instance of HttpJsonZonesStub, using the given settings. This is protected so
   * that it is easy to make a subclass, but otherwise, the static factory methods should be
   * preferred.
   */
  protected HttpJsonZonesStub(ZonesStubSettings settings, ClientContext clientContext)
      throws IOException {
    this(settings, clientContext, new HttpJsonZonesCallableFactory());
  }

  /**
   * Constructs an instance of HttpJsonZonesStub, using the given settings. This is protected so
   * that it is easy to make a subclass, but otherwise, the static factory methods should be
   * preferred.
   */
  protected HttpJsonZonesStub(
      ZonesStubSettings settings,
      ClientContext clientContext,
      HttpJsonStubCallableFactory callableFactory)
      throws IOException {
    this.callableFactory = callableFactory;

    HttpJsonCallSettings<GetZoneRequest, Zone> getTransportSettings =
        HttpJsonCallSettings.<GetZoneRequest, Zone>newBuilder()
            .setMethodDescriptor(getMethodDescriptor)
            .build();
    HttpJsonCallSettings<ListZonesRequest, ZoneList> listTransportSettings =
        HttpJsonCallSettings.<ListZonesRequest, ZoneList>newBuilder()
            .setMethodDescriptor(listMethodDescriptor)
            .build();

    this.getCallable =
        callableFactory.createUnaryCallable(
            getTransportSettings, settings.getSettings(), clientContext);
    this.listCallable =
        callableFactory.createUnaryCallable(
            listTransportSettings, settings.listSettings(), clientContext);
    this.listPagedCallable =
        callableFactory.createPagedCallable(
            listTransportSettings, settings.listSettings(), clientContext);

    this.backgroundResources =
        new BackgroundResourceAggregation(clientContext.getBackgroundResources());
  }

  @InternalApi
  public static List<ApiMethodDescriptor> getMethodDescriptors() {
    List<ApiMethodDescriptor> methodDescriptors = new ArrayList<>();
    methodDescriptors.add(getMethodDescriptor);
    methodDescriptors.add(listMethodDescriptor);
    return methodDescriptors;
  }

  @Override
  public UnaryCallable<GetZoneRequest, Zone> getCallable() {
    return getCallable;
  }

  @Override
  public UnaryCallable<ListZonesRequest, ZoneList> listCallable() {
    return listCallable;
  }

  @Override
  public UnaryCallable<ListZonesRequest, ListPagedResponse> listPagedCallable() {
    return listPagedCallable;
  }

  @Override
  public final void close() {
    shutdown();
  }

  @Override
  public void shutdown() {
    backgroundResources.shutdown();
  }

  @Override
  public boolean isShutdown() {
    return backgroundResources.isShutdown();
  }

  @Override
  public boolean isTerminated() {
    return backgroundResources.isTerminated();
  }

  @Override
  public void shutdownNow() {
    backgroundResources.shutdownNow();
  }

  @Override
  public boolean awaitTermination(long duration, TimeUnit unit) throws InterruptedException {
    return backgroundResources.awaitTermination(duration, unit);
  }
}
