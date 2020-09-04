package com.hwq.aop.App;

import com.hwq.aop.config.LifeConfig;
import com.hwq.aop.service.AService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppTest {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(LifeConfig.class);
		AService bean = context.getBean(AService.class);
		bean.sayHello();
		context.close();
	}
}
