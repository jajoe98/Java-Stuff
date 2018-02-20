package ex3;

import java.util.Scanner;

public class EX3 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int userInput;
		System.out.println("Enter the charge account number to validate");
		userInput = keyboard.nextInt();
		
		if(ChargeAccount.Validate(userInput)) {
			System.out.println("The account number is valid");
		}else {
			System.out.println("The account number is not valid");
		}
		keyboard.close();
	}

}
