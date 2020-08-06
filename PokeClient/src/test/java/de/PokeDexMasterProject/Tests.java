package de.PokeDexMasterProject;

import io.swagger.client.ApiClient;
import io.swagger.client.ApiException;
import io.swagger.client.api.PlayerControllerApi;
import io.swagger.client.api.PokemonControllerApi;
import io.swagger.client.model.Player;
import io.swagger.client.model.Pokemon;
import org.junit.Test;

import java.util.List;

public class Tests {

    @Test
    public void testAPI(){
        ApiClient api = new ApiClient();
        api.setBasePath("http://localhost:8080");
        api.addDefaultHeader("secret","secret1234");
        PlayerControllerApi playerApi = new PlayerControllerApi(api);
        PokemonControllerApi pokemonApi = new PokemonControllerApi(api);
       try {
           List<Pokemon> pokemons = pokemonApi.getPokemonsUsingGET();
           playerApi.addPlayerUsingPOST(new Player().id(1).username("Pulsartorte").password("test1234").role(Player.RoleEnum.ADMIN).pokemons(pokemons));
       } catch (ApiException e){
           e.printStackTrace();
       }

    }
}
