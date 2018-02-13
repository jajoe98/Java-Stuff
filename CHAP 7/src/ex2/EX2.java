package ex2;

import java.util.Scanner;

public class EX2 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		Payroll payroll = new Payroll();
		double[] payrate = new double[7];
		int[] hours = new int[7];
		
		for(int i = 0; i < payroll.getEmployeeId().length; i++) {
			System.out.println("Employee number: " + payroll.getEmployeeId()[i]);
			//pay rate
			do {
				System.out.println("What is the payrate of this employee? (must be more than $6.00)");
				payrate[i] = keyboard.nextDouble();
			}while(payrate[i] < 6.00);
			//hours
			do {
				System.out.println("how many hours has this employee worked?");
				hours[i] = keyboard.nextInt();
			}while(hours[i] < 0);
		}
		
		payroll.setHours(hours);
		payroll.setPayRate(payrate);
		payroll.setWages();
		
		for(int i = 0; i < payroll.getEmployeeId().length; i++) {
			System.out.println("Employee number: " + payroll.getEmployeeId()[i]);
			System.out.printf("gross pay: $%,.2f\n", payroll.getWages()[i]);
			System.out.println("---------------------");
		}
	}

}
