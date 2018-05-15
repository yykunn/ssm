package com.yyk.ssm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.yyk.ssm.pojo.User;
import com.yyk.ssm.service.UserService;
@Controller
public class UserController {
	
	@Autowired
	UserService userService;
	
	@RequestMapping("/findUserById/{id}")
	@ResponseBody
	public User findUserById(@PathVariable Long id) {
		return userService.findUserById(id);
	}
}
