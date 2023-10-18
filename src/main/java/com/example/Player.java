package com.example;

public class Player {
    private String name;
    private int uniformNumber;

    public Player(String name, int uniformNumber) {
        this.name = name;
        this.uniformNumber = uniformNumber;
    }

    public String getName() {
        return name;
    }

    public int getUniformNumber() {
        return uniformNumber;
    }

    public void play() {
        System.out.println(name + " is playing");
    }
}
