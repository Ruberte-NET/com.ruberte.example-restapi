package com.ruberte.example.restapi;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@PropertySource("classpath:application.properties")
@RestController
public class RuberteRestApiController {


	@Value("${landingpage.welcomeMat}")
	private String welcomeMat = "notset";
	
	@RequestMapping("/")
	public String index() {
		return 
			"Hello Spring Boot!<br/>" + welcomeMat;
	}

}