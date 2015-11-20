package com.mugen.daggersonglist.Components;

import com.mugen.daggersonglist.ActivityScope;
import com.mugen.daggersonglist.Modules.LoadSongsModule;
import com.mugen.daggersonglist.Presenters.PresenterOps;
import com.mugen.daggersonglist.SongsListComponent;
import com.mugen.daggersonglist.Views.SongsListFragment;

import dagger.Component;

/**
 * Created by ORTEGON on 19/11/2015.
 */
@ActivityScope
@Component(
        //el modulo actual no puede proporcionarnos el interactor, por eso requerimos de otro componente
       dependencies = SongsListComponent.class,
       modules = LoadSongsModule.class
)
public interface LoadSongsListComponent {

    void inject(SongsListFragment listFragment);

    PresenterOps.SongsListOps getPresenter();
}
