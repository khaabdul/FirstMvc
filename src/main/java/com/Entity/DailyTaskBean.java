package com.Entity;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class DailyTaskBean {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private int Student_Id;
	private String name;
	private String phoneNumber;
	private int totalTask;
	private int totalDouts;
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<DailyTask> dailyTask;
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<DailyDouts> douts;
	private LocalDate date;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getStudent_Id() {
		return Student_Id;
	}

	public void setStudent_Id(int student_Id) {
		Student_Id = student_Id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public int getTotalTask() {
		return totalTask;
	}

	public void setTotalTask(int totalTask) {
		this.totalTask = totalTask;
	}

	public int getTotalDouts() {
		return totalDouts;
	}

	public void setTotalDouts(int totalDouts) {
		this.totalDouts = totalDouts;
	}

	public List<DailyTask> getDailyTask() {
		return dailyTask;
	}

	public void setDailyTask(List<DailyTask> dailyTask) {
		this.dailyTask = dailyTask;
	}

	public List<DailyDouts> getDouts() {
		return douts;
	}

	public void setDouts(List<DailyDouts> douts) {
		this.douts = douts;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

}
