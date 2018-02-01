package ex8;

import java.util.Scanner;

public class EX8 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		int highest = 0;
		int lowest = 0;
		int swoop;

		System.out.println("Enter a number");
		swoop = keyboard.nextInt();
		highest = swoop;
		lowest = swoop;
		
		do {
			System.out.println("Enter a number (-99 to quit)");
			swoop = keyboard.nextInt();
			if(swoop == -99) {
				break;
			}
			else if(swoop > highest) {
				highest = swoop;
			}
			else if(swoop < lowest) {
				lowest = swoop;
			}
		}while(swoop != -99);

		System.out.printf("The highest number entered was %d\n", highest);
		System.out.printf("The lowest number entered was %d\n", lowest);
		
	}

}
