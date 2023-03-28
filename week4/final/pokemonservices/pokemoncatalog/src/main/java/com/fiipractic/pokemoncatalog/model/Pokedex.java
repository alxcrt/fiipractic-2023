package com.fiipractic.pokemoncatalog.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Pokedex {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    
    private List<String> abilities = new ArrayList<>();
    private Double attack;
    private Integer baseEggSteps;
    private Integer baseHappiness;
    private Integer baseTotal;
    private Integer captureRate;
    private Double defense;
    private Integer experienceGrowth;
    private Double height;
    private Integer hp;
    private String name;
    private Double percentageMale;
    private Double spAttack;
    private Double spDefense;
    private Double speed;
    private String type1;
    private String type2;
    private Double weight;
    private Integer generation;
    private Boolean isLegendary;

    public Pokedex(Integer id, List<String> abilities, Double attack, Integer baseEggSteps, Integer baseHappiness, Integer baseTotal, Integer captureRate, Double defense, Integer experienceGrowth, Double height, Integer hp, String name, Double percentageMale, Double spAttack, Double spDefense, Double speed, String type1, String type2, Double weight, Integer generation, Boolean isLegendary) {
        this.id = id;
        this.abilities = abilities;
        this.attack = attack;
        this.baseEggSteps = baseEggSteps;
        this.baseHappiness = baseHappiness;
        this.baseTotal = baseTotal;
        this.captureRate = captureRate;
        this.defense = defense;
        this.experienceGrowth = experienceGrowth;
        this.height = height;
        this.hp = hp;
        this.name = name;
        this.percentageMale = percentageMale;
        this.spAttack = spAttack;
        this.spDefense = spDefense;
        this.speed = speed;
        this.type1 = type1;
        this.type2 = type2;
        this.weight = weight;
        this.generation = generation;
        this.isLegendary = isLegendary;
    }

    public Pokedex() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public List<String> getAbilities() {
        return abilities;
    }

    public void setAbilities(List<String> abilities) {
        this.abilities = abilities;
    }

    public Double getAttack() {
        return attack;
    }

    public void setAttack(Double attack) {
        this.attack = attack;
    }

    public Integer getBaseEggSteps() {
        return baseEggSteps;
    }

    public void setBaseEggSteps(Integer baseEggSteps) {
        this.baseEggSteps = baseEggSteps;
    }

    public Integer getBaseHappiness() {
        return baseHappiness;
    }

    public void setBaseHappiness(Integer baseHappiness) {
        this.baseHappiness = baseHappiness;
    }

    public Integer getBaseTotal() {
        return baseTotal;
    }

    public void setBaseTotal(Integer baseTotal) {
        this.baseTotal = baseTotal;
    }

    public Integer getCaptureRate() {
        return captureRate;
    }

    public void setCaptureRate(Integer captureRate) {
        this.captureRate = captureRate;
    }

    public Double getDefense() {
        return defense;
    }

    public void setDefense(Double defense) {
        this.defense = defense;
    }

    public Integer getExperienceGrowth() {
        return experienceGrowth;
    }

    public void setExperienceGrowth(Integer experienceGrowth) {
        this.experienceGrowth = experienceGrowth;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public Integer getHp() {
        return hp;
    }

    public void setHp(Integer hp) {
        this.hp = hp;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPercentageMale() {
        return percentageMale;
    }

    public void setPercentageMale(Double percentageMale) {
        this.percentageMale = percentageMale;
    }

    public Double getSpAttack() {
        return spAttack;
    }

    public void setSpAttack(Double spAttack) {
        this.spAttack = spAttack;
    }

    public Double getSpDefense() {
        return spDefense;
    }

    public void setSpDefense(Double spDefense) {
        this.spDefense = spDefense;
    }

    public Double getSpeed() {
        return speed;
    }

    public void setSpeed(Double speed) {
        this.speed = speed;
    }

    public String getType1() {
        return type1;
    }

    public void setType1(String type1) {
        this.type1 = type1;
    }

    public String getType2() {
        return type2;
    }

    public void setType2(String type2) {
        this.type2 = type2;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public Integer getGeneration() {
        return generation;
    }

    public void setGeneration(Integer generation) {
        this.generation = generation;
    }

    public Boolean getLegendary() {
        return isLegendary;
    }

    public void setLegendary(Boolean legendary) {
        isLegendary = legendary;
    }

    @Override
    public String toString() {
        return "Pokedex{" +
                "id=" + id +
                ", abilities=" + abilities +
                ", attack=" + attack +
                ", baseEggSteps=" + baseEggSteps +
                ", baseHappiness=" + baseHappiness +
                ", baseTotal=" + baseTotal +
                ", captureRate=" + captureRate +
                ", defense=" + defense +
                ", experienceGrowth=" + experienceGrowth +
                ", height=" + height +
                ", hp=" + hp +
                ", name='" + name + '\'' +
                ", percentageMale=" + percentageMale +
                ", spAttack=" + spAttack +
                ", spDefense=" + spDefense +
                ", speed=" + speed +
                ", type1='" + type1 + '\'' +
                ", type2='" + type2 + '\'' +
                ", weight=" + weight +
                ", generation=" + generation +
                ", isLegendary=" + isLegendary +
                '}';
    }
}
