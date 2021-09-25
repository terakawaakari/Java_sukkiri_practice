package chapter1.Practice;

import java.util.Date;
import java.util.Objects;

public class Book implements Cloneable {
	private String title;
	private Date publishDate;
	private String comment;

	public String getTitle() {
		return this.title;
	}

	public int hashCode() {
		return Objects.hash(this.title, this.publishDate, this.comment);
	}

	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null) return false;
		if (!(o instanceof Book)) return false;
		Book b = (Book) o;
		if (this.title.trim().equals(b.title.trim()) && this.publishDate.equals(b.publishDate)) {
			return true;
		}
		return false;

	}

	public int compareTo(Book book) {
		return this.publishDate.compareTo(book.publishDate);
	}

	public Book clone() {
		Book result = new Book();
		result.title = this.title;
		result.publishDate = (Date) this.publishDate.clone();
		result.comment = this.comment;
		return result;
	}

}
