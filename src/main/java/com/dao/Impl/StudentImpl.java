package com.dao.Impl;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.Entity.AnswerBean;
import com.Entity.DailyTaskBean;
import com.Entity.EnquiryBean;
import com.Entity.FeesReceiptBean;
import com.Entity.InterviewDetailBean;
import com.Entity.RegisterBean;
import com.dao.StudentDao;

@Repository
@Component
public class StudentImpl implements StudentDao {
	@Autowired
	private HibernateTemplate hibernateTemplate;

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	@Transactional
	public void enquiryInsert(EnquiryBean enquiryBean) {
		hibernateTemplate.save(enquiryBean);
	}

	@Transactional
	public void interviewDetailsInsert(InterviewDetailBean interviewDetailBean) {
		hibernateTemplate.save(interviewDetailBean);
	}

	@Transactional
	public void feesReceiptInsert(FeesReceiptBean feesReceiptBean) {
		hibernateTemplate.save(feesReceiptBean);
	}

	@Transactional
	public void dailyTaskInsert(DailyTaskBean dailyTaskBean) {
		hibernateTemplate.save(dailyTaskBean);
	}

	@Transactional
	public void studentRegisterInsert(RegisterBean registerBean, HttpSession session, HttpServletRequest request,
			HttpServletResponse response) {
		List<RegisterBean> loadAll = hibernateTemplate.loadAll(RegisterBean.class);

		RequestDispatcher requestDispatcher = request.getRequestDispatcher("studentregister");
		for (RegisterBean registerBean2 : loadAll) {
			if (registerBean2.getAdharNumber().equals(registerBean.getAdharNumber())) {
				request.setAttribute("adhar", "Adhar Number Already Used");
				try {
					requestDispatcher.forward(request, response);
				} catch (ServletException e) {
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				}
			} else if (registerBean2.getPanNumber().equals(registerBean.getPanNumber())) {
				request.setAttribute("pan", "Pan Number Already Used");
				try {
					requestDispatcher.forward(request, response);
				} catch (ServletException e) {
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				}
			} else {
				hibernateTemplate.persist(registerBean);
			}
		}
	}

	public void checkEnquiry(HttpSession session, HttpServletRequest request, HttpServletResponse response) {
		try {
			request.setAttribute("already", "Enquirey Already Done Proced To Register Form ");
			request.getRequestDispatcher("enquiry").forward(request, response);
		} catch (ServletException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public void getEnquiry(HttpSession session, HttpServletRequest request, HttpServletResponse response) {
		try {
			request.setAttribute("first", "Fill Enquiry Form First");
			request.getRequestDispatcher("enquiry").forward(request, response);
		} catch (ServletException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void allReadyRegister(HttpSession session, HttpServletRequest request, HttpServletResponse response) {
		try {
			request.setAttribute("exist", "Already Register");
			request.getRequestDispatcher("studentregistration").forward(request, response);
		} catch (ServletException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void registerCheck(HttpSession session, HttpServletRequest request, HttpServletResponse response) {
		try {
			request.setAttribute("reg", "Complete Register First");
			request.getRequestDispatcher("studentregistration").forward(request, response);
		} catch (ServletException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void feesCheck(HttpSession session, HttpServletRequest request, HttpServletResponse response) {
		try {
			request.setAttribute("fe", "Complete Fees Payment");
			request.getRequestDispatcher("feesDetails").forward(request, response);
		} catch (ServletException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void answerInsert(AnswerBean answerBean, HttpSession session, HttpServletRequest request,
			HttpServletResponse response) {
		List<AnswerBean> loadAll = hibernateTemplate.loadAll(AnswerBean.class);
		for (AnswerBean answerBean2 : loadAll) {
			if (answerBean.getQuestion().equals(answerBean2.getQuestion())) {

			} else {
				hibernateTemplate.save(answerBean);
			}
		}

	}

}
