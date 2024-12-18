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
import com.basistheory.BinDetails;
import com.basistheory.CardDetails;
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
 * TokenEnrichments
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class TokenEnrichments {
  public static final String SERIALIZED_NAME_BIN_DETAILS = "bin_details";
  @SerializedName(SERIALIZED_NAME_BIN_DETAILS)
  private BinDetails binDetails;

  public static final String SERIALIZED_NAME_CARD_DETAILS = "card_details";
  @SerializedName(SERIALIZED_NAME_CARD_DETAILS)
  private CardDetails cardDetails;

  public TokenEnrichments() {
  }

  public TokenEnrichments binDetails(BinDetails binDetails) {
    
    this.binDetails = binDetails;
    return this;
  }

   /**
   * Get binDetails
   * @return binDetails
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BinDetails getBinDetails() {
    return binDetails;
  }


  public void setBinDetails(BinDetails binDetails) {
    this.binDetails = binDetails;
  }


  public TokenEnrichments cardDetails(CardDetails cardDetails) {
    
    this.cardDetails = cardDetails;
    return this;
  }

   /**
   * Get cardDetails
   * @return cardDetails
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public CardDetails getCardDetails() {
    return cardDetails;
  }


  public void setCardDetails(CardDetails cardDetails) {
    this.cardDetails = cardDetails;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TokenEnrichments tokenEnrichments = (TokenEnrichments) o;
    return Objects.equals(this.binDetails, tokenEnrichments.binDetails) &&
        Objects.equals(this.cardDetails, tokenEnrichments.cardDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(binDetails, cardDetails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TokenEnrichments {\n");
    sb.append("    binDetails: ").append(toIndentedString(binDetails)).append("\n");
    sb.append("    cardDetails: ").append(toIndentedString(cardDetails)).append("\n");
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
    openapiFields.add("bin_details");
    openapiFields.add("card_details");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to TokenEnrichments
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!TokenEnrichments.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TokenEnrichments is not found in the empty JSON string", TokenEnrichments.openapiRequiredFields.toString()));
        }
      }
      // validate the optional field `bin_details`
      if (jsonObj.get("bin_details") != null && !jsonObj.get("bin_details").isJsonNull()) {
        BinDetails.validateJsonObject(jsonObj.getAsJsonObject("bin_details"));
      }
      // validate the optional field `card_details`
      if (jsonObj.get("card_details") != null && !jsonObj.get("card_details").isJsonNull()) {
        CardDetails.validateJsonObject(jsonObj.getAsJsonObject("card_details"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TokenEnrichments.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TokenEnrichments' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TokenEnrichments> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TokenEnrichments.class));

       return (TypeAdapter<T>) new TypeAdapter<TokenEnrichments>() {
           @Override
           public void write(JsonWriter out, TokenEnrichments value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TokenEnrichments read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of TokenEnrichments given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TokenEnrichments
  * @throws IOException if the JSON string is invalid with respect to TokenEnrichments
  */
  public static TokenEnrichments fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TokenEnrichments.class);
  }

 /**
  * Convert an instance of TokenEnrichments to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

