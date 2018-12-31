package _16_com.spring.creatingCustomQualifier;

import org.springframework.stereotype.Component;

@Component
public class _04Cookies implements _01Dessert {

	public _04Cookies() {
		super();
	}

	@Override
	public void flavor() {
		System.out.println("CashewCookies");

	}

}
