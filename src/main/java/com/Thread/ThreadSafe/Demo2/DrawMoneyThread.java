package com.Thread.ThreadSafe.Demo2;

public class DrawMoneyThread extends Thread{

	private Account account ;
	private double amount;
	
	public DrawMoneyThread(Account account, double amount) {
		super();
		this.account = account;
		this.amount = amount;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
//		super.run();
		for(int i =0;i<100;i++){
			account.draw(amount, i);
		}
	}
}
