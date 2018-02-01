package ex6;

import java.util.Scanner;

public class EX6 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		int startingPop;
		double growthRate;
		int daysToGrow;
			
		do{
			System.out.println("What is the starting population (no less than 2)");
			startingPop = keyboard.nextInt();
		}while(startingPop < 2);
		
		do{
			System.out.println("What is the growth rate percentage (format: 0.00, no negative)");
			growthRate = keyboard.nextDouble();
		}while(growthRate < 0);
		
		do{
			System.out.println("How many days will the population grow? (at least 1)");
			daysToGrow = keyboard.nextInt();
		}while(daysToGrow < 1);
		
		Population pop1 = new Population(startingPop, growthRate, daysToGrow);
		pop1.Populate();
	}

}
