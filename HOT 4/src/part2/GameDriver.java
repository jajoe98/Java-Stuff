package part2;

public class GameDriver {

	public static void main(String[] args) {
		//create both games
		Game swoop = new Game("Swoop", 4);
		GameWithTimeLimit timedSwoop = new GameWithTimeLimit("Timed Swoop", 4, 10);

		//print both gamees tostring methods
		System.out.println("game 1");
		System.out.println(swoop.toString());
		System.out.println("game 2");
		System.out.println(timedSwoop.toString());
	}

}
