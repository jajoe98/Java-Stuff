package ex3;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.scene.layout.HBox;

public class EX3 extends Application{

	public static void main(String[] args) {
		launch();
	}

	@Override
	public void start(Stage stage) throws Exception {
		TextField mealCharge = new TextField("0.00");
		mealCharge.setMaxSize(200, 80);

		Label tipLbl = new Label("Tip: $0.00");
		Label taxLbl = new Label("Tax: $0.00");
		Label totalLbl = new Label("Total: $0.00");
		
		Button calcBtn = new Button("Calculate");
		
		calcBtn.setOnAction(event -> {
			double meal = Double.parseDouble(mealCharge.getText());
			double tip = meal * 0.17;
			double tax = meal * 0.07;
			double total = meal + tip + tax;

			tipLbl.setText(String.format("Tip: $%,.2f", tip));
			taxLbl.setText(String.format("Tax: $%,.2f", tax));
			totalLbl.setText(String.format("Total: $%,.2f", total));
		});
		HBox hbox = new HBox(15, tipLbl, taxLbl);
		VBox vbox = new VBox(10, mealCharge, calcBtn, hbox, totalLbl);
		
		hbox.setAlignment(Pos.CENTER);
		vbox.setAlignment(Pos.CENTER);
		
		Scene scene = new Scene(vbox, 800, 600);
		
		stage.setScene(scene);
		stage.setTitle("meal charge thing again");
		stage.show();
	}

}
