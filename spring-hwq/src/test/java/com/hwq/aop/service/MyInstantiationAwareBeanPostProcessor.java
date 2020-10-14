package com.hwq.aop.service;

import org.springframework.beans.BeansException;
import org.springframework.beans.PropertyValues;
import org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessor;
import org.springframework.stereotype.Component;

import java.beans.PropertyDescriptor;

//@Component
public class MyInstantiationAwareBeanPostProcessor implements InstantiationAwareBeanPostProcessor {

	//这个方法返回 fasle表示这个类的对象的属性不允许spring自动注入,
	// 因为在 org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.populateBean方法中有判断
	public boolean postProcessAfterInstantiation(Object bean, String beanName) throws BeansException {
		//这里就可以判断 bean 是不是你不想让spring帮忙填充属性的对象，如果是则返回false,这样spring就不会帮bean注入属性了
		return false;
	}


	/*
	如果这个方法不返回空，那么在 AbstractAutowireCapableBeanFactory.resolveBeforeInstantiation() 方法返回的时候就不会是空，这样创建
	bean对象的流程就结束了，也不会去处理后面的代理以及注入的过程了，因此你可以在这里返回自己想返回的对象
	@Override
	public Object postProcessBeforeInstantiation(Class<?> beanClass, String beanName) throws BeansException {
		return null;
	}*/


	/*
	如果需要spring对属性进行填充，则由该方法完成属性填充
	@Override
	public PropertyValues postProcessPropertyValues(PropertyValues pvs, PropertyDescriptor[] pds,
			Object bean, String beanName) throws BeansException {
		return null;
	}*/
}
