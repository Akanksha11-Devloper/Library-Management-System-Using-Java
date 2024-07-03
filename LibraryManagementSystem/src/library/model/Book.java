package library.model;

import java.util.Comparator;

public class Book {
	private String id;
	private String title;
	private String author;
	
	public Book(String id, String title, String author) {
		this.setId(id);
		this.setTitle(title);
		this.setAuthor(author);
	}
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	@Override
	public String toString() {
		return "Book [id=" + id + ", title=" + title + ", author=" + author + "]";
	}


	
	
	 	
}
