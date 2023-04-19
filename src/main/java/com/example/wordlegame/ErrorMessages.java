package com.example.wordlegame;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.stage.Popup;

public class ErrorMessages {
    private Popup error;
    private Label errorMessage;
    private String notLongEnough = "This word is not long enough.";
    private String notAWord = "This is not in the word list.";
    public final Font font = Font.font("Times New Roman", FontWeight.SEMI_BOLD, FontPosture.REGULAR, 24);

    public ErrorMessages() {
        errorMessage = new Label();
        errorMessage.setTextFill(Color.WHITE);
        errorMessage.setFont(font);
        errorMessage.setBackground(new Background(new BackgroundFill(Color.BLACK, CornerRadii.EMPTY, Insets.EMPTY)));
        errorMessage.setMinWidth(150);
        errorMessage.setMinHeight(100);
        errorMessage.setAlignment(Pos.CENTER);
        error = new Popup();
        error.getContent().add(errorMessage);
    }

    public void setErrorMessage(int a) {
        if (a == 1) {
            errorMessage.setText(notAWord);
        } else if (a == 2) {
            errorMessage.setText(notLongEnough);
        } else if (a == 0) {
            errorMessage.setText("");
        }
    }
    public Popup getError() {
        return error;
    }
    public Label getErrorMessage() {
        return  errorMessage;
    }

}
