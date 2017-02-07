package com.josecuentas.android_dagger2.view.activity;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import com.josecuentas.android_dagger2.Dagger2Application;
import com.josecuentas.android_dagger2.R;
import com.josecuentas.android_dagger2.domain.model.User;
import com.josecuentas.android_dagger2.presenter.UserPresenter;
import com.josecuentas.android_dagger2.view.adapter.ItemAdapter;

import java.util.List;

import javax.inject.Inject;

import butterknife.BindView;

/*
* Base: https://github.com/erikcaffrey/Kata-Dagger2-MarioKart
* Thank Erik
* */

public class MainActivity extends BaseActivity implements UserPresenter.View {

    private static final String TAG = MainActivity.class.getSimpleName();
    @Inject UserPresenter mUserPresenter;
    @Inject ItemAdapter mItemAdapter;
    @BindView(R.id.container) RecyclerView container;

    @Override protected int getLayoutResID() {
        return R.layout.activity_main;
    }

    @Override protected void onPrepareActivity() {
        super.onPrepareActivity();
        initializeDagger();
        setupRecycler();
    }

    @Override protected void onPreparePresenter() {
        super.onPreparePresenter();
        mUserPresenter.setView(this);
        mUserPresenter.initialize();
    }

    private void setupRecycler() {
        LinearLayoutManager llm = new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        container.setLayoutManager(llm);
        container.setHasFixedSize(true);
    }

    private void initializeDagger() {
        Dagger2Application app = (Dagger2Application) getApplication();
        app.getUsersComponent().inject(this);
    }

    @Override public void showUsers(List<User> users) {
        mItemAdapter.setItems(users);
        container.setAdapter(mItemAdapter);
        Log.d(TAG, "showUsers() called with: users.size = [" + users.size() + "]");
    }

    @Override public void hideLoading() {
        Log.d(TAG, "hideLoading() called");
    }
}
