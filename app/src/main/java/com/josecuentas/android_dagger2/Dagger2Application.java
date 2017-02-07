package com.josecuentas.android_dagger2;

import android.app.Application;

import com.josecuentas.android_dagger2.di.DaggerUsersComponent;
import com.josecuentas.android_dagger2.di.RootModule;
import com.josecuentas.android_dagger2.di.UsersComponent;
import com.josecuentas.android_dagger2.di.UsersModule;

/**
 * Created by jcuentas on 6/02/17.
 */

public class Dagger2Application extends Application {

    private UsersComponent mUsersComponent;

    @Override public void onCreate() {
        super.onCreate();

        mUsersComponent = DaggerUsersComponent.builder()
                .usersModule(new UsersModule())
                .rootModule(new RootModule(this)).build();
    }

    public UsersComponent getUsersComponent() {
        return mUsersComponent;
    }
}
