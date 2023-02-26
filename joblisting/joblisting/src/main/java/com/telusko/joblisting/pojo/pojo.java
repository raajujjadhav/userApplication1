package com.telusko.joblisting.pojo;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
@ToString
@Data
@Setter
@Getter
@AllArgsConstructor
@Document
public class pojo {
	private String userName;
	private String password;
	private String email;
		
}
