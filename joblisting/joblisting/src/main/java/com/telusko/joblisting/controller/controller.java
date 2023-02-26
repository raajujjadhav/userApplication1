package com.telusko.joblisting.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.telusko.joblisting.entity.entity;
import com.telusko.joblisting.pojo.pojo;
import com.telusko.joblisting.service.service;

@RestController
public class controller {

	@Autowired
	service s;
	@GetMapping("/getdata")
	public List getdatas() {
		return s.ram();
		
	}
	@PostMapping("/create")
	public String creates(@RequestBody entity p)
	{
		s.site(p);
	
		return "data added successfully";
		
	}
}
