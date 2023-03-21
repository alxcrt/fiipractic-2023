package com.fiipractic.battle.service;


import com.fiipractic.pokemoncatalog.model.Pokemon;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.client.RestTemplate;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

@Service
public class BattleService {

    public String battle(Model model){
        List<Pokemon> team1 = this.getTeam(10);
        List<Pokemon> team2 = this.getTeam(10);



        model.addAttribute("team1",team1);
        model.addAttribute("team2",team2);

        System.out.println(team1.get(0));
        return "";
    }

    private List<Pokemon> getTeam(Integer teamSize){
        RestTemplate restTemplate = new RestTemplate();

        Pokemon[] reponse = restTemplate.getForObject(
                "http://localhost:8081/pokedex/random?limit=" + teamSize,
                Pokemon[].class);

        List<Pokemon> team = Arrays.stream(reponse).toList();

        return team;
    }


}
