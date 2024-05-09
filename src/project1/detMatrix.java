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

import finaloop.DeterminantMatrices;

/**
 *
 * @author ACER-NITRO
 */
public class detMatrix {
    private Stage stage;
    private Scene scene;
    private Parent root;
    private TextField[][] matrix;

    @FXML
    private TextField matrixSize;

    @FXML
    private GridPane matrixGridPane;
    
    @FXML
    private Label resultLabel;
    
    @FXML
    private void getMatrix() {
        while (true){
            try {
                int size = Integer.parseInt(matrixSize.getText());

                if (size >=4){
                    resultLabel.setText("Error: The calculator can only handle 1x1, 2x2, and 3x3.");
                    break;
                }

                // Clear previous matrix input
                matrixGridPane.getChildren().clear();

                // Create TextFields for matrix A
                matrix = new TextField[size][size];
                for (int row = 0; row < size; row++) {
                    for (int col = 0; col < size; col++) {
                        TextField textField = new TextField();
                        textField.setPromptText("Matrix A[" + row + "][" + col + "]");
                        matrixGridPane.add(textField, col, row);
                        matrix[row][col] = textField;
                    }
                }
                break;
            } 
            catch (NumberFormatException e) {
                resultLabel.setText("Error: Invalid input");
            }
        }
    }
    
    @FXML
    private void detMatrices(){
        try{
            int size = Integer.parseInt(matrixSize.getText());
            
            int[][] mat = new int[size][size];
            for (int row = 0; row < size; row++) {
                for (int col = 0; col < size; col++) {
                    int value = Integer.parseInt(matrix[row][col].getText());

                    mat[row][col] = value;
                }
            }
            DeterminantMatrices MatrixDet = new DeterminantMatrices();
            int result = MatrixDet.determinantMatrices(mat);
            // Display the result
            resultLabel.setText("Determinant: " + result);
        }catch(Exception e){
            resultLabel.setText("Error: Lack of inputs.");
        }
    }
    
    public void switchToScene2(ActionEvent event) throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("scene2.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}