package com.toby.aop.dao;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import com.toby.aop.model.Account;

@Aspect
@Component
public class MyDemoLoggingAspect {
	@Before("execution(public void addAccount(..))")
	public void beforeAddAccountAdvice(JoinPoint joinpoint) {
		System.out.println("==========================>");
		MethodSignature MethodSignature = (MethodSignature)joinpoint.getSignature();
		System.out.println(MethodSignature.getMethod());
		System.out.println("==========================>");
		
		Object[] args = joinpoint.getArgs();
		
		for(Object obj:args) {
			System.out.println(obj);
			
			if(obj instanceof Account) {
				Account acc = (Account)obj;
				System.out.println(acc.getId());
				System.out.println(acc.getName());
			}
		}

	}
}
