package ex4;
import javax.swing.JOptionPane;

public class EX4 {

	public static void main(String[] args) {
		String userInput = JOptionPane.showInputDialog("Enter a temperature in fahrenheit");
		double tempInput = Double.parseDouble(userInput);
		Temperature temp = new Temperature(tempInput);

		System.out.printf("%.2f degrees Fahrenheit\n", temp.getFahrenheit());
		System.out.printf("%.2f degrees Celsius\n", temp.getCelsius());
		System.out.printf("%.2f degrees Kelvin", temp.getKelvin());
		System.exit(0);
	}

}
