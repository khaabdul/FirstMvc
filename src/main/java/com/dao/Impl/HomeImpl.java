package com.dao.Impl;

import java.io.IOException;
import java.util.List;

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
import com.Entity.EnquiryBean;
import com.Entity.FeesReceiptBean;
import com.Entity.HomeBean;
import com.Entity.RegisterBean;
import com.dao.HomeDao;

@Repository
@Component
public class HomeImpl implements HomeDao {

	@Autowired
	private HibernateTemplate hibernateTemplate;

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	@Transactional
	public void insert(HomeBean homeBean, HttpServletResponse response, HttpServletRequest request) {
		List<HomeBean> loadAll = hibernateTemplate.loadAll(HomeBean.class);
		boolean flag = false;
		for (HomeBean homeBean2 : loadAll) {

			if (homeBean.getEmail().equals(homeBean2.getEmail())
					|| homeBean.getNumber().equals(homeBean2.getNumber())) {
				flag = true;
				request.setAttribute("msg", "Email Or Number Is Already Used");
				try {
					request.getRequestDispatcher("/register").forward(request, response);
				} catch (ServletException e) {
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				}

				break;
			} else {
				flag = false;
			}
		}
		if (!flag)

		{
			hibernateTemplate.save(homeBean);
			try {
				request.setAttribute("msg", "Succefully Register Please Login");
				request.getRequestDispatcher("/login").forward(request, response);
			} catch (ServletException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public void matchLogin(HomeBean homeBean, HttpServletResponse response, HttpSession session) {
		List<HomeBean> loadAll = hibernateTemplate.loadAll(HomeBean.class);
		for (HomeBean homeBean2 : loadAll) {
			if ((homeBean.getEmail().equals(homeBean2.getEmail()) || homeBean.getEmail().equals(homeBean2.getNumber()))
					&& (homeBean.getPassword().equals(homeBean2.getPassword()))) {
				try {
					homeBean.setName(homeBean2.getName());
					homeBean.setNumber(homeBean2.getNumber());
					homeBean.setEmail(homeBean2.getEmail());
					session.setAttribute("studentObj", homeBean);
					response.sendRedirect("loginhome");
				} catch (IOException e) {
					e.printStackTrace();
				}

				break;
			}
		}
	}

	public void registerObject(HomeBean homeBean, HttpServletResponse response, HttpSession session) {
		List<RegisterBean> loadAll1 = hibernateTemplate.loadAll(RegisterBean.class);
		for (RegisterBean registerBean : loadAll1) {
			if (homeBean.getEmail().equals(registerBean.getEmail())
					|| homeBean.getEmail().equals(registerBean.getContactNo())) {
				String printBase64Binary = javax.xml.bind.DatatypeConverter
						.printBase64Binary(registerBean.getProfileImage());
				registerBean.setGetprofile(printBase64Binary);
				session.setAttribute("RegisterObj", registerBean);
				break;
			}
		}
	}

	public void enquiryObject(HomeBean homeBean, HttpServletResponse response, HttpSession session) {
		List<EnquiryBean> loadAll1 = hibernateTemplate.loadAll(EnquiryBean.class);
		for (EnquiryBean enquiryBean : loadAll1) {
			if (homeBean.getEmail().equals(enquiryBean.getEmail())
					|| homeBean.getEmail().equals(enquiryBean.getContactNo())) {
				session.setAttribute("enquiryobj", enquiryBean);
				break;
			}
		}
	}

	public void feesObject(HomeBean homeBean, HttpServletResponse response, HttpSession session) {
		List<FeesReceiptBean> loadAll = hibernateTemplate.loadAll(FeesReceiptBean.class);
		for (FeesReceiptBean feesReceiptBean2 : loadAll) {
			if (homeBean.getEmail().equals(feesReceiptBean2.getEmail())
					|| homeBean.getEmail().equals(feesReceiptBean2.getNumber())) {
				session.setAttribute("fees", feesReceiptBean2);
			}
		}

	}

	public void doutsObject(HomeBean homeBean, HttpServletResponse response, HttpSession session) {

		List<AnswerBean> loadAll = hibernateTemplate.loadAll(AnswerBean.class);
		for (AnswerBean answerBean : loadAll) {

			session.setAttribute("answer", answerBean);

		}

	}

}
