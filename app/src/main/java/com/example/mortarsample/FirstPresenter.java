package com.example.mortarsample;

import android.os.Bundle;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.inject.Inject;
import javax.inject.Singleton;

import mortar.ViewPresenter;

/**
 * Created by sandeepgadde on 11/1/14.
 */
@Singleton
public class FirstPresenter extends ViewPresenter<FirstView> {
    private final DateFormat format = new SimpleDateFormat();

    private int serial = -1;

    @Inject
    FirstPresenter() {
    }

    @Override protected void onLoad(Bundle savedInstanceState) {
        super.onLoad(savedInstanceState);
        if (savedInstanceState != null && serial == -1) serial = savedInstanceState.getInt("serial");

        getView().show("Update #" + ++serial + " at " + format.format(new Date()));
    }

    @Override protected void onSave(Bundle outState) {
        super.onSave(outState);
        outState.putInt("serial", serial);
    }
}
