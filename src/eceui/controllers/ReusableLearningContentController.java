package eceui.controllers;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class ReusableLearningContentController implements Initializable {
    public Stage stage;
    public Scene scene;
    
    @FXML
    public Label titleLabel;
    
    @FXML
    public Label instructionLabel;
    
    @FXML
    public Button goBack;
    
    public void setTitleLabel(String label) {
        titleLabel.setText(label);
    }
    
    public void setInstructionLabel(String label) {
        instructionLabel.setText(label);
    }
    
    public void switchToCircuitryParts(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/eceui/circuitPartsChoice.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
    }
}
