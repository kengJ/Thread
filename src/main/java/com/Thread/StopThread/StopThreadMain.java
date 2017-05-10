package com.Thread.StopThread;
/**
 * 线程终止运行测试
 * @author keng
 *
 */
public class StopThreadMain {
	public static void main(String[] args) {
		StopThread st = new StopThread();
		Thread thread = new Thread(st);
		for(int i=0;i<100;i++){
			System.out.println(Thread.currentThread().getName()+"	"+i);
			if(i==30){
				thread.start();
			}
			if(i==40){
				st.StopThread();
			}
		}
	}
}
