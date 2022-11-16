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
import com.basistheory.Privacy;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
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
 * CreateTokenResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-16T23:11:18.853007Z[Etc/UTC]")
public class CreateTokenResponse {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_TENANT_ID = "tenant_id";
  @SerializedName(SERIALIZED_NAME_TENANT_ID)
  private UUID tenantId;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public static final String SERIALIZED_NAME_FINGERPRINT = "fingerprint";
  @SerializedName(SERIALIZED_NAME_FINGERPRINT)
  private String fingerprint;

  public static final String SERIALIZED_NAME_FINGERPRINT_EXPRESSION = "fingerprint_expression";
  @SerializedName(SERIALIZED_NAME_FINGERPRINT_EXPRESSION)
  private String fingerprintExpression;

  public static final String SERIALIZED_NAME_MASK = "mask";
  @SerializedName(SERIALIZED_NAME_MASK)
  private Object mask = null;

  public static final String SERIALIZED_NAME_DATA = "data";
  @SerializedName(SERIALIZED_NAME_DATA)
  private Object data = null;

  public static final String SERIALIZED_NAME_METADATA = "metadata";
  @SerializedName(SERIALIZED_NAME_METADATA)
  private Map<String, String> metadata = null;

  public static final String SERIALIZED_NAME_PRIVACY = "privacy";
  @SerializedName(SERIALIZED_NAME_PRIVACY)
  private Privacy privacy;

  public static final String SERIALIZED_NAME_SEARCH_INDEXES = "search_indexes";
  @SerializedName(SERIALIZED_NAME_SEARCH_INDEXES)
  private List<String> searchIndexes = null;

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

  public static final String SERIALIZED_NAME_EXPIRES_AT = "expires_at";
  @SerializedName(SERIALIZED_NAME_EXPIRES_AT)
  private OffsetDateTime expiresAt;

  public static final String SERIALIZED_NAME_CONTAINERS = "containers";
  @SerializedName(SERIALIZED_NAME_CONTAINERS)
  private List<String> containers = null;

  public CreateTokenResponse() {
  }

  public CreateTokenResponse id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public CreateTokenResponse tenantId(UUID tenantId) {
    
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


  public CreateTokenResponse type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
  }


  public CreateTokenResponse fingerprint(String fingerprint) {
    
    this.fingerprint = fingerprint;
    return this;
  }

