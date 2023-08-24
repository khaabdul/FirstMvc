package com.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ManyAnswer {
	@Id
	private int id;
	private int studentId;
	private String studentName;
	private String studentanswer;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getStudentanswer() {
		return studentanswer;
	}

	public void setStudentanswer(String studentanswer) {
		this.studentanswer = studentanswer;
	}

}
