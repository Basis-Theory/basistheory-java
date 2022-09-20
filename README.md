# Basis Theory Java client library

The official [Basis Theory](https://basistheory.com) Java client library.

## Getting Started
* Sign-in to [Basis Theory](https://basistheory.com) and go to [Applications](https://portal.basistheory.com/applications)
* Create a Basis Theory Private Application
* All permissions should be selected
* Paste the API Key into the `BT-API-KEY` variable

## Requirements

Building the API client library requires:
1. Java 1.8+
2. Maven (3.8.3+)/Gradle (7.2+)

## Installation

### Gradle users

Add this dependency to your project's build file:

```groovy
  repositories {
    mavenCentral()     // Needed if the 'basistheory-java' jar has been published to maven central.
    mavenLocal()       // Needed if the 'basistheory-java' jar has been published to the local maven repo.
  }

  dependencies {
     implementation "com.basistheory:basistheory-java:0.1.0"
  }
```

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>com.basistheory</groupId>
  <artifactId>basistheory-java</artifactId>
  <version>0.1.0</version>
  <scope>compile</scope>
</dependency>
```

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

// Import classes:
import com.basistheory.ApiClient;
import com.basistheory.ApiException;
import com.basistheory.Configuration;
import com.basistheory.auth.*;
import com.basistheory.models.*;
import com.basistheory.ApplicationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.basistheory.com");
    
    // Configure API key authorization: ApiKey
    ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
    ApiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKey.setApiKeyPrefix("Token");

    ApplicationsApi apiInstance = new ApplicationsApi(defaultClient);
    CreateApplicationRequest createApplicationRequest = new CreateApplicationRequest(); // CreateApplicationRequest | 
    try {
      Application result = apiInstance.create(createApplicationRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicationsApi#create");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://api.basistheory.com*

| Class                | Method                                                                      | HTTP request                                             | Description |
|----------------------|-----------------------------------------------------------------------------|----------------------------------------------------------|-------------|
| *ApplicationsApi*    | [**create**](docs/ApplicationsApi.md#create)                                | **POST** /applications                                   |             |
| *ApplicationsApi*    | [**delete**](docs/ApplicationsApi.md#delete)                                | **DELETE** /applications/{id}                            |             |
| *ApplicationsApi*    | [**get**](docs/ApplicationsApi.md#get)                                      | **GET** /applications                                    |             |
| *ApplicationsApi*    | [**getById**](docs/ApplicationsApi.md#getById)                              | **GET** /applications/{id}                               |             |
| *ApplicationsApi*    | [**getByKey**](docs/ApplicationsApi.md#getByKey)                            | **GET** /applications/key                                |             |
| *ApplicationsApi*    | [**regenerateKey**](docs/ApplicationsApi.md#regenerateKey)                  | **POST** /applications/{id}/regenerate                   |             |
| *ApplicationsApi*    | [**update**](docs/ApplicationsApi.md#update)                                | **PUT** /applications/{id}                               |             |
| *LogsApi*            | [**get**](docs/LogsApi.md#get)                                              | **GET** /logs                                            |             |
| *LogsApi*            | [**getEntityTypes**](docs/LogsApi.md#getEntityTypes)                        | **GET** /logs/entity-types                               |             |
| *PermissionsApi*     | [**get**](docs/PermissionsApi.md#get)                                       | **GET** /permissions                                     |             |
| *ProxiesApi*         | [**create**](docs/ProxiesApi.md#create)                                     | **POST** /proxies                                        |             |
| *ProxiesApi*         | [**delete**](docs/ProxiesApi.md#delete)                                     | **DELETE** /proxies/{id}                                 |             |
| *ProxiesApi*         | [**get**](docs/ProxiesApi.md#get)                                           | **GET** /proxies                                         |             |
| *ProxiesApi*         | [**getById**](docs/ProxiesApi.md#getById)                                   | **GET** /proxies/{id}                                    |             |
| *ProxiesApi*         | [**update**](docs/ProxiesApi.md#update)                                     | **PUT** /proxies/{id}                                    |             |
| *ReactorFormulasApi* | [**create**](docs/ReactorFormulasApi.md#create)                             | **POST** /reactor-formulas                               |             |
| *ReactorFormulasApi* | [**delete**](docs/ReactorFormulasApi.md#delete)                             | **DELETE** /reactor-formulas/{id}                        |             |
| *ReactorFormulasApi* | [**get**](docs/ReactorFormulasApi.md#get)                                   | **GET** /reactor-formulas                                |             |
| *ReactorFormulasApi* | [**getById**](docs/ReactorFormulasApi.md#getById)                           | **GET** /reactor-formulas/{id}                           |             |
| *ReactorFormulasApi* | [**update**](docs/ReactorFormulasApi.md#update)                             | **PUT** /reactor-formulas/{id}                           |             |
| *ReactorsApi*        | [**create**](docs/ReactorsApi.md#create)                                    | **POST** /reactors                                       |             |
| *ReactorsApi*        | [**delete**](docs/ReactorsApi.md#delete)                                    | **DELETE** /reactors/{id}                                |             |
| *ReactorsApi*        | [**get**](docs/ReactorsApi.md#get)                                          | **GET** /reactors                                        |             |
| *ReactorsApi*        | [**getById**](docs/ReactorsApi.md#getById)                                  | **GET** /reactors/{id}                                   |             |
| *ReactorsApi*        | [**react**](docs/ReactorsApi.md#react)                                      | **POST** /reactors/{id}/react                            |             |
| *ReactorsApi*        | [**update**](docs/ReactorsApi.md#update)                                    | **PUT** /reactors/{id}                                   |             |
| *TenantsApi*         | [**createInvitation**](docs/TenantsApi.md#createInvitation)                 | **POST** /tenants/self/invitations                       |             |
| *TenantsApi*         | [**delete**](docs/TenantsApi.md#delete)                                     | **DELETE** /tenants/self                                 |             |
| *TenantsApi*         | [**deleteInvitation**](docs/TenantsApi.md#deleteInvitation)                 | **DELETE** /tenants/self/invitations/{invitationId}      |             |
| *TenantsApi*         | [**deleteMember**](docs/TenantsApi.md#deleteMember)                         | **DELETE** /tenants/self/members/{memberId}              |             |
| *TenantsApi*         | [**get**](docs/TenantsApi.md#get)                                           | **GET** /tenants/self                                    |             |
| *TenantsApi*         | [**getInvitations**](docs/TenantsApi.md#getInvitations)                     | **GET** /tenants/self/invitations                        |             |
| *TenantsApi*         | [**getMembers**](docs/TenantsApi.md#getMembers)                             | **GET** /tenants/self/members                            |             |
| *TenantsApi*         | [**getTenantOperationReport**](docs/TenantsApi.md#getTenantOperationReport) | **GET** /tenants/self/reports/operations                 |             |
| *TenantsApi*         | [**getTenantUsageReport**](docs/TenantsApi.md#getTenantUsageReport)         | **GET** /tenants/self/reports/usage                      |             |
| *TenantsApi*         | [**resendInvitation**](docs/TenantsApi.md#resendInvitation)                 | **POST** /tenants/self/invitations/{invitationId}/resend |             |
| *TenantsApi*         | [**update**](docs/TenantsApi.md#update)                                     | **PUT** /tenants/self                                    |             |
| *TokenizeApi*        | [**tokenize**](docs/TokenizeApi.md#tokenize)                                | **POST** /tokenize                                       |             |
| *TokensApi*          | [**create**](docs/TokensApi.md#create)                                      | **POST** /tokens                                         |             |
| *TokensApi*          | [**createAssociation**](docs/TokensApi.md#createAssociation)                | **POST** /tokens/{parentId}/children/{childId}           |             |
| *TokensApi*          | [**createChild**](docs/TokensApi.md#createChild)                            | **POST** /tokens/{parentId}/children                     |             |
| *TokensApi*          | [**delete**](docs/TokensApi.md#delete)                                      | **DELETE** /tokens/{id}                                  |             |
| *TokensApi*          | [**deleteAssociation**](docs/TokensApi.md#deleteAssociation)                | **DELETE** /tokens/{parentId}/children/{childId}         |             |
| *TokensApi*          | [**get**](docs/TokensApi.md#get)                                            | **GET** /tokens                                          |             |
| *TokensApi*          | [**getById**](docs/TokensApi.md#getById)                                    | **GET** /tokens/{id}                                     |             |
| *TokensApi*          | [**getChildren**](docs/TokensApi.md#getChildren)                            | **GET** /tokens/{parentId}/children                      |             |
| *TokensApi*          | [**search**](docs/TokensApi.md#search)                                      | **POST** /tokens/search                                  |             |
| *TokensApi*          | [**update**](docs/TokensApi.md#update)                                      | **PATCH** /tokens/{id}                                   |             |

## Documentation for Models

 - [AccessRule](docs/AccessRule.md)
 - [Application](docs/Application.md)
 - [ApplicationPaginatedList](docs/ApplicationPaginatedList.md)
 - [CreateApplicationRequest](docs/CreateApplicationRequest.md)
 - [CreateProxyRequest](docs/CreateProxyRequest.md)
 - [CreateReactorFormulaRequest](docs/CreateReactorFormulaRequest.md)
 - [CreateReactorRequest](docs/CreateReactorRequest.md)
 - [CreateTenantInvitationRequest](docs/CreateTenantInvitationRequest.md)
 - [CreateTokenRequest](docs/CreateTokenRequest.md)
 - [CreateTokenResponse](docs/CreateTokenResponse.md)
 - [EncryptionKey](docs/EncryptionKey.md)
 - [EncryptionMetadata](docs/EncryptionMetadata.md)
 - [GetApplications](docs/GetApplications.md)
 - [GetLogs](docs/GetLogs.md)
 - [GetPermissions](docs/GetPermissions.md)
 - [GetProxies](docs/GetProxies.md)
 - [GetReactorFormulas](docs/GetReactorFormulas.md)
 - [GetReactors](docs/GetReactors.md)
 - [GetTenantInvitations](docs/GetTenantInvitations.md)
 - [GetTenantMembers](docs/GetTenantMembers.md)
 - [GetTokens](docs/GetTokens.md)
 - [Log](docs/Log.md)
 - [LogEntityType](docs/LogEntityType.md)
 - [LogPaginatedList](docs/LogPaginatedList.md)
 - [MonthlyActiveTokenHistory](docs/MonthlyActiveTokenHistory.md)
 - [Pagination](docs/Pagination.md)
 - [Permission](docs/Permission.md)
 - [Privacy](docs/Privacy.md)
 - [ProblemDetails](docs/ProblemDetails.md)
 - [Proxy](docs/Proxy.md)
 - [ProxyPaginatedList](docs/ProxyPaginatedList.md)
 - [ReactRequest](docs/ReactRequest.md)
 - [ReactResponse](docs/ReactResponse.md)
 - [Reactor](docs/Reactor.md)
 - [ReactorFormula](docs/ReactorFormula.md)
 - [ReactorFormulaConfiguration](docs/ReactorFormulaConfiguration.md)
 - [ReactorFormulaPaginatedList](docs/ReactorFormulaPaginatedList.md)
 - [ReactorFormulaRequestParameter](docs/ReactorFormulaRequestParameter.md)
 - [ReactorPaginatedList](docs/ReactorPaginatedList.md)
 - [SearchTokensRequest](docs/SearchTokensRequest.md)
 - [StringStringKeyValuePair](docs/StringStringKeyValuePair.md)
 - [Tenant](docs/Tenant.md)
 - [TenantInvitationResponse](docs/TenantInvitationResponse.md)
 - [TenantInvitationResponsePaginatedList](docs/TenantInvitationResponsePaginatedList.md)
 - [TenantInvitationStatus](docs/TenantInvitationStatus.md)
 - [TenantMemberResponse](docs/TenantMemberResponse.md)
 - [TenantMemberResponsePaginatedList](docs/TenantMemberResponsePaginatedList.md)
 - [TenantUsageReport](docs/TenantUsageReport.md)
 - [Token](docs/Token.md)
 - [TokenMetrics](docs/TokenMetrics.md)
 - [TokenPaginatedList](docs/TokenPaginatedList.md)
 - [TokenReport](docs/TokenReport.md)
 - [UpdateApplicationRequest](docs/UpdateApplicationRequest.md)
 - [UpdatePrivacy](docs/UpdatePrivacy.md)
 - [UpdateProxyRequest](docs/UpdateProxyRequest.md)
 - [UpdateReactorFormulaRequest](docs/UpdateReactorFormulaRequest.md)
 - [UpdateReactorRequest](docs/UpdateReactorRequest.md)
 - [UpdateTenantRequest](docs/UpdateTenantRequest.md)
 - [UpdateTokenRequest](docs/UpdateTokenRequest.md)
 - [User](docs/User.md)
 - [ValidationProblemDetails](docs/ValidationProblemDetails.md)


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Development

JDK 17 is required to build the Basis Theory Java library. This can be installed via:
```shell
brew install openjdk@17
```

This library was generated using the OpenApi Generator. An updated version can be produced using the commands:
```shell
make update-api-spec # downloads the latest OpenApi spec from https://api.basistheory.com/
make generate-sdk    # runs the open api generator using the local swagger.json spec
```
