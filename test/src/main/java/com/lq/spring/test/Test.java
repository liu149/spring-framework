package com.lq.spring.test;

import com.lq.spring.config.AppConfig;
import com.lq.spring.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		UserService service = context.getBean(UserService.class);
		System.out.println(service);
	}
}
