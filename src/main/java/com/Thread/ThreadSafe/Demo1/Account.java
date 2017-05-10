package com.Thread.ThreadSafe.Demo1;
/**
 * 线程安全
 * @author keng
 * 业务逻辑类
 * 主要实现信用卡业务逻辑
 */
public class Account {

	private String AccountNo;
	private double Balance;
	
	public Account(String accountNo, double balance) {
//		super();
		AccountNo = accountNo;
		Balance = balance;
	}

	public Account() {
		
	}

	public String getAccountNo() {
		return AccountNo;
	}

	public void setAccountNo(String accountNo) {
		AccountNo = accountNo;
	}

	public double getBalance() {
		return Balance;
	}

	public void setBalance(double balance) {
		Balance = balance;
	}

}
