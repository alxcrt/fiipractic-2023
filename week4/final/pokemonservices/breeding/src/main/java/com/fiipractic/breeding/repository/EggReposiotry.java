package com.fiipractic.breeding.repository;

import com.fiipractic.breeding.model.Egg;
import com.fiipractic.breeding.model.EggStatus;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EggReposiotry extends JpaRepository<Egg,Integer> {

    public Egg findOneByPokemon1AndPokemon2AndStatus(Integer pokemon1, Integer pokemon2, EggStatus status);

    public List<Egg> findByStatus(EggStatus status);
}
