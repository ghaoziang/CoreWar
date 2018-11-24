package GUI;

import java.io.IOException;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class MainWindow {
	private static MainWindow mw;
	private Parent root;
	
	private MainWindow(Stage primaryStage) throws IOException {
		root = FXMLLoader.load(getClass().getResource("MainWindow.fxml"));
		primaryStage.setTitle("MainWindow");
		primaryStage.setScene(new Scene(root, 600, 800));
		primaryStage.show();
	}
	
	public static void initMainWindow(Stage primaryStage) throws IOException {
		if(mw == null) {
			mw = new MainWindow(primaryStage);
		}
	}
	
	public static MainWindow getInstance() {
		return mw;
	}
}
