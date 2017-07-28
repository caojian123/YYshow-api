package com.yyw.test.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/user")
public class UserController{
	@RequestMapping(value="/detail/{id}",method = RequestMethod.GET)
	public @ResponseBody Object detail(@PathVariable Long id){
		Map<String,String> result = new HashMap<String,String>();
		result.put("name", "Ð¡Ã÷");
		result.put("age", "33");
		result.put("sex", "ÄÐ");
		return result;
	}	
}