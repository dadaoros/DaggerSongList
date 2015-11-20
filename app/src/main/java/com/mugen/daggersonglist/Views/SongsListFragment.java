package com.mugen.daggersonglist.Views;


import android.content.Context;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.mugen.daggersonglist.Interactors.SongManager;
import com.mugen.daggersonglist.Presenters.PresenterOps;
import com.mugen.daggersonglist.Presenters.SongsListPresenter;
import com.mugen.daggersonglist.R;

import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class SongsListFragment extends Fragment implements ViewOps.songsListOps{
    private final String TAG = this.getClass().getName();
    ListView listView;
    PresenterOps.SongsListOps presenter;
    public SongsListFragment() {
        // Required empty public constructor
    }
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        presenter = new SongsListPresenter(this,SongManager.getInstance());

    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_songs_list, container, false);
        listView=(ListView)view.findViewById(R.id.list_songs);
        FloatingActionButton fab = (FloatingActionButton) view.findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        return view;
    }
    public void onResume() {
        super.onResume();
        presenter.onLoadSongsList(SongManager.FILTER_BY_TITLE,"");
    }

    @Override
    public void displaySongsList(List songs) {
        listView.setAdapter(new SongsListAdapter(getContext(),songs));
    }

    @Override
    public void displayLoadFailedMessage(String message) {
        Toast.makeText(getContext(),message,Toast.LENGTH_SHORT).show();
    }
}
