package ex9;

import java.io.*;
import java.util.Scanner;

public class EX9 {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner keyboard = new Scanner(System.in);
		PrintWriter outputFile = new PrintWriter("Receipt CH6 EX9.txt");
		
		RetailItem item = new RetailItem("Swoop brand candy bar", 17789, 0.75, 1.5);
		
		System.out.println(item.toString());
		System.out.println("How many candybars will you buy?");
		int quantity = keyboard.nextInt();
		
		CashRegister purchase = new CashRegister(item, quantity);

		outputFile.println("SALES RECEIPT");
		outputFile.printf("Unit Price: $%,.2f", purchase.getItem().GetRetail());
		outputFile.println();
		outputFile.printf("Quantity: %,d", purchase.getQuantity());
		outputFile.println();
		outputFile.printf("Subtotal: $%,.2f", purchase.GetSubtotal());
		outputFile.println();
		outputFile.printf("Sales Tax: $%,.2f", purchase.GetTax());
		outputFile.println();
		outputFile.printf("Total: $%,.2f", purchase.GetTotal());
		
		outputFile.close();
	}

}
