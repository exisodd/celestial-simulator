package edu.vanier.eastwest.models;

import javafx.scene.control.SplitPane;
import javafx.scene.control.skin.SplitPaneSkin;

public class MySplitPaneSkin extends SplitPaneSkin {

    public MySplitPaneSkin(SplitPane splitPane) {
        super(splitPane);
        consumeMouseEvents(false);
    }
}
