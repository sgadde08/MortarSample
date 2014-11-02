package com.example.mortarsample;

import android.os.Bundle;

import javax.inject.Inject;
import javax.inject.Singleton;

import mortar.ViewPresenter;

/**
 * Created by sandeepgadde on 11/1/14.
 */
@Singleton
public class SecondPresenter extends ViewPresenter<SecondView> {

    @Inject
    SecondPresenter() {

    }

    /**
     * Like {@link Bundler#onLoad}, but called only when {@link #getView()} is not
     * null, and debounced. That is, this method will be called exactly once for a given view
     * instance, at least until that view is {@link #dropView(Object) dropped}.
     * <p/>
     * See {@link #takeView} for details.
     *
     * @param savedInstanceState
     */
    @Override
    protected void onLoad(Bundle savedInstanceState) {
        super.onLoad(savedInstanceState);
    }

    /**
     * Like {@link Bundler#onSave}.
     *
     * @param outState
     */
    @Override
    protected void onSave(Bundle outState) {
        super.onSave(outState);
    }
}
