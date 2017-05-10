package com.Thread.ThreadSafe.Demo2;

public class ThreadTest {

	public static void main(String[] args) {
		Account account = new Account("123456", 1000);
		Thread drawMoneyThread = new DepositeMoneyThread(account,700);
		Thread depositeMoneyThread = new DrawMoneyThread(account, 700);
		drawMoneyThread.start();
		depositeMoneyThread.start();
	}

	
}
