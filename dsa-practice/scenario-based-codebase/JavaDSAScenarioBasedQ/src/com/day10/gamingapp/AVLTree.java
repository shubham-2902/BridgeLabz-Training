package com.day10.gamingapp;
import java.util.*;

public class AVLTree {

    private Node root;

    // Comparator for ordering (points primary, name secondary)
    private int compare(int points1, String name1, int points2, String name2) {
        if (points1 != points2) return Integer.compare(points1, points2);
        return name1.compareTo(name2);
    }

    private int height(Node node) {
        return (node == null) ? 0 : node.height;
    }

    private int getBalance(Node node) {
        return (node == null) ? 0 : height(node.left) - height(node.right);
    }

    private Node rightRotate(Node y) {
        Node x = y.left;
        Node T2 = x.right;

        x.right = y;
        y.left = T2;

        y.height = 1 + Math.max(height(y.left), height(y.right));
        x.height = 1 + Math.max(height(x.left), height(x.right));

        return x;
    }

    private Node leftRotate(Node x) {
        Node y = x.right;
        Node T2 = y.left;

        y.left = x;
        x.right = T2;

        x.height = 1 + Math.max(height(x.left), height(x.right));
        y.height = 1 + Math.max(height(y.left), height(y.right));

        return y;
    }

    // =========================
    // Insert a (points, playerName)
    // =========================
    public void insert(int points, String playerName) {
        root = insert(root, points, playerName);
    }

    private Node insert(Node node, int points, String playerName) {
        if (node == null) return new Node(points, playerName);

        int cmp = compare(points, playerName, node.points, node.playerName);

        if (cmp < 0) node.left = insert(node.left, points, playerName);
        else if (cmp > 0) node.right = insert(node.right, points, playerName);
        else return node; // exact duplicate not allowed

        node.height = 1 + Math.max(height(node.left), height(node.right));
        int balance = getBalance(node);

        // LL
        if (balance > 1 && compare(points, playerName, node.left.points, node.left.playerName) < 0)
            return rightRotate(node);

        // RR
        if (balance < -1 && compare(points, playerName, node.right.points, node.right.playerName) > 0)
            return leftRotate(node);

        // LR
        if (balance > 1 && compare(points, playerName, node.left.points, node.left.playerName) > 0) {
            node.left = leftRotate(node.left);
            return rightRotate(node);
        }

        // RL
        if (balance < -1 && compare(points, playerName, node.right.points, node.right.playerName) < 0) {
            node.right = rightRotate(node.right);
            return leftRotate(node);
        }

        return node;
    }

    // =========================
    // Delete exact (points, playerName)
    // =========================
    public void delete(int points, String playerName) {
        root = delete(root, points, playerName);
    }

    private Node minValueNode(Node node) {
        while (node.left != null) node = node.left;
        return node;
    }

    private Node delete(Node node, int points, String playerName) {
        if (node == null) return null;

        int cmp = compare(points, playerName, node.points, node.playerName);

        if (cmp < 0) node.left = delete(node.left, points, playerName);
        else if (cmp > 0) node.right = delete(node.right, points, playerName);
        else {
            // node found
            if (node.left == null || node.right == null) {
                node = (node.left != null) ? node.left : node.right;
            } else {
                Node temp = minValueNode(node.right);
                node.points = temp.points;
                node.playerName = temp.playerName;
                node.right = delete(node.right, temp.points, temp.playerName);
            }
        }

        if (node == null) return null;

        node.height = 1 + Math.max(height(node.left), height(node.right));
        int balance = getBalance(node);

        // LL
        if (balance > 1 && getBalance(node.left) >= 0) return rightRotate(node);

        // LR
        if (balance > 1 && getBalance(node.left) < 0) {
            node.left = leftRotate(node.left);
            return rightRotate(node);
        }

        // RR
        if (balance < -1 && getBalance(node.right) <= 0) return leftRotate(node);

        // RL
        if (balance < -1 && getBalance(node.right) > 0) {
            node.right = rightRotate(node.right);
            return leftRotate(node);
        }

        return node;
    }

    // =========================
    // Display full leaderboard
    // =========================
    public void displayAllSorted() {
        if (root == null) {
            System.out.println("Leaderboard is empty.");
            return;
        }
        System.out.println("\n--- FULL LEADERBOARD (LOW → HIGH) ---");
        inorder(root);
    }

    private void inorder(Node node) {
        if (node == null) return;
        inorder(node.left);
        System.out.println(node.playerName + " -> " + node.points);
        inorder(node.right);
    }

    // =========================
    // Top K players
    // =========================
    public void displayTopK(int k) {
        if (root == null) {
            System.out.println("Leaderboard is empty.");
            return;
        }
        List<Node> top = new ArrayList<>();
        reverseInorder(root, top, k);

        System.out.println("\n--- TOP " + k + " PLAYERS ---");
        for (int i = 0; i < top.size(); i++) {
            Node n = top.get(i);
            System.out.println((i + 1) + ". " + n.playerName + " (" + n.points + ")");
        }
    }

    private void reverseInorder(Node node, List<Node> list, int k) {
        if (node == null || list.size() == k) return;
        reverseInorder(node.right, list, k);
        if (list.size() < k) list.add(node);
        reverseInorder(node.left, list, k);
    }
}
