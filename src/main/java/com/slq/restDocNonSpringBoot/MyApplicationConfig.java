package com.slq.restDocNonSpringBoot;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = { "com.slq.restDocNonSpringBoot.services" })
public class MyApplicationConfig {

}
