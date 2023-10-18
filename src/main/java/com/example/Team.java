package com.example;

public class Team {
    private final Player[] players;

    public Team() {
        Player player1 = new Player("John", 7);
        Player player2 = new Player("Michael", 9);
        Player player3 = new Player("David", 10);

        this.players = new Player[]{player1, player2, player3};
    }

    public Player[] getPlayers() {
        return players;
    }

    public void startMatch() {
        for (Player p : players) {
            p.play();
        }
    }
}
