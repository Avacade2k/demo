package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	
	@RequestMapping(method = RequestMethod.GET, path = "/hello-world")
	public String helloWorld() {

		return "Hello World";
	}

	@RequestMapping(value = "/add", method = RequestMethod.GET)
	public String plus(float num1, float num2) {
		float score = num1 + num2;
		String str1 = Float.toString(score); 
		return str1.toString();
	}
	
	@RequestMapping(value = "/min", method = RequestMethod.GET)
	public String minus(float num1, float num2) {
		float score = num1 - num2;
		String str1 = Float.toString(score); 
		return str1.toString();
	}
	
	@RequestMapping(value = "/div", method = RequestMethod.GET)
	public String divition(float num1, float num2) {
		float score = num1 / num2;
		String str1 = Float.toString(score); 
		return str1.toString();
	}
	
	@RequestMapping(value = "/mul", method = RequestMethod.GET)
	public String multi(float num1, float num2) {
		float score = num1 * num2;
		String str1 = Float.toString(score); 
		return str1.toString();
	}

}
