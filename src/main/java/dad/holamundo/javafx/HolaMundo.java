package dad.holamundo.javafx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Tooltip;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class HolaMundo extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		
		// creamos la etiqueta para mostrar el saludo
		Label saludoLabel = new Label();
		saludoLabel.setText("Aquí saldrá el saludo");
		saludoLabel.setLayoutX(20);
		saludoLabel.setLayoutY(20);
		
		// creamos el boton para saludar
		Button saludarButton = new Button();
		saludarButton.setText("Saludar");
		saludarButton.setLayoutX(20);
		saludarButton.setLayoutY(80);
		saludarButton.setTooltip(new Tooltip("Cuando me pulses te saludo"));
		saludarButton.setOnAction(e -> saludoLabel.setText("Hola mundo"));
		
		// creamos el panel
		
		Pane rootPanel = new Pane();
		rootPanel.getChildren().addAll(saludoLabel,saludarButton);
		
		// creamos la escena
		
		Scene scene = new Scene(rootPanel, 320, 200);
		
		primaryStage.setTitle("Hola mundo con JavaFx");
		primaryStage.setScene(scene);
		primaryStage.setResizable(false);
		primaryStage.show();
		
		
		

	}
public static void main(String[] args) {
		
		launch(args);
	}
	

}
