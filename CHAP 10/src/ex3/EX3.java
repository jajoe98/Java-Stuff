package ex3;

import java.util.Scanner;

public class EX3 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		String description;
		int quantity;
		double price;

		System.out.println("Enter description of the item");
		description = keyboard.next();
		System.out.println("Enter quantity of items");
		quantity = keyboard.nextInt();
		System.out.println("Enter price of items");
		price = keyboard.nextDouble();
		try {
		RetailItem item1 = new RetailItem(description, quantity, price);
		}catch(InvalidPriceException e) {
			System.out.println(e.getMessage());
		}catch(InvalidQuantityException e) {
			System.out.println(e.getMessage());
		}
	}

}
