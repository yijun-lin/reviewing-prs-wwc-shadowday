package com.example;

public class Player {
    private String name;
    private int uniformNumber;
    private PrintService printService;

    public Player(String name, int uniformNumber, PrintService printService) {
        this.name = name;
        this.uniformNumber = uniformNumber;
        this.printService = printService;
    }

    public void play() {
        printService.print(name + " is playing");
    }
}
