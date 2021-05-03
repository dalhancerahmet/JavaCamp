package Entities.Concrete;

import Entities.Abstract.Entity;

public class Player implements Entity {
	int id;
	String firstName;
	String lastName;
	String email;
	int birthDayYear;
	String nationalityId;
	String userName;
	String password;
	Double wallet;
	String campaignCode;
	public Player(int id, String firstName,String lastName, String email, String userName, String password, Double wallet,String nationalityId,int birthDayYear,String campaignCode) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.userName = userName;
		this.password = password;
		this.wallet = wallet;
		this.nationalityId=nationalityId;
		this.birthDayYear= birthDayYear;
		this.campaignCode=campaignCode;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Double getWallet() {
		return wallet;
	}
	public void setWallet(Double wallet) {
		this.wallet = wallet;
	}
	public int getBirthDayYear() {
		return birthDayYear;
	}
	public void setBirthDayYear(int birthDayYear) {
		this.birthDayYear = birthDayYear;
	}
	public String getNationalityId() {
		return nationalityId;
	}
	public void setNationalityId(String nationalityId) {
		this.nationalityId = nationalityId;
	}
	public String getCampaignCode() {
		return campaignCode;
	}
	public void setCampaignCode(String campaignCode) {
		this.campaignCode = campaignCode;
	}
}
