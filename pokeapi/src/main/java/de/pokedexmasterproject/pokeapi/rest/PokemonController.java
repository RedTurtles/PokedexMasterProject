package de.pokedexmasterproject.pokeapi.rest;

import de.pokedexmasterproject.pokeapi.entities.Pokemon;
import de.pokedexmasterproject.pokeapi.services.PokemonService;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/api")
public class PokemonController {
    @Autowired
    PokemonService pokemonService;

    @RequestMapping(method = RequestMethod.GET,path = "/pokemons",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Pokemon>> getPokemons(){
        return new ResponseEntity<>(pokemonService.getAllPokemons(), HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.POST,path = "/pokemons",produces = MediaType.APPLICATION_JSON_VALUE,consumes
            = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Pokemon> newPokemon(@RequestBody Pokemon pokemon){
        return new ResponseEntity<>(pokemonService.newPokemon(pokemon), HttpStatus.CREATED);
    }

    @RequestMapping(method = RequestMethod.PUT,path = "/pokemons/{id}",produces = MediaType.APPLICATION_JSON_VALUE,consumes
            = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Pokemon> newPokemon(@PathVariable("id") Integer id, @RequestBody Pokemon pokemon){
        return new ResponseEntity<>(pokemonService.updatePokemon(id,pokemon), HttpStatus.CREATED);
    }

}
