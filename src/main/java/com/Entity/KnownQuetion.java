package com.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class KnownQuetion {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String quetion;
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getQuetion() {
		return quetion;
	}

	public void setQuetion(String quetion) {
		this.quetion = quetion;
	}

	@Override
	public String toString() {
		return "KnownQuetion [id=" + id + ", quetion=" + quetion + "]";
	}




	

}
