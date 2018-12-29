package _01_com.spring.automaticallyWiringBeans;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "_01_com.spring.automaticallyWiringBeans")
public class _04CDPlayerConfig {

	public _04CDPlayerConfig() {
		super();
	}

}
