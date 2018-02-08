package ex13;

import java.util.Random;

public class Die {
	private int sides;
	private int value;
	
	public Die(int sides) {
		this.sides = sides;
		Roll();
	}
	
	public void Roll() {
		Random rand = new Random();
		value = rand.nextInt(sides) + 1;
	}
	
	public int GetSides() {
		return sides;
	}
	
	public int GetValue() {
		return value;
	}
}
