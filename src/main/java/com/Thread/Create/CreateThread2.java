package com.Thread.Create;

/**
 * 
 * @author heyanzhu
 * 通过实现Runnable接口，重写run方法实现多线程
 */
public class CreateThread2 implements Runnable{

	private int i = 0;

	/**
	*重写run方法
	**/
	public void run(){
		for(i=0;i<100;i++){
			System.out.print(Thread.currentThread().getName() + " " + i);
		}
	}
}
