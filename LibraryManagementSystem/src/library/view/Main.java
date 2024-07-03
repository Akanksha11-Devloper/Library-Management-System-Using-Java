package library.view;

import library.controller.LibraryController;
import library.model.Library;

public class Main {
    public static void main(String[] args) {
        Library model = new Library();
        LibraryView view = new LibraryView();
        LibraryController controller = new LibraryController(model, view);
        controller.start();
    }
}
