package com.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.demo.repository.CustomerRepository;
import com.demo.repository.HibernateCustomerRepositoryImpl;
import com.demo.service.CustomerService;
import com.demo.service.CustomerServiceImpl;

@Configuration
@ComponentScan({"com.demo"})
@PropertySource("application.properties")
public class AppConfig {
	
//	@Bean("customerRepository")
//	public CustomerRepository getCustomerRepository() {
//		return new HibernateCustomerRepositoryImpl();
//	}

//	@Bean("customerService")
//	public CustomerService getCustomerService() {
//		CustomerServiceImpl customerService = new CustomerServiceImpl(getCustomerRepository());
////		CustomerServiceImpl customerService = new CustomerServiceImpl();
////		customerService.setCustomerRepository(getCustomerRepository());
//		return customerService;
//	}

}
