package _19_com.spring.resolvingPropertyPlaceholder;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("iceCream")
public class _02IceCream implements _01Dessert {

	@Value("${taste}")
	private String taste;

	@Value("${brand}")
	private String brand;

	@Override
	public void flavor() {
		System.out.println("IceCream is " + taste + " in taste and brand is "
				+ brand);

	}

}
