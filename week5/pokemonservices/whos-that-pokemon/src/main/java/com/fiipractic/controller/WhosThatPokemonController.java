package com.fiipractic.controller;

import com.fiipractic.model.Pokemon;
import com.fiipractic.service.WhosThatPokemonService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class WhosThatPokemonController {

    private final WhosThatPokemonService whosThatPokemonService;

    public WhosThatPokemonController(WhosThatPokemonService whosThatPokemonService) {
        this.whosThatPokemonService = whosThatPokemonService;
    }

    @GetMapping(value = "/")
    public String whosThatPokemon(Model model){

        Pokemon pokemon = whosThatPokemonService.getRandomPokemon();

        model.addAttribute("pokemonIndex",pokemon.getId());

        model.addAttribute("pokeId1",1);
        model.addAttribute("pokeId2",2);

        return "whos-that-pokemon";
    }

    @PostMapping(value = "/guess")
    public String guess(@RequestParam String guess, @RequestParam Integer pokemonIndex, Model model){

        System.out.println(guess);
        System.out.println(pokemonIndex);


        Pokemon pokemon = whosThatPokemonService.getPokemonById(pokemonIndex);

        String result = "";

        if(guess.equalsIgnoreCase(pokemon.getName())){
            result = "Correct!";
        }else{
            result = "Incorrect! Correct answer is " + pokemon.getName();
        }

        System.out.println(result);

        model.addAttribute("pokemonIndex",pokemonIndex);
        model.addAttribute("result",result);



        return "whos-that-pokemon";
    }

}
