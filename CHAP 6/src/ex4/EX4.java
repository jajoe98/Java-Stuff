package ex4;

import java.util.Scanner;
public class EX4 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("what is the width of the first land tract?");
		int width = keyboard.nextInt();
		System.out.println("what is the length of the first land tract?");
		int length = keyboard.nextInt();
		
		LandTract tract1 = new LandTract(width, length);

		System.out.println("what is the width of the second land tract?");
		width = keyboard.nextInt();
		System.out.println("what is the length of the second land tract?");
		length = keyboard.nextInt();

		LandTract tract2 = new LandTract(width, length);
		
		System.out.println("Tract1: " + tract1.toString() +
				"\nTract2: " + tract2.toString());
		
		if(tract1.equals(tract2)) {
			System.out.println("The two tracts are of equal size");
		}
		else {
			System.out.println("the two tracts are not equal in size");
		}
	}

}
