package com.Thread.ThreadSafe.Demo1;
/**
 * �̰߳�ȫ
 * @author keng
 * ҵ���߼���
 * ��Ҫʵ�����ÿ�ҵ���߼�
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
