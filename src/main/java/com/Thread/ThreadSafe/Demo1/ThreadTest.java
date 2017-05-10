package com.Thread.ThreadSafe.Demo1;

public class ThreadTest {

	public static void main(String[] args) {
		Account account = new Account("123456",1000);
		DrawMoneyRunnable runnable = new DrawMoneyRunnable(account, 3000);
		Thread thread1 = new Thread(runnable);
		Thread thread2 = new Thread(runnable);
		thread1.start();
		thread2.start();
	}
}
