package overloadStatics;

public class Hot3 {
	public static void WriteSomething(String one, String two) {
		System.out.println(one + " " + two);
	}
	public static void WriteSomething(String one, String two, String three) {
		System.out.println(one + " " + two + " " + three);
	}
	
}
