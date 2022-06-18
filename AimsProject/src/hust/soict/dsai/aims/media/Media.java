package hust.soict.dsai.aims.media;

import java.time.LocalDate;

public abstract class Media {                     
	protected int id;
	protected String title;
	protected String category;
	protected float cost;
	protected static int nbMedia = 0;
	protected LocalDate dateAdded = LocalDate.now();

	public Media() {
		nbMedia++;
		id = nbMedia;
	}
	
	public Media(String title) {
		this.title = title;
	}
	public Media(String title, String category, float cost) {
		this(title);
		this.category = category;
		this.cost = cost;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public float getCost() {
		return cost;
	}

	public void setCost(float cost) {
		this.cost = cost;
	}

	public LocalDate getDateAdded() {
		return dateAdded;
	}

	public void setDateAdded(LocalDate dateAdded) {
		this.dateAdded = dateAdded;
	}

	public int getId() {
		return id;
	}
	
	public boolean isMatch(String title) {
		String[] arr_string = title.split(" ");
		for (String element: arr_string) {
			if (getTitle().equals(element)) {
				return true;
			}
		}
		return false;
	}
	
	
	public String toString() {
		return "DVD-"+title+"-"+category+": "+cost;
	}
	
	public boolean equals(Media m) {
		if ( m.getId() == this.id) {
			return true;
		}
		return false;
	}

	
}

    

