package com.Thread.ViewDemo.CreateThread;
/**
 * 模拟火车售票，分三个窗口，总票数100
 * @author keng
 * 存在问题ticket生命周期过长，浪费资源
 */
class Window extends Thread{
	static int ticket =100;
	@Override
	public void run() {
//		// TODO Auto-generated method stub
//		super.run();
		while(ticket>0){
			System.out.println(Thread.currentThread().getName()+"售票，票号为"+ticket--);
		}
	}
}

public class WindowThread1 {
	public static void main(String[] args) {
		Window w1 = new Window();
		Window w2 = new Window();
		Window w3 = new Window();
		
		w1.setName("窗口1");
		w2.setName("窗口2");
		w3.setName("窗口3");
		
		w1.start();
		w2.start();
		w3.start();
	}
}
