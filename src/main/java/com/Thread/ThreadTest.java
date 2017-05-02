package com.Thread;

import com.Thread.Create.CreateThread1;
import com.Thread.Create.CreateThread2;

/**
 * 线程测试类
 * @author heyanzhu
 *测试三种新建县城内方式
 */
public class ThreadTest {

	/**
	 * 测试线程方法
	 * 继承thread方式实现多线程
	 */
	public void testThread1(){
		for(int i =0;i<100;i++){
			System.out.println(Thread.currentThread().getName() + " " + i);
			if(i==30){
				//新建线程
				Thread myThread1 = new CreateThread1();
				Thread myThread2 = new CreateThread1();
				//线程就绪
				myThread1.start();
				myThread2.start();
			}
		}
	}
	
	/**
	 * 测试线程方法
	 * 实现Runnable接口重写run方法实现多线程
	 */
	public void testThread2(){
		for(int i=0;i<100;i++){
			System.out.println(Thread.currentThread().getName() + " " + i);
			if(i==30){
				Runnable myRunnable = new CreateThread2();
				Thread thread1 = new Thread(myRunnable);
				Thread thread2 = new Thread(myRunnable);
			}
		}
	}
	
	
	/**
	 * 主方法
	 * @param args
	 */
	public static void main(String[] args) {
		
	}
}
