package com.fiipractic.week1.controllers;

import com.fiipractic.week1.PokemonDB;
import com.fiipractic.week1.models.Pokemon;
import com.fiipractic.week1.repository.PokemonRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PokemonController {

    private final PokemonDB pokemonDB;
    private final PokemonRepository pokemonRepository; 

    public PokemonController(PokemonDB pokemonDB, PokemonRepository pokemonRepository) {
        this.pokemonDB = pokemonDB;
        this.pokemonRepository = pokemonRepository;
    }


    @GetMapping(path = "/pokemons")
    public List<Pokemon> pokemons(){
        return pokemonRepository.findAll();
    }

    @GetMapping(path = "/pokemons/{id}")
    public Pokemon pokemon(@PathVariable Integer id){
        return pokemonDB.getById(id);
    }

    @PostMapping(path = "/pokemons")
    public Pokemon createPokemon(@RequestBody Pokemon pokemon){
        return pokemonRepository.save(pokemon);
    }

    @DeleteMapping(path = "/pokemons/{id}")
    public Pokemon deletePokemon(@PathVariable Integer id){
        return pokemonDB.deletePokemon(id);
    }

    @PatchMapping(path = "/pokemons/{id}")
    public Pokemon updatePokemon(@PathVariable Integer id, @RequestBody Pokemon pokemon){
        return pokemonDB.updatePokemon(id,pokemon);
    }
}
