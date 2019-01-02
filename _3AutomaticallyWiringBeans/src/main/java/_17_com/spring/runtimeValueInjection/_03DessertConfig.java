package _17_com.spring.runtimeValueInjection;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class _03DessertConfig {

	public _03DessertConfig() {
		super();
	}

	@Bean
	public _01Dessert iceCream() {
		_01Dessert dessert = new _02IceCream("Sweet");
		return dessert;
	}

}
