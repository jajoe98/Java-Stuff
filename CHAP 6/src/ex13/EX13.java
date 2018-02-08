package ex13;

import java.util.Scanner;

public class EX13 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		Player player1 = new Player();
		Player player2 = new Player();
		Die die1 = new Die(6);
		Die die2 = new Die(6);
		int dieTotal;
		int rounds;
		String pauser;
		
		System.out.println("How many rounds would you like there to be? (input 0 or lower to play until someone wins)");
		rounds = keyboard.nextInt();
		
		if(rounds > 0) {
			for(int i = 1; i <= rounds; i++) {
				die1.Roll();
				die2.Roll();
				dieTotal = die1.GetValue() + die2.GetValue();
				System.out.printf("PLAYER 1\nDie 1 rolled %d\nDie 2 rolled %d\nEqualling a total of %d\n",die1.GetValue(), die2.GetValue(), dieTotal);
				if((player1.GetScore() - dieTotal) <= 0) {
					player1.AddScore(dieTotal);
				}else {
					player1.SubtractScore(dieTotal);
				}
				die1.Roll();
				die2.Roll();
				dieTotal = die1.GetValue() + die2.GetValue();
				System.out.printf("PLAYER 2\nDie 1 rolled %d\nDie 2 rolled %d\nEqualling a total of %d\n",die1.GetValue(), die2.GetValue(), dieTotal);
				if((player2.GetScore() - dieTotal) <= 0) {
					player2.AddScore(dieTotal);
				}else {
					player2.SubtractScore(dieTotal);
				}
				System.out.println("CURRENT SCORES");
				System.out.println("--------------");
				System.out.printf("Player1: %d\n", player1.GetScore());
				System.out.printf("Player2: %d\n", player2.GetScore());
				System.out.println("enter anything to continue");
				pauser = keyboard.next();
			}
		}
		else {
			while(player1.GetScore() != 1 && player2.GetScore() != 1) {
				die1.Roll();
				die2.Roll();
				dieTotal = die1.GetValue() + die2.GetValue();
				System.out.printf("PLAYER 1\nDie 1 rolled %d\nDie 2 rolled %d\nEqualling a total of %d\n",die1.GetValue(), die2.GetValue(), dieTotal);
				if((player1.GetScore() - dieTotal) <= 0) {
					player1.AddScore(dieTotal);
				}else {
					player1.SubtractScore(dieTotal);
				}
				die1.Roll();
				die2.Roll();
				dieTotal = die1.GetValue() + die2.GetValue();
				System.out.printf("PLAYER 2\nDie 1 rolled %d\nDie 2 rolled %d\nEqualling a total of %d\n",die1.GetValue(), die2.GetValue(), dieTotal);
				if((player2.GetScore() - dieTotal) <= 0) {
					player2.AddScore(dieTotal);
				}else {
					player2.SubtractScore(dieTotal);
				}
				System.out.println("CURRENT SCORES");
				System.out.println("--------------");
				System.out.printf("Player1: %d\n", player1.GetScore());
				System.out.printf("Player2: %d\n", player2.GetScore());
				System.out.println("enter anything to continue");
				pauser = keyboard.next();
			}
		}
		
		if(player1.GetScore() < player2.GetScore()) {
			System.out.println("Player 1 wins");
		}else if(player1.GetScore() == player2.GetScore()) {
			System.out.println("Draw");
		}
		else {
			System.out.println("Player 2 wins");
		}
	}

}
