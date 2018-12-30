package _09_com.spring.wiringBeansWithXMLViaPropertyRefType;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class _05Client {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("/_09applicationcontainerbeans.xml");

		_01CompactDisk compactDisk = (_01CompactDisk) context.getBean("compactDisk");
		compactDisk.play();
		
	}
}
