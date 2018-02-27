package ex11;

public class ProductionWorker extends Employee {
	private int shift;
	private double payRate;
	public final int DAY_SHIFT = 1;
	public final int NIGHT_SHIFT = 2;
	
	public ProductionWorker(String n, int num, String date, int sh, double rate) throws Exception {
		super(n, num, date);
		
		if(sh != 1 && sh != 2) {
			throw new InvalidShift();
		}
		if(rate < 0) {
			throw new InvalidPayRate();
		}
		shift = sh;
		payRate = rate;
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
