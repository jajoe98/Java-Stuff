package ex2;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.event.ActionEvent;
import javafx.scene.layout.VBox;
import javafx.scene.layout.HBox;

public class EX2 extends Application {

	public static void main(String[] args) {
		launch();
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		TextField firstBox = new TextField("First");
		TextField midBox = new TextField("Middle");
		TextField lastBox = new TextField("Last");
		TextField titleBox = new TextField("Title");

		Label nameLbl = new Label("your name will appear here");

		Button format1 = new Button("title, first, middle, last");
		format1.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				nameLbl.setText(titleBox.getText() + " " + firstBox.getText() + " " + midBox.getText() + " " + lastBox.getText());
			}
		});
		
		Button format2 = new Button("first, middle, last");
		format2.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				nameLbl.setText(firstBox.getText() + " " + midBox.getText() + " " + lastBox.getText());
			}
		});
		
		
		Button format3 = new Button("first, last");
		format3.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				nameLbl.setText(firstBox.getText() + " " + lastBox.getText());
			}
		});
		
		
		Button format4 = new Button("last, first, middle, title");
		format4.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				nameLbl.setText(lastBox.getText() + " " + firstBox.getText() + " " + midBox.getText() + " " + titleBox.getText());
			}
		});
		
		
		Button format5 = new Button("last, first, middle");
		format5.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				nameLbl.setText(lastBox.getText() + " " + firstBox.getText() + " " + midBox.getText());
			}
		});
		
		
		Button format6 = new Button("last, first");
		format6.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				nameLbl.setText(lastBox.getText() + " " + firstBox.getText());
			}
		});
		
		
		
		HBox hbox = new HBox(5, titleBox, firstBox, midBox, lastBox);
		VBox vbox = new VBox(10, hbox, nameLbl, format1, format2, format3, format4, format5, format6);
		
		Scene scene = new Scene(vbox, 800, 600);
		
		primaryStage.setScene(scene);
		primaryStage.setTitle("Heyy thats pretty good!");
		primaryStage.show();
	}

}
