package com.mugen.daggersonglist.Presenters;

import android.os.AsyncTask;

import com.mugen.daggersonglist.Interactors.InteractorOps;
import com.mugen.daggersonglist.Interactors.SongManager;
import com.mugen.daggersonglist.Views.ViewOps;

import java.lang.ref.WeakReference;
import java.util.List;

/**
 * Created by ORTEGON on 19/11/2015.
 */
public class SongsListPresenter implements PresenterOps.SongsListOps {
    private InteractorOps.SongsManagerOps model;
    WeakReference<ViewOps.songsListOps> mView;
    public SongsListPresenter(ViewOps.songsListOps view,InteractorOps.SongsManagerOps model){
        mView=new WeakReference<ViewOps.songsListOps>(view);
        this.model=model;
    }
    @Override
    public void onLoadSongsList(int filter, String wordsToFilter) {
        new LoadSongsTask(filter,wordsToFilter).execute(this);
    }

    @Override
    public void onSongsListLoaded(List songsList) {
        mView.get().displaySongsList(songsList);
    }
    public InteractorOps.SongsManagerOps getModel(){
        return model;
    }
}
