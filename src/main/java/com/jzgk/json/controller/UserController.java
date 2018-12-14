package com.jzgk.json.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.jzgk.json.dao.UserRepository;
import com.jzgk.json.pojo.UserPojo;


/**
 * 
 * @ClassName:  UserController   
 * @Description:接口暴露层   
 * @author: LouYue 
 * @date:   2018年12月14日 下午3:25:51   
 *
 */
@RestController
public class UserController {
	
	@Autowired
	private UserRepository userRepository;
	
	@GetMapping(value = "/{id}")
	public UserPojo findById(@PathVariable Long id) {
		UserPojo userPojo = this.userRepository.findOne(id);
		return userPojo;
	}
}
