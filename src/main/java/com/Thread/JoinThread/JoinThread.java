package com.Thread.JoinThread;

import com.Thread.Create.CreateThread2;
/**
 * join测试类
 * @author keng
 * 如A线程线程执行体中调用B线程的join()方法，
 * 则A线程被阻塞，知道B线程执行完为止，A才能得以继续执行
 */
public class JoinThread {
	public static void main(String[] args) {
		CreateThread2 runnable= new CreateThread2();
		Thread thread = new Thread(runnable);
		for(int i = 0;i < 100;i++){
			System.out.println(Thread.currentThread().getName()+"	" + i);
			if(i==30){
				thread.start();
				try {
					thread.join();//main线程需要等待thread线程运行完成后才能运行
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
}
