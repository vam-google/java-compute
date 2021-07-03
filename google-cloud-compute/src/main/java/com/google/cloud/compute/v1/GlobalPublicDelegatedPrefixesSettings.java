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

package com.google.cloud.compute.v1;

import static com.google.cloud.compute.v1.GlobalPublicDelegatedPrefixesClient.ListPagedResponse;

import com.google.api.core.ApiFunction;
import com.google.api.core.BetaApi;
import com.google.api.gax.core.GoogleCredentialsProvider;
import com.google.api.gax.core.InstantiatingExecutorProvider;
import com.google.api.gax.httpjson.InstantiatingHttpJsonChannelProvider;
import com.google.api.gax.rpc.ApiClientHeaderProvider;
import com.google.api.gax.rpc.ClientContext;
import com.google.api.gax.rpc.ClientSettings;
import com.google.api.gax.rpc.PagedCallSettings;
import com.google.api.gax.rpc.TransportChannelProvider;
import com.google.api.gax.rpc.UnaryCallSettings;
import com.google.cloud.compute.v1.stub.GlobalPublicDelegatedPrefixesStubSettings;
import java.io.IOException;
import java.util.List;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/**
 * Settings class to configure an instance of {@link GlobalPublicDelegatedPrefixesClient}.
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
 * <pre>{@code
 * GlobalPublicDelegatedPrefixesSettings.Builder globalPublicDelegatedPrefixesSettingsBuilder =
 *     GlobalPublicDelegatedPrefixesSettings.newBuilder();
 * globalPublicDelegatedPrefixesSettingsBuilder
 *     .deleteSettings()
 *     .setRetrySettings(
 *         globalPublicDelegatedPrefixesSettingsBuilder
 *             .deleteSettings()
 *             .getRetrySettings()
 *             .toBuilder()
 *             .setTotalTimeout(Duration.ofSeconds(30))
 *             .build());
 * GlobalPublicDelegatedPrefixesSettings globalPublicDelegatedPrefixesSettings =
 *     globalPublicDelegatedPrefixesSettingsBuilder.build();
 * }</pre>
 */
