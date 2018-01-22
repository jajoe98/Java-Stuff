package ex5;

public class RetailItem {
	public String description;
	public int unitsOnHand;
	public double price;
	
	//Mutators
	public void SetDescription(String descript){
		description = descript;
	}
	public void SetUnits(int units) {
		unitsOnHand = units;
	}
	public void SetPrice(double newPrice) {
		price = newPrice;
	}
	
	//Accessors
	public String GetDescription() {
		return description;
	}
	public int GetUnits() {
		return unitsOnHand;
	}
	public double GetPrice() {
		return price;
	}
}
