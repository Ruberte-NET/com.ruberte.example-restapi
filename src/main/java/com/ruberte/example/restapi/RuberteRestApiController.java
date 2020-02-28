package com.ruberte.example.restapi;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class RuberteRestApiController {

	@RequestMapping("/")
	public String index() {
		return "Hello Spring Boot!";
	}

}