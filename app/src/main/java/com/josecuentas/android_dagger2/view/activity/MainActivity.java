package com.josecuentas.android_dagger2.view.activity;

import android.os.Bundle;
import android.util.Log;

import com.josecuentas.android_dagger2.R;
import com.josecuentas.android_dagger2.di.DaggerUsersComponent;
import com.josecuentas.android_dagger2.di.UsersModule;
import com.josecuentas.android_dagger2.domain.model.User;
import com.josecuentas.android_dagger2.presenter.UserPresenter;

import java.util.List;

import javax.inject.Inject;

/*
* Base: https://github.com/erikcaffrey/Kata-Dagger2-MarioKart
* Thank Erik
* */

public class MainActivity extends BaseActivity implements UserPresenter.View {

    private static final String TAG = MainActivity.class.getSimpleName();
    @Inject UserPresenter mUserPresenter;

    @Override protected int getLayoutResID() {
        return R.layout.activity_main;
    }

    @Override protected void onPrepareActivity() {
        super.onPrepareActivity();
        initializeDagger();
        mUserPresenter.setView(this);
        mUserPresenter.initialize();
    }

    private void initializeDagger() {
        DaggerUsersComponent.builder().usersModule(new UsersModule())
                .build()
                .inject(this);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override public void showUsers(List<User> users) {
        Log.d(TAG, "showUsers() called with: users.size = [" + users.size() + "]");
    }

    @Override public void hideLoading() {
        Log.d(TAG, "hideLoading() called");
    }
}
