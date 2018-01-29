package ex6;

public class ShippingCharges {
	public int packageWeight;
	public int milesShipped;
	
	public ShippingCharges(int weight, int miles) {
		packageWeight = weight;
		milesShipped = miles;
	}
	
	
	
	public int getPackageWeight() {
		return packageWeight;
	}



	public void setPackageWeight(int packageWeight) {
		this.packageWeight = packageWeight;
	}



	public int getMilesShipped() {
		return milesShipped;
	}



	public void setMilesShipped(int milesShipped) {
		this.milesShipped = milesShipped;
	}



	public double calcShipping() {
		double priceRate;
		
		if(packageWeight > 10) {
			priceRate = 4.80;
		}
		else if(packageWeight > 6) {
			priceRate = 3.70;
		}
		else if(packageWeight > 2) {
			priceRate = 2.20;
		}
		else {
			priceRate = 1.10;
		}
		
		return (milesShipped / 500) * priceRate;
	}
}
