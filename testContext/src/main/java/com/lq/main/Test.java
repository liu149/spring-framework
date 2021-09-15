package com.lq.main;

import com.lq.config.AppConfig;
import com.lq.listener.MyEvent;
import com.lq.service.A;
import com.lq.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Test {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		UserService userService = context.getBean(UserService.class);
		userService.hello();
//		context.publishEvent(MyEvent.class);
//		A a = context.getBean(A.class);

	}

}
