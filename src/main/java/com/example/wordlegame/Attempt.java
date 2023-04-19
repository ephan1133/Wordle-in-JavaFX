package com.example.wordlegame;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;

import java.util.LinkedList;
import java.util.Stack;

public class Attempt {
    private Label one;
    private Label two;
    private Label three;
    private Label four;
    private Label five;
    private Rectangle first;
    private Rectangle second;
    private Rectangle third;
    private Rectangle fourth;
    private Rectangle fifth;
    private Rectangle bigFirst;
    private Rectangle bigSecond;
    private Rectangle bigThird;
    private Rectangle bigFourth;
    private Rectangle bigFifth;

    private StackPane firstBox;
    private StackPane secondBox;
    private StackPane thirdBox;
    private StackPane fourthBox;
    private StackPane fifthBox;
    private LinkedList<Label> list;
    private HBox gamePlace;
    private final Font font = Font.font("Times New Roman", 14);

    public Attempt() {
        one = new Label("");
        two = new Label("");
        three = new Label("");
        four = new Label("");
        five = new Label("");

        one.setTextFill(Color.WHITE);
        two.setTextFill(Color.WHITE);
        three.setTextFill(Color.WHITE);
        four.setTextFill(Color.WHITE);
        five.setTextFill(Color.WHITE);

        one.setFont(font);
        two.setFont(font);
        three.setFont(font);
        four.setFont(font);
        five.setFont(font);

        list = new LinkedList<>();
        list.add(one);
        list.add(two);
        list.add(three);
        list.add(four);
        list.add(five);
        initializeRectangles();

        gamePlace = new HBox(30, firstBox, secondBox, thirdBox, fourthBox, fifthBox);
        gamePlace.setAlignment(Pos.CENTER);
    }

    /**
     * Make a pane or something to house all five of the word boxes next to each other
     * and find a way to focus on the panels
     *
     * maybe use a linked list to set focus on the text boxes
     */

    public void initializeRectangles() {
        bigFirst = new Rectangle(35, 35);
        bigSecond = new Rectangle(35, 35);
        bigThird = new Rectangle(35, 35);
        bigFourth = new Rectangle(35, 35);
        bigFifth = new Rectangle(35, 35);

        bigFirst.setFill(Color.GRAY);
        bigSecond.setFill(Color.GRAY);
        bigThird.setFill(Color.GRAY);
        bigFourth.setFill(Color.GRAY);
        bigFifth.setFill(Color.GRAY);

        first = new Rectangle(30, 30);
        first.setFill(Color.rgb(54, 69, 79));
        second = new Rectangle(30, 30);
        second.setFill(Color.rgb(54, 69, 79));
        third = new Rectangle(30, 30);
        third.setFill(Color.rgb(54, 69, 79));
        fourth = new Rectangle(30 ,30);
        fourth.setFill(Color.rgb(54, 69, 79));
        fifth = new Rectangle(30, 30);
        fifth.setFill(Color.rgb(54, 69, 79));

        firstBox = new StackPane(bigFirst, first, list.get(0));
        secondBox = new StackPane(bigSecond, second, list.get(1));
        thirdBox = new StackPane(bigThird, third, list.get(2));
        fourthBox = new StackPane(bigFourth, fourth, list.get(3));
        fifthBox = new StackPane(bigFifth, fifth, list.get(4));
    }

    public String getString(int i) {
       return list.get(i).getText();
    }
    public void update() {

    }
    public HBox getGamePlace() {
        return gamePlace;
    }
    public LinkedList<Label> getList() {
        return list;
    }
    public void rotateGray(int i) {
        if (i == 0) {
            bigFirst.setFill(Color.GRAY);
            first.setFill(Color.GRAY);
        } else if (i == 1) {
            bigSecond.setFill(Color.GRAY);
            second.setFill(Color.GRAY);
        } else if (i == 2) {
            bigThird.setFill(Color.GRAY);
            third.setFill(Color.GRAY);
        } else if (i == 3) {
            bigFourth.setFill(Color.GRAY);
            fourth.setFill(Color.GRAY);
        } else if (i == 4) {
            bigFifth.setFill(Color.GRAY);
            fifth.setFill(Color.GRAY);
        } else {
            System.out.println("I am doing something wrong");
        }
    }
    public void rotateGreen(int i) {
        if (i == 0) {
            bigFirst.setFill(Color.GREEN);
            first.setFill(Color.GREEN);
        } else if (i == 1) {
            bigSecond.setFill(Color.GREEN);
            second.setFill(Color.GREEN);
        } else if (i == 2) {
            bigThird.setFill(Color.GREEN);
            third.setFill(Color.GREEN);
        } else if (i == 3) {
            bigFourth.setFill(Color.GREEN);
            fourth.setFill(Color.GREEN);
        } else if (i == 4) {
            bigFifth.setFill(Color.GREEN);
            fifth.setFill(Color.GREEN);
        } else {
            System.out.println("I am doing something wrong");
        }
    }
    public void rotateYellow(int i) {
        if (i == 0) {
            bigFirst.setFill(Color.rgb(255, 191, 0));
            first.setFill(Color.rgb(255, 191, 0));
        } else if (i == 1) {
            bigSecond.setFill(Color.rgb(255, 191, 0));
            second.setFill(Color.rgb(255, 191, 0));
        } else if (i == 2) {
            bigThird.setFill(Color.rgb(255, 191, 0));
            third.setFill(Color.rgb(255, 191, 0));
        } else if (i == 3) {
            bigFourth.setFill(Color.rgb(255, 191, 0));
            fourth.setFill(Color.rgb(255, 191, 0));
        } else if (i == 4) {
            bigFifth.setFill(Color.rgb(255, 191, 0));
            fifth.setFill(Color.rgb(255, 191, 0));
        } else {
            System.out.println("I am doing something wrong");
        }
    }
    public void reset() {
        bigFirst.setFill(Color.GRAY);
        first.setFill(Color.rgb(54, 69, 79));
        bigSecond.setFill(Color.GRAY);
        second.setFill(Color.rgb(54, 69, 79));
        bigThird.setFill(Color.GRAY);
        third.setFill(Color.rgb(54, 69, 79));
        bigFourth.setFill(Color.GRAY);
        fourth.setFill(Color.rgb(54, 69, 79));
        bigFifth.setFill(Color.GRAY);
        fifth.setFill(Color.rgb(54, 69, 79));
        list.get(0).setText("");
        list.get(1).setText("");
        list.get(2).setText("");
        list.get(3).setText("");
        list.get(4).setText("");
    }

}
