package ex6;

public class Payroll {
	//initializers
	public String name;
	public int id;
	public double hourlyPay;
	public int hoursWorked;
	
	//constructor
	public Payroll(String newName, int newID) {
		name = newName;
		id = newID;
	}
	
	//Mutators
	public void setHourlyPay(double pay) {
		hourlyPay = pay;
	}
	public void SetHoursWorked(int hours) {
		hoursWorked = hours;
	}
	
	//accessors
	public String GetName() {
		return name;
	}
	public int GetID() {
		return id;
	}
	public double GetHourlyPay() {
		return hourlyPay;
	}
	public int GetHoursWorked() {
		return hoursWorked;
	}
	
	//other methods
	public double CalcGrossPay() {
		return hoursWorked * hourlyPay;
	}
}
