package hust.soict.globalict.aims.media;
import java.util.Scanner;

public class DigitalVideoDisc {
	private String director;
	private int length;
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