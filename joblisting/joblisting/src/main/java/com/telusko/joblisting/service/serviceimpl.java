package com.telusko.joblisting.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.telusko.joblisting.dao.dao;
import com.telusko.joblisting.entity.entity;
import com.telusko.joblisting.pojo.pojo;

@Service
public class serviceimpl implements service {
@Autowired
dao d;
	@Override
	public List ram() {
		// TODO Auto-generated method stub
		return d.findAll();
	}

	@Override
	public void site(entity p) {
		// TODO Auto-generated method stub
		pojo pj=new pojo(p.getUserName(),p.getPassword(),p.getEmail());
	
		d.save(pj);
	}

}
