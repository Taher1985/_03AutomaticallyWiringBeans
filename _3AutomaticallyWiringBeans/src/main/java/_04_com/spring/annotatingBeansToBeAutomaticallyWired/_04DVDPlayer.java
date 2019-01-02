package _04_com.spring.annotatingBeansToBeAutomaticallyWired;

import org.springframework.stereotype.Component;

@Component
public class _04DVDPlayer implements _01CompactDisk {

	public _04DVDPlayer() {
		super();
	}

	@Override
	public void play() {
		System.out.println("Playing DVD player ");
	}

}
