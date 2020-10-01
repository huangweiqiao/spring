package com.hwq.aop.service;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service
public class CService implements  BeanPostProcessor {

	public CService(){
		System.out.println("CService....构造函数....");
	}

	@PostConstruct
	public void init(){
		System.out.println("CService...init...");
	}


	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		if (beanName.equals("AService")){
			System.out.println("CService...BeanPostProcessor...postProcessBeforeInitialization...");
		}
		return bean;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		if (beanName.equals("AService")){
			System.out.println("CService...BeanPostProcessor...postProcessAfterInitialization...");
		}
		return bean;
	}
}
