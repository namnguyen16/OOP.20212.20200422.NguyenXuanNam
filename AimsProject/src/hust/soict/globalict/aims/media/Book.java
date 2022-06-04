package hust.soict.globalict.aims.media;

import java.util.ArrayList;
import java.util.List;

public class Book {
	private List<String> authors = new ArrayList<String>();
	
	public Book() {
	}
	public void addAuthor(String authorName) {
		String result ="";
		if (authors.contains(authorName)) {
			result = "the author is added before";
		}
		else {
			authors.add(authorName);
			result = "the author has been added.";
		}
	}
	
	public void removeAuthor(String authorName) {
		if (authors.contains(authorName)) {
			authors.remove(authorName);
		}
	}
	
	
}
