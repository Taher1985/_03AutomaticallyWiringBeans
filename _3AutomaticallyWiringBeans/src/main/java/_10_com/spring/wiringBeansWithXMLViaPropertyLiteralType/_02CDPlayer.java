package _10_com.spring.wiringBeansWithXMLViaPropertyLiteralType;

import org.springframework.stereotype.Component;

@Component
public class _02CDPlayer implements _01CompactDisk {

	private String cdTitle;
	private String cdType;

	public _02CDPlayer() {
		super();
	}

	public void setCdTitle(String cdTitle) {
		this.cdTitle = cdTitle;
	}

	public void setCdType(String cdType) {
		this.cdType = cdType;
	}

	@Override
	public void play() {
		System.out.println("Title of cd is " + cdTitle + " and Type of cd is "
				+ cdType);
	}

}
