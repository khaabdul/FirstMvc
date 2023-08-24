package com.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

@Component
@Entity
public class HomeBean {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String email;
	private String number;
	private String password;
	private String confromPassword;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getConfromPassword() {
		return confromPassword;
	}

	public void setConfromPassword(String confromPassword) {
		this.confromPassword = confromPassword;
	}

	@Override
	public String toString() {
		return "HomeBean [id=" + id + ", name=" + name + ", email=" + email + ", number=" + number + ", password="
				+ password + ", confromPassword=" + confromPassword + "]";
	}
	

}
