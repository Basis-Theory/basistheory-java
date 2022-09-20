# PermissionsApi

All URIs are relative to *https://api.basistheory.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**get**](PermissionsApi.md#get) | **GET** /permissions |  |


<a name="get"></a>
# **get**
> List&lt;Permission&gt; get(applicationType, version)



### Example
```java
// Import classes:
import com.basistheory.ApiClient;
import com.basistheory.ApiException;
import com.basistheory.Configuration;
import com.basistheory.auth.*;
import com.basistheory.models.*;
import com.basistheory.PermissionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.basistheory.com");
    
    // Configure API key authorization: ApiKey
    ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
    ApiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKey.setApiKeyPrefix("Token");

    PermissionsApi apiInstance = new PermissionsApi(defaultClient);
    String applicationType = "applicationType_example"; // String | 
    Integer version = 56; // Integer | 
    try {
      List<Permission> result = apiInstance.get(applicationType, version);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PermissionsApi#get");
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
| **applicationType** | **String**|  | [optional] |
| **version** | **Integer**|  | [optional] |

### Return type

[**List&lt;Permission&gt;**](Permission.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |

