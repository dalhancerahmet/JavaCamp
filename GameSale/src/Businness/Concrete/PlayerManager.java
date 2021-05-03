package Businness.Concrete;

import Businness.Abstract.BaseManagerService;
import Entities.Concrete.Player;
import Util.Adapters.PlayerCheckService;

public class PlayerManager implements BaseManagerService<Player> {
	
	PlayerCheckService playerCheckService;
	
	public PlayerManager(PlayerCheckService playerCheckService) {
		this.playerCheckService=playerCheckService;
	}
	

	@Override
	public void add(Player entity) {
		
		if(playerCheckService.checkPlayer(entity)) {
			System.out.println("Oyuncu eklendi. Oynamaya baþla delikanlý!"+" "+"Kaydedilen Oyuncu:"+entity.getFirstName()+" "+entity.getLastName());
		} else
		{
			System.out.println("Kiþi doðrulanamadý. Bilgileri kontrol ediniz.");
		}
		
		
		
	}

	@Override
	public void delete(Player entity) {
		System.out.println("Oyuncu silindi. Üzgünüm dostum :( "+" "+"Silinen Gamer:"+entity.getFirstName()+" "+entity.getLastName());
		
	}

	@Override
	public void update(Player entity) {
		System.out.println("Oyuncu güncellendi. Daha güçlü dönüyorsun sahalara!"+" "+"Güncellenen Oyuncu:"+entity.getFirstName()+" "+entity.getLastName());
		
	}

}
