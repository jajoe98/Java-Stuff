package ex11;

public class Patient {
	public String firstName;
	public String middleName;
	public String lastName;
	
	public String streetAddress;
	public String city;
	public String state;
	public String zip;
	
	public String phoneNumber;
	
	public String emergencyName;
	public String emergencyNumber;
	//constructor
	public Patient(String fName, String mName, String lName, String address, String patientCity, String patientState, String patientZip, String phone, String eName, String eNumber) {
		firstName = fName;
		middleName = mName;
		lastName = lName;
		streetAddress = address;
		city = patientCity;
		state = patientState;
		zip = patientZip;
		phoneNumber = phone;
		emergencyName = eName;
		emergencyNumber = eNumber;
	}
	
	//Mutators
	public void SetFirstName(String name) {
		firstName = name;
	}
	public void SetMiddleName(String name) {
		middleName = name;
	}
	public void SetLastName(String name) {
		lastName = name;
	}
	public void SetStreetAddress(String address) {
		streetAddress = address;
	}
	public void SetCity(String newCity) {
		city = newCity;
	}
	public void SetState(String newState) {
		state = newState;
	}
	public void SetZip(String newZip) {
		zip = newZip;
	}
	public void SetPhoneNumber(String phone) {
		phoneNumber = phone;
	}
	public void SetEmergencyName(String eName) {
		emergencyName = eName;
	}
	public void SetEmergencyNumber(String eNumber) {
		emergencyNumber = eNumber;
	}
	
	//Accessors
	public String GetFirstName() {
		return firstName;
	}
	public String GetMiddleName() {
		return middleName;
	}
	public String GetLastName() {
		return lastName;
	}
	public String GetStreetAddress() {
		return streetAddress;
	}
	public String GetCity() {
		return city;
	}
	public String GetState() {
		return state;
	}
	public String GetZip() {
		return zip;
	}
	public String GetPhoneNumber() {
		return phoneNumber;
	}
	public String GetEmergencyName() {
		return emergencyName;
	}
	public String GetEmergencyNumber() {
		return emergencyNumber;
	}
}
