package com.example;

import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.jupiter.api.Assertions.*;

class TeamTest {
    @Test
    void testStartMatch() {
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));

        Team team = new Team();
        team.startMatch();

        String expectedOutput = "John is playing\nMichael is playing\nDavid is playing\n";
        assertEquals(expectedOutput, output.toString());
    }
}
