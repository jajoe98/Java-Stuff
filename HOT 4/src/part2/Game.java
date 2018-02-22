package part2;

public class Game {
	
	private String gameName;//the games name
	private int players;//the number of players
	
	//constructor
	public Game(String name, int players) {
		gameName = name;
		this.players = players;
	}
	
	//getters
	public String getGameName() {
		return gameName;
	}
	public int getPlayers() {
		return players;
	}
	//setters
	public void setGameName(String gameName) {
		this.gameName = gameName;
	}
	public void setPlayers(int players) {
		this.players = players;
	}
	
	//tostring method that prints the game name and number of players
	public String toString() {
		return String.format("Game name: %s\n"
							+ "number of players: %d\n", gameName, players);
	}
}
