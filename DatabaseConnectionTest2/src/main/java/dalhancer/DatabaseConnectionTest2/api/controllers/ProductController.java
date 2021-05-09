package dalhancer.DatabaseConnectionTest2.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dalhancer.DatabaseConnectionTest2.Entities.concretes.Product;
import dalhancer.DatabaseConnectionTest2.business.abstracts.ProductService;

@RestController
@RequestMapping("/api/products2")
public class ProductController {
	
	ProductService productService;

	@Autowired
	public ProductController(ProductService productService) {
		super();
		this.productService = productService;
	}
	
	@GetMapping("/getall")
	public List<Product> getAll(){
		
		return this.productService.getAll();
	}
	@PostMapping("/add")
	public void add(Product product) {
		this.productService.add(product);
	}
	@PostMapping("/delete")
	public void delete(Product product) {
		this.productService.delete(product);
	}
	@GetMapping("/getByCategoryId")
	public Product getByCategoryId(int id) {
		return this.productService.getByCategoryId(id);
	}

}
