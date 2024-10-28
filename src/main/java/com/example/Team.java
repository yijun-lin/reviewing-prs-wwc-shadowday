package com.example;

public class Team {
    private final Player[] players;

    public Team(Player[] players) {
        this.players = players;
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
