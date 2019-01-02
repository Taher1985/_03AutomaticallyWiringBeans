package _05_com.spring.wiringBeansWithJava;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class _05CDPlayerConfig {

	public _05CDPlayerConfig() {
		super();
	}

	@Bean
	public _01CompactDisk cdPlayer() {
		_01CompactDisk cd = new _03CDPlayer();
		return cd;
	}

	@Bean
	public _02MediaPlayer mediaPlayer() {
		_04AudioMediaPlayer am = new _04AudioMediaPlayer();
		return am;
	}

	/* Injecting MediaPlayer into CompactDisk via setter method */
	@Bean
	public _01CompactDisk cdPlayerNeedsMediaPlayerViaSetter() {
		_03CDPlayer cdmp = new _03CDPlayer();
		cdmp.setMediaPlayer(mediaPlayer());
		return cdmp;
	}
	
	/* Injecting MediaPlayer into CompactDisk via constructor */
	@Bean
	public _01CompactDisk cdPlayerNeedsMediaPlayerViaCons(_02MediaPlayer mediaPlayer) {
		_03CDPlayer cdmp = new _03CDPlayer(mediaPlayer);
		return cdmp;
	}
	
}
