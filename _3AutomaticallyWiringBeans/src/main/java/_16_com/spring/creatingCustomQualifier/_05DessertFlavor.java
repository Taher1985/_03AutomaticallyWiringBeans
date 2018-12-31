package _16_com.spring.creatingCustomQualifier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class _05DessertFlavor {

	@Autowired
	@Cold
	@Creamy
	private _01Dessert dessert;

	public _05DessertFlavor() {
		super();
	}

	public void dessertflavor() {
		dessert.flavor();
	}

}
