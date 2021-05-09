package dalhancer.DatabaseConnectionTest2.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dalhancer.DatabaseConnectionTest2.Entities.concretes.Product;
import dalhancer.DatabaseConnectionTest2.business.abstracts.ProductService;
import dalhancer.DatabaseConnectionTest2.dataAccess.abstracts.ProductDao;

@Service
public class ProductManager implements ProductService{
	
	
	ProductDao productDao;
	
	@Autowired
	public ProductManager(ProductDao productDao) {
		super();
		this.productDao = productDao;
	}

	@Override
	public void add(Product product) {
		this.productDao.save(product);
		
	}

	@Override
	public void delete(Product product) {
		this.productDao.delete(product);
		
	}

	@Override
	public List<Product> getAll() {
		
		return this.productDao.findAll();
	}

	@Override
	public Product getByCategoryId(int id) {
		return null;
	}

}
