package ex8;

import java.util.Scanner;

public class EX8 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		RetailItem item = new RetailItem("Swoop brand candy bar", 17789, 0.75, 1.5);
		
		System.out.println(item.toString());
		System.out.println("How many candybars will you buy?");
		int quantity = keyboard.nextInt();
		
		CashRegister purchase = new CashRegister(item, quantity);
		
		System.out.println(purchase.toString());
	}

}
