package _14_com.spring.designatingPrimaryBean;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class _02IceCream implements _01Dessert {

	public _02IceCream() {
		super();
	}

	@Override
	public void flavor() {
		System.out.println("Strawberry");

	}

}
