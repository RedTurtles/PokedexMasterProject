package de.pokedexmasterproject.pokeapi.services;

import de.pokedexmasterproject.pokeapi.entities.Pokemon;
import de.pokedexmasterproject.pokeapi.exception.PokemonNotFoundException;
import de.pokedexmasterproject.pokeapi.repos.PokemonRepo;
import de.pokedexmasterproject.pokeapi.util.UpdateUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Supplier;

@Service
public class PokemonService {
    //Hier wird der Logger für den Service implementiert
    public static final Logger logger = LoggerFactory.getLogger(PokemonService.class);
    private UpdateUtil util = new UpdateUtil();

    @Autowired
    private PokemonRepo pokemonRepo;


    public List<Pokemon> getAllPokemons() {
        List<Pokemon> pokemons = pokemonRepo.findAll();
        logger.info("get {} pokemons from repo", pokemons.size());
        return pokemons;
    }

    public List<Pokemon> getAllShinyPokemons() {
        List<Pokemon> pokemons = pokemonRepo.findAllShinys();
        logger.info("get {} shiny pokemons from repo", pokemons.size());
        return pokemons;
    }

    public Pokemon newPokemon(Pokemon pokemon) {
        logger.info("Pokemon with id:{} added.", pokemon.getId());
        return pokemonRepo.save(pokemon);
    }

    public Pokemon updatePokemon(Integer id, Pokemon updatePokemon) {
        Optional<Pokemon> pokemonOpt = pokemonRepo.findById(id);
        if (pokemonOpt.isEmpty()) {
            logger.info("Pokemon not found");
            throw new PokemonNotFoundException();
        }
        Pokemon currentPokemon = pokemonOpt.get();
        util.updateProperty(updatePokemon::getAmount, currentPokemon::getAmount, currentPokemon::setAmount);
        util.updateProperty(updatePokemon::getId, currentPokemon::getId, currentPokemon::setId);
        util.updateProperty(updatePokemon::getPokedexNr, currentPokemon::getPokedexNr, currentPokemon::setPokedexNr);
        util.updateProperty(updatePokemon::getName, currentPokemon::getName, currentPokemon::setName);
        util.updateProperty(updatePokemon::isAlola, currentPokemon::isAlola, currentPokemon::setAlola);
        util.updateProperty(updatePokemon::isCrypto, currentPokemon::isCrypto, currentPokemon::setCrypto);
        util.updateProperty(updatePokemon::isGalarian, currentPokemon::isGalarian, currentPokemon::setGalarian);
        util.updateProperty(updatePokemon::isLegendary, currentPokemon::isLegendary, currentPokemon::setLegendary);
        util.updateProperty(updatePokemon::isLucky, currentPokemon::isLucky, currentPokemon::setLucky);
        util.updateProperty(updatePokemon::isMystic, currentPokemon::isMystic, currentPokemon::setMystic);
        util.updateProperty(updatePokemon::isNormal, currentPokemon::isNormal, currentPokemon::setNormal);
        util.updateProperty(updatePokemon::isPurified, currentPokemon::isPurified, currentPokemon::setPurified);
        util.updateProperty(updatePokemon::isShiny, currentPokemon::isShiny, currentPokemon::setShiny);
        util.updateProperty(updatePokemon::isTraded, currentPokemon::isTraded, currentPokemon::setTraded);
        return pokemonRepo.save(currentPokemon);
    }

}
