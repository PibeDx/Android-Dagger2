package com.josecuentas.dependencyinjection;

import android.app.Application;

import com.josecuentas.dependencyinjection.module.DIComponent;
import com.josecuentas.dependencyinjection.module.DaggerDIComponent;
import com.josecuentas.dependencyinjection.module.RootModule;

/**
 * Created by jcuentas on 7/02/17.
 */

public class DIApplication extends Application {

    DIComponent component;

    @Override public void onCreate() {
        super.onCreate();
        component = DaggerDIComponent.builder().rootModule(new RootModule(this)).build();
    }

    public DIComponent getComponent() {
        return component;
    }
}
