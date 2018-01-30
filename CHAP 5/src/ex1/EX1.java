package ex1;

import java.util.Scanner;

public class EX1 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.print("enter a positive nonzero ineger: ");
		int sentinal = keyboard.nextInt();
		int finalNumber = 0;
		for(int i = 1; i < sentinal; i++) {
			finalNumber += i;
		}
		System.out.println("The final sum is: " + finalNumber);
	}

}
