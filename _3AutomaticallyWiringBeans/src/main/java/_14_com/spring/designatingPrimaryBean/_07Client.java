package _14_com.spring.designatingPrimaryBean;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class _07Client {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.register(_06DessertConfig.class);
		context.refresh();
		_05DessertFlavor dessert = (_05DessertFlavor)context.getBean("_05DessertFlavor");
		dessert.dessertflavor();
		context.close();

	}
}
