package hust.soict.dsai.aims;
import java.util.Scanner;

public class DigitalVideoDisc {
	String title;
	private String category;
	private String director;
	private int length;
	float cost;
	private int id;
	public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
		super();
		this.title = title;
		this.category = category;
		this.director = director;
		this.length = length;
		this.cost = cost;
	}
	public DigitalVideoDisc(String title) {
		super();
		this.title = title;
		
	}
	public DigitalVideoDisc(String title, String category, float cost) {
		super();
		this.title = title;
		this.category = category;
		this.cost = cost;
	}
	public DigitalVideoDisc(String title, String category, float cost, String director) {
		super();
		this.title = title;
		this.category = category;
		this.cost = cost;
	}
	public String toString() {
		return getTitle();
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
	public float getCost() {
		return cost;
	}
	public void setCost(float cost) {
		this.cost = cost;
	}
	public void nbDigitalVideoDiscs() {
		
	}
	private static int nbDigitalVideoDiscs = 0;
	public void setID(String title){
		this.title = title;
	    this.nbDigitalVideoDiscs = nbDigitalVideoDiscs++;
	    int id = nbDigitalVideoDiscs;
	}
	public int getID() {
		return id;
	}
	
		

		

	
}