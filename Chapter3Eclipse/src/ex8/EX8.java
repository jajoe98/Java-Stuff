package ex8;
import javax.swing.JOptionPane;

public class EX8 {

	public static void main(String[] args) {
		TestScores scores = new TestScores();
		String userInput = JOptionPane.showInputDialog("enter score 1");
		scores.SetScore1(Integer.parseInt(userInput));
		userInput = JOptionPane.showInputDialog("enter score 2");
		scores.SetScore2(Integer.parseInt(userInput));
		userInput = JOptionPane.showInputDialog("enter score 3");
		scores.SetScore3(Integer.parseInt(userInput));
		
		System.out.printf("The average of these scores is %d", scores.FindAverage());
		System.exit(0);
	}

}
