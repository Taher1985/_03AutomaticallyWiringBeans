package _04_com.spring.annotatingBeansToBeAutomaticallyWired;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class _07Client {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.register(_06CDPlayerConfig.class);
		context.refresh();

		_01CompactDisk compactDiskCD = (_01CompactDisk) context.getBean("_03CDPlayer");
		compactDiskCD.play();

		context.close();

	}
}
