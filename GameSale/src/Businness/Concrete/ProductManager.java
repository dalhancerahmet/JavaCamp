package Businness.Concrete;

import Businness.Abstract.BaseManagerService;
import Entities.Concrete.Product;

public class ProductManager implements BaseManagerService<Product> {

	@Override
	public void add(Product entity) {
		System.out.println("Ürün eklendi. Artýk satýþa hazýr!:"+" "+"Eklenen Ürün:"+entity.getName());
		
	}

	@Override
	public void delete(Product entity) {
		System.out.println("Ürün Silindi. Üzgünüm artýk bu ürünü satamazsýnýz:"+entity.getName());
		
	}

	@Override
	public void update(Product entity) {
		System.out.println("Ürün güncellendi. Harika! Artýk daha düzenli herþey:"+" "+"Güncellenen Ürün:"+entity.getName());
		
	}

}
