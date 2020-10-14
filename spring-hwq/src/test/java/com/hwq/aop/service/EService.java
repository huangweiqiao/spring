package com.hwq.aop.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EService {
	@Autowired
	AService aService;

	public AService getAService(){
		System.out.println("this is EService getAService");
		return this.aService;
	}
}
