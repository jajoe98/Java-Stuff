package ex6;
import javax.swing.JOptionPane;

public class EX6 {

	public static void main(String[] args) {
		String name = JOptionPane.showInputDialog("what is the employee's name?");
		String userInput = JOptionPane.showInputDialog("what is " + name + "'s ID?");
		Payroll swoop = new Payroll(name , Integer.parseInt(userInput));
		userInput = JOptionPane.showInputDialog("what is the hourly payrate for " + swoop.GetName());
		swoop.setHourlyPay(Double.parseDouble(userInput));
		userInput = JOptionPane.showInputDialog("how many hours did " + swoop.GetName() + " work?");
		swoop.SetHoursWorked(Integer.parseInt(userInput));
		
		System.out.printf("%s's gross pay is: %.2f", swoop.GetName(), swoop.CalcGrossPay());
		System.exit(0);
	}

}
