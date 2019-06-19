package org.microservices.limits.base;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@Autowired
	ConfigurationManager config;
	
	@GetMapping("/hello")
	public ConfigurationManager sayHello() {
		
		return config;
	}
}
