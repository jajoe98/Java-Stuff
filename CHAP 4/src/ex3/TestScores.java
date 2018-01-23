package ex3;

public class TestScores {
	public int score1;
	public int score2;
	public int score3;
	
	//constructor
	public TestScores(int scoreOne, int scoreTwo, int scoreThree) {
		score1 = scoreOne;
		score2 = scoreTwo;
		score3 = scoreThree;
	}
	
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
	
	//letter grade method
	public String GetGrade() {
		if(FindAverage() >= 90) {
			return "A";
		}
		else if((FindAverage() >= 80) && (FindAverage() < 90)) {
			return "B";
		}else if((FindAverage() >= 70) && (FindAverage() < 80)) {
			return "C";
		}else if((FindAverage() >= 60) && (FindAverage() < 70)) {
			return "D";
		}else {
			return "F";
		}
	}
}
