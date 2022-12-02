package com.edstem.learning;

import com.edstem.session1.Animal;
import com.edstem.session1.Vector;

public class Main {
    public static void main(String[] args) {
        // Constructor based instantiation
        Animal animal = new Animal(1, 4, "Fido", "Dog", "Brown");

        // Setter based instantiation
        Animal animal2 = new Animal();
        animal2.setAge(2);
        animal2.setLegs(4);
        animal2.setName("Spot");
        animal2.setSpecies("Dog");
        animal2.setColor("Black");

        System.out.println(animal);
        System.out.println(animal2);

        Vector vector1 = new Vector(1, 2);
        Vector vector2 = new Vector(3, 4);
        Vector vector = vector1.add(vector2);
    }
}