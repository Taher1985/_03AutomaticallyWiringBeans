package _16_com.spring.creatingCustomQualifier;

import org.springframework.stereotype.Component;

@Component
@Cold
@Creamy
public class _02IceCream implements _01Dessert {

	public _02IceCream() {
		super();
	}

	@Override
	public void flavor() {
		System.out.println("StrawberryIceCream");

	}

}
