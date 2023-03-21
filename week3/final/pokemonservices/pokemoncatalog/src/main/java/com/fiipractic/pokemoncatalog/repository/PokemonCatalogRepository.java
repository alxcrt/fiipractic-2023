package com.fiipractic.pokemoncatalog.repository;

import com.fiipractic.pokemoncatalog.model.Pokedex;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PokemonCatalogRepository extends JpaRepository<Pokedex,Integer> {

    List<Pokedex> findByName(@Param(value = "name") String name);

    List<Pokedex> findByNameContainingIgnoreCase(@Param(value = "name") String name);

    @Query(value = "SELECT * from pokedex order by random() LIMIT :limit",nativeQuery = true)
    List<Pokedex> getRandomPokemons(@Param(value = "limit") Integer limit);

}
