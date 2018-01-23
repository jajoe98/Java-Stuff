package ex10;
import javax.swing.JOptionPane;

public class EX10 {

	public static void main(String[] args) {
		Pet pet = new Pet();
		pet.SetName(JOptionPane.showInputDialog("Enter name of pet"));
		pet.SetType(JOptionPane.showInputDialog("Enter pets species"));
		String ageString = JOptionPane.showInputDialog("Enter age of pet");
		pet.SetAge(Integer.parseInt(ageString));
		
		System.out.printf("Name: %s\nType: %s\nAge: %d", pet.GetName(), pet.GetType(), pet.GetAge());
		System.exit(0);
	}

}
