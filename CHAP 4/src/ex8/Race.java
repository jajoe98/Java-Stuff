package ex8;

public class Race {
	public String runner1;
	public int time1;
	public String runner2;
	public int time2;
	public String runner3;
	public int time3;
	
	public Race(String runner1, int time1, String runner2, int time2, String runner3, int time3) {
		super();
		this.runner1 = runner1;
		this.time1 = time1;
		this.runner2 = runner2;
		this.time2 = time2;
		this.runner3 = runner3;
		this.time3 = time3;
	}
	
	public String GetFirst() {
		String result = "";
		if(time1 < time2 && time1 < time3) {
			result = runner1;
		}
		else if(time2 < time1 && time2 < time3) {
			result = runner2;
		}
		else if(time3 < time1 && time3 < time2) {
			result = runner3;
		}
		return result;
	}
	
	public String GetSecond() {
		String result = "";
		if((time1 > time2 && time1 < time3) || (time1 < time2 && time1 > time3)) {
			result = runner1;
		}
		else if((time2 > time1 && time2 < time3) || (time2 < time1 && time2 > time3)) {
			result = runner2;
		}
		else if((time3 > time1 && time3 < time2) || (time3 < time1 && time3 > time2)) {
			result = runner3;
		}
		return result;
	}
	
	public String GetThird() {
		String result = "";
		if(time1 > time2 && time1 > time3) {
			result = runner1;
		}
		else if(time2 > time1 && time2 > time3) {
			result = runner2;
		}
		else if(time3 > time1 && time3 > time2) {
			result = runner3;
		}
		return result;
	}
}
