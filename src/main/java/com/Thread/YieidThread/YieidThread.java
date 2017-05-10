package com.Thread.YieidThread;

import com.Thread.Create.CreateThread1;

/**
 * 线程让步测试类
 * @author keng
 * 当某个线程调用yiled()方法从运行状态转换到就绪状态后，
 * CPU从就绪状态线程队列中只会选择与该线程优先级相同或优先级更高的线程去执行
 * 
 * 注:主线程的有限级为5
 */
public class YieidThread {

	public static void main(String[] args) {
		CreateThread1 thread1 = new CreateThread1();
		CreateThread1 thread2 = new CreateThread1();
		//设置两个优先级
		thread1.setPriority(Thread.MAX_PRIORITY);
		thread2.setPriority(Thread.MIN_PRIORITY);
		for(int i=0;i<100;i++){
			System.out.println("main thread is "+i);
			if(i==20){
				thread1.start();
				thread2.start();
				Thread.yield();//主线程main执行让步，只有MAX_PRIORITY优先级才能通过
			}
		}
	}
}
