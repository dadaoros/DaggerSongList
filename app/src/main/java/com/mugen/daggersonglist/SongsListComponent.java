package com.mugen.daggersonglist;

import android.app.LoaderManager;
import android.content.Context;

import com.mugen.daggersonglist.Interactors.InteractorOps;
import com.mugen.daggersonglist.Modules.InteractorModule;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by ORTEGON on 19/11/2015.
 */
@Singleton
@Component(
        modules = {
                SongsListModule.class,
                InteractorModule.class
        }
)
public interface SongsListComponent {

    Context getContext();
    InteractorOps.SongsManagerOps getLoaderManagerInteractor();
}