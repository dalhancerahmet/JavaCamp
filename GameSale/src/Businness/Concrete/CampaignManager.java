package Businness.Concrete;

import Businness.Abstract.BaseManagerService;
import Entities.Concrete.Campaign;

public class CampaignManager implements BaseManagerService<Campaign>{

	@Override
	public void add(Campaign entity) {
		System.out.println("Kampanya eklendi. �yi sat��lar sensey!:"+" "+"Eklenen kampanya:"+entity.getName());
		
	}

	@Override
	public void delete(Campaign entity) {
		System.out.println("Kampanya silindi. Yeni kampanyalarda g�r���r�z beybi:"+" "+"Silinen Kampanya:"+entity.getName());
		
	}

	@Override
	public void update(Campaign entity) {
		System.out.println("Kampanya g�ncellendi. Bast�r sensey:"+" "+"G�ncellenen �r�n:"+entity.getName());
		
	}

}
