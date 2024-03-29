/*
 * Basis Theory API
 * ## Getting Started * Sign-in to [Basis Theory](https://basistheory.com) and go to [Applications](https://portal.basistheory.com/applications) * Create a Basis Theory Private Application * All permissions should be selected * Paste the API Key into the `BT-API-KEY` variable
 *
 * The version of the OpenAPI document: v1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.basistheory;

import java.util.Objects;
import java.util.Arrays;
import com.basistheory.Application;
import com.basistheory.ProxyTransform;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import org.openapitools.jackson.nullable.JsonNullable;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.basistheory.JSON;

/**
 * UpdateProxyRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class UpdateProxyRequest {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_DESTINATION_URL = "destination_url";
  @SerializedName(SERIALIZED_NAME_DESTINATION_URL)
  private String destinationUrl;

  public static final String SERIALIZED_NAME_REQUEST_REACTOR_ID = "request_reactor_id";
  @SerializedName(SERIALIZED_NAME_REQUEST_REACTOR_ID)
  private UUID requestReactorId;

  public static final String SERIALIZED_NAME_RESPONSE_REACTOR_ID = "response_reactor_id";
  @SerializedName(SERIALIZED_NAME_RESPONSE_REACTOR_ID)
  private UUID responseReactorId;

  public static final String SERIALIZED_NAME_REQUEST_TRANSFORM = "request_transform";
  @SerializedName(SERIALIZED_NAME_REQUEST_TRANSFORM)
  private ProxyTransform requestTransform;

  public static final String SERIALIZED_NAME_RESPONSE_TRANSFORM = "response_transform";
  @SerializedName(SERIALIZED_NAME_RESPONSE_TRANSFORM)
  private ProxyTransform responseTransform;

  public static final String SERIALIZED_NAME_APPLICATION = "application";
  @SerializedName(SERIALIZED_NAME_APPLICATION)
  private Application application;

  public static final String SERIALIZED_NAME_CONFIGURATION = "configuration";
  @SerializedName(SERIALIZED_NAME_CONFIGURATION)
  private Map<String, String> _configuration = null;

  public static final String SERIALIZED_NAME_REQUIRE_AUTH = "require_auth";
  @SerializedName(SERIALIZED_NAME_REQUIRE_AUTH)
  private Boolean requireAuth;

  public UpdateProxyRequest() {
  }

  public UpdateProxyRequest name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public UpdateProxyRequest destinationUrl(String destinationUrl) {
    
    this.destinationUrl = destinationUrl;
    return this;
  }

   /**
   * Get destinationUrl
   * @return destinationUrl
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getDestinationUrl() {
    return destinationUrl;
  }


  public void setDestinationUrl(String destinationUrl) {
    this.destinationUrl = destinationUrl;
  }


  public UpdateProxyRequest requestReactorId(UUID requestReactorId) {
    
    this.requestReactorId = requestReactorId;
    return this;
  }

   /**
   * Get requestReactorId
   * @return requestReactorId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public UUID getRequestReactorId() {
    return requestReactorId;
  }


  public void setRequestReactorId(UUID requestReactorId) {
    this.requestReactorId = requestReactorId;
  }


  public UpdateProxyRequest responseReactorId(UUID responseReactorId) {
    
    this.responseReactorId = responseReactorId;
    return this;
  }

   /**
   * Get responseReactorId
   * @return responseReactorId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public UUID getResponseReactorId() {
    return responseReactorId;
  }


  public void setResponseReactorId(UUID responseReactorId) {
    this.responseReactorId = responseReactorId;
  }


  public UpdateProxyRequest requestTransform(ProxyTransform requestTransform) {
    
    this.requestTransform = requestTransform;
    return this;
  }

   /**
   * Get requestTransform
   * @return requestTransform
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ProxyTransform getRequestTransform() {
    return requestTransform;
  }


  public void setRequestTransform(ProxyTransform requestTransform) {
    this.requestTransform = requestTransform;
  }


  public UpdateProxyRequest responseTransform(ProxyTransform responseTransform) {
    
    this.responseTransform = responseTransform;
    return this;
  }

   /**
   * Get responseTransform
   * @return responseTransform
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ProxyTransform getResponseTransform() {
    return responseTransform;
  }


  public void setResponseTransform(ProxyTransform responseTransform) {
    this.responseTransform = responseTransform;
  }


  public UpdateProxyRequest application(Application application) {
    
    this.application = application;
    return this;
  }

   /**
   * Get application
   * @return application
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Application getApplication() {
    return application;
  }


  public void setApplication(Application application) {
    this.application = application;
  }


  public UpdateProxyRequest _configuration(Map<String, String> _configuration) {
    
    this._configuration = _configuration;
    return this;
  }

  public UpdateProxyRequest putConfigurationItem(String key, String _configurationItem) {
    if (this._configuration == null) {
      this._configuration = new HashMap<>();
    }
    this._configuration.put(key, _configurationItem);
    return this;
  }

   /**
   * Get _configuration
   * @return _configuration
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Map<String, String> getConfiguration() {
    return _configuration;
  }


  public void setConfiguration(Map<String, String> _configuration) {
    this._configuration = _configuration;
  }


  public UpdateProxyRequest requireAuth(Boolean requireAuth) {
    
    this.requireAuth = requireAuth;
    return this;
  }

   /**
   * Get requireAuth
   * @return requireAuth
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getRequireAuth() {
    return requireAuth;
  }


  public void setRequireAuth(Boolean requireAuth) {
    this.requireAuth = requireAuth;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateProxyRequest updateProxyRequest = (UpdateProxyRequest) o;
    return Objects.equals(this.name, updateProxyRequest.name) &&
        Objects.equals(this.destinationUrl, updateProxyRequest.destinationUrl) &&
        Objects.equals(this.requestReactorId, updateProxyRequest.requestReactorId) &&
        Objects.equals(this.responseReactorId, updateProxyRequest.responseReactorId) &&
        Objects.equals(this.requestTransform, updateProxyRequest.requestTransform) &&
        Objects.equals(this.responseTransform, updateProxyRequest.responseTransform) &&
        Objects.equals(this.application, updateProxyRequest.application) &&
        Objects.equals(this._configuration, updateProxyRequest._configuration) &&
        Objects.equals(this.requireAuth, updateProxyRequest.requireAuth);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, destinationUrl, requestReactorId, responseReactorId, requestTransform, responseTransform, application, _configuration, requireAuth);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateProxyRequest {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    destinationUrl: ").append(toIndentedString(destinationUrl)).append("\n");
    sb.append("    requestReactorId: ").append(toIndentedString(requestReactorId)).append("\n");
    sb.append("    responseReactorId: ").append(toIndentedString(responseReactorId)).append("\n");
    sb.append("    requestTransform: ").append(toIndentedString(requestTransform)).append("\n");
    sb.append("    responseTransform: ").append(toIndentedString(responseTransform)).append("\n");
    sb.append("    application: ").append(toIndentedString(application)).append("\n");
    sb.append("    _configuration: ").append(toIndentedString(_configuration)).append("\n");
    sb.append("    requireAuth: ").append(toIndentedString(requireAuth)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("name");
    openapiFields.add("destination_url");
    openapiFields.add("request_reactor_id");
    openapiFields.add("response_reactor_id");
    openapiFields.add("request_transform");
    openapiFields.add("response_transform");
    openapiFields.add("application");
    openapiFields.add("configuration");
    openapiFields.add("require_auth");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("destination_url");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to UpdateProxyRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!UpdateProxyRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in UpdateProxyRequest is not found in the empty JSON string", UpdateProxyRequest.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : UpdateProxyRequest.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if (!jsonObj.get("destination_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `destination_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("destination_url").toString()));
      }
      if ((jsonObj.get("request_reactor_id") != null && !jsonObj.get("request_reactor_id").isJsonNull()) && !jsonObj.get("request_reactor_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `request_reactor_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("request_reactor_id").toString()));
      }
      if ((jsonObj.get("response_reactor_id") != null && !jsonObj.get("response_reactor_id").isJsonNull()) && !jsonObj.get("response_reactor_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `response_reactor_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("response_reactor_id").toString()));
      }
      // validate the optional field `request_transform`
      if (jsonObj.get("request_transform") != null && !jsonObj.get("request_transform").isJsonNull()) {
        ProxyTransform.validateJsonObject(jsonObj.getAsJsonObject("request_transform"));
      }
      // validate the optional field `response_transform`
      if (jsonObj.get("response_transform") != null && !jsonObj.get("response_transform").isJsonNull()) {
        ProxyTransform.validateJsonObject(jsonObj.getAsJsonObject("response_transform"));
      }
      // validate the optional field `application`
      if (jsonObj.get("application") != null && !jsonObj.get("application").isJsonNull()) {
        Application.validateJsonObject(jsonObj.getAsJsonObject("application"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UpdateProxyRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UpdateProxyRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UpdateProxyRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UpdateProxyRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<UpdateProxyRequest>() {
           @Override
           public void write(JsonWriter out, UpdateProxyRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public UpdateProxyRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of UpdateProxyRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of UpdateProxyRequest
  * @throws IOException if the JSON string is invalid with respect to UpdateProxyRequest
  */
  public static UpdateProxyRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UpdateProxyRequest.class);
  }

 /**
  * Convert an instance of UpdateProxyRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

