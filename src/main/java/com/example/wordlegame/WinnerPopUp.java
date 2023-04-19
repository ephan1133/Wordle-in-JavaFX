package com.example.wordlegame;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.stage.Popup;

public class WinnerPopUp {
    private Popup winnerMessage;
    private Label message;
    private Button next = new Button("Continue");;
    private final String one = "Perfect!";
    private final String two = "Almost Perfect!";
    private final String three = "Awesome!";
    private final String four = "Good!";
    private final String five = "Cutting it close!";
    private final String six = "Phew!";
    private final String seven = "Sad.";
    public final Font font = Font.font("Times New Roman", FontWeight.SEMI_BOLD, FontPosture.REGULAR, 24);

    public WinnerPopUp() {
        message = new Label();
        initializeMessageNode(message);
        winnerMessage = new Popup();
        winnerMessage.getContent().add(message);

        next.setAlignment(Pos.CENTER);
        next.setFocusTraversable(false);
        next.setVisible(false);
    }
    public Popup getPopup() {
        return winnerMessage;
    }
    public Button getNext() { return next; }
    public void setMessage(int code) {
        if (code == 1) {
            message.setText(one);
        } else if (code == 2) {
            message.setText(two);
        } else if (code == 3) {
            message.setText(three);
        } else if (code == 4) {
            message.setText(four);
        } else if (code == 5) {
            message.setText(five);
        } else if (code == 6) {
            message.setText(six);
        } else {
            message.setText(seven);
        }
    }
    private void initializeMessageNode(Label message) {
        message.setTextFill(Color.WHITE);
        message.setFont(font);
        message.setBackground(new Background(new BackgroundFill(Color.BLACK, CornerRadii.EMPTY, Insets.EMPTY)));
        message.setMinWidth(150);
        message.setMinHeight(100);
        message.setAlignment(Pos.CENTER);
    }
}
