package hust.soict.dsai.aims.media;

public abstract class Track implements Playable,Comparable{
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
	
	public boolean equals(Track m) {
		if (( m.getTitle() == this.title) && (m.getLength() == this.length)) {
			return true;
		}
		return false;
	}
	

	
	public String compareTo(Track obj) {
		if (this.getTitle().compareTo(obj.getTitle())>0) {
			return this.getTitle();
		}
		return obj.getTitle();
		
		
	}


}
