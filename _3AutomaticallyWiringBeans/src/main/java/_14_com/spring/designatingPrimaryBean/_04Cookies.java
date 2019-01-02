package _14_com.spring.designatingPrimaryBean;

import org.springframework.stereotype.Component;

@Component
public class _04Cookies implements _01Dessert {

	public _04Cookies() {
		super();
	}

	@Override
	public void flavor() {
		System.out.println("Cashew");

	}

}
