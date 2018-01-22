public class Person
{
    //Initializers
    public static String name;
    public static String address;
    public static int age;
    public static String phoneNumber;
    
    //Mutators
    public void SetName(String newName)
    {
        name = newName;
    }
    
    public void SetAddress(String newAddress)
    {
        address = newAddress;
    }
    
    public void SetAge(int newAge)
    {
        age = newAge;
    }
    
    public void SetPhoneNum(String newPhoneNum)
    {
        phoneNumber = newPhoneNum;
    }
    
    //Accessors
    public String GetName()
    {
        return name;
    }
    
    public String GetAddress()
    {
        return address;
    }
    
    public int GetAge()
    {
        return age;
    }
    
    public String GetPhoneNum()
    {
        return phoneNumber;
    }
}