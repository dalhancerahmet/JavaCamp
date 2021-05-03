package Businness.Concrete;

import Businness.Abstract.SalesService;
import Entities.Concrete.Campaign;
import Entities.Concrete.Player;
import Entities.Concrete.Product;

public class SalesManager implements SalesService {

	@Override
	public void sale(Product product, Campaign campaign, Player player) {
		if(player.getCampaignCode()== campaign.getCampaingCode()) {
			Double kampanyaSonrasiFiyat= product.getUnitPrice()-(product.getUnitPrice()*campaign.getDiscountRate()/100);
			System.out.println("Sat�� yap�lan oyun:"+product.getName()+"Kampanya �ncesi fiyat:"+ product.getUnitPrice()
			+"\n�ndirim Oran�:"+campaign.getDiscountRate()+"Kampanya Sonras� sat�� fiyat�:"+kampanyaSonrasiFiyat);
		} else {
			System.out.println("Sat�� fiyat�:"+ product.getUnitPrice());
		}
		
		
	}

}
