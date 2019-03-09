package com.example.demo.bean;
 
import org.springframework.ws.WebServiceMessage;
import org.springframework.ws.client.core.WebServiceMessageCallback;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.SoapMessage;

import com.example.howtodoinjava.schemas.school.Add;
import com.example.howtodoinjava.schemas.school.AddResponse;
 
public class SOAPConnector extends WebServiceGatewaySupport {
 
    public AddResponse callWebService(int a,int b){
    	String url ="http://www.dneonline.com/calculator.asmx?wsdl";
    	Add add = new Add();
    	add.setIntA(a);
    	add.setIntB(b);
    	
    	AddResponse response =(AddResponse)getWebServiceTemplate().marshalSendAndReceive(url, add , new WebServiceMessageCallback() {
            public void doWithMessage(WebServiceMessage message) 
            {
                ((SoapMessage)message).setSoapAction("http://tempuri.org/Add");
            }
       }
   );
    	
        return response;
    }
}