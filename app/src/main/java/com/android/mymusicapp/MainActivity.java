package com.android.mymusicapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

  public static final String COLOR_KEY = "colorName";

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    // Making ArrayList of data and putting data into it.
    final ArrayList<Song> songs = new ArrayList<Song>();

    // adding objects of songs to th array list.
    songs.add(new Song("Hello", "Adele", "Hello", "Romance", "Rock", "3:40"));
    songs.add(new Song("Your Voice", "Mohammed Moneir", "Your Voice", "Romance", "Rock", "4:20"));
    songs.add(new Song("Yak", "Ahsen Almaz", "Yak", "Romance", "Jazz", "5:10"));
    songs.add(new Song("Bamboo", "Shakira", "Bamboo", "Dance", "Jazz", "3:44"));
    songs.add(new Song("Hardest Word", "Moein Sherif", "Hardest Word", "Romance", "Rock", "5:00"));

    // getting the song adapter.
    final SongAdapter songAdapter = new SongAdapter(this, songs);

    // defining the list view.
    ListView listView = (ListView) findViewById(R.id.list_view);
    // Attaching the adapter to the list view.
    listView.setAdapter(songAdapter);

    // setting on Item click listner to open the PlaySongActivity Activity and send the song data to it.
    listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
      @Override
      public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        TextView songName = view.findViewById(R.id.song_name);
        TextView songArtist = view.findViewById(R.id.song_artist);
        TextView songDuaration = view.findViewById(R.id.song_duration);
        ImageView songImage = view.findViewById(R.id.song_image);
        Intent intent = new Intent(MainActivity.this, PlaySongActivity.class);
        intent.putExtra("songname", songName.getText().toString());
        intent.putExtra("artistname", songArtist.getText().toString());
        intent.putExtra("songduration", songDuaration.getText().toString());
        intent.putExtra("songimage", R.id.song_image);
        startActivity(intent);
      }
    });

    Button goToNowPlayingButton = (Button) findViewById(R.id.goto_now_play_song_btn);
    goToNowPlayingButton.setOnClickListener(new OnClickListener() {
      @Override
      public void onClick(View v) {
        Intent i = new Intent(MainActivity.this, PlaySongActivity.class);
        startActivity(i);
      }
    });

  }

}
