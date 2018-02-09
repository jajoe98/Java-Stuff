package ex12;

public class FuelGauge {
	public final int MAX_GALLONS = 15;
	private int gallons;
	
	public FuelGauge() {
		gallons = 0;
	}
	
	public FuelGauge(int g) {
		gallons = g;
	}
	
	public int GetGallons() {
		return gallons;
	}
	
	public void IncrementGallons() {
		if(gallons < MAX_GALLONS) {
			gallons++;
		}
	}
	
	public void DecrementGallons() {
		if(gallons > 0) {
			gallons--;
		}
	}
}
