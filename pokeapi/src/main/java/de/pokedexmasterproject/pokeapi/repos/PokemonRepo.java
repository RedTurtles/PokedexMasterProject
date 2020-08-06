package de.pokedexmasterproject.pokeapi.repos;

import de.pokedexmasterproject.pokeapi.entities.Pokemon;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

//erzeugte Objekte werden gespeichert in der Datenbank
@Repository
public interface PokemonRepo extends JpaRepository<Pokemon,Integer> {

    @Modifying
    @Query("SELECT p from Pokemon p WHERE p.shiny = true")
    List<Pokemon> findAllShinys();
}
