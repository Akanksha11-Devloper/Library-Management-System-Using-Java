package library.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;



public class Main {
	
	
	public static void main(String[] args) {
		List<Book> books = new ArrayList<>();
		books.add(new Book("sf1s", "Ikigai", "xyz"));
		books.add(new Book("sds0", "habits", "ska"));
		books.add(new Book("ahs9", "Maths", "nnb"));
		books.add(new Book("bds8", "Social sci", "we"));
		books.add(new Book("uif7", "Ikigai23", "nn"));
		books.add(new Book("bds3", "Abc", "asd"));
		books.add(new Book("bbs11", "Gai", "odc"));
		books.add(new Book("khg1", "Factorial", "abc"));
		
		

		
		Collections.sort(books, new SortByTitle());
		books.forEach(System.out::println);
	}
	
}

