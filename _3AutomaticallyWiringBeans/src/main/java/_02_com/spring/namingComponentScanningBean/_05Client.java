package _02_com.spring.namingComponentScanningBean;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class _05Client {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		
		context.register(_04CDPlayerConfig.class);
		context.refresh();

		_01CompactDisk compactDiskCD = (_01CompactDisk) context.getBean("cdPlayer");
		compactDiskCD.play();

		_01CompactDisk compactDiskDVD = (_01CompactDisk) context.getBean("dvdPlayer");
		compactDiskDVD.play();

		context.close();
		
	}
}
