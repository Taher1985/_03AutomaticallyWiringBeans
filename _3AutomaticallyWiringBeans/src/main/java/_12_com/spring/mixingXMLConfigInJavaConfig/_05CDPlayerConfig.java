package _12_com.spring.mixingXMLConfigInJavaConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ImportResource("classpath:_12applicationcontainerbeans.xml")
public class _05CDPlayerConfig {

	public _05CDPlayerConfig() {
		super();
	}

	/* Injecting MediaPlayer into CompactDisk via constructor */
	@Bean
	public _01CompactDisk cdPlayerNeedsMediaPlayerViaCons(_02MediaPlayer mediaPlayer) {
		_03CDPlayer cdmp = new _03CDPlayer(mediaPlayer);
		return cdmp;
	}
	
}
