package com.xywei.listener;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class CustomListener implements ServletContextListener {

	@Override
	public void contextInitialized(ServletContextEvent sce) {
		System.out.println(this.getClass()+"硬编码中的listener>>>>>>>>>");
		ServletContext servletContext = sce.getServletContext();
		servletContext.setInitParameter(this.getClass()+"param", "这是listener中设置的参数");
	}

	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		//TODO 好像没销毁到!
		System.out.println(this.getClass()+">>>>>>>>>>>>>>>>硬编码的listener销毁了<<<<<<<<<<<<<<<<<<<<<<<<");

	}

}
