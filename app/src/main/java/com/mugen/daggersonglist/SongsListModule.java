package com.mugen.daggersonglist;

import android.app.Application;
import android.content.Context;

import javax.inject.Singleton;

import dagger.Provides;

/**
 * Created by ORTEGON on 19/11/2015.
 */
public class SongsListModule {

    private SongsListApp app;
    public SongsListModule(SongsListApp app) {
        this.app=app;
    }
    @Provides
    @Singleton
    public Application provideApplication() {
        return app;
    }

    @Provides @Singleton
    public Context provideContext() {
        return app;
    }
}
