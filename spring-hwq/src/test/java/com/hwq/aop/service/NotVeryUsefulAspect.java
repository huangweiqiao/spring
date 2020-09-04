package com.hwq.aop.service;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class NotVeryUsefulAspect {

	@Pointcut("execution(* com.hwq.aop.service.AService.*(..))") // the pointcut expression
	private void anyOldTransfer() {} // the pointcut signature

	@Before("anyOldTransfer()")
	public void doAccessCheck() {
		System.out.println("====before====");
	}
}