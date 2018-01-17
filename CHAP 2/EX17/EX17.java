import javax.swing.JOptionPane;

public class EX17
{
    public static String name;
    public static String age;
    public static String city;
    public static String college;
    public static String profession;
    public static String animal;
    public static String petName;
    
    public static void main(String[] args)
    {
        name = JOptionPane.showInputDialog("enter a name");
        age = JOptionPane.showInputDialog("enter an age");
        city = JOptionPane.showInputDialog("enter a city");
        college = JOptionPane.showInputDialog("enter a college");
        profession = JOptionPane.showInputDialog("enter a profession");
        animal = JOptionPane.showInputDialog("enter an animal");
        petName = JOptionPane.showInputDialog("give that animal a name");
        
        System.out.printf("There once was a person named %s who lived in %s. at the age of %s, %s went to college at %s. %s graduated and went to work as a %s. Then, %s adopted a(n) %s named %s they both lived happily ever after", name, city, age, name, college, name, profession, name, animal, petName);
        System.exit(0);
    }
}