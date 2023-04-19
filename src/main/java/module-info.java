module com.example.wordlegame {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.wordlegame to javafx.fxml;
    exports com.example.wordlegame;
}