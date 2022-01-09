package gui;

import java.net.URL;
import java.util.Locale;
import java.util.ResourceBundle;

import gui.util.Alerts;
import gui.util.Constraints;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;


public class ViewControler implements Initializable{
	@FXML
	private TextField txtNuber1;
	@FXML
	private TextField txtNuber2;
	@FXML
	private Label laberResult;
	@FXML
	private Button btSum;
	@FXML
	public void onBtSumAction() {
		try {
		Locale.setDefault(Locale.US);
		double number1 = Double.parseDouble(txtNuber1.getText());
		double number2 = Double.parseDouble(txtNuber2.getText());
		double sum = number1 + number2;
		laberResult.setText(String.format("%.2f", sum));
		}
		catch (NumberFormatException e) {
			Alerts.showAlert("Error", null, e.getMessage(), AlertType.ERROR);
		}
	}
	@Override
	public void initialize(URL url, ResourceBundle rb) {
		Constraints.setTextFieldDouble(txtNuber1);
		Constraints.setTextFieldDouble(txtNuber2);
		
	}
	
}