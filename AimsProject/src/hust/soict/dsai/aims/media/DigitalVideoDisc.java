package hust.soict.dsai.aims.media;
import java.time.LocalDate;

public class DigitalVideoDisc extends Disc implements Playable {

	
	private String director;
	private int length;

	private LocalDate dateAdded = LocalDate.now();

	private static int nbDigitalVideoDiscs = 0;
	
	public DigitalVideoDisc(String title) {
		this.title = title;
		nbDigitalVideoDiscs++;
		id = nbDigitalVideoDiscs;
	}
	public DigitalVideoDisc(String title, String category, float cost) {
		this(title);
		this.category = category;
		this.cost = cost;
	}
	public DigitalVideoDisc(String title, String category, String director, float cost) {
		this(title,category,cost);
		this.director = director;
	}
	public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
		this(title,category,director,cost);
		this.length = length;
	}
	
	//return string of dvd
	public String toString() {
		return "DVD-"+title+"-"+category+"-"+director+"-"+length+":"+cost;
	}
	
	//implement playable
	public void play() {
		System.out.println("Playing DVD: " + this.getTitle());
		System.out.println("DVD length: " + this.getLength());
	}
	




	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}


	
	public LocalDate getDateAdded() {
		return dateAdded;
	}
	public void setDateAdded(LocalDate dateAdded) {
		this.dateAdded = dateAdded;
	}

	
	//find out if the corresponding disk of the current object contains any token of title
	public boolean isMatch(String title) {
		String[] arr_string = title.split(" ");
		for (String element: arr_string) {
			if (getTitle().equals(element)) {
				return true;
			}
		}
		return false;
	}
}
	
		

		

	