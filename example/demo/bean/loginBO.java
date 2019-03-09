package com.example.demo.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.entity.login;
import com.example.demo.repository.loginDAO;

@Component
public class loginBO {
	
	@Autowired
	loginDAO dao;
	
	public void savelogin (login l) {
		dao.save(l);
		
		System.out.println("login saved =>");
	}


}
