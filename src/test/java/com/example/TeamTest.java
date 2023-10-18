package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TeamTest {
    @Test
    void testStartMatch() {
        int[] i = {0};
        String[] expectedOutputs = new String[] {
                "John is playing",
                "Michael is playing",
                "David is playing"
        };

        PrintService printService = new PrintService() {
            @Override
            public void print(String message) {
                assertEquals(expectedOutputs[i[0]], message);
                i[0]++;
            }
        };

        Player player1 = new Player("John", 7, printService);
        Player player2 = new Player("Michael", 9, printService);
        Player player3 = new Player("David", 10, printService);
        Team team = new Team(new Player[]{player1, player2, player3});

        team.startMatch();
    }
}
