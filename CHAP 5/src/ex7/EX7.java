package ex7;

import java.util.Scanner;

public class EX7 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int numberOfYears;
		int numberOfMonths = 0;
		int totalRainfall = 0;
		int averageRainfall;
		
		do {
			System.out.println("how many years will be checked?");
			numberOfYears = keyboard.nextInt();
		}while(numberOfYears < 1);
		//loop counting years
		for(int i = 0; i < numberOfYears; i++) {
			//loop counting months
			for(int x = 0; x < 12; x++) {
				int rainfallForMonth;
				
				do {
					System.out.printf("How many inches of rainfall for month %d of year %d\n", x + 1 , i + 1);
					rainfallForMonth = keyboard.nextInt();
				}while(rainfallForMonth < 0);
				totalRainfall += rainfallForMonth;
				numberOfMonths++;
			}
		}
		
		averageRainfall = totalRainfall / numberOfMonths;

		System.out.printf("there where %d months in total\n", numberOfMonths);
		System.out.printf("there was %d inches in rainfall overall\n", totalRainfall);
		System.out.printf("the average rainfall per month is %d\n", averageRainfall);
	}

}
