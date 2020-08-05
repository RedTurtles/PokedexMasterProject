package de.pokedexmasterproject.pokeapi.services;

import de.pokedexmasterproject.pokeapi.entities.Pokemon;
import de.pokedexmasterproject.pokeapi.exception.CustomErrors;
import de.pokedexmasterproject.pokeapi.repos.PokemonRepo;
import org.apache.tomcat.jni.Error;
import org.slf4j.ILoggerFactory;
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

    public Pokemon updatePokemon(Integer id, Pokemon updatePokemon){
        Optional<Pokemon> pokemonOpt = pokemonRepo.findById(id);
         if(pokemonOpt.isEmpty()){
             logger.info("Pokemon not found");
            throw CustomErrors.notFound;
         }
         Pokemon currentPokemon = pokemonOpt.get();
         updateProperty(updatePokemon::getAmount,currentPokemon::getAmount,currentPokemon::setAmount);
         updateProperty(updatePokemon::getId,currentPokemon::getId,currentPokemon::setId);
         updateProperty(updatePokemon::getPokedexNr,currentPokemon::getPokedexNr,currentPokemon::setPokedexNr);
         updateProperty(updatePokemon::getName,currentPokemon::getName,currentPokemon::setName);
         updateProperty(updatePokemon::isAlola,currentPokemon::isAlola,currentPokemon::setAlola);
         updateProperty(updatePokemon::isCrypto,currentPokemon::isCrypto,currentPokemon::setCrypto);
         updateProperty(updatePokemon::isGalarian,currentPokemon::isGalarian,currentPokemon::setGalarian);
         updateProperty(updatePokemon::isLegendary,currentPokemon::isLegendary,currentPokemon::setLegendary);
         updateProperty(updatePokemon::isLucky,currentPokemon::isLucky,currentPokemon::setLucky);
         updateProperty(updatePokemon::isMystic,currentPokemon::isMystic,currentPokemon::setMystic);
         updateProperty(updatePokemon::isNormal,currentPokemon::isNormal,currentPokemon::setNormal);
         updateProperty(updatePokemon::isPurified,currentPokemon::isPurified,currentPokemon::setPurified);
         updateProperty(updatePokemon::isShiny,currentPokemon::isShiny,currentPokemon::setShiny);
         updateProperty(updatePokemon::isTraded,currentPokemon::isTraded,currentPokemon::setTraded);
         return pokemonRepo.save(currentPokemon);
    }

    private <T> void updateProperty(Supplier<T> update, Supplier<T> current, Consumer<T> updateFunction) {
        T updateValue = update.get();
        if (updateValue == null) {
            return;
        }
        if (Objects.equals(updateValue, current.get())) {
            return;

        }
        updateFunction.accept(updateValue);
    }

}
