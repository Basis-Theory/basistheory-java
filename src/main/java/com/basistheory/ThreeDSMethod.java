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
 * ThreeDSMethod
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ThreeDSMethod {
  public static final String SERIALIZED_NAME_METHOD_URL = "method_url";
  @SerializedName(SERIALIZED_NAME_METHOD_URL)
  private String methodUrl;

  public static final String SERIALIZED_NAME_METHOD_COMPLETION_INDICATOR = "method_completion_indicator";
  @SerializedName(SERIALIZED_NAME_METHOD_COMPLETION_INDICATOR)
  private String methodCompletionIndicator;

  public ThreeDSMethod() {
  }

  public ThreeDSMethod methodUrl(String methodUrl) {
    
    this.methodUrl = methodUrl;
    return this;
  }

   /**
   * Get methodUrl
   * @return methodUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getMethodUrl() {
    return methodUrl;
  }


  public void setMethodUrl(String methodUrl) {
    this.methodUrl = methodUrl;
  }


  public ThreeDSMethod methodCompletionIndicator(String methodCompletionIndicator) {
    
    this.methodCompletionIndicator = methodCompletionIndicator;
    return this;
  }

   /**
   * Get methodCompletionIndicator
   * @return methodCompletionIndicator
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getMethodCompletionIndicator() {
    return methodCompletionIndicator;
  }


  public void setMethodCompletionIndicator(String methodCompletionIndicator) {
    this.methodCompletionIndicator = methodCompletionIndicator;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ThreeDSMethod threeDSMethod = (ThreeDSMethod) o;
    return Objects.equals(this.methodUrl, threeDSMethod.methodUrl) &&
        Objects.equals(this.methodCompletionIndicator, threeDSMethod.methodCompletionIndicator);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(methodUrl, methodCompletionIndicator);
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
    sb.append("class ThreeDSMethod {\n");
    sb.append("    methodUrl: ").append(toIndentedString(methodUrl)).append("\n");
    sb.append("    methodCompletionIndicator: ").append(toIndentedString(methodCompletionIndicator)).append("\n");
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
    openapiFields.add("method_url");
    openapiFields.add("method_completion_indicator");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ThreeDSMethod
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ThreeDSMethod.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ThreeDSMethod is not found in the empty JSON string", ThreeDSMethod.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("method_url") != null && !jsonObj.get("method_url").isJsonNull()) && !jsonObj.get("method_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `method_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("method_url").toString()));
      }
      if ((jsonObj.get("method_completion_indicator") != null && !jsonObj.get("method_completion_indicator").isJsonNull()) && !jsonObj.get("method_completion_indicator").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `method_completion_indicator` to be a primitive type in the JSON string but got `%s`", jsonObj.get("method_completion_indicator").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ThreeDSMethod.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ThreeDSMethod' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ThreeDSMethod> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ThreeDSMethod.class));

       return (TypeAdapter<T>) new TypeAdapter<ThreeDSMethod>() {
           @Override
           public void write(JsonWriter out, ThreeDSMethod value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ThreeDSMethod read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ThreeDSMethod given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ThreeDSMethod
  * @throws IOException if the JSON string is invalid with respect to ThreeDSMethod
  */
  public static ThreeDSMethod fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ThreeDSMethod.class);
  }

 /**
  * Convert an instance of ThreeDSMethod to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
