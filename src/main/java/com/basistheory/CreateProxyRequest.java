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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
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
 * CreateProxyRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-16T23:28:50.575331Z[Etc/UTC]")
public class CreateProxyRequest {
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

  public static final String SERIALIZED_NAME_REQUIRE_AUTH = "require_auth";
  @SerializedName(SERIALIZED_NAME_REQUIRE_AUTH)
  private Boolean requireAuth;

  public CreateProxyRequest() {
  }

  public CreateProxyRequest name(String name) {
    
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


  public CreateProxyRequest destinationUrl(String destinationUrl) {
    
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


  public CreateProxyRequest requestReactorId(UUID requestReactorId) {
    
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


  public CreateProxyRequest responseReactorId(UUID responseReactorId) {
    
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


  public CreateProxyRequest requireAuth(Boolean requireAuth) {
    
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
    CreateProxyRequest createProxyRequest = (CreateProxyRequest) o;
    return Objects.equals(this.name, createProxyRequest.name) &&
        Objects.equals(this.destinationUrl, createProxyRequest.destinationUrl) &&
        Objects.equals(this.requestReactorId, createProxyRequest.requestReactorId) &&
        Objects.equals(this.responseReactorId, createProxyRequest.responseReactorId) &&
        Objects.equals(this.requireAuth, createProxyRequest.requireAuth);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, destinationUrl, requestReactorId, responseReactorId, requireAuth);
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
    sb.append("class CreateProxyRequest {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    destinationUrl: ").append(toIndentedString(destinationUrl)).append("\n");
    sb.append("    requestReactorId: ").append(toIndentedString(requestReactorId)).append("\n");
    sb.append("    responseReactorId: ").append(toIndentedString(responseReactorId)).append("\n");
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
  * @throws IOException if the JSON Object is invalid with respect to CreateProxyRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!CreateProxyRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreateProxyRequest is not found in the empty JSON string", CreateProxyRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!CreateProxyRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CreateProxyRequest` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CreateProxyRequest.openapiRequiredFields) {
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
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateProxyRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateProxyRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateProxyRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateProxyRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateProxyRequest>() {
           @Override
           public void write(JsonWriter out, CreateProxyRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreateProxyRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CreateProxyRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CreateProxyRequest
  * @throws IOException if the JSON string is invalid with respect to CreateProxyRequest
  */
  public static CreateProxyRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateProxyRequest.class);
  }

 /**
  * Convert an instance of CreateProxyRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

