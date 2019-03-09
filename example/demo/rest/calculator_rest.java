package com.example.demo.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.bean.calculatorBO;
import com.example.demo.entity.calculator;

@RestController
public class calculator_rest {
	
	@Autowired
	calculatorBO bo = null;

	@RequestMapping(value = "/calrest", method = RequestMethod.POST)
	public @ResponseBody int createlogin(@RequestBody calculator c) {
		System.out.println("Input1:" + c.getInput1());
		System.out.println("Input2:" + c.getInput2());
		
		int d = bo.savelogin(c);
		return d;
	}
	
}
