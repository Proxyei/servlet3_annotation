package com.xywei.filter;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/filter/studentServlet", description = "测试使用filter", initParams = {
		@WebInitParam(name = "initialParameter", value = "云无相", description = "测试注解下使用servlet下的参数") })
// 直接设置不起作用
// @WebInitParam(description="context-param范围参数，在studentServlet2中获取",name="contextParam",value="context-value")
public class StudentServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6502163321483948093L;

	// TODO 待研究，也不起作用
	// @Override
	// public void init(ServletConfig config) throws ServletException {
	// getServletContext().setInitParameter("context_param", "我是context范围的value");
	// }

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
		// resp.getWriter().write("servlet注解下使用的context-param参数："+this.getInitParameter(("contextParam")));
		// 也不能再这里配置，否则java.lang.IllegalStateException: Initialization parameters cannot
		// be set after the context has been initialized
		// getServletContext().setInitParameter("context_param", "我是context范围的value");
		resp.getWriter().write("</h1>");

	}

}
