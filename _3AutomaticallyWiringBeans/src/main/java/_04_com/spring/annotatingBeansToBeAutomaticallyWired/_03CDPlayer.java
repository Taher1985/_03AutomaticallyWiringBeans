package _04_com.spring.annotatingBeansToBeAutomaticallyWired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class _03CDPlayer implements _01CompactDisk {

	private _02MediaPlayer mediaPlayerAudioOne;
	private _02MediaPlayer mediaPlayerAudioTwo;

	@Autowired
	public _03CDPlayer(_02MediaPlayer mediaPlayer) {
		super();
		this.mediaPlayerAudioOne = mediaPlayer;
	}

	@Autowired
	public void setMediaPlayerVideo(_02MediaPlayer mediaPlayer) {
		this.mediaPlayerAudioTwo = mediaPlayer;
	}

	@Override
	public void play() {
		System.out.println("Playing CD player with ");
		this.startPlay();
	}

	public void startPlay() {
		mediaPlayerAudioOne.playMediaPlayer();
		mediaPlayerAudioTwo.playMediaPlayer();
	}

	@Autowired
	public void autoWiredMethod(_02MediaPlayer mediaPlayer) {
		System.out.println("Autowired Method");
		System.out.println();
	}

}
