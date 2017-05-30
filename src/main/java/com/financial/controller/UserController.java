package com.financial.controller;

import java.util.Map;
import java.util.HashMap;

import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping(value = "/user")
public class UserController {
	
	@RequestMapping(value = "", method=RequestMethod.GET)
	public Map<String, Object> index() {
		Map<String, Object> model = new HashMap<String, Object>();
		model.put("code", 0);
		model.put("message", "Successful!");
		return model;
	}
}