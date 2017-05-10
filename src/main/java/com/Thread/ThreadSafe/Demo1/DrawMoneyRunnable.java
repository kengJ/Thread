package com.Thread.ThreadSafe.Demo1;

public class DrawMoneyRunnable implements Runnable {

	private Account account;
	private double drawAmount;
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		if(account.getBalance()>=drawAmount){
			System.out.println("ȡǮ�ɹ�,ȡ�����Ϊ:"+drawAmount);
			double balance = account.getBalance()-drawAmount;
			account.setBalance(balance);
			System.out.println("��ǰ���Ϊ��"+balance);
		}
	}

	public DrawMoneyRunnable(Account account, double drawAmount) {
		super();
		this.account = account;
		this.drawAmount = drawAmount;
	}
}
