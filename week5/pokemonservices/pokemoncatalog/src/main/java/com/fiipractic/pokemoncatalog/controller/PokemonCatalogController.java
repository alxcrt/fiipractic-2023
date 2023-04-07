package com.fiipractic.pokemoncatalog.controller;

import com.fiipractic.pokemoncatalog.model.Pokedex;
import com.fiipractic.pokemoncatalog.repository.PokemonCatalogRepository;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

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

    @GetMapping(value = "/pokedex/pokemon/{id}")
    public Pokedex getPokemon(@PathVariable(value = "id") Integer id){
        Pokedex pokemon = pokemonCatalogRepository.findById(id).orElse(null);

        if(pokemon == null){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }

        return pokemon;
    }

}
