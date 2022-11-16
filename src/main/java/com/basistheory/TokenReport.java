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
import com.basistheory.MonthlyActiveTokenHistory;
import com.basistheory.TokenMetrics;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
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
 * TokenReport
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-16T23:11:18.853007Z[Etc/UTC]")
public class TokenReport {
  public static final String SERIALIZED_NAME_INCLUDED_MONTHLY_ACTIVE_TOKENS = "included_monthly_active_tokens";
  @SerializedName(SERIALIZED_NAME_INCLUDED_MONTHLY_ACTIVE_TOKENS)
  private Long includedMonthlyActiveTokens;

  public static final String SERIALIZED_NAME_MONTHLY_ACTIVE_TOKENS = "monthly_active_tokens";
  @SerializedName(SERIALIZED_NAME_MONTHLY_ACTIVE_TOKENS)
  private Long monthlyActiveTokens;

  public static final String SERIALIZED_NAME_METRICS_BY_TYPE = "metrics_by_type";
  @SerializedName(SERIALIZED_NAME_METRICS_BY_TYPE)
  private Map<String, TokenMetrics> metricsByType = null;

  public static final String SERIALIZED_NAME_MONTHLY_ACTIVE_TOKEN_HISTORY = "monthly_active_token_history";
  @SerializedName(SERIALIZED_NAME_MONTHLY_ACTIVE_TOKEN_HISTORY)
  private List<MonthlyActiveTokenHistory> monthlyActiveTokenHistory = null;

  public TokenReport() {
  }

  public TokenReport includedMonthlyActiveTokens(Long includedMonthlyActiveTokens) {
    
    this.includedMonthlyActiveTokens = includedMonthlyActiveTokens;
    return this;
  }

   /**
   * Get includedMonthlyActiveTokens
   * minimum: 0
   * maximum: 2147483647
   * @return includedMonthlyActiveTokens
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getIncludedMonthlyActiveTokens() {
    return includedMonthlyActiveTokens;
  }


  public void setIncludedMonthlyActiveTokens(Long includedMonthlyActiveTokens) {
    this.includedMonthlyActiveTokens = includedMonthlyActiveTokens;
  }


  public TokenReport monthlyActiveTokens(Long monthlyActiveTokens) {
    
    this.monthlyActiveTokens = monthlyActiveTokens;
    return this;
  }

   /**
   * Get monthlyActiveTokens
   * minimum: 0
   * @return monthlyActiveTokens
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getMonthlyActiveTokens() {
    return monthlyActiveTokens;
  }


  public void setMonthlyActiveTokens(Long monthlyActiveTokens) {
    this.monthlyActiveTokens = monthlyActiveTokens;
  }


  public TokenReport metricsByType(Map<String, TokenMetrics> metricsByType) {
    
    this.metricsByType = metricsByType;
    return this;
  }

  public TokenReport putMetricsByTypeItem(String key, TokenMetrics metricsByTypeItem) {
    if (this.metricsByType == null) {
      this.metricsByType = new HashMap<>();
    }
    this.metricsByType.put(key, metricsByTypeItem);
    return this;
  }

   /**
   * Get metricsByType
   * @return metricsByType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Map<String, TokenMetrics> getMetricsByType() {
    return metricsByType;
  }


  public void setMetricsByType(Map<String, TokenMetrics> metricsByType) {
    this.metricsByType = metricsByType;
  }


  public TokenReport monthlyActiveTokenHistory(List<MonthlyActiveTokenHistory> monthlyActiveTokenHistory) {
    
    this.monthlyActiveTokenHistory = monthlyActiveTokenHistory;
    return this;
  }

  public TokenReport addMonthlyActiveTokenHistoryItem(MonthlyActiveTokenHistory monthlyActiveTokenHistoryItem) {
    if (this.monthlyActiveTokenHistory == null) {
      this.monthlyActiveTokenHistory = new ArrayList<>();
    }
    this.monthlyActiveTokenHistory.add(monthlyActiveTokenHistoryItem);
    return this;
  }

   /**
   * Get monthlyActiveTokenHistory
   * @return monthlyActiveTokenHistory
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<MonthlyActiveTokenHistory> getMonthlyActiveTokenHistory() {
    return monthlyActiveTokenHistory;
  }


  public void setMonthlyActiveTokenHistory(List<MonthlyActiveTokenHistory> monthlyActiveTokenHistory) {
    this.monthlyActiveTokenHistory = monthlyActiveTokenHistory;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TokenReport tokenReport = (TokenReport) o;
    return Objects.equals(this.includedMonthlyActiveTokens, tokenReport.includedMonthlyActiveTokens) &&
        Objects.equals(this.monthlyActiveTokens, tokenReport.monthlyActiveTokens) &&
        Objects.equals(this.metricsByType, tokenReport.metricsByType) &&
        Objects.equals(this.monthlyActiveTokenHistory, tokenReport.monthlyActiveTokenHistory);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(includedMonthlyActiveTokens, monthlyActiveTokens, metricsByType, monthlyActiveTokenHistory);
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
    sb.append("class TokenReport {\n");
    sb.append("    includedMonthlyActiveTokens: ").append(toIndentedString(includedMonthlyActiveTokens)).append("\n");
    sb.append("    monthlyActiveTokens: ").append(toIndentedString(monthlyActiveTokens)).append("\n");
    sb.append("    metricsByType: ").append(toIndentedString(metricsByType)).append("\n");
    sb.append("    monthlyActiveTokenHistory: ").append(toIndentedString(monthlyActiveTokenHistory)).append("\n");
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
    openapiFields.add("included_monthly_active_tokens");
    openapiFields.add("monthly_active_tokens");
    openapiFields.add("metrics_by_type");
    openapiFields.add("monthly_active_token_history");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to TokenReport
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!TokenReport.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TokenReport is not found in the empty JSON string", TokenReport.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!TokenReport.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TokenReport` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("monthly_active_token_history") != null && !jsonObj.get("monthly_active_token_history").isJsonNull()) {
        JsonArray jsonArraymonthlyActiveTokenHistory = jsonObj.getAsJsonArray("monthly_active_token_history");
        if (jsonArraymonthlyActiveTokenHistory != null) {
          // ensure the json data is an array
          if (!jsonObj.get("monthly_active_token_history").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `monthly_active_token_history` to be an array in the JSON string but got `%s`", jsonObj.get("monthly_active_token_history").toString()));
          }

          // validate the optional field `monthly_active_token_history` (array)
          for (int i = 0; i < jsonArraymonthlyActiveTokenHistory.size(); i++) {
            MonthlyActiveTokenHistory.validateJsonObject(jsonArraymonthlyActiveTokenHistory.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TokenReport.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TokenReport' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TokenReport> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TokenReport.class));

       return (TypeAdapter<T>) new TypeAdapter<TokenReport>() {
           @Override
           public void write(JsonWriter out, TokenReport value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TokenReport read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of TokenReport given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TokenReport
  * @throws IOException if the JSON string is invalid with respect to TokenReport
  */
  public static TokenReport fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TokenReport.class);
  }

 /**
  * Convert an instance of TokenReport to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

