package com.xywei.filter;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/filter/studentServlet2", description = "测试使用filter", initParams = {
		@WebInitParam(name = "initialParameter", value = "云无相 servlet2", description = "测试注解下使用servlet下的参数") })
public class StudentServlet2 extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6502163321483948093L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		this.doPost(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setCharacterEncoding("UTF-8");
		resp.setContentType("text/html;charset=UTF-8");
		resp.getWriter().write("我是中文编码");
		resp.getWriter().write("<h1>");
		resp.getWriter().write("注解下使用的参数：" + this.getInitParameter(("initialParameter")) + "<br/>");
		// 没有作用
		// resp.getWriter().write("student
		// servlet2注解下使用的context-param参数："+getServletContext().getInitParameter(("contextParam")));

		resp.getWriter().write(
				"student servlet2注解下使用的context-param参数：" + getServletContext().getInitParameter(("context_param")));
		resp.getWriter().write("<br/>"+
				"listener使用的context-param参数：" + getServletContext().getInitParameter("param"));
		resp.getWriter().write("</h1>");

	}

}
