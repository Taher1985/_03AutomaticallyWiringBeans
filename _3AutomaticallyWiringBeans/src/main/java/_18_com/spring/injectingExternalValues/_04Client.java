package _18_com.spring.injectingExternalValues;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class _04Client {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.register(_03DessertConfig.class);
		context.refresh();
		_01Dessert dessert = (_01Dessert) context.getBean("iceCream");
		dessert.flavor();
		context.close();

	}
}
