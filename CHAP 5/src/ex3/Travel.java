package ex3;

public class Travel {
	private int _speed;
	private int _time;
	
	public Travel(int speed, int time) {
		_speed = speed;
		_time = time;
	}
	
	public int GetTime() {
		return _time;
	}
	
	public int GetSpeed() {
		return _speed;
	}
	
	public int GetDistance() {
		return _speed * _time;
	}
}
