package com.yyk.ssm.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yyk.ssm.mapper.UserMapper;
import com.yyk.ssm.pojo.User;

@Service
public class UserService {
	@Autowired
	UserMapper userMapper;
	
	public User findUserById(Long id) {
		return userMapper.selectByPrimaryKey(id);
	}
}
