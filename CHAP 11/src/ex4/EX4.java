package ex4;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class EX4 extends Application {

	@Override
	public void start(Stage stage) throws Exception {
		TextField propValue = new TextField();

		Label propLbl = new Label("Actual value: ");
		Label asessLbl = new Label("Assessment value: ");
		Label taxLbl = new Label("Property Tax: ");
		
		Button calcBtn = new Button("Calculate");
		calcBtn.setOnAction(event -> {
			double value = Double.parseDouble(propValue.getText());
			double ases = value * 0.6;
			double tax = (ases / 100) * 0.64;

			asessLbl.setText(String.format("Assessment value: $%,.2f", ases));
			taxLbl.setText(String.format("Property Tax: $%,.2f", tax));
		});
		
		HBox hbox = new HBox(8, propLbl, propValue);
		VBox vbox = new VBox(10, hbox, calcBtn, asessLbl, taxLbl);
		
		hbox.setAlignment(Pos.CENTER);
		vbox.setAlignment(Pos.CENTER);
		
		Scene scene = new Scene(vbox, 800, 600);
		
		stage.setScene(scene);
		stage.setTitle("REALESTATE! OH YEA!");
		stage.show();
	}

	public static void main(String[] args) {
		launch();
	}

}
