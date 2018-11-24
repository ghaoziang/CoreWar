package GUI;
import java.io.IOException;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;
import javafx.stage.DirectoryChooser;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
public class StatisticsWindowController {
	public void pressQuitButton(ActionEvent event) throws IOException {
		Parent mainmenu = FXMLLoader.load(getClass().getResource("MainWindow.fxml"));
		Scene mainscene = new Scene(mainmenu);
		Stage mainwindow = (Stage)  ((Node)event.getSource()).getScene().getWindow();
		mainwindow.setScene(mainscene);
	}
	
}
