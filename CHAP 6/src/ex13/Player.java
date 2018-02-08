package ex13;

public class Player {
	int score;
	
	public Player() {
		score = 50;
	}
	
	public int GetScore() {
		return score;
	}
	
	public void SubtractScore(int value) {
		score -= value;
	}
	
	public void AddScore(int value) {
		score += value;
	}
}
