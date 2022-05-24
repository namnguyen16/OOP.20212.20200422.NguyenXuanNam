import java.util.Scanner;
public class Aims {
	public static void main(String[] args) {
        Cart anOrder = new Cart();
		
		//Create new dvd objects and add them to the cart
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King","Animation","Roger Allers",87,19.95f);
		//anOrder.addDigitalVideoDisc(dvd1);

		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars","Science Fiction","George Lucas",87,24.95f);
		//anOrder.addDigitalVideoDisc(dvd2);

		DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin","Animation",18.99f);
		//anOrder.addDigitalVideoDisc(dvd3);
		
		//anOrder.removeDigitalVideoDisc(dvd2);
	
		//print total cost of the items in the cart
		//System.out.println("total cost is: ");
		//anOrder.totalcost();
		//System.out.println(anOrder.totalcost);
		
		DigitalVideoDisc[] arr = new DigitalVideoDisc[] {dvd1, dvd2, dvd3};
		int k1 = 1;
		while (k1 == 1) {
			k1 = 0;
			Store.showMenu();
			Scanner input = new Scanner(System.in);
			int number1 = input.nextInt();
			
			
			
			if (number1 == 1) {
				
				
					
				Store.storeMenu();
				Scanner input1 = new Scanner(System.in);
				int number2 = input1.nextInt();
					
				if (number2 == 1) {
					System.out.println("Title of the DVD:");
					Scanner scanner = new Scanner(System.in);
					String String1 = scanner.nextLine();
					int m = 0;
					for (int i = 0 ; i < arr.length ; i++) {
						if (String1 == arr[i].getTitle()) {
							m = 1;
							System.out.println("Title: " + arr[i].getTitle());
							System.out.println("Category: " + arr[i].getCategory());
							System.out.println("Director: " + arr[i].getDirector());
							System.out.println("Length: " + String.valueOf(arr[i].getLength()));
							System.out.println("Cost: " + String.valueOf(arr[i].getCost()));
							break;
						}
					}
					if (m == 0) {
						System.out.println("No DVD is found.");
					}
					
						
				}
				
				if (number2 == 2) {
					System.out.println("Title of the DVD:");
					Scanner scanner = new Scanner(System.in);
					String String1 = scanner.nextLine();
					int m = 0;
					for (int i = 0 ; i < arr.length ; i++) {
						if (String1 == arr[i].getTitle()) {
							m = 1;
							anOrder.addDigitalVideoDisc(arr[i]);
							System.out.println("number of DVDs in the current cart: ");
							System.out.println(anOrder.arrindex);
							break;
						}
					}
					if (m == 0) {
						System.out.println("No DVD is found.");
					}
						
				}
					
				if (number2 == 3) {
					Store.cartMenu();
					Scanner input11 = new Scanner(System.in);
					int number = input11.nextInt();
					Cart.cartM(arr, number);
					if (number == 0) {
						k1 = 1;
					}
						
				}
					
				if (number2 == 0) {
					k1 = 1;
						
				}
			}
				
			
			
			if (number1 == 2) {
				System.out.println("Title of the DVD:");
				Scanner scanner = new Scanner(System.in);
				String String1 = scanner.nextLine();
				System.out.println("add or remove.");
				Scanner scanner1 = new Scanner(System.in);
				String String2 = scanner1.nextLine();
				
				int m = 0;
				for (int i = 0 ; i < arr.length ; i++) {
					if (String1 == arr[i].getTitle()) {
						m = 1;
						if (String2 == "add") {
							anOrder.addDigitalVideoDisc(arr[i]);
						}
						if (String2 == "remove") {
							anOrder.removeDigitalVideoDisc(arr[i]);
						}
						break;
					}
				}
				if (m == 0) {
					System.out.println("No DVD is found.");
				}
			}
			
			if (number1 == 3) {
				Store.cartMenu();
				Scanner input1 = new Scanner(System.in);
				int number = input1.nextInt();
				Cart.cartM(arr, number);
				if (number == 0) {
					k1 = 1;
				}
				
			}
			
			
		}
	}
}
