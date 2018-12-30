package _09_com.spring.wiringBeansWithXMLViaPropertyRefType;

import org.springframework.stereotype.Component;

@Component
public class _03CDPlayer implements _01CompactDisk {

	private _02MediaPlayer mediaPlayer;

	public _03CDPlayer() {
		super();
	}

	public void setMediaPlayer(_02MediaPlayer mediaPlayer) {
		this.mediaPlayer = mediaPlayer;
	}

	@Override
	public void play() {
		System.out.println("Playing CD with ");
		mediaPlayer.playMediaPlayer();
	}

}
