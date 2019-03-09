package com.example.demo.rest;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.bean.loginBO;
import com.example.demo.entity.login;

@RestController
public class login_rest {

	@Autowired
    loginBO bo = null;
	
	 @Autowired 
	 private HttpSession s;
		
	 @RequestMapping(value = "/loginrest", method = RequestMethod.GET)
		public @ResponseBody login createlogin(@RequestBody login l) {	
		 System.out.println("Username:" + l.getUsername());
			System.out.println("Password:" + l.getPassword());
			s.setAttribute("name", l.getUsername());
			bo.savelogin(l);
			return l;
		}
	
}
