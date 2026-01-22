package com.day9.musicapp;

public class TitleBST {
    private TitleNode root;

    public void insert(Track track) {
        root = insertRec(root, track);
    }

    private TitleNode insertRec(TitleNode root, Track track) {
        if (root == null) return new TitleNode(track);

        String title = track.getTitle().toLowerCase();
        String rootTitle = root.track.getTitle().toLowerCase();

        int cmp = title.compareTo(rootTitle);

        if (cmp < 0) root.left = insertRec(root.left, track);
        else if (cmp > 0) root.right = insertRec(root.right, track);
        else {
            // If titles clash, use trackId as tie-breaker
            if (track.getTrackId() < root.track.getTrackId()) root.left = insertRec(root.left, track);
            else root.right = insertRec(root.right, track);
        }

        return root;
    }

    public void displayPlaylistAlphabetically() {
        if (root == null) {
            System.out.println("No tracks in library.");
            return;
        }
        System.out.println("Playlist (Alphabetical by Title):");
        inorder(root);
    }

    private void inorder(TitleNode root) {
        if (root == null) return;
        inorder(root.left);
        System.out.println(root.track);
        inorder(root.right);
    }
}
