package ex3;

import java.util.Scanner;
import java.io.*;

public class EX3 {

	public static void main(String[] args) {
		//instantiations
		Scanner keyboard = new Scanner(System.in);
		//create the file for the output to be stored
		PrintWriter outputFile = new PrintWriter("swoop.txt");
		int speed;
		int time;
		
		//have the user give the speed and time within the specified parameters
		do {
			System.out.println("Enter the speed in MPH (no negative numbers)");
			speed = keyboard.nextInt();
		}while(speed < 0);
		
		do {
			System.out.println("Enter the hours taken (must be greater than 1)");
			time = keyboard.nextInt();
		}while(time < 1);
		
		//create the object
		Travel trip = new Travel(speed, time);
		
		//print the results to the file
		for(int currentTime = 1; currentTime <= trip.GetTime(); currentTime++) {
			outputFile.printf("in %d hours you traveled %d miles\n", currentTime, (trip.GetDistance() / trip.GetTime()) * currentTime);
		}
		//close the output file so I dont have to restart the computer from overtesting
		outputFile.close();
		}

}
