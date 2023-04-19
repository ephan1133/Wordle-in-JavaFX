package com.example.wordlegame;

import javafx.animation.PauseTransition;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.stage.Stage;
import javafx.util.Duration;

public class GameLoop extends Application {
    private WordleGame game = new WordleGame();
    private GameOverWin winScreen = new GameOverWin();
    private Scene gameScene = new Scene(game.getScreen(), 850, 850);
    private Scene winscreen = new Scene(winScreen.getScreen(), 850, 850);
    private boolean win = false;

    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("Wordle");
        stage.setScene(gameScene);
        stage.show();
        handleOnScreenGameButtonEvents(stage);
        handleKeyboardGameEvents(stage);
        handleWinScreenButtonEvents(stage);
    }

    public void handleOnScreenGameButtonEvents(Stage stage) {
        if (game.getCurrentAttempt() == 7) {
            return;
        }
        game.getKeyboard().getA().setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if (game.getCurrent() > 4 || game.getCurrentAttempt() == 7) {
                    return;
                }
                game.getCertainAttempt(game.getCurrentAttempt()).getList().get(game.getCurrent()).setText("A");
                game.updateAttemptCounter();
            }
        });
        game.getKeyboard().getB().setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if (game.getCurrent() > 4 || game.getCurrentAttempt() == 7) {
                    return;
                }
                game.getCertainAttempt(game.getCurrentAttempt()).getList().get(game.getCurrent()).setText("B");
                game.updateAttemptCounter();
            }
        });
        game.getKeyboard().getC().setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if (game.getCurrent() > 4 || game.getCurrentAttempt() == 7) {
                    return;
                }
                game.getCertainAttempt(game.getCurrentAttempt()).getList().get(game.getCurrent()).setText("C");
                game.updateAttemptCounter();
            }
        });
        game.getKeyboard().getD().setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if (game.getCurrent() > 4 || game.getCurrentAttempt() == 7) {
                    return;
                }
                game.getCertainAttempt(game.getCurrentAttempt()).getList().get(game.getCurrent()).setText("D");
                game.updateAttemptCounter();
            }
        });
        game.getKeyboard().getE().setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if (game.getCurrent() > 4 || game.getCurrentAttempt() == 7) {
                    return;
                }
                game.getCertainAttempt(game.getCurrentAttempt()).getList().get(game.getCurrent()).setText("E");
                game.updateAttemptCounter();
            }
        });
        game.getKeyboard().getF().setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if (game.getCurrent() > 4 || game.getCurrentAttempt() == 7) {
                    return;
                }
                game.getCertainAttempt(game.getCurrentAttempt()).getList().get(game.getCurrent()).setText("F");
                game.updateAttemptCounter();
            }
        });
        game.getKeyboard().getG().setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if (game.getCurrent() > 4 || game.getCurrentAttempt() == 7) {
                    return;
                }
                game.getCertainAttempt(game.getCurrentAttempt()).getList().get(game.getCurrent()).setText("G");
                game.updateAttemptCounter();
            }
        });
        game.getKeyboard().getH().setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if (game.getCurrent() > 4 || game.getCurrentAttempt() == 7) {
                    return;
                }
                game.getCertainAttempt(game.getCurrentAttempt()).getList().get(game.getCurrent()).setText("H");
                game.updateAttemptCounter();
            }
        });
        game.getKeyboard().getI().setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if (game.getCurrent() > 4 || game.getCurrentAttempt() == 7) {
                    return;
                }
                game.getCertainAttempt(game.getCurrentAttempt()).getList().get(game.getCurrent()).setText("I");
                game.updateAttemptCounter();
            }
        });
        game.getKeyboard().getJ().setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if (game.getCurrent() > 4 || game.getCurrentAttempt() == 7) {
                    return;
                }
                game.getCertainAttempt(game.getCurrentAttempt()).getList().get(game.getCurrent()).setText("J");
                game.updateAttemptCounter();
            }
        });
        game.getKeyboard().getK().setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if (game.getCurrent() > 4 || game.getCurrentAttempt() == 7) {
                    return;
                }
                game.getCertainAttempt(game.getCurrentAttempt()).getList().get(game.getCurrent()).setText("K");
                game.updateAttemptCounter();
            }
        });
        game.getKeyboard().getL().setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if (game.getCurrent() > 4 || game.getCurrentAttempt() == 7) {
                    return;
                }
                game.getCertainAttempt(game.getCurrentAttempt()).getList().get(game.getCurrent()).setText("L");
                game.updateAttemptCounter();
            }
        });
        game.getKeyboard().getM().setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if (game.getCurrent() > 4 || game.getCurrentAttempt() == 7) {
                    return;
                }
                game.getCertainAttempt(game.getCurrentAttempt()).getList().get(game.getCurrent()).setText("M");
                game.updateAttemptCounter();
            }
        });
        game.getKeyboard().getN().setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if (game.getCurrent() > 4 || game.getCurrentAttempt() == 7) {
                    return;
                }
                game.getCertainAttempt(game.getCurrentAttempt()).getList().get(game.getCurrent()).setText("N");
                game.updateAttemptCounter();
            }
        });
        game.getKeyboard().getO().setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if (game.getCurrent() > 4 || game.getCurrentAttempt() == 7) {
                    return;
                }
                game.getCertainAttempt(game.getCurrentAttempt()).getList().get(game.getCurrent()).setText("O");
                game.updateAttemptCounter();
            }
        });
        game.getKeyboard().getP().setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if (game.getCurrent() > 4 || game.getCurrentAttempt() == 7) {
                    return;
                }
                game.getCertainAttempt(game.getCurrentAttempt()).getList().get(game.getCurrent()).setText("P");
                game.updateAttemptCounter();
            }
        });
        game.getKeyboard().getQ().setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if (game.getCurrent() > 4 || game.getCurrentAttempt() == 7) {
                    return;
                }
                game.getCertainAttempt(game.getCurrentAttempt()).getList().get(game.getCurrent()).setText("Q");
                game.updateAttemptCounter();
            }
        });
        game.getKeyboard().getR().setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if (game.getCurrent() > 4 || game.getCurrentAttempt() == 7) {
                    return;
                }
                game.getCertainAttempt(game.getCurrentAttempt()).getList().get(game.getCurrent()).setText("R");
                game.updateAttemptCounter();
            }
        });
        game.getKeyboard().getS().setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if (game.getCurrent() > 4 || game.getCurrentAttempt() == 7) {
                    return;
                }
                game.getCertainAttempt(game.getCurrentAttempt()).getList().get(game.getCurrent()).setText("S");
                game.updateAttemptCounter();
            }
        });
        game.getKeyboard().getT().setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if (game.getCurrent() > 4 || game.getCurrentAttempt() == 7) {
                    return;
                }
                game.getCertainAttempt(game.getCurrentAttempt()).getList().get(game.getCurrent()).setText("T");
                game.updateAttemptCounter();
            }
        });
        game.getKeyboard().getU().setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if (game.getCurrent() > 4 || game.getCurrentAttempt() == 7) {
                    return;
                }
                game.getCertainAttempt(game.getCurrentAttempt()).getList().get(game.getCurrent()).setText("U");
                game.updateAttemptCounter();
            }
        });
        game.getKeyboard().getV().setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if (game.getCurrent() > 4 || game.getCurrentAttempt() == 7) {
                    return;
                }
                game.getCertainAttempt(game.getCurrentAttempt()).getList().get(game.getCurrent()).setText("V");
                game.updateAttemptCounter();
            }
        });
        game.getKeyboard().getW().setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if (game.getCurrent() > 4 || game.getCurrentAttempt() == 7) {
                    return;
                }
                game.getCertainAttempt(game.getCurrentAttempt()).getList().get(game.getCurrent()).setText("W");
                game.updateAttemptCounter();
            }
        });
        game.getKeyboard().getX().setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if (game.getCurrent() > 4 || game.getCurrentAttempt() == 7) {
                    return;
                }
                game.getCertainAttempt(game.getCurrentAttempt()).getList().get(game.getCurrent()).setText("X");
                game.updateAttemptCounter();
            }
        });
        game.getKeyboard().getY().setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if (game.getCurrent() > 4 || game.getCurrentAttempt() == 7) {
                    return;
                }
                game.getCertainAttempt(game.getCurrentAttempt()).getList().get(game.getCurrent()).setText("Y");
                game.updateAttemptCounter();
            }
        });
        game.getKeyboard().getZ().setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if (game.getCurrent() > 4 || game.getCurrentAttempt() == 7) {
                    return;
                }
                game.getCertainAttempt(game.getCurrentAttempt()).getList().get(game.getCurrent()).setText("Z");
                game.updateAttemptCounter();
            }
        });
        game.getKeyboard().getBackSpace().setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if (game.getCurrentAttempt() == 7) {
                    return;
                }
                game.decrementGameCounter();
                game.getCertainAttempt(game.getCurrentAttempt()).getList().get(game.getCurrent()).setText("");
            }
        });
        game.getKeyboard().getEnter().setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                if (game.getCurrentAttempt() == 7) {
                    return;
                }
                win = game.enterCheck();
                if (win == true) {
                    if (!game.getWin().getPopup().isShowing()) {
                        game.getWin().getPopup().show(stage);
                    } else {
                        game.getWin().getPopup().hide();
                    }
                } else {
                    if (game.getError().getErrorMessage().getText().equals("")) {
                        return;
                    } else {
                        PauseTransition delay = new PauseTransition(Duration.seconds(2));
                        delay.setOnFinished(e -> game.getError().getError().hide());
                        game.getError().getError().show(stage);
                        delay.play();
                    }
                }
            }
        });
        game.getWin().getNext().setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                if (game.getWin().getPopup().isShowing()) {
                    game.getWin().getPopup().hide();
                }
                stage.setScene(winscreen);
            }
        });
    }
    public void handleKeyboardGameEvents(Stage stage) {

        gameScene.setOnKeyPressed(e -> {
            if (game.getCurrentAttempt() == 7) {
                return;
            }
            if (game.getCurrent() > 4) {
                if (e.getCode() == KeyCode.BACK_SPACE) {
                    game.decrementGameCounter();
                    game.getCertainAttempt(game.getCurrentAttempt()).getList().get(game.getCurrent()).setText("");
                    return;
                }
                else if (e.getCode() == KeyCode.ENTER) {
                    win = game.enterCheck();
                    if (win == true) {
                        if (!game.getWin().getPopup().isShowing()) {
                            game.getWin().getPopup().show(stage);
                        } else {
                            game.getWin().getPopup().hide();
                        }
                        game.setCurrentAttempt(7);
                    } else {
                        if (game.getCurrentAttempt() == 7) {
                            game.getWin().getPopup().show(stage);
                            game.getWin().getNext().setVisible(true);
                        }
                        if (!game.getError().getErrorMessage().getText().equals("")) {
                            PauseTransition delay = new PauseTransition(Duration.seconds(2));
                            delay.setOnFinished(event -> game.getError().getError().hide());
                            game.getError().getError().show(stage);
                            delay.play();
                        }
                    }
                }
                return;
            }
            switch (e.getCode()) {
                case A:
                    game.getCertainAttempt(game.getCurrentAttempt()).getList().get(game.getCurrent()).setText("A");
                    game.updateAttemptCounter();
                    break;
                case B:
                    game.getCertainAttempt(game.getCurrentAttempt()).getList().get(game.getCurrent()).setText("B");
                    game.updateAttemptCounter();
                    break;
                case C:
                    game.getCertainAttempt(game.getCurrentAttempt()).getList().get(game.getCurrent()).setText("C");
                    game.updateAttemptCounter();
                    break;
                case D:
                    game.getCertainAttempt(game.getCurrentAttempt()).getList().get(game.getCurrent()).setText("D");
                    game.updateAttemptCounter();
                    break;
                case E:
                    game.getCertainAttempt(game.getCurrentAttempt()).getList().get(game.getCurrent()).setText("E");
                    game.updateAttemptCounter();
                    break;
                case F:
                    game.getCertainAttempt(game.getCurrentAttempt()).getList().get(game.getCurrent()).setText("F");
                    game.updateAttemptCounter();
                    break;
                case G:
                    game.getCertainAttempt(game.getCurrentAttempt()).getList().get(game.getCurrent()).setText("G");
                    game.updateAttemptCounter();
                    break;
                case H:
                    game.getCertainAttempt(game.getCurrentAttempt()).getList().get(game.getCurrent()).setText("H");
                    game.updateAttemptCounter();
                    break;
                case I:
                    game.getCertainAttempt(game.getCurrentAttempt()).getList().get(game.getCurrent()).setText("I");
                    game.updateAttemptCounter();
                    break;
                case J:
                    game.getCertainAttempt(game.getCurrentAttempt()).getList().get(game.getCurrent()).setText("J");
                    game.updateAttemptCounter();
                    break;
                case K:
                    game.getCertainAttempt(game.getCurrentAttempt()).getList().get(game.getCurrent()).setText("K");
                    game.updateAttemptCounter();
                    break;
                case L:
                    game.getCertainAttempt(game.getCurrentAttempt()).getList().get(game.getCurrent()).setText("L");
                    game.updateAttemptCounter();
                    break;
                case M:
                    game.getCertainAttempt(game.getCurrentAttempt()).getList().get(game.getCurrent()).setText("M");
                    game.updateAttemptCounter();
                    break;
                case N:
                    game.getCertainAttempt(game.getCurrentAttempt()).getList().get(game.getCurrent()).setText("N");
                    game.updateAttemptCounter();
                    break;
                case O:
                    game.getCertainAttempt(game.getCurrentAttempt()).getList().get(game.getCurrent()).setText("O");
                    game.updateAttemptCounter();
                    break;
                case P:
                    game.getCertainAttempt(game.getCurrentAttempt()).getList().get(game.getCurrent()).setText("P");
                    game.updateAttemptCounter();
                    break;
                case Q:
                    game.getCertainAttempt(game.getCurrentAttempt()).getList().get(game.getCurrent()).setText("Q");
                    game.updateAttemptCounter();
                    break;
                case R:
                    game.getCertainAttempt(game.getCurrentAttempt()).getList().get(game.getCurrent()).setText("R");
                    game.updateAttemptCounter();
                    break;
                case S:
                    game.getCertainAttempt(game.getCurrentAttempt()).getList().get(game.getCurrent()).setText("S");
                    game.updateAttemptCounter();
                    break;
                case T:
                    game.getCertainAttempt(game.getCurrentAttempt()).getList().get(game.getCurrent()).setText("T");
                    game.updateAttemptCounter();
                    break;
                case U:
                    game.getCertainAttempt(game.getCurrentAttempt()).getList().get(game.getCurrent()).setText("U");
                    game.updateAttemptCounter();
                    break;
                case V:
                    game.getCertainAttempt(game.getCurrentAttempt()).getList().get(game.getCurrent()).setText("V");
                    game.updateAttemptCounter();
                    break;
                case W:
                    game.getCertainAttempt(game.getCurrentAttempt()).getList().get(game.getCurrent()).setText("W");
                    game.updateAttemptCounter();
                    break;
                case X:
                    game.getCertainAttempt(game.getCurrentAttempt()).getList().get(game.getCurrent()).setText("X");
                    game.updateAttemptCounter();
                    break;
                case Y:
                    game.getCertainAttempt(game.getCurrentAttempt()).getList().get(game.getCurrent()).setText("Y");
                    game.updateAttemptCounter();
                    break;
                case Z:
                    game.getCertainAttempt(game.getCurrentAttempt()).getList().get(game.getCurrent()).setText("Z");
                    game.updateAttemptCounter();
                    break;
                case BACK_SPACE:
                    game.decrementGameCounter();
                    game.getCertainAttempt(game.getCurrentAttempt()).getList().get(game.getCurrent()).setText("");
                    break;
                case ENTER:
                    game.enterCheck();
                    PauseTransition delay = new PauseTransition(Duration.seconds(2));
                    delay.setOnFinished(event -> game.getError().getError().hide());
                    game.getError().getError().show(stage);
                    delay.play();
                    break;
                default:
                    break;
            }
        });
    }
    public void handleWinScreenButtonEvents(Stage stage) {
        winScreen.getYes().setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                game.reset();
                win = false;
                stage.setScene(gameScene);
                game.getWin().getNext().setVisible(false);
                stage.show();
            }
        });
        winScreen.getNo().setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                System.exit(0);
            }
        });
    }
}
