package com.hrcard.controller;

import com.hrcard.domain.CharacterClass;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.scene.control.*;
import org.springframework.stereotype.Controller;

@Controller
public class JavaFxController {
    public TextField enterName;
    public ChoiceBox<CharacterClass> characterClass;
    public Menu file;
    public MenuItem fileSave;
    public MenuItem fileLoad;
    public MenuItem fileClose;
    public Label startingHP;

    public void initialize() {
        characterClass.getItems().addAll(CharacterClass.values());
    }

    public void fileClose() {
        Platform.exit();
    }
}
