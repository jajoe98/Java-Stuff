package ex9;

public class Payroll {
	int id;
	double grossPay;
	double stateTax;
	double fedTax;
	double fica;
	
	public Payroll(int id, double grossPay, double stateTax, double fedTax, double fica) {
		super();
		this.id = id;
		this.grossPay = grossPay;
		this.stateTax = stateTax;
		this.fedTax = fedTax;
		this.fica = fica;
	}

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
