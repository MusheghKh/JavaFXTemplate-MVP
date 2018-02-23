package com.rise.fxapp.view.components.main;

import com.rise.fxapp.service.PersonService;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class MainPresenter implements MainContract.Presenter {

    private MainViewController view;
    private PersonService personService;

    public MainPresenter(MainViewController view) {
        this.view = view;
        init();
    }

    private void init(){
        personService = new PersonService();
    }

    @Override
    public void showPerson() {
        log.debug("in showPerson");

        view.display(personService.getPerson());
    }
}
