package com.mugen.daggersonglist.Components;

import com.mugen.daggersonglist.Modules.LoadSongsModule;
import com.mugen.daggersonglist.Presenters.SongsListPresenter;
import com.mugen.daggersonglist.Views.SongsListFragment;

import dagger.Component;

/**
 * Created by ORTEGON on 19/11/2015.
 */
//@ActivityScope
@Component(
       //dependencies = SpotifyStreamerComponent.class,
       modules = LoadSongsModule.class
)
public interface LoadSongsListComponent {

    void inject(SongsListFragment listFragment);

    //SongsListPresenter getPresenter();
}
