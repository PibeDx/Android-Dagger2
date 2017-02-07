package com.josecuentas.dependencyinjection;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by jcuentas on 7/02/17.
 */

public abstract class BaseActivity extends AppCompatActivity {

    @Override protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayoutID());
        onPrepareActivity();
    }

    protected void onPrepareActivity() {}

    protected abstract int getLayoutID();
}
