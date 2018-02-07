package ex6;

public class Employee {
	//initializers
    private String name;
    private int idNumber;
    private String department;
    private String position;
    
    //Constructors
    public Employee(String name, int idNumber, String department, String position) {
    	this.name = name;
    	this.idNumber = idNumber;
    	this.department = department;
    	this.position = position;
    }
    public Employee(String name, int idNumber) {
    	this.name = name;
    	this.idNumber = idNumber;
    	this.department = "";
    	this.position = "";
    }
    public Employee() {
    	name = "";
    	idNumber = 0;
    	department = "";
    	position = "";
    }
    
    //mutators
    public void SetName(String newName)
    {
        name = newName;
    }
    
    public void SetId(int id)
    {
        idNumber = id;
    }
    
    public void SetDepartment(String newDepartment)
    {
        department = newDepartment;
    }
    
    public void SetPosition(String newPosition)
    {
        position = newPosition;
    }
    
    //accessors
    public String GetName()
    {
        return name;
    }
    
    public int GetId()
    {
        return idNumber;
    }
    
    public String GetDepartment()
    {
        return department;
    }
    
    public String GetPosition()
    {
        return position;
    }
}
