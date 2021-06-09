/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.google.cloud.compute.v1.stub;

import static com.google.cloud.compute.v1.RegionTargetHttpsProxiesClient.ListPagedResponse;

import com.google.api.core.ApiFunction;
import com.google.api.core.ApiFuture;
import com.google.api.core.BetaApi;
import com.google.api.gax.core.GaxProperties;
import com.google.api.gax.core.GoogleCredentialsProvider;
import com.google.api.gax.core.InstantiatingExecutorProvider;
import com.google.api.gax.httpjson.GaxHttpJsonProperties;
import com.google.api.gax.httpjson.HttpJsonTransportChannel;
import com.google.api.gax.httpjson.InstantiatingHttpJsonChannelProvider;
import com.google.api.gax.retrying.RetrySettings;
import com.google.api.gax.rpc.ApiCallContext;
import com.google.api.gax.rpc.ApiClientHeaderProvider;
import com.google.api.gax.rpc.ClientContext;
import com.google.api.gax.rpc.PageContext;
import com.google.api.gax.rpc.PagedCallSettings;
import com.google.api.gax.rpc.PagedListDescriptor;
import com.google.api.gax.rpc.PagedListResponseFactory;
import com.google.api.gax.rpc.StatusCode;
import com.google.api.gax.rpc.StubSettings;
import com.google.api.gax.rpc.TransportChannelProvider;
import com.google.api.gax.rpc.UnaryCallSettings;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.cloud.compute.v1.DeleteRegionTargetHttpsProxyRequest;
import com.google.cloud.compute.v1.GetRegionTargetHttpsProxyRequest;
import com.google.cloud.compute.v1.InsertRegionTargetHttpsProxyRequest;
import com.google.cloud.compute.v1.ListRegionTargetHttpsProxiesRequest;
import com.google.cloud.compute.v1.Operation;
import com.google.cloud.compute.v1.SetSslCertificatesRegionTargetHttpsProxyRequest;
import com.google.cloud.compute.v1.SetUrlMapRegionTargetHttpsProxyRequest;
import com.google.cloud.compute.v1.TargetHttpsProxy;
import com.google.cloud.compute.v1.TargetHttpsProxyList;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import java.io.IOException;
import java.util.List;
import javax.annotation.Generated;
import org.threeten.bp.Duration;

// AUTO-GENERATED DOCUMENTATION AND CLASS
/**
 * Settings class to configure an instance of {@link RegionTargetHttpsProxiesStub}.
 *
 * <p>The default instance has everything set to sensible defaults:
 *
 * <ul>
 *   <li>The default service address (compute.googleapis.com) and default port (443) are used.
 *   <li>Credentials are acquired automatically through Application Default Credentials.
 *   <li>Retries are configured for idempotent methods but not for non-idempotent methods.
 * </ul>
 *
 * <p>The builder of this class is recursive, so contained classes are themselves builders. When
 * build() is called, the tree of builders is called to create the complete settings object.
 *
 * <p>For example, to set the total timeout of delete to 30 seconds:
 *
 * <pre>
 * <code>
 * RegionTargetHttpsProxiesStubSettings.Builder regionTargetHttpsProxiesSettingsBuilder =
 *     RegionTargetHttpsProxiesStubSettings.newBuilder();
 * regionTargetHttpsProxiesSettingsBuilder
 *     .deleteSettings()
 *     .setRetrySettings(
 *         regionTargetHttpsProxiesSettingsBuilder.deleteSettings().getRetrySettings().toBuilder()
 *             .setTotalTimeout(Duration.ofSeconds(30))
 *             .build());
 * RegionTargetHttpsProxiesStubSettings regionTargetHttpsProxiesSettings = regionTargetHttpsProxiesSettingsBuilder.build();
 * </code>
 * </pre>
 */
