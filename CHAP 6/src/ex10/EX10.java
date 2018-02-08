package ex10;

public class EX10 {

	public static void main(String[] args) {
		ParkedCar car1 = new ParkedCar("fyurd", "esplodr", "pink", 12345, 182);
		ParkedCar car2 = new ParkedCar("chevur", "vroomer", "indigo", 54321, 22);
		ParkingMeter meter1 = new ParkingMeter(60);
		ParkingMeter meter2 = new ParkingMeter(40);
		PoliceOfficer officer = new PoliceOfficer("Swoop", 42);
		
		boolean legalPark1 = officer.IsParkedIllegally(car1, meter1);
		boolean legalPark2 = officer.IsParkedIllegally(car2, meter2);
		
		if(legalPark1) {
			System.out.println("Car #1 is parked illegally");
			System.out.println();
			System.out.println(officer.WriteTicket(car1, meter1));
		}
		else {
			System.out.println("Car #1 is parked legally");
		}
		System.out.println();
		if(legalPark2) {
			System.out.println("Car #2 is parked illegally");
			System.out.println();
			System.out.println(officer.WriteTicket(car2, meter2));
		}
		else {
			System.out.println("Car #2 is parked legally");
		}
		
	}

}
