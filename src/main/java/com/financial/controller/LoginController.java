package com.financial.controller;

import java.util.Map;
import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 登陆控制器类
 * @author Maing<280561543@qq.com>
 */
@RestController
public class LoginController {
    @Autowired
    private com.financial.service.FinUserDetailsService finUserDetailsService;

	//@RequestMapping(value = "/login", method=RequestMethod.POST, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @RequestMapping(value = "/login", method=RequestMethod.GET, produces = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
	//public Map<String, Object> login(@RequestBody Map<String, Object> userInfo) {
    public @ResponseBody Map<String, Object> login(@RequestParam(value = "email") String email, @RequestParam(value = "password") String password) {
		Map<String, Object> model = new HashMap<String, Object>();
		model.put("code", 1);
        model.put("status", 200);
		model.put("message", "Login!");
        //model.put("data", userInfo);
		return model;
	}

	@RequestMapping(value = "/register", method=RequestMethod.POST)
	public Map<String, Object> register() {
		Map<String, Object> model = new HashMap<String, Object>();
		model.put("code", 0);
		model.put("message", "Register!");
		return model;
	}
}