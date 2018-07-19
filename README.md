# restDocNonSpringBoot
Different way to config spring web application and their rest doc config

### Here are 5 methods for setup spring web application
1. Use Servlet Context, which is config-with-init-param
2. Use Application Context with xml, which is config-with-ContextLoadListener
3. Use Servlet 3.x with AbstractAnnotationConfigDispatcherServletInitializer, which is config-with AbstractAnnotationConfigDispatcherServletInitializer
4. Use Servlet 3.x with Servlet and context initializer, which is config-with-java
5. Use Servlet 3.x with Servlet and context initializer, but load xml config file, which is config-with-java-load-xml

### Some Notes:
- With java config, use @EnableWebMvc, but when xml config, can also use <mvc:annotation-driven />, both are equivalent.
- Import other java config, use @Import in java config, e.g.: @Import(SomeOtherConfiguration.class), but user @ImportResouce to import xml file config, e.g.: @ImportResource("classpath:basicConfigForPropertiesTwo.xml").
- In xml config, use <import resource="some-other-config-file.xml" />
- In java config, use @ComponentScan(basePackages = { "com.slq.restDocNonSpringBoot.services" }), but in xml config, use <context:annotation-config /> and <context:component-scan base-package="com.slq.restDocNonSpringBoot">


### Reference:
1. http://www.baeldung.com/spring-web-contexts
1. http://www.baeldung.com/spring-bean-annotations
1. https://stackoverflow.com/questions/29416804/creating-spring-rest-services-without-using-spring-boot/50053599#50053599
