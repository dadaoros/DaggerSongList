package com.mugen.daggersonglist.Interactors;

import com.mugen.daggersonglist.Presenters.PresenterOps;
import com.mugen.daggersonglist.Presenters.SongsListPresenter;
import com.mugen.daggersonglist.Utils.ShadowItems;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ORTEGON on 19/11/2015.
 */
public class SongManager implements InteractorOps.SongsManagerOps {
    public static final int FILTER_BY_ARTIST=0;
    public static final int FILTER_BY_TITLE=1;
    private static SongManager songManager;
    private SongManager(){
        //private empty constructor
    }
    public static synchronized SongManager getInstance(){
        if(songManager==null)
            return songManager=new SongManager();
        return songManager;
    }

    @Override
    public List getSongsList(int filter, String wordsTofilter) {
        return ShadowItems.getShadowSongList();
    }
}
