package com.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Entity.AnswerBean;
import com.Entity.DailyDouts;
import com.Entity.DailyTask;
import com.Entity.DailyTaskBean;
import com.Entity.DifficultQuetion;
import com.Entity.EnquiryBean;
import com.Entity.FeesReceiptBean;
import com.Entity.InterviewDetailBean;
import com.Entity.KnownQuetion;
import com.Entity.RegisterBean;
import com.dao.StudentDao;

@Service
public class StudentService {
	@Autowired
	private StudentDao studentDao;

	public StudentDao getStudentDao() {
		return studentDao;
	}

	public void setStudentDao(StudentDao studentDao) {
		this.studentDao = studentDao;
	}

	public static boolean enquiry = false;
	public static boolean register = false;

	public void enquirySave(EnquiryBean enquiryBean, HttpSession session, HttpServletRequest request,
			HttpServletResponse response) {
		if (session.getAttribute("enquiryobj") == null && !enquiry) {
			enquiryBean.setDate(LocalDate.now());
			session.setAttribute("RecentEnquiryObj", enquiryBean);
			enquiry = true;
			studentDao.enquiryInsert(enquiryBean);
		} else {
			studentDao.checkEnquiry(session, request, response);
		}

	}

	public void feesRecepitSave(FeesReceiptBean feesReceiptBean, HttpServletRequest request, HttpSession session,
			HttpServletResponse response) {
		if (session.getAttribute("enquiryobj") == null && session.getAttribute("RecentEnquiryObj") == null) {
			studentDao.getEnquiry(session, request, response);
		} else if (session.getAttribute("RegisterObj") == null && session.getAttribute("RecentRegisterObj") == null) {
			studentDao.registerCheck(session, request, response);
		} else {
			feesReceiptBean.setPaymentDate(LocalDate.now());
			feesReceiptBean.setNextInstalmentDate(LocalDate.now().plusMonths(1));
			feesReceiptBean.setTotalfeesPaid(feesReceiptBean.getTotalfeesPaid() + feesReceiptBean.getFeesAmount());
			feesReceiptBean.setBalanceFees(feesReceiptBean.getTotalFees() - feesReceiptBean.getTotalfeesPaid());
			session.setAttribute("Recentfees", feesReceiptBean);
			studentDao.feesReceiptInsert(feesReceiptBean);
		}
	}

	public void interviewDetailsSave(InterviewDetailBean interviewDetailBean, HttpServletRequest request,
			HttpSession session, HttpServletResponse response) {
		if (session.getAttribute("enquiryobj") == null && session.getAttribute("RecentEnquiryObj") == null) {
			studentDao.getEnquiry(session, request, response);
		} else if (session.getAttribute("RegisterObj") == null && session.getAttribute("RecentRegisterObj") == null) {
			studentDao.registerCheck(session, request, response);
		} else if (session.getAttribute("fees") == null && session.getAttribute("Recentfees") == null) {
			studentDao.feesCheck(session, request, response);
		} else {
			List<KnownQuetion> known = new ArrayList<KnownQuetion>(interviewDetailBean.getTotalKnownQuetion());
			for (int i = 1; i <= interviewDetailBean.getTotalKnownQuetion(); i++) {
				KnownQuetion knownQuetion = new KnownQuetion();
				knownQuetion.setQuetion(request.getParameter("question-" + i));
				known.add(knownQuetion);

			}
			List<DifficultQuetion> dificult = new ArrayList<DifficultQuetion>(
					interviewDetailBean.getTotalDificultQuetion());
			for (int i = 1; i <= interviewDetailBean.getTotalDificultQuetion(); i++) {
				DifficultQuetion difficultQuetion = new DifficultQuetion();
				difficultQuetion.setQuetion(request.getParameter("difficult-question-" + i));
				dificult.add(difficultQuetion);

			}
			interviewDetailBean.setKQuetion(known);
			interviewDetailBean.setDQuetion(dificult);

			studentDao.interviewDetailsInsert(interviewDetailBean);
		}
	}

	public void dailyTaskSave(DailyTaskBean dailyTaskBean, HttpServletRequest request, HttpSession session,
			HttpServletResponse response) {
		if (session.getAttribute("enquiryobj") == null && session.getAttribute("RecentEnquiryObj") == null) {
			studentDao.getEnquiry(session, request, response);
		} else if (session.getAttribute("RegisterObj") == null && session.getAttribute("RecentRegisterObj") == null) {
			studentDao.registerCheck(session, request, response);
		} else if (session.getAttribute("fees") == null && session.getAttribute("Recentfees") == null) {
			studentDao.feesCheck(session, request, response);
		} else {
			dailyTaskBean.setDate(LocalDate.now());
			List<DailyTask> task = new ArrayList<DailyTask>(dailyTaskBean.getTotalTask());
			for (int i = 1; i <= dailyTaskBean.getTotalTask(); i++) {
				DailyTask dailyTask = new DailyTask();
				dailyTask.setDailyTask(request.getParameter("task-" + i));
				task.add(dailyTask);

			}
			List<DailyDouts> douts = new ArrayList<DailyDouts>(dailyTaskBean.getTotalDouts());
			for (int i = 1; i <= dailyTaskBean.getTotalDouts(); i++) {
				DailyDouts dailyDouts = new DailyDouts();
				dailyDouts.setDailyDouts(request.getParameter("douts-" + i));
				douts.add(dailyDouts);

			}
			dailyTaskBean.setDailyTask(task);
			dailyTaskBean.setDouts(douts);
			studentDao.dailyTaskInsert(dailyTaskBean);
		}
	}

	public void studentRegisterSave(RegisterBean registerBean, HttpSession session, HttpServletRequest request,
			HttpServletResponse response) {

		if (session.getAttribute("enquiryobj") == null && !enquiry) {
			studentDao.getEnquiry(session, request, response);
		} else {
			if (session.getAttribute("RegisterObj") == null && !register) {
				session.setAttribute("RecentRegisterObj", registerBean);
				registerBean.setDate(LocalDate.now());
				register = true;
				studentDao.studentRegisterInsert(registerBean, session, request, response);
			} else {
				studentDao.allReadyRegister(session, request, response);
			}
		}

	}

	public void logout(HttpSession session) {
		session.invalidate();
	}

	public void answerSave(AnswerBean answerBean, HttpServletRequest request, HttpSession session,
			HttpServletResponse response) {
		if (session.getAttribute("enquiryobj") == null && session.getAttribute("RecentEnquiryObj") == null) {
			studentDao.getEnquiry(session, request, response);
		} else if (session.getAttribute("RegisterObj") == null && session.getAttribute("RecentRegisterObj") == null) {
			studentDao.registerCheck(session, request, response);
		} else if (session.getAttribute("fees") == null && session.getAttribute("Recentfees") == null) {
			studentDao.feesCheck(session, request, response);
		} else {

			studentDao.answerInsert(answerBean, session, request, response);
		}
	}
}
