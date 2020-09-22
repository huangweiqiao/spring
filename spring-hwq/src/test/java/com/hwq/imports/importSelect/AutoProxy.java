package com.hwq.imports.importSelect;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class AutoProxy implements BeanPostProcessor {
	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		if(beanName.equals("emailService")){
			final Object temp = bean;
			bean= Proxy.newProxyInstance(bean.getClass().getClassLoader(),
					new Class[]{bean.getClass().getInterfaces()[0]},
					new InvocationHandler() {
						@Override
						public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
							System.out.println("我有代理了");
							return method.invoke(temp,args);
						}
					});
		}
		return bean;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		return bean;
	}
}
