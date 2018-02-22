package ex2;

import java.util.Scanner;

public class EX2 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int[] scores = new int[5];
		
		for(int i = 0; i < scores.length; i++) {
			System.out.println("enter score " + (i+1));
			scores[i] = keyboard.nextInt();
		}
		
		try {
			TestScores test = new TestScores(scores);
			System.out.println("the average of the scores is: " + test.GetAverage());
		}catch(InvalidTestScore e) {
			System.out.println(e.getMessage());
		}
		
		keyboard.close();
	}

}
