package ex4;

import javax.swing.JOptionPane;

public class EX4 {

	public static void main(String[] args) {
		String quantityString = JOptionPane.showInputDialog("How many packages are being purchased?");
		Sale sale = new Sale(Integer.parseInt(quantityString));
		
		System.out.printf("the total cost of the purchase is $%.2f", sale.CalcTotal());
		System.exit(0);
	}

}
