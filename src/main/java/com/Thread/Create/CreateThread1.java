package com.Thread.Create;

/**
 * 使用继承thread的方式实现多线程
 * @author heyanzhu
 *
 */
public class CreateThread1 extends Thread{

	private int i = 0;

	/**
	 * 重写run方法
	 */
	public void run(){
		for(i=0;i<100;i++){
			System.out.print(Thread.currentThread().getName() + " " + i);
		}
	}
}
