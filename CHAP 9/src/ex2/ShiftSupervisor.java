package ex2;

public class ShiftSupervisor extends ex1.Employee {
	private double salary;
	private double bonus;
	
	public ShiftSupervisor(String n, String num, String date, double sal, double b) {
		super(n, num, date);
		salary = sal;
		bonus = b;
	}
	
	public ShiftSupervisor() {
		super();
		salary = 0;
		bonus = 0;
	}

	public double getSalary() {
		return salary;
	}

	public double getBonus() {
		return bonus;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	
	public String toString() {
		return String.format( super.toString()
							+ "Salary: $%,.2f\n"
							+ "Bonus: $%,.2f\n", salary, bonus);
	}
}
