package _07_com.spring.wiringBeansWithXMLViaConsLiteralType;

import org.springframework.stereotype.Component;

@Component
public class _02CDPlayer implements _01CompactDisk {

	private String cdTitle;
	private String cdType;

	public _02CDPlayer(String cdTitle, String cdType) {
		super();
		this.cdTitle = cdTitle;
		this.cdType = cdType;
	}

	@Override
	public void play() {
		System.out.println("Title of cd is " + cdTitle + " and Type of cd is "
				+ cdType);
	}

}
