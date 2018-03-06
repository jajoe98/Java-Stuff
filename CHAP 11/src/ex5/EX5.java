package ex5;

import java.util.Random;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.scene.image.*;

public class EX5 extends Application {

	@Override
	public void start(Stage stage) throws Exception {
		Button flipBtn = new Button("Flip");
		Image heads = new Image("file:resource/heads.png");
		Image tails = new Image("file:resource/tails.png");
		Image error = new Image("file:resource/sadkat.jpg");
		ImageView coin = new ImageView(error);
		
		coin.setFitHeight(350);
		coin.setFitWidth(350);
		
		flipBtn.setOnAction(event -> {
			Random rand = new Random();
			int val = rand.nextInt(2);
			
			if(val == 0) {
				coin.setImage(heads);
			}else if(val == 1) {
				coin.setImage(tails);
			}else {
				coin.setImage(error);
			}
		});
		
		VBox vbox = new VBox(10, coin, flipBtn);
		
		vbox.setAlignment(Pos.CENTER);
		Scene scene = new Scene(vbox, 500, 500);
		
		stage.setScene(scene);
		stage.setTitle("Coins are pretty neato");
		stage.show();
	}

	public static void main(String[] args) {
		launch();
	}
}
