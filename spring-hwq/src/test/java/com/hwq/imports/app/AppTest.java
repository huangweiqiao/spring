package com.hwq.imports.app;

import com.hwq.imports.config.ImportConfig;
import com.hwq.imports.service.MsgService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppTest {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ImportConfig.class);
		MsgService emailService = (MsgService)context.getBean("emailService");
		emailService.sayHello();
	}
}
