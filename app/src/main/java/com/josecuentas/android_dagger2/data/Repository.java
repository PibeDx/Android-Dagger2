package com.josecuentas.android_dagger2.data;

import com.josecuentas.android_dagger2.domain.model.User;

import java.util.List;

/**
 * Created by jcuentas on 6/02/17.
 */

public interface Repository {
    List<User> getAll();
}
