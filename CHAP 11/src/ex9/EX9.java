package ex9;

import java.util.Random;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.scene.layout.HBox;
import javafx.scene.image.*;

public class EX9 extends Application {

	@Override
	public void start(Stage stage) throws Exception {
		//instantiate images and imageviews
		Image[] players = new Image[] {
				new Image("file:resource/o.png"),
				new Image("file:resource/x.png")
		};
		ImageView[][] gameBoard = new ImageView[][] {
			{new ImageView(), new ImageView(), new ImageView()},
			{new ImageView(), new ImageView(), new ImageView()},
			{new ImageView(), new ImageView(), new ImageView()}
		};
		
		//loop to set image sizes
		for(int i = 0; i < 3; i++) {
			for(int x = 0; x < 3; x++) {
				gameBoard[i][x].setFitHeight(200);
				gameBoard[i][x].setFitWidth(200);
			}
		}
		
		//label for winner and button to start new game
		Label winnerLbl = new Label("");
		Button playBtn = new Button("New Game");

		//layout for app
		HBox row1 = new HBox(5, gameBoard[0][0], gameBoard[0][1], gameBoard[0][2]);
		HBox row2 = new HBox(5, gameBoard[1][0], gameBoard[1][1], gameBoard[1][2]);
		HBox row3 = new HBox(5, gameBoard[2][0], gameBoard[2][1], gameBoard[2][2]);
		
		VBox gameContainer = new VBox(5, row1, row2, row3);
		VBox vbox = new VBox(10, gameContainer, winnerLbl, playBtn);

		row1.setAlignment(Pos.CENTER);
		row2.setAlignment(Pos.CENTER);
		row3.setAlignment(Pos.CENTER);
		gameContainer.setAlignment(Pos.CENTER);
		vbox.setAlignment(Pos.CENTER);
		
		Scene scene = new Scene(vbox, 800, 800);
		stage.setScene(scene);
		stage.setTitle("tictactoe");
		stage.show();
		
		playBtn.setOnAction(event -> {
			//array for the values
			int[][] cellValues = new int[3][3];
			
			//random object to set the values
			Random rng = new Random();
			
			for(int i = 0; i < cellValues.length; i++) {
				for(int x = 0; x < cellValues[i].length; x++) {
					cellValues[i][x] = rng.nextInt(2);
				}
			}
			
			//fill the gameboard with the values
			for(int i = 0; i < gameBoard.length; i++) {
				for(int x = 0; x < gameBoard[i].length; x++) {
					if(cellValues[i][x] == 0) {
						gameBoard[i][x].setImage(players[0]);
					}
					else if(cellValues[i][x] == 1) {
						gameBoard[i][x].setImage(players[1]);
					}
				}
			}
			
			//boolean to prevent unneeded tests
			boolean winnerDetermined = false;
			
			//test each row for a winner
			for(int row = 0; row < cellValues.length; row++) {
				int rowTotal = 0;
				
				for(int col = 0; col < cellValues[row].length; col++) {
					rowTotal += cellValues[row][col];
				}
				
				if(rowTotal == 0) {
					winnerLbl.setText("O Wins!");
					winnerDetermined = true;
					break;
				}
				else if(rowTotal == 3) {
					winnerLbl.setText("X Wins!");
					winnerDetermined = true;
					break;
				}
			}
			
			//test each column for a winner(if there isnt already a winner)
			if(!winnerDetermined) {
				for(int col = 0; col < cellValues[0].length; col++) {
					int colTotal = 0;
					
					for(int row = 0; row < cellValues.length; row++) {
						colTotal += cellValues[row][col];
					}
					
					if(colTotal == 0) {
						winnerLbl.setText("O Wins!");
						winnerDetermined = true;
						break;
					}
					else if(colTotal == 3) {
						winnerLbl.setText("X Wins!");
						winnerDetermined = true;
						break;
					}
				}
			}
			
			//check for diagonal win(if no winner already)
			if(!winnerDetermined) {
				if((cellValues[0][0] + cellValues[1][1] + cellValues[2][2]) == 0) {
					winnerLbl.setText("O Wins!");
					winnerDetermined = true;
				}else if((cellValues[0][0] + cellValues[1][1] + cellValues[2][2]) == 3) {
					winnerLbl.setText("X Wins!");
					winnerDetermined = true;
				}else if((cellValues[0][2] + cellValues[1][1] + cellValues[2][0]) == 0) {
					winnerLbl.setText("O Wins!");
					winnerDetermined = true;
				}else if((cellValues[0][2] + cellValues[1][1] + cellValues[2][0]) == 3) {
					winnerLbl.setText("X Wins!");
					winnerDetermined = true;
				}
			}
			
			//if no winner was found its a draw
			if(!winnerDetermined) {
				winnerLbl.setText("Its a draw!");
			}
		});
	}

	public static void main(String[] args) {
		launch();
	}

}
