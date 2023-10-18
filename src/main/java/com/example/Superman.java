package com.example;

public class Superman extends SuperHero {

    public Superman(String name) {
        super(name);
    }

    @Override
    public void saveTheWorld() {
        System.out.println("Superman is saving the world.");
    }

    public void teachAboutSolarPower() {
        System.out.println("Superman is teaching the world about solar power.");
    }
}
