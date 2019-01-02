package _15_com.spring.qualifyingAutowiredBeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class _05DessertFlavor {

	@Autowired
	@Qualifier("_03Cake")
	private _01Dessert dessert;

	public _05DessertFlavor() {
		super();
	}

	public void dessertflavor() {
		dessert.flavor();
	}

}
