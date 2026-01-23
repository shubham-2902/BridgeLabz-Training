package com.day10.gamingapp;

public class Node {

    int points;
    String playerName;
    int height;
    Node left, right;

    public Node(int points, String playerName) {
        this.points = points;
        this.playerName = playerName;
        this.height = 1;
    }
}

