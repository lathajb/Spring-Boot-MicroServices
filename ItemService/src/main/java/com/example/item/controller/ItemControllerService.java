package com.example.item.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ItemControllerService {
	
	@RequestMapping("/item")
	public String getItem() {
		return "item";
	}

}
