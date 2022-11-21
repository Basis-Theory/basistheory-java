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
import com.basistheory.ReactorFormulaConfiguration;
import com.basistheory.ReactorFormulaRequestParameter;
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
 * UpdateReactorFormulaRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-12-30T19:58:09.260536Z[Etc/UTC]")
public class UpdateReactorFormulaRequest {
  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_ICON = "icon";
  @SerializedName(SERIALIZED_NAME_ICON)
  private String icon;

  public static final String SERIALIZED_NAME_CODE = "code";
  @SerializedName(SERIALIZED_NAME_CODE)
  private String code;

  public static final String SERIALIZED_NAME_CONFIGURATION = "configuration";
  @SerializedName(SERIALIZED_NAME_CONFIGURATION)
  private List<ReactorFormulaConfiguration> _configuration = null;

  public static final String SERIALIZED_NAME_REQUEST_PARAMETERS = "request_parameters";
  @SerializedName(SERIALIZED_NAME_REQUEST_PARAMETERS)
  private List<ReactorFormulaRequestParameter> requestParameters = null;

  public UpdateReactorFormulaRequest() {
  }

  public UpdateReactorFormulaRequest type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
  }


  public UpdateReactorFormulaRequest name(String name) {
    
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


  public UpdateReactorFormulaRequest description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public UpdateReactorFormulaRequest icon(String icon) {
    
    this.icon = icon;
    return this;
  }

   /**
   * Get icon
   * @return icon
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getIcon() {
    return icon;
  }


  public void setIcon(String icon) {
    this.icon = icon;
  }


  public UpdateReactorFormulaRequest code(String code) {
    
    this.code = code;
    return this;
  }

   /**
   * Get code
   * @return code
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCode() {
    return code;
  }


  public void setCode(String code) {
    this.code = code;
  }


  public UpdateReactorFormulaRequest _configuration(List<ReactorFormulaConfiguration> _configuration) {
    
    this._configuration = _configuration;
    return this;
  }

  public UpdateReactorFormulaRequest addConfigurationItem(ReactorFormulaConfiguration _configurationItem) {
    if (this._configuration == null) {
      this._configuration = new ArrayList<>();
    }
    this._configuration.add(_configurationItem);
    return this;
  }

   /**
   * Get _configuration
   * @return _configuration
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<ReactorFormulaConfiguration> getConfiguration() {
    return _configuration;
  }


  public void setConfiguration(List<ReactorFormulaConfiguration> _configuration) {
    this._configuration = _configuration;
  }


  public UpdateReactorFormulaRequest requestParameters(List<ReactorFormulaRequestParameter> requestParameters) {
    
    this.requestParameters = requestParameters;
    return this;
  }

  public UpdateReactorFormulaRequest addRequestParametersItem(ReactorFormulaRequestParameter requestParametersItem) {
    if (this.requestParameters == null) {
      this.requestParameters = new ArrayList<>();
    }
    this.requestParameters.add(requestParametersItem);
    return this;
  }

   /**
   * Get requestParameters
   * @return requestParameters
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<ReactorFormulaRequestParameter> getRequestParameters() {
    return requestParameters;
  }


  public void setRequestParameters(List<ReactorFormulaRequestParameter> requestParameters) {
    this.requestParameters = requestParameters;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateReactorFormulaRequest updateReactorFormulaRequest = (UpdateReactorFormulaRequest) o;
    return Objects.equals(this.type, updateReactorFormulaRequest.type) &&
        Objects.equals(this.name, updateReactorFormulaRequest.name) &&
        Objects.equals(this.description, updateReactorFormulaRequest.description) &&
        Objects.equals(this.icon, updateReactorFormulaRequest.icon) &&
        Objects.equals(this.code, updateReactorFormulaRequest.code) &&
        Objects.equals(this._configuration, updateReactorFormulaRequest._configuration) &&
        Objects.equals(this.requestParameters, updateReactorFormulaRequest.requestParameters);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, name, description, icon, code, _configuration, requestParameters);
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
    sb.append("class UpdateReactorFormulaRequest {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    icon: ").append(toIndentedString(icon)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    _configuration: ").append(toIndentedString(_configuration)).append("\n");
    sb.append("    requestParameters: ").append(toIndentedString(requestParameters)).append("\n");
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
    openapiFields.add("type");
    openapiFields.add("name");
    openapiFields.add("description");
    openapiFields.add("icon");
    openapiFields.add("code");
    openapiFields.add("configuration");
    openapiFields.add("request_parameters");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("type");
    openapiRequiredFields.add("name");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to UpdateReactorFormulaRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!UpdateReactorFormulaRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in UpdateReactorFormulaRequest is not found in the empty JSON string", UpdateReactorFormulaRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!UpdateReactorFormulaRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `UpdateReactorFormulaRequest` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : UpdateReactorFormulaRequest.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if ((jsonObj.get("icon") != null && !jsonObj.get("icon").isJsonNull()) && !jsonObj.get("icon").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `icon` to be a primitive type in the JSON string but got `%s`", jsonObj.get("icon").toString()));
      }
      if ((jsonObj.get("code") != null && !jsonObj.get("code").isJsonNull()) && !jsonObj.get("code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("code").toString()));
      }
      if (jsonObj.get("configuration") != null && !jsonObj.get("configuration").isJsonNull()) {
        JsonArray jsonArray_configuration = jsonObj.getAsJsonArray("configuration");
        if (jsonArray_configuration != null) {
          // ensure the json data is an array
          if (!jsonObj.get("configuration").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `configuration` to be an array in the JSON string but got `%s`", jsonObj.get("configuration").toString()));
          }

          // validate the optional field `configuration` (array)
          for (int i = 0; i < jsonArray_configuration.size(); i++) {
            ReactorFormulaConfiguration.validateJsonObject(jsonArray_configuration.get(i).getAsJsonObject());
          };
        }
      }
      if (jsonObj.get("request_parameters") != null && !jsonObj.get("request_parameters").isJsonNull()) {
        JsonArray jsonArrayrequestParameters = jsonObj.getAsJsonArray("request_parameters");
        if (jsonArrayrequestParameters != null) {
          // ensure the json data is an array
          if (!jsonObj.get("request_parameters").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `request_parameters` to be an array in the JSON string but got `%s`", jsonObj.get("request_parameters").toString()));
          }

          // validate the optional field `request_parameters` (array)
          for (int i = 0; i < jsonArrayrequestParameters.size(); i++) {
            ReactorFormulaRequestParameter.validateJsonObject(jsonArrayrequestParameters.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UpdateReactorFormulaRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UpdateReactorFormulaRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UpdateReactorFormulaRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UpdateReactorFormulaRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<UpdateReactorFormulaRequest>() {
           @Override
           public void write(JsonWriter out, UpdateReactorFormulaRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public UpdateReactorFormulaRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of UpdateReactorFormulaRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of UpdateReactorFormulaRequest
  * @throws IOException if the JSON string is invalid with respect to UpdateReactorFormulaRequest
  */
  public static UpdateReactorFormulaRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UpdateReactorFormulaRequest.class);
  }

 /**
  * Convert an instance of UpdateReactorFormulaRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

