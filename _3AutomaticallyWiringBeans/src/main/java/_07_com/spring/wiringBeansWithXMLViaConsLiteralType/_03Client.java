package _07_com.spring.wiringBeansWithXMLViaConsLiteralType;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class _03Client {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("/_07applicationcontainerbeans.xml");

		_01CompactDisk compactDisk = (_01CompactDisk) context.getBean("compactDisk");
		compactDisk.play();
		
	}
}
