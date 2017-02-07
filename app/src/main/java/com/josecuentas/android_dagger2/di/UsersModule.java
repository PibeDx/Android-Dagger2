package com.josecuentas.android_dagger2.di;

import android.view.LayoutInflater;

import com.josecuentas.android_dagger2.data.DataSource;
import com.josecuentas.android_dagger2.data.Repository;
import com.josecuentas.android_dagger2.data.UserDataSource;
import com.josecuentas.android_dagger2.data.UserRepository;
import com.josecuentas.android_dagger2.view.adapter.ItemAdapter;

import dagger.Module;
import dagger.Provides;

/**
 * Created by jcuentas on 6/02/17.
 */

@Module public class UsersModule {

    @Provides DataSource provideUserDataSource() {
        return new UserDataSource();
    }

    @Provides Repository provideUserRepository(DataSource dataSource) {
        return new UserRepository(dataSource);
    }

    @Provides ItemAdapter provideItemAdapter(LayoutInflater layoutInflater) {
        return new ItemAdapter(layoutInflater);
    }
}
