package com.example.demo.rest;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class logout_rest {

	 @Autowired 
	 private HttpSession s;
		
	 @RequestMapping(value = "/logoutrest", method = RequestMethod.GET)
		public @ResponseBody String createlogin() {
		 System.out.println(s.getAttribute("name"));
		 
		 String a;
		 
		 if(s.getAttribute("name")!=null) {
			s.invalidate();
			 a = "Status-success";
		 }
		 else {
				 a = "Status-failure";
		 }
			return a;
		}
	
}
