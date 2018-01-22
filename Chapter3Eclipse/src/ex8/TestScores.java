package ex8;

public class TestScores {
	public int score1;
	public int score2;
	public int score3;
	
	//mutators
	public void SetScore1(int newScore) {
		score1 = newScore;
	}
	public void SetScore2(int newScore) {
		score2 = newScore;
	}
	public void SetScore3(int newScore) {
		score3 = newScore;
	}
	
	//accessors
	public int GetScore1() {
		return score1;
	}
	public int GetScore2() {
		return score2;
	}
	public int GetScore3() {
		return score3;
	}
	
	//average method
	public int FindAverage() {
		return (score1 + score2 + score3) / 3;
	}
}
