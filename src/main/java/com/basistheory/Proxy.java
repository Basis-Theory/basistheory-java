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
import java.time.OffsetDateTime;
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
 * Proxy
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-16T23:28:50.575331Z[Etc/UTC]")
public class Proxy {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private UUID id;

  public static final String SERIALIZED_NAME_KEY = "key";
  @SerializedName(SERIALIZED_NAME_KEY)
  private String key;

  public static final String SERIALIZED_NAME_TENANT_ID = "tenant_id";
  @SerializedName(SERIALIZED_NAME_TENANT_ID)
  private UUID tenantId;

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

  public static final String SERIALIZED_NAME_CREATED_BY = "created_by";
  @SerializedName(SERIALIZED_NAME_CREATED_BY)
  private UUID createdBy;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_MODIFIED_BY = "modified_by";
  @SerializedName(SERIALIZED_NAME_MODIFIED_BY)
  private UUID modifiedBy;

  public static final String SERIALIZED_NAME_MODIFIED_AT = "modified_at";
  @SerializedName(SERIALIZED_NAME_MODIFIED_AT)
  private OffsetDateTime modifiedAt;

  public Proxy() {
  }

  
  public Proxy(
     String key
  ) {
    this();
    this.key = key;
  }

  public Proxy id(UUID id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public UUID getId() {
    return id;
  }


  public void setId(UUID id) {
    this.id = id;
  }


   /**
   * Get key
   * @return key
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getKey() {
    return key;
  }




  public Proxy tenantId(UUID tenantId) {
    
    this.tenantId = tenantId;
    return this;
  }

   /**
   * Get tenantId
   * @return tenantId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public UUID getTenantId() {
    return tenantId;
  }


  public void setTenantId(UUID tenantId) {
    this.tenantId = tenantId;
  }


  public Proxy name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public Proxy destinationUrl(String destinationUrl) {
    
    this.destinationUrl = destinationUrl;
    return this;
  }

   /**
   * Get destinationUrl
   * @return destinationUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDestinationUrl() {
    return destinationUrl;
  }


  public void setDestinationUrl(String destinationUrl) {
    this.destinationUrl = destinationUrl;
  }


  public Proxy requestReactorId(UUID requestReactorId) {
    
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


  public Proxy responseReactorId(UUID responseReactorId) {
    
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


  public Proxy requireAuth(Boolean requireAuth) {
    
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


  public Proxy createdBy(UUID createdBy) {
    
    this.createdBy = createdBy;
    return this;
  }

   /**
   * Get createdBy
   * @return createdBy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public UUID getCreatedBy() {
    return createdBy;
  }


  public void setCreatedBy(UUID createdBy) {
    this.createdBy = createdBy;
  }


  public Proxy createdAt(OffsetDateTime createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Get createdAt
   * @return createdAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }


  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }


  public Proxy modifiedBy(UUID modifiedBy) {
    
    this.modifiedBy = modifiedBy;
    return this;
  }

   /**
   * Get modifiedBy
   * @return modifiedBy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public UUID getModifiedBy() {
    return modifiedBy;
  }


  public void setModifiedBy(UUID modifiedBy) {
    this.modifiedBy = modifiedBy;
  }


  public Proxy modifiedAt(OffsetDateTime modifiedAt) {
    
    this.modifiedAt = modifiedAt;
    return this;
  }

   /**
   * Get modifiedAt
   * @return modifiedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getModifiedAt() {
    return modifiedAt;
  }


  public void setModifiedAt(OffsetDateTime modifiedAt) {
    this.modifiedAt = modifiedAt;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Proxy proxy = (Proxy) o;
    return Objects.equals(this.id, proxy.id) &&
        Objects.equals(this.key, proxy.key) &&
        Objects.equals(this.tenantId, proxy.tenantId) &&
        Objects.equals(this.name, proxy.name) &&
        Objects.equals(this.destinationUrl, proxy.destinationUrl) &&
        Objects.equals(this.requestReactorId, proxy.requestReactorId) &&
        Objects.equals(this.responseReactorId, proxy.responseReactorId) &&
        Objects.equals(this.requireAuth, proxy.requireAuth) &&
        Objects.equals(this.createdBy, proxy.createdBy) &&
        Objects.equals(this.createdAt, proxy.createdAt) &&
        Objects.equals(this.modifiedBy, proxy.modifiedBy) &&
        Objects.equals(this.modifiedAt, proxy.modifiedAt);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, key, tenantId, name, destinationUrl, requestReactorId, responseReactorId, requireAuth, createdBy, createdAt, modifiedBy, modifiedAt);
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
    sb.append("class Proxy {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    destinationUrl: ").append(toIndentedString(destinationUrl)).append("\n");
    sb.append("    requestReactorId: ").append(toIndentedString(requestReactorId)).append("\n");
    sb.append("    responseReactorId: ").append(toIndentedString(responseReactorId)).append("\n");
    sb.append("    requireAuth: ").append(toIndentedString(requireAuth)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    modifiedBy: ").append(toIndentedString(modifiedBy)).append("\n");
    sb.append("    modifiedAt: ").append(toIndentedString(modifiedAt)).append("\n");
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
    openapiFields.add("id");
    openapiFields.add("key");
    openapiFields.add("tenant_id");
    openapiFields.add("name");
    openapiFields.add("destination_url");
    openapiFields.add("request_reactor_id");
    openapiFields.add("response_reactor_id");
    openapiFields.add("require_auth");
    openapiFields.add("created_by");
    openapiFields.add("created_at");
    openapiFields.add("modified_by");
    openapiFields.add("modified_at");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to Proxy
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!Proxy.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Proxy is not found in the empty JSON string", Proxy.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!Proxy.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Proxy` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("key") != null && !jsonObj.get("key").isJsonNull()) && !jsonObj.get("key").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `key` to be a primitive type in the JSON string but got `%s`", jsonObj.get("key").toString()));
      }
      if ((jsonObj.get("tenant_id") != null && !jsonObj.get("tenant_id").isJsonNull()) && !jsonObj.get("tenant_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `tenant_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("tenant_id").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("destination_url") != null && !jsonObj.get("destination_url").isJsonNull()) && !jsonObj.get("destination_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `destination_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("destination_url").toString()));
      }
      if ((jsonObj.get("request_reactor_id") != null && !jsonObj.get("request_reactor_id").isJsonNull()) && !jsonObj.get("request_reactor_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `request_reactor_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("request_reactor_id").toString()));
      }
      if ((jsonObj.get("response_reactor_id") != null && !jsonObj.get("response_reactor_id").isJsonNull()) && !jsonObj.get("response_reactor_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `response_reactor_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("response_reactor_id").toString()));
      }
      if ((jsonObj.get("created_by") != null && !jsonObj.get("created_by").isJsonNull()) && !jsonObj.get("created_by").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `created_by` to be a primitive type in the JSON string but got `%s`", jsonObj.get("created_by").toString()));
      }
      if ((jsonObj.get("modified_by") != null && !jsonObj.get("modified_by").isJsonNull()) && !jsonObj.get("modified_by").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `modified_by` to be a primitive type in the JSON string but got `%s`", jsonObj.get("modified_by").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Proxy.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Proxy' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Proxy> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Proxy.class));

       return (TypeAdapter<T>) new TypeAdapter<Proxy>() {
           @Override
           public void write(JsonWriter out, Proxy value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Proxy read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Proxy given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Proxy
  * @throws IOException if the JSON string is invalid with respect to Proxy
  */
  public static Proxy fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Proxy.class);
  }

 /**
  * Convert an instance of Proxy to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

