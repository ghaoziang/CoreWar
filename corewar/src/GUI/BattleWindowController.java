package GUI;

import java.io.IOException;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
public class BattleWindowController{
	public void pressAddWarriorsButton(ActionEvent event) {
		
	}
	
	public void pressEditorButton(ActionEvent event) throws IOException {
		//EditorWindow.initWindow();
		Parent editorwindow = FXMLLoader.load(getClass().getResource("EditorWindow.fxml"));
		Scene editorscene = new Scene(editorwindow);
		Stage mainwindow = (Stage)  ((Node)event.getSource()).getScene().getWindow();
		mainwindow.setScene(editorscene);
	}
	
	public void pressRematchButton(ActionEvent event) {
		
	}
	
	public void pressRequestWarriorButton(ActionEvent event) {
		
	}
	
	public void pressQuitToMainMenueButton(ActionEvent event) throws IOException {
		Parent mainmenu = FXMLLoader.load(getClass().getResource("MainWindow.fxml"));
		Scene mainscene = new Scene(mainmenu);
		Stage mainwindow = (Stage)  ((Node)event.getSource()).getScene().getWindow();
		mainwindow.setScene(mainscene);
	}
	
	public void pressConnectPlayersButton(ActionEvent event) {
		
	}
}
