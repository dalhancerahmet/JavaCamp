package dalhancer.DatabaseConnectionTest2.business.abstracts;

import java.util.List;

import dalhancer.DatabaseConnectionTest2.Entities.concretes.Product;

public interface ProductService {
	
	void add(Product product);
	void delete(Product product);
	List<Product> getAll();
	Product getByCategoryId(int id);

}
