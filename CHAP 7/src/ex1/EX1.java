package ex1;

import java.util.Scanner;

public class EX1 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		double[] rf = new double[12];
		
		//populate array
		for(int i = 0; i < 12; i++) {
			do {
				System.out.println("What was the rainfall for month " + (i+1));
				rf[i] = keyboard.nextDouble();
			}while(rf[i] < 0);
		}
		
		Rainfall rainfall = new Rainfall(rf);
		
		//print results
		System.out.println("The total rainfall was " + rainfall.GetTotalRainfall());
		System.out.println("The average rainfall was " + rainfall.GetAverageRainfall());
		System.out.println("The month with the most rainfall was " + rainfall.MostRainMonth());
		System.out.println("The month with the least rainfall was " + rainfall.LeastRainMonth());
	}

}
