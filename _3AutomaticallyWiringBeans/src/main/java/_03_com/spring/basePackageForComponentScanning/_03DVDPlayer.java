package _03_com.spring.basePackageForComponentScanning;

import org.springframework.stereotype.Component;

@Component
public class _03DVDPlayer implements _01CompactDisk {

	public _03DVDPlayer() {
		super();
	}
	
	@Override
	public void play() {
		System.out.println("Playing DVD");
	}

}
