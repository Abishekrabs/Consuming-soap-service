package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.demo.config.ContextLoader;


@SpringBootApplication
public class SpringBootSoapClientApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SpringBootSoapClientApplication.class, args);
		ContextLoader.getInstance().storeApplicationContext(ctx);
		
//		SOAPConnector client = new SOAPConnector();
//		Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
//        marshaller.setContextPath("com.example.howtodoinjava.schemas.school");    
//        client.setMarshaller(marshaller);
//        client.setUnmarshaller(marshaller);
//        
//        AddResponse response = client.callWebService(4,4);
//        System.out.println("Add Result : "+response.getAddResult());
	}
}

//int input1 = 4;
//int input2 = 4;
//Add ad = new Add();
//ad.setIntA(input1);
//ad.setIntB(input2);
	
