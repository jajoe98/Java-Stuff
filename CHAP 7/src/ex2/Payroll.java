package ex2;

public class Payroll {
	private int[] employeeId = {5658845, 4520125, 7895122, 8777541, 8451277, 1302850, 7580489};
	private int[] hours = new int[7];
	private double[] payRate = new double[7];
	private double[] wages = new double[7];
	
	public int[] getEmployeeId() {
		return employeeId;
	}
	public int[] getHours() {
		return hours;
	}
	public void setHours(int[] hours) {
		for(int i = 0; i < this.hours.length; i++) {
			this.hours[i] = hours[i];
		}
	}
	public double[] getPayRate() {
		return payRate;
	}
	public void setPayRate(double[] payRate) {
		for(int i = 0; i < this.payRate.length; i++) {
			this.payRate[i] = payRate[i];
		}
	}
	public double[] getWages() {
		return wages;
	}
	public void setWages() {
		
		for(int i = 0; i < employeeId.length; i++) {
			wages[i] = payRate[i] * hours[i];
		}
	}
	
	
}
