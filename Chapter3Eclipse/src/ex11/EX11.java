package ex11;

public class EX11 {

	public static void main(String[] args) {
		Patient bob = new Patient("Bob", "Norman", "Ross",
				"42coolstreet", "Neato Town", "State",
				"12345", "123-456-7890", "Jim the guy", 
				"333-333-3333");
		Procedure proc1 = new Procedure("Physical Exam", "1/23/18", "Dr.Irvine", 250.00);
		Procedure proc2 = new Procedure("X-ray", "1/23/18", "Dr.Jamison", 500.00);
		Procedure proc3 = new Procedure("Blood Test", "1/23/18", "Dr.Smith", 200.00);

		System.out.printf("PATIENT INFO\n");
		System.out.printf("--------------------------\n");
		System.out.printf("Name: %s %s %s\n",bob.GetFirstName(), bob.GetMiddleName(), bob.GetLastName());
		System.out.printf("Address: %s %s, %s %s\n", bob.GetStreetAddress(), bob.GetCity(), bob.GetState(), bob.GetZip());
		System.out.printf("Phone number: %s\n", bob.GetPhoneNumber());
		System.out.printf("--------------------------\n");
		System.out.printf("EMERGENCY CONTACT INFO\n");
		System.out.printf("--------------------------\n");
		System.out.printf("Name: %s\n", bob.GetEmergencyName());
		System.out.printf("Phone: %s\n", bob.GetEmergencyNumber());
		System.out.printf("--------------------------\n");
		System.out.printf("\n");
		System.out.printf("PROCEDURE 1\n");
		System.out.printf("--------------------------\n");
		System.out.printf("Procedure: %s\n", proc1.GetName());
		System.out.printf("Date: %s\n", proc1.GetDate());
		System.out.printf("Practitioner: %s\n", proc1.GetPractitioner());
		System.out.printf("Charge for procedure: %.2f\n",proc1.GetCharge());
		System.out.printf("--------------------------\n");
		System.out.printf("PROCEDURE 2\n");
		System.out.printf("--------------------------\n");
		System.out.printf("Procedure: %s\n", proc2.GetName());
		System.out.printf("Date: %s\n", proc2.GetDate());
		System.out.printf("Practitioner: %s\n", proc2.GetPractitioner());
		System.out.printf("Charge for procedure: %.2f\n",proc2.GetCharge());
		System.out.printf("--------------------------\n");
		System.out.printf("PROCEDURE 3\n");
		System.out.printf("--------------------------\n");
		System.out.printf("Procedure: %s\n", proc3.GetName());
		System.out.printf("Date: %s\n", proc3.GetDate());
		System.out.printf("Practitioner: %s\n", proc3.GetPractitioner());
		System.out.printf("Charge for procedure: %.2f\n",proc3.GetCharge());
		System.out.printf("--------------------------\n");
	}

}
