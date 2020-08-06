# PlayerControllerApi

All URIs are relative to *//localhost:8080/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addPlayerUsingPOST**](PlayerControllerApi.md#addPlayerUsingPOST) | **POST** /api/players | add a new player
[**getPlayerByNameUsingGET**](PlayerControllerApi.md#getPlayerByNameUsingGET) | **GET** /api/players/{name} | Get an specific player by Id in this case is id &#x3D; name
[**getPlayersUsingGET**](PlayerControllerApi.md#getPlayersUsingGET) | **GET** /api/players | Get all Players
[**updatePlayerUsingPUT**](PlayerControllerApi.md#updatePlayerUsingPUT) | **PUT** /api/players/{name} | Update an existing Player

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

<a name="getPlayerByNameUsingGET"></a>
# **getPlayerByNameUsingGET**
> Player getPlayerByNameUsingGET(name)

Get an specific player by Id in this case is id &#x3D; name

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PlayerControllerApi;


PlayerControllerApi apiInstance = new PlayerControllerApi();
String name = "name_example"; // String | Id for the player which want to get by name.
try {
    Player result = apiInstance.getPlayerByNameUsingGET(name);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PlayerControllerApi#getPlayerByNameUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Id for the player which want to get by name. |

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
> Player updatePlayerUsingPUT(body, name)

Update an existing Player

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PlayerControllerApi;


PlayerControllerApi apiInstance = new PlayerControllerApi();
Player body = new Player(); // Player | player
String name = "name_example"; // String | Player information to be updated the existing Container by Id.
try {
    Player result = apiInstance.updatePlayerUsingPUT(body, name);
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
 **name** | **String**| Player information to be updated the existing Container by Id. |

### Return type

[**Player**](Player.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

