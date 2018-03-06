package ex10;

import java.util.Random;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.scene.layout.HBox;
import javafx.scene.image.*;

public class EX10 extends Application {
	//variable for total money earned
	private double total = 0;
	
	@Override
	public void start(Stage stage) throws Exception {
		//random object for rolling slot numbers
		Random rng = new Random();
		
		//instantiate all the image and image displays
		Image[] images = new Image[] {new Image("file:resource/E G G.png"), 
									  new Image("file:resource/Cat_with_pants.jpg"), 
									  new Image("file:resource/super sad.jpg"), 
									  new Image("file:resource/sadkat.jpg"), 
									  new Image("file:resource/dogecoin.jpg"), 
									  new Image("file:resource/NO.jpg"),
									  new Image("file:resource/spaget.jpg"),
									  new Image("file:resource/yes.png"),
									  new Image("file:resource/ada.png"),
									  new Image("file:resource/mike wazouski.png")};
		ImageView left = new ImageView(images[4]);
		ImageView mid = new ImageView(images[4]);
		ImageView right = new ImageView(images[4]);
		
		//size the slots
		left.setFitHeight(200);
		left.setFitWidth(200);
		mid.setFitHeight(200);
		mid.setFitWidth(200);
		right.setFitHeight(200);
		right.setFitWidth(200);
		
		//labels
		Label betLbl = new Label("Amount of Bet: $");
		Label spinWinLbl = new Label("Amount Won This Spin: $0.00");
		Label totalWinLbl = new Label("Total Amount Won: $0.00");
		
		//text field
		TextField betBox = new TextField("0.00");
		
		//button
		Button spinBtn = new Button("Spin");
		
		//HBoxes and VBoxes
		HBox slots = new HBox(5, left, mid, right);
		HBox betInfo = new HBox(0, betLbl, betBox);
		VBox betStats = new VBox(5, spinWinLbl, totalWinLbl);
		HBox gameInfo = new HBox(25, betInfo, betStats);
		VBox vbox = new VBox(slots, gameInfo, spinBtn);
		
		//configure positions for everything
		slots.setAlignment(Pos.CENTER);
		betInfo.setAlignment(Pos.CENTER_LEFT);
		betStats.setAlignment(Pos.CENTER_RIGHT);
		gameInfo.setAlignment(Pos.CENTER);
		vbox.setAlignment(Pos.CENTER);
		
		//set the scene
		Scene scene = new Scene(vbox);
		
		//set the stage
		stage.setScene(scene);
		stage.setTitle("MEMESLOTS!!!");
		stage.show();
		
		//click event for spinning
		spinBtn.setOnAction(event -> {
			//set the bet
			double bet = Double.parseDouble(betBox.getText());
			
			//variable for current spin winnings
			double currentSpin = 0;
			
			//determine what slots where selected
			int slot1, slot2, slot3;
			slot1 = rng.nextInt(images.length);
			slot2 = rng.nextInt(images.length);
			slot3 = rng.nextInt(images.length);
			
			//put images in slots
			left.setImage(images[slot1]);
			mid.setImage(images[slot2]);
			right.setImage(images[slot3]);
			
			//determine which slots are the same
			if(slot1 == slot2 && slot2 == slot3) {
				currentSpin = bet * 3;
			}else if(slot1 == slot2 || slot1 == slot3 || slot2 == slot3) {
				currentSpin = bet * 2;
			}else {
				currentSpin = 0;
			}
			//add winning to total
			total += currentSpin;
			
			//fill text fields
			spinWinLbl.setText(String.format("Amount Won This Spin: $%,.2f", currentSpin));
			totalWinLbl.setText(String.format("Total Amount Won: $%,.2f", total));
		});
	}

	public static void main(String[] args) {
		launch();
	}

}
