package _15_com.spring.qualifyingAutowiredBeans;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class _04Cookies implements _01Dessert {

	public _04Cookies() {
		super();
	}

	@Override
	public void flavor() {
		System.out.println("CashewCookies");

	}

}
