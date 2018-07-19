package com.slq.restDocNonSpringBoot;

import java.util.Date;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController(value="/")
public class SimpleRestController {

	@RequestMapping(value="say-hello")
	public String sayHello() {
		return "Hello config-with-java-load-xml " + new Date();
	}
}
