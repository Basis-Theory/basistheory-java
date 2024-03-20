# ThreeDsApi

All URIs are relative to *https://api.basistheory.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**threeDSAuthenticateSession**](ThreeDsApi.md#threeDSAuthenticateSession) | **POST** /3ds/sessions/{sessionId}/authenticate |  |
| [**threeDSGetChallengeResult**](ThreeDsApi.md#threeDSGetChallengeResult) | **GET** /3ds/sessions/{sessionId}/challenge-result |  |


<a name="threeDSAuthenticateSession"></a>
# **threeDSAuthenticateSession**
> ThreeDSAuthentication threeDSAuthenticateSession(sessionId, authenticateThreeDSSessionRequest)



### Example
```java
// Import classes:
import com.basistheory.ApiClient;
import com.basistheory.ApiException;
import com.basistheory.Configuration;
import com.basistheory.auth.*;
import com.basistheory.models.*;
import com.basistheory.ThreeDsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.basistheory.com");
    
    // Configure API key authorization: ApiKey
    ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
    ApiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKey.setApiKeyPrefix("Token");

    ThreeDsApi apiInstance = new ThreeDsApi(defaultClient);
    UUID sessionId = UUID.randomUUID(); // UUID | 
    AuthenticateThreeDSSessionRequest authenticateThreeDSSessionRequest = new AuthenticateThreeDSSessionRequest(); // AuthenticateThreeDSSessionRequest | 
    try {
      ThreeDSAuthentication result = apiInstance.threeDSAuthenticateSession(sessionId, authenticateThreeDSSessionRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ThreeDsApi#threeDSAuthenticateSession");
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
| **sessionId** | **UUID**|  | |
| **authenticateThreeDSSessionRequest** | [**AuthenticateThreeDSSessionRequest**](AuthenticateThreeDSSessionRequest.md)|  | [optional] |

### Return type

[**ThreeDSAuthentication**](ThreeDSAuthentication.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |

<a name="threeDSGetChallengeResult"></a>
# **threeDSGetChallengeResult**
> ThreeDSAuthentication threeDSGetChallengeResult(sessionId)



### Example
```java
// Import classes:
import com.basistheory.ApiClient;
import com.basistheory.ApiException;
import com.basistheory.Configuration;
import com.basistheory.auth.*;
import com.basistheory.models.*;
import com.basistheory.ThreeDsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.basistheory.com");
    
    // Configure API key authorization: ApiKey
    ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
    ApiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKey.setApiKeyPrefix("Token");

    ThreeDsApi apiInstance = new ThreeDsApi(defaultClient);
    UUID sessionId = UUID.randomUUID(); // UUID | 
    try {
      ThreeDSAuthentication result = apiInstance.threeDSGetChallengeResult(sessionId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ThreeDsApi#threeDSGetChallengeResult");
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
| **sessionId** | **UUID**|  | |

### Return type

[**ThreeDSAuthentication**](ThreeDSAuthentication.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |

