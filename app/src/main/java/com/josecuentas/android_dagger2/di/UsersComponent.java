package com.josecuentas.android_dagger2.di;

import com.josecuentas.android_dagger2.view.activity.MainActivity;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by jcuentas on 6/02/17.
 */

@Singleton @Component (modules = UsersModule.class) public interface UsersComponent {
    void inject(MainActivity mainActivity);
}
