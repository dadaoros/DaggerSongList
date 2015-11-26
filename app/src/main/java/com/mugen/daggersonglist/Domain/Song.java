package com.mugen.daggersonglist.Domain;

/**
 * Created by ORTEGON on 20/11/2015.
 */
public class Song implements Comparable<Song>{
    private String songName;
    private String fileName;
    private String songLength;
    private String artistName;

    public Song(String artistName, String songName, String fileName, String songLength) {
        this.artistName = artistName;
        this.songName = songName;
        this.fileName = fileName;
        this.songLength = songLength;
    }

    public String getArtistName() {
        return artistName;
    }


    public String getSongName() {
        return songName;
    }

    public String getFileName() {
        return fileName;
    }

    public String getSongLength() {
        return songLength;
    }

    @Override
    public int compareTo(Song song) {
        return 0;
    }
}
