package com.xywei.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 有三种方式：1，实现servlet接口，2，继承genericServlet，3继承httpServlet（常用）
 * 
 * @author wodoo
 *
 */
@WebServlet(urlPatterns = { "/servlet/user" })
public class UserServlet extends HttpServlet {

	private static final long serialVersionUID = 5366160994107901459L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		this.doPost(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println(">>>>>>>>>>>>>>>>>>>>>注解实现的servlet3.0");
		System.out.println("username>>>>>>>>>>>>：" + req.getParameter("username"));
		System.out.println("userPassword>>>>>>>>>>>>" + req.getParameter("userPassword"));
		// 转发
		// req.getRequestDispatcher("/servlet/user2").forward(req, resp);
		// 重定向
		 resp.sendRedirect("user2");
	}

}
