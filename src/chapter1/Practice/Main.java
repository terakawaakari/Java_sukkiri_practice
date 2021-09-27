package chapter1.practice;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) throws ParseException {

		Book java = new Book();
		Book python = new Book();
		Book c = new Book();

		java.set("Java入門", "2011/10/07", "スッキリわかる");
		python.set("Python入門", "2019/06/11", "カレーが食べたくなる");
		c.set("C言語入門", "2018/06/21", "ポインタも自由自在");

		List<Book> books = new ArrayList<>();

		books.add(java);
		books.add(python);
		books.add(c);

		books.sort(new TitleComparator());
		
		for (Book book: books) {
			System.out.println(book.getTitle());
		}
	}
}
