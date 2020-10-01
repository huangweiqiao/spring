package com.hwq.importaware.app;

import com.hwq.importaware.aware.MyDb;
import com.hwq.importaware.config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class App {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		MyDb bean = context.getBean(MyDb.class);
		System.out.println(bean);
	}
}
