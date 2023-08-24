package com.Service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Entity.HomeBean;
import com.dao.HomeDao;

@Service
public class HomeService {

	@Autowired
	private HomeDao homeDao;

	public HomeDao getHomeDao() {
		return homeDao;
	}

	public void setHomeDao(HomeDao homeDao) {
		this.homeDao = homeDao;
	}

	public void insert(HomeBean homeBean, HttpServletResponse response, HttpServletRequest request) {
		if (homeBean.getPassword().equals(homeBean.getConfromPassword())) {
			homeDao.insert(homeBean, response, request);
		} else {
			System.out.println(homeBean);
		}
	}

	public void matchLogin(HomeBean homeBean, HttpServletResponse response, HttpSession session) {
		homeDao.enquiryObject(homeBean, response, session);
		homeDao.registerObject(homeBean, response, session);
		homeDao.feesObject(homeBean, response, session);
		homeDao.matchLogin(homeBean, response, session);

	}

}
