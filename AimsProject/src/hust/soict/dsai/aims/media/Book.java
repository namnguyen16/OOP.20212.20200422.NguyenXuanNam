package hust.soict.dsai.aims.media;
import java.util.*;

public class Book extends Media {
	
	private List<String> authors = new ArrayList<String>();

	public Book() {
		// TODO Auto-generated constructor stub
		
	}
	

	public void addAuthor(String authorname) {
		boolean check = false;
		for (String check_authorname: authors) {
			if (check_authorname == authorname) {
				System.out.println("That author has already been!");
				check = true;
			}
		}
		if (check == false) {
			System.out.println("That author has added!");
			authors.add(authorname);
		}
	}
	

	public void removeAuthor(String authorname) {
		boolean check = false;
		for (String check_authorname: authors) {
			if (check_authorname == authorname){
				System.out.println("That author has removed!");
				check = true;
			}
		}
		if (check = true) {
			authors.remove(authorname);
		}
		else {
			System.out.println("That author is not exist!");
		}
	}


}