   /**
   * Get fingerprint
   * @return fingerprint
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getFingerprint() {
    return fingerprint;
  }


  public void setFingerprint(String fingerprint) {
    this.fingerprint = fingerprint;
  }


  public CreateTokenResponse fingerprintExpression(String fingerprintExpression) {
    
    this.fingerprintExpression = fingerprintExpression;
    return this;
  }

   /**
   * Get fingerprintExpression
   * @return fingerprintExpression
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getFingerprintExpression() {
    return fingerprintExpression;
  }


  public void setFingerprintExpression(String fingerprintExpression) {
    this.fingerprintExpression = fingerprintExpression;
  }


  public CreateTokenResponse mask(Object mask) {
    
    this.mask = mask;
    return this;
  }

   /**
   * Get mask
   * @return mask
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getMask() {
    return mask;
  }


  public void setMask(Object mask) {
    this.mask = mask;
  }


  public CreateTokenResponse data(Object data) {
    
    this.data = data;
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getData() {
    return data;
  }


  public void setData(Object data) {
    this.data = data;
  }


  public CreateTokenResponse metadata(Map<String, String> metadata) {
    
    this.metadata = metadata;
    return this;
  }

  public CreateTokenResponse putMetadataItem(String key, String metadataItem) {
    if (this.metadata == null) {
      this.metadata = new HashMap<>();
    }
    this.metadata.put(key, metadataItem);
    return this;
  }

   /**
   * Get metadata
   * @return metadata
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Map<String, String> getMetadata() {
    return metadata;
  }


  public void setMetadata(Map<String, String> metadata) {
    this.metadata = metadata;
  }


  public CreateTokenResponse privacy(Privacy privacy) {
    
    this.privacy = privacy;
    return this;
  }

   /**
   * Get privacy
   * @return privacy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Privacy getPrivacy() {
    return privacy;
  }


  public void setPrivacy(Privacy privacy) {
    this.privacy = privacy;
  }


  public CreateTokenResponse searchIndexes(List<String> searchIndexes) {
    
    this.searchIndexes = searchIndexes;
    return this;
  }

  public CreateTokenResponse addSearchIndexesItem(String searchIndexesItem) {
    if (this.searchIndexes == null) {
      this.searchIndexes = new ArrayList<>();
    }
    this.searchIndexes.add(searchIndexesItem);
    return this;
  }

   /**
   * Get searchIndexes
   * @return searchIndexes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getSearchIndexes() {
    return searchIndexes;
  }


  public void setSearchIndexes(List<String> searchIndexes) {
    this.searchIndexes = searchIndexes;
  }


  public CreateTokenResponse createdBy(UUID createdBy) {
    
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


  public CreateTokenResponse createdAt(OffsetDateTime createdAt) {
    
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


  public CreateTokenResponse modifiedBy(UUID modifiedBy) {
    
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


  public CreateTokenResponse modifiedAt(OffsetDateTime modifiedAt) {
    
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


  public CreateTokenResponse expiresAt(OffsetDateTime expiresAt) {
    
    this.expiresAt = expiresAt;
    return this;
  }

   /**
   * Get expiresAt
   * @return expiresAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getExpiresAt() {
    return expiresAt;
  }


  public void setExpiresAt(OffsetDateTime expiresAt) {
    this.expiresAt = expiresAt;
  }


  public CreateTokenResponse containers(List<String> containers) {
    
    this.containers = containers;
    return this;
  }

  public CreateTokenResponse addContainersItem(String containersItem) {
    if (this.containers == null) {
      this.containers = new ArrayList<>();
    }
    this.containers.add(containersItem);
    return this;
  }

   /**
   * Get containers
   * @return containers
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getContainers() {
    return containers;
  }


  public void setContainers(List<String> containers) {
    this.containers = containers;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateTokenResponse createTokenResponse = (CreateTokenResponse) o;
    return Objects.equals(this.id, createTokenResponse.id) &&
        Objects.equals(this.tenantId, createTokenResponse.tenantId) &&
        Objects.equals(this.type, createTokenResponse.type) &&
        Objects.equals(this.fingerprint, createTokenResponse.fingerprint) &&
        Objects.equals(this.fingerprintExpression, createTokenResponse.fingerprintExpression) &&
        Objects.equals(this.mask, createTokenResponse.mask) &&
        Objects.equals(this.data, createTokenResponse.data) &&
        Objects.equals(this.metadata, createTokenResponse.metadata) &&
        Objects.equals(this.privacy, createTokenResponse.privacy) &&
        Objects.equals(this.searchIndexes, createTokenResponse.searchIndexes) &&
        Objects.equals(this.createdBy, createTokenResponse.createdBy) &&
        Objects.equals(this.createdAt, createTokenResponse.createdAt) &&
        Objects.equals(this.modifiedBy, createTokenResponse.modifiedBy) &&
        Objects.equals(this.modifiedAt, createTokenResponse.modifiedAt) &&
        Objects.equals(this.expiresAt, createTokenResponse.expiresAt) &&
        Objects.equals(this.containers, createTokenResponse.containers);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, tenantId, type, fingerprint, fingerprintExpression, mask, data, metadata, privacy, searchIndexes, createdBy, createdAt, modifiedBy, modifiedAt, expiresAt, containers);
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
    sb.append("class CreateTokenResponse {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    fingerprint: ").append(toIndentedString(fingerprint)).append("\n");
    sb.append("    fingerprintExpression: ").append(toIndentedString(fingerprintExpression)).append("\n");
    sb.append("    mask: ").append(toIndentedString(mask)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    privacy: ").append(toIndentedString(privacy)).append("\n");
    sb.append("    searchIndexes: ").append(toIndentedString(searchIndexes)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    modifiedBy: ").append(toIndentedString(modifiedBy)).append("\n");
    sb.append("    modifiedAt: ").append(toIndentedString(modifiedAt)).append("\n");
    sb.append("    expiresAt: ").append(toIndentedString(expiresAt)).append("\n");
    sb.append("    containers: ").append(toIndentedString(containers)).append("\n");
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
    openapiFields.add("tenant_id");
    openapiFields.add("type");
    openapiFields.add("fingerprint");
    openapiFields.add("fingerprint_expression");
    openapiFields.add("mask");
    openapiFields.add("data");
    openapiFields.add("metadata");
    openapiFields.add("privacy");
    openapiFields.add("search_indexes");
    openapiFields.add("created_by");
    openapiFields.add("created_at");
    openapiFields.add("modified_by");
    openapiFields.add("modified_at");
    openapiFields.add("expires_at");
    openapiFields.add("containers");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CreateTokenResponse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!CreateTokenResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreateTokenResponse is not found in the empty JSON string", CreateTokenResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!CreateTokenResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CreateTokenResponse` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("tenant_id") != null && !jsonObj.get("tenant_id").isJsonNull()) && !jsonObj.get("tenant_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `tenant_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("tenant_id").toString()));
      }
      if ((jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()) && !jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      if ((jsonObj.get("fingerprint") != null && !jsonObj.get("fingerprint").isJsonNull()) && !jsonObj.get("fingerprint").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `fingerprint` to be a primitive type in the JSON string but got `%s`", jsonObj.get("fingerprint").toString()));
      }
      if ((jsonObj.get("fingerprint_expression") != null && !jsonObj.get("fingerprint_expression").isJsonNull()) && !jsonObj.get("fingerprint_expression").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `fingerprint_expression` to be a primitive type in the JSON string but got `%s`", jsonObj.get("fingerprint_expression").toString()));
      }
      // validate the optional field `privacy`
      if (jsonObj.get("privacy") != null && !jsonObj.get("privacy").isJsonNull()) {
        Privacy.validateJsonObject(jsonObj.getAsJsonObject("privacy"));
      }
      // ensure the json data is an array
      if (!jsonObj.get("search_indexes").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `search_indexes` to be an array in the JSON string but got `%s`", jsonObj.get("search_indexes").toString()));
      }
      if ((jsonObj.get("created_by") != null && !jsonObj.get("created_by").isJsonNull()) && !jsonObj.get("created_by").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `created_by` to be a primitive type in the JSON string but got `%s`", jsonObj.get("created_by").toString()));
      }
      if ((jsonObj.get("modified_by") != null && !jsonObj.get("modified_by").isJsonNull()) && !jsonObj.get("modified_by").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `modified_by` to be a primitive type in the JSON string but got `%s`", jsonObj.get("modified_by").toString()));
      }
      // ensure the json data is an array
      if (!jsonObj.get("containers").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `containers` to be an array in the JSON string but got `%s`", jsonObj.get("containers").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateTokenResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateTokenResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateTokenResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateTokenResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateTokenResponse>() {
           @Override
           public void write(JsonWriter out, CreateTokenResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreateTokenResponse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CreateTokenResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CreateTokenResponse
  * @throws IOException if the JSON string is invalid with respect to CreateTokenResponse
  */
  public static CreateTokenResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateTokenResponse.class);
  }

 /**
  * Convert an instance of CreateTokenResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

