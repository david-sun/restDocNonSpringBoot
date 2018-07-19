package com.slq.restDocNonSpringBoot;

import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.support.AbstractDispatcherServletInitializer;

public class MyServletInitializer extends AbstractDispatcherServletInitializer {

	@Override
	protected WebApplicationContext createServletApplicationContext() {
		AnnotationConfigWebApplicationContext myServletConfig = new AnnotationConfigWebApplicationContext();
		myServletConfig.register(MyServletConfig.class);
		
		return myServletConfig;
	}

	@Override
	protected String[] getServletMappings() {
		return new String[] { "/*" };
	}

	@Override
	protected WebApplicationContext createRootApplicationContext() {
		return null;
	}

}
