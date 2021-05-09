package nLayeredDemo.entities.concretes;

import nLayeredDemo.entities.abstracts.Entity;

public class Product implements Entity {
	private int id;
	private int categoryId;
	private String name;
	private Double unitPrice;
	private int unitInStock;
	
	public Product() {}

	public Product(int id, int categoryId, String name, Double unitPrice, int unitInStock) {
		super();
		this.id = id;
		this.categoryId = categoryId;
		this.name = name;
		this.unitPrice = unitPrice;
		this.unitInStock = unitInStock;
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

	public Double getUnitPrice() {
		return unitPrice;
	}

	public int getUnitInStock() {
		return unitInStock;
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

	public void setUnitPrice(Double unitPrice) {
		this.unitPrice = unitPrice;
	}

	public void setUnitInStock(int unitInStock) {
		this.unitInStock = unitInStock;
	}
	

}
