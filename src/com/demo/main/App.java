package com.demo.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.demo.AppConfig;
import com.demo.service.CustomerService;

public class App {

	public static void main(String[] args) {
		
//		CustomerService customerService = new CustomerServiceImpl();
		AnnotationConfigApplicationContext appContext = new AnnotationConfigApplicationContext(AppConfig.class);
		CustomerService customerService = appContext.getBean("customerService", CustomerService.class);
		System.out.println(customerService.findAll().get(0).getFirstname());

	}

}
