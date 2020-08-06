package de.pokedexmasterproject.pokeapi.services;

import de.pokedexmasterproject.pokeapi.entities.Player;
import de.pokedexmasterproject.pokeapi.exception.PlayerNotFoundException;
import de.pokedexmasterproject.pokeapi.repos.PlayerRepo;
import de.pokedexmasterproject.pokeapi.util.UpdateUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PlayerService {

    private static final Logger logger = LoggerFactory.getLogger(PlayerService.class);
    private final UpdateUtil util = new UpdateUtil();

    @Autowired
    PlayerRepo playerRepo;

    public List<Player> getPlayers() {
        return playerRepo.findAll();
    }

    public Player getPlayerByName(String name) {
        Optional<Player> playerOpt = playerRepo.findById(name);
        if (playerOpt.isEmpty()) {
            logger.info("player with name: {} not found", name);
            throw new PlayerNotFoundException();
        }
        return playerOpt.get();
    }

    public Player addPlayer(Player player) {
        logger.info("player with id:{} added.",player.getId());
        return playerRepo.save(player);
    }

    public Player updatePlayer(String name, Player updatePlayer) {
        Optional<Player> playerOpt = playerRepo.findById(name);
        if (playerOpt.isEmpty()){
            logger.info("player with name:{} not found.",name);
            throw new PlayerNotFoundException();
        }
        Player currentPlayer = playerOpt.get();
        util.updateProperty(updatePlayer::getId,currentPlayer::getId,currentPlayer::setId);
        util.updateProperty(updatePlayer::getUsername,currentPlayer::getUsername,currentPlayer::setUsername);
        util.updateProperty(updatePlayer::getPassword,currentPlayer::getPassword,currentPlayer::setPassword);
        util.updateProperty(updatePlayer::getRole,currentPlayer::getRole,currentPlayer::setRole);
        util.updateProperty(updatePlayer::getPokemons,currentPlayer::getPokemons,currentPlayer::setPokemons);

        return playerRepo.save(currentPlayer);
    }
}
