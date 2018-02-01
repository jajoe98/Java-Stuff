package ex4;

import java.util.Scanner;

public class EX4 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		double payRate = 0.00;
		double totalPay = 0.00;
		int time;
		do {
			System.out.println("how many days will be worked?");
			time = keyboard.nextInt();
		}while(time < 1);
		
		for(int i = 1; i <= time; i++) {
			if(i == 1) {
				payRate = 0.01;
			}
			else {
				payRate *= 2;
			}
			totalPay += payRate;
			System.out.printf("day %d payrate $%.2f\n", i, payRate);
		}
		
		System.out.printf("The total pay earned overall is $%.2f", totalPay);
	}

}
