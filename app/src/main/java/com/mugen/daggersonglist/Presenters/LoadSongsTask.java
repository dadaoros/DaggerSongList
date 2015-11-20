package com.mugen.daggersonglist.Presenters;

import android.os.AsyncTask;

import java.util.List;

/**
 * Created by ORTEGON on 19/11/2015.
 */
public class LoadSongsTask extends AsyncTask<PresenterOps.SongsListOps, Void, List> {
    private int mFilterId;
    private String mWordsToFilter;
    private PresenterOps.SongsListOps presenter;
    public LoadSongsTask(int filterId,String wordsToFilter){
        mFilterId=filterId;
        mWordsToFilter=wordsToFilter;
    }
    @Override
    protected List doInBackground(PresenterOps.SongsListOps... presenters) {
        presenter=presenters[0];
        return presenter.getModel().getSongsList(mFilterId,mWordsToFilter);
    }
    @Override
    protected void onPostExecute(List result) {
        super.onPostExecute(result);
        presenter.onSongsListLoaded(result);

    }
}
