# TokenizeApi

All URIs are relative to *https://api.basistheory.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**tokenize**](TokenizeApi.md#tokenize) | **POST** /tokenize |  |


<a name="tokenize"></a>
# **tokenize**
> Object tokenize(body)



### Example
```java
// Import classes:
import com.basistheory.ApiClient;
import com.basistheory.ApiException;
import com.basistheory.Configuration;
import com.basistheory.auth.*;
import com.basistheory.models.*;
import com.basistheory.TokenizeApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.basistheory.com");
    
    // Configure API key authorization: ApiKey
    ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
    ApiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKey.setApiKeyPrefix("Token");

    TokenizeApi apiInstance = new TokenizeApi(defaultClient);
    Object body = null; // Object | 
    try {
      Object result = apiInstance.tokenize(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TokenizeApi#tokenize");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **body** | **Object**|  | [optional] |

### Return type

**Object**

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **409** | Conflict |  -  |

