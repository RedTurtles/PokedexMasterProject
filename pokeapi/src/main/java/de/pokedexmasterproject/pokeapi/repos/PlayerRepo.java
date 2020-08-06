package de.pokedexmasterproject.pokeapi.repos;

import de.pokedexmasterproject.pokeapi.entities.Player;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlayerRepo extends JpaRepository<Player,String> {
}
