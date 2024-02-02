package com.cg.am;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Admin {
	private int id;
	private String name;
	private String password;
	private String mall;
	private Double phone;
	
	public Admin() {
		super();
	}
	
	public Admin(int id, String name, String password, String mall, Double phone) {
		super();
		this.id = id;
		this.name = name;
		this.password = password;
		this.mall = mall;
		this.phone = phone;
	}
	@Id
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
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getMall() {
		return mall;
	}
	public void setMall(String mall) {
		this.mall = mall;
	}
	public Double getPhone() {
		return phone;
	}
	public void setPhone(double phone) {
		this.phone = phone;
	}
	
	@Override
	public String toString() {
		return "AdminService [id=" + id + ", name=" + name + ", password=" + password + ", mall=" + mall + ", phone="
				+ phone + ", getId()=" + getId() + ", getName()=" + getName() + ", getPassword()=" + getPassword()
				+ ", getMall()=" + getMall() + ", getPhone()=" + getPhone() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
}

