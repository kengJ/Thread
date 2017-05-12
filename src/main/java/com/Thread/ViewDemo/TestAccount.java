package com.Thread.ViewDemo;


class Account {
	double balance;

	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public synchronized void deposit(double amt){
		balance+=amt;
		try {
			Thread.currentThread().sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName()+":"+balance);
	}
}

class Customer extends Thread{
	Account account ;
	
	public Customer(Account account) {
		// TODO Auto-generated constructor stub
		this.account=account;
	}
	
	@Override
	public void run() {
		for(int i=0;i<3;i++){
			account.deposit(1000);	
		}
	}
}

public class TestAccount {

	public static void main(String[] args) {
		Account account = new Account();
		Customer customer1 = new Customer(account);
		Customer customer2 = new Customer(account);
		
		customer1.setName("客户1");
		customer2.setName("客户2");
		
		customer1.start();
		customer2.start();
	}
}
