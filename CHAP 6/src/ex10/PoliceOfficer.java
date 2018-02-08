package ex10;

public class PoliceOfficer {
	private String name;
	private int badgeNumber;
	//constructor
	public PoliceOfficer(String name, int badgeNumber) {
		super();
		this.name = name;
		this.badgeNumber = badgeNumber;
	}
	//gets/sets
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBadgeNumber() {
		return badgeNumber;
	}

	public void setBadgeNumber(int badgeNumber) {
		this.badgeNumber = badgeNumber;
	}
	//checks if a car is parked illegally
	public boolean IsParkedIllegally(ParkedCar car, ParkingMeter meter) {
		if(car.getMinutesParked() > meter.getParkingTime()) {
			return true;
		}
		else {
			return false;
		}
	}
	//writes a ticket for an illegally parked car
	public String WriteTicket(ParkedCar car, ParkingMeter meter) {
		ParkingTicket ticket = new ParkingTicket(car, meter);
		return ticket.toString();
	}
	
	//parking ticket class
	private class ParkingTicket {
		private ParkedCar car;
		private double fine;
		
		public ParkingTicket(ParkedCar car, ParkingMeter meter) {
			this.car = car;
			//if constructor is called the car is already parked illegally so fine is initialized to 25
			fine = 25.0;
			//get the amount of minutes over the limit the car has been parked
			double dif = car.getMinutesParked() - meter.getParkingTime();
			//subtract 60 from the difference since the first hour of the fine is initialized
			dif -= 60;
			//loop to add 10 to the fine for every hour or partial hour over
			while(dif > 0) {
				fine += 10;
				dif -= 60;
			}
		}
		
		public String toString() {
			String str = String.format( "PARKING VIOLATION\n" +
										"-----------------\n" +
										"MAKE: %s\n" +
										"MODEL: %s\n" +
										"COLOR: %s\n" +
										"LISCENSE#: %d\n" +
										"-----------------\n" +
										"FINE: $%,.2f\n" +
										"-----------------\n" +
										"OFFICER: %s\n" +
										"BADGE NUMBER: %d", car.getMake(), car.getModel(), car.getColor(), car.getLicenseNum(), fine, name, badgeNumber);
			
			return str;
		}
		
		
	}
}
