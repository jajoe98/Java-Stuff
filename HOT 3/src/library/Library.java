package library;

public class Library {
	private String name;
	private Book book;
	
	public Library(String name, Book book) {
		super();
		this.name = name;
		this.book = book;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}
	
	public String toString() {
		return String.format("Library: %s\nbook name: %s\npublish date: %s\nauthor: %s", name, book.getName(), book.getPublishDate(), book.getAuthor());
		
	}
}
