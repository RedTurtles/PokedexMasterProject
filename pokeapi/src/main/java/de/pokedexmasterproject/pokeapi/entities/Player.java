package de.pokedexmasterproject.pokeapi.entities;

import com.sun.istack.NotNull;
import org.springframework.web.bind.annotation.CrossOrigin;

import javax.management.relation.Role;
import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "players")
@CrossOrigin(origins = "*")
public class Player {
    //Fields
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Id
    @NotNull
    private String username;
    @NotNull
    private String password;
    @NotNull
    private RoleType role;
    @OneToMany(cascade = CascadeType.ALL)
    private List<Pokemon> pokemons = new ArrayList<>();

    public Player(){}

    public Player(String username, String password, RoleType role, List<Pokemon> pokemons) {
        this.username = username;
        this.password = password;
        this.role = role;
        this.pokemons = pokemons;
    }


    public List<Pokemon> getPokemons() {
        return pokemons;
    }

    public void setPokemons(List<Pokemon> pokemons) {
        this.pokemons = pokemons;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public RoleType getRole() {
        return role;
    }

    public void setRole(RoleType role) {
        this.role = role;
    }

    public boolean loginEquals(Object obj) {
        if (this == obj) {
            return true;
        } else if (obj == null) {
            return false;
        } else if (obj instanceof Player) {
            Player player = (Player) obj;
            if ((player.getUsername() == null && username == null) ||
                    (player.getUsername().equals(username) && ((player.getPassword() == null && password == null)
                            || player.getPassword().equals(password)))) {
                return true;
            }
        }
        return false;
    }
}