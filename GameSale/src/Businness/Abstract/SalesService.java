package Businness.Abstract;

import Entities.Concrete.Campaign;
import Entities.Concrete.Player;
import Entities.Concrete.Product;

public interface SalesService {
	void sale(Product product, Campaign campaign, Player player);

}
