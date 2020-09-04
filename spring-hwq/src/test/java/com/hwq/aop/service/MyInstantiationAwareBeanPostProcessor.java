package com.hwq.aop.service;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessor;
import org.springframework.stereotype.Component;

//@Component
public class MyInstantiationAwareBeanPostProcessor implements InstantiationAwareBeanPostProcessor {

	//这个方法返回 fasle表示不允许spring自动注入,
	// 因为在 org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.populateBean方法中有判断
	public boolean postProcessAfterInstantiation(Object bean, String beanName) throws BeansException {
		return false;
	}
}
