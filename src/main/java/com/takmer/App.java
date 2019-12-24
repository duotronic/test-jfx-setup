package com.takmer;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * JavaFX App
 */
public class App extends Application {

  private static Scene scene;

  private static Parent loadFXML(String fxml) throws IOException {
    FXMLLoader fxmlLoader
        = new FXMLLoader(
        App.class.getResource(fxml + ".fxml"));
    return fxmlLoader.load();
  }

  // change scene
  static void setRoot(String fxml) throws IOException {
    scene.setRoot(loadFXML(fxml));
  }

  @Override
  public void start(Stage stage) throws IOException {
    scene = new Scene(loadFXML("primary"));
    stage.setScene(scene);
    stage.setTitle("Future Value");
    stage.show();
  }

  public static void main(String[] args) {
    launch();
  }

}