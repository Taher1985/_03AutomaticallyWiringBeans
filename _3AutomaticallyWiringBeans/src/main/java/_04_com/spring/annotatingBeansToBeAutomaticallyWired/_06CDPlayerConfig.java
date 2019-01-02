package _04_com.spring.annotatingBeansToBeAutomaticallyWired;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "_04_com.spring.annotatingBeansToBeAutomaticallyWired")
public class _06CDPlayerConfig {

	public _06CDPlayerConfig() {
		super();
	}

}
