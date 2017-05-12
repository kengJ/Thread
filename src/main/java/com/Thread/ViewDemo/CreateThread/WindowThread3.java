package com.Thread.ViewDemo.CreateThread;
/**
 * runnable的方式实现多线程售票
 * @author keng
 * 同步锁：
 * 1.同步代码块
 * synchronized(同步监听器){}
 * 2.同步方法
 */

class Window1 implements Runnable{
	int ticket =100;
	Object obj = new Object();
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true){
			if(ticket>0){
				synchronized(obj){
					try {
						Thread.currentThread().sleep(10);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.out.println(Thread.currentThread().getName()+"售票，票号为:"+ticket--);
				}
			}else{
				break;
			}
		}
	}
}

public class WindowThread3 {
	public static void main(String[] args) {
		Window1 w = new Window1();
		Thread w1 = new Thread(w);
		Thread w2 = new Thread(w);
		Thread w3 = new Thread(w);
		
		w1.setName("窗口1");
		w2.setName("窗口2");
		w3.setName("窗口3");
		
		w1.start();
		w2.start();
		w3.start();
	}

}
