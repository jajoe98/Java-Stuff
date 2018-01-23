package ex11;

public class Procedure {
	public String name;
	public String date;
	public String practitioner;
	public double charges;
	
	public Procedure(String newName, String newDate, String pract, double charge) {
		name = newName;
		date = newDate;
		practitioner = pract;
		charges = charge;
	}
	
	//Mutators
	public void SetName(String newName) {
		name = newName;
	}
	public void SetDate(String newDate) {
		date = newDate;
	}
	public void SetPractitioner(String pract) {
		practitioner = pract;
	}
	public void SetCharges(double charge) {
		charges = charge;
	}
	
	//accessors
	public String GetName() {
		return name;
	}
	public String GetDate() {
		return date;
	}
	public String GetPractitioner() {
		return practitioner;
	}
	public double GetCharge() {
		return charges;
	}
}
