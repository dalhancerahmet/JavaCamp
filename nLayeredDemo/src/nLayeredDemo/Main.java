package nLayeredDemo;

import nLayeredDemo.business.abstracts.ProductService;
import nLayeredDemo.business.concretes.ProductManager;
import nLayeredDemo.core.jLoggerManagerAdapter;
import nLayeredDemo.dataAccess.concretes.AbcProductDao;
import nLayeredDemo.entities.concretes.Product;

public class Main {

	public static void main(String[] args) {
		Product product= new Product(1,1,"Kayýsý",25.0,1000);
		ProductService productManager= new ProductManager(new AbcProductDao(),new jLoggerManagerAdapter());
				productManager.add(product);
	}

}
