package com.Thread.ThreadSafe.Demo2;

public class DepositeMoneyThread extends Thread{

	private Account account;
	private double amount;
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<100;i++){
			account.deposite(amount, i);
		}
	}

	public DepositeMoneyThread(Account account, double amount) {
//		super();
		this.account = account;
		this.amount = amount;
	}
	
}
