package _16_com.spring.creatingCustomQualifier;

import org.springframework.stereotype.Component;

@Component
@Cold
public class _03Cake implements _01Dessert {

	public _03Cake() {
		super();
	}

	@Override
	public void flavor() {
		System.out.println("ChoclateCake");

	}

}
