package com.rise.fxapp;

import com.rise.fxapp.view.FxmlLoader;
import com.rise.fxapp.view.ViewFactory;
import com.rise.fxapp.view.ViewLocation;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class FXApplication extends Application {

    private ViewFactory viewFactory;

    @Override
    public void init() throws Exception {
        super.init();
        viewFactory = new ViewFactory(new FxmlLoader());
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("title");
        Scene scene = new Scene(viewFactory.getView(ViewLocation.MAIN_VIEW));

        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        log.info("Launching app");
        launch(args);
    }
}
