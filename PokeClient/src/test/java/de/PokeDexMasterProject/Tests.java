package de.PokeDexMasterProject;

import com.google.gson.JsonArray;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;
import com.squareup.okhttp.ResponseBody;
import io.swagger.client.ApiClient;
import io.swagger.client.ApiException;
import io.swagger.client.api.PlayerControllerApi;
import io.swagger.client.api.PokemonControllerApi;
import io.swagger.client.model.Player;
import io.swagger.client.model.Pokemon;
import org.json.JSONArray;
import org.junit.Test;

import java.io.IOException;
import java.io.OutputStream;
import java.net.http.HttpClient;
import java.net.http.HttpResponse;
import java.util.List;

public class Tests {

    @Test
    public void testAPI() {
        ApiClient api = new ApiClient();
        api.setBasePath("http://localhost:8080");
        api.addDefaultHeader("secret", "secret1234");
        PlayerControllerApi playerApi = new PlayerControllerApi(api);
        PokemonControllerApi pokemonApi = new PokemonControllerApi(api);
        try {
            List<Pokemon> pokemons = pokemonApi.getPokemonsUsingGET();
            playerApi.addPlayerUsingPOST(new Player().id(1).username("Pulsartorte").password("test1234").role(Player.RoleEnum.ADMIN).pokemons(pokemons));
        } catch (ApiException e) {
            e.printStackTrace();
        }

    }

    @Test
    public void addPokemon() {
        ApiClient api = new ApiClient();
        api.setBasePath("http://localhost:8080");
        api.addDefaultHeader("secret", "secret1234");
        PlayerControllerApi playerApi = new PlayerControllerApi(api);
        PokemonControllerApi pokemonApi = new PokemonControllerApi(api);
        try {
            Pokemon glumanda = new Pokemon().name("Shiggy").pokedexNr(4);
            Player player = playerApi.getPlayerByNameUsingGET("Pulsartorte");
            player.addPokemonsItem(glumanda);
            System.out.println(player.toString());
            playerApi.updatePlayerUsingPUT(player, "Pulsartorte");

        } catch (ApiException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void addPokemons() {
        ApiClient api = new ApiClient();
        api.setBasePath("http://localhost:8080");
        api.addDefaultHeader("secret", "secret1234");
        PlayerControllerApi playerApi = new PlayerControllerApi(api);
        PokemonControllerApi pokemonApi = new PokemonControllerApi(api);
        try {

            pokemonApi.newPokemonUsingPOST(new Pokemon().name("Bisasam").pokedexNr(1).shiny(false));
            pokemonApi.newPokemonUsingPOST(new Pokemon().name("Glumanda").pokedexNr(2).shiny(true));
            pokemonApi.newPokemonUsingPOST(new Pokemon().name("Shiggy").pokedexNr(3).shiny(false));
            pokemonApi.newPokemonUsingPOST(new Pokemon().name("Pummeluff").pokedexNr(4).shiny(true));


        } catch (ApiException e) {
            e.printStackTrace();
        }
    }


    public boolean getTrueOrFalse(int number) {
        if (number == 1) {
            return true;
        }
        return false;

    }
}
