package ex10;

public class Pet {
	public String name;
	public String type;
	public int age;
	
	public void SetName(String newName) {
		name = newName;
	}
	public void SetType(String newType) {
		type = newType;
	}
	public void SetAge(int newAge) {
		age = newAge;
	}
	
	public String GetName() {
		return name;
	}
	public String GetType() {
		return type;
	}
	public int GetAge() {
		return age;
	}
}
