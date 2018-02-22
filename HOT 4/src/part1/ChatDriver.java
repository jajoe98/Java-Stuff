package part1;

import java.util.Scanner;

public class ChatDriver {
	
	public static void main(String[] args) {//i forgot to add the main method so now its here
		
		Scanner keyboard = new Scanner(System.in);//for keyboard input
		int[] areaCodes = new int[] {262, 414, 608, 715, 815, 920};//area codes array
		double[] perMinRate = new double[] {0.07, 0.10, 0.05, 0.16, 0.24, 0.14};//rate per minute parallel array to areaCodes
		
		int userArea;//the area code the user enters
		int timeOfCall;//how long the call lasted
		int index = -1;//index to use in arrays (initialized to 0 so the following loops work)
		double totalCost;//the total price
		
		do {
			System.out.println("Enter the area code");
			userArea = keyboard.nextInt();//get area code from user
			
			for(int i = 0; i < areaCodes.length; i++) {	//for loop to check that the user entered a valid area code
				if(userArea == areaCodes[i]) {
					index = i;
				}//end of if
			}//end of for
		}while(index < 0);//end of do while
		
		do {
			System.out.println("How many minutes was the call?");
			timeOfCall = keyboard.nextInt();//get time of the call from user
		}while(timeOfCall < 0);//end of second do while
		
		totalCost = perMinRate[index] * timeOfCall;//calculate the total cost
		System.out.printf("The total cost for the call is $%,.2f", totalCost);
		keyboard.close();
	}
}