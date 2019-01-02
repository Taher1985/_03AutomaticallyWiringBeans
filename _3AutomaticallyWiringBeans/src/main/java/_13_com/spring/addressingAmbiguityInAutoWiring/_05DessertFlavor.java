package _13_com.spring.addressingAmbiguityInAutoWiring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class _05DessertFlavor {

	@Autowired
	private _01Dessert dessert;

	public _05DessertFlavor() {
		super();
	}

	public void setDessert(_01Dessert dessert) {
		this.dessert = dessert;
	}

	public void dessertflavor() {
		dessert.flavor();
	}

}
