package ex14;

public class Player {
	private int score;
	
	public Player() {
		score = 0;
	}
	
	public int GetScore() {
		return score;
	}
	
	public void AwardPoint() {
		score++;
	}
	
	public void RemovePoint() {
		if (score != 0) {
			score--;
		}
	}
}
