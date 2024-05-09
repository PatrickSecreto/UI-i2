/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project1;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import finaloop.AddSubtractMultiplyMatrices;

/**
 *
 * @author ACER-NITRO
 */
public class subtractMatrix {
    private Stage stage;
    private Scene scene;
    private Parent root;
    private TextField[][] matrixA;
    private TextField[][] matrixB;

    @FXML
    private TextField matrixRow;
    
    @FXML
    private TextField matrixColumn;

    @FXML
    private GridPane matrixAGridPane;

    @FXML
    private GridPane matrixBGridPane;
    
    @FXML
    private Label resultLabel;
    
    @FXML
    private void getMatrices() {
        try {
            int rows = Integer.parseInt(matrixRow.getText());
            int columns = Integer.parseInt(matrixColumn.getText());
            
            // Clear previous matrix input
            matrixAGridPane.getChildren().clear();
            matrixBGridPane.getChildren().clear();

            // Create TextFields for matrix A
            matrixA = new TextField[rows][columns];
            for (int row = 0; row < rows; row++) {
                for (int col = 0; col < columns; col++) {
                    TextField textField = new TextField();
                    textField.setPromptText("Matrix A[" + row + "][" + col + "]");
                    matrixAGridPane.add(textField, col, row);
                    matrixA[row][col] = textField;
                }
            }

            // Create TextFields for matrix B
            matrixB = new TextField[rows][columns];
            for (int row = 0; row < rows; row++) {
                for (int col = 0; col < columns; col++) {
                    TextField textField = new TextField();
                    textField.setPromptText("Matrix B[" + row + "][" + col + "]");
                    matrixBGridPane.add(textField, col, row);
                    matrixB[row][col] = textField;
                }
            }

        } 
        catch (NumberFormatException e) {
            resultLabel.setText("Error: Invalid input");
        }
    }

    private void displayResult(int[][] result) {
        StringBuilder resultText = new StringBuilder("Result:\n");
        for (int[] row : result) {
            for (int value : row) {
                resultText.append(value).append("\t");
            }
            resultText.append("\n");
        }
        resultLabel.setText(resultText.toString());
    }
    
    @FXML
    private void subtractMatrices(){
        try{
            int rows = Integer.parseInt(matrixRow.getText());
            int columns = Integer.parseInt(matrixColumn.getText());
            
            int[][] matA = new int[rows][columns];
            int[][] matB = new int[rows][columns];
            for (int row = 0; row < rows; row++) {
                for (int col = 0; col < columns; col++) {
                    int valueA = Integer.parseInt(matrixA[row][col].getText());
                    int valueB = Integer.parseInt(matrixB[row][col].getText());

                    matA[row][col] = valueA;
                    matB[row][col] = valueB;
                }
            }
            AddSubtractMultiplyMatrices MatrixSubtract = new AddSubtractMultiplyMatrices();
            int[][] result = MatrixSubtract.subtractMatrices(matA, matB);
            // Display the result
            displayResult(result);
        }catch(Exception e){
            resultLabel.setText("Error: Lack of inputs.");
        }
    }
    
    
    public void switchToAddSubtractMultiply(ActionEvent event) throws IOException{
        root = FXMLLoader.load(getClass().getResource("AddSubtractMatrices.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}
