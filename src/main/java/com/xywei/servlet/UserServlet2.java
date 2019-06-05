package com.xywei.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/servlet/user2")
public class UserServlet2 extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5156533795181455084L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		this.doPost(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println(">>>>>>>>>>>>>>>>>>>>>user2 start");
		System.out.println(">>>>>>>>>>>>>>>>>>>>>注解实现的servlet3.0");
		System.out.println("username>>>>>>>>>>>>：" + req.getParameter("username"));
		System.out.println("userPassword>>>>>>>>>>>>" + req.getParameter("userPassword"));
		System.out.println(">>>>>>>>>>>>>>>>>>>>>user2 end");
		req.setAttribute("username", req.getParameter("username"));
		req.setAttribute("userPassword", req.getParameter("userPassword"));
		System.out.println(">>>>>>>>>>>>>>>>>>>>getAttribute：" + req.getAttribute("username"));
		System.out.println(">>>>>>>>>>>>>>>>>>>>getAttribute：" + req.getAttribute("userPassword"));
		req.getRequestDispatcher("/WEB-INF/user.jsp").forward(req, resp);
	}
}
