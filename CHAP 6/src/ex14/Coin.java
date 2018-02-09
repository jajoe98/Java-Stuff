package ex14;

import java.util.Random;

public class Coin {
	private String sideUp;
	
	public Coin() {
		Toss();
	}
	
	public void Toss() {
		Random rand = new Random();
		int side = rand.nextInt(2);
		if(side == 0) {
			sideUp = "heads";
		}else {
			sideUp = "tails";
		}
	}
	
	public String GetSideUp() {
		return sideUp;
	}
}
