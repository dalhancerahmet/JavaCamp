package Entities.Concrete;

import Entities.Abstract.Entity;

public class Product implements Entity {
	int id;
	String name;
	Double unitPrice;
	String campaingCode;
	public Product(int id, String name, Double unitPrice, String campaingCode) {
		super();
		this.id = id;
		this.name = name;
		this.unitPrice = unitPrice;
		this.campaingCode = campaingCode;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(Double unitPrice) {
		this.unitPrice = unitPrice;
	}
	public String getCampaingCode() {
		return campaingCode;
	}
	public void setCampaingCode(String campaingCode) {
		this.campaingCode = campaingCode;
	}

}
