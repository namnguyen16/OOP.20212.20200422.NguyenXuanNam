public class Cart {

	public void addDigitalVideoDisc(DigitalVideoDisc dvd1) {
		// TODO Auto-generated method stub
		
	}

	public void print() {
		// TODO Auto-generated method stub
		
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
