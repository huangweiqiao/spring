package com.hwq.imports.service;

import org.springframework.stereotype.Component;

@Component("emailService")
public class EmailService implements MsgService{
	@Override
	public void sayHello() {
		System.out.println("EmailService.sayHello");
	}
}
