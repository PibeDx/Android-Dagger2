package com.josecuentas.android_dagger2.view.activity;

import android.os.Bundle;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import com.josecuentas.android_dagger2.R;
import com.josecuentas.android_dagger2.presenter.Presenter;

import butterknife.ButterKnife;

/**
 * Created by jcuentas on 6/02/17.
 */

public abstract class BaseActivity extends AppCompatActivity implements Presenter.View {

    Toolbar toolbar;

    @Override protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayoutResID());
        bindViews();
        onPrepareSupportActionBar();
        onPrepareActivity();
        onPreparePresenter();
    }

    protected void onPrepareSupportActionBar() {
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        if (toolbar != null) {
            setSupportActionBar(toolbar);
            ActionBar actionBar = getSupportActionBar();
            if (actionBar != null) {
                onSetupSupportActionBar(actionBar);
            }
        }
    }

    protected void onSetupSupportActionBar(@NonNull ActionBar actionBar) {}

    protected void onPrepareActivity() {}

    protected void onPreparePresenter() {}

    protected void bindViews() {
        ButterKnife.bind(this);
    }

    @LayoutRes protected abstract int getLayoutResID();
}
