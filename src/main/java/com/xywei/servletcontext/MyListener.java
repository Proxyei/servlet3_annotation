package com.xywei.servletcontext;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class MyListener implements ServletContextListener {

	@Override
	public void contextInitialized(ServletContextEvent sce) {
		System.out.println(this.getClass()+"编程式注册-动态注册组件>>>>>>>>>>>>>>>>>>>>listener initial");
	}

	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		System.out.println(this.getClass()+"动态注册组件>>>>>>>>>>>>>>>>>>>>listener end ");

	}

}
