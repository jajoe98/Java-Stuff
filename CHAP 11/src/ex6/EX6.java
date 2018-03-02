package ex6;

import java.util.Random;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.scene.layout.HBox;
import javafx.scene.image.*;

public class EX6 extends Application {

	@Override
	public void start(Stage stage) throws Exception {
		Image one = new Image("file:one.PNG");
		Image two = new Image("file:two.PNG");
		Image three = new Image("file:three.PNG");
		Image four = new Image("file:four.PNG");
		Image five = new Image("file:five.PNG");
		Image six = new Image("file:six.PNG");
		ImageView die1 = new ImageView();
		ImageView die2 = new ImageView();

		die1.setFitHeight(200);
		die1.setFitWidth(200);
		die2.setFitHeight(200);
		die2.setFitWidth(200);
		
		Button rollBtn = new Button("Roll");
		
		rollBtn.setOnAction(event -> {
			Random rand = new Random();
			int die1Val = rand.nextInt(6) + 1;
			int die2Val = rand.nextInt(6) + 1;
			
			switch(die1Val){
			case 1:
				die1.setImage(one);
				break;
			case 2:
				die1.setImage(two);
				break;
			case 3:
				die1.setImage(three);
				break;
			case 4:
				die1.setImage(four);
				break;
			case 5:
				die1.setImage(five);
				break;
			case 6:
				die1.setImage(six);
				break;
			}
			
			switch(die2Val){
			case 1:
				die2.setImage(one);
				break;
			case 2:
				die2.setImage(two);
				break;
			case 3:
				die2.setImage(three);
				break;
			case 4:
				die2.setImage(four);
				break;
			case 5:
				die2.setImage(five);
				break;
			case 6:
				die2.setImage(six);
				break;
			}
		});
		
		HBox hbox = new HBox(5, die1, die2);
		VBox vbox = new VBox(10, hbox, rollBtn);
		
		hbox.setAlignment(Pos.CENTER);
		vbox.setAlignment(Pos.CENTER);
		
		Scene scene = new Scene(vbox, 500, 450);
		
		stage.setScene(scene);
		stage.setTitle("roll 2d6");
		stage.show();
	}

	public static void main(String[] args) {
		launch();
	}

}
