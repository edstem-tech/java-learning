package com.edstem.session1;

// Mutable class
public class Animal {
    private int age;
    private int legs;
    private String name;
    private String species;
    private String color;


    public Animal() {
    }

    public Animal(
            int age,
            int legs,
            String name,
            String species,
            String color
    ) {
        this.age = age;
        this.legs = legs;
        this.name = name;
        this.species = species;
        this.color = color;
    }

    // Getters
    public int getAge() {
        return age;
    }

    public int getLegs() {
        return legs;
    }

    public String getName() {
        return name;
    }

    public String getSpecies() {
        return species;
    }

    public String getColor() {
        return color;
    }

    // Setters
    public void setAge(int age) {
        this.age = age;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    @Override
    public String toString() {
        return "Animal Class - " +
                "age: " + age +
                ", legs: " + legs +
                ", name: " + name +
                ", species: " + species +
                ", color: " + color;
    }
}
