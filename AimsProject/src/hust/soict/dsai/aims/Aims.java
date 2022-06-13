package hust.soict.dsai.aims;
import hust.soict.dsai.aims.media.*;

import hust.soict.dsai.aims.cart.*;
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
			Store.showMenu();
			Scanner input = new Scanner(System.in);
			int number1 = input.nextInt();
			
			
			
			if (number1 == 1) {
				
				
				int k2 = 1;
				while (k2 == 1){
					for (int i = 0 ; i < arr.length ; i++) {
							if (arr[i] instanceof Playable) {
								arr[i].play();	
							}
					}
					Store.storeMenu();
					Scanner input1 = new Scanner(System.in);
					int number2 = input1.nextInt();
					
					if (number2 == 1) {
						System.out.println("Title of the DVD:");
						Scanner scanner = new Scanner(System.in);
						String String1 = scanner.nextLine();
					
					
						int m = 0;
						for (int i = 0 ; i < arr.length ; i++) {
							if (String1.equals(arr[i].getTitle())) {
								m = 1;
								System.out.println("Title: " + arr[i].getTitle());
								System.out.println("Category: " + arr[i].getCategory());
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
							if (String1.equals(arr[i].getTitle())) {
								m = 1;
								if (anOrder.contains(arr[i])) {
									System.out.println("The media is already in the list.");
								}
								else {
									anOrder.addMedia(arr[i]);
								}
						
								System.out.println("number of DVDs in the current cart: ");
								System.out.println(anOrder.getCountDVD());
								break;
							}
						}
						if (m == 0) {
							System.out.println("No DVD is found.");
						}
						
					}
					
					if (number2 == 3) {
						int k3 = 1;
						while (k3 == 1) {
							for (int i = 0 ; i < arr.length ; i++) {
								if (arr[i] instanceof Playable) {
									(arr[i]).play();	
								}
							}
							Store.cartMenu();
							Scanner input11 = new Scanner(System.in);
							int number = input11.nextInt();
							Cart.cartM(arr, number);
							if (number == 2) {
								System.out.println("Title or Cost");
								Scanner scanner1 = new Scanner(System.in);
								String String2 = scanner1.nextLine();
								if (String2.equals("Title")) {
									anOrder.sortByTitle();
									System.out.println(arr);
								}
								if (String2.equals("Cost")) {
									anOrder.sortByCost();
									System.out.println(arr);
								}
							}
							if (number == 3) {
								System.out.println("Title of the DVD:");
								Scanner scanner = new Scanner(System.in);
								String String1 = scanner.nextLine();
								for (int i = 0 ; i < arr.length ; i++) {
									if (String1.equals(arr[i].getTitle())) {
										anOrder.removeMedia(arr[i]);
									}
								}
							}
							if (number == 0) {
								k3 = 0;
							}
						}	
						
					}
					
					if (number2 == 0) {
						k2 = 0;
						
					}
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
					if (String1.equals(arr[i].getTitle())) {
						m = 1;
						if (String2.equals("add")) {
							if (anOrder.contains(arr[i])) {
								System.out.println("The media is already in the list.");
							}
							else {
								anOrder.addMedia(arr[i]);
							}
						}
						if (String2.equals("remove")) {
							anOrder.removeMedia(arr[i]);
						}
						break;
					}
				}
				if (m == 0) {
					System.out.println("No DVD is found.");
				}
			}
			
			if (number1 == 3) {
				for (int i = 0 ; i < arr.length ; i++) {
					if (arr[i] instanceof Playable) {
						arr[i].play();	
					}
				}
				int k3 = 1;
				while (k3 == 1) {
					for (int i = 0 ; i < arr.length ; i++) {
						if (arr[i] instanceof Playable) {
							arr[i].play();	
						}
					}
					Store.cartMenu();
					Scanner input11 = new Scanner(System.in);
					int number = input11.nextInt();
					Cart.cartM(arr, number);
					if (number == 2) {
						System.out.println("Title or Cost");
						Scanner scanner1 = new Scanner(System.in);
						String String2 = scanner1.nextLine();
						if (String2.equals("Title")) {
							anOrder.sortByTitle();
							System.out.println(arr);
						}
						if (String2.equals("Cost")) {
							anOrder.sortByCost();
							System.out.println(arr);
						}
					}
					if (number == 3) {
						System.out.println("Title of the DVD:");
						Scanner scanner = new Scanner(System.in);
						String String1 = scanner.nextLine();
						for (int i = 0 ; i < arr.length ; i++) {
							if (String1.equals(arr[i].getTitle())) {
								anOrder.removeMedia(arr[i]);
							}
						}
					}
					if (number == 0) {
						k3 = 0;
					}
				}	
				
			}
			
			if (number1 == 0) {
				k1 = 0;
			}
			
			
		}
	}


}
