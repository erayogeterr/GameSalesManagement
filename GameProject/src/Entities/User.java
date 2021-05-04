package Entities;

import Abstract.EntityService;

public class User implements EntityService {
	
	private int id;
	private int customerId;
	private String email;
	private String password;
	
	public User() {
		
	}
	
	public User(int id, int customerId, String email, String password) {
		super();
		this.id = id;
		this.customerId = customerId;
		this.email = email;
		this.password = password;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
}
