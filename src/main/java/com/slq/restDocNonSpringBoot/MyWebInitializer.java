package com.slq.restDocNonSpringBoot;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.XmlWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class MyWebInitializer implements WebApplicationInitializer  {

	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {
		// root context
		XmlWebApplicationContext rootContext = new XmlWebApplicationContext();
		rootContext.setConfigLocations("/WEB-INF/rootApplicationContext.xml");
		servletContext.addListener(new ContextLoaderListener(rootContext));
		
		// servlet context
		XmlWebApplicationContext restServletContext = new XmlWebApplicationContext();
		restServletContext.setConfigLocation("/WEB-INF/rest-servlet.xml");
		ServletRegistration.Dynamic normal
		  = servletContext.addServlet("rest-webapp", 
		    new DispatcherServlet(restServletContext));
		normal.setLoadOnStartup(1);
		normal.addMapping("/*");
	}

}
