The Library Management System is a simple Java application that allows users to manage a collection of books. It provides functionalities to add, display, delete, search, and update books in the library. The system follows a Model-View-Controller (MVC) design pattern to separate the concerns of data management, user interface, and application logic.

Features
Add Book: Allows users to add new books to the library.
Display Books: Displays the list of all books in the library.
Delete Book: Deletes a book from the library using the book's ID.
Search Book: Allows users to search for books by ID, author, or title.
Update Book: Allows users to update book details by ID, author, or title.

Project Structure
library.model: Contains the data model classes Book, Library, and SortByTitle.
library.view: Contains the user interface class LibraryView and the Main class to start the application.
library.controller: Contains the controller class LibraryController.
