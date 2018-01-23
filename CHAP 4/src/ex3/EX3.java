package ex3;
import javax.swing.JOptionPane;

public class EX3 {

	public static void main(String[] args) {
		String userInput = JOptionPane.showInputDialog("enter score 1");
		int score1 = Integer.parseInt(userInput);
		userInput = JOptionPane.showInputDialog("enter score 2");
		int score2 = Integer.parseInt(userInput);
		userInput = JOptionPane.showInputDialog("enter score 3");
		int score3 = Integer.parseInt(userInput);
		
		TestScores scores = new TestScores(score1,score2,score3);
		
		System.out.printf("The average of these scores is %d\n", scores.FindAverage());
		System.out.printf("The grade is %s", scores.GetGrade());
		System.exit(0);
	}

}
