package chapter5.practice;

import org.apache.commons.lang3.builder.CompareToBuilder;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

public class Book implements Comparable<Book>, Cloneable {
//	private String title;
//	private Date oyblishDate;
//	private String comment;

	public boolean equals(Object o) {
		return EqualsBuilder.reflectionEquals(this, o);
	}

	public int hashCode() {
		return HashCodeBuilder.reflectionHashCode(this);
	}

	public int compareTo(Book o) {
		return CompareToBuilder.reflectionCompare(this, o, "title");
	}
}
