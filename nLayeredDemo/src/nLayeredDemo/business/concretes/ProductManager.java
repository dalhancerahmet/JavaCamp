package nLayeredDemo.business.concretes;

import java.util.List;

import nLayeredDemo.business.abstracts.ProductService;
import nLayeredDemo.core.LoggerService;
import nLayeredDemo.dataAccess.abstracts.ProductDao;
import nLayeredDemo.entities.concretes.Product;

public class ProductManager implements ProductService {
	
	private ProductDao productDao;
	private LoggerService loggerService;

	public ProductManager(ProductDao productDao, LoggerService loggerService) {
		super();
		this.productDao = productDao;
		this.loggerService= loggerService;
	}

	@Override
	public void add(Product product) {
		if(product.getCategoryId()==1) {
			System.out.println("Ürün eklendi"+product.getName());
			this.productDao.add(product);
			this.loggerService.logToSystem("Ürün eklendi");
		}else {
			System.out.println("Categori 1 olmadýðýndan eklenemedi.	");
		}
		
		
	}

	@Override
	public List<Product> getAll() {
		productDao.getAll();
		return null;
	}

}
