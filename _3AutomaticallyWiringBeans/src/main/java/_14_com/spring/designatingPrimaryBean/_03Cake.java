package _14_com.spring.designatingPrimaryBean;

import org.springframework.stereotype.Component;

@Component
public class _03Cake implements _01Dessert {

	public _03Cake() {
		super();
	}

	@Override
	public void flavor() {
		System.out.println("Choclate");

	}

}
