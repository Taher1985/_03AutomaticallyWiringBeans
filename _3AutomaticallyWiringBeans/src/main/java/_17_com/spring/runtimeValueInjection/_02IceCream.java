package _17_com.spring.runtimeValueInjection;


public class _02IceCream implements _01Dessert {

	private String taste;

	public _02IceCream(String taste) {
		super();
		this.taste = taste;
	}

	@Override
	public void flavor() {
		System.out.println("IceCream is " + taste + " in taste");

	}

}
