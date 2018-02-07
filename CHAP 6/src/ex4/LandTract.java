package ex4;

public class LandTract {
	int length;
	int width;
	
	public LandTract(int length, int width) {
		this.length = length;
		this.width = width;
	}
	
	public int GetArea() {
		return length * width;
	}
	
	public boolean equals(LandTract land) {
		if(this.GetArea() == land.GetArea()) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public String toString() {
		return "Area: " + this.GetArea();
	}
}
