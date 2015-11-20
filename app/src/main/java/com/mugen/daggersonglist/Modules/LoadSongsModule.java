package com.mugen.daggersonglist.Modules;

import com.mugen.daggersonglist.Interactors.InteractorOps;
import com.mugen.daggersonglist.Presenters.LoadSongsTask;
import com.mugen.daggersonglist.Presenters.PresenterOps;
import com.mugen.daggersonglist.Presenters.SongsListPresenter;
import com.mugen.daggersonglist.Views.ViewOps;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by ORTEGON on 19/11/2015.
 */
@Module
public class LoadSongsModule {
    private ViewOps.songsListOps view;
    public LoadSongsModule(ViewOps.songsListOps view){
        this.view=view;
    }
    @Provides
    public ViewOps.songsListOps provideView(){
        return view;
    }

    @Provides
    @Singleton
    public PresenterOps.SongsListOps providePresenter
            (ViewOps.songsListOps view,InteractorOps.SongsManagerOps interactor){
        return new SongsListPresenter(view,interactor);
    }


}
