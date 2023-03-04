package com.fiipractic.week1.controllers;

import com.fiipractic.week1.PokemonDB;
import com.fiipractic.week1.models.Pokemon;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PokemonController {

    private final PokemonDB pokemonDB;

    public PokemonController(PokemonDB pokemonDB) {
        this.pokemonDB = pokemonDB;
    }


    @GetMapping(path = "/pokemons")
    public List<Pokemon> pokemons(){
        return pokemonDB.getAll();
    }

    @GetMapping(path = "/pokemons/{id}")
    public Pokemon pokemon(@PathVariable Integer id){
        return pokemonDB.getById(id);
    }

    @PostMapping(path = "/pokemons")
    public Pokemon createPokemon(@RequestBody Pokemon pokemon){
        return pokemonDB.createPokemon(pokemon);
    }

    @DeleteMapping(path = "/pokemons/{id}")
    public Pokemon deletePokemon(@PathVariable Integer id){
        return pokemonDB.deletePokemon(id);
    }
}
