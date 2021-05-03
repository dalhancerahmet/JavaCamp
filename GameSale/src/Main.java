import Businness.Concrete.PlayerManager;
import Businness.Concrete.ProductManager;
import Businness.Concrete.SalesManager;
import Entities.Concrete.Campaign;
import Entities.Concrete.Player;
import Entities.Concrete.Product;
import Util.Adapters.MernisServiceAdapter;

public class Main {

	public static void main(String[] args) {
		Campaign javaCampCampaign= new Campaign(1, "Java Kampý Kampanyasý", "KAMPAOZEL", 10.0, "JAVA KAMPINA ÖZEL %10 ÝNDÝRÝM!");
		Campaign winterCampaign= new Campaign(2, "Kýþ Kampanyasý", "KISAOZEL", 5.0, "KIÞ AYINA ÖZEL %5 ÝNDÝRÝM!");
		
		Player ahmet= new Player(1, "Ahmet ","Dalhançer", "dalhancerahmet@gmail.com", "dalhancerahmet", "12345", 1500.0,"55543264082",1994,"KAMPAOZEL");
		Player engin= new Player(2, "Engin ","Demiroð", "engin@engin.com", "engindemirog", "12345", 2500.0,"12345678910",1990,"KISAOZEL");
		
		Product gtaV = new Product(1, "GTA V", 300.0, "KAMPOZEL");
		Product uncharted = new Product(2, "Uncharted", 200.0, "KAMPOZEL");
		Product pubg = new Product(3, "Pubg", 150.0, "");
		
		
		ProductManager productManager= new ProductManager();
		productManager.add(gtaV);
		productManager.delete(pubg);
		productManager.update(uncharted);
		
		PlayerManager playerManager= new PlayerManager(new MernisServiceAdapter());
		playerManager.add(ahmet);
		playerManager.delete(ahmet);
		playerManager.update(engin);
		
		SalesManager salesManager= new SalesManager();
		salesManager.sale(pubg, javaCampCampaign,ahmet);
		salesManager.sale(gtaV, winterCampaign, engin);

	}

}
