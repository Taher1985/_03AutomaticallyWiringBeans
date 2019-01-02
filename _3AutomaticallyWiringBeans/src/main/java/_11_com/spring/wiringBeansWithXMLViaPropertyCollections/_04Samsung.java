package _11_com.spring.wiringBeansWithXMLViaPropertyCollections;

import org.springframework.stereotype.Component;

@Component
public class _04Samsung implements _02CDPlayerBrands {

	public _04Samsung() {
		super();
	}

	@Override
	public String brandName() {
		return "Samsung";

	}


}