@Generated("by gapic-generator")
@BetaApi
public class RegionTargetHttpsProxiesStubSettings
    extends StubSettings<RegionTargetHttpsProxiesStubSettings> {
  /** The default scopes of the service. */
  private static final ImmutableList<String> DEFAULT_SERVICE_SCOPES =
      ImmutableList.<String>builder()
          .add("https://www.googleapis.com/auth/cloud-platform")
          .add("https://www.googleapis.com/auth/compute")
          .add("https://www.googleapis.com/auth/compute.readonly")
          .build();

  private final UnaryCallSettings<DeleteRegionTargetHttpsProxyRequest, Operation> deleteSettings;
  private final UnaryCallSettings<GetRegionTargetHttpsProxyRequest, TargetHttpsProxy> getSettings;
  private final UnaryCallSettings<InsertRegionTargetHttpsProxyRequest, Operation> insertSettings;
  private final PagedCallSettings<
          ListRegionTargetHttpsProxiesRequest, TargetHttpsProxyList, ListPagedResponse>
      listSettings;
  private final UnaryCallSettings<SetSslCertificatesRegionTargetHttpsProxyRequest, Operation>
      setSslCertificatesSettings;
  private final UnaryCallSettings<SetUrlMapRegionTargetHttpsProxyRequest, Operation>
      setUrlMapSettings;

  /** Returns the object with the settings used for calls to delete. */
  public UnaryCallSettings<DeleteRegionTargetHttpsProxyRequest, Operation> deleteSettings() {
    return deleteSettings;
  }

  /** Returns the object with the settings used for calls to get. */
  public UnaryCallSettings<GetRegionTargetHttpsProxyRequest, TargetHttpsProxy> getSettings() {
    return getSettings;
  }

  /** Returns the object with the settings used for calls to insert. */
  public UnaryCallSettings<InsertRegionTargetHttpsProxyRequest, Operation> insertSettings() {
    return insertSettings;
  }

  /** Returns the object with the settings used for calls to list. */
  public PagedCallSettings<
          ListRegionTargetHttpsProxiesRequest, TargetHttpsProxyList, ListPagedResponse>
      listSettings() {
    return listSettings;
  }

  /** Returns the object with the settings used for calls to setSslCertificates. */
  public UnaryCallSettings<SetSslCertificatesRegionTargetHttpsProxyRequest, Operation>
      setSslCertificatesSettings() {
    return setSslCertificatesSettings;
  }

  /** Returns the object with the settings used for calls to setUrlMap. */
  public UnaryCallSettings<SetUrlMapRegionTargetHttpsProxyRequest, Operation> setUrlMapSettings() {
    return setUrlMapSettings;
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public RegionTargetHttpsProxiesStub createStub() throws IOException {
    if (getTransportChannelProvider()
        .getTransportName()
        .equals(HttpJsonTransportChannel.getHttpJsonTransportName())) {
      return HttpJsonRegionTargetHttpsProxiesStub.create(this);
    } else {
      throw new UnsupportedOperationException(
          "Transport not supported: " + getTransportChannelProvider().getTransportName());
    }
  }

  /** Returns a builder for the default ExecutorProvider for this service. */
  public static InstantiatingExecutorProvider.Builder defaultExecutorProviderBuilder() {
    return InstantiatingExecutorProvider.newBuilder();
  }

  /** Returns the default service endpoint. */
  public static String getDefaultEndpoint() {
    return "compute.googleapis.com";
  }

  /** Returns the default service port. */
  public static int getDefaultServicePort() {
    return 443;
  }

  /** Returns the default service scopes. */
  public static List<String> getDefaultServiceScopes() {
    return DEFAULT_SERVICE_SCOPES;
  }

  /** Returns a builder for the default credentials for this service. */
  public static GoogleCredentialsProvider.Builder defaultCredentialsProviderBuilder() {
    return GoogleCredentialsProvider.newBuilder().setScopesToApply(DEFAULT_SERVICE_SCOPES);
  }

  /** Returns a builder for the default ChannelProvider for this service. */
  public static InstantiatingHttpJsonChannelProvider.Builder
      defaultHttpJsonTransportProviderBuilder() {
    return InstantiatingHttpJsonChannelProvider.newBuilder();
  }

  public static TransportChannelProvider defaultTransportChannelProvider() {
    return defaultHttpJsonTransportProviderBuilder().build();
  }

  @BetaApi("The surface for customizing headers is not stable yet and may change in the future.")
  public static ApiClientHeaderProvider.Builder defaultApiClientHeaderProviderBuilder() {
    return ApiClientHeaderProvider.newBuilder()
        .setGeneratedLibToken(
            "gapic", GaxProperties.getLibraryVersion(RegionTargetHttpsProxiesStubSettings.class))
        .setTransportToken(
            GaxHttpJsonProperties.getHttpJsonTokenName(),
            GaxHttpJsonProperties.getHttpJsonVersion());
  }

  /** Returns a new builder for this class. */
  public static Builder newBuilder() {
    return Builder.createDefault();
  }

  /** Returns a new builder for this class. */
  public static Builder newBuilder(ClientContext clientContext) {
    return new Builder(clientContext);
  }

  /** Returns a builder containing all the values of this settings class. */
  public Builder toBuilder() {
    return new Builder(this);
  }

  protected RegionTargetHttpsProxiesStubSettings(Builder settingsBuilder) throws IOException {
    super(settingsBuilder);

    deleteSettings = settingsBuilder.deleteSettings().build();
    getSettings = settingsBuilder.getSettings().build();
    insertSettings = settingsBuilder.insertSettings().build();
    listSettings = settingsBuilder.listSettings().build();
    setSslCertificatesSettings = settingsBuilder.setSslCertificatesSettings().build();
    setUrlMapSettings = settingsBuilder.setUrlMapSettings().build();
  }

  private static final PagedListDescriptor<
          ListRegionTargetHttpsProxiesRequest, TargetHttpsProxyList, TargetHttpsProxy>
      LIST_PAGE_STR_DESC =
          new PagedListDescriptor<
              ListRegionTargetHttpsProxiesRequest, TargetHttpsProxyList, TargetHttpsProxy>() {
            @Override
            public String emptyToken() {
              return "";
            }

            @Override
            public ListRegionTargetHttpsProxiesRequest injectToken(
                ListRegionTargetHttpsProxiesRequest payload, String token) {
              return ListRegionTargetHttpsProxiesRequest.newBuilder(payload)
                  .setPageToken(token)
                  .build();
            }

            @Override
            public ListRegionTargetHttpsProxiesRequest injectPageSize(
                ListRegionTargetHttpsProxiesRequest payload, int pageSize) {
              return ListRegionTargetHttpsProxiesRequest.newBuilder(payload)
                  .setMaxResults(pageSize)
                  .build();
            }

            @Override
            public Integer extractPageSize(ListRegionTargetHttpsProxiesRequest payload) {
              return payload.getMaxResults();
            }

            @Override
            public String extractNextToken(TargetHttpsProxyList payload) {
              return payload.getNextPageToken();
            }

            @Override
            public Iterable<TargetHttpsProxy> extractResources(TargetHttpsProxyList payload) {
              return payload.getItemsList() != null
                  ? payload.getItemsList()
                  : ImmutableList.<TargetHttpsProxy>of();
            }
          };

  private static final PagedListResponseFactory<
          ListRegionTargetHttpsProxiesRequest, TargetHttpsProxyList, ListPagedResponse>
      LIST_PAGE_STR_FACT =
          new PagedListResponseFactory<
              ListRegionTargetHttpsProxiesRequest, TargetHttpsProxyList, ListPagedResponse>() {
            @Override
            public ApiFuture<ListPagedResponse> getFuturePagedResponse(
                UnaryCallable<ListRegionTargetHttpsProxiesRequest, TargetHttpsProxyList> callable,
                ListRegionTargetHttpsProxiesRequest request,
                ApiCallContext context,
                ApiFuture<TargetHttpsProxyList> futureResponse) {
              PageContext<
                      ListRegionTargetHttpsProxiesRequest, TargetHttpsProxyList, TargetHttpsProxy>
                  pageContext = PageContext.create(callable, LIST_PAGE_STR_DESC, request, context);
              return ListPagedResponse.createAsync(pageContext, futureResponse);
            }
          };

  /** Builder for RegionTargetHttpsProxiesStubSettings. */
  public static class Builder
      extends StubSettings.Builder<RegionTargetHttpsProxiesStubSettings, Builder> {
    private final ImmutableList<UnaryCallSettings.Builder<?, ?>> unaryMethodSettingsBuilders;

    private final UnaryCallSettings.Builder<DeleteRegionTargetHttpsProxyRequest, Operation>
        deleteSettings;
    private final UnaryCallSettings.Builder<GetRegionTargetHttpsProxyRequest, TargetHttpsProxy>
        getSettings;
    private final UnaryCallSettings.Builder<InsertRegionTargetHttpsProxyRequest, Operation>
        insertSettings;
    private final PagedCallSettings.Builder<
            ListRegionTargetHttpsProxiesRequest, TargetHttpsProxyList, ListPagedResponse>
        listSettings;
    private final UnaryCallSettings.Builder<
            SetSslCertificatesRegionTargetHttpsProxyRequest, Operation>
        setSslCertificatesSettings;
    private final UnaryCallSettings.Builder<SetUrlMapRegionTargetHttpsProxyRequest, Operation>
        setUrlMapSettings;

    private static final ImmutableMap<String, ImmutableSet<StatusCode.Code>>
        RETRYABLE_CODE_DEFINITIONS;

    static {
      ImmutableMap.Builder<String, ImmutableSet<StatusCode.Code>> definitions =
          ImmutableMap.builder();
      definitions.put(
          "idempotent",
          ImmutableSet.copyOf(
              Lists.<StatusCode.Code>newArrayList(
                  StatusCode.Code.DEADLINE_EXCEEDED, StatusCode.Code.UNAVAILABLE)));
      definitions.put("non_idempotent", ImmutableSet.copyOf(Lists.<StatusCode.Code>newArrayList()));
      RETRYABLE_CODE_DEFINITIONS = definitions.build();
    }

    private static final ImmutableMap<String, RetrySettings> RETRY_PARAM_DEFINITIONS;

    static {
      ImmutableMap.Builder<String, RetrySettings> definitions = ImmutableMap.builder();
      RetrySettings settings = null;
      settings =
          RetrySettings.newBuilder()
              .setInitialRetryDelay(Duration.ofMillis(100L))
              .setRetryDelayMultiplier(1.3)
              .setMaxRetryDelay(Duration.ofMillis(60000L))
              .setInitialRpcTimeout(Duration.ofMillis(20000L))
              .setRpcTimeoutMultiplier(1.0)
              .setMaxRpcTimeout(Duration.ofMillis(20000L))
              .setTotalTimeout(Duration.ofMillis(600000L))
              .build();
      definitions.put("default", settings);
      RETRY_PARAM_DEFINITIONS = definitions.build();
    }

    protected Builder() {
      this((ClientContext) null);
    }

    protected Builder(ClientContext clientContext) {
      super(clientContext);

      deleteSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();

      getSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();

      insertSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();

      listSettings = PagedCallSettings.newBuilder(LIST_PAGE_STR_FACT);

      setSslCertificatesSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();

      setUrlMapSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();

      unaryMethodSettingsBuilders =
          ImmutableList.<UnaryCallSettings.Builder<?, ?>>of(
              deleteSettings,
              getSettings,
              insertSettings,
              listSettings,
              setSslCertificatesSettings,
              setUrlMapSettings);

      initDefaults(this);
    }

    private static Builder createDefault() {
      Builder builder = new Builder((ClientContext) null);
      builder.setTransportChannelProvider(defaultTransportChannelProvider());
      builder.setCredentialsProvider(defaultCredentialsProviderBuilder().build());
      builder.setInternalHeaderProvider(defaultApiClientHeaderProviderBuilder().build());
      builder.setEndpoint(getDefaultEndpoint());
      return initDefaults(builder);
    }

    private static Builder initDefaults(Builder builder) {

      builder
          .deleteSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("non_idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder
          .getSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder
          .insertSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("non_idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder
          .listSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder
          .setSslCertificatesSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("non_idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder
          .setUrlMapSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("non_idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      return builder;
    }

    protected Builder(RegionTargetHttpsProxiesStubSettings settings) {
      super(settings);

      deleteSettings = settings.deleteSettings.toBuilder();
      getSettings = settings.getSettings.toBuilder();
      insertSettings = settings.insertSettings.toBuilder();
      listSettings = settings.listSettings.toBuilder();
      setSslCertificatesSettings = settings.setSslCertificatesSettings.toBuilder();
      setUrlMapSettings = settings.setUrlMapSettings.toBuilder();

      unaryMethodSettingsBuilders =
          ImmutableList.<UnaryCallSettings.Builder<?, ?>>of(
              deleteSettings,
              getSettings,
              insertSettings,
              listSettings,
              setSslCertificatesSettings,
              setUrlMapSettings);
    }

    // NEXT_MAJOR_VER: remove 'throws Exception'
    /**
     * Applies the given settings updater function to all of the unary API methods in this service.
     *
     * <p>Note: This method does not support applying settings to streaming methods.
     */
    public Builder applyToAllUnaryMethods(
        ApiFunction<UnaryCallSettings.Builder<?, ?>, Void> settingsUpdater) throws Exception {
      super.applyToAllUnaryMethods(unaryMethodSettingsBuilders, settingsUpdater);
      return this;
    }

    public ImmutableList<UnaryCallSettings.Builder<?, ?>> unaryMethodSettingsBuilders() {
      return unaryMethodSettingsBuilders;
    }

    /** Returns the builder for the settings used for calls to delete. */
    public UnaryCallSettings.Builder<DeleteRegionTargetHttpsProxyRequest, Operation>
        deleteSettings() {
      return deleteSettings;
    }

    /** Returns the builder for the settings used for calls to get. */
    public UnaryCallSettings.Builder<GetRegionTargetHttpsProxyRequest, TargetHttpsProxy>
        getSettings() {
      return getSettings;
    }

    /** Returns the builder for the settings used for calls to insert. */
    public UnaryCallSettings.Builder<InsertRegionTargetHttpsProxyRequest, Operation>
        insertSettings() {
      return insertSettings;
    }

    /** Returns the builder for the settings used for calls to list. */
    public PagedCallSettings.Builder<
            ListRegionTargetHttpsProxiesRequest, TargetHttpsProxyList, ListPagedResponse>
        listSettings() {
      return listSettings;
    }

    /** Returns the builder for the settings used for calls to setSslCertificates. */
    public UnaryCallSettings.Builder<SetSslCertificatesRegionTargetHttpsProxyRequest, Operation>
        setSslCertificatesSettings() {
      return setSslCertificatesSettings;
    }

    /** Returns the builder for the settings used for calls to setUrlMap. */
    public UnaryCallSettings.Builder<SetUrlMapRegionTargetHttpsProxyRequest, Operation>
        setUrlMapSettings() {
      return setUrlMapSettings;
    }

    @Override
    public RegionTargetHttpsProxiesStubSettings build() throws IOException {
      return new RegionTargetHttpsProxiesStubSettings(this);
    }
  }
}