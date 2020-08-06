# PlayerControllerApi

All URIs are relative to *//localhost:8080/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addPlayerUsingPOST**](PlayerControllerApi.md#addPlayerUsingPOST) | **POST** /api/players | add a new player
[**getContainerByIdUsingGET**](PlayerControllerApi.md#getContainerByIdUsingGET) | **GET** /api/players/{id} | Get an specific player by Id
[**getPlayersUsingGET**](PlayerControllerApi.md#getPlayersUsingGET) | **GET** /api/players | Get all Players
[**updatePlayerUsingPUT**](PlayerControllerApi.md#updatePlayerUsingPUT) | **PUT** /api/players/{id} | Update an existing Player

<a name="addPlayerUsingPOST"></a>
# **addPlayerUsingPOST**
> Player addPlayerUsingPOST(body)

add a new player

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PlayerControllerApi;


PlayerControllerApi apiInstance = new PlayerControllerApi();
Player body = new Player(); // Player | player
try {
    Player result = apiInstance.addPlayerUsingPOST(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PlayerControllerApi#addPlayerUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Player**](Player.md)| player |

### Return type

[**Player**](Player.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getContainerByIdUsingGET"></a>
# **getContainerByIdUsingGET**
> Player getContainerByIdUsingGET(id)

Get an specific player by Id

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PlayerControllerApi;


PlayerControllerApi apiInstance = new PlayerControllerApi();
Integer id = 56; // Integer | Id for the player which want to get by Id.
try {
    Player result = apiInstance.getContainerByIdUsingGET(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PlayerControllerApi#getContainerByIdUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| Id for the player which want to get by Id. |

### Return type

[**Player**](Player.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getPlayersUsingGET"></a>
# **getPlayersUsingGET**
> Player getPlayersUsingGET()

Get all Players

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PlayerControllerApi;


PlayerControllerApi apiInstance = new PlayerControllerApi();
try {
    Player result = apiInstance.getPlayersUsingGET();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PlayerControllerApi#getPlayersUsingGET");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**Player**](Player.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updatePlayerUsingPUT"></a>
# **updatePlayerUsingPUT**
> Player updatePlayerUsingPUT(body, id)

Update an existing Player

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PlayerControllerApi;


PlayerControllerApi apiInstance = new PlayerControllerApi();
Player body = new Player(); // Player | player
Integer id = 56; // Integer | Player information to be updated the existing Container by Id.
try {
    Player result = apiInstance.updatePlayerUsingPUT(body, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PlayerControllerApi#updatePlayerUsingPUT");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Player**](Player.md)| player |
 **id** | **Integer**| Player information to be updated the existing Container by Id. |

### Return type

[**Player**](Player.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

