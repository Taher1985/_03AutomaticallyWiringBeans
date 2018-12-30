package _05_com.spring.wiringBeansWithJava;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class _06Client {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.register(_05CDPlayerConfig.class);
		context.refresh();

		_01CompactDisk compactDiskWithMediaPlayer = (_01CompactDisk) context.getBean("cdPlayerNeedsMediaPlayerViaSetter");
		compactDiskWithMediaPlayer.play();

		System.out.println();
		
		_01CompactDisk compactDiskCD = (_01CompactDisk) context.getBean("cdPlayer");
		compactDiskCD.play();
		
		context.close();
		
	}
}
