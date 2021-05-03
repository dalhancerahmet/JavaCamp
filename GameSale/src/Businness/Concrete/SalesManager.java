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
			System.out.println("Satýþ yapýlan oyun:"+product.getName()+"Kampanya öncesi fiyat:"+ product.getUnitPrice()
			+"\nÝndirim Oraný:"+campaign.getDiscountRate()+"Kampanya Sonrasý satýþ fiyatý:"+kampanyaSonrasiFiyat);
		} else {
			System.out.println("Satýþ fiyatý:"+ product.getUnitPrice());
		}
		
		
	}

}
