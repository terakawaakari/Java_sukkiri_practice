package chapter1.Practice;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Book implements Cloneable {
	private String title;
	private Date publishDate;
	private String comment;
	
	public boolean equals(Book book) {
		if (book.title.equals(title) && book.publishDate == publishDate) {
			return true;
		} else {
			return false;
		}
	}
	
	List<Book> bookList = new ArrayList<>();
	
	public int compareTo(Book book) {
		if (this.publishDate.before(book.publishDate)) {
			return -1;
		} else {
			return 1;
		}
	}
	
	public Book clone() {
		Book result = new Book();
		result.title = this.title;
		result.publishDate = this.publishDate;
		result.comment = this.comment;
		return result;
	}
	
}
