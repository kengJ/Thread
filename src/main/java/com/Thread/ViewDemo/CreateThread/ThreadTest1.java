package com.Thread.ViewDemo.CreateThread;
/**
 * 创建一个子线程，完成1-100的输出
 * 同样主线程也这样去做
 * @author keng
 * 
 * 创建线程的方式:
 * 1.继承java.lang.Thread类
 * 
 */


/**
 * 1.创建一个继承thread类的类
 * 2.重写run方法
 * 注:一个线程自能执行一次,调用一次start()
 * @author keng
 *
 */
class subThread extends Thread{
	@Override
	public void run() {
		// TODO Auto-generated method stub
//		super.run();
		for(int i=1;i<-100;i++){
			System.out.println(Thread.currentThread().getName()+"==>"+ i);
		}
	}
}

public class ThreadTest1 {

	public static void main(String[] args) {
		subThread subthread = new subThread();
		subthread.start();
		
		for(int i=1 ;i<=100;i++){
			System.out.println(Thread.currentThread().getName()+"==>"+i);
		}
	}
}
