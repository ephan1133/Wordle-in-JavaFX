package com.example.wordlegame;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;

public class GameOverWin {
    private BorderPane screen = new BorderPane();
    private Text congrats = new Text("Thank you for playing!");
    private Text continueMessage = new Text("Would you like to play again?");
    private final Button yes = new Button("Yes");
    private final Button no = new Button("No");
    private final Font font = Font.font("Times New Roman", FontWeight.SEMI_BOLD, FontPosture.REGULAR, 24);

    public GameOverWin() {
        congrats.setFill(Color.WHITE);
        congrats.setFont(font);
        continueMessage.setFill(Color.WHITE);
        continueMessage.setFont(font);
        HBox buttons = new HBox(10, yes, no);
        buttons.setAlignment(Pos.CENTER);
        VBox centerScreen = new VBox(10, congrats, continueMessage, buttons);
        centerScreen.setAlignment(Pos.CENTER);
        screen.setCenter(centerScreen);
        screen.setBackground(new Background(new BackgroundFill(Color.rgb(54, 69, 79), new CornerRadii(0), Insets.EMPTY)));
    }

    public BorderPane getScreen() {
        return screen;
    }
    public Button getYes() {
        return yes;
    }
    public Button getNo() {
        return no;
    }
}
