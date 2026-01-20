package com.day8.gamerzone;
import java.util.ArrayList;
import java.util.List;

public class GamerZoneService {

    private List<Player> players = new ArrayList<>();

    public void addPlayer(Player p) {
        players.add(p);
    }

    public List<Player> getPlayers() {
        return players;
    }

    public Player findById(String id) {
        for (Player p : players) {
            if (p.getPlayerId().equalsIgnoreCase(id)) return p;
        }
        return null;
    }

    public void printAll() {
        if (players.isEmpty()) {
            System.out.println("No players added.");
            return;
        }
        for (Player p : players) {
            System.out.println(p);
        }
    }

    public void printTopK(int k) {
        if (players.isEmpty()) {
            System.out.println("No players available.");
            return;
        }
        int limit = Math.min(k, players.size());
        for (int i = 0; i < limit; i++) {
            System.out.println((i + 1) + ") " + players.get(i));
        }
    }
}
