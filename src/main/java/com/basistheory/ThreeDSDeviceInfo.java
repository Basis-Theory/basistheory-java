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
import com.basistheory.ThreeDSMobileSdkRenderOptions;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
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
 * ThreeDSDeviceInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ThreeDSDeviceInfo {
  public static final String SERIALIZED_NAME_BROWSER_ACCEPT_HEADER = "browser_accept_header";
  @SerializedName(SERIALIZED_NAME_BROWSER_ACCEPT_HEADER)
  private String browserAcceptHeader;

  public static final String SERIALIZED_NAME_BROWSER_IP = "browser_ip";
  @SerializedName(SERIALIZED_NAME_BROWSER_IP)
  private String browserIp;

  public static final String SERIALIZED_NAME_BROWSER_JAVASCRIPT_ENABLED = "browser_javascript_enabled";
  @SerializedName(SERIALIZED_NAME_BROWSER_JAVASCRIPT_ENABLED)
  private Boolean browserJavascriptEnabled;

  public static final String SERIALIZED_NAME_BROWSER_JAVA_ENABLED = "browser_java_enabled";
  @SerializedName(SERIALIZED_NAME_BROWSER_JAVA_ENABLED)
  private Boolean browserJavaEnabled;

  public static final String SERIALIZED_NAME_BROWSER_LANGUAGE = "browser_language";
  @SerializedName(SERIALIZED_NAME_BROWSER_LANGUAGE)
  private String browserLanguage;

  public static final String SERIALIZED_NAME_BROWSER_COLOR_DEPTH = "browser_color_depth";
  @SerializedName(SERIALIZED_NAME_BROWSER_COLOR_DEPTH)
  private String browserColorDepth;

  public static final String SERIALIZED_NAME_BROWSER_SCREEN_HEIGHT = "browser_screen_height";
  @SerializedName(SERIALIZED_NAME_BROWSER_SCREEN_HEIGHT)
  private String browserScreenHeight;

  public static final String SERIALIZED_NAME_BROWSER_SCREEN_WIDTH = "browser_screen_width";
  @SerializedName(SERIALIZED_NAME_BROWSER_SCREEN_WIDTH)
  private String browserScreenWidth;

  public static final String SERIALIZED_NAME_BROWSER_TZ = "browser_tz";
  @SerializedName(SERIALIZED_NAME_BROWSER_TZ)
  private String browserTz;

  public static final String SERIALIZED_NAME_BROWSER_USER_AGENT = "browser_user_agent";
  @SerializedName(SERIALIZED_NAME_BROWSER_USER_AGENT)
  private String browserUserAgent;

  public static final String SERIALIZED_NAME_SDK_TRANSACTION_ID = "sdk_transaction_id";
  @SerializedName(SERIALIZED_NAME_SDK_TRANSACTION_ID)
  private String sdkTransactionId;

  public static final String SERIALIZED_NAME_SDK_APPLICATION_ID = "sdk_application_id";
  @SerializedName(SERIALIZED_NAME_SDK_APPLICATION_ID)
  private String sdkApplicationId;

  public static final String SERIALIZED_NAME_SDK_ENCRYPTION_DATA = "sdk_encryption_data";
  @SerializedName(SERIALIZED_NAME_SDK_ENCRYPTION_DATA)
  private String sdkEncryptionData;

  public static final String SERIALIZED_NAME_SDK_EPHEMERAL_PUBLIC_KEY = "sdk_ephemeral_public_key";
  @SerializedName(SERIALIZED_NAME_SDK_EPHEMERAL_PUBLIC_KEY)
  private String sdkEphemeralPublicKey;

  public static final String SERIALIZED_NAME_SDK_MAX_TIMEOUT = "sdk_max_timeout";
  @SerializedName(SERIALIZED_NAME_SDK_MAX_TIMEOUT)
  private String sdkMaxTimeout;

  public static final String SERIALIZED_NAME_SDK_REFERENCE_NUMBER = "sdk_reference_number";
  @SerializedName(SERIALIZED_NAME_SDK_REFERENCE_NUMBER)
  private String sdkReferenceNumber;

  public static final String SERIALIZED_NAME_SDK_RENDER_OPTIONS = "sdk_render_options";
  @SerializedName(SERIALIZED_NAME_SDK_RENDER_OPTIONS)
  private ThreeDSMobileSdkRenderOptions sdkRenderOptions;

  public ThreeDSDeviceInfo() {
  }

  public ThreeDSDeviceInfo browserAcceptHeader(String browserAcceptHeader) {
    
    this.browserAcceptHeader = browserAcceptHeader;
    return this;
  }

   /**
   * Get browserAcceptHeader
   * @return browserAcceptHeader
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getBrowserAcceptHeader() {
    return browserAcceptHeader;
  }


  public void setBrowserAcceptHeader(String browserAcceptHeader) {
    this.browserAcceptHeader = browserAcceptHeader;
  }


  public ThreeDSDeviceInfo browserIp(String browserIp) {
    
    this.browserIp = browserIp;
    return this;
  }

   /**
   * Get browserIp
   * @return browserIp
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getBrowserIp() {
    return browserIp;
  }


  public void setBrowserIp(String browserIp) {
    this.browserIp = browserIp;
  }


  public ThreeDSDeviceInfo browserJavascriptEnabled(Boolean browserJavascriptEnabled) {
    
    this.browserJavascriptEnabled = browserJavascriptEnabled;
    return this;
  }

   /**
   * Get browserJavascriptEnabled
   * @return browserJavascriptEnabled
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getBrowserJavascriptEnabled() {
    return browserJavascriptEnabled;
  }


  public void setBrowserJavascriptEnabled(Boolean browserJavascriptEnabled) {
    this.browserJavascriptEnabled = browserJavascriptEnabled;
  }


  public ThreeDSDeviceInfo browserJavaEnabled(Boolean browserJavaEnabled) {
    
    this.browserJavaEnabled = browserJavaEnabled;
    return this;
  }

   /**
   * Get browserJavaEnabled
   * @return browserJavaEnabled
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getBrowserJavaEnabled() {
    return browserJavaEnabled;
  }


  public void setBrowserJavaEnabled(Boolean browserJavaEnabled) {
    this.browserJavaEnabled = browserJavaEnabled;
  }


  public ThreeDSDeviceInfo browserLanguage(String browserLanguage) {
    
    this.browserLanguage = browserLanguage;
    return this;
  }

   /**
   * Get browserLanguage
   * @return browserLanguage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getBrowserLanguage() {
    return browserLanguage;
  }


  public void setBrowserLanguage(String browserLanguage) {
    this.browserLanguage = browserLanguage;
  }


  public ThreeDSDeviceInfo browserColorDepth(String browserColorDepth) {
    
    this.browserColorDepth = browserColorDepth;
    return this;
  }

   /**
   * Get browserColorDepth
   * @return browserColorDepth
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getBrowserColorDepth() {
    return browserColorDepth;
  }


  public void setBrowserColorDepth(String browserColorDepth) {
    this.browserColorDepth = browserColorDepth;
  }


  public ThreeDSDeviceInfo browserScreenHeight(String browserScreenHeight) {
    
    this.browserScreenHeight = browserScreenHeight;
    return this;
  }

   /**
   * Get browserScreenHeight
   * @return browserScreenHeight
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getBrowserScreenHeight() {
    return browserScreenHeight;
  }


  public void setBrowserScreenHeight(String browserScreenHeight) {
    this.browserScreenHeight = browserScreenHeight;
  }


  public ThreeDSDeviceInfo browserScreenWidth(String browserScreenWidth) {
    
    this.browserScreenWidth = browserScreenWidth;
    return this;
  }

   /**
   * Get browserScreenWidth
   * @return browserScreenWidth
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getBrowserScreenWidth() {
    return browserScreenWidth;
  }


  public void setBrowserScreenWidth(String browserScreenWidth) {
    this.browserScreenWidth = browserScreenWidth;
  }


  public ThreeDSDeviceInfo browserTz(String browserTz) {
    
    this.browserTz = browserTz;
    return this;
  }

   /**
   * Get browserTz
   * @return browserTz
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getBrowserTz() {
    return browserTz;
  }


  public void setBrowserTz(String browserTz) {
    this.browserTz = browserTz;
  }


  public ThreeDSDeviceInfo browserUserAgent(String browserUserAgent) {
    
    this.browserUserAgent = browserUserAgent;
    return this;
  }

   /**
   * Get browserUserAgent
   * @return browserUserAgent
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getBrowserUserAgent() {
    return browserUserAgent;
  }


  public void setBrowserUserAgent(String browserUserAgent) {
    this.browserUserAgent = browserUserAgent;
  }


  public ThreeDSDeviceInfo sdkTransactionId(String sdkTransactionId) {
    
    this.sdkTransactionId = sdkTransactionId;
    return this;
  }

   /**
   * Get sdkTransactionId
   * @return sdkTransactionId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSdkTransactionId() {
    return sdkTransactionId;
  }


  public void setSdkTransactionId(String sdkTransactionId) {
    this.sdkTransactionId = sdkTransactionId;
  }


  public ThreeDSDeviceInfo sdkApplicationId(String sdkApplicationId) {
    
    this.sdkApplicationId = sdkApplicationId;
    return this;
  }

   /**
   * Get sdkApplicationId
   * @return sdkApplicationId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSdkApplicationId() {
    return sdkApplicationId;
  }


  public void setSdkApplicationId(String sdkApplicationId) {
    this.sdkApplicationId = sdkApplicationId;
  }


  public ThreeDSDeviceInfo sdkEncryptionData(String sdkEncryptionData) {
    
    this.sdkEncryptionData = sdkEncryptionData;
    return this;
  }

   /**
   * Get sdkEncryptionData
   * @return sdkEncryptionData
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSdkEncryptionData() {
    return sdkEncryptionData;
  }


  public void setSdkEncryptionData(String sdkEncryptionData) {
    this.sdkEncryptionData = sdkEncryptionData;
  }


  public ThreeDSDeviceInfo sdkEphemeralPublicKey(String sdkEphemeralPublicKey) {
    
    this.sdkEphemeralPublicKey = sdkEphemeralPublicKey;
    return this;
  }

   /**
   * Get sdkEphemeralPublicKey
   * @return sdkEphemeralPublicKey
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSdkEphemeralPublicKey() {
    return sdkEphemeralPublicKey;
  }


  public void setSdkEphemeralPublicKey(String sdkEphemeralPublicKey) {
    this.sdkEphemeralPublicKey = sdkEphemeralPublicKey;
  }


  public ThreeDSDeviceInfo sdkMaxTimeout(String sdkMaxTimeout) {
    
    this.sdkMaxTimeout = sdkMaxTimeout;
    return this;
  }

   /**
   * Get sdkMaxTimeout
   * @return sdkMaxTimeout
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSdkMaxTimeout() {
    return sdkMaxTimeout;
  }


  public void setSdkMaxTimeout(String sdkMaxTimeout) {
    this.sdkMaxTimeout = sdkMaxTimeout;
  }


  public ThreeDSDeviceInfo sdkReferenceNumber(String sdkReferenceNumber) {
    
    this.sdkReferenceNumber = sdkReferenceNumber;
    return this;
  }

   /**
   * Get sdkReferenceNumber
   * @return sdkReferenceNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSdkReferenceNumber() {
    return sdkReferenceNumber;
  }


  public void setSdkReferenceNumber(String sdkReferenceNumber) {
    this.sdkReferenceNumber = sdkReferenceNumber;
  }


  public ThreeDSDeviceInfo sdkRenderOptions(ThreeDSMobileSdkRenderOptions sdkRenderOptions) {
    
    this.sdkRenderOptions = sdkRenderOptions;
    return this;
  }

   /**
   * Get sdkRenderOptions
   * @return sdkRenderOptions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ThreeDSMobileSdkRenderOptions getSdkRenderOptions() {
    return sdkRenderOptions;
  }


  public void setSdkRenderOptions(ThreeDSMobileSdkRenderOptions sdkRenderOptions) {
    this.sdkRenderOptions = sdkRenderOptions;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ThreeDSDeviceInfo threeDSDeviceInfo = (ThreeDSDeviceInfo) o;
    return Objects.equals(this.browserAcceptHeader, threeDSDeviceInfo.browserAcceptHeader) &&
        Objects.equals(this.browserIp, threeDSDeviceInfo.browserIp) &&
        Objects.equals(this.browserJavascriptEnabled, threeDSDeviceInfo.browserJavascriptEnabled) &&
        Objects.equals(this.browserJavaEnabled, threeDSDeviceInfo.browserJavaEnabled) &&
        Objects.equals(this.browserLanguage, threeDSDeviceInfo.browserLanguage) &&
        Objects.equals(this.browserColorDepth, threeDSDeviceInfo.browserColorDepth) &&
        Objects.equals(this.browserScreenHeight, threeDSDeviceInfo.browserScreenHeight) &&
        Objects.equals(this.browserScreenWidth, threeDSDeviceInfo.browserScreenWidth) &&
        Objects.equals(this.browserTz, threeDSDeviceInfo.browserTz) &&
        Objects.equals(this.browserUserAgent, threeDSDeviceInfo.browserUserAgent) &&
        Objects.equals(this.sdkTransactionId, threeDSDeviceInfo.sdkTransactionId) &&
        Objects.equals(this.sdkApplicationId, threeDSDeviceInfo.sdkApplicationId) &&
        Objects.equals(this.sdkEncryptionData, threeDSDeviceInfo.sdkEncryptionData) &&
        Objects.equals(this.sdkEphemeralPublicKey, threeDSDeviceInfo.sdkEphemeralPublicKey) &&
        Objects.equals(this.sdkMaxTimeout, threeDSDeviceInfo.sdkMaxTimeout) &&
        Objects.equals(this.sdkReferenceNumber, threeDSDeviceInfo.sdkReferenceNumber) &&
        Objects.equals(this.sdkRenderOptions, threeDSDeviceInfo.sdkRenderOptions);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(browserAcceptHeader, browserIp, browserJavascriptEnabled, browserJavaEnabled, browserLanguage, browserColorDepth, browserScreenHeight, browserScreenWidth, browserTz, browserUserAgent, sdkTransactionId, sdkApplicationId, sdkEncryptionData, sdkEphemeralPublicKey, sdkMaxTimeout, sdkReferenceNumber, sdkRenderOptions);
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
    sb.append("class ThreeDSDeviceInfo {\n");
    sb.append("    browserAcceptHeader: ").append(toIndentedString(browserAcceptHeader)).append("\n");
    sb.append("    browserIp: ").append(toIndentedString(browserIp)).append("\n");
    sb.append("    browserJavascriptEnabled: ").append(toIndentedString(browserJavascriptEnabled)).append("\n");
    sb.append("    browserJavaEnabled: ").append(toIndentedString(browserJavaEnabled)).append("\n");
    sb.append("    browserLanguage: ").append(toIndentedString(browserLanguage)).append("\n");
    sb.append("    browserColorDepth: ").append(toIndentedString(browserColorDepth)).append("\n");
    sb.append("    browserScreenHeight: ").append(toIndentedString(browserScreenHeight)).append("\n");
    sb.append("    browserScreenWidth: ").append(toIndentedString(browserScreenWidth)).append("\n");
    sb.append("    browserTz: ").append(toIndentedString(browserTz)).append("\n");
    sb.append("    browserUserAgent: ").append(toIndentedString(browserUserAgent)).append("\n");
    sb.append("    sdkTransactionId: ").append(toIndentedString(sdkTransactionId)).append("\n");
    sb.append("    sdkApplicationId: ").append(toIndentedString(sdkApplicationId)).append("\n");
    sb.append("    sdkEncryptionData: ").append(toIndentedString(sdkEncryptionData)).append("\n");
    sb.append("    sdkEphemeralPublicKey: ").append(toIndentedString(sdkEphemeralPublicKey)).append("\n");
    sb.append("    sdkMaxTimeout: ").append(toIndentedString(sdkMaxTimeout)).append("\n");
    sb.append("    sdkReferenceNumber: ").append(toIndentedString(sdkReferenceNumber)).append("\n");
    sb.append("    sdkRenderOptions: ").append(toIndentedString(sdkRenderOptions)).append("\n");
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
    openapiFields.add("browser_accept_header");
    openapiFields.add("browser_ip");
    openapiFields.add("browser_javascript_enabled");
    openapiFields.add("browser_java_enabled");
    openapiFields.add("browser_language");
    openapiFields.add("browser_color_depth");
    openapiFields.add("browser_screen_height");
    openapiFields.add("browser_screen_width");
    openapiFields.add("browser_tz");
    openapiFields.add("browser_user_agent");
    openapiFields.add("sdk_transaction_id");
    openapiFields.add("sdk_application_id");
    openapiFields.add("sdk_encryption_data");
    openapiFields.add("sdk_ephemeral_public_key");
    openapiFields.add("sdk_max_timeout");
    openapiFields.add("sdk_reference_number");
    openapiFields.add("sdk_render_options");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ThreeDSDeviceInfo
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ThreeDSDeviceInfo.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ThreeDSDeviceInfo is not found in the empty JSON string", ThreeDSDeviceInfo.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("browser_accept_header") != null && !jsonObj.get("browser_accept_header").isJsonNull()) && !jsonObj.get("browser_accept_header").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `browser_accept_header` to be a primitive type in the JSON string but got `%s`", jsonObj.get("browser_accept_header").toString()));
      }
      if ((jsonObj.get("browser_ip") != null && !jsonObj.get("browser_ip").isJsonNull()) && !jsonObj.get("browser_ip").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `browser_ip` to be a primitive type in the JSON string but got `%s`", jsonObj.get("browser_ip").toString()));
      }
      if ((jsonObj.get("browser_language") != null && !jsonObj.get("browser_language").isJsonNull()) && !jsonObj.get("browser_language").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `browser_language` to be a primitive type in the JSON string but got `%s`", jsonObj.get("browser_language").toString()));
      }
      if ((jsonObj.get("browser_color_depth") != null && !jsonObj.get("browser_color_depth").isJsonNull()) && !jsonObj.get("browser_color_depth").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `browser_color_depth` to be a primitive type in the JSON string but got `%s`", jsonObj.get("browser_color_depth").toString()));
      }
      if ((jsonObj.get("browser_screen_height") != null && !jsonObj.get("browser_screen_height").isJsonNull()) && !jsonObj.get("browser_screen_height").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `browser_screen_height` to be a primitive type in the JSON string but got `%s`", jsonObj.get("browser_screen_height").toString()));
      }
      if ((jsonObj.get("browser_screen_width") != null && !jsonObj.get("browser_screen_width").isJsonNull()) && !jsonObj.get("browser_screen_width").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `browser_screen_width` to be a primitive type in the JSON string but got `%s`", jsonObj.get("browser_screen_width").toString()));
      }
      if ((jsonObj.get("browser_tz") != null && !jsonObj.get("browser_tz").isJsonNull()) && !jsonObj.get("browser_tz").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `browser_tz` to be a primitive type in the JSON string but got `%s`", jsonObj.get("browser_tz").toString()));
      }
      if ((jsonObj.get("browser_user_agent") != null && !jsonObj.get("browser_user_agent").isJsonNull()) && !jsonObj.get("browser_user_agent").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `browser_user_agent` to be a primitive type in the JSON string but got `%s`", jsonObj.get("browser_user_agent").toString()));
      }
      if ((jsonObj.get("sdk_transaction_id") != null && !jsonObj.get("sdk_transaction_id").isJsonNull()) && !jsonObj.get("sdk_transaction_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sdk_transaction_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sdk_transaction_id").toString()));
      }
      if ((jsonObj.get("sdk_application_id") != null && !jsonObj.get("sdk_application_id").isJsonNull()) && !jsonObj.get("sdk_application_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sdk_application_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sdk_application_id").toString()));
      }
      if ((jsonObj.get("sdk_encryption_data") != null && !jsonObj.get("sdk_encryption_data").isJsonNull()) && !jsonObj.get("sdk_encryption_data").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sdk_encryption_data` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sdk_encryption_data").toString()));
      }
      if ((jsonObj.get("sdk_ephemeral_public_key") != null && !jsonObj.get("sdk_ephemeral_public_key").isJsonNull()) && !jsonObj.get("sdk_ephemeral_public_key").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sdk_ephemeral_public_key` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sdk_ephemeral_public_key").toString()));
      }
      if ((jsonObj.get("sdk_max_timeout") != null && !jsonObj.get("sdk_max_timeout").isJsonNull()) && !jsonObj.get("sdk_max_timeout").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sdk_max_timeout` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sdk_max_timeout").toString()));
      }
      if ((jsonObj.get("sdk_reference_number") != null && !jsonObj.get("sdk_reference_number").isJsonNull()) && !jsonObj.get("sdk_reference_number").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sdk_reference_number` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sdk_reference_number").toString()));
      }
      // validate the optional field `sdk_render_options`
      if (jsonObj.get("sdk_render_options") != null && !jsonObj.get("sdk_render_options").isJsonNull()) {
        ThreeDSMobileSdkRenderOptions.validateJsonObject(jsonObj.getAsJsonObject("sdk_render_options"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ThreeDSDeviceInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ThreeDSDeviceInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ThreeDSDeviceInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ThreeDSDeviceInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<ThreeDSDeviceInfo>() {
           @Override
           public void write(JsonWriter out, ThreeDSDeviceInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ThreeDSDeviceInfo read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ThreeDSDeviceInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ThreeDSDeviceInfo
  * @throws IOException if the JSON string is invalid with respect to ThreeDSDeviceInfo
  */
  public static ThreeDSDeviceInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ThreeDSDeviceInfo.class);
  }

 /**
  * Convert an instance of ThreeDSDeviceInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
