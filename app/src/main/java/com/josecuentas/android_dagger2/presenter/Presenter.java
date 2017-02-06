package com.josecuentas.android_dagger2.presenter;

/**
 * Created by jcuentas on 6/02/17.
 */

public class Presenter <T extends Presenter.View>{

    private T view;

    public void setView(T view) {
        this.view = view;
    }

    public T getView() {
        return view;
    }

    public void initialize() {

    }

    public void terminate() {
        
    }

    public interface View {

    }
}
