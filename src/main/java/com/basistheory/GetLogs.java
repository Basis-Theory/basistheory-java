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
 * GetLogs
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class GetLogs {
  public static final String SERIALIZED_NAME_ENTITY_TYPE = "entity_type";
  @SerializedName(SERIALIZED_NAME_ENTITY_TYPE)
  private String entityType;

  public static final String SERIALIZED_NAME_ENTITY_ID = "entity_id";
  @SerializedName(SERIALIZED_NAME_ENTITY_ID)
  private String entityId;

  public static final String SERIALIZED_NAME_START_DATE = "start_date";
  @SerializedName(SERIALIZED_NAME_START_DATE)
  private OffsetDateTime startDate;

  public static final String SERIALIZED_NAME_END_DATE = "end_date";
  @SerializedName(SERIALIZED_NAME_END_DATE)
  private OffsetDateTime endDate;

  public static final String SERIALIZED_NAME_PAGE = "page";
  @SerializedName(SERIALIZED_NAME_PAGE)
  private Integer page;

  public static final String SERIALIZED_NAME_SIZE = "size";
  @SerializedName(SERIALIZED_NAME_SIZE)
  private Integer size;

  public GetLogs() {
  }

  public GetLogs entityType(String entityType) {
    
    this.entityType = entityType;
    return this;
  }

   /**
   * Get entityType
   * @return entityType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getEntityType() {
    return entityType;
  }


  public void setEntityType(String entityType) {
    this.entityType = entityType;
  }


  public GetLogs entityId(String entityId) {
    
    this.entityId = entityId;
    return this;
  }

   /**
   * Get entityId
   * @return entityId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getEntityId() {
    return entityId;
  }


  public void setEntityId(String entityId) {
    this.entityId = entityId;
  }


  public GetLogs startDate(OffsetDateTime startDate) {
    
    this.startDate = startDate;
    return this;
  }

   /**
   * Get startDate
   * @return startDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getStartDate() {
    return startDate;
  }


  public void setStartDate(OffsetDateTime startDate) {
    this.startDate = startDate;
  }


  public GetLogs endDate(OffsetDateTime endDate) {
    
    this.endDate = endDate;
    return this;
  }

   /**
   * Get endDate
   * @return endDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getEndDate() {
    return endDate;
  }


  public void setEndDate(OffsetDateTime endDate) {
    this.endDate = endDate;
  }


  public GetLogs page(Integer page) {
    
    this.page = page;
    return this;
  }

   /**
   * Get page
   * minimum: 0
   * maximum: 2147483647
   * @return page
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getPage() {
    return page;
  }


  public void setPage(Integer page) {
    this.page = page;
  }


  public GetLogs size(Integer size) {
    
    this.size = size;
    return this;
  }

   /**
   * Get size
   * minimum: 0
   * maximum: 10000
   * @return size
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getSize() {
    return size;
  }


  public void setSize(Integer size) {
    this.size = size;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetLogs getLogs = (GetLogs) o;
    return Objects.equals(this.entityType, getLogs.entityType) &&
        Objects.equals(this.entityId, getLogs.entityId) &&
        Objects.equals(this.startDate, getLogs.startDate) &&
        Objects.equals(this.endDate, getLogs.endDate) &&
        Objects.equals(this.page, getLogs.page) &&
        Objects.equals(this.size, getLogs.size);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(entityType, entityId, startDate, endDate, page, size);
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
    sb.append("class GetLogs {\n");
    sb.append("    entityType: ").append(toIndentedString(entityType)).append("\n");
    sb.append("    entityId: ").append(toIndentedString(entityId)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    page: ").append(toIndentedString(page)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
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
    openapiFields.add("entity_type");
    openapiFields.add("entity_id");
    openapiFields.add("start_date");
    openapiFields.add("end_date");
    openapiFields.add("page");
    openapiFields.add("size");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to GetLogs
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!GetLogs.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetLogs is not found in the empty JSON string", GetLogs.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("entity_type") != null && !jsonObj.get("entity_type").isJsonNull()) && !jsonObj.get("entity_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `entity_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("entity_type").toString()));
      }
      if ((jsonObj.get("entity_id") != null && !jsonObj.get("entity_id").isJsonNull()) && !jsonObj.get("entity_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `entity_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("entity_id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GetLogs.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetLogs' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetLogs> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetLogs.class));

       return (TypeAdapter<T>) new TypeAdapter<GetLogs>() {
           @Override
           public void write(JsonWriter out, GetLogs value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GetLogs read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of GetLogs given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of GetLogs
  * @throws IOException if the JSON string is invalid with respect to GetLogs
  */
  public static GetLogs fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetLogs.class);
  }

 /**
  * Convert an instance of GetLogs to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

