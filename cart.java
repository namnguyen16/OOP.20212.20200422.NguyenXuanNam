import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class cart {
	public static final int MAX_NUMBERS_ORDERED = 20;
	private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
	private int qtyOrdered;
	float totalcost = 0;
	int arr = 0;
	
	public void addDigitalVideoDisc(DigitalVideoDisc disc) {
		if (qtyOrdered < itemsOrdered.length) {
			itemsOrdered[arr] = disc;
			arr++;
			System.out.println("The disc has been added");
			
		}
		else {
			System.out.println("The cart is full");
		}
	   	
	}
	public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
		for (DigitalVideoDisc discname : itemsOrdered) {
			if (discname == null) {
				break;
			}
			else if (discname.title == disc.title) {
				List<DigitalVideoDisc> newlist = new ArrayList<>(Arrays.asList(itemsOrdered));
				newlist.remove(disc);
				itemsOrdered = newlist.toArray(new DigitalVideoDisc[MAX_NUMBERS_ORDERED]);
			}
		}
	}
	public void totalcost() {
		for (DigitalVideoDisc disc: itemsOrdered) {
			if (disc != null) {
				totalcost += disc.getCost();
			}
		}
	}
}
