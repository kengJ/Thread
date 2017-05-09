package com.Thread.SleepThread;

import com.Thread.Create.CreateThread2;
/**
 * sleep测试类
 * @author keng
 * 当调用了新建的线程的start()方法后，线程进入到就绪状态，
 * 可能会在接下来的某个时间获取CPU时间片得以执行，如果希望这个新线程必然性的立即执行，
 * 直接调用原来线程的sleep(1)即可
 */
public class SleepThread {

	public static void main(String[] args) {
		CreateThread2 runnable =new CreateThread2();
		Thread thread =new Thread(runnable);
		for(int i = 0;i<100;i++){
			if(i==30){
				thread.start();
				try {
					thread.sleep(1);//sleep()以毫秒为单位
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
}
