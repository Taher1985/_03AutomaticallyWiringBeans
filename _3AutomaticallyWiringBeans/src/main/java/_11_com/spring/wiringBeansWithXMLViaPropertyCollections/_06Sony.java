package _11_com.spring.wiringBeansWithXMLViaPropertyCollections;

import org.springframework.stereotype.Component;

@Component
public class _06Sony implements _02CDPlayerBrands {

	public _06Sony() {
		super();
	}

	@Override
	public String brandName() {
		return "Sony";

	}

}
