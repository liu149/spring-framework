package com.lq.initializer;

import com.lq.config.AppConfig;
import org.apache.catalina.Context;
import org.apache.catalina.Server;
import org.apache.catalina.connector.Connector;
import org.apache.catalina.startup.Tomcat;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import java.io.File;

public class Main {

	public static void main(String[] args) throws Exception{

		//tomcat9的写法
		AnnotationConfigWebApplicationContext ac = new AnnotationConfigWebApplicationContext();
		ac.register(AppConfig.class);
		ac.refresh();

		Tomcat tomcat = new Tomcat();
		tomcat.setPort(8080);
		File base = new File(System.getProperty("java.io.tmpdir"));

		Context context = tomcat.addContext("/", "/Users/liuqi/workspace/spring-framework/testSpringMvc/src/main/resources");
		DispatcherServlet dispatcherServlet = new DispatcherServlet(ac);

		Tomcat.addServlet(context, "app", dispatcherServlet).setLoadOnStartup(1);
		context.addServletMappingDecoded("/", "app");
		Server server = tomcat.getServer();
		Connector connector = new Connector("org.apache.coyote.http11.Http11NioProtocol");
		connector.setPort(8080);
		connector.setThrowOnFailure(true);
		tomcat.getService().addConnector(connector);
		tomcat.setConnector(connector);
		tomcat.start();
		server.await();

		//tomcat8的写法
//		AnnotationConfigWebApplicationContext ac = new AnnotationConfigWebApplicationContext();
//		ac.register(AppConfig.class);
//		ac.refresh();
//
//		Tomcat tomcat = new Tomcat();
//		tomcat.setPort(8080);
//		File base = new File(System.getProperty("java.io.tmpdir"));
//
//		Context context = tomcat.addContext("/", base.getAbsolutePath());
//		DispatcherServlet dispatcherServlet = new DispatcherServlet(ac);
//
//		Tomcat.addServlet(context, "app", dispatcherServlet).setLoadOnStartup(1);
//		context.addServletMapping("/", "app");
//		tomcat.start();
//		tomcat.getServer().await();

	}
}
