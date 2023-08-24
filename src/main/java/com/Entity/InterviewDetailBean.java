package com.Entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Interview_Detail")
public class InterviewDetailBean {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private int Student_Id;
	private String name;
	private long phoneNumber;
	private String companyName;
	private String HRName;
	private long HRPhoneNumber;
	private String position;
	private String technology;
	private String date;
	private int totalKnownQuetion;
	private int totalDificultQuetion;
	private String CrackedInterview;
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<KnownQuetion> KQuetion;
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<DifficultQuetion> DQuetion;

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

	public long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getHRName() {
		return HRName;
	}

	public void setHRName(String hRName) {
		HRName = hRName;
	}

	public long getHRPhoneNumber() {
		return HRPhoneNumber;
	}

	public void setHRPhoneNumber(long hRPhoneNumber) {
		HRPhoneNumber = hRPhoneNumber;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public String getTechnology() {
		return technology;
	}

	public void setTechnology(String technology) {
		this.technology = technology;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public int getTotalKnownQuetion() {
		return totalKnownQuetion;
	}

	public void setTotalKnownQuetion(int totalKnownQuetion) {
		this.totalKnownQuetion = totalKnownQuetion;
	}

	public int getTotalDificultQuetion() {
		return totalDificultQuetion;
	}

	public void setTotalDificultQuetion(int totalDificultQuetion) {
		this.totalDificultQuetion = totalDificultQuetion;
	}

	public String getCrackedInterview() {
		return CrackedInterview;
	}

	public void setCrackedInterview(String crackedInterview) {
		CrackedInterview = crackedInterview;
	}

	public List<KnownQuetion> getKQuetion() {
		return KQuetion;
	}

	public void setKQuetion(List<KnownQuetion> kQuetion) {
		KQuetion = kQuetion;
	}

	public List<DifficultQuetion> getDQuetion() {
		return DQuetion;
	}

	public void setDQuetion(List<DifficultQuetion> dQuetion) {
		DQuetion = dQuetion;
	}
	

	public int getStudent_Id() {
		return Student_Id;
	}

	public void setStudent_Id(int student_Id) {
		Student_Id = student_Id;
	}

	@Override
	public String toString() {
		return "InterviewDetailBean [id=" + id + ", name=" + name + ", phoneNumber=" + phoneNumber + ", companyName="
				+ companyName + ", HRName=" + HRName + ", HRPhoneNumber=" + HRPhoneNumber + ", position=" + position
				+ ", technology=" + technology + ", date=" + date + ", totalKnownQuetion=" + totalKnownQuetion
				+ ", totalDificultQuetion=" + totalDificultQuetion + ", CrackedInterview=" + CrackedInterview
				+ ", KQuetion=" + KQuetion + ", DQuetion=" + DQuetion + "]";
	}

}
