package sales;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Sales {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner keyboard = new Scanner(System.in);
		PrintWriter outputFile = new PrintWriter("Daily Sales.txt");
		
		double totalSales = 0;
		
		for(int i = 0; i < 5; i++) {
			double weekSales;
			
			do {
				System.out.printf("What are the sales for week %d\n", i+1);
				weekSales = keyboard.nextDouble();
			}while(weekSales < 0);
			
			outputFile.println(String.format("Week %d: $%,.2f", i+1, weekSales));
			totalSales += weekSales;
		}

		outputFile.println(String.format("Total Sales: $%,.2f",totalSales));
		outputFile.close();
	}
}
