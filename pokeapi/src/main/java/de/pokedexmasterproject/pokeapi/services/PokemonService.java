package de.pokedexmasterproject.pokeapi.services;

import de.pokedexmasterproject.pokeapi.entities.Pokemon;
import de.pokedexmasterproject.pokeapi.repos.PokemonRepo;
import org.slf4j.ILoggerFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PokemonService {
    //Hier wird der Logger für den Service implementiert
    public static final Logger logger = LoggerFactory.getLogger(PokemonService.class);

    @Autowired
    private PokemonRepo pokemonRepo;


    public List<Pokemon> getAllPokemons() {
        List<Pokemon> pokemons = pokemonRepo.findAll();
        logger.info("get {} pokemons from repo",pokemons.size());
        return pokemons;
    }

    public Pokemon newPokemon(Pokemon pokemon){
        logger.info("Pokemon with id:{} added.",pokemon.getId());
        return pokemonRepo.save(pokemon);
    }

}
