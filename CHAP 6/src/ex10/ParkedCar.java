package ex10;

public class ParkedCar {
	private String make;
	private String model;
	private String color;
	private int licenseNum;
	private int minutesParked;
	
	public ParkedCar(String make, String model, String color, int licenseNum, int minutesParked) {
		super();
		this.make = make;
		this.model = model;
		this.color = color;
		this.licenseNum = licenseNum;
		this.minutesParked = minutesParked;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getLicenseNum() {
		return licenseNum;
	}

	public void setLicenseNum(int licenseNum) {
		this.licenseNum = licenseNum;
	}

	public int getMinutesParked() {
		return minutesParked;
	}

	public void setMinutesParked(int minutesParked) {
		this.minutesParked = minutesParked;
	}
	
	
}
