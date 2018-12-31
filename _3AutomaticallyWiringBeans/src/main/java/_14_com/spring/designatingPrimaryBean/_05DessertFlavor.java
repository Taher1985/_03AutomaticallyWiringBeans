package _14_com.spring.designatingPrimaryBean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class _05DessertFlavor {

	@Autowired
	private _01Dessert dessert;

	public _05DessertFlavor() {
		super();
	}

	public void dessertflavor() {
		dessert.flavor();
	}

}
