package com.day9.musicapp;

public class TrackIdBST {
    private TrackIdNode root;

    public void insert(Track track) {
        root = insertRec(root, track);
    }

    private TrackIdNode insertRec(TrackIdNode root, Track track) {
        if (root == null) return new TrackIdNode(track);

        int id = track.getTrackId();
        int rootId = root.track.getTrackId();

        if (id < rootId) root.left = insertRec(root.left, track);
        else if (id > rootId) root.right = insertRec(root.right, track);
        else System.out.println("Duplicate TrackID not allowed: " + id);

        return root;
    }

    public Track search(int trackId) {
        TrackIdNode node = searchRec(root, trackId);
        return node == null ? null : node.track;
    }

    private TrackIdNode searchRec(TrackIdNode root, int trackId) {
        if (root == null) return null;

        int rootId = root.track.getTrackId();
        if (trackId == rootId) return root;
        if (trackId < rootId) return searchRec(root.left, trackId);
        return searchRec(root.right, trackId);
    }
}
