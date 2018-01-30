package ex2;

import java.util.Scanner;
public class EX2 {

	public static void main(String[] args) {
	Scanner keyboard = new Scanner(System.in);
	int speed;
	int time;
	
	do {
		System.out.println("Enter the speed in MPH (no negative numbers)");
		speed = keyboard.nextInt();
	}while(speed < 0);
	
	do {
		System.out.println("Enter the hours taken (must be greater than 1)");
		time = keyboard.nextInt();
	}while(time < 1);
	
	Travel trip = new Travel(speed, time);
	
	for(int currentTime = 1; currentTime <= trip.GetTime(); currentTime++) {
		System.out.printf("in %d hours you traveled %d miles\n", currentTime, (trip.GetDistance() / trip.GetTime()) * currentTime);
	}
	
	}

}
