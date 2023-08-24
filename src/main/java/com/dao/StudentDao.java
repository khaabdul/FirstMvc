package com.dao;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.Entity.AnswerBean;
import com.Entity.DailyTaskBean;
import com.Entity.EnquiryBean;
import com.Entity.FeesReceiptBean;
import com.Entity.InterviewDetailBean;
import com.Entity.RegisterBean;

public interface StudentDao {
	public void enquiryInsert(EnquiryBean enquiryBean);

	public void interviewDetailsInsert(InterviewDetailBean interviewDetailBean);

	public void feesReceiptInsert(FeesReceiptBean feesReceiptBean);

	public void dailyTaskInsert(DailyTaskBean dailyTaskBean);

	public void studentRegisterInsert(RegisterBean registerBean, HttpSession session, HttpServletRequest request,
			HttpServletResponse response);

	public void answerInsert(AnswerBean answerBean, HttpSession session, HttpServletRequest request,
			HttpServletResponse response);

	public void checkEnquiry(HttpSession session, HttpServletRequest request, HttpServletResponse response);

	public void getEnquiry(HttpSession session, HttpServletRequest request, HttpServletResponse response);

	public void allReadyRegister(HttpSession session, HttpServletRequest request, HttpServletResponse response);

	public void registerCheck(HttpSession session, HttpServletRequest request, HttpServletResponse response);

	public void feesCheck(HttpSession session, HttpServletRequest request, HttpServletResponse response);
}
