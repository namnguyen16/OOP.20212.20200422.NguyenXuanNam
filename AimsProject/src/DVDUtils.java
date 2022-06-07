//import java.lang.reflect.Array;
//import java.util.Arrays;

//import javax.lang.model.type.ArrayType;

public class DVDUtils {
	public static String compareByCost(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2) {
		String result = null;
		if (dvd1.getCost() > dvd2.getCost()) {
			result = dvd1.getTitle() + " is more expensive than " + dvd2.getTitle();
		}
		
		if (dvd1.getCost() < dvd2.getCost()) {
			result = dvd1.getTitle() + " is cheaper than " + dvd2.getTitle();
		}
		
		if (dvd1.getCost() == dvd2.getCost()) {
			result = "the cost of " + dvd1.getTitle() + " is equal to the cost of " + dvd2.getTitle();
		}
		return result; 
	}

	public static String compareByTitle(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2) {
		String result = null;
		int key = dvd1.getTitle().compareTo(dvd2.getTitle());
		if (key > 0) {
			result = dvd1.getTitle();
		}
		if (key == 0) {
			result = "2 dvd have the same title.";
		}
		if (key < 0) {
			result = dvd2.getTitle();
		}
		return result;
	}
	
	
	public static DigitalVideoDisc[] sortByCost(DigitalVideoDisc[] arr) {
        DigitalVideoDisc temp = arr[0];
        for (int i = 0 ; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i].getCost() > arr[j].getCost()) {
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


}
