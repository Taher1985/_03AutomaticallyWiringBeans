package _11_com.spring.wiringBeansWithXMLViaPropertyCollections;

import java.util.List;
import java.util.Set;

import org.springframework.stereotype.Component;

@Component
public class _03CDPlayer implements _01CompactDisk {

	private Set<_02CDPlayerBrands> playerBrands;

	public _03CDPlayer() {
		super();
	}

	public void setPlayerBrands(Set<_02CDPlayerBrands> playerBrands) {
		this.playerBrands = playerBrands;
	}

	@Override
	public void play() {
		for (_02CDPlayerBrands brands : playerBrands) {
			System.out.println("Brands are " + brands.brandName());
		}
	}

}
