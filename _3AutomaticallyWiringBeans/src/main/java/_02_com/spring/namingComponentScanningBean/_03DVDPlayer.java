package _02_com.spring.namingComponentScanningBean;

import org.springframework.stereotype.Component;

@Component("dvdPlayer")
public class _03DVDPlayer implements _01CompactDisk {

	public _03DVDPlayer() {
		super();
	}
	
	@Override
	public void play() {
		System.out.println("Playing DVD");
	}

}
