package library;

public class Book {
	private String name;
	private String publishDate;
	private String author;
	
	public Book() {
		name = "";
		publishDate = "";
		author = "";
	}

	public Book(String name, String publishDate, String author) {
		super();
		this.name = name;
		this.publishDate = publishDate;
		this.author = author;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPublishDate() {
		return publishDate;
	}

	public void setPublishDate(String publishDate) {
		this.publishDate = publishDate;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
}
