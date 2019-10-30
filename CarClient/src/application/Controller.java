package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class Controller implements Initializable {
	@FXML
	private Button minimizeButton, maxSizeButton, minSizeButton;

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {

	}

	//exit button
	@FXML
	private void exitButton() {
		System.exit(0);

	}

	//maximal size
	@FXML
	private void maxSizeButton() {
		Stage stage = (Stage) maxSizeButton.getScene().getWindow();
		stage.setMaximized(true);
	}

	//normal size
	@FXML
	private void minSizeButton() {
		Stage stage = (Stage) maxSizeButton.getScene().getWindow();
		stage.sizeToScene();
		stage.setMaximized(false);
	}

	//minimal size
	@FXML
	private void minimizeButton() {
		Stage stage = (Stage) minimizeButton.getScene().getWindow();
		stage.setIconified(true);
	}
}
