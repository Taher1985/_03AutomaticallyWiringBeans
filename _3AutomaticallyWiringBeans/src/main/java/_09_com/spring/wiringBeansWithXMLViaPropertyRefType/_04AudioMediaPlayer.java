package _09_com.spring.wiringBeansWithXMLViaPropertyRefType;

import org.springframework.stereotype.Component;

@Component
public class _04AudioMediaPlayer implements _02MediaPlayer {

	public _04AudioMediaPlayer() {
		super();
	}

	@Override
	public void playMediaPlayer() {
		System.out.print("Playing Audio Media Player");

	}

}
