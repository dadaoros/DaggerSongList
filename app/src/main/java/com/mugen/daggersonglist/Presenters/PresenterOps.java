package com.mugen.daggersonglist.Presenters;

import com.mugen.daggersonglist.Interactors.InteractorOps;

import java.util.List;

/**
 * Created by ORTEGON on 19/11/2015.
 */
public interface PresenterOps {
    public InteractorOps.SongsManagerOps getModel();

    interface SongsListOps extends PresenterOps{
        void onLoadSongsList(int filter, String wordsTofilter);
        void onSongsListLoaded(List songsList);
    }
}
