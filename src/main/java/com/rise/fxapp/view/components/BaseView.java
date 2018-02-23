package com.rise.fxapp.view.components;

import javafx.fxml.Initializable;

public interface BaseView<T> extends Initializable {

    void attachPresenter(T presenter);
}
