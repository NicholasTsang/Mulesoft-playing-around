package com.qa.form;

import org.mule.api.MuleMessage;
import org.mule.api.transport.PropertyScope;

public class formProcess {
	public Object formProcessing(MuleMessage message){
		
		String DataReceived = message.getProperty("http.query.string", PropertyScope.INBOUND);
				
				
				/*String first = DataReceived.split("&") [0];
				String second = DataReceived.split("&") [1];
				
				
				int A = Integer.parseInt(first.split("=")[1]);
				int B = Integer.parseInt(second.split("=")[1]);
				int C = A+B;
				
				System.out.println(A);
				System.out.println(B);
				
				message.setPayload(Integer.toString(A));
				message.setPayload(Integer.toString(B));
				message.setPayload(Integer.toString(C));
				*/
				System.out.println(message);
				
				
				return message;
			}
		}
