import javax.swing.JOptionPane;

public class EX3
{
    public static void main(String[] args)
    {
        Person notJacob = new Person();
        Person jim = new Person();
        Person bobRoss = new Person();
        
        notJacob.SetName("Not Jacob");
        jim.SetName("Jim Guy");
        bobRoss.SetName("Bob Ross");
        
        notJacob.SetAddress("024 Swoop Str.");
        jim.SetAddress("025 Swoop Str.");
        bobRoss.SetAddress("420 Swoop Blvd.");
        
        notJacob.SetAge(20);
        jim.SetAge(31);
        bobRoss.SetAge(73);
        
        notJacob.SetPhoneNum("1-800-877-CASHNOW");
        jim.SetPhoneNum("1-234-5678");
        bobRoss.SetPhoneNum("262-7677");
        
        System.out.printf("%s, %s, %d, %s\n", notJacob.GetName(), notJacob.GetAddress(), notJacob.GetAge(), notJacob.GetPhoneNum());
        System.out.printf("%s, %s, %d, %s\n", jim.GetName(), jim.GetAddress(), jim.GetAge(), jim.GetPhoneNum());
        System.out.printf("%s, %s, %d, %s\n", bobRoss.GetName(), bobRoss.GetAddress(), bobRoss.GetAge(), bobRoss.GetPhoneNum());
        System.exit(0);
    }
}