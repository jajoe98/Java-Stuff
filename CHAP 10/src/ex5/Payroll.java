package ex5;

public class Payroll {
	//initializers
	public String name;
	public int id;
	public double hourlyPay;
	public int hoursWorked;
	
	//constructor
	public Payroll(String name, int id, int hours, double pay) throws Exception {
		
		if(name == "") {
			throw new InvalidNameException();
		}
		if(id <= 0) {
			throw new InvalidIdException();
		}
		if(hours < 0 || hours > 84) {
			throw new InvalidHoursException();
		}
		if(pay < 0 || pay > 25) {
			throw new InvalidPayException();
		}
		
		
		
		this.name = name;
		this.id = id;
		hoursWorked = hours;
		hourlyPay = pay;
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
	
	public String toString() {
		return String.format( "Name %s\n"
							+ "ID: %d\n"
							+ "hours: %d\n"
							+ "Pay: $%,.2f\n"
							+ "Gross pay: $%,.2f\n", name, id, hoursWorked, hourlyPay, this.CalcGrossPay());
	}
}
