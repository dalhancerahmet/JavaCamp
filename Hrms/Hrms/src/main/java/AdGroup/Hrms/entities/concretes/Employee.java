package AdGroup.Hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Employees")
public class Employee {
	
	@Id
	@GeneratedValue
	@Column(name="id")
	private int id;
	
	@Column(name="firstName")
	private String firsName;
	
	@Column(name="lastName")
	private String lastName;
	
	@Column(name="email")
	private String email;
	
	@Column(name="password")
	private String password;
	
	@Column(name="active")
	private boolean active;
	
	public Employee() {}
	
	public Employee(int id, String firsName, String lastName, String email, String password, boolean active) {
		super();
		this.id = id;
		this.firsName = firsName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
		this.active= active;
	}

	public int getId() {
		return id;
	}

	public String getFirsName() {
		return firsName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getEmail() {
		return email;
	}

	public String getPassword() {
		return password;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setFirsName(String firsName) {
		this.firsName = firsName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}
	

}
