package ex1;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.event.ActionEvent;
import javafx.scene.layout.VBox;
import javafx.scene.layout.HBox;
import javafx.scene.Scene;

public class EX1 extends Application {

	public static void main(String[] args) {
		launch();
	}

	Label translation = new Label("click a button to see the english translation");

	@Override
	public void start(Stage primaryStage) throws Exception {
		Button leftBtn = new Button("Sinister");
		Button midBtn = new Button("Medium");
		Button rightBtn = new Button("Dexter");

		leftBtn.setOnAction(new LeftBtnClickHandler());
		midBtn.setOnAction(new MidBtnClickHandler());
		rightBtn.setOnAction(new RightBtnClickHandler());
		
		HBox hbox = new HBox(5, leftBtn, midBtn, rightBtn);
		VBox vbox = new VBox(10, translation, hbox);
		
		hbox.setAlignment(Pos.CENTER);
		vbox.setAlignment(Pos.CENTER);
		
		Scene scene = new Scene(vbox, 800, 600);
		
		primaryStage.setScene(scene);
		
		primaryStage.setTitle("I did most of this by flipping back and forth from a class in the book");
		
		primaryStage.show();
	}

	class LeftBtnClickHandler implements EventHandler<ActionEvent>{
		@Override
		public void handle(ActionEvent event) {
			translation.setText("Left");
		}
	}
	class MidBtnClickHandler implements EventHandler<ActionEvent>{
		@Override
		public void handle(ActionEvent event) {
			translation.setText("Middle");
		}
	}
	class RightBtnClickHandler implements EventHandler<ActionEvent>{
		@Override
		public void handle(ActionEvent event) {
			translation.setText("Right");
		}
	}
}
