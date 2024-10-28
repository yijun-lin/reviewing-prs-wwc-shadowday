package com.example;

public class Superman extends SuperHero {

    public Superman(String name) {
        super(name);
    }

    @Override
    public void saveTheWorld() {
        System.out.println("Superman is saving the world.");
    }

    @Override
    public void fly() {
        System.out.println("Superman is flying at the speed of light.");
    }
}
