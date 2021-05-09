package dalhancer.DatabaseConnectionTest2.Entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="products")
public class Product {
	
	public Product() {
		
	}
	
	@GeneratedValue
	@Id
	@Column(name="product_id")
	private int id;
	
	@Column(name="category_id")
	private int categoryId;
	
	@Column(name="product_name")
	private String name;
	
	@Column(name="unit_price")
	private double unitPrice;
	
	public Product(int id, int categoryId, String name, double unitPrice) {
		super();
		this.id = id;
		this.categoryId = categoryId;
		this.name = name;
		this.unitPrice = unitPrice;
	}
	public int getId() {
		return id;
	}
	public int getCategoryId() {
		return categoryId;
	}
	public String getName() {
		return name;
	}
	public double getUnitPrice() {
		return unitPrice;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}

}
