package _03_com.spring.basePackageForComponentScanning;

import org.springframework.stereotype.Component;

@Component
public class _02CDPlayer implements _01CompactDisk {

	public _02CDPlayer() {
		super();
	}
	
	@Override
	public void play() {
		System.out.println("Playing CD");
	}

}
