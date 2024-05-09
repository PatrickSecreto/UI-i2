/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project1;

import java.io.IOException;
import java.util.Random;
import java.util.Scanner;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

/**
 *
 * @author ACER-NITRO
 */
public class addMatrix {
    private Stage stage;
    private Scene scene;
    private Parent root;
    
    @FXML
    private TextField myRow;
    @FXML
    private TextField myColumn;
    @FXML
    private GridPane gridPane;
    @FXML
    private Button myButton;
    @FXML
    private Label myResult; 
    
    
    private int [][] matrix;
    private TextField[][] textFieldMatrix;
    
    int rows, columns;
    Scanner scanner = new Scanner(System.in);
    
    public void switchToAddSubtractMultiply(ActionEvent event) throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("AddSubtractMatrices.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    
    public void submitRowsAndColumns(ActionEvent event){
        try{
            rows = Integer.parseInt(myRow.getText());
            columns = Integer.parseInt(myColumn.getText());
            
            matrix = new int[rows][columns];
            textFieldMatrix = new TextField[rows][columns];
            
            gridPane.getChildren().removeAll(textFieldMatrix);
            
            for (int row = 0; row < rows; row++){
                for (int col = 0; col < columns; col++){
                    TextField textField = new TextField();
                    textField.setPromptText("Enter value at position [" + (row + 1) + "][" + (col + 1) + "]: ");
                    textFieldMatrix[row][col] = textField;
                    gridPane.add(textField, col, row + 2);
                }
            }
            
        }catch(NumberFormatException e){
            myResult.setText("ERROR: Please enter a valid integer.");
        }
        catch(Exception e){
            myResult.setText("ERROR: Please enter a valid integer.");
        } 
    }
    
}
