package com.example.mortarsample;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.widget.FrameLayout;
import android.widget.TextView;

import javax.inject.Inject;

import butterknife.ButterKnife;
import butterknife.InjectView;
import mortar.Mortar;

/**
 * Created by sandeepgadde on 11/1/14.
 */
public class SecondView extends FrameLayout {

    @Inject
    SecondPresenter secondPresenter;

    @InjectView(R.id.text2)
    TextView textView;

    public SecondView(Context context, AttributeSet attrs) {
        super(context, attrs);
        Mortar.inject(context, this);
    }
    /**
     * Finalize inflating a view from XML.  This is called as the last phase
     * of inflation, after all child views have been added.
     * <p/>
     * <p>Even if the subclass overrides onFinishInflate, they should always be
     * sure to call the super method, so that we get called.
     */
    @Override
    protected void onFinishInflate() {
        super.onFinishInflate();
        Log.d(SecondView.class.getSimpleName(), String.valueOf(System.currentTimeMillis()));
        ButterKnife.inject(this, this);
        secondPresenter.takeView(this);
    }

    public void show(CharSequence stuff) {
        textView.setText(stuff);
    }
}
