package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PlayerTest {

    @Test
    public void testPlayMethod() {
        PrintService printService = new PrintService() {
            @Override
            public void print(String message) {
                assertEquals("John is playing", message);
            }
        };

        Player player = new Player("John", 7, printService);
        player.play();
    }
}
