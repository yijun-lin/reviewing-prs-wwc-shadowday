package com.example;

public class Player {
    private String name;
    private int uniformNumber;
    private boolean isInjured;

    public Player(String name, int uniformNumber) {
        this.name = name;
        this.uniformNumber = uniformNumber;
        this.isInjured = false;
    }

    public String getName() {
        return name;
    }

    public int getUniformNumber() {
        return uniformNumber;
    }

    public boolean isInjured() {
        return isInjured;
    }

    public void play() {
        if (isInjured) {
            throw new IllegalStateException(name + " is injured and cannot play.");
        }
        System.out.println(name + " is playing");
    }

    public void injure() {
        isInjured = true;
    }

    public void recover() {
        isInjured = false;
    }
}
