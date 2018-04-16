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
import javafx.scene.*;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.scene.layout.VBox;


public class HelloWorld {
       private final int SCENE_WIDTH = 500;
	   private final int SCENE_HEIGHT = 500;
	   private final Scene scene;
//	   private final StackPane rootNode = new StackPane();
	   private final VBox rootNode = new VBox();
	   private final Button btn= new Button();
	 
	   private final Button button = new Button("Hello World");

	   public HelloWorld() {
		   btn.setText("Close");
		   btn.setOnAction(e ->{
			   System.out.println("exit");
			   System.exit(0);
		   });
		   
		   button.setOnAction(e ->{
			   System.out.println("Clicked Hello");
		   });
		   
	     rootNode.getChildren().add(button);
	     rootNode.getChildren().add(btn);
	     scene = new Scene(rootNode, SCENE_WIDTH, SCENE_HEIGHT);
	   }

	   public Scene getScene() {
	     return scene;
	   }
}
