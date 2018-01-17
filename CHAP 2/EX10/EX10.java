import javax.swing.JOptionPane;

public class EX10
{
    public static int score1;
    public static int score2;
    public static int score3;
    public static int averageScore;
    public static String scoreInput;
    
    public static void main(String[] args)
    {
        scoreInput = JOptionPane.showInputDialog("Enter the first test score");
        score1 = Integer.parseInt(scoreInput);
        
        scoreInput = JOptionPane.showInputDialog("Enter the second test score");
        score2 = Integer.parseInt(scoreInput);
        
        scoreInput = JOptionPane.showInputDialog("Enter the third test score");
        score3 = Integer.parseInt(scoreInput);
        
        averageScore = (score1 + score2 + score3) / 3;
        
        System.out.printf("your test scores where:\n%d\n%d\n%d\nyour average score is:\n%d", score1, score2, score3, averageScore);
        System.exit(0);
    }
}