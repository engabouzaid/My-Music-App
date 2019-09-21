package com.android.mymusicapp;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;

public class SongAdapter extends ArrayAdapter<Song> {

  /**
   * Create the constructor like the parent and attach no recource to it.
   *
   * @param context is the song name
   * @param songs is the song Artist
   */
  public SongAdapter(Activity context, ArrayList<Song> songs) {
    super(context, 0, songs);
  }

  /**
   * defining the getView to inflate our custum song item layout into the parent.
   *
   * @param position is the song name
   * @param convertView is the song Artist
   * @param parent is the song Artist
   */
  public View getView(int position, View convertView, ViewGroup parent) {

    // attaching the view to convertview.
    View listItemView = convertView;

    // check if view is empty or used to inflate our custom layout.
    if (listItemView == null) {
      listItemView = LayoutInflater.from(getContext()).inflate(R.layout.songitem, parent, false);
    }
    // Attaching data to the inflated layout.
    Song currentSong = getItem(position);
    TextView songName = (TextView) listItemView.findViewById(R.id.song_name);
    songName.setText(currentSong.getSongName());
    TextView songArtist = (TextView) listItemView.findViewById(R.id.song_artist);
    songArtist.setText(currentSong.getSongArtist());
    TextView songDuration = (TextView) listItemView.findViewById(R.id.song_duration);
    songDuration.setText(currentSong.getSongDuration());
    ImageView songImage = (ImageView) listItemView.findViewById(R.id.song_image);
    songImage.setImageResource(R.drawable.song64);

    return listItemView;
  }
}
