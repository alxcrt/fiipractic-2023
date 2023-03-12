package com.fiipractic.week1;

import com.fiipractic.week1.models.Pokemon;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.ArrayList;
import java.util.List;

@Component
//@Service
public class PokemonDB {

    private static List<Pokemon> pokemons = new ArrayList<Pokemon>();

    static {
        pokemons.add(new Pokemon(1,"Bulbasaur","Grass", "Alex",1));
        pokemons.add(new Pokemon(4,"Charmander","Fire", "Alex",20));
        pokemons.add(new Pokemon(25,"Pikachu","Electric", "Alex",50));
    }

    public static List<Pokemon> getAll(){
        return pokemons;
    }

    public static Pokemon getById(Integer id){
        for (Pokemon pokemon: pokemons){
            if(pokemon.getId().equals(id)){
                return pokemon;
            }
        }

        throw new ResponseStatusException(HttpStatus.NOT_FOUND);
    }

    public static Pokemon createPokemon(Pokemon pokemon){
        pokemons.add(pokemon);
        return pokemon;
    }

    public static Pokemon deletePokemon(Integer id){
        for (Pokemon pokemon: pokemons){
            if(pokemon.getId().equals(id)){
                pokemons.remove(pokemon);
                return pokemon;
            }
        }

        throw new ResponseStatusException(HttpStatus.NOT_FOUND);
    }

    public static Pokemon updatePokemon(Integer id, Pokemon pokemon){
        for (Pokemon poke: pokemons){
            if(poke.getId().equals(id)){


                if(pokemon.getName() != null){
                    poke.setName(pokemon.getName());
                }

                if(pokemon.getTrainer() != null){
                    poke.setTrainer(pokemon.getTrainer());
                }

                if (pokemon.getId() != null){
                    poke.setId(pokemon.getId());
                }

                if (pokemon.getType() != null){
                    poke.setType(pokemon.getType());
                }

                if (pokemon.getLevel() != null){
                    poke.setLevel(pokemon.getLevel());
                }


                return poke;
            }
        }

        throw new ResponseStatusException(HttpStatus.NOT_FOUND);

    }
}
