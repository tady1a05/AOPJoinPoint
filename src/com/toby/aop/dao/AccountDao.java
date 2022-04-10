package com.toby.aop.dao;

import org.springframework.stereotype.Component;

import com.toby.aop.model.Account;

@Component
public class AccountDao {
	public void addAccount() {
		System.out.println("Added the fucking account");
	}
	
	public void addAccount(Account acc) {
		System.out.println("Added the fucking account with object");
	}
}
