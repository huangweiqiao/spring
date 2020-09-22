package com.hwq.aop.interceptor;

public class OrderService {
	public OrderService(){
		System.out.println("orderService init");
	}
	public void query(){
		System.out.println("orderService.query()");
	}
}
