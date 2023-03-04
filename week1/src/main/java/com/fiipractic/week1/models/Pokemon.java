package com.fiipractic.week1.models;

public class Pokemon {

    private Integer id;
    private String name;
    private String type;
    private String trainer;
    private Integer level;

    public Pokemon(Integer id, String name, String type, String trainer, Integer level) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.trainer = trainer;
        this.level = level;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTrainer() {
        return trainer;
    }

    public void setTrainer(String trainer) {
        this.trainer = trainer;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    @Override
    public String toString() {
        return "Pokemon{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", trainer='" + trainer + '\'' +
                ", level=" + level +
                '}';
    }
}
