package com.financial.controller;

import java.util.Map;
import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
/**
 * 登陆控制器类
 * @author Maing<280561543@qq.com>
 */
@RestController
public class LoginController {
    @RequestMapping(value = "/login", method=RequestMethod.POST, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public @ResponseBody Map<String, Object> login(@RequestBody Map<String, Object> userInfo) {
		Map<String, Object> model = new HashMap<String, Object>();
		model.put("code", 1);
		model.put("message", "Login!");
        model.put("data", userInfo);
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