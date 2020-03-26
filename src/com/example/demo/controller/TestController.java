package com.example.demo.controller;

import com.winter.annotation.Controller;
import com.winter.annotation.RequestMapping;

@Controller
@RequestMapping("/test")
public class TestController {

	@RequestMapping("/hello")
	public String Hello(String request) {
		return "Hello Controller!! ssdemo";
	}

}