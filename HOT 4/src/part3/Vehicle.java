package part3;

public class Vehicle {
	protected int speed;
	
	public Vehicle() {
		speed = 0;
	}
	
	public int GetSpeed() {
		return speed;
	}
	
	public void Accelerate() {
		speed += 5;
	}
}
