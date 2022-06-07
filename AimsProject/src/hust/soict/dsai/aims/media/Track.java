package hust.soict.dsai.aims.media;

public class Track implements Playable {
	private String title;
	private int length;

	public Track() {
		// TODO Auto-generated constructor stub
	}
	
	//implement playable
	public void play() {
		System.out.println("Playing DVD: " + this.getTitle());
		System.out.println("DVD Length: " + this.getLength());
	}

	public String getTitle() {
		return title;
	}

	public int getLength() {
		return length;
	}

}
