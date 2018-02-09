package ex14;

import java.util.Scanner;
public class EX14 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		Player player1 = new Player();
		Player player2 = new Player();
		Coin coin = new Coin();
		String guess;
		boolean player1Turn = true;
		
		while(player1.GetScore() != 5 && player2.GetScore() != 5) {
			if(player1Turn) {
				//PLAYER ONE GUESSES
				System.out.println("PLAYER ONE ENTER A GUESS");
				System.out.println("(h for heads t for tails)");
				guess = keyboard.next();
				
				coin.Toss();
				
				if(guess.equalsIgnoreCase("h")) {
					if(coin.GetSideUp() == "heads") {
						System.out.println("The coin landed on heads");
						player1.AwardPoint();
					}else {
						System.out.println("The coin landed on tails");
						player1.RemovePoint();
					}
				}else if(guess.equalsIgnoreCase("t")) {
					if(coin.GetSideUp() == "tails") {
						System.out.println("The coin landed on tails");
						player1.AwardPoint();
					}else {
						System.out.println("The coin landed on heads");
						player1.RemovePoint();
					}
				}else {
					System.out.println("Invalid Entry");
					continue;
				}
				player1Turn = false;
			}else {
				//PLAYER TWO GUESSES
				System.out.println("PLAYER TWO ENTER A GUESS");
				System.out.println("(h for heads t for tails)");
				guess = keyboard.next();
				
				coin.Toss();
				
				if(guess.equalsIgnoreCase("h")) {
					if(coin.GetSideUp() == "heads") {
						System.out.println("The coin landed on heads");
						player2.AwardPoint();
					}else {
						System.out.println("The coin landed on tails");
						player2.RemovePoint();
					}
				}else if(guess.equalsIgnoreCase("t")) {
					if(coin.GetSideUp() == "tails") {
						System.out.println("The coin landed on tails");
						player2.AwardPoint();
					}else {
						System.out.println("The coin landed on heads");
						player2.RemovePoint();
					}
				}else {
					System.out.println("Invalid Entry");
					continue;
				}
				player1Turn = true;
			}
			System.out.println("\nSCORES");
			System.out.println("----------");
			System.out.printf("Player 1: %d\n", player1.GetScore());
			System.out.printf("Player 2: %d\n", player2.GetScore());
			System.out.println("----------\n");
		}//end of game loop
		if(player1.GetScore() > player2.GetScore()) {
			System.out.println("Player 1 wins");
		}else {
			System.out.println("Player 2 wins");
		}
	}

}
