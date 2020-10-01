package com.hwq.aop.service;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service
public class DService implements InitializingBean {
	public DService(){
		System.out.println("DService....构造函数....");
	}

	@PostConstruct
	public void init(){
		System.out.println("DService...init...");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("DService...InitializingBean...afterPropertiesSet...");
	}

}
