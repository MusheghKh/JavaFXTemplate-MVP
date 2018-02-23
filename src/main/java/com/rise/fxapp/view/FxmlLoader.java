package com.rise.fxapp.view;

import com.rise.fxapp.FXApplication;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import lombok.extern.slf4j.Slf4j;

import java.io.IOException;

@Slf4j
public class FxmlLoader {

    Parent load(String location){
        log.debug("Loading FXML from " + location);

        FXMLLoader loader = new FXMLLoader(FXApplication.class.getResource(location));

        Parent parent = null;

        try {
            parent = loader.load();
        } catch (IOException e) {
            log.error("Error on load fxml", e);
        }

        return parent;
    }
}
