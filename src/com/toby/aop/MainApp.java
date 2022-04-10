package com.toby.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.toby.aop.dao.*;
import com.toby.aop.model.Account;

public class MainApp {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
		AccountDao accountDao = context.getBean("accountDao",AccountDao.class);
		accountDao.addAccount();
		accountDao.addAccount(new Account("1","Toby Cheung"));
		CustomerDao customerDao = context.getBean("customerDao",CustomerDao.class);
		customerDao.addAccount();
		context.close();
	}

}
