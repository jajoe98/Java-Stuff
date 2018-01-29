package ex10;

public class Liquid {
	public int temperature;

	public Liquid(int temperature) {
		this.temperature = temperature;
	}

	public int getTemperature() {
		return temperature;
	}

	public void setTemperature(int temperature) {
		this.temperature = temperature;
	}

	public boolean IsEthyFreezing() {
		if(temperature < -173) {
			return true;
		}
		return false;
	}
	public boolean IsEthyBoiling() {
		if(temperature > 172) {
			return true;
		}
		return false;
	}
	public boolean IsOxygenFreezing() {
		if(temperature < -362) {
			return true;
		}
		return false;
	}
	public boolean IsOxygenBoiling() {
		if(temperature > -306) {
			return true;
		}
		return false;
	}
	public boolean IsWaterFreezing() {
		if(temperature < 32) {
			return true;
		}
		return false;
	}
	public boolean IsWaterBoiling() {
		if(temperature > 212) {
			return true;
		}
		return false;
	}
}
