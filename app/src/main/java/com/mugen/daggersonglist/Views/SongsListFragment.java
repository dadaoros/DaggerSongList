package com.mugen.daggersonglist.Views;


import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.mugen.daggersonglist.R;

import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class SongsListFragment extends Fragment{
    private final String TAG = this.getClass().getName();
    public SongsListFragment() {
        // Required empty public constructor
    }
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_songs_list, container, false);
        return view;
    }
    public void onResume() {
        super.onResume();
    }
}
