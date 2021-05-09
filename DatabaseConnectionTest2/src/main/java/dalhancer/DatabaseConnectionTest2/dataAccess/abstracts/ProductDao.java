package dalhancer.DatabaseConnectionTest2.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import dalhancer.DatabaseConnectionTest2.Entities.concretes.Product;

public interface ProductDao extends JpaRepository<Product, Integer> {

}
