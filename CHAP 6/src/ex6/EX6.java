package ex6;

public class EX6 {

	public static void main(String[] args) {
		Employee e1 = new Employee();
		Employee e2 = new Employee("Bob Ross", 1234, "Art", "President");
		Employee e3 = new Employee("Swoop", 42);
		
		System.out.printf("    Name|        ID|     Department| Position\n");
        System.out.printf("---------------------------------------------\n");
        System.out.printf("%8s      %4d		%6s		%8s\n", e1.GetName(), e1.GetId(), e1.GetDepartment(), e1.GetPosition());
        System.out.printf("%8s      %4d     %6s		%8s\n", e2.GetName(), e2.GetId(), e2.GetDepartment(), e2.GetPosition());
        System.out.printf("%8s		%4d     %6s		%8s\n", e3.GetName(), e3.GetId(), e3.GetDepartment(), e3.GetPosition());
	}

}
