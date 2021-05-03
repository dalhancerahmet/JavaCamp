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
			System.out.println("Oyuncu eklendi. Oynamaya ba�la delikanl�!"+" "+"Kaydedilen Oyuncu:"+entity.getFirstName()+" "+entity.getLastName());
		} else
		{
			System.out.println("Ki�i do�rulanamad�. Bilgileri kontrol ediniz.");
		}
		
		
		
	}

	@Override
	public void delete(Player entity) {
		System.out.println("Oyuncu silindi. �zg�n�m dostum :( "+" "+"Silinen Gamer:"+entity.getFirstName()+" "+entity.getLastName());
		
	}

	@Override
	public void update(Player entity) {
		System.out.println("Oyuncu g�ncellendi. Daha g��l� d�n�yorsun sahalara!"+" "+"G�ncellenen Oyuncu:"+entity.getFirstName()+" "+entity.getLastName());
		
	}

}
