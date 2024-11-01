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
import java.util.ArrayList;
import java.util.List;
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
 * ThreeDSVersion
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ThreeDSVersion {
  public static final String SERIALIZED_NAME_RECOMMENDED_VERSION = "recommended_version";
  @SerializedName(SERIALIZED_NAME_RECOMMENDED_VERSION)
  private String recommendedVersion;

  public static final String SERIALIZED_NAME_AVAILABLE_VERSIONS = "available_versions";
  @SerializedName(SERIALIZED_NAME_AVAILABLE_VERSIONS)
  private List<String> availableVersions = null;

  public static final String SERIALIZED_NAME_EARLIEST_ACS_SUPPORTED_VERSION = "earliest_acs_supported_version";
  @SerializedName(SERIALIZED_NAME_EARLIEST_ACS_SUPPORTED_VERSION)
  private String earliestAcsSupportedVersion;

  public static final String SERIALIZED_NAME_EARLIEST_DS_SUPPORTED_VERSION = "earliest_ds_supported_version";
  @SerializedName(SERIALIZED_NAME_EARLIEST_DS_SUPPORTED_VERSION)
  private String earliestDsSupportedVersion;

  public static final String SERIALIZED_NAME_LATEST_ACS_SUPPORTED_VERSION = "latest_acs_supported_version";
  @SerializedName(SERIALIZED_NAME_LATEST_ACS_SUPPORTED_VERSION)
  private String latestAcsSupportedVersion;

  public static final String SERIALIZED_NAME_LATEST_DS_SUPPORTED_VERSION = "latest_ds_supported_version";
  @SerializedName(SERIALIZED_NAME_LATEST_DS_SUPPORTED_VERSION)
  private String latestDsSupportedVersion;

  public static final String SERIALIZED_NAME_ACS_INFORMATION = "acs_information";
  @SerializedName(SERIALIZED_NAME_ACS_INFORMATION)
  private List<String> acsInformation = null;

  public ThreeDSVersion() {
  }

  public ThreeDSVersion recommendedVersion(String recommendedVersion) {
    
    this.recommendedVersion = recommendedVersion;
    return this;
  }

   /**
   * Get recommendedVersion
   * @return recommendedVersion
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getRecommendedVersion() {
    return recommendedVersion;
  }


  public void setRecommendedVersion(String recommendedVersion) {
    this.recommendedVersion = recommendedVersion;
  }


  public ThreeDSVersion availableVersions(List<String> availableVersions) {
    
    this.availableVersions = availableVersions;
    return this;
  }

  public ThreeDSVersion addAvailableVersionsItem(String availableVersionsItem) {
    if (this.availableVersions == null) {
      this.availableVersions = new ArrayList<>();
    }
    this.availableVersions.add(availableVersionsItem);
    return this;
  }

   /**
   * Get availableVersions
   * @return availableVersions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getAvailableVersions() {
    return availableVersions;
  }


  public void setAvailableVersions(List<String> availableVersions) {
    this.availableVersions = availableVersions;
  }


  public ThreeDSVersion earliestAcsSupportedVersion(String earliestAcsSupportedVersion) {
    
    this.earliestAcsSupportedVersion = earliestAcsSupportedVersion;
    return this;
  }

   /**
   * Get earliestAcsSupportedVersion
   * @return earliestAcsSupportedVersion
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getEarliestAcsSupportedVersion() {
    return earliestAcsSupportedVersion;
  }


  public void setEarliestAcsSupportedVersion(String earliestAcsSupportedVersion) {
    this.earliestAcsSupportedVersion = earliestAcsSupportedVersion;
  }


  public ThreeDSVersion earliestDsSupportedVersion(String earliestDsSupportedVersion) {
    
    this.earliestDsSupportedVersion = earliestDsSupportedVersion;
    return this;
  }

   /**
   * Get earliestDsSupportedVersion
   * @return earliestDsSupportedVersion
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getEarliestDsSupportedVersion() {
    return earliestDsSupportedVersion;
  }


  public void setEarliestDsSupportedVersion(String earliestDsSupportedVersion) {
    this.earliestDsSupportedVersion = earliestDsSupportedVersion;
  }


  public ThreeDSVersion latestAcsSupportedVersion(String latestAcsSupportedVersion) {
    
    this.latestAcsSupportedVersion = latestAcsSupportedVersion;
    return this;
  }

   /**
   * Get latestAcsSupportedVersion
   * @return latestAcsSupportedVersion
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLatestAcsSupportedVersion() {
    return latestAcsSupportedVersion;
  }


  public void setLatestAcsSupportedVersion(String latestAcsSupportedVersion) {
    this.latestAcsSupportedVersion = latestAcsSupportedVersion;
  }


  public ThreeDSVersion latestDsSupportedVersion(String latestDsSupportedVersion) {
    
    this.latestDsSupportedVersion = latestDsSupportedVersion;
    return this;
  }

   /**
   * Get latestDsSupportedVersion
   * @return latestDsSupportedVersion
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLatestDsSupportedVersion() {
    return latestDsSupportedVersion;
  }


  public void setLatestDsSupportedVersion(String latestDsSupportedVersion) {
    this.latestDsSupportedVersion = latestDsSupportedVersion;
  }


  public ThreeDSVersion acsInformation(List<String> acsInformation) {
    
    this.acsInformation = acsInformation;
    return this;
  }

  public ThreeDSVersion addAcsInformationItem(String acsInformationItem) {
    if (this.acsInformation == null) {
      this.acsInformation = new ArrayList<>();
    }
    this.acsInformation.add(acsInformationItem);
    return this;
  }

   /**
   * Get acsInformation
   * @return acsInformation
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getAcsInformation() {
    return acsInformation;
  }


  public void setAcsInformation(List<String> acsInformation) {
    this.acsInformation = acsInformation;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ThreeDSVersion threeDSVersion = (ThreeDSVersion) o;
    return Objects.equals(this.recommendedVersion, threeDSVersion.recommendedVersion) &&
        Objects.equals(this.availableVersions, threeDSVersion.availableVersions) &&
        Objects.equals(this.earliestAcsSupportedVersion, threeDSVersion.earliestAcsSupportedVersion) &&
        Objects.equals(this.earliestDsSupportedVersion, threeDSVersion.earliestDsSupportedVersion) &&
        Objects.equals(this.latestAcsSupportedVersion, threeDSVersion.latestAcsSupportedVersion) &&
        Objects.equals(this.latestDsSupportedVersion, threeDSVersion.latestDsSupportedVersion) &&
        Objects.equals(this.acsInformation, threeDSVersion.acsInformation);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(recommendedVersion, availableVersions, earliestAcsSupportedVersion, earliestDsSupportedVersion, latestAcsSupportedVersion, latestDsSupportedVersion, acsInformation);
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
    sb.append("class ThreeDSVersion {\n");
    sb.append("    recommendedVersion: ").append(toIndentedString(recommendedVersion)).append("\n");
    sb.append("    availableVersions: ").append(toIndentedString(availableVersions)).append("\n");
    sb.append("    earliestAcsSupportedVersion: ").append(toIndentedString(earliestAcsSupportedVersion)).append("\n");
    sb.append("    earliestDsSupportedVersion: ").append(toIndentedString(earliestDsSupportedVersion)).append("\n");
    sb.append("    latestAcsSupportedVersion: ").append(toIndentedString(latestAcsSupportedVersion)).append("\n");
    sb.append("    latestDsSupportedVersion: ").append(toIndentedString(latestDsSupportedVersion)).append("\n");
    sb.append("    acsInformation: ").append(toIndentedString(acsInformation)).append("\n");
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
    openapiFields.add("recommended_version");
    openapiFields.add("available_versions");
    openapiFields.add("earliest_acs_supported_version");
    openapiFields.add("earliest_ds_supported_version");
    openapiFields.add("latest_acs_supported_version");
    openapiFields.add("latest_ds_supported_version");
    openapiFields.add("acs_information");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ThreeDSVersion
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ThreeDSVersion.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ThreeDSVersion is not found in the empty JSON string", ThreeDSVersion.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("recommended_version") != null && !jsonObj.get("recommended_version").isJsonNull()) && !jsonObj.get("recommended_version").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `recommended_version` to be a primitive type in the JSON string but got `%s`", jsonObj.get("recommended_version").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("available_versions") != null && !jsonObj.get("available_versions").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `available_versions` to be an array in the JSON string but got `%s`", jsonObj.get("available_versions").toString()));
      }
      if ((jsonObj.get("earliest_acs_supported_version") != null && !jsonObj.get("earliest_acs_supported_version").isJsonNull()) && !jsonObj.get("earliest_acs_supported_version").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `earliest_acs_supported_version` to be a primitive type in the JSON string but got `%s`", jsonObj.get("earliest_acs_supported_version").toString()));
      }
      if ((jsonObj.get("earliest_ds_supported_version") != null && !jsonObj.get("earliest_ds_supported_version").isJsonNull()) && !jsonObj.get("earliest_ds_supported_version").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `earliest_ds_supported_version` to be a primitive type in the JSON string but got `%s`", jsonObj.get("earliest_ds_supported_version").toString()));
      }
      if ((jsonObj.get("latest_acs_supported_version") != null && !jsonObj.get("latest_acs_supported_version").isJsonNull()) && !jsonObj.get("latest_acs_supported_version").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `latest_acs_supported_version` to be a primitive type in the JSON string but got `%s`", jsonObj.get("latest_acs_supported_version").toString()));
      }
      if ((jsonObj.get("latest_ds_supported_version") != null && !jsonObj.get("latest_ds_supported_version").isJsonNull()) && !jsonObj.get("latest_ds_supported_version").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `latest_ds_supported_version` to be a primitive type in the JSON string but got `%s`", jsonObj.get("latest_ds_supported_version").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("acs_information") != null && !jsonObj.get("acs_information").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `acs_information` to be an array in the JSON string but got `%s`", jsonObj.get("acs_information").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ThreeDSVersion.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ThreeDSVersion' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ThreeDSVersion> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ThreeDSVersion.class));

       return (TypeAdapter<T>) new TypeAdapter<ThreeDSVersion>() {
           @Override
           public void write(JsonWriter out, ThreeDSVersion value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ThreeDSVersion read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ThreeDSVersion given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ThreeDSVersion
  * @throws IOException if the JSON string is invalid with respect to ThreeDSVersion
  */
  public static ThreeDSVersion fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ThreeDSVersion.class);
  }

 /**
  * Convert an instance of ThreeDSVersion to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

