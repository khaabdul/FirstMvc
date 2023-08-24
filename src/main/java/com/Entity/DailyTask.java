package com.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Task")
public class DailyTask {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String dailyTask;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDailyTask() {
		return dailyTask;
	}

	public void setDailyTask(String dailyTask) {
		this.dailyTask = dailyTask;
	}

}
