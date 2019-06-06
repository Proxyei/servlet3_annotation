package com.xywei.servletcontext;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class MyFilter implements Filter {

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		System.out.println(
				"动态注册组件filter启动<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<" + filterConfig.getServletContext().getContextPath());
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>我是动态注册的filter");
		chain.doFilter(request, response);
	}

	@Override
	public void destroy() {
		System.out.println("动态注册组件filter销毁<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");

	}

}
