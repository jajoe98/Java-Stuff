package ex3;

public class RoomCarpet {
	private RoomDimension size;
	private double carpetCost;
	
	public RoomCarpet(RoomDimension dim, double cost) {
		size = dim;
		carpetCost = cost;
	}
	
	public double GetTotalCost() {
		return size.GetArea() * carpetCost;
	}
	
	public String toString() {
		return size.toString() + 
				"\nThe cost to carpet this room is: " + this.GetTotalCost();
	}
}
