package _11_com.spring.wiringBeansWithXMLViaPropertyCollections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class _07Client {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("/_11applicationcontainerbeans.xml");

		_01CompactDisk compactDisk = (_01CompactDisk) context.getBean("compactDisk");
		compactDisk.play();
		
	}
}
