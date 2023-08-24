package com.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class DifficultQuetion {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String Quetion;


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getQuetion() {
		return Quetion;
	}

	public void setQuetion(String quetion) {
		Quetion = quetion;
	}

	@Override
	public String toString() {
		return "DifficultQuetion [id=" + id + ", Quetion=" + Quetion + "]";
	}

	

}
