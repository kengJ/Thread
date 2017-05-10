package com.Thread.ViewDemo.CreateThread;
/**
 * 通过实现的方式创建线程
 * @author keng
 * 实现创建线程的好处
 * 1.避免不能多继承的局限
 * 2.
 */

class PrintNum implements Runnable{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=1;i<=100;i++){
			if(i%2==0){
				System.out.println(Thread.currentThread().getName()+":"+i);
			}
		}
	}
}

public class WindowThread2 {

}
