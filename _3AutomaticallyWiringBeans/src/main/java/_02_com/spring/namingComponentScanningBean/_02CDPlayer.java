package _02_com.spring.namingComponentScanningBean;

import org.springframework.stereotype.Component;

@Component("cdPlayer")
public class _02CDPlayer implements _01CompactDisk {

	public _02CDPlayer() {
		super();
	}
	
	@Override
	public void play() {
		System.out.println("Playing CD");
	}

}
