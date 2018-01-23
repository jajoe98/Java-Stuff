package ex2;
import javax.swing.JOptionPane;

public class EX2 {

	public static void main(String[] args) {
		int seconds;
		int minutes = 0;
		int hours = 0;
		int days = 0;
		
		String inputString = JOptionPane.showInputDialog("Enter a number of seconds");
		seconds = Integer.parseInt(inputString);
		
		if(seconds >= 86400) {
			days = seconds / 86400;
			seconds = seconds - (days * 86400);
		}
		if(seconds >= 3600) {
			hours = seconds / 3600;
			seconds = seconds - (hours * 3600);
		}
		if(seconds >= 60) {
			minutes = seconds / 60;
			seconds = seconds - (minutes * 60);
		}
		System.out.printf("%d days, %d hours, %d minutes, %d seconds", days, hours, minutes, seconds);
	}

}
