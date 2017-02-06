package com.josecuentas.android_dagger2.data;

import com.josecuentas.android_dagger2.domain.model.User;

import java.util.List;

import javax.inject.Inject;

/**
 * Created by jcuentas on 6/02/17.
 */

public class UserRepository implements Repository {

    List<User> mUserList;

    @Inject public UserRepository(DataSource dataSource) {
        mUserList = dataSource.provideUserList();
    }

    @Override public List<User> getAll() {
        return mUserList;
    }
}
