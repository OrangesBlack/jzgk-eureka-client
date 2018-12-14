package com.jzgk.json.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.jzgk.json.pojo.UserPojo;

/**
 * @ClassName:  MovieController   
 * @Description:接口暴露层 
 * @author: LouYue 
 * @date:   2018年12月14日 下午6:08:47   
 *
 */
@RestController
public class MovieController {

	@Autowired
	private RestTemplate restTemplate;
	
	@GetMapping("/User/{id}")
	public UserPojo findById(@PathVariable Long id) {
		return this.restTemplate.getForObject("http://192.168.10.128:8000/"+ id, UserPojo.class);
	}
}
