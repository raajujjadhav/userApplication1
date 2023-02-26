package com.telusko.joblisting.dao;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.telusko.joblisting.pojo.pojo;
@Repository
public interface dao extends MongoRepository<pojo, String>{

}
