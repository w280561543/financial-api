package com.financial.controller;

import java.util.Map;
import java.util.HashMap;

import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class LoginController {
	@RequestMapping(value = "/login", method=RequestMethod.GET)
	public Map<String, Object> index() {
		Map<String, Object> model = new HashMap<String, Object>();
		model.put("code", 0);
		model.put("message", "Login!");
		return model;
	}

	@RequestMapping(value = "/login", method=RequestMethod.POST)
	public Map<String, Object> login() {
		Map<String, Object> model = new HashMap<String, Object>();
		model.put("code", 0);
		model.put("message", "Login!");
		return model;
	}

	@RequestMapping(value = "/login_error", method=RequestMethod.GET)
	public Map<String, Object> loginError() {
		Map<String, Object> model = new HashMap<String, Object>();
		model.put("code", 0);
		model.put("message", "Login!");
		return model;
	} 
	
	@RequestMapping(value = "/logout", method=RequestMethod.POST)
	public Map<String, Object> logout() {
		Map<String, Object> model = new HashMap<String, Object>();
		model.put("code", 0);
		model.put("message", "Logout!");
		return model;
	}
}