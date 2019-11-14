package org.jpa.springjpa.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "STUDENT")
public class Student {
	@Id
	private Integer id;
	private String name;
	private String branch;
	private int percentage;
	private int phone;
	private String email;
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
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public int getPercentage() {
		return percentage;
	}
	public void setPercentage(int percentage) {
		this.percentage = percentage;
	}
	public int getPhone() {
		return phone;
	}
	public void setPhone(int phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();

		sb.append("Id = ").append(id).append(" - ");
		sb.append("Name = ").append(name).append(" - ");
		sb.append("Branch = ").append(branch).append(" - ");
		sb.append("Percentage = ").append(percentage).append(" - ");
		sb.append("Phone = ").append(phone).append(" - ");
		sb.append("Email = ").append(email); 
		return sb.toString();
	}
	
	
}
