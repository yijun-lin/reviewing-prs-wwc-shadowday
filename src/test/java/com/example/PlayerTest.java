package com.example;

import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.jupiter.api.Assertions.*;

class PlayerTest {

    @Test
    public void testPlayMethod() {
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));

        Player player = new Player("John", 7);
        player.play();

        assertEquals("John is playing\n", output.toString());
    }

    @Test
    public void testPlayMethodWhenInjured() {
        Player player = new Player("John", 7);
        player.injure();

        Exception exception = assertThrows(IllegalStateException.class, player::play);
        assertEquals("John is injured and cannot play.", exception.getMessage());
    }

    @Test
    public void testInjureAndRecover() {
        Player player = new Player("John", 7);
        player.injure();
        assertTrue(player.isInjured());

        player.recover();
        assertFalse(player.isInjured());
    }
}
