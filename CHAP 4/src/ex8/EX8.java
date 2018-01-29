package ex8;

public class EX8 {

	public static void main(String[] args) {
		Race race1 = new Race("Bob", 20, "Jim", 60, "Swoop", 22);
		System.out.printf("First: %s\nSecond: %s\nThird: %s", race1.GetFirst(), race1.GetSecond(), race1.GetThird());
	}

}
