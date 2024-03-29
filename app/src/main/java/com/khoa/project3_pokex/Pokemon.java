package com.khoa.project3_pokex;

public class Pokemon {
    String name, attack, defense, type;
    int id, Thumbnail ;

    public Pokemon(String name, String attack, String defense, String type, int id, int thumbnail) {
        this.name = name;
        this.attack = attack;
        this.defense = defense;
        this.type = type;
        this.id = id;
        Thumbnail = thumbnail;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAttack() {
        return attack;
    }

    public void setAttack(String attack) {
        this.attack = attack;
    }

    public String getDefense() {
        return defense;
    }

    public void setDefense(String defense) {
        this.defense = defense;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getThumbnail() {
        return Thumbnail;
    }

    public void setThumbnail(int thumbnail) {
        Thumbnail = thumbnail;
    }
}
