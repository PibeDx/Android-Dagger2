package com.josecuentas.android_dagger2.data;

import com.josecuentas.android_dagger2.domain.model.User;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jcuentas on 6/02/17.
 */

public class UserDataSource implements DataSource {

    private final List<User> mUserList;

    public UserDataSource() {
        mUserList = new ArrayList<>();
    }

    @Override public List<User> provideUserList() {
        addUser(getUserJose());
        addUser(getUserJuan());
        addUser(getUserJose());
        addUser(getUserJuan());
        addUser(getUserJose());
        addUser(getUserJuan());
        addUser(getUserJose());
        addUser(getUserJuan());
        addUser(getUserJose());
        addUser(getUserJuan());
        addUser(getUserJose());
        addUser(getUserJuan());
        addUser(getUserJose());
        addUser(getUserJuan());
        addUser(getUserJose());
        addUser(getUserJuan());
        addUser(getUserJose());
        addUser(getUserJuan());
        addUser(getUserJose());
        addUser(getUserJuan());
        return mUserList;
    }

    private User getUserJuan() {
        User user = new User();
        user.setName("Juan");
        user.setLastName("Perez");
        user.setAge(17);
        return user;
    }

    private User getUserJose() {
        User user = new User();
        user.setName("José");
        user.setLastName("Cuentas");
        user.setAge(23);
        return user;
    }

    private void addUser(User user) {
        mUserList.add(user);
    }
}
