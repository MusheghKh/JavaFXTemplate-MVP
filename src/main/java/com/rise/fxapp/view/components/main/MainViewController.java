package com.rise.fxapp.view.components.main;

import com.rise.fxapp.model.Person;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import lombok.extern.slf4j.Slf4j;

import java.net.URL;
import java.util.ResourceBundle;

@Slf4j
public class MainViewController implements MainContract.View{

    private MainContract.Presenter presenter;

    @FXML
    private BorderPane mainPane;
    @FXML
    private Button btnShow;
    @FXML
    private Label lblResult;


    @Override
    public void display(Person person) {
        log.debug("Displaying person");

        lblResult.setText(person.getName() + " " + person.getAge());
    }

    @FXML
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        attachPresenter(new MainPresenter(this));

        btnShow.setOnAction(e -> presenter.showPerson());
    }

    @Override
    public void attachPresenter(MainContract.Presenter presenter) {
        this.presenter = presenter;
    }
}
