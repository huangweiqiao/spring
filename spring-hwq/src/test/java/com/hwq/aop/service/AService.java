package com.hwq.aop.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service
public class AService {
	@Autowired
	BService bService;

	public AService(){
		System.out.println("Aservice....构造函数....");
	}

	@PostConstruct
	public void init(){
		//MyInstantiationAwareBeanPostProcessor 这个组件如果让它起作用时，这个bService就会是null,
		// 因为MyInstantiationAwareBeanPostProcessor 的方法返回false表示不允许自动注入
		System.out.println("Aservice...init...bService="+bService);
	}

	public BService getBService(){
		System.out.println("this is AService getBService");
		return this.bService;
	}

	public void sayHello() {
		System.out.println("this is AService sayHello");
	}

}
