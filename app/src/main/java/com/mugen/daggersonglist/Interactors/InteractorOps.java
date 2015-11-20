package com.mugen.daggersonglist.Interactors;

import java.util.List;

/**
 * Created by ORTEGON on 19/11/2015.
 */
public interface InteractorOps {

    interface SongsManagerOps {
        List getSongsList(int filter, String wordsTofilter);
    }
}
