package com.customer.service.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerControllerService {
	
	@RequestMapping("/customer")
	public String getCustomer() {
		return "customer";
	}

}
