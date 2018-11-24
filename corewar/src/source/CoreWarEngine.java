package source;

import java.io.IOException;
import GUI.MainWindow;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import GUI.MainWindow;


public class CoreWarEngine extends Application{
	
	public static void main (String args[]) {
		Application.launch();
    }
	
	public void start(Stage primaryStage) throws Exception {
		MainWindow.initMainWindow(primaryStage);
	}
}
