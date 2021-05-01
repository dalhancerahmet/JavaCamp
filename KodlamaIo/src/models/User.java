package models;

public class User {
	int id;
	String firsName;
	String lastName;
	String userName;
	String password;
	String email;
	boolean active;
	public User(int id, String firsName, String lastName, String userName, String password, String email,
			boolean active) {
		super();
		this.id = id;
		this.firsName = firsName;
		this.lastName = lastName;
		this.userName = userName;
		this.password = password;
		this.email = email;
		this.active = active;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirsName() {
		return firsName;
	}
	public void setFirsName(String firsName) {
		this.firsName = firsName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}
}
