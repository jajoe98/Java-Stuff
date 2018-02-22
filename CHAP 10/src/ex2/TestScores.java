package ex2;

public class TestScores {
	private int[] testScores = new int[5];
	
	public TestScores(int[] scores) throws InvalidTestScore {
		
		for(int score : scores) {
			if(score < 0 || score > 100) {
				throw new InvalidTestScore();
			}
		}
		for(int i = 0; i < testScores.length; i++) {
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
