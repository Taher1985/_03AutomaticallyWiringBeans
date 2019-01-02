package _12_com.spring.mixingXMLConfigInJavaConfig;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class _06Client {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.register(_05CDPlayerConfig.class);
		context.refresh();

		_01CompactDisk compactDiskWithMediaPlayer = (_01CompactDisk) context.getBean("cdPlayerNeedsMediaPlayerViaCons");
		compactDiskWithMediaPlayer.play();

		context.close();
		
	}
}
