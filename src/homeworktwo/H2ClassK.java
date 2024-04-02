package com.example;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class H2ClassK extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        Button submit = new Button();
        submit.setText("Submit");
        Label label = new Label();

        submit.setOnAction((ActionEvent e) -> {
            label.setText("A comment");
        });

        VBox root = new VBox();
        root.getChildren().add(submit);
        root.getChildren().add(label);
        primaryStage.setScene(new Scene(root, 300, 250));
        primaryStage.show();
    }

} // end class H2ClassK
