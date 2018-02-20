package ex1;

public class ProductionWorker extends Employee {
	private int shift;
	private double payRate;
	public final int DAY_SHIFT = 1;
	public final int NIGHT_SHIFT = 2;
	
	public ProductionWorker(String n, String num, String date, int sh, double rate) {
		super(n, num, date);
		shift = sh;
		payRate = rate;
	}
	
	public ProductionWorker() {
		super();
		shift = 1;
		payRate = 0.00;
	}

	public int getShift() {
		return shift;
	}

	public void setShift(int shift) {
		this.shift = shift;
	}

	public double getPayRate() {
		return payRate;
	}

	public void setPayRate(double payRate) {
		this.payRate = payRate;
	}
	
	public String toString() {
		return String.format(super.toString()
							+ "Shift: %d\n"
							+ "Pay: $%,.2f\n", shift, payRate);
	}
}
