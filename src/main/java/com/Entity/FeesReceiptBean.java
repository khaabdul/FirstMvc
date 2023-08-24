package com.Entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class FeesReceiptBean {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int receiptNo;
	@Column(name = "StudentId")
	private int id;
	private int instalmentNo;
	private String name;
	private String email;
	private String number;
	private String course;
	private int totalFees;
	private int totalfeesPaid;
	private int balanceFees;
	private LocalDate nextInstalmentDate;
	private LocalDate paymentDate;
	private int feesAmount;
	private String paymentMode;

	public int getInstalmentNo() {
		return instalmentNo;
	}

	public void setInstalmentNo(int instalmentNo) {
		this.instalmentNo = instalmentNo;
	}

	public int getTotalfeesPaid() {
		return totalfeesPaid;
	}

	public void setTotalfeesPaid(int totalfeesPaid) {
		this.totalfeesPaid = totalfeesPaid;
	}

	public int getReceiptNo() {
		return receiptNo;
	}

	public void setReceiptNo(int receiptNo) {
		this.receiptNo = receiptNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public int getTotalFees() {
		return totalFees;
	}

	public void setTotalFees(int totalFees) {
		this.totalFees = totalFees;
	}

	public String getPaymentMode() {
		return paymentMode;
	}

	public void setPaymentMode(String paymentMode) {
		this.paymentMode = paymentMode;
	}

	public int getId() {
		return id;
	}

	public int getFeesAmount() {
		return feesAmount;
	}

	public void setFeesAmount(int feesAmount) {
		this.feesAmount = feesAmount;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getBalanceFees() {
		return balanceFees;
	}

	public void setBalanceFees(int balanceFees) {
		this.balanceFees = balanceFees;
	}

	public LocalDate getNextInstalmentDate() {
		return nextInstalmentDate;
	}

	public void setNextInstalmentDate(LocalDate nextInstalmentDate) {
		this.nextInstalmentDate = nextInstalmentDate;
	}

	public LocalDate getPaymentDate() {
		return paymentDate;
	}

	public void setPaymentDate(LocalDate paymentDate) {
		this.paymentDate = paymentDate;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
