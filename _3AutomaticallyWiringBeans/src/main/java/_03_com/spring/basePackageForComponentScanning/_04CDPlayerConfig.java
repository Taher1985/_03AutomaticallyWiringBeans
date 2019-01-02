package _03_com.spring.basePackageForComponentScanning;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
// @ComponentScan(basePackages = {"_03_com.spring.basePackageForComponentScanning"})
@ComponentScan(basePackageClasses = { _02CDPlayer.class, _03DVDPlayer.class })
public class _04CDPlayerConfig {

	public _04CDPlayerConfig() {
		super();
	}

}
