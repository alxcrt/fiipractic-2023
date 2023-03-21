package com.fiipractic.pokemoncatalog.controller;

import com.fiipractic.pokemoncatalog.model.Pokedex;
import com.fiipractic.pokemoncatalog.repository.PokemonCatalogRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PokemonCatalogController {

    private final PokemonCatalogRepository pokemonCatalogRepository;

    public PokemonCatalogController(PokemonCatalogRepository pokemonCatalogRepository) {
        this.pokemonCatalogRepository = pokemonCatalogRepository;
    }

    @GetMapping(value = "/pokedex")
    public List<Pokedex> getPokedex(@RequestParam(value = "search",required = false) String search ){
        System.out.println(search);
        return pokemonCatalogRepository.findByNameContainingIgnoreCase(search);
    }

    @GetMapping(value = "/pokedex/random")
    public List<Pokedex> getRandomPokemons(@RequestParam(value = "limit",required = true) Integer limit){
        return pokemonCatalogRepository.getRandomPokemons(limit);
    }

}
