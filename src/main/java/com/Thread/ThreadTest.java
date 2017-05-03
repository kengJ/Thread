package com.Thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

import com.Thread.Create.CreateThread1;
import com.Thread.Create.CreateThread2;
import com.Thread.Create.CreateThread3;

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
				//创建线程
				Runnable myRunnable = new CreateThread2();
				//把myRunnable作为thread的target创建线程
				Thread thread1 = new Thread(myRunnable);
				Thread thread2 = new Thread(myRunnable);
			}
		}
	}
	
	/**
	 * 测试线程方法
	 * 使用Callable和Future接口创建线程
	 */
	public void testThread3(){
		Callable<Integer> callable = new CreateThread3();//创建callable对象
		FutureTask<Integer> ft = new FutureTask<Integer>(callable);//使用FutureTask包装Callable
		for(int i=0;i<100;i++){
			System.out.println(Thread.currentThread().getName() + " " + i);
			if(i == 30){
				Thread thread = new Thread(ft);//把FutureTask作为thread的target创建线程
				thread.start();//线程就绪
			}
		}
		
		System.out.println("主线程for循环执行完毕..");
		try {
			int sum = ft.get();//获取新线程中call返回的结果
			System.out.println("sum ="+sum);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	
	/**
	 * 主方法
	 * @param args
	 */
	public static void main(String[] args) {
		
	}
}
