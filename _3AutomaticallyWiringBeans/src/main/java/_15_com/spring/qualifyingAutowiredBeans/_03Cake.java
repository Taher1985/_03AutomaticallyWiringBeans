package _15_com.spring.qualifyingAutowiredBeans;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class _03Cake implements _01Dessert {

	public _03Cake() {
		super();
	}

	@Override
	public void flavor() {
		System.out.println("ChoclateCake");

	}

}
