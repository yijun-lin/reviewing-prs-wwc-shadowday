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
            if (p.isInjured()) {
                throw new IllegalStateException("Cannot start match. " + p.getName() + " is injured.");
            }
            p.play();
        }
    }

    public boolean allPlayersFit() {
        for (Player p : players) {
            if (p.isInjured()) {
                return false;
            }
        }
        return true;
    }
}
