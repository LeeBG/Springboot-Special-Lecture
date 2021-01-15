package com.cos.start.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//@Configuration(설정파일-가장 빠른) => @RestController or @Controller => @Component
//@Controller
@RestController
public class IndexController {
	
	// http://localhost:8080/start/index
	@GetMapping("/index")
	public String index() {
		return "index함수입니다.";
	}
	
	@GetMapping("/hello")
	public String hello(){
		return "hello";
	}
}
