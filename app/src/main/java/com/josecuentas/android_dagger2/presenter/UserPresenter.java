package com.josecuentas.android_dagger2.presenter;

import com.josecuentas.android_dagger2.data.UserRepository;
import com.josecuentas.android_dagger2.domain.model.User;

import java.util.List;

import javax.inject.Inject;

/**
 * Created by jcuentas on 6/02/17.
 */

public class UserPresenter extends Presenter<UserPresenter.View>{

    private UserRepository mUserRepository;

    @Inject public UserPresenter(UserRepository userRepository) {
        mUserRepository = userRepository;
    }

    @Override public void initialize() {
        super.initialize();
        getView().showUsers(mUserRepository.getAll());
        getView().hideLoading();
    }

    @Override public void terminate() {
        super.terminate();
        setView(null);
    }

    public interface View extends Presenter.View {
        void showUsers(List<User> users);
        void hideLoading();
    }
}
