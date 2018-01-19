import javax.swing.JOptionPane;

public class EX1
{
    public static void main(String[] args)
    {
        //create and fill info for employee 1
        Employee e1 = new Employee();
        e1.SetName("Susan Meyers");
        e1.SetId(47899);
        e1.SetDepartment("Accounting");
        e1.SetPosition("Vice President");
        //create and fill info for employee 2
        Employee e2 = new Employee();
        e2.SetName("Mark Jones");
        e2.SetId(39119);
        e2.SetDepartment("IT");
        e2.SetPosition("Programmer");
        //create and fill info for employee 3
        Employee e3 = new Employee();
        e3.SetName("Joy Rogers");
        e3.SetId(81774);
        e3.SetDepartment("Manufacturing");
        e3.SetPosition("Engineer");
        
        System.out.printf("Name         ID      Department      Position\n");
        System.out.printf("---------------------------------------------\n");
        System.out.printf("%s           %d      %s              %s\n", e1.GetName(), e1.GetId(), e1.GetDepartment(), e1.GetPosition());
        System.out.printf("%s           %d      %s              %s\n", e2.GetName(), e2.GetId(), e2.GetDepartment(), e2.GetPosition());
        System.out.printf("%s           %d      %s              %s\n", e3.GetName(), e3.GetId(), e3.GetDepartment(), e3.GetPosition());
        System.exit(0);
    }
}