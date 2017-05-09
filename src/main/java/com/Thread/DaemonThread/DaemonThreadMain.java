package com.Thread.DaemonThread;
/**
 * 
 * @author keng
 * main线程默认是前台线程，前台线程创建中创建的子线程默认是前台线程，
 * 后台线程中创建的线程默认是后台线程。调用setDeamon(true)方法将前台线程设置为后台线程时，
 * 需要在start()方法调用之前。前天线程都死亡后,
 * JVM通知后台线程死亡，但从接收指令到作出响应，需要一定的时间
 */
public class DaemonThreadMain {

	public static void main(String[] args) {
		DaemonThread thread = new DaemonThread();
		for(int i=0;i<100;i++){
			System.out.println("main thread is "+i);
			if(i==20){
				thread.setDaemon(true);//设置为后台线程
				thread.start();
			}
		}
	}
}
