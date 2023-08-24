package com.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Douts")
public class DailyDouts {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String dailyDouts;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDailyDouts() {
		return dailyDouts;
	}

	public void setDailyDouts(String dailyDouts) {
		this.dailyDouts = dailyDouts;
	}

}
