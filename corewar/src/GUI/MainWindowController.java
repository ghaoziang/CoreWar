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
public class MainWindowController {
	@FXML
	private AnchorPane content;
	
	@FXML
	public void pressBattleWithPlayerButton(ActionEvent event) throws IOException {
		Parent battlewindow = FXMLLoader.load(getClass().getResource("BattleRoomWindow.fxml"));
		Scene battlescene = new Scene(battlewindow);
		Stage mainwindow = (Stage)  ((Node)event.getSource()).getScene().getWindow();
		mainwindow.setScene(battlescene);
	}
	
	public void pressTutorialButton(ActionEvent event) {
		
	}
	
	public void pressStatisticsButton(ActionEvent event) throws IOException {
		Parent statisticsWindow = FXMLLoader.load(getClass().getResource("StatisticsWindow.fxml"));
		Scene statisticsScene = new Scene(statisticsWindow);
		Stage mainwindow = (Stage)  ((Node)event.getSource()).getScene().getWindow();
		mainwindow.setScene(statisticsScene);
	}
	
	public void pressSimulationButton(ActionEvent event) {
		
	}
}
