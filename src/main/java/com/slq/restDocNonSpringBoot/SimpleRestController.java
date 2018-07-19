package com.slq.restDocNonSpringBoot;

import java.util.Date;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

@RestController(value="/")
public class SimpleRestController {

	@RequestMapping(value="say-hello")
	public String sayHello() {
		return "Hello AbstractAnnotationConfigDispatcherServletInitializer " + new Date();
	}
}
