package eceui;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import eceui.controllers.ReusableLearningContentController;
import finaloop.ECE;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;

public class SceneController implements Initializable {
    private Stage stage;
    private Scene scene;
    
    private String localTitle;
    private String localContent;
    
    public void switchToHome(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/project1/home.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    
    public void switchToBasicCircuitries(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/eceui/basicCircuitries.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    
    public void switchToCircuitryParts(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/eceui/circuitPartsChoice.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    
    public void switchToParallelCircuits(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/eceui/parallelCircuits.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    
    public void switchToECEMainUI(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/eceui/ecemain.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
        
    public void openBreadBoardInstruction(ActionEvent event) throws IOException {
        localTitle = "Bread Board";
        localContent = ECE.getBreadboardLearnings();
        this.openReusableLearningContent(event);
    }
    
    public void openResistorsInstruction(ActionEvent event) throws IOException {
        localTitle = "Resistors";
        localContent = ECE.getResistorLearnings();
        this.openReusableLearningContent(event);
    }
    
    public void openCapacitorInstruction(ActionEvent event) throws IOException {
        localTitle = "Capacitors";
        localContent = ECE.getCapacitorLearnings();
        this.openReusableLearningContent(event);
    }
    
    public void openTransistorInstruction(ActionEvent event) throws IOException {
        localTitle = "Transistors";
        localContent = ECE.getTransistorLearnings();
        this.openReusableLearningContent(event);
    }

    public void openDiodeInstruction(ActionEvent event) throws IOException {
        localTitle = "Diodes";
        localContent = ECE.getDiodesLearnings();
        this.openReusableLearningContent(event);
    }
    
    public void openJumperWireInstruction(ActionEvent event) throws IOException {
        localTitle = "Jumper Wires";
        localContent = ECE.getjumperWiresLearning();
        this.openReusableLearningContent(event);
    }
    
    public void openInductorInstructions(ActionEvent event) throws IOException {
        localTitle = "Inductors";
        localContent = ECE.getInductorLearnings();
        this.openReusableLearningContent(event);
    }
    
    public void openCalculateVoltageInstructions(ActionEvent event) throws IOException {
        localTitle = "How to Calculate Voltage?";
        localContent = ECE.getCalculateVoltage();
        this.openReusableLearningContent(event);
    }

    @FXML
    public void openReusableLearningContent(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/eceui/reusableLearningContent.fxml"));
        Parent root = loader.load();
        
        ReusableLearningContentController scene2 = loader.getController();
        scene2.setTitleLabel(localTitle);
        scene2.setInstructionLabel(localContent);
        
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
    }
}
