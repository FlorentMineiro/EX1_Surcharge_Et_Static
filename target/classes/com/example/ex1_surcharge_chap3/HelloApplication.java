package com.example.ex1_surcharge_chap3;

import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class HelloApplication extends Application {
   public void start(Stage stage) throws IOException {
      FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
      Scene scene = new Scene((Parent)fxmlLoader.load());
      stage.setTitle("Hello!");
      stage.setScene(scene);
      stage.show();
   }

   public static void main(String[] args) {
      launch(new String[0]);
   }
}
