package com.slq.restDocNonSpringBoot;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 * https://stackoverflow.com/questions/29416804/creating-spring-rest-services-without-using-spring-boot/50053599#50053599
 */

@Configuration
@EnableWebMvc
@ComponentScan(basePackages="com.slq.restDocNonSpringBoot")
public class WebAppInitalizer extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		return new Class<?>[]{WebAppInitalizer.class};
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		return new Class[0];
	}

	@Override
	protected String[] getServletMappings() {
		 return new String[]{"/*"};
	}

}
