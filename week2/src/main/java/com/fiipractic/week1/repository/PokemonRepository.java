package com.fiipractic.week1.repository;

import com.fiipractic.week1.models.Pokemon;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PokemonRepository  extends JpaRepository<Pokemon,Integer> {
}
