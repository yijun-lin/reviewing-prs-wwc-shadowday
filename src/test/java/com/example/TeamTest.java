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

        Player player1 = new Player("John", 7);
        Player player2 = new Player("Michael", 9);
        Player player3 = new Player("David", 10);
        Player[] players = {player1, player2, player3};

        Team team = new Team(players);
        team.startMatch();

        String expectedOutput = "John is playing\nMichael is playing\nDavid is playing\n";
        assertEquals(expectedOutput, output.toString());
    }

    @Test
    void testPlayerInjury() {
        Player player = new Player("John", 7);
        player.injure();
        assertTrue(player.isInjured());

        player.recover();
        assertFalse(player.isInjured());
    }

    @Test
    void testStartMatchWithInjuredPlayer() {
        Player player1 = new Player("John", 7);
        Player player2 = new Player("Michael", 9);
        player2.injure();
        Player player3 = new Player("David", 10);
        Player[] players = {player1, player2, player3};

        Team team = new Team(players);

        Exception exception = assertThrows(IllegalStateException.class, team::startMatch);
        assertEquals("Cannot start match. Michael is injured.", exception.getMessage());
    }

    @Test
    void testAllPlayersFit() {
        Player player1 = new Player("John", 7);
        Player player2 = new Player("Michael", 9);
        Player player3 = new Player("David", 10);
        Player[] players = {player1, player2, player3};

        Team team = new Team(players);
        assertTrue(team.allPlayersFit());

        player2.injure();
        assertFalse(team.allPlayersFit());
    }
}
