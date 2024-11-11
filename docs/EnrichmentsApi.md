# EnrichmentsApi

All URIs are relative to *https://api.basistheory.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**bankAccountVerify**](EnrichmentsApi.md#bankAccountVerify) | **POST** /enrichments/bank-account-verify |  |


<a name="bankAccountVerify"></a>
# **bankAccountVerify**
> bankAccountVerify(bankVerificationRequest)



### Example
```java
// Import classes:
import com.basistheory.ApiClient;
import com.basistheory.ApiException;
import com.basistheory.Configuration;
import com.basistheory.auth.*;
import com.basistheory.models.*;
import com.basistheory.EnrichmentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.basistheory.com");
    
    // Configure API key authorization: ApiKey
    ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
    ApiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKey.setApiKeyPrefix("Token");

    EnrichmentsApi apiInstance = new EnrichmentsApi(defaultClient);
    BankVerificationRequest bankVerificationRequest = new BankVerificationRequest(); // BankVerificationRequest | 
    try {
      apiInstance.bankAccountVerify(bankVerificationRequest);
    } catch (ApiException e) {
      System.err.println("Exception when calling EnrichmentsApi#bankAccountVerify");
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
| **bankVerificationRequest** | [**BankVerificationRequest**](BankVerificationRequest.md)|  | |

### Return type

null (empty response body)

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

