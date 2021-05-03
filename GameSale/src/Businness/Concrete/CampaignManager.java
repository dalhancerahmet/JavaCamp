package Businness.Concrete;

import Businness.Abstract.BaseManagerService;
import Entities.Concrete.Campaign;

public class CampaignManager implements BaseManagerService<Campaign>{

	@Override
	public void add(Campaign entity) {
		System.out.println("Kampanya eklendi. Ýyi satýþlar sensey!:"+" "+"Eklenen kampanya:"+entity.getName());
		
	}

	@Override
	public void delete(Campaign entity) {
		System.out.println("Kampanya silindi. Yeni kampanyalarda görüþürüz beybi:"+" "+"Silinen Kampanya:"+entity.getName());
		
	}

	@Override
	public void update(Campaign entity) {
		System.out.println("Kampanya güncellendi. Bastýr sensey:"+" "+"Güncellenen Ürün:"+entity.getName());
		
	}

}
