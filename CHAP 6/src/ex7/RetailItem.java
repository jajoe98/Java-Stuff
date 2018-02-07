package ex7;

public class RetailItem {
	private String description;
	private int itemNumber;
	private CostData cost;
	
	//retailitem constructor
	public RetailItem(String desc, int itemNum, double wholesale, double retail) {
		description = desc;
		itemNumber = itemNum;
		cost = new CostData(wholesale, retail);
	}
	
	//gets / sets
	public double GetWholesale() {
		return cost.wholesale;
	}
	public double GetRetail() {
		return cost.retail;
	}
	
	public void SetWholesale(double w) {
		cost.wholesale = w;
	}
	public void SetRetail(double r) {
		cost.retail = r;
	}
	
	public String toString() {
		String str = String.format("Description: %s\n" +
									"Item Number: %d\n" +
									"Wholesale Cost: $%,.2f\n" +
									"Retail Price: $%,.2f\n", description, itemNumber, cost.wholesale, cost.retail);
		return str;
	}
	
	private class CostData {
		public double wholesale, retail;
		
		//costdata constructor
		public CostData(double w, double r) {
			wholesale = w;
			retail = r;
		}
	}
}
