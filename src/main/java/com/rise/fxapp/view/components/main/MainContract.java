package com.rise.fxapp.view.components.main;

import com.rise.fxapp.model.Person;
import com.rise.fxapp.view.components.BaseView;

public interface MainContract {

    interface View extends BaseView<Presenter>{
        void display(Person person);
    }

    interface Presenter{
        void showPerson();
    }
}
