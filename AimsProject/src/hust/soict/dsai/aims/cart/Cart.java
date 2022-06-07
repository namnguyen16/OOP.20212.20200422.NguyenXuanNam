package hust.soict.dsai.aims.cart;
import java.util.*;
import hust.soict.dsai.aims.media.*;

public class Cart {
	private ArrayList<Media> itemsOrdered = new ArrayList<Media>();
	private int countDVD;
	
	public float totalcost = 0 ;
	int arrindex = 0;
	
	public void addMedia(Media media) {
		itemsOrdered.add(media);
	}
	public void removeMedia(Media media) {
		itemsOrdered.remove(media);
	}
	
	public void totalcost() {
		for (Media media: itemsOrdered) {
			totalcost += media.getCost();		
		}
		if (this.getALuckItem() != null) {
			totalcost -= this.getALuckItem().getCost();
		}
	}
	
	public ArrayList<Media> getItemsOrdered() {
		return itemsOrdered;
	}
	//get luck item if size >5 else return null
	public Media getALuckItem() {
		if (itemsOrdered.size() > 5) {
			Random rand = new Random();
			Media randomElement = itemsOrdered.get(rand.nextInt(itemsOrdered.size()));
			return randomElement;
		}
		else {
			System.out.println("Cart doesn't have enough 5 items to get a luck item");
			return null;
		}
	}
	

	
	//sort cart by cost
	public void sortByCost() {
		Collections.sort(itemsOrdered, new Comparator<Media>(){
			public int compare(Media dvd1, Media dvd2) {
				if (dvd1.getCost() > dvd2.getCost()) {
					return 1;
				}
				else if (dvd1.getCost() < dvd2.getCost()) {
					return -1;
				}
				else {
					return 0;
				}
			}
		});
		//print result sort
		System.out.println("cart after sorted by cost: ");
		for (Media element: itemsOrdered) {
			System.out.println(element.toString());
		}
	}
	
	//sort cart by title
	public void sortByTitle() {
		Collections.sort(itemsOrdered, new Comparator<Media>(){
			public int compare(Media dvd1, Media dvd2) {
				return dvd1.getTitle().compareTo(dvd2.getTitle());
			}
		});
		//print result sort
		System.out.println("cart after sorted by title: ");
		for (Media element: itemsOrdered) {
			System.out.println(element.toString());
		}
	}
	
	//search DVD by id
	public void searchById(int dvd_id){
		for (Media dvd: itemsOrdered) {
			if (dvd != null) {
				if (dvd.getId() == dvd_id) {
					System.out.println(dvd.toString());
				}
			}
			else {
				System.out.println("No match founded");
				break;
			}
			
		}	
	}
	

	//search by title
	public void searchByTitle(String title){
		for (Media dvd: itemsOrdered) {
			if (dvd != null) {
				if (dvd.isMatch(title)) {
					System.out.println(dvd.toString());
					break;
				}
			}
			else {
				System.out.println("No match founded");
				break;
			}
			
		}	
	}
	public int getCountDVD() {
		countDVD = 0;
		for (Media ele: itemsOrdered) {
			countDVD += 1;
		}
		return countDVD;
	}
}
