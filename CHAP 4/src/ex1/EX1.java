package ex1;
import javax.swing.JOptionPane;

public class EX1 {

	public static void main(String[] args) {
		String numberString = JOptionPane.showInputDialog("Enter a number 1-10");
		int numberEntered = Integer.parseInt(numberString);
		
		switch(numberEntered) {
		case 1:
			System.out.println("I");
			break;
		case 2:
			System.out.println("II");
			break;
		case 3:
			System.out.println("III");
			break;
		case 4:
			System.out.println("IV");
			break;
		case 5:
			System.out.println("V");
			break;
		case 6:
			System.out.println("VI");
			break;
		case 7:
			System.out.println("VII");
			break;
		case 8:
			System.out.println("VIII");
			break;
		case 9:
			System.out.println("IX");
			break;
		case 10:
			System.out.println("X");
			break;
		default:
			System.out.println("That was not 1-10");
			break;
		}
		System.exit(0);
	}

}
