package exam1to50;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Exam37 {

	public static class Book implements Comparator<Book> {
		String name;
		double price;

		public Book() {
		}

		public Book(String name, double price) {
			this.name = name;
			this.price = price;
		}

		public int compare(Book b1, Book b2) {
			return b1.name.compareTo(b2.name);
		}

		public String toString() {
			return name + ":" + price;
		}
	}

	public static void main(String[] args) {
		List<Book> books = Arrays.asList(new Book("Beginning with Java", 2), new Book("A Guide to Java Tour", 3));
		Collections.sort(books, new Book());
		System.out.print(books);
	}

}
