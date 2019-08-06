package com.neusoft.busmis.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/user")
public class UserController {
	@RequestMapping(value="/info")
	public String getInfo() throws Exception{
		
		return "OK";
	}

}
