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
	 * ��Ǯ
	 * @param depositeAmount
	 * @param i
	 * ͬ������
	 */
	public synchronized void deposite(double depositeAmount, int i){
		//�жϵ�ǰ�Ƿ��������ڴ�Ǯ
		if(flag){
			try {
				System.out.println(Thread.currentThread().getName()+" ��ʼִ��wait()");
				wait();
				System.out.println(Thread.currentThread().getName()+"ִ����wait()");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}else{
			System.out.println(Thread.currentThread().getName()+"���"+depositeAmount);
			setBalance(balance+depositeAmount);
			flag=true;
			notifyAll();
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			System.out.println(Thread.currentThread().getName()+"��Ǯ���");
		}
	}
	
	
	/**
	 * ȡǮ
	 * @param drawAmount
	 * @param i
	 */
	public synchronized void draw(double drawAmount,int i){
		if(!flag){
			
			try {
				System.out.println(Thread.currentThread().getName()+"��ʼִ��wait()");
				wait();
				System.out.println(Thread.currentThread().getName()+"ִ����wait()");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}else{
			System.out.println(Thread.currentThread().getName()+"��ʼȡǮ");
			setBalance(getBalance()-drawAmount);
			flag=false;
			//���������߳�
			notifyAll();
			System.out.println(Thread.currentThread().getName()+"ȡǮ���");
			
		}
	}
}
