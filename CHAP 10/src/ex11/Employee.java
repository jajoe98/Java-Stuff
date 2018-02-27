package ex11;

public class Employee {
	private String name;
	private int employeeNumber;
	private String hireDate;
	
	public Employee(String n, int num, String date) throws InvalidEmployeeNumber {
		
		if(num < 0 || num > 9999) {
			throw new InvalidEmployeeNumber();
		}
		
		name = n;
		employeeNumber = num;
		hireDate = date;
	}

	public String getName() {
		return name;
	}

	public int getEmployeeNumber() {
		return employeeNumber;
	}

	public String getHireDate() {
		return hireDate;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setEmployeeNumber(int employeeNumber) {
		this.employeeNumber = employeeNumber;
	}

	public void setHireDate(String hireDate) {
		this.hireDate = hireDate;
	}
	
	public String toString() {
		return String.format( "Name: %s\n"
							+ "Number: %d\n"
							+ "Hire Date: %s\n", name, employeeNumber, hireDate);
	}
}
