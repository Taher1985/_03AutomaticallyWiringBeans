package _18_com.spring.injectingExternalValues;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

@Configuration
@PropertySource("classpath:application.properties")
public class _03DessertConfig {

	public _03DessertConfig() {
		super();
	}

	@Autowired
	Environment environment;

	@Bean
	public _01Dessert iceCream() {
		return new _02IceCream(environment.getProperty("taste", "Sweet"),
				environment.getProperty("brand", "Amul"), environment.getProperty("price", Integer.class, 30));
	}

}
