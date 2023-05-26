package com.springrest.springrest.manager;

import jakarta.persistence.*;

@Entity
@Table(name="manager")
public class Manager {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long manager_id;
	
	@Column(name="manager_name")
	private String manager_name;
	
	@Column(name="manager_email_id")
	private String manager_email_id;
	
	@Column(name="manager_phone")
	private String manager_phone;
	
	@Column(name="manager_password")
	private String manager_password;
	
	public Manager() {
		// TODO Auto-generated constructor stub
	}
	
	public Manager(String manager_name, String manager_email_id, String manager_phone,
			String manager_password) {
		super();
		this.manager_name = manager_name;
		this.manager_email_id = manager_email_id;
		this.manager_phone = manager_phone;
		this.manager_password = manager_password;
	}
	

	public long getManager_id() {
		return manager_id;
	}
	public void setManager_id(long manager_id) {
		this.manager_id = manager_id;
	}
	public String getManager_name() {
		return manager_name;
	}
	public void setManager_name(String manager_name) {
		this.manager_name = manager_name;
	}
	public String getManager_email_id() {
		return manager_email_id;
	}
	public void setManager_email_id(String manager_email_id) {
		this.manager_email_id = manager_email_id;
	}
	public String getManager_phone() {
		return manager_phone;
	}
	public void setManager_phone(String manager_phone) {
		this.manager_phone = manager_phone;
	}
	public String getManager_password() {
		return manager_password;
	}
	public void setManager_password(String manager_password) {
		this.manager_password = manager_password;
	}
	
	
}
