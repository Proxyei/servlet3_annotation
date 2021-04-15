package com.xywei.sharedlib_runtimesplugg;

import java.util.Set;

import javax.servlet.ServletContainerInitializer;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.HandlesTypes;

//Spring4基础
@HandlesTypes(value = { PersonService.class })
public class CustomServletContainerInitializer implements ServletContainerInitializer {

	/**
	 * @param c
	 *            感兴趣的类，handlerType中配置的子类，子接口或者实现类，本身类不扫描
	 * @param ctx
	 *            一个app对应一个servletContext
	 */
	@Override
	public void onStartup(Set<Class<?>> c, ServletContext ctx) throws ServletException {
		System.out.println(this.getClass()+"@HandlesTypes CustomServletContainerInitializer ServletContextName>>>>>>>>" + ctx.getServletContextName());
		System.out.println(this.getClass()+"@HandlesTypes CustomServletContainerInitializer  ContextPath>>>>>>>>" + ctx.getContextPath());
		for (Class<?> class1 : c) {
			System.out.println(this.getClass()+"@HandlesTypes CustomServletContainerInitializer 容器启动时候，感兴趣的class>>>>>>>>>" + class1);
		}
	}

}
