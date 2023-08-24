package com.dao;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.Entity.HomeBean;

public interface HomeDao {
	public void insert(HomeBean homeBean, HttpServletResponse response, HttpServletRequest request);

	public void matchLogin(HomeBean homeBean, HttpServletResponse response, HttpSession session);

	public void registerObject(HomeBean homeBean, HttpServletResponse response, HttpSession session);

	public void enquiryObject(HomeBean homeBean, HttpServletResponse response, HttpSession session);

	public void feesObject(HomeBean homeBean, HttpServletResponse response, HttpSession session);

	public void doutsObject(HomeBean homeBean, HttpServletResponse response, HttpSession session);

}