package com.josecuentas.dependencyinjection.module;

import com.josecuentas.dependencyinjection.MainActivity;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by jcuentas on 7/02/17.
 */
@Singleton @Component(modules = RootModule.class)
public interface DIComponent {
    void inject(MainActivity activity);
}
