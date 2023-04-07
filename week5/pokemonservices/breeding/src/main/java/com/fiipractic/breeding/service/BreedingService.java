package com.fiipractic.breeding.service;

import com.fiipractic.breeding.model.Egg;
import com.fiipractic.breeding.model.EggStatus;
import com.fiipractic.breeding.repository.EggReposiotry;
import com.fiipractic.pokemoncatalog.model.Pokemon;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.client.RestTemplate;

import java.time.LocalDateTime;

@Service
public class BreedingService {

    private final EggReposiotry eggReposiotry;

    public BreedingService(EggReposiotry eggReposiotry) {
        this.eggReposiotry = eggReposiotry;
    }

    public void breed(Integer pokeId1, Integer pokeId2, Model model){
        Pokemon pokemon1 = getPokemon(pokeId1);
        Pokemon pokemon2 = getPokemon(pokeId2);

        Egg pendingEgg = eggReposiotry.findOneByPokemon1AndPokemon2AndStatus(pokeId1,pokeId2, EggStatus.PENDING);
        Egg hatchedEgg = eggReposiotry.findOneByPokemon1AndPokemon2AndStatus(pokeId1,pokeId2, EggStatus.HATCHED);

        Boolean combinationExists = false;
        if(pendingEgg == null && hatchedEgg == null){
            createEgg(pokemon1,pokemon2);
        }else if(hatchedEgg != null){
            combinationExists = true;
        }

        model.addAttribute("pokemon1",pokemon1);
        model.addAttribute("pokemon2",pokemon2);
        model.addAttribute("combinationExists",combinationExists);
        model.addAttribute("pokeId1",pokeId1);
        model.addAttribute("pokeId2",pokeId2);

        System.out.println(pokemon1);
        System.out.println(pokemon2);
    }

    private void createEgg(Pokemon pokemon1, Pokemon pokemon2){
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime hatchTime = now.plusSeconds((pokemon1.getBaseEggSteps() + pokemon2.getBaseEggSteps())/2000);
        eggReposiotry.save(new Egg(pokemon1.getId(),pokemon2.getId(),hatchTime,EggStatus.PENDING));
    }

    private Pokemon getPokemon(Integer pokemonId){
        RestTemplate restTemplate = new RestTemplate();

        Pokemon pokemon = restTemplate.getForObject(
                "http://localhost:8081/pokedex/pokemon/" + pokemonId,
                Pokemon.class);

        return pokemon;
    }

}
