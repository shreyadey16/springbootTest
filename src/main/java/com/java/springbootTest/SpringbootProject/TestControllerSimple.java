package com.java.springbootTest.SpringbootProject;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestControllerSimple {
	
	@RequestMapping("/test")
	public String test() {
		return "SpringBoot Hello world!";
	}

}
