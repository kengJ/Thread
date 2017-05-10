package com.Thread.ThreadSafe.Demo2;

import com.Thread.ThreadSafe.synchronizedThread.synchronizedThread;

public class Account {

	private String account;
	private double balance;
	private boolean flag = false;
	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Account(String account, double balance) {
		super();
		this.account = account;
		this.balance = balance;
	}
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public boolean isFlag() {
		return flag;
	}
	public void setFlag(boolean flag) {
		this.flag = flag;
	}
	
	/**
	 * 存钱
	 * @param depositeAmount
	 * @param i
	 * 同步方法
	 */
	public synchronized void deposite(double depositeAmount, int i){
		//判断当前是否有人正在存钱
		if(flag){
			try {
				System.out.println(Thread.currentThread().getName()+" 开始执行wait()");
				wait();
				System.out.println(Thread.currentThread().getName()+"执行了wait()");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}else{
			System.out.println(Thread.currentThread().getName()+"存款"+depositeAmount);
			setBalance(balance+depositeAmount);
			flag=true;
			notifyAll();
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			System.out.println(Thread.currentThread().getName()+"存钱完毕");
		}
	}
	
	
	/**
	 * 取钱
	 * @param drawAmount
	 * @param i
	 */
	public synchronized void draw(double drawAmount,int i){
		if(!flag){
			
			try {
				System.out.println(Thread.currentThread().getName()+"开始执行wait()");
				wait();
				System.out.println(Thread.currentThread().getName()+"执行了wait()");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}else{
			System.out.println(Thread.currentThread().getName()+"开始取钱");
			setBalance(getBalance()-drawAmount);
			flag=false;
			//唤醒其他线程
			notifyAll();
			System.out.println(Thread.currentThread().getName()+"取钱完毕");
			
		}
	}
}
