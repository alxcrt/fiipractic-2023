package com.fiipractic.breeding.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDateTime;

@Entity
@AllArgsConstructor
@Data
@NoArgsConstructor
@ToString
public class Egg {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private Integer pokemon1;

    private Integer pokemon2;

    private LocalDateTime hatchTime;

    @Enumerated(EnumType.STRING)
    private EggStatus status;

    public Egg(Integer pokemon1, Integer pokemon2, LocalDateTime hatchTime, EggStatus status) {
        this.pokemon1 = pokemon1;
        this.pokemon2 = pokemon2;
        this.hatchTime = hatchTime;
        this.status = status;
    }
}
