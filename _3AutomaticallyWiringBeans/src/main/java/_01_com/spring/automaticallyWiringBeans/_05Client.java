package _01_com.spring.automaticallyWiringBeans;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class _05Client {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.register(_04CDPlayerConfig.class);
		context.refresh();

		_01CompactDisk compactDiskCD = (_01CompactDisk) context.getBean("_02CDPlayer");
		compactDiskCD.play();

		_01CompactDisk compactDiskDVD = (_01CompactDisk) context.getBean("_03DVDPlayer");
		compactDiskDVD.play();

		context.close();
		
		_01CompactDisk compactDiskCD1 = (_01CompactDisk) context.getBean("_02CDPlayer");
		compactDiskCD1.play();
	}
}
