package _04_com.spring.annotatingBeansToBeAutomaticallyWired;

import org.springframework.stereotype.Component;

@Component
public class _05AudioMediaPlayer implements _02MediaPlayer {

	public _05AudioMediaPlayer() {
		super();
	}

	@Override
	public void playMediaPlayer() {
		System.out.println("Playing Audio Media Player");

	}

}
