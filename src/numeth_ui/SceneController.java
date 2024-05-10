package numeth_ui;

import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.scene.Scene;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.cell.PropertyValueFactory;

import numeth_backend.Bisection;
import numeth_backend.Bracketing;
import numeth_backend.BracketingResult;
import numeth_backend.FalsePosition;

public class SceneController implements Initializable {

    @FXML
    private Button BisectionButton;

    @FXML
    private TableView<BracketingResult> BracketTable;

    @FXML
    private TextField EaInput;

    @FXML
    private TableColumn<BracketingResult, String> approximateError;

    @FXML
    private TextField equationInput;

    @FXML
    private TableColumn<BracketingResult, String> fxl;

    @FXML
    private TableColumn<BracketingResult, String> fxm;

    @FXML
    private TableColumn<BracketingResult, String> fxu;

    @FXML
    private TableColumn<BracketingResult, String> i;

    @FXML
    private Label rootLabel;

    @FXML
    private TableColumn<BracketingResult, String> xl;

    @FXML
    private TextField xlInput;

    @FXML
    private TableColumn<BracketingResult, String> xm;

    @FXML
    private TableColumn<BracketingResult, String> xu;

    @FXML
    private TextField xuInput;

    private Stage stage;

    @FXML
    void Bisection(ActionEvent event) throws IOException {
        // Get input values from UI
        String equation_input = equationInput.getText();
        double xl_input = Double.parseDouble(xlInput.getText());
        double xu_input = Double.parseDouble(xuInput.getText());
        double Ea_percentage_input = Double.parseDouble(EaInput.getText());
        Bracketing.equation = equation_input;

        
        // Pass input values to Bisection method
        ObservableList<BracketingResult> results = Bisection.bisectionMethod(equation_input, xl_input, xu_input, Ea_percentage_input);
        BracketTable.setItems(results);
        
        // Update rootLabel with the estimated root
        rootLabel.setText("Estimated Root: " + Bisection.globalXM);
        
        // Get the current stage
        stage = (Stage) BisectionButton.getScene().getWindow();
        // Show the current scene
        stage.show();
    }

    
        @FXML
    void FalsePositive(ActionEvent event) throws IOException {
        // Get input values from UI
        String equation_input = equationInput.getText();
        double xl_input = Double.parseDouble(xlInput.getText());
        double xu_input = Double.parseDouble(xuInput.getText());
        double Ea_percentage_input = Double.parseDouble(EaInput.getText());
        Bracketing.equation = equation_input;

        
        // Pass input values to Bisection method
        ObservableList<BracketingResult> results = FalsePosition.falseposMethod(equation_input, xl_input, xu_input, Ea_percentage_input);
        BracketTable.setItems(results);
        
        // Update rootLabel with the estimated root
        rootLabel.setText("Estimated Root: " + FalsePosition.globalXM);
        
        // Get the current stage
        stage = (Stage) BisectionButton.getScene().getWindow();
        // Show the current scene
        stage.show();
    }
    
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        approximateError.setCellValueFactory(new PropertyValueFactory<>("approximateError"));
        fxl.setCellValueFactory(new PropertyValueFactory<>("fxl"));
        fxm.setCellValueFactory(new PropertyValueFactory<>("fxm"));
        fxu.setCellValueFactory(new PropertyValueFactory<>("fxu"));
        i.setCellValueFactory(new PropertyValueFactory<>("i"));
        xl.setCellValueFactory(new PropertyValueFactory<>("xl"));
        xm.setCellValueFactory(new PropertyValueFactory<>("xm"));
        xu.setCellValueFactory(new PropertyValueFactory<>("xu"));
    }
}
