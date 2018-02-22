package part2;

public class GameWithTimeLimit extends Game {
	private int timeLimit;//the time limit in minutes
	
	//constructor
	public GameWithTimeLimit(String name, int players, int time) {
		super(name, players);
		timeLimit = time;
	}
	
	//getter
	public int getTimeLimit() {
		return timeLimit;
	}
	//setter
	public void setTimeLimit(int timeLimit) {
		this.timeLimit = timeLimit;
	}
	
	//tostring override that calls the superclass's tostring method and adds the time limit
	public String toString() {
		return String.format(super.toString()
							+ "Time limit: %d minutes\n", timeLimit);
	}
}
