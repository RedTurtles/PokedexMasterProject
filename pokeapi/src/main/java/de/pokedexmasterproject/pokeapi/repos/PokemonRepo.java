package de.pokedexmasterproject.pokeapi.repos;

import de.pokedexmasterproject.pokeapi.entities.Pokemon;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
//erzeugte Objekte werden gespeichert in der Datenbank
@Repository
public interface PokemonRepo extends JpaRepository<Pokemon,Integer> {
}
