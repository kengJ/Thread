package com.Thread.DaemonThread;
/**
 * 后台线程测试
 * @author keng
 * 后台线程：为其他线程提供服务的线程，也成守护线程
 * 生命周期：当所有前台线程进入死亡状态是，自动死亡
 */
public class DaemonThread extends Thread{

	@Override
	public void run() {
		// TODO Auto-generated method stub
//		super.run();
		for(int i=0;i<100;i++){
			System.out.println("i=	"+i);
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	
}
