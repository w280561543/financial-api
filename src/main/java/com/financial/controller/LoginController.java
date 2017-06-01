package com.financial.controller;

import java.util.Map;
import java.util.HashMap;

import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class LoginController {
	@RequestMapping(value = "/user/login", method=RequestMethod.POST)
	public Map<String, Object> login() {
		Map<String, Object> model = new HashMap<String, Object>();
		model.put("code", 0);
		model.put("message", "Login!");
		return model;
	}

	@RequestMapping(value = "/user/register", method=RequestMethod.POST)
	public Map<String, Object> register() {
		Map<String, Object> model = new HashMap<String, Object>();
		model.put("code", 0);
		model.put("message", "Register!");
		return model;
	}
}