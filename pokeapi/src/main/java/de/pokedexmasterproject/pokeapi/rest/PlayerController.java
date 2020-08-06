package de.pokedexmasterproject.pokeapi.rest;

import de.pokedexmasterproject.pokeapi.entities.Player;
import de.pokedexmasterproject.pokeapi.services.PlayerService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import java.util.List;

@RestController
@RequestMapping(path = "/api")
public class PlayerController {

    @Autowired
    PlayerService playerService;

    @RequestMapping(method = RequestMethod.GET,
            path = "/players",
            produces = MediaType.APPLICATION_JSON_VALUE)
    @ApiOperation(value = "Get all Players", response = Player.class)
    @ApiResponses(value = {@ApiResponse(code = 200, message = "Successfully Request"), @ApiResponse(code = 404, message = "Players not found"), @ApiResponse(code = 400, message = "Missing or invalid request body"), @ApiResponse(code = 500, message = "Internal error")})
    public ResponseEntity<List<Player>> getPlayers(){
        return new ResponseEntity<>(playerService.getPlayers(), HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.GET,
            path = "/players/{name}",
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    @ApiOperation(value = "Get an specific player by Id in this case is id = name", response = Player.class)
    @ApiResponses(value = {@ApiResponse(code = 200, message = "Successfully request"), @ApiResponse(code = 404, message = "player not found"), @ApiResponse(code = 400, message = "Missing or invalid request body"), @ApiResponse(code = 500, message = "Internal error")})
    public ResponseEntity<Player> getPlayerByName(@ApiParam("Id for the player which want to get by name.") @PathVariable("name") String name) {
        return new ResponseEntity<>(playerService.getPlayerByName(name),HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.POST,
            path = "/players",
            produces = MediaType.APPLICATION_JSON_VALUE,
            consumes = MediaType.APPLICATION_JSON_VALUE)

    @ApiOperation(value = "add a new player", response = Player.class)
    @ApiResponses(value = {@ApiResponse(code = 200, message = "Successfully Request"), @ApiResponse(code = 404, message = "Player not found"), @ApiResponse(code = 400, message = "Missing or invalid request body"), @ApiResponse(code = 500, message = "Internal error")})
    public ResponseEntity<Player> addPlayer(@RequestBody Player player){
        return new ResponseEntity<>(playerService.addPlayer(player), HttpStatus.CREATED);
    }

    @RequestMapping(method = RequestMethod.PUT,
            path = "/players/{name}",
            produces = MediaType.APPLICATION_JSON_VALUE,
            consumes = MediaType.APPLICATION_JSON_VALUE)
    @Transactional
    @ApiOperation(value = "Update an existing Player", response = Player.class)
    @ApiResponses(value = {@ApiResponse(code = 200, message = "Successfully Request"), @ApiResponse(code = 404, message = "Player not found"), @ApiResponse(code = 400, message = "Missing or invalid request body"), @ApiResponse(code = 500, message = "Internal error")})
    public ResponseEntity<Player> updatePlayer(@ApiParam("Player information to be updated the existing Container by Id.") @PathVariable("name") String name, @RequestBody Player player){
        return new ResponseEntity<>(playerService.updatePlayer(name,player), HttpStatus.CREATED);
    }

    /*@RequestMapping(method = RequestMethod.GET,
            path = "/players/pokemon/{name}",
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    @ApiOperation(value = "Get an specific player by Id in this case is id = name", response = Player.class)
    @ApiResponses(value = {@ApiResponse(code = 200, message = "Successfully request"), @ApiResponse(code = 404, message = "player not found"), @ApiResponse(code = 400, message = "Missing or invalid request body"), @ApiResponse(code = 500, message = "Internal error")})
    public ResponseEntity<Player> getPlayerByName(@ApiParam("Id for the player which want to get by name.") @PathVariable("name") String name) {
        return new ResponseEntity<>(playerService.getPlayerByName(name),HttpStatus.OK);
    }*/

}