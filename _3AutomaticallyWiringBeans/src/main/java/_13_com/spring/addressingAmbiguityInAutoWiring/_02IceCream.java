package _13_com.spring.addressingAmbiguityInAutoWiring;

import org.springframework.stereotype.Component;

@Component
public class _02IceCream implements _01Dessert {

	public _02IceCream() {
		super();
	}

	@Override
	public void flavor() {
		System.out.println("Strawberry");

	}

}
