package com.Thread.ThreadPriority;

import com.Thread.Create.CreateThread1;

/**
 * 优先级测试类
 * @author keng
 * 1.每个线程在执行时都具有一定的优先级，优先级高的线程具有较多的执行机会
 * 2.每个线程默认的优先级都与创建它的线程的优先级相同。main线程默认具有普通优先级
 * 3.设置线程优先级：setPriority(int priorityLevel)。参数priorityLevel范围在1-10之间
 * 4.优先级有三个常量:(MAX_PRIORITY:10)、(MIN_PRIORITY:1)、(NORM_PRIORITY:5)
 */
public class ThreadPriority {

	public static void main(String[] args) {
		CreateThread1 thread = new CreateThread1();
		for(int i=0;i<100;i++){
			System.out.println("main thread is "+i);
			if(i==20){
				thread.setPriority(Thread.MIN_PRIORITY);
				thread.start();
			}
			System.out.println("当前线程优先级:"+Thread.currentThread().getPriority());
		}
	}
}
