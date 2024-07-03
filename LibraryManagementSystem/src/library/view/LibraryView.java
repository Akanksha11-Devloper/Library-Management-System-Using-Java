package library.view;

import java.util.List;
import java.util.Scanner;

import library.model.Book;

public class LibraryView {
    private Scanner scanner;

    public LibraryView() {
        this.scanner = new Scanner(System.in);
    }

    public int showMenu() {
        System.out.println("1. Add Book");
        System.out.println("2. Display Books");
        System.out.println("3. Delete Book");
        System.out.println("4. Search Book");
        System.out.println("5. Update Book");
        System.out.println("6. Exit");
        System.out.print("Enter choice: ");
        return scanner.nextInt();
    }

    public Book getBookDetails() {
        scanner.nextLine();
        System.out.print("Enter Book ID: ");
        String id = scanner.nextLine();
        System.out.print("Enter Book Title: ");
        String title = scanner.nextLine();
        System.out.print("Enter Book Author: ");
        String author = scanner.nextLine();
        return new Book(id, title, author);
    }

    public void displayBooks(List<Book> books) {
        if (books.isEmpty()) {
            System.out.println("Books are not available");
            return;
        }
        for (Book book : books) {
            System.out.println(book);
        }
    }

    public String getBookId() {
        System.out.print("Enter Book ID to delete: ");
        return scanner.next();
    }

    public String getSearch(String data) {
        scanner.nextLine();
        System.out.print("Enter " + data + ": ");
        return scanner.nextLine();
    }

    public String getUpdate(String data) {
        scanner.nextLine();
        System.out.print("Enter current " + data + ": ");
        return scanner.nextLine();
    }

    public String getNewBookTitle() {
        System.out.print("Enter new Book Title: ");
        return scanner.nextLine();
    }

    public String getNewBookAuthor() {
        System.out.print("Enter new Book Author: ");
        return scanner.nextLine();
    }

    public void showSuccessMessage(String message) {
        System.out.println(message);
    }

    public int getSearchChoice() {
        System.out.println("1. Search by ID");
        System.out.println("2. Search by Author");
        System.out.println("3. Search by Title");
        System.out.print("Enter choice: ");
        return scanner.nextInt();
    }

    public int getUpdateChoice() {
        System.out.println("1. Update by ID");
        System.out.println("2. Update by Author");
        System.out.println("3. Update by Title");
        System.out.print("Enter choice: ");
        return scanner.nextInt();
    }
}
