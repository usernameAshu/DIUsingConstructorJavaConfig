package com.infotech.messge;

import org.springframework.stereotype.Component;

@Component
public class ActiveMQMessage implements Message {

	public void sendMessage(){
		System.out.println("Sending message Via Active MQ..");
	}
}
