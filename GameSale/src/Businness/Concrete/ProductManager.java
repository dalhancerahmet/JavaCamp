package Businness.Concrete;

import Businness.Abstract.BaseManagerService;
import Entities.Concrete.Product;

public class ProductManager implements BaseManagerService<Product> {

	@Override
	public void add(Product entity) {
		System.out.println("�r�n eklendi. Art�k sat��a haz�r!:"+" "+"Eklenen �r�n:"+entity.getName());
		
	}

	@Override
	public void delete(Product entity) {
		System.out.println("�r�n Silindi. �zg�n�m art�k bu �r�n� satamazs�n�z:"+entity.getName());
		
	}

	@Override
	public void update(Product entity) {
		System.out.println("�r�n g�ncellendi. Harika! Art�k daha d�zenli her�ey:"+" "+"G�ncellenen �r�n:"+entity.getName());
		
	}

}
