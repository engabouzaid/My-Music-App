package com.android.mymusicapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class PlaySongActivity extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_play_song);

    // Recieving the intent.
    Intent intent = getIntent();

    //Recieving song name and putting it to its text view.
    String songName = intent.getStringExtra("songname");
    TextView songNameTextView = (TextView) findViewById(R.id.songname);
    songNameTextView.setText(songName);

    //Recieving song artist name and putting it to its text view.
    String songArtist = intent.getStringExtra("artistname");
    TextView songArtistTextView = (TextView) findViewById(R.id.songartist);
    songArtistTextView.setText(songArtist);

    //Recieving song duration and putting it to its text view.
    String songDuration = intent.getStringExtra("songduration");
    TextView songDurationTextView = (TextView) findViewById(R.id.songduraion);
    songDurationTextView.setText(songDuration);

    // Defining function of play/pause button ( Image ).
    ImageView playPauseBTN = (ImageView) findViewById(R.id.pause_btn);
    playPauseBTN.setOnClickListener(new OnClickListener() {
      @Override
      public void onClick(View v) {
        Toast.makeText(PlaySongActivity.this, "Playing", Toast.LENGTH_SHORT).show();
      }
    });

    // Defining function of play Next button ( Image ).
    ImageView playNextBTN = (ImageView) findViewById(R.id.play_next_btn);
    playNextBTN.setOnClickListener(new OnClickListener() {
      @Override
      public void onClick(View v) {
        Toast.makeText(PlaySongActivity.this, "Play Next", Toast.LENGTH_SHORT).show();
      }
    });

    // Defining function of play Previous button ( Image ).
    ImageView playPreviousBTN = (ImageView) findViewById(R.id.play_previous_btn);
    playPreviousBTN.setOnClickListener(new OnClickListener() {
      @Override
      public void onClick(View v) {
        Toast.makeText(PlaySongActivity.this, "Play Previous", Toast.LENGTH_SHORT).show();
      }
    });

  }
}
