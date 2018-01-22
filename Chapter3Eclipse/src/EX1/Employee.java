package EX1;

public class Employee {
	//initializers
    public String name;
    public int idNumber;
    public String department;
    public String position;
    
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
