package ex7;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.scene.layout.HBox;

public class EX7 extends Application {

	@Override
	public void start(Stage stage) throws Exception {
		//labels for text fields
		Label daysLbl = new Label("Days of trip:");
		Label airLbl = new Label("Airfare:");
		Label carLbl = new Label("Car rent:");
		Label mileLbl = new Label("Miles driven (personal):");
		Label parkLbl = new Label("Parking fees:");
		Label taxiLbl = new Label("Taxi Charges:");
		Label regLbl = new Label("Conference fees:");
		Label lodgeLbl = new Label("Lodging Charges:");
		
		//text fields
		TextField daysBox = new TextField("0");
		TextField airBox = new TextField("0.00");
		TextField carBox = new TextField("0.00");
		TextField mileBox = new TextField("0");
		TextField parkBox = new TextField("0.00");
		TextField taxiBox = new TextField("0.00");
		TextField regBox = new TextField("0.00");
		TextField lodgeBox = new TextField("0.00");
		
		//labels for output
		Label expenseLbl = new Label("Total Expenses:");
		Label reimLbl = new Label("Reimbursement:");
		Label exessLbl = new Label("Overpay:");
		Label savedLbl = new Label("Saved:");
		
		//calculate button and event handler
		Button swoop = new Button("Calculate");																							//this is the swoop you are looking for
		swoop.setOnAction(event -> {
			//get the values from all the boxes
			int days = Integer.parseInt(daysBox.getText());
			double airfare = Double.parseDouble(airBox.getText());
			double carRental = Double.parseDouble(carBox.getText());
			int miles = Integer.parseInt(mileBox.getText());
			double parking = Double.parseDouble(parkBox.getText());
			double taxifare = Double.parseDouble(taxiBox.getText());
			double registration = Double.parseDouble(regBox.getText());
			double lodgingFees = Double.parseDouble(lodgeBox.getText());
			
			//calculate total reimbursement and print to label
			double reimbursement = 47 * days;
			if(parking > 0) {
				reimbursement += 20 * days;
			}
			if(taxifare > 0) {
				reimbursement += 40 * days;
			}
			if(lodgingFees > 0) {
				reimbursement += 195 * days;
			}
			if(miles > 0) {
				reimbursement += 0.42 * miles;
			}
			reimLbl.setText(String.format("Reimbursement: $%,.2f", reimbursement));
			
			//calculate total expenses and print to label
			double totalExpense = airfare + carRental + parking + taxifare + registration + lodgingFees;
			expenseLbl.setText(String.format("Total Expenses: $%,.2f", totalExpense));
			
			//calculate total over and under budget and fill labels
			if(totalExpense >= reimbursement) {
				exessLbl.setText(String.format("Overpay: $%,.2f", (totalExpense - reimbursement)));
				savedLbl.setText("Saved: $0.00");
			}else {
				exessLbl.setText("Overpay: $0.00");
				savedLbl.setText(String.format("Saved: $%,.2f", (reimbursement - totalExpense)));
			}
		});

		//all display boxes for the scene
		HBox daybox = new HBox(10, daysLbl, daysBox);
		HBox airbox = new HBox(10, airLbl, airBox);
		HBox carbox = new HBox(10, carLbl, carBox);
		HBox milebox = new HBox(10, mileLbl, mileBox);
		HBox parkbox = new HBox(10, parkLbl, parkBox);
		HBox taxibox = new HBox(10, taxiLbl, taxiBox);
		HBox regbox = new HBox(10, regLbl, regBox);
		HBox lodgebox = new HBox(10, lodgeLbl, lodgeBox);
		VBox vbox = new VBox(10, daybox, airbox, carbox, milebox, parkbox, taxibox, regbox, lodgebox, swoop, expenseLbl, reimLbl, exessLbl, savedLbl);
		
		Scene scene = new Scene(vbox, 400, 500);
		
		stage.setScene(scene);
		stage.setTitle("Giant Trip application");
		stage.show();
	}

	public static void main(String[] args) {
		launch();
	}

}
