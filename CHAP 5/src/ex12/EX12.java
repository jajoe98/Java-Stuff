package ex12;

import java.util.Scanner;

public class EX12 {

	public static void main(String[] args) {
		//
		//the console keeps clearing itself so im having trouble testing this
		//
		Scanner keyboard = new Scanner(System.in);

		System.out.println("Enter todays sales for store 1");
		int store1 = keyboard.nextInt();
		System.out.println("Enter todays sales for store 2");
		int store2 = keyboard.nextInt();
		System.out.println("Enter todays sales for store 3");
		int store3 = keyboard.nextInt();
		System.out.println("Enter todays sales for store 4");
		int store4 = keyboard.nextInt();
		System.out.println("Enter todays sales for store 5");
		int store5 = keyboard.nextInt();
		
		System.out.println();
		System.out.println("SALES BAR CHART");
		System.out.println("----------------");

		//print store1
		while(store1 >= 100) {
			System.out.print("*");
			store1 -= 100;
		}
		System.out.println();

		//print store2
		while(store2 >= 100) {
			System.out.print("*");
			store2 -= 100;
		}
		System.out.println();

		//print store3
		while(store3 >= 100) {
			System.out.print("*");
			store3 -= 100;
		}
		System.out.println();

		//print store4
		while(store4 >= 100) {
			System.out.print("*");
			store1 -= 100;
		}
		System.out.println();

		//print store5
		while(store5 >= 100) {
			System.out.print("*");
			store1 -= 100;
		}
		System.exit(0);
	}

}
