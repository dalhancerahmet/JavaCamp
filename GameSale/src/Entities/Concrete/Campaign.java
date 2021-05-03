package Entities.Concrete;

import Entities.Abstract.Entity;

public class Campaign implements Entity {
	int id;
	String name;
	String campaingCode;
	String campaingInformation;
	Double discountRate;
	public Campaign(int id, String name, String campaingCode, Double discountRate,String campaingInformation) {
		super();
		this.id = id;
		this.name = name;
		this.campaingCode = campaingCode;
		this.discountRate = discountRate;
		this.campaingInformation= campaingInformation;
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
	public String getCampaingCode() {
		return campaingCode;
	}
	public void setCampaingCode(String campaingCode) {
		this.campaingCode = campaingCode;
	}
	public Double getDiscountRate() {
		return discountRate;
	}
	public void setDiscountRate(Double discountRate) {
		this.discountRate = discountRate;
	}
	public String getCampaingInformation() {
		return campaingInformation;
	}
	public void setCampaingInformation(String campaingInformation) {
		this.campaingInformation = campaingInformation;
	}
}
