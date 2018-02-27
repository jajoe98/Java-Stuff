package ex3;

public class RetailItem {
	private String description;
	private int unitsOnHand;
	private double price;
	
	public RetailItem(String description, int unitsOnHand, double price) throws InvalidQuantityException, InvalidPriceException {
		
		if(unitsOnHand < 0) {
			throw new InvalidQuantityException();
		}
		if(price < 0) {
			throw new InvalidPriceException();
		}
		this.description = description;
		this.unitsOnHand = unitsOnHand;
		this.price = price;
	}
	
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
