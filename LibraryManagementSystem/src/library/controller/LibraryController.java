package library.controller;

import java.util.List;

import library.model.Book;
import library.model.Library;
import library.view.LibraryView;

public class LibraryController {
    private Library model;
    private LibraryView view;

    public LibraryController(Library model, LibraryView view) {
        this.model = model;
        this.view = view;
    }

    public void start() {
        while (true) {
            int choice = view.showMenu();
            switch (choice) {
                case 1: {
                    Book newBook = view.getBookDetails();
                    if (model.addBook(newBook)) {
                        view.showSuccessMessage("Book added successfully!");
                    } else {
                        view.showSuccessMessage("Book not added");
                    }
                    break;
                }
                case 2:
                    view.displayBooks(model.getBooks());
                    break;
                case 3: {
                    String bookId = view.getBookId();
                    if (model.deleteBook(bookId) != null) {
                        view.showSuccessMessage("Book deleted successfully!");
                    } else {
                        view.showSuccessMessage("Book not deleted");
                    }
                    break;
                }
                case 4: {
                    int searchChoice = view.getSearchChoice();
                    switch (searchChoice) {
                        case 1: {
                            String id = view.getSearch("Book ID");
                            Book book = model.searchById(id);
                            if (book != null) {
                                view.displayBooks(List.of(book));
                            } else {
                                view.showSuccessMessage("Book not found");
                            }
                            break;
                        }
                        case 2: {
                            String author = view.getSearch("Author");
                            List<Book> books = model.searchByAuthor(author);
                            if (!books.isEmpty()) {
                                view.displayBooks(books);
                            } else {
                                view.showSuccessMessage("Books not found");
                            }
                            break;
                        }
                        case 3: {
                            String title = view.getSearch("Title");
                            List<Book> books = model.searchByTitle(title);
                            if (!books.isEmpty()) {
                                view.displayBooks(books);
                            } else {
                                view.showSuccessMessage("Books not found");
                            }
                            break;
                        }
                    }
                    break;
                }
                case 5: {
                    int updateChoice = view.getUpdateChoice();
                    switch (updateChoice) {
                        case 1: {
                            String id = view.getUpdate("Book ID");
                            String newTitle = view.getNewBookTitle();
                            String newAuthor = view.getNewBookAuthor();
                            if (model.updateById(id, newTitle, newAuthor)) {
                                view.showSuccessMessage("Book updated successfully!");
                            } else {
                                view.showSuccessMessage("Book not updated");
                            }
                            break;
                        }
                        case 2: {
                            String oldAuthor = view.getUpdate("Author");
                            String newTitle = view.getNewBookTitle();
                            String newAuthor = view.getNewBookAuthor();
                            if (model.updateByAuthor(oldAuthor, newTitle, newAuthor)) {
                                view.showSuccessMessage("Books updated successfully!");
                            } else {
                                view.showSuccessMessage("Books not updated");
                            }
                            break;
                        }
                        case 3: {
                            String oldTitle = view.getUpdate("Title");
                            String newTitle = view.getNewBookTitle();
                            String newAuthor = view.getNewBookAuthor();
                            if (model.updateByTitle(oldTitle, newTitle, newAuthor)) {
                                view.showSuccessMessage("Books updated successfully!");
                            } else {
                                view.showSuccessMessage("Books not updated");
                            }
                            break;
                        }
                    }
                    break;
                }
                case 6:
                    return;
                default:
                    view.showSuccessMessage("Invalid choice, please try again.");
                    break;
            }
        }
    }
}
