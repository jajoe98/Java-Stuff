package library;

public class LibraryDriver {

	public static void main(String[] args) {
		Book book = new Book("vroom vroom", "today", "swoop");
		Library library = new Library("library of swoop", book);
		
		System.out.println(library);
	}

}