@Generated("by gapic-generator-java")
public class GlobalPublicDelegatedPrefixesSettings
    extends ClientSettings<GlobalPublicDelegatedPrefixesSettings> {

  /** Returns the object with the settings used for calls to delete. */
  public UnaryCallSettings<DeleteGlobalPublicDelegatedPrefixeRequest, Operation> deleteSettings() {
    return ((GlobalPublicDelegatedPrefixesStubSettings) getStubSettings()).deleteSettings();
  }

  /** Returns the object with the settings used for calls to get. */
  public UnaryCallSettings<GetGlobalPublicDelegatedPrefixeRequest, PublicDelegatedPrefix>
      getSettings() {
    return ((GlobalPublicDelegatedPrefixesStubSettings) getStubSettings()).getSettings();
  }

  /** Returns the object with the settings used for calls to insert. */
  public UnaryCallSettings<InsertGlobalPublicDelegatedPrefixeRequest, Operation> insertSettings() {
    return ((GlobalPublicDelegatedPrefixesStubSettings) getStubSettings()).insertSettings();
  }

  /** Returns the object with the settings used for calls to list. */
  public PagedCallSettings<
          ListGlobalPublicDelegatedPrefixesRequest, PublicDelegatedPrefixList, ListPagedResponse>
      listSettings() {
    return ((GlobalPublicDelegatedPrefixesStubSettings) getStubSettings()).listSettings();
  }

  /** Returns the object with the settings used for calls to patch. */
  public UnaryCallSettings<PatchGlobalPublicDelegatedPrefixeRequest, Operation> patchSettings() {
    return ((GlobalPublicDelegatedPrefixesStubSettings) getStubSettings()).patchSettings();
  }

  public static final GlobalPublicDelegatedPrefixesSettings create(
      GlobalPublicDelegatedPrefixesStubSettings stub) throws IOException {
    return new GlobalPublicDelegatedPrefixesSettings.Builder(stub.toBuilder()).build();
  }

  /** Returns a builder for the default ExecutorProvider for this service. */
  public static InstantiatingExecutorProvider.Builder defaultExecutorProviderBuilder() {
    return GlobalPublicDelegatedPrefixesStubSettings.defaultExecutorProviderBuilder();
  }

  /** Returns the default service endpoint. */
  public static String getDefaultEndpoint() {
    return GlobalPublicDelegatedPrefixesStubSettings.getDefaultEndpoint();
  }

  /** Returns the default service scopes. */
  public static List<String> getDefaultServiceScopes() {
    return GlobalPublicDelegatedPrefixesStubSettings.getDefaultServiceScopes();
  }

  /** Returns a builder for the default credentials for this service. */
  public static GoogleCredentialsProvider.Builder defaultCredentialsProviderBuilder() {
    return GlobalPublicDelegatedPrefixesStubSettings.defaultCredentialsProviderBuilder();
  }

  /** Returns a builder for the default ChannelProvider for this service. */
  public static InstantiatingHttpJsonChannelProvider.Builder
      defaultHttpJsonTransportProviderBuilder() {
    return GlobalPublicDelegatedPrefixesStubSettings.defaultHttpJsonTransportProviderBuilder();
  }

  public static TransportChannelProvider defaultTransportChannelProvider() {
    return GlobalPublicDelegatedPrefixesStubSettings.defaultTransportChannelProvider();
  }

  @BetaApi("The surface for customizing headers is not stable yet and may change in the future.")
  public static ApiClientHeaderProvider.Builder defaultApiClientHeaderProviderBuilder() {
    return GlobalPublicDelegatedPrefixesStubSettings.defaultApiClientHeaderProviderBuilder();
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

  protected GlobalPublicDelegatedPrefixesSettings(Builder settingsBuilder) throws IOException {
    super(settingsBuilder);
  }

  /** Builder for GlobalPublicDelegatedPrefixesSettings. */
  public static class Builder
      extends ClientSettings.Builder<GlobalPublicDelegatedPrefixesSettings, Builder> {

    protected Builder() throws IOException {
      this(((ClientContext) null));
    }

    protected Builder(ClientContext clientContext) {
      super(GlobalPublicDelegatedPrefixesStubSettings.newBuilder(clientContext));
    }

    protected Builder(GlobalPublicDelegatedPrefixesSettings settings) {
      super(settings.getStubSettings().toBuilder());
    }

    protected Builder(GlobalPublicDelegatedPrefixesStubSettings.Builder stubSettings) {
      super(stubSettings);
    }

    private static Builder createDefault() {
      return new Builder(GlobalPublicDelegatedPrefixesStubSettings.newBuilder());
    }

    public GlobalPublicDelegatedPrefixesStubSettings.Builder getStubSettingsBuilder() {
      return ((GlobalPublicDelegatedPrefixesStubSettings.Builder) getStubSettings());
    }

    // NEXT_MAJOR_VER: remove 'throws Exception'.
    /**
     * Applies the given settings updater function to all of the unary API methods in this service.
     *
     * <p>Note: This method does not support applying settings to streaming methods.
     */
    public Builder applyToAllUnaryMethods(
        ApiFunction<UnaryCallSettings.Builder<?, ?>, Void> settingsUpdater) throws Exception {
      super.applyToAllUnaryMethods(
          getStubSettingsBuilder().unaryMethodSettingsBuilders(), settingsUpdater);
      return this;
    }

    /** Returns the builder for the settings used for calls to delete. */
    public UnaryCallSettings.Builder<DeleteGlobalPublicDelegatedPrefixeRequest, Operation>
        deleteSettings() {
      return getStubSettingsBuilder().deleteSettings();
    }

    /** Returns the builder for the settings used for calls to get. */
    public UnaryCallSettings.Builder<GetGlobalPublicDelegatedPrefixeRequest, PublicDelegatedPrefix>
        getSettings() {
      return getStubSettingsBuilder().getSettings();
    }

    /** Returns the builder for the settings used for calls to insert. */
    public UnaryCallSettings.Builder<InsertGlobalPublicDelegatedPrefixeRequest, Operation>
        insertSettings() {
      return getStubSettingsBuilder().insertSettings();
    }

    /** Returns the builder for the settings used for calls to list. */
    public PagedCallSettings.Builder<
            ListGlobalPublicDelegatedPrefixesRequest, PublicDelegatedPrefixList, ListPagedResponse>
        listSettings() {
      return getStubSettingsBuilder().listSettings();
    }

    /** Returns the builder for the settings used for calls to patch. */
    public UnaryCallSettings.Builder<PatchGlobalPublicDelegatedPrefixeRequest, Operation>
        patchSettings() {
      return getStubSettingsBuilder().patchSettings();
    }

    @Override
    public GlobalPublicDelegatedPrefixesSettings build() throws IOException {
      return new GlobalPublicDelegatedPrefixesSettings(this);
    }
  }
}
