import javax.swing.JOptionPane;

public class EX11
{
    public static double numberOfMales;
    public static double numberOfFemales;
    public static double totalStudents;
    public static double percentMale;
    public static double percentFemale;
    public static String inputNumber;
    
    public static void main(String[] args)
    {
        inputNumber = JOptionPane.showInputDialog("enter the number of males in the class");
        numberOfMales = Double.parseDouble(inputNumber);
        
        inputNumber = JOptionPane.showInputDialog("enter the number of females in the class");
        numberOfFemales = Double.parseDouble(inputNumber);
        
        totalStudents = numberOfMales + numberOfFemales;
        
        percentMale = (numberOfMales / totalStudents) * 100;
        percentFemale = (numberOfFemales / totalStudents) * 100;
        
        System.out.printf("The class is %.1f percent male and %.1f percent female", percentMale, percentFemale);
        System.exit(0);
    }
}