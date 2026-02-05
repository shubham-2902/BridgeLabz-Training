package com.day1.SongVault;
import java.util.*;

public class MediaLibrary<T> {
    List<T> mediaList = new ArrayList<>();

    public void add(T media) {
        mediaList.add(media);
    }

    public List<T> getAll() {
        return mediaList;
    }
}
