package ex1;

public class Employee {
	private String name;
	private String employeeNumber;
	private String hireDate;
	
	public Employee(String n, String num, String date) {
		name = n;
		employeeNumber = num;
		hireDate = date;
	}
	
	public Employee() {
		name = "";
		employeeNumber = "";
		hireDate = "";
	}

	public String getName() {
		return name;
	}

	public String getEmployeeNumber() {
		return employeeNumber;
	}

	public String getHireDate() {
		return hireDate;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setEmployeeNumber(String employeeNumber) {
		this.employeeNumber = employeeNumber;
	}

	public void setHireDate(String hireDate) {
		this.hireDate = hireDate;
	}
	
	public String toString() {
		return String.format( "Name: %s\n"
							+ "Number: %s\n"
							+ "Hire Date: %s\n", name, employeeNumber, hireDate);
	}
}
