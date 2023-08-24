package com.Entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "Register")
public class RegisterBean {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "StudentId")
	private int id;
	@Column(name = "DateOfJoning")
	private LocalDate date;
	@Lob
	private byte[] profileImage;
	@Transient
	private String getprofile;
	private String name;
	private String address;
	private String gender;
	private String marritualStatus;
	private String dateOfBirth;
	private String panNumber;
	private String adharNumber;
	private String course;
	private String contactNo;
	private String email;
	private String Qualification;
	private String sscSchoolName;
	private String sscPercentage;
	private String sscYearOfPassing;
	private String hscSchoolName;
	private String hscPercentage;
	private String hscYearOfPassing;
	private String graduationCollegeName;
	private String graduationPercentage;
	private String graduationYearOfPassing;
	private String postgraduationQualification;
	private String postgraduationPercentage;
	private String postgraduationYearOfPassing;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public byte[] getProfileImage() {
		return profileImage;
	}

	public void setProfileImage(byte[] profileImage) {
		this.profileImage = profileImage;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getMarritualStatus() {
		return marritualStatus;
	}

	public void setMarritualStatus(String marritualStatus) {
		this.marritualStatus = marritualStatus;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getPanNumber() {
		return panNumber;
	}

	public void setPanNumber(String panNumber) {
		this.panNumber = panNumber;
	}

	public String getAdharNumber() {
		return adharNumber;
	}

	public void setAdharNumber(String adharNumber) {
		this.adharNumber = adharNumber;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public String getContactNo() {
		return contactNo;
	}

	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getQualification() {
		return Qualification;
	}

	public void setQualification(String qualification) {
		Qualification = qualification;
	}

	public String getSscSchoolName() {
		return sscSchoolName;
	}

	public void setSscSchoolName(String sscSchoolName) {
		this.sscSchoolName = sscSchoolName;
	}

	public String getSscPercentage() {
		return sscPercentage;
	}

	public void setSscPercentage(String sscPercentage) {
		this.sscPercentage = sscPercentage;
	}

	public String getSscYearOfPassing() {
		return sscYearOfPassing;
	}

	public void setSscYearOfPassing(String sscYearOfPassing) {
		this.sscYearOfPassing = sscYearOfPassing;
	}

	public String getHscSchoolName() {
		return hscSchoolName;
	}

	public void setHscSchoolName(String hscSchoolName) {
		this.hscSchoolName = hscSchoolName;
	}

	public String getHscPercentage() {
		return hscPercentage;
	}

	public void setHscPercentage(String hscPercentage) {
		this.hscPercentage = hscPercentage;
	}

	public String getHscYearOfPassing() {
		return hscYearOfPassing;
	}

	public void setHscYearOfPassing(String hscYearOfPassing) {
		this.hscYearOfPassing = hscYearOfPassing;
	}

	public String getGraduationCollegeName() {
		return graduationCollegeName;
	}

	public void setGraduationCollegeName(String graduationCollegeName) {
		this.graduationCollegeName = graduationCollegeName;
	}

	public String getGraduationPercentage() {
		return graduationPercentage;
	}

	public void setGraduationPercentage(String graduationPercentage) {
		this.graduationPercentage = graduationPercentage;
	}

	public String getGraduationYearOfPassing() {
		return graduationYearOfPassing;
	}

	public void setGraduationYearOfPassing(String graduationYearOfPassing) {
		this.graduationYearOfPassing = graduationYearOfPassing;
	}

	public String getPostgraduationQualification() {
		return postgraduationQualification;
	}

	public void setPostgraduationQualification(String postgraduationQualification) {
		this.postgraduationQualification = postgraduationQualification;
	}

	public String getPostgraduationPercentage() {
		return postgraduationPercentage;
	}

	public void setPostgraduationPercentage(String postgraduationPercentage) {
		this.postgraduationPercentage = postgraduationPercentage;
	}

	public String getPostgraduationYearOfPassing() {
		return postgraduationYearOfPassing;
	}

	public void setPostgraduationYearOfPassing(String postgraduationYearOfPassing) {
		this.postgraduationYearOfPassing = postgraduationYearOfPassing;
	}

	public String getGetprofile() {
		return getprofile;
	}

	public void setGetprofile(String getprofile) {
		this.getprofile = getprofile;
	}

}
