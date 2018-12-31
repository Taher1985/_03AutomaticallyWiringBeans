package _18_com.spring.injectingExternalValues;

public class _02IceCream implements _01Dessert {

	private String taste;
	private String brand;
	private int price;

	public _02IceCream(String taste, String brand, int price) {
		super();
		this.taste = taste;
		this.brand = brand;
		this.price = price;
	}

	@Override
	public void flavor() {
		System.out.println("IceCream is " + taste + " in taste and brand is "
				+ brand + " and price is " + price);

	}

}
