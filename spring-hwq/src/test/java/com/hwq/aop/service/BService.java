package com.hwq.aop.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service
public class BService {
	@Autowired
	AService aService;

	public BService(){
		System.out.println("BService....构造函数....");
	}

	@PostConstruct
	public void init(){
		System.out.println("BService...init...");
	}

	public AService getAService(){
		System.out.println("this is BService getAService");
		return this.aService;
	}
}
