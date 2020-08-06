package de.pokedexmasterproject.pokeapi.entities;

import javax.management.relation.Role;

public enum RoleType {
    PLAYER("Spieler"),
    ADMIN("Administrator");

    private String role;

    RoleType(String role) {
        this.role = role;
    }

    public String getRole(){
        return this.role;
    }
}
