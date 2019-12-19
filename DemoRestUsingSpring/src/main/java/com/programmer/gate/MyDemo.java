package com.programmer.gate;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/payment1")
public class MyDemo {

	
	@GetMapping(value="/Hello1")
	public String Hello() {
		return "Hello Spring Rest1111";
	}
}
