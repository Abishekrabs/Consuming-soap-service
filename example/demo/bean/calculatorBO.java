package com.example.demo.bean;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.stereotype.Component;

import com.example.demo.entity.calculator;
import com.example.howtodoinjava.schemas.school.AddResponse;
import com.example.demo.bean.SOAPConnector;

@Component
public class calculatorBO {
	
	 @Autowired 
	 private HttpSession s;

	public int savelogin (calculator c) {
		int d;
		int a =c.getInput1();
		int b=c.getInput2();
		
		
		if(s.getAttribute("name")!=null) {
			
			SOAPConnector client = new SOAPConnector();
			Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
	        marshaller.setContextPath("com.example.howtodoinjava.schemas.school");    
	        client.setMarshaller(marshaller);
	        client.setUnmarshaller(marshaller);
	        
	        AddResponse response = client.callWebService(a,b);
	         d = response.getAddResult();
	        System.out.println("Add Result : "+response.getAddResult());
			
		}
		else {
			d=0;
	        System.out.println("Status-Failure");

		}
		
		return d;
	}

}
