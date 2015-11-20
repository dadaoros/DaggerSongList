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

    public SongManager(PresenterOps.SongsListOps presenter) {

    }

    @Override
    public List getSongsList(int filter, String wordsTofilter) {
        return ShadowItems.getShadowSongList();
    }
}
