package com.josecuentas.android_dagger2.di;

import android.content.Context;
import android.view.LayoutInflater;

import dagger.Module;
import dagger.Provides;

/**
 * Created by jcuentas on 7/02/17.
 */
@Module
public class RootModule {

    private final Context context;

    public RootModule(Context context) {
        this.context = context;
    }

    @Provides Context provideApplicationContext(){
        return context;
    }

    @Provides LayoutInflater provideLayoutInflater(Context context) {
        return LayoutInflater.from(context);
    }
}
