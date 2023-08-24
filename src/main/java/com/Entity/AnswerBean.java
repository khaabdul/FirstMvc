package com.Entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class AnswerBean {
	@Id
	private int answerId;
	private int studentId;
	private String studentName;
	private String question;
	private List<ManyAnswer> answer;
	public int getAnswerId() {
		return answerId;
	}
	public void setAnswerId(int answerId) {
		this.answerId = answerId;
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
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public List<ManyAnswer> getAnswer() {
		return answer;
	}
	public void setAnswer(List<ManyAnswer> answer) {
		this.answer = answer;
	}
	
}
