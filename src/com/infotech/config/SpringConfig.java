package com.infotech.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.infotech.messge.ActiveMQMessage;
import com.infotech.messge.Message;
import com.infotech.service.Communication;

@Configuration
public class SpringConfig {
	
/*	@Bean
	public Communication communication() {
		return new Communication( message() );
	}*/

	@Bean
	public Communication communication() {
		return new Communication();
	}
	
	@Bean
	public Message message() {
		return new ActiveMQMessage();
	}
	
}
