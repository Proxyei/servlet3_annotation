package com.xywei.servletcontext;

import java.util.EnumSet;
import java.util.Set;

import javax.servlet.DispatcherType;
import javax.servlet.FilterRegistration;
import javax.servlet.ServletContainerInitializer;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

public class MyServletContainerInitializer implements ServletContainerInitializer {

	/**
	 * @param c
	 *            感兴趣的类，handlerType中配置的子类，子接口或者实现类，本身类不扫描
	 * @param ctx
	 *            一个app对应一个servletContext
	 */
	@Override
	public void onStartup(Set<Class<?>> c, ServletContext ctx) throws ServletException {
		System.out.println("MyServletContainerInitializer servletContextName>>>>>>>>>>>>>>" + ctx.getContextPath());
		// 动态注册三大组件
		System.out.println("开始动态注册三大组件");

		// 注册filter
		FilterRegistration.Dynamic filter = ctx.addFilter("myFilter", MyFilter.class);
		// 在这里的enumSet卡住
		// filter.addMappingForUrlPatterns(EnumSet.of(DispatcherType.REQUEST), true,
		// "/*");
		filter.addMappingForUrlPatterns(EnumSet.of(DispatcherType.REQUEST), true, "/servletContext/myServlet");

		// 注册servlet
		ServletRegistration.Dynamic servlet = ctx.addServlet("myServlet", new MyServlet());
		servlet.addMapping("/servletContext/myServlet");

		// 注册listener
		MyListener listener = new MyListener();
		ctx.addListener(listener);
		ctx.setInitParameter("contextParameter", "我是在servlet container initializer 里面设置的参数");

	}

}
