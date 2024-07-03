package library.model;

import java.util.ArrayList;
import java.util.List;

public class Library {
   private  List<Book> books;

    public Library() {
        this.books = new ArrayList<>();
    }

    public boolean addBook(Book book) {
       if (book != null) {
		books.add(book);
		return true;
	}
       return false;
    }

    public List<Book> getBooks() {
        return books;
    }

    public Book deleteBook(String id) {
    	if (!books.isEmpty()) {

            for (Book book : books) {
                if (book.getId().equals(id)) {
                    books.remove(book);
                }
                return book;
            }
    	
        }
    	return null;
    }
    public Book searchById(String id) {
        for (Book book : books) {
            if (book.getId().equals(id)) {
                return book;
            }
        }
        return null;
    }
    public List<Book> searchByAuthor(String author) {
        List<Book> result = new ArrayList<>();
        for (Book book : books) {
            if (book.getAuthor().equalsIgnoreCase(author)) {
                result.add(book);
            }
        }
        return result;
    }
    public List<Book> searchByTitle(String title) {
        List<Book> result = new ArrayList<>();
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                result.add(book);
            }
        }
        return result;
    }
    
    public boolean updateById(String id, String newTitle, String newAuthor) {
        Book book = searchById(id);
        if (book != null) {
            book.setTitle(newTitle);
            book.setAuthor(newAuthor);
            return true;
        }
        return false;
    }

    public boolean updateByAuthor(String oldAuthor, String newTitle, String newAuthor) {
        List<Book> booksByAuthor = searchByAuthor(oldAuthor);
        if (!booksByAuthor.isEmpty()) {
            for (Book book : booksByAuthor) {
                book.setTitle(newTitle);
                book.setAuthor(newAuthor);
            }
            return true;
        }
        return false;
    }

    public boolean updateByTitle(String oldTitle, String newTitle, String newAuthor) {
        List<Book> booksByTitle = searchByTitle(oldTitle);
        if (!booksByTitle.isEmpty()) {
            for (Book book : booksByTitle) {
                book.setTitle(newTitle);
                book.setAuthor(newAuthor);
            }
            return true;
        }
        return false;
    }
    
    
}



