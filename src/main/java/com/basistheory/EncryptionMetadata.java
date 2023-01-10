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
import com.basistheory.EncryptionKey;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

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
 * EncryptionMetadata
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class EncryptionMetadata {
  public static final String SERIALIZED_NAME_CEK = "cek";
  @SerializedName(SERIALIZED_NAME_CEK)
  private EncryptionKey cek;

  public static final String SERIALIZED_NAME_KEK = "kek";
  @SerializedName(SERIALIZED_NAME_KEK)
  private EncryptionKey kek;

  public EncryptionMetadata() {
  }

  public EncryptionMetadata cek(EncryptionKey cek) {
    
    this.cek = cek;
    return this;
  }

   /**
   * Get cek
   * @return cek
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public EncryptionKey getCek() {
    return cek;
  }


  public void setCek(EncryptionKey cek) {
    this.cek = cek;
  }


  public EncryptionMetadata kek(EncryptionKey kek) {
    
    this.kek = kek;
    return this;
  }

   /**
   * Get kek
   * @return kek
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public EncryptionKey getKek() {
    return kek;
  }


  public void setKek(EncryptionKey kek) {
    this.kek = kek;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EncryptionMetadata encryptionMetadata = (EncryptionMetadata) o;
    return Objects.equals(this.cek, encryptionMetadata.cek) &&
        Objects.equals(this.kek, encryptionMetadata.kek);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cek, kek);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EncryptionMetadata {\n");
    sb.append("    cek: ").append(toIndentedString(cek)).append("\n");
    sb.append("    kek: ").append(toIndentedString(kek)).append("\n");
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
    openapiFields.add("cek");
    openapiFields.add("kek");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to EncryptionMetadata
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!EncryptionMetadata.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in EncryptionMetadata is not found in the empty JSON string", EncryptionMetadata.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!EncryptionMetadata.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `EncryptionMetadata` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // validate the optional field `cek`
      if (jsonObj.get("cek") != null && !jsonObj.get("cek").isJsonNull()) {
        EncryptionKey.validateJsonObject(jsonObj.getAsJsonObject("cek"));
      }
      // validate the optional field `kek`
      if (jsonObj.get("kek") != null && !jsonObj.get("kek").isJsonNull()) {
        EncryptionKey.validateJsonObject(jsonObj.getAsJsonObject("kek"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EncryptionMetadata.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EncryptionMetadata' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EncryptionMetadata> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EncryptionMetadata.class));

       return (TypeAdapter<T>) new TypeAdapter<EncryptionMetadata>() {
           @Override
           public void write(JsonWriter out, EncryptionMetadata value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public EncryptionMetadata read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of EncryptionMetadata given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of EncryptionMetadata
  * @throws IOException if the JSON string is invalid with respect to EncryptionMetadata
  */
  public static EncryptionMetadata fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EncryptionMetadata.class);
  }

 /**
  * Convert an instance of EncryptionMetadata to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

