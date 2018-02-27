package ex4;

public class Month {
	private int monthNumber;
	
	public Month() {
		monthNumber = 1;
	}
	
	public Month(int month) throws InvalidMonthNumException {
		if(month < 1 || month > 12) {
			throw new InvalidMonthNumException();
		}
		else {
			monthNumber = month;
		}
	}
	
	public Month(String month) throws InvalidMonthNameException {
		if(month.equalsIgnoreCase("January")) {
			monthNumber = 1;
		}
		else if(month.equalsIgnoreCase("Febuary")) {
			monthNumber = 2;
		}
		else if(month.equalsIgnoreCase("March")) {
			monthNumber = 3;
		}
		else if(month.equalsIgnoreCase("April")) {
			monthNumber = 4;
		}
		else if(month.equalsIgnoreCase("May")) {
			monthNumber = 5;
		}
		else if(month.equalsIgnoreCase("June")) {
			monthNumber = 6;
		}
		else if(month.equalsIgnoreCase("July")) {
			monthNumber = 7;
		}
		else if(month.equalsIgnoreCase("August")) {
			monthNumber = 8;
		}
		else if(month.equalsIgnoreCase("September")) {
			monthNumber = 9;
		}
		else if(month.equalsIgnoreCase("October")) {
			monthNumber = 10;
		}
		else if(month.equalsIgnoreCase("November")) {
			monthNumber = 11;
		}
		else if(month.equalsIgnoreCase("December")) {
			monthNumber = 12;
		}
		else {
			throw new InvalidMonthNameException();
		}
	}

	public int GetMonthNumber() {
		return monthNumber;
	}

	public void SetMonthNumber(int monthNumber) {
		if(monthNumber < 1 || monthNumber > 12) {
			monthNumber = 1;
		}
		else {
			this.monthNumber = monthNumber;
		}
	}
	
	public String GetMonthName() {
		switch(monthNumber) {
		case 1:
			return "January";
		case 2:
			return "Febuary";
		case 3:
			return "March";
		case 4:
			return "April";
		case 5:
			return "May";
		case 6:
			return "June";
		case 7:
			return "July";
		case 8:
			return "August";
		case 9:
			return "September";
		case 10:
			return "October";
		case 11:
			return "November";
		case 12:
			return "December";
		default:
			return "";
		}
	}
	
	public String toString() {
		return this.GetMonthName();
	}
	
	public boolean equals(Month month) {
		if(this.GetMonthNumber() == month.GetMonthNumber()) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean greaterThan(Month month) {
		if(this.GetMonthNumber() > month.GetMonthNumber()) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean lessThan(Month month) {
		if(this.GetMonthNumber() < month.GetMonthNumber()) {
			return true;
		}
		else {
			return false;
		}
	}
}
