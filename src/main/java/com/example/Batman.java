package com.example;

public class Batman extends SuperHero {

    public Batman(String name) {
        super(name);
    }

    @Override
    public void saveTheWorld() {
        System.out.println("Batman is saving the world.");
    }

    @Override
    public void fly() {
        throw new UnsupportedOperationException("Batman cannot fly.");
    }
}
