package ex6;

public class EX6 {

	public static void main(String[] args) {
		ShippingCharges delivery1 = new ShippingCharges(8, 1000);
		System.out.printf("a package weighing %dkg being delivered %d miles costs $%.2f", delivery1.getPackageWeight(), delivery1.getMilesShipped(), delivery1.calcShipping());
	}

}
