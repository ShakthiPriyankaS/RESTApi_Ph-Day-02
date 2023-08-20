package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {
	
	@Value("${name}")
	private String name;
	@Value("${company}")
	private String company;
	
	@GetMapping("welcome")
	
	public String Welcome()
	{
		return name+"to my"+company;
	}

}
