package com.neusoft.busmis.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/user")
public class UserController {
	@RequestMapping(value="/info",method= {RequestMethod.GET,RequestMethod.POST})
	public String getInfo() throws Exception{
		
		return "OK";
	}
	@RequestMapping(value="/add",method= {RequestMethod.GET,RequestMethod.POST})
	public String add() throws Exception{
		return "ADD OK";
	}

}
