package com.example.wordlegame;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.layout.Background;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;

public class WordleGame {
    private WordBank wordbank;
    private int current;
    private int currentAttempt;
    private Attempt one;
    private Attempt two;
    private Attempt three;
    private Attempt four;
    private Attempt five;
    private Attempt six;
    private Keyboard keyboard;

    private BorderPane screen;
    private VBox attemptCollection;
    private Label title;
    private WinnerPopUp win;
    private ErrorMessages error;


    public WordleGame() {
        title = new Label("Wordle");
        title.setTextFill(Color.WHITE);
        Font titleFont = Font.font("Times New Roman", FontWeight.BOLD, FontPosture.REGULAR, 30);
        title.setFont(titleFont);
        wordbank = new WordBank();
        keyboard = new Keyboard();
        win = new WinnerPopUp();
        error = new ErrorMessages();
        current = 0;
        currentAttempt = 1;
        one = new Attempt();
        two = new Attempt();
        three = new Attempt();
        four = new Attempt();
        five = new Attempt();
        six = new Attempt();
        VBox keys = keyboard.getCollection();
        attemptCollection = new VBox(30.0,
                one.getGamePlace(),
                two.getGamePlace(),
                three.getGamePlace(),
                four.getGamePlace(),
                five.getGamePlace(),
                six.getGamePlace(),
                keys);
        screen = new BorderPane();
        screen.setPadding(new Insets(10));
        screen.setBackground(new Background(new BackgroundFill(Color.rgb(54, 69, 79), new CornerRadii(0), Insets.EMPTY)));
        screen.setTop(title);
        screen.setAlignment(title, Pos.CENTER);
        screen.setCenter(attemptCollection);
        screen.setAlignment(attemptCollection, Pos.BOTTOM_CENTER);
        screen.setBottom(win.getNext());
        screen.setAlignment(win.getNext(), Pos.CENTER);
    }

    public BorderPane getScreen() {
        return screen;
    }
    public Keyboard getKeyboard() {
        return keyboard;
    }
    public Attempt getCertainAttempt(int a) {
        if (a == 1) {
            return one;
        } else if (a == 2) {
            return two;
        } else if (a == 3) {
            return three;
        } else if (a == 4) {
            return four;
        } else if (a == 5) {
            return five;
        } else if (a == 6) {
            return six;
        } else {
            return null;
        }
    }
    public int getCurrent() {
        return current;
    }
    public int getCurrentAttempt() {
        return currentAttempt;
    }
    public void updateAttemptCounter() {
        if (getCertainAttempt(currentAttempt).getList().get(current).getText().equals("") || current == 5) {
            return;
        } else {
            current++;
        }
    }
    public void decrementGameCounter() {
        if (current == 0) {
            return;
        } else {
            current--;
        }
    }
    public void nextAttempt() {
        if (currentAttempt == 6) {
            // end the game and say you lost
            System.out.println("You lose");

        } else {
            currentAttempt++;
            current = 0;
        }
    }
    public boolean enterCheck() {
        boolean isCorrect = false;
        String currWord = convertListWord();
        System.out.println("This is the correct word: " + wordbank.getCorrectWord());

        boolean isInBank = isInBank(currWord);
        if (isInBank == true) {
            isCorrect = checkCompletelyCorrect(currWord);
            if (isCorrect == false) {
                checkPartiallyCorrect(currWord);
                error.setErrorMessage(0);
            }
        } else {
            if (currWord.length() < 5) {
                error.setErrorMessage(2);
            } else if (!isInBank) {
                error.setErrorMessage(1);
            }
        }
        if (isCorrect == true) {
            // display winner screen
            getWin().setMessage(currentAttempt);
            return true;
        } else {
            if (currWord.length() < 5 || isInBank == false) {
                return false;
            }
            if (currentAttempt == 6) {
                getWin().setMessage(7);
                currentAttempt = 7;
            } else {
                nextAttempt();
            }
            return false;
        }
    }
    public String convertListWord() {
        String c = new String();
        for (int i = 0; i < 5; i++) {
            c = c + getCertainAttempt(currentAttempt).getString(i);
        }
        return c;
    }
    public boolean isInBank(String s) {
        if (s.length() < 5) {
            return false;
        } else {
            int hashcode = s.toLowerCase().hashCode();
            String word = (String) wordbank.getWordBank().get(hashcode);
            if (word == null) {
                return false;
            } else {
                return true;
            }
        }
    }
    public boolean checkCompletelyCorrect(String s) {
        int hashcode = s.toLowerCase().hashCode();
        String word = (String) wordbank.getWordBank().get(hashcode);
        if (word.equals(wordbank.getCorrectWord())) {
            allGreen();
            win.getNext().setVisible(true);
            return true;
        } else {
            return false;
        }
    }
    public void checkPartiallyCorrect(String s) {
        String input = s.toLowerCase();
        String correctWord = wordbank.getCorrectWord();
        char first = correctWord.charAt(0);
        char second = correctWord.charAt(1);
        char third = correctWord.charAt(2);
        char fourth = correctWord.charAt(3);
        char fifth = correctWord.charAt(4);
        int counter = 0;
        // edge case of word having multiple of the same letters not accounted for
        for (counter = 0; counter < 5; counter++) {
            char in = input.charAt(counter);
            if (in == first || in == second || in == third || in == fourth || in == fifth) {
                if (in == correctWord.charAt(counter)) {
                    // flip green animation
                    getCertainAttempt(currentAttempt).rotateGreen(counter);
                } else {
                    // flip yellow animation
                    getCertainAttempt(currentAttempt).rotateYellow(counter);
                }
            } else {
                // flip gray animation
                getCertainAttempt(currentAttempt).rotateGray(counter);
            }
        }
    }
    public void allGreen() {
        for (int i = 0; i < 5; i++) {
            getCertainAttempt(currentAttempt).rotateGreen(i);
        }
    }
    public WinnerPopUp getWin() { return win; }
    public ErrorMessages getError() { return error; }
    public void reset() {
        currentAttempt = 1;
        current = 0;
        wordbank.reset();
        one.reset();
        two.reset();
        three.reset();
        four.reset();
        five.reset();
        six.reset();
    }
    public void setCurrentAttempt(int a) {
        currentAttempt = a;
    }
}
