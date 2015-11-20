package com.mugen.daggersonglist.Views;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.mugen.daggersonglist.R;

import java.util.List;

/**
 * Created by ORTEGON on 19/11/2015.
 */
public class SongsListAdapter extends ArrayAdapter {
    List<String> songs;
    public SongsListAdapter(Context context, List songs) {
        super(context, R.layout.song_list_item , songs);
        this.songs=songs;

    }
    @Override
    public int getCount() {
        return songs.size();
    }

    @Override
    public Object getItem(int position) {
        return songs.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View view, ViewGroup parent) {
        if (view == null)
            view = ((Activity)getContext()).getLayoutInflater().inflate(R.layout.song_list_item, null);

        TextView songName= (TextView) view.findViewById(R.id.song_name);;
        songName.setText(songs.get(position));
        return view;
    }
}
