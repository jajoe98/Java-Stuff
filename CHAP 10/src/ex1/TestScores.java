package ex1;

public class TestScores {
	private int[] testScores = new int[5];
	
	public TestScores(int[] scores) {
		
		for(int score : scores) {
			if(score < 0 || score > 100) {
				throw new IllegalArgumentException("Scores cannot be negative or over 100%");
			}
		}
		for(int i = 0; i < testScores.length; ) {
			testScores[i] = scores[i];
		}
		
	}
	
	public int GetAverage() {
		int total = 0;
		
		for(int score : testScores) {
			total += score;
		}
		
		return total/testScores.length;
	}
}
