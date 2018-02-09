package ex12;

public class Odometer {
	public final int MAX_MILEAGE = 999999;
	public final int MPG = 24;
	private int mileage;
	private int setPoint = 0;
	private FuelGauge fuelGauge;
	
	public Odometer(int m, FuelGauge fg) {
		mileage = m;
		fuelGauge = fg;
	}
	
	public int getMileage() {
		return mileage;
	}

	public int getSetPoint() {
		return setPoint;
	}

	public FuelGauge getFuelGauge() {
		return fuelGauge;
	}
	
	public int getMAX_MILEAGE() {
		return MAX_MILEAGE;
	}

	public int getMPG() {
		return MPG;
	}

	public void IncrementMileage() {
		if(mileage < MAX_MILEAGE) {
			mileage++;
		}else {
			mileage = 0;
		}
		setPoint++;
		if(setPoint == MPG) {
			fuelGauge.DecrementGallons();
			setPoint = 0;
		}
	}
}
