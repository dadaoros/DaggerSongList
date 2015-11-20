package com.mugen.daggersonglist;

import android.app.Application;
import android.content.Context;

import com.mugen.daggersonglist.Components.DaggerLoadSongsListComponent;
import com.mugen.daggersonglist.Modules.LoadSongsModule;

/**
 * Created by ORTEGON on 19/11/2015.
 */
public class SongsListApp extends Application {

    private SongsListComponent component;

    @Override
    public void onCreate() {
        super.onCreate();
        setupGraph();
    }

    /**
     * The object graph contains all the instances of the objects
     * that resolve a dependency
     * */
    private void setupGraph() {
        component = DaggerSongsListComponent.
                builder().
                songsListModule(new SongsListModule(this)).
                build();

    }

    public SongsListComponent getComponent() {
        return component;
    }

    public static SongsListApp getApp(Context context) {
        return (SongsListApp) context.getApplicationContext();
    }
}
