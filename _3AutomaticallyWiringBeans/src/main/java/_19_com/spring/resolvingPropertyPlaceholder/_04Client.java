package _19_com.spring.resolvingPropertyPlaceholder;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class _04Client {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.register(_03DessertConfig.class);
		context.refresh();
		_01Dessert dessert = (_01Dessert) context.getBean("cold");
		dessert.flavor();
		context.close();

	}
}
