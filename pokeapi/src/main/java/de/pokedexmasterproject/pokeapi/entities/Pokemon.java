package de.pokedexmasterproject.pokeapi.entities;

import com.sun.istack.NotNull;

import javax.persistence.*;

@Entity
@Table(name= "pokemon")
public class Pokemon {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @NotNull
    private Integer pokedexNr;
    @NotNull
    private String name;
    private boolean normal;
    private boolean shiny;
    private boolean crypto;
    private boolean alola;
    private boolean galarian;
    private boolean legendary;
    private boolean mystic;
    private boolean purified;
    private boolean traded;
    private boolean lucky;
    int amount;

    public Pokemon(){}

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Pokemon(Integer id, Integer pokedexNr, @NotNull String name, int amount) {
        this.id = id;
        this.pokedexNr = pokedexNr;
        this.name = name;
        this.normal = false;
        this.shiny = false;
        this.crypto = false;
        this.alola = false;
        this.galarian = false;
        this.legendary = false;
        this.mystic = false;
        this.purified = false;
        this.traded = false;
        this.lucky = false;
        this.amount = amount;
    }

    public String getName() {

        return name;
    }

    public int getPokedexNr() {
        return pokedexNr;
    }

    public boolean isNormal() {
        return normal;
    }

    public boolean isShiny() {
        return shiny;
    }

    public boolean isCrypto() {
        return crypto;
    }

    public boolean isAlola() {
        return alola;
    }

    public boolean isGalarian() {
        return galarian;
    }

    public boolean isLegendary() {
        return legendary;
    }

    public boolean isMystic() {
        return mystic;
    }

    public boolean isPurified() {
        return purified;
    }

    public boolean isTraded() {
        return traded;
    }

    public boolean isLucky() {
        return lucky;
    }

    public int getAmount() {
        return amount;
    }

    public void setPokedexNr(Integer pokedexNr) {
        this.pokedexNr = pokedexNr;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNormal(boolean normal) {
        this.normal = normal;
    }

    public void setShiny(boolean shiny) {
        this.shiny = shiny;
    }

    public void setCrypto(boolean crypto) {
        this.crypto = crypto;
    }

    public void setAlola(boolean alola) {
        this.alola = alola;
    }

    public void setGalarian(boolean galarian) {
        this.galarian = galarian;
    }

    public void setLegendary(boolean legendary) {
        this.legendary = legendary;
    }

    public void setMystic(boolean mystic) {
        this.mystic = mystic;
    }

    public void setPurified(boolean purified) {
        this.purified = purified;
    }

    public void setTraded(boolean traded) {
        this.traded = traded;
    }

    public void setLucky(boolean lucky) {
        this.lucky = lucky;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "\nPokdexNr.: " + this.pokedexNr + "\nName: " + this.name + "\nAlola? " + this.alola + "\n";
    }

}
