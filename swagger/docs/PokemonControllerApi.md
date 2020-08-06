# PokemonControllerApi

All URIs are relative to *//localhost:8080/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getPokemonsUsingGET**](PokemonControllerApi.md#getPokemonsUsingGET) | **GET** /api/pokemons | getPokemons
[**getShinyPokemonsUsingGET**](PokemonControllerApi.md#getShinyPokemonsUsingGET) | **GET** /api/pokemons/shiny | getShinyPokemons
[**newPokemonUsingPOST**](PokemonControllerApi.md#newPokemonUsingPOST) | **POST** /api/pokemons | newPokemon
[**newPokemonUsingPUT**](PokemonControllerApi.md#newPokemonUsingPUT) | **PUT** /api/pokemons/{id} | newPokemon

<a name="getPokemonsUsingGET"></a>
# **getPokemonsUsingGET**
> List&lt;Pokemon&gt; getPokemonsUsingGET()

getPokemons

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PokemonControllerApi;


PokemonControllerApi apiInstance = new PokemonControllerApi();
try {
    List<Pokemon> result = apiInstance.getPokemonsUsingGET();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PokemonControllerApi#getPokemonsUsingGET");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;Pokemon&gt;**](Pokemon.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getShinyPokemonsUsingGET"></a>
# **getShinyPokemonsUsingGET**
> List&lt;Pokemon&gt; getShinyPokemonsUsingGET()

getShinyPokemons

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PokemonControllerApi;


PokemonControllerApi apiInstance = new PokemonControllerApi();
try {
    List<Pokemon> result = apiInstance.getShinyPokemonsUsingGET();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PokemonControllerApi#getShinyPokemonsUsingGET");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;Pokemon&gt;**](Pokemon.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="newPokemonUsingPOST"></a>
# **newPokemonUsingPOST**
> Pokemon newPokemonUsingPOST(body)

newPokemon

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PokemonControllerApi;


PokemonControllerApi apiInstance = new PokemonControllerApi();
Pokemon body = new Pokemon(); // Pokemon | pokemon
try {
    Pokemon result = apiInstance.newPokemonUsingPOST(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PokemonControllerApi#newPokemonUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Pokemon**](Pokemon.md)| pokemon |

### Return type

[**Pokemon**](Pokemon.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="newPokemonUsingPUT"></a>
# **newPokemonUsingPUT**
> Pokemon newPokemonUsingPUT(body, id)

newPokemon

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PokemonControllerApi;


PokemonControllerApi apiInstance = new PokemonControllerApi();
Pokemon body = new Pokemon(); // Pokemon | pokemon
Integer id = 56; // Integer | id
try {
    Pokemon result = apiInstance.newPokemonUsingPUT(body, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PokemonControllerApi#newPokemonUsingPUT");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Pokemon**](Pokemon.md)| pokemon |
 **id** | **Integer**| id |

### Return type

[**Pokemon**](Pokemon.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

