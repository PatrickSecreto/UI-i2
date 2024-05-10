/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */
package numeth_ui;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author eurek
 */
public class Numeth_UI extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        try{
            Parent root = FXMLLoader.load(getClass().getResource("Bracketing.fxml"));
            
            Stage stage = new Stage();
            Scene scene = new Scene(root);
            
            stage.setScene(scene);
            stage.show();
        } catch (Exception e){
            e.printStackTrace();
        }

    }

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        launch(args);
    }
}
