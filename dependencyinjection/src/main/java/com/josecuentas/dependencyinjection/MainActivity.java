package com.josecuentas.dependencyinjection;

import android.content.Context;

import javax.inject.Inject;

public class MainActivity extends BaseActivity {

    @Inject Context context;

    @Override protected int getLayoutID() {
        return R.layout.activity_main;
    }

    @Override protected void onPrepareActivity() {
        super.onPrepareActivity();
        initializeDagger();
    }

    private void initializeDagger() {
        DIApplication app = (DIApplication) getApplication();
        app.getComponent().inject(this);
    }

}
