import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Cart {
	public static final int MAX_NUMBERS_ORDERED = 20;
	public static DigitalVideoDisc itemsOrdered[] = 
			new DigitalVideoDisc[MAX_NUMBERS_ORDERED];

	private int qtyOrdered;
	float totalcost = 0 ;
	int arrindex = 0;
	
	public void addDigitalVideoDisc(DigitalVideoDisc disc) {
		if (qtyOrdered < itemsOrdered.length) {
			itemsOrdered[arrindex] = disc;
			arrindex++;
			System.out.println("The disc has been added");
		}
		else {
			System.out.println("The cart is full");
		}
	}
	
	public static void removeDigitalVideoDisc(DigitalVideoDisc disc) {
		for (DigitalVideoDisc discname : itemsOrdered) {
			if (discname == null) {
				break;
			}
			if (discname.title==disc.title) {
				List<DigitalVideoDisc> newList = new ArrayList<>(Arrays.asList(itemsOrdered));
				newList.remove(disc);
				itemsOrdered = newList.toArray(new DigitalVideoDisc[MAX_NUMBERS_ORDERED]);
			}
			
		}
	}
	public void totalcost() {
		for (DigitalVideoDisc disc: itemsOrdered) {
			if (disc != null) {
				totalcost += disc.cost;
			}
			
		}
	}

	public void addDigitalVideoDisc1(DigitalVideoDisc dvd1) {
		// TODO Auto-generated method stub
		
	}

	public void print() {
		// TODO Auto-generated method stub
		
	}
	public static DigitalVideoDisc[] sortByCost(DigitalVideoDisc[] arr) {
        DigitalVideoDisc temp = arr[0];
        for (int i = 0 ; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i].getCost() < arr[j].getCost()) {
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        } 
        return arr;
	}
	
	public static DigitalVideoDisc[] sortByTitle(DigitalVideoDisc[] arr) {
		DigitalVideoDisc temp = arr[0];
        for (int i = 0 ; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i].getTitle().compareTo(arr[j].getTitle()) > 0) {
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
		return arr;
     }  
	public static String Search(DigitalVideoDisc[] arr, int ID) {
		String result = null;
		int k = 0;
		for (int i = 0 ; i < arr.length - 1; i++) {
			if(arr[i].getID() == ID) {
				k = 1;
				result = arr[i].getTitle();
				break;
			}
		}
		if (k == 0) {
			result = "no match is found";
		}
		return result;
		
	}
	public static DigitalVideoDisc[] sortByLength(DigitalVideoDisc[] arr) {
		DigitalVideoDisc temp = arr[0];
        for (int i = 0 ; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i].getLength() > arr[j].getLength()) {
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
		return arr;
     }  
	
	
	public static String Ordered(DigitalVideoDisc[] arr) {
		String result = "***********************CART***********************" + "\n";
		arr = sortByLength(arr);
		arr = sortByCost(arr);
		arr = sortByTitle(arr);
		for (int i = 0 ; i < arr.length ; i++) {
			result = result + String.valueOf(i + 1) + ". DVD-" + arr[i].getTitle() + "-" + arr[i].getCategory() + "-" + arr[i].getDirector() + "-" + String.valueOf(arr[i].getLength()) + ":" + String.valueOf(arr[i].getCost());
			result = result + "\n";
		}
		float k = 0;
		for (int i = 0 ; i < arr.length ; i++) {
			k += arr[i].getCost();
		}
		result = result + "Total cost: " + String.valueOf(k) + "\n" + "***************************************";
		return result;
	}
	
	public static void cartM(DigitalVideoDisc[] arr, int k) {
		if (k == 1) {
			System.out.println("ID or Title");
			Scanner scanner1 = new Scanner(System.in);
			String String2 = scanner1.nextLine();
			if (String2.equals("ID")) {
				Scanner input1 = new Scanner(System.in);
				int number = input1.nextInt();
				for (int i = 0 ; i < arr.length ; i++) {
					if (number == arr[i].getID()) {
						System.out.println(arr[i].getTitle());
						break;
					}
				}
			}
			
			if (String2.equals("Title")) {
				Scanner scanner11 = new Scanner(System.in);
				String String21 = scanner11.nextLine();
				for (int i = 0 ; i < arr.length ; i++) {
					if (String21 == arr[i].getTitle()) {
						System.out.println(arr[i].getTitle());
						break;
					}
				}
			}
		}
		
		if (k == 2) {
			System.out.println("By: Title or Cost");
			Scanner scanner = new Scanner(System.in);
			String String = scanner.nextLine();
			if (String.equals("Title")) {
				System.out.println(sortByTitle(arr));
			}
			if (String.equals("Cost")) {
				System.out.println(sortByCost(arr));
			}
		}
		
		if (k == 3) {
			System.out.println("The DVD want to remove");
			Scanner scanner = new Scanner(System.in);
			String String = scanner.nextLine();
			for (int i = 0 ; i < arr.length ; i++) {
				if (String == arr[i].getTitle()) {
					removeDigitalVideoDisc(arr[i]);
				}
			}
		}	
		
		if (k == 4) {
			System.out.println("An order is created.");
			for (int i = 0 ; i < arr.length ; i++) {
				removeDigitalVideoDisc(arr[i]);
			}
		}
	}

	
}
