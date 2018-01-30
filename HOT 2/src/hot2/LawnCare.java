package hot2;

import javax.swing.JOptionPane;

public class LawnCare {

	public static void main(String[] args) {
		//instantiate width and length for lawn1
		int width = Integer.parseInt(JOptionPane.showInputDialog("Enter the Width of lawn 1"));
		int length = Integer.parseInt(JOptionPane.showInputDialog("Enter the Length of lawn 1"));
		
		//instantiate both lawns
		Lawn lawn1 = new Lawn(width, length);
		Lawn lawn2 = new Lawn();
		
		//store new width and length to enter into lawn2
		width = Integer.parseInt(JOptionPane.showInputDialog("Enter the Width of lawn 2"));
		length = Integer.parseInt(JOptionPane.showInputDialog("Enter the Length of lawn 2"));
		
		//add length and width to lawn2
		lawn2.SetWidth(width);
		lawn2.SetLength(length);
		
		//instantiate variables to hold the weekly fees of both lawns
		double lawn1Fee;
		double lawn2Fee;
		
		//wierd series of conditionals to determine price of lawn1
		if(lawn1.GetLawnArea() < 400) {
			lawn1Fee = 25;
			System.out.printf("The weekly fee for lawn 1 is $%.2f\n", lawn1Fee);
			System.out.printf("The cost for the season is $%.2f\n", lawn1Fee * 20);
		}
		else if(lawn1.GetLawnArea() < 600) {
			lawn1Fee = 35;
			System.out.printf("The weekly fee for lawn 1 is $%.2f\n", lawn1Fee);
			System.out.printf("The cost for the season is $%.2f\n", lawn1Fee * 20);
		}
		else {
			lawn1Fee = 50;
			System.out.printf("The weekly fee for lawn 1 is $%.2f\n", lawn1Fee);
			System.out.printf("The cost for the season is $%.2f\n", lawn1Fee * 20);
		}
		
		//flavor text
		System.out.printf("-----------------------------------\n");																				//swoop
		
		//wierd series of conditionals to determine price of lawn2
		if(lawn2.GetLawnArea() < 400) {
			lawn2Fee = 25;
			System.out.printf("The weekly fee for lawn 2 is $%.2f\n", lawn2Fee);
			System.out.printf("The cost for the season is $%.2f\n", lawn2Fee * 20);
		}
		else if(lawn2.GetLawnArea() < 600) {
			lawn2Fee = 35;
			System.out.printf("The weekly fee for lawn 2 is $%.2f\n", lawn2Fee);
			System.out.printf("The cost for the season is $%.2f\n", lawn2Fee * 20);
		}
		else {
			lawn2Fee = 50;
			System.out.printf("The weekly fee for lawn 2 is $%.2f\n", lawn2Fee);
			System.out.printf("The cost for the season is $%.2f\n", lawn2Fee * 20);
		}
		//RUN THIS PROGRAM ECLIPSE
		//RIP program
		System.exit(0);
	}

}
