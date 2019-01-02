package _08_com.spring.wiringBeansWithXMLViaConsCollections;

import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class _03CDPlayer implements _01CompactDisk {

	private List<_02CDPlayerBrands> playerBrands;

	public _03CDPlayer(List<_02CDPlayerBrands> playerBrands) {
		super();
		this.playerBrands = playerBrands;
	}

	@Override
	public void play() {
		for (_02CDPlayerBrands brands : playerBrands) {
			System.out.println("Brands are " + brands.brandName());
		}
	}

}
