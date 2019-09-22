package com.android.mymusicapp;

public class Song {

  /**
   * Declaring song variables
   */
  private String songName;
  private String songArtist;
  private String songAlbum;
  private String songPlayList;
  private String songCategory;
  private String songDuration;

  /**
   * Create a new Song object "Constructor".
   *
   * @param songName is the song name
   * @param songArtist is the song Artist
   * @param songAlbum is the song album
   * @param songPlayList is the song playlist
   * @param songCategory is the song category
   * @param songDuration is the song duration "time"
   */
  public Song(String songName, String songArtist, String songAlbum, String songPlayList,
      String songCategory, String songDuration) {
    this.songName = songName;
    this.songArtist = songArtist;
    this.songAlbum = songAlbum;
    this.songPlayList = songPlayList;
    this.songCategory = songCategory;
    this.songDuration = songDuration;
  }

  /**
   * Get Song variables data.
   */
  public String getSongDuration() {
    return songDuration;
  }

  public String getSongName() {
    return songName;
  }

  public String getSongArtist() {
    return songArtist;
  }

  public String getSongAlbum() {
    return songAlbum;
  }

  public String getSongPlayList() {
    return songPlayList;
  }

  public String getSongCategory() {
    return songCategory;
  }

}
