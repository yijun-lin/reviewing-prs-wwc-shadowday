package com.example;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PlayerTest {

    @Test
    public void testPlayMethod() {
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));

        Player player = new Player("John", 7);
        player.play();

        assertEquals("John is playing\n", output.toString());
    }
}
