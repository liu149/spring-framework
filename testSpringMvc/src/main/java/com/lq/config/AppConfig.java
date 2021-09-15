package com.lq.config;

import org.apache.catalina.Context;
import org.apache.catalina.Server;
import org.apache.catalina.Wrapper;
import org.apache.catalina.startup.Tomcat;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;
import org.springframework.web.servlet.function.RouterFunction;
import org.springframework.web.servlet.function.ServerResponse;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import javax.servlet.ServletRegistration;
import java.io.File;

import static org.springframework.web.servlet.function.EntityResponse.fromObject;
import static org.springframework.web.servlet.function.RequestPredicates.GET;
import static org.springframework.web.servlet.function.RouterFunctions.route;
import static org.springframework.web.servlet.function.ServerResponse.ok;

@Configuration
@ComponentScan("com.lq")
public class AppConfig {

//	@Bean
//	RouterFunction<ServerResponse> home() {
//		return route(GET("/home"), request -> ok().body(fromObject("Home page")));
//	}

	@Bean("viewResolver")
	InternalResourceViewResolver internalResourceViewResolver(){
		InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
		viewResolver.setPrefix("/page/");
		viewResolver.setSuffix(".jsp");
		return viewResolver;
	}
}
