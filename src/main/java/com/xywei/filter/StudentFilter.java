package com.xywei.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;

@WebFilter(description="测试注解servlet下使用filter",filterName="studentFilter",urlPatterns= {"/filter/studentServlet"})
public class StudentFilter implements Filter{

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		System.out.println("初始化filter<<<<<<");
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		System.out.println(">>>>>进入filter<<<<<");
		//获取的是项目名字
		System.out.println(request.getServletContext().getContextPath());
		HttpServletRequest request2=(HttpServletRequest) request;
		System.out.println("请求路径>>>>>："+request2.getRequestURL().toString());
		chain.doFilter(request, response);
		System.out.println(">>>>>返回	filter<<<<<");
	}

	@Override
	public void destroy() {
		System.out.println("结束filter<<<<<");
	}

}
