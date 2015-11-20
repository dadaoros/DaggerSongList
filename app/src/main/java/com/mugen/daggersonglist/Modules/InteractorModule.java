package com.mugen.daggersonglist.Modules;

import com.mugen.daggersonglist.Interactors.InteractorOps;
import com.mugen.daggersonglist.Interactors.SongManager;

import dagger.Module;
import dagger.Provides;

/**
 * Created by ORTEGON on 19/11/2015.
 */

@Module
public class InteractorModule {

    @Provides
    public InteractorOps.SongsManagerOps provideSongManagerInteractor(){
        return new SongManager();
    }

}