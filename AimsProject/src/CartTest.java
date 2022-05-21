public class CartTest {
	public static void main(String[] args) {
		Cart cart = new Cart();
		
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
		cart.addDigitalVideoDisc(dvd1);
		
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 24.95f);
		cart.addDigitalVideoDisc(dvd2);
		
		DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Animation", 18.99f);
		cart.addDigitalVideoDisc(dvd3);
		
		cart.print();
		
		DigitalVideoDisc[] sorted = Cart.sortByCost(new DigitalVideoDisc[] {dvd1, dvd2, dvd3});
		System.out.println("sort by cost: ");
		for (int i = 0; i < sorted.length; i++) {
			System.out.println(sorted[i].toString());
		}
		
		sorted = Cart.sortByTitle(new DigitalVideoDisc[] {dvd1, dvd2, dvd3});
		System.out.println("sort by title: ");
		for (int i = 0; i < sorted.length; i++) {
			System.out.println(sorted[i].toString());
		}
		
		
	}

}
