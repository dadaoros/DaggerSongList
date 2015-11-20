package com.mugen.daggersonglist.Views;

import java.util.List;

/**
 * Created by ORTEGON on 19/11/2015.
 */
public interface ViewOps {
    interface songsListOps{
        void displaySongsList(List songs);
        void displayLoadFailedMessage(String message);
    }
}
