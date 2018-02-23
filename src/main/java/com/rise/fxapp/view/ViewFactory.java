package com.rise.fxapp.view;

import javafx.scene.Parent;
import lombok.extern.slf4j.Slf4j;

import java.util.HashMap;
import java.util.Map;

@Slf4j
public class ViewFactory {

    private FxmlLoader loader;
    private Map<String, Parent> viewInstances;

    public ViewFactory(FxmlLoader loader) {
        this.loader = loader;
        this.viewInstances = new HashMap<>();
    }

    public Parent getView(String view){
        Parent node = viewInstances.get(view);

        if (node == null){
            log.debug("Loading View");
            node = loader.load(view);
            viewInstances.put(view, node);

            return node;
        }else {
            log.debug("View already loaded");
        }

        return node;
    }
}
