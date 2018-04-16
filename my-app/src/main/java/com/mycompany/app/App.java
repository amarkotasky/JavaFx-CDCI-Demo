package com.mycompany.app;

import java.sql.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.scene.layout.VBox;

/**
 *
 * @author amar.khan
 */
public class App extends Application {
	private final HelloWorld helloWorld = new HelloWorld();

    /**
     * @param args the command line arguments
     */
	@Override
	  public void start(Stage primaryStage) throws Exception {
	    primaryStage.setTitle("Hello World");
	    primaryStage.setScene(helloWorld.getScene());
	    primaryStage.show();
	  }
	
    public static void main(String[] args) {
        launch(args);
    }
    
}
