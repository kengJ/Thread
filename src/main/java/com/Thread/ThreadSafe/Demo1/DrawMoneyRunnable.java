package com.Thread.ThreadSafe.Demo1;

public class DrawMoneyRunnable implements Runnable {

	private Account account;
	private double drawAmount;
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		if(account.getBalance()>=drawAmount){
			System.out.println("取钱成功,取出金额为:"+drawAmount);
			double balance = account.getBalance()-drawAmount;
			account.setBalance(balance);
			System.out.println("当前余额为："+balance);
		}
	}

	public DrawMoneyRunnable(Account account, double drawAmount) {
		super();
		this.account = account;
		this.drawAmount = drawAmount;
	}
}
