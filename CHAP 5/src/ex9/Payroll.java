package ex9;

public class Payroll {
	private int id;
	private double grossPay;
	private double stateTax;
	private double fedTax;
	private double fica;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getGrossPay() {
		return grossPay;
	}

	public void setGrossPay(double grossPay) {
		this.grossPay = grossPay;
	}

	public double getStateTax() {
		return stateTax;
	}

	public void setStateTax(double stateTax) {
		this.stateTax = stateTax;
	}

	public double getFedTax() {
		return fedTax;
	}

	public void setFedTax(double fedTax) {
		this.fedTax = fedTax;
	}

	public double getFica() {
		return fica;
	}

	public void setFica(double fica) {
		this.fica = fica;
	}
	
	public double GetNetPay() {
		return grossPay - stateTax - fedTax - fica;
	}
}
