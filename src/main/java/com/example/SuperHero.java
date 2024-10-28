package com.example;

public class SuperHero {

    private final String name;

    public SuperHero(String name) {
        this.name = name;
    }

    public void saveTheWorld() {
        System.out.println(this.name + " is saving the world.");
    }

    public void fly() {
        System.out.println(this.name + " is flying.");
    }
}
