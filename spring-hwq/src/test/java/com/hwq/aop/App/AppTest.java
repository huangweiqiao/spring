package com.hwq.aop.App;

import com.hwq.aop.config.LifeConfig;
import com.hwq.aop.interceptor.MyMethodInterceptor;
import com.hwq.aop.interceptor.OrderService;
import com.hwq.aop.service.AService;
import org.springframework.cglib.core.SpringNamingPolicy;
import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class AppTest {

	public static void main(String[] args) {
		configTest();
		//cglibEnhance();
	}


	public static void configTest(){
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(LifeConfig.class);
		AService bean = context.getBean(AService.class);
		bean.sayHello();
		context.close();
	}

	public static void cglibEnhance(){
		try {
			Enhancer enhance = new Enhancer();
			enhance.setSuperclass(OrderService.class);
			enhance.setNamingPolicy(SpringNamingPolicy.INSTANCE);
			enhance.setCallback(new MyMethodInterceptor());
			OrderService o = (OrderService)enhance.create();
			//动态生成的类可以使用 HSDB工具查看
			o.query();
			System.in.read();
		}catch (Exception e){
			e.printStackTrace();
		}
	}

}
